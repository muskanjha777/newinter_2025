package day14;


class SharedResource
{
    int count = 0;

    synchronized void increment() {
        count++;
    }
}


public class MyThread extends Thread
{
	
	SharedResource res;

    MyThread(SharedResource res) {
        this.res = res;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            res.increment();
        }
    }

	public static void main(String[] args) throws InterruptedException{
		SharedResource res = new SharedResource();

        MyThread t1 = new MyThread(res);
        MyThread t2 = new MyThread(res);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + res.count);
    }
}
		// TODO Auto-generated method stub

	


