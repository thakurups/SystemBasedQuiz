package generator;

import java.util.ArrayList;
import java.util.Random;

public class RandomQuestionsList {
    public ArrayList<Integer> generateList(int noOfRequired, int total) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 1; i < total + 1; i++) {
            li.add(i);
        }
        ArrayList<Integer> genList = new ArrayList<>();
        for (int i = 0; i < noOfRequired; i++) {
            int len = li.size();
            Random ob = new Random();
            int a = ob.nextInt(len);
            genList.add(li.get(a));
            li.remove(a);

        }
        return genList;
    }
}
