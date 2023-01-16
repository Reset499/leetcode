package BackTacking;

import javax.xml.datatype.DatatypeFactory;
import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TransferQueue;

public class ThreeHundredThirtyTwo_FindItinerary {
    public static void main(String[] args) {

    }

    List<String> result = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        Collections.sort(tickets, (a, b) -> a.get(1).compareTo(b.get(1)));
        path.add("JFK");
        boolean[] used = new boolean[tickets.size()];
        backTracing(tickets, used);
        return result;
    }

    public boolean backTracing(List<List<String>> tickets, boolean[] used) {
        if (path.size() == tickets.size() + 1) {
            result = new ArrayList<>(path);
            return true;
        }
        for (int i = 0; i < tickets.size(); i++) {
            if (used[i] == false &&tickets.get(i).get(0).equals(path.getLast())) {
                path.add(tickets.get(i).get(1));
                used[i] = true;
                if(backTracing(tickets,used)) return true;
                path.removeLast();
                used[i] = false;
            }
        }
        return false;
    }
}
