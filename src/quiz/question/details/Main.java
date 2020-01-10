package quiz.question.details;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectQuizDetails obj = new ConnectQuizDetails();
        obj.attemptConnection();
    }

}
