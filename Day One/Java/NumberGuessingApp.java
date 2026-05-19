import java.util.Scanner;
import java.util.Random;
 public class NumberGuessingApp {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int gues = rand.nextInt(100) + 1;
    int userinput;

    for(int count = 0; count < 5; count++){
    System.out.print("Enter number between 1 to 100: ");
    userinput = input.nextInt();

    if(userinput <= -1){
        System.out.println("Don't count");
    }
    else if(userinput > guessnumber){
        System.out.println("Number is too high");
    }
    else if(userinput < guessnumber){
        System.out.println("Number is low");
    }
    else {
        System.out.println("Stop - you got it!");
        break;
    }
  //condition to terminate loop  
    if(userinput == -1){
        System.out.println("Terminate");
        break;
    }
 

   
    else if(userinput == 1){
System.out.print("Legendary");
}

    else if(userinput == 2){
System.out.print("Excellent");
}

    else if(userinput == 3 || userinput == 4){
System.out.print("Good");
}
    
    else if(userinput == 5){
System.out.print("Close!");
}

    else{
System.out.print("Better luck next time!!!");
}



}
}
}
    




