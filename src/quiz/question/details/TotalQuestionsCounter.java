package quiz.question.details;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TotalQuestionsCounter {
    public int rowsCount(Connection c) throws SQLException {
        int count = 0;
        Statement statement = c.createStatement();
        ResultSet r = statement.executeQuery("select * from question_details");
        while (r.next()) {
            count++;
        }
        System.out.println(count);
        return count;
    }
}
