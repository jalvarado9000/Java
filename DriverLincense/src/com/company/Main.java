/*
6. Driver’s License exam
The local Driver’s License Office has asked you to write a program that grades the written
portion of the driver’s license exam. The exam has 20 multiple choice questions. Here are
the correct answers:
1. B 2. D 3. A 4. A 5. C 6. A 7. B 8. A 9. C 10. D
11. B 12. C 13. D 14. A 15. D 16. C 17. C 18. B 19. D 20. A
A student must correctly answer 15 of the 20 questions to pass the exam.
Write a class named DriverExam that holds the correct answers to the exam in an array field.
The class should also have an array field that holds the student’s answers. The class should
have the following methods:
• passed. Returns true if the student passed the exam, or false if the student failed
• totalCorrect. Returns the total number of correctly answered questions
• totalIncorrect. Returns the total number of incorrectly answered questions
• questionsMissed. An int array containing the question numbers of the questions that
the student missed
Demonstrate the class in a complete program that asks the user to enter a student’s answers,
and then displays the results returned from the DriverExam class’s methods.
Input Validation: Only accept the letters A, B, C, or D as answers.
 */

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        DriverExam DE = new DriverExam();
        DE.Question();

        if(DE.pass())
            System.out.println("Student Passed the Test");
        else
            System.out.println("Student did not pass the exam");

        System.out.println("Student scored 20/" + DE.totalCorrect());
        System.out.println("Student had " + DE.totalIncorrect() + " Incorrect Answers");
        System.out.println("Student got question ");
        DE.GetquestionsMissed();
        System.out.println(" Question wrong");





    }
}
