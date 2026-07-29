import threading
import time
import random
from queue import Queue

BUFFER_SIZE =5

buffer=Queue(maxsize=BUFFER_SIZE)

class Producer(threading.Thread):
    def run(self):
        while True:
            item=random.randint(1,100)
            print(f"Producer: Producing item{item}")
            try:
                buffer.put(item,block=True,timeout=1)
                print(f"Producer:Item {item} added to buffer. Current size: {buffer.qsize()} ")
            except Exception as e:
                print(f"Producer: Could not add item -{e}")
            

            time.sleep(3)

class Consumer(threading.Thread):
    def run(self):
        while True:
            try:
                item= buffer.get(block=True,timeout=1)
                print(f"Consumer:Item {item} added to buffer. Current size: {buffer.qsize()}")
                buffer.task_done()
            except Exception as e:
                print(f"Consumer: Could not add item -{e}")
            
            time.sleep(3)

if __name__=="__main__":
    pd_thread=Producer()
    cs_thread=Consumer()

    pd_thread.start()
    cs_thread.start()
