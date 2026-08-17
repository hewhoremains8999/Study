import threading
import time

def run(delay,taskname):
    print(f"{taskname} Starting..\n")
    time.sleep(delay)
    print(f"{taskname} Finished..")

thread1=threading.Thread(target=run,args=(5,"Task1"))
thread2=threading.Thread(target=run,args=(10,"Task2"))

thread1.start()
thread2.start()
print("All Thread Started")
thread1.join()
thread2.join()
print("All Threads Task Completed")
