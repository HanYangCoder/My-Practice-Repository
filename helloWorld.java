import java.util.Scanner;

public class{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int score;

        System.out.println("Hello World! Please input your score: ");
        score = scan.nextLine();

        if(score == 100)
        {
            System.out.println("Congratulations! You've got a perfect score!");
        }

        else if((score <= 99) && (score >= 50))
        {
            System.out.println("Congratulations! You've passed!");
        }

        else{
            System.out.println("Sorry you haven't passed, please try again next time!");
        }
    }
}