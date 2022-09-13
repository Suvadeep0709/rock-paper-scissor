import java.util.Scanner;

public class rock {
    public static void main(String[] args) {
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("");
        System.out.println("Are you ready? Write 'yes' if you are");
        Scanner scan =new Scanner(System.in);
        String choice=scan.nextLine();
        if (choice.equals("yes")){
            System.out.println("Great");
            System.out.println("rock -- paper -- scissors, shoot!");
            String userChoice=scan.nextLine();
            //computer choice
            String computer=computerChoice();
            
            //get the result 
            //print everything

        }
        else {
            System.out.println("Darn some other time then ");
        }
    }
    public static String computerChoice(){
        int random=(int)(Math.random()*3)+1;
        switch(random){
            case 1 : return "rock";
            case 2 : return "paper";
            case 3 : return "scissor";
            default : return " ";
        }
    }

    
}
