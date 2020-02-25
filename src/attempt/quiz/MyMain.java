package attempt.quiz;

import create.quiz.QuizList;
import quiz.question.details.ConnectQuizDetails;
import quiz.question.details.QuestionDetailsFetch;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectQuizDetails obj = new ConnectQuizDetails();
        Connection con = obj.attemptConnection();
        QuestionDetailsFetch obj1 = new QuestionDetailsFetch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Quizz you want to attempt");
        QuizList ob1 = new QuizList();
        String s1 = sc.nextLine();
        ob1.insertQuizName(con, s1);
    }
}
