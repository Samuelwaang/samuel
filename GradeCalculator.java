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
            double a = input.nextDouble();
            System.out.println("desired grade: ");
            double b = input.nextDouble();
            System.out.println("test category %: ");
            double c = input.nextDouble();
            System.out.println("points in test category: ");
            double d = input.nextDouble();
            System.out.println("points in the final: ");
            double e = input.nextDouble();   
            a = a/100;
            b = b/100;
            double total = (e/(d+e))*c; //final is this percent of the total grade
            double needed = (e*(b-a))/total;
            System.out.println("points needed: " + needed * 10000);


        }

    }
}
GradeCalculator.main(null);