import threading

class FibonacciThread(threading.Thread):
    def __init__(self,n,results):
        super().__init__()
        self.n=n
        self.results=results

    def run(self):
        a,b=0,1
        for _ in range(self.n):
            self.results.append(a)
            a,b=b,a+b
if __name__=="__main__":
    n_terms=int(input("Input Size:"))
    f_results=[]

    fib_thread=FibonacciThread(n_terms,f_results)
    fib_thread.start()

    fib_thread.join()

    print(f"Results:{f_results}")
