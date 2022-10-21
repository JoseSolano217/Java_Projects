package projects;

import java.util.ArrayList;
import java.util.List;

public class Node<E> {
    private String name;
    private Integer value;
    private List<Node> nodeList;
    private Node<E> s1;
    private Node<E> s2;

    public Node() {
        nodeList = new ArrayList<>();
        s1 = null;
        s2 = null;
    }

    public Node(String name, Integer value) {
        this.name = name;
        this.value = value;
        nodeList = new ArrayList<>();
        s1 = null;
        s2 = null;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getValue() {
        return value;
    }
    public void setValue(Integer value) {
        this.value = value;
    }
    public Node<E> getS1() {
        return s1;
    }
    public void setS1(Node<E> s1) {
        this.s1 = s1;
    }
    public Node<E> getS2() {
        return s2;
    }
    public void setS2(Node<E> s2) {
        this.s2 = s2;
    }

    public void addSon(int value, String name) {
        if (value < this.value) {
            if (this.s1 != null) {
                this.s1.addSon(value, name);
            } else {
                this.s1 = new Node<>(name, value);
            }
        } else if (value > this.value) {
            if (this.s2 != null) {
                this.s2.addSon(value, name);
            } else {
                this.s2 = new Node<>(name, value);
            }
        }
    }

    public int size() {
        int size = 1;
        if (s1 != null) {
            size += s1.size();
        }
        if (s2 != null) {
            size += s2.size();
        }
        return size;
    }

    public int height() {
        int hl = -1;
        int hr = -1;
        if (s1 != null) {
            hl = s1.height();
        }
        if (s2 != null) {
            hr = s2.height();
        }
        return 1 + Math.max(hl, hr);
    }

    public void preorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.getValue());
        if (node.s1 != null) {
            preorder(node.s1);
        }
        if (node.s2 != null) {
            preorder(node.s2);
        }
    }

    public void inorder(Node node) {
        if (node.s1 != null) {
            inorder(node.s1);
        }
        System.out.println(value);
        if (node.s2 != null) {
            inorder(node.s2);
        }
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }

        if (s1 != null) {
            postorder(node.s1);
        }
        if (s2 != null) {
            postorder(node.s2);
        }
        System.out.println(node.getValue());
    }

    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", s1=" + s1 +
                ", s2=" + s2 +
                '}';
    }
}
