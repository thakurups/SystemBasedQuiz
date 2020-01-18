package quiz.question.details;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TotalQuestionsCounter {
    public int rowsCount(Connection c, String quizName) throws SQLException {
        int count = 0;
        PreparedStatement p = c.prepareStatement("select * from " + quizName + ";");
        ResultSet r = p.executeQuery();
        while (r.next()) {
            count++;
        }
        System.out.println(count);
        return count;
    }
/*
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectQuizDetails obj = new ConnectQuizDetails();
        Connection con = obj.attemptConnection();
        TotalQuestionsCounter ob=new TotalQuestionsCounter();
        ob.rowsCount(con,"question_details");

    }*/
}
