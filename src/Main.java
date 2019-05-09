class MultithreadingDemo extends Thread
{
    public void run()
    {
        ChocolateBoiler chocolate1 = ChocolateBoiler.getInstance();
    }
}

public class Main {
    public static void main(String[] args){
        int n = 15;
        for (int i=0; i<n; i++)
        {
            MultithreadingDemo object = new MultithreadingDemo();
            object.start();
        }
    }
}
