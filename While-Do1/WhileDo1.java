public class WhileDo1
{
    
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        for (int i = 0; i <= 15; i = i+1) {
            System.out.println("i is equal to "+i);
        }
        for (int j = 10; j != 0; j = j-2) {
            System.out.println("j is equal to "+j);
        }
        for (int k = 10; k!= 0; k = k-3) {
            System.out.println("k is equal to "+k);
            if (k == 1) {
                System.out.println("k can not be negative");
            }
        }
    }
    
    public static void main(String[] args)
        {
            WhileDo1 hw = new WhileDo1();
            hw.run();
        }
}