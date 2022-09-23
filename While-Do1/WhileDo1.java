public class WhileDo1
{
    
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        while (i <10) {
            System.out.println("i is " + i + " but is less than 10");
            i += 1;
        }
    }
    
    public static void main(String[] args)
        {
            WhileDo1 hw = new WhileDo1();
            hw.run();
        }
}