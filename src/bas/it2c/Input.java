
package bas.it2c;

import java.util.Scanner;


public class Input {
     public void Inputfitness(){
        Scanner sc = new Scanner(System.in);
         Output fit = new Output();
        
        System.out.print("Enter no. of applicants: ");
        int num = sc.nextInt();
        
        for( int i=0; i<num; i++){
            
            System.out.print("Enter the details of applicant no."+(i+1)+"\n");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("BMI: ");
            int bmi = sc.nextInt();
            System.out.print("Fitness Goal: ");
            String fp = sc.next();
          
           fit.addFP(i + i, id, name, age, bmi, fp);
           fit.viewFP();
        }
         
       
    }
}
