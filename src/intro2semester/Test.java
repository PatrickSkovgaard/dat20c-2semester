package intro2semester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(4);
        a.add(5);

        LinkedList<Integer> linked = new LinkedList<Integer>();
        linked.add(4);

        System.out.println(returnElementsOfArrayList(linked));
    }

    public static int returnElementsOfArrayList(List<Integer> a){
        return a.size();
    }
}
