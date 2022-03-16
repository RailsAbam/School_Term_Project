package cs1102;

import javax.swing.JOptionPane;

public class Quize {
  static int nQuestion = 0;
  static int nCorrect = 0;

  public static void main(String[] args) {
    String question = "Object oriented programming language is?: ";
    question += "A. Java and C++ \n";
    question += "B. JavaScript  \n";
    question += "C. Css \n";
    while (true) {
      String answer = JOptionPane.showInputDialog(question).toUpperCase();
      if (answer.equals("A")) {
        JOptionPane.showMessageDialog(
          null,
          "Correct!!!  Java and C++ is OOP Languages"
        );
        break;
      } else if (answer.equals("B") || (answer.equals("C"))) {
        JOptionPane.showMessageDialog(null, "Incorrect! Try again");
      } else {
        JOptionPane.showMessageDialog(
          null,
          "Invalid answer! You can write A,B or C"
        );
      }
    }

  }
}

