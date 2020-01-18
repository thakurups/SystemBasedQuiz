package quiz.question.details;

import generator.RandomQuestionsList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionDetailsFetch {
    int total;
    ArrayList<Integer> quesList = new ArrayList<>();
    private int required;

    public void setRequired(int required) {
        this.required = required;
    }

    public void setTotal(Connection con) throws SQLException {
        TotalQuestionsCounter obj = new TotalQuestionsCounter();
        this.total = obj.rowsCount(con);
    }

    public void setQuesList() {
        RandomQuestionsList obj = new RandomQuestionsList();
        this.quesList = obj.generateList(this.required, this.total);
        System.out.println(quesList);
    }

    public void displayQuestionOptions(Connection con) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        for (Integer a : quesList) {
            String s = "Select * from question_details where qid=?";
            PreparedStatement p = con.prepareStatement(s);
            p.setInt(1, a);
            ResultSet r = p.executeQuery();
            while (r.next()) {
                System.out.println("\b");
                System.out.println("Q." + i + " " + r.getString(2));
                String A = r.getString(3);
                String B = r.getString(4);
                String C = r.getString(5);
                String D = r.getString(6);
                System.out.println("A. " + A + "\t\tB. " + B + "\t\tC. " + C + "\t\tD. " + D);
                char ch = sc.nextLine().toUpperCase().charAt(0);
                switch (ch) {
                    case 'A':

                        if (r.getString(7).equals(A))
                            System.out.println("correct");
                        else
                            System.out.println("incorrect");
                        break;
                    case 'B':
                        if (r.getString(7).equals(B))
                            System.out.println("correct");
                        else
                            System.out.println("incorrect");
                        break;
                    case 'C':
                        if (r.getString(7).equals(C))
                            System.out.println("correct");
                        else
                            System.out.println("incorrect");
                        break;
                    case 'D':
                        if (r.getString(7).equals(D))
                            System.out.println("correct");
                        else
                            System.out.println("incorrect");
                        break;
                    default:
                        System.out.println("invalid choice");

                }
                i++;
            }
        }

    }
}
