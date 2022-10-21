package model;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String person;
    private List<Edge> edges;

    public Node(String person) {
        this.person = person;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void addEdge(Edge edge) {
        if (edges == null) {
            edges = new ArrayList<>();
        }
        edges.add(edge);
    }

    // En: Own implementation, I didn't searched for anything on internet, but it is strongly inspired on a tree order method
    // Es: Propia implementación, no busqué nada en internet, pero está fuertemente inspirado en el metodo de ordenamiento de un árbol
    public void seeEdgeNodes(Node node) {
        List<Node> nodeBlackList = new ArrayList<>();
        if (node.edges!=null) {
            System.out.println("Node " + node.person + " not null, begins operations");
            for (Edge edge: node.edges) {
                System.out.println("Node " + node.getPerson() + " added to the black list, may appear once more");
                System.out.println(edge.getDestination().getPerson() + " limits with " + node.getPerson());
            }
            for (Edge edge: node.edges) {
                if (!nodeBlackList.contains(edge.getDestination())) {
                    seeEdgeNodes(edge.getDestination());
                    nodeBlackList.add(node);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\n \tNode [Person=" + person + ", Comparison=" + edges + "]";
    }
}
