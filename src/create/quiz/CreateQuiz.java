package create.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateQuiz {
    int noOfQuestions;
    String quizName;
    int noAsked;

    public void createTable(Connection c1) throws SQLException {
        Connection connect = c1;
        String query = "create table " + quizName + "(qid int,Question longtext,A mediumtext,B mediumtext,C mediumtext,D mediumtext,Ans mediumtext);";
        PreparedStatement p = connect.prepareStatement(query);
        p.executeUpdate();

    }

    public void fetchValues() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of quiz you want to create");
        quizName = sc.nextLine();
        System.out.println("Enter the no of question you want to insert");
        noOfQuestions = sc.nextInt();
        System.out.println("Enter the no of question you want to ask");
        noAsked = sc.nextInt();
    }

    public void insertQuestions() {

    }
}



