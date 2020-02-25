package create.quiz;

import quiz.question.details.ConnectQuizDetails;

import java.sql.SQLException;

public class CreateMain {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectQuizDetails ob = new ConnectQuizDetails();
        CreateQuiz obj = new CreateQuiz();
        obj.fetchValues();
        ob.attemptConnection();
        obj.createTable(ob.co);
        obj.insertQuestions(ob.co);
    }
}
