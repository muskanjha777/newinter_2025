package day14;
//Shared Counter class with synchronized method
class Counter {
private int count = 0;

// synchronized method to prevent race condition
public synchronized void increment() {
   count++;
}

public int getCount() {
   return count;
}
}



 class CounterThread extends Thread
{

  private Counter counter;

  public CounterThread(Counter counter) {
      this.counter = counter;
  }

  public void run() {
      for (int i = 0; i < 1000; i++) {
          counter.increment();
      }
  }
}



public class Main
{
	public static void main(String[] args) {
        Counter counter = new Counter();

        // Create two threads
        CounterThread t1 = new CounterThread(counter);
        CounterThread t2 = new CounterThread(counter);

        // Start threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output final count
        System.out.println("Final count: " + counter.getCount());
    }
}

	