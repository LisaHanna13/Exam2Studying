/*
Lisa Hanna
Practice for the second exam
Textbook questions in various chapters
*/
package exam2practice;
import java.util.*;
/**
 *
 * @author lisa-
 */
public class Exam2Practice {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//        //CHAPTER 5 TEXTBOOK QUESTIONS (other than the ones I did in labs)
//        
//        //--------------------------------------------------------------------------------------
//	//EXERCISE #49: Read a web address and determine what type it is
//
//	System.out.println("EXERCISE #49");
//	System.out.println("---------------------------------------------");
//        
//        //Print instructions
//        System.out.print("Hello! Please enter a web address: ");
//        //Store the data
//        String address = keyboard.next();
//        
//        //Create if statements 
//        if (address.endsWith("gov")){
//            System.out.println("This is a government web address");
//        } else if (address.endsWith("edu")){
//            System.out.println("This is a university web address");
//        } else if (address.endsWith("com")){
//            System.out.println("This is a business web address");
//        } else if (address.endsWith("org")){
//            System.out.println("This is an organization web address");
//        } else{
//            System.out.println("This is a web address for an unknown entity");
//        }
//        
//        //--------------------------------------------------------------------------------------
//	//EXERCISE #50: Thermometer program
//
//	System.out.println("EXERCISE #50");
//	System.out.println("---------------------------------------------");
//        
//        //Print instructions
//        System.out.println("Hello! Please enter the current temperature: ");
//        //Store the data
//        double temp = keyboard.nextDouble();
//       
//        //Create if statements
//        if (temp >= 90){
//            System.out.println("It is probably summer!");
//        } else if (temp >= 70){
//            System.out.println("It is probably spring!");
//        } else if (temp >= 50){
//            System.out.println("It is probably fall!");
//        } else if (temp < 50){
//            System.out.println("It is probably winter!");
//        } else if (temp > 110 || temp < -5){
//            System.out.println("This is out of range.");
//        }
//          
//        //--------------------------------------------------------------------------------------
//	//EXERCISE #50: Thermometer program
//
//	System.out.println("EXERCISE #51");
//	System.out.println("---------------------------------------------");
//        
//        //Print instructions
//        System.out.print("Please enter a year: ");
//        //Store the data
//        String year = keyboard.next();
//        //Get the length
//        int length = year.length();
//        
//        //Create if statements
//        if (length <= 2){
//            //Convert string to int
//            int yearInt = Integer.parseInt(year);
//            int trueYear = yearInt + 2000;
//            System.out.println("The year is " + trueYear);
//        } else if (length <= 4){
//            int yearInt  = Integer.parseInt(year);
//            System.out.println("The year is " + yearInt);
//        } else {
//            System.out.println("Sorry, that is not a valid year.");
//        }
//                
//
//        //CHAPTER 6 TEXTBOOK QUESTIONS (other than the ones I did in labs)
//
//        //--------------------------------------------------------------------------------------
//	//EXERCISE #47: Product of all integers between 3 and 7
//
//	System.out.println("EXERCISE #47");
//	System.out.println("---------------------------------------------");
//
//        int product = 3;
//	//Create a for loop
//        for (int i = 4; i <= 7; i++){
//            product *= i;
//        }
//        System.out.println("The product of all integers between 3 and 7 is equal to " + product);
//
//        //--------------------------------------------------------------------------------------
//	//EXERCISE #48: How many multiples of 7 between 33 and 97 using for loop
//
//	System.out.println("EXERCISE #48");
//	System.out.println("---------------------------------------------");
//
//        int count = 0;
//        for (int i = 33; i <=97; i++){
//            int result = i % 7;
//            if (result == 0){
//                count++;
//            }
//        }
//        System.out.println("There are " + count + " multiples of 7 between 33 and 97.");
//
//        //--------------------------------------------------------------------------------------
//	//EXERCISE #49: Print Hello World n times (n determined by usre input)
//
//	System.out.println("EXERCISE #49");
//	System.out.println("---------------------------------------------");
//
//        //Create a counter
//        int counter = 0;
//
//        //Print instructions
//        System.out.print("Hello! Please enter an integer: ");
//        //Make sure it really is an int
//        while (!keyboard.hasNextInt()){
//            System.out.println("Sorry! That is not an integer. Try again: ");
//            keyboard.nextLine();
//        }
//        int n = keyboard.nextInt();
//
//        //Then proceed
//        while (n>0){
//        counter++;
//        System.out.println(" Hello World! " + counter);
//        n--;
//        }
//        
//        //--------------------------------------------------------------------------------------
//	//EXERCISE #50: Print Hello World n times (n determined by usre input)
//
//	System.out.println("EXERCISE #50");
//	System.out.println("---------------------------------------------");
//        
//        //Print instructions
//        System.out.print("Hello! Please enter a word: ");
//        while (!keyboard.hasNext()){
//            System.out.print("Sorry! That is not a word. Try again: ");
//            keyboard.nextLine();
//        }
//        String word = keyboard.next();
//        int length = word.length();
//        
//        for (int i=0, k=0; i<length; k++){
//            char letter = word.charAt(k);
//            System.out.print(" " + letter);
//            i++;
//        }
//        
//        //--------------------------------------------------------------------------------------
//	//EXERCISE #51: Factorial multiplication of a number
//
//	System.out.println("EXERCISE #51");
//	System.out.println("---------------------------------------------");
//        
//        //Print instructions
//        System.out.print("Hello! Please enter an integer: ");
//        while(!keyboard.hasNextInt()){
//            System.out.print("Sorry that is not an integer. Please try again: ");
//            keyboard.nextLine();
//        }
//        //Store the date
//        int number = keyboard.nextInt();
//        
//        int product = 1;
//        //Create variable & loop
//        for (int i = 1; i <= number; i++){
//            product = product*i;
//        }
//        System.out.println("The factorial of " + number + " is " + product);
//        
//        //--------------------------------------------------------------------------------------
//	//EXERCISE #52: Take 10 integers and find the minimum
//
//	System.out.println("EXERCISE #52");
//	System.out.println("---------------------------------------------");
//        
//        //Create variables
//        int count = 0;
//        int min = 1000000000;
//        
//        //Create a random generator
//        Random rnd = new Random();
//        
//        for (int i =0; i<10; i++){
//            int a = rnd.nextInt();
//            if (a < min){
//                min =a;
//            }
//            count++;
//            System.out.println("Number " + count + " is " + a);
//        }
//        System.out.println("The minimum value is " + min);
//        
        //--------------------------------------------------------------------------------------
	//EXERCISE #54: Verify if a binary number is valid

	System.out.println("EXERCISE #54");
	System.out.println("---------------------------------------------");
        
        //Create a counter
        int count = 0;
            
        //Enter instructions
        System.out.println("Please enter a binary number: ");
        while(!keyboard.hasNextInt()){
            System.out.print("Sorry, that is not an integer. Please try again: ");
            keyboard.nextLine();
        }
        //Store the data
        int number = keyboard.nextInt();
            
        //Convert to string
        String numberS = Integer.toString(number);
        
        if (numberS.contains("2") || numberS.contains("3") || numberS.contains("4") || numberS.contains("5") || numberS.contains("6") || numberS.contains("7") || numberS.contains("8")|| numberS.contains("9")){
            System.out.println("Sorry, that was not a binary number.");
        } else{
            //Get the length of the number
            int length = numberS.length();

            //Count the number of ones
            for (int i = 0; i < length; i++){
                //Get the char for each number
                char check = numberS.charAt(i);
                //Transform the char into an int
                int intValue = Character.getNumericValue(check);
                if (intValue == 1){
                    count++;
                }
            }
                System.out.println("There was " + count + " one's in the binary code");
        }
    }

}
