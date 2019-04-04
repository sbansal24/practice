package Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ElectionProblemAlgorithm {
    public static void main(String[] args) {
        String[] votes = {"john", "johnny", "jackie",
                "johnny", "john", "jackie",
                "jamie", "jamie", "john",
                "johnny", "jamie", "johnny",
                "john"};

        findWinner(votes);
    }

    private static void findWinner(String[] votes) {
        Map<String, Integer> map = new HashMap<>();
        for (String vote : votes) {
            if (map.containsKey(vote)) {
                map.put(vote, map.get(vote) + 1);
            } else {
                map.put(vote, 1);
            }
        }
        int maxVote = 0;
        String winner = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            if (maxVote < count) {
                maxVote = count;
                winner = name;
            } else if (maxVote == count && winner.compareTo(name) > 0) {
                winner = name;
            }
        }
        System.out.println(winner);

    }
}
