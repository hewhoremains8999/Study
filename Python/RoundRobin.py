from collections import deque

def round_robin_scheduling(processes,time_quantum):
    """
Simulates ROund RObin CPU Sheduling.
processes:List of Dicts["id":1,"arrival_time":0,'Burst_time':5},...]
time_quantum:Integer time slice allocated to each process
    """
    #Sort process by arrival time initially
    processes.sort(key=lambda x:x['arrival_time'])

    n=len(processes)
    remaining_burst = {p['id']:p['burst_time'] for p in processes}
    arrival_times = {p['id']:p['arrival_time'] for p in processes}
    burst_times = {p['id']:p['burst_time'] for p in processes}

    completion_time = {}
    turnaround_time ={}
    waiting_time ={}

    ready_queue=deque()
    current_time=0
    completed=0
    process_index =0
    #Run unitil all processed finished
    while completed < n:
        #Push all processes that have arrived by the current time into the ready queue
        while process_index < n and processes [process_index]['arrival_time']<= current_time:
            ready_queue.append(processes[process_index]['id'])
            process_index +=1

    # if queue is empty ,CPU stays idle; advance time to next process arrival
        if not ready_queue:
            current_time = processes[process_index]['arrival_time']
            continue

        pid = ready_queue.popleft()

    #Execute process for the quantum or its reamining time, whichever is smaller
        execution_time = min(remaining_burst[pid],time_quantum)
        remaining_burst[pid] = execution_time
        current_time+= execution_time

        #Check for new arrivals during execution before re-queuing the current proces
        while process_index<n and processes[process_index]['arrival_time']<=current_time:
            ready_queue.append(processes[process_index]['id'])
            process_index +=1

        if remaining_burst[pid] >0:
#Process not finished,send it to the back of the queue
            ready_queue.append(pid)
        else:
            #Process finished
            completed +=1
            completion_time[pid] = current_time
            turnaround_time[pid]== completion_time[pid] - arrival_times[pid]
            waiting_time[pid]=turnaround_time[pid]- burst_time[pid]

    #Print summary metrics Table
    print(f"{'PID':<5} | {'Arrival':<8}| {'Burst':<6}| {'Complete':<9}|{'Turnaround':<11}|{'Waiting'<7}")
    print("-" * 60)
    for p in processes:
        pid=p['id']
        print(f"P{pid:<4}:{arrival_times[pid]:<8}|{burst_times[pid]:<6}|completion_time[pid]:<9| {turnaround_time[pid]:<11}| {waiting_time[pid]:<7}")
                        
    print("-" * 60)
    print(f"Average turnaround time:{sum(turnaround_time.values())/n:.2f}")
    print(f"Average Waiting time:{sum(waiting.values())/n:.2f}")


example_processes=[
    {'id':1,'arrival_time':0,'burst_time':5},
    {'id':2,'arrival_time':1,'burst_time':4},
    {'id':3,'arrival_time':2,'burst_time':2},
    {'id':4,'arrival_time':4,'burst_time':1}
    ]

quantum=2

round_robin_scheduling(example_processes,quantum)
