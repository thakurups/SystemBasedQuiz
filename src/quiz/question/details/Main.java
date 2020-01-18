package quiz.question.details;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectQuizDetails obj = new ConnectQuizDetails();
        Connection con = obj.attemptConnection();
        QuestionDetailsFetch obj1 = new QuestionDetailsFetch();
        obj1.setRequired(10);
        obj1.setTotal(con);
        obj1.setQuesList();
        obj1.displayQuestionOptions(con);

    }

}
