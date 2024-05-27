import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void lengthCalculator(Length length){
           System.out.println((double) length.calculate());
    }

    public static void userInput(Length l1){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the x1 co-ordinates");
        l1.x1 = scanner.nextInt();
        System.out.println("enter the x2 co-ordinates");
        l1.x2 = scanner.nextInt();
        System.out.println("enter the y1 co-ordinates");
        l1.y1 = scanner.nextInt();
        System.out.println("enter the y2 co-ordinates");
        l1.y2 = scanner.nextInt();
    }

    public static void checkEqulity(Length l1 , Length l2){

        if(l1.calculate()==l2.calculate()){
            System.out.println("line are perferable");
        }
        else {
            System.out.println("line are not perferable");
        }
    }
    public static void  checkEqualityByUsingCompareTo(Length l1 , Length l2){
        Double lineOneLength = l1.calculate();
        Double lineTwoLength = l2.calculate();
        int result = lineOneLength.compareTo(lineTwoLength);
        if(result==0){
            System.out.println("line are perferable");
        }
        else {
            System.out.println("line are not perferable");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the line one co-orinates");
        Length l1 = new Length();
        userInput(l1);
        System.out.println("enter the line two co-orinates");
        Length l2 = new Length();
        userInput(l2);
        while (true){
            System.out.println("welcome to line comparission");

            System.out.println("1. Length Calculator \n2. check Equlity \n3. checkEqualityByUsingCompareTo \n4. logout");
            System.out.println("enter the choice");
            int choice = scanner.nextInt();
            if(choice==4){
                break;
            }
            switch (choice)
            {
                case 1:
                    System.out.println("the line one length is :-");
                    lengthCalculator(l1);
                    System.out.println("the line two length is :-");
                    lengthCalculator(l2);
                    break;
                case 2:
                    checkEqulity(l1,l2);
                    break;
                case 3:
                    checkEqualityByUsingCompareTo(l1,l2);
                    break;
                default:
                    System.out.println("invalid choice..");
                    break;
            }
        }

    }
}