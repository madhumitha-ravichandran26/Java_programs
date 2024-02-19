class Book implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Updating thread ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
        }
    }
}
    class Num extends Thread{
    public void print(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
            }
        }
    }
}

class run_thread  {
    public static void main(String[] args) {
        Runnable b = new Book();
        Num n=new Num();
        Thread t1=new Thread(b);

       t1.start();
       
       n.print();
        }
    }
