package projects;

import java.util.List;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Folder root = new Folder();
        Folder c = new Folder();
        Folder d = new Folder();
        root.addFolder(c);
        root.addFolder(d);
        File system = new File("system", "ini", 254.6);
        File config = new File("config", "aj", 127.3);
        TreeMap<Integer, Folder> treeMap = new TreeMap<>();
    }
}
