package projects;

public class Node<E> {
    private String name;
    private Integer value;
    private Node<E> s1;
    private Node<E> s2;

    public Node() {
        s1 = null;
        s2 = null;
    }

    public Node(String name, Integer value) {
        this.name = name;
        this.value = value;
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
                this.s2 = new Node<>(name, value);
            }
        } else if (value > this.value) {
            if (this.s1 != null) {
                this.s1.addSon(value, name);
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

        System.out.println(node.value);
        if (s1 != null) {
            preorder(node.s1);
        }
        if (s2 != null) {
            preorder(node.s2);
        }
    }

    public void inorder() {
        if (s1 != null) {
            System.out.println(s1.toString());
            s1.inorder();

        }
        System.out.println(value);
        if (s2 != null) {
            System.out.println(s2.toString());
            s2.inorder();

        }
    }

    public void postorder() {
        if (s1 != null) {
            s1.postorder();
        }
        if (s2 != null) {
            s2.postorder();
        }
        System.out.println(value);
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
