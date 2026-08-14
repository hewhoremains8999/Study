def find_waiting_time(process,n,burst_time,waiting_time):
    waiting_time[0]=0

    for i in range(1,n):
        waiting_time[i]=burst_time[i-1]+waiting_time[i-1]

def find_turn_around_time(processes,n,burst_time,waiting_time,turn_around_time):

    for i in range(n):
        turn_around_time[i]=burst_time[i]+waiting_time[i]

def find_average_time(process,n,burst_time):

    waiting_time=[0]*n
    turn_around_time=[0]*n
    total_waiting_time=0
    total_turn_around_time=0

    find_waiting_time(process,n,burst_time,waiting_time)
    find_turn_around_time(processes,n,burst_time,waiting_time,turn_around_time)

    print("Process\tBurst Time\t Waiting Time\t Turn Around Time")

    for i in range(n):
        total_waiting_time+=waiting_time[i]
        total_turn_around_time+=turn_around_time[i]
        print(f"P{processes[i]}\t{burst_time[i]}\t\t{waiting_time[i]}\t\t{turn_around_time[i]}")

    print(f"\nAverage Waiting Time={total_waiting_time/n:.2f}")
    print(f"Average Turn Around Time = {total_turn_around_time /n:.2f}")


if __name__=="__main__":
    processes=[1,2,3,4,5,6]
    n=len(processes)
    burst_time=[10,5,8,15,30,40]

    find_average_time(processes,n,burst_time)







        


