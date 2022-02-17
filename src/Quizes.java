import javax.swing.JOptionPane; 

public class Quizes {
    
     static int nQuestions = 0;
     static int nCorrect = 0;


     }

     
     static String ask(String question) {
     while (true) {
     String answer = JOptionPane.showInputDialog(question);
     answer = answer.toUpperCase();
     boolean valid = (answer.equals("A") || answer.equals("B") || 
    answer.equals("C") || answer.equals("D") || answer.equals("E"));
     if (valid) return answer;
     JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
     } 
} 
     static void check(String question, String correctAnswer) {
     nQuestions++;
     String answer = ask(question);
     if (answer.equals(correctAnswer)) {
     JOptionPane.showMessageDialog(null,"Correct!");
     nCorrect++;
     } else { JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer  );
} 
   } 

     public static void main(String[] args) { 
     String question = "Object oriented programming language is? :\n"; 
     question += "A. Java and C++\n"; 
     question += "B. javaScript\n"; 
     question += "C. Css\n"; 
     question += "D. Ruby on Rails\n"; 
     question += "E. To be or not to be, that is the question.";
     check(question,"A");
     
     question = "What is my favourite programming lang?\n";
     question += "A. Python\n";
     question += "B. JavaScript\n";
     question += "C. Ruby On Rails\n";
     question += "D. C++\n";
     question += "E. none";
     check(question,"A");
     
     question = "Which year is python created?\n";
     question += "A. april 10, 1994\n";
     question += "B. june 30, 1985\n";
     question += "C. February 20, 1991.\n";
     question += "D. december 31 1965\n";
     question += "E. January 1 2022";
     check(question,"C");
     
  
     JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
     } 
    }


