package quiz.question.details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectQuizDetails {
    public Connection co;
    public Connection attemptConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        co = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz?serverTimezone=UTC", "root", "");
        if (co != null) {
            System.out.println("connection ok");
        }
        return co;
    }

}
