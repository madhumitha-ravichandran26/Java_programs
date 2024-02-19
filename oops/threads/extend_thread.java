import java.lang.Thread;

class Book extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Updating thread ");
            try {
                Thread.sleep(1000); //delay
            } catch (InterruptedException e) {
                
            }
        }
    }
}

class Num extends Thread{
    public void print(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            
        }
    }
}

class extend_thread {
    public static void main(String[] args) {
        Book b = new Book();
        Num n=new Num();

       b.start();
       n.print();
        }
    }
