import java.util.Scanner;
public class FootballTrajectories {
    public static void main (String[] args) { 
        //final double GRAVITY = -9.8;
        final double SINX = .707;
        final double COSX = .707;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter velocity: ");
        double velocity = input.nextDouble();
        System.out.print("Enter gravity: ");
        double gravity = input.nextDouble();
        
        double t = ((velocity * SINX) / (-gravity / 2));
        double x = (velocity * COSX * t);
        System.out.print("The football will fly " + x + " meters with a hangtime of " + t + " seconds.");
    }
}
