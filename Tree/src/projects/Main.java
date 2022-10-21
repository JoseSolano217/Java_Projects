package projects;

import java.util.Iterator; // Needed
import java.util.Map; // Needed too
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        m.treeMap();

    }

    private void treeMap() {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        Node node = new Node("", 1004);
        for (int i = 1; i <= 10; i++) {
            treeMap.put(1000 + i, String.valueOf(i + 5));
            node.addSon(1000 + i, String.valueOf(i + 5));
        }

        Iterator iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(((Map.Entry) iterator.next()).getKey());
        }
    }
}
