import java.util.Scanner;


public class GradeCalculator {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Seperate category?: ");
        boolean category = input.nextBoolean();
        
        if (category == true) {
            System.out.println("current grade?: ");
            double a = input.nextDouble();
            System.out.println("% final: ");
            double perc1 = input.nextDouble();
            System.out.println("desired grade: ");
            double b = input.nextDouble();
            double cgrade = a/100 * (100-perc1)/100;
            double bgrade = b/100-cgrade; 
            double perc2 = bgrade/perc1;

            System.out.println("needed grade: " + perc2*10000 + "%");

        }
        else {
            System.out.println("current grade?: ");
            double cg = input.nextDouble();
            System.out.println("% of grade that is in the test category %: ");
            double tp = input.nextDouble();
            System.out.println("current test grade: ");
            double tg = input.nextDouble();  
            System.out.println("points in test category: ");
            double tpt = input.nextDouble();
            System.out.println("points in the final: ");
            double fp = input.nextDouble(); 
            System.out.println("desired grade: ");
            double dg = input.nextDouble();

            Double otherPoint = cg - (tg*(tp/100));
            Double needed = (((dg - otherPoint) * (tpt+fp))/tp)-tg;
            System.out.print("You need " + needed + " points on the test");
        }

    }
}


