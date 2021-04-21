import java.util.Scanner;
public class loanCalculator
{
    public static void interest()
    {
        float p, r, t;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = s.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextFloat();
        System.out.print("Enter the Time period : ");
        t = s.nextFloat();
        float si;
        si = (r * t * p) / 100;
        System.out.println("The Simple Interest is : " + si);
    }

    public static void interest(float p, float r, float t)
    {
        float si;
        si = (r * t * p) / 100;
        System.out.println("The Simple Interest is : " + si);
    }

    public static void main(String args[])
    {
        interest();
        interest(1000, (float) 0.2, 10);
    }
}