import threading
import time

def run(delay,taskname):
    print(f"Task {taskname} Started\n")
    time.sleep(delay)
    print(f"Task {taskname} Completed")

t1=threading.Thread(target=run,args=(3,"A"))
t2=threading.Thread(target=run,args=(5,"B"))

t1.start()
t2.start()
#time.sleep(0.1)
print("All Task Started")

t1.join()
t2.join()

print("All Task Completed")
