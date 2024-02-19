class Table {
   synchronized void print_table(int n)
   {
    for(int i=1;i<=5;i++)
    {
        System.out.println(n*i);
         try {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                
            }
    }
   }
}



class sync_thread{
    public static void main(String[] args) {
        Table t=new Table();
        Thread t1=new Thread(){
            public void run(){
            t.print_table(5);
            }
            
        };

        Thread t2=new Thread(){
            public void run(){
            t.print_table(10);
            }
            
        };
        t1.start();
        t2.start();
        
    }
}
