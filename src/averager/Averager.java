/*Get positive numbers (i.e., any number greater than 0), double numbers from the user
at the command line until they enter -1 (the sentinel). Use a do-while loop. Compute
the average of the series of numbers and print the average to the command line. Don't
include the sentinel in calculation of the average.  Include suitable data validations
for invalid data (e.g. the user enters a letter instead of a number), but stay in the
loop until the sentinel is entered.
 */
package averager;

import java.util.Scanner;

public class Averager {

    public static void main(String[] args) 
            throws java.lang.Exception{
        int i;
        int count;
        int total;
        
        total = count = 0;
        double avg;
        
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("Enter a positive number: ");
            
            while(!input.hasNextInt()){
                input.next();
                System.out.println("Input Error! Please only enter positive numbers.");
            }
            i = input.nextInt();
            if (i == -1)
                break;
            else{
                count++;
                total = total + i;
            }
        }
        while (i != 0);
        avg = (double)total/(double)count;
        System.out.printf("Average = %.2f", avg);
    }    
}
