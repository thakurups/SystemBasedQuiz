package create.quiz;

import quiz.question.details.QuestionDetailsFetch;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuizList {
    int noAsked = 0;

    public int getNoAsked() {
        return noAsked;
    }

    public void insertQuizName(Connection c, String quizName) throws SQLException {
        //we already created a tale quizzCollection

        //to check whether quizz exists or not
        String s = "Select * from quizzcollection ";
        PreparedStatement p = c.prepareStatement(s);
        ResultSet r = p.executeQuery();
        int a = 0;
        while (r.next()) {
            //System.out.println(r.getString(1));
            if (r.getString(1).equals(quizName)) {
                a = 1;
                noAsked = r.getInt(2);
                break;
            }
        }
        if (a == 0)
            System.out.println("Quizz does not exist");
        else {
            QuestionDetailsFetch obj1 = new QuestionDetailsFetch();
            obj1.setRequired(noAsked);
            obj1.setQuizzName(quizName);
            obj1.setTotal(c);
            obj1.setQuesList();
            obj1.displayQuestionOptions(c);

        }


    }
}
