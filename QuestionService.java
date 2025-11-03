
import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String selection[] = new String[5]; 
    public QuestionService() {
        questions[0] = new Question(1, "Size of int ","8 bit","16 bit","32 bit","64 bit","32 bit");
        questions[1] = new Question(2, "Size of float ","8 bit","16 bit","32 bit","64 bit","32 bit");
        questions[2] = new Question(3, "Size of double ","16 bit","32 bit","64 bit","128 bit","64 bit");
        questions[3] = new Question(4, "Size of char ","8 bit","16 bit","32 bit","64 bit","16 bit");
        questions[4] = new Question(5, "Size of long ","32 bit","64 bit","128 bit","256 bit","64 bit");
    }
 
    public void playQuiz()
    {   
        int i =0;
        for(Question q: questions) {
            System.out.println("Question No : "+ q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your answer: ");
            selection[i] = sc.nextLine();
            i++;
        }
        for(String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;
        for(int i=0; i<questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String givenAnswer = selection[i];
            if(actualAnswer.equals(givenAnswer)) {
                score++;
            }
    }
    System.out.println("Your score is: "+ score);
 }
}


