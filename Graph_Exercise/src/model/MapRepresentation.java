package model;

public class MapRepresentation {
    public static Graph getStuff() {
        Node christopher = new Node("Christopher");
        Node sanford = new Node("Sanford");
        Node he = new Node("He");
        Node jose = new Node("José");
        Node pablo = new Node("Pablo");
        Node juan = new Node("Juan");
        Node liseth = new Node("Liseth");
        Node lola = new Node("Lola");
        Node yolima = new Node("Yolima");
        Node ed = new Node("Ed");

        christopher.addEdge(new Edge(christopher, sanford, 7));
        he.addEdge(new Edge(he, christopher, 99));

        sanford.addEdge(new Edge(sanford, jose, 14));
        pablo.addEdge(new Edge(pablo, sanford, 32));

        he.addEdge(new Edge(he, jose, 99));

        pablo.addEdge(new Edge(pablo, jose, 42));

        juan.addEdge(new Edge(juan, he, 50));
        juan.addEdge(new Edge(juan, christopher, 50));

        Graph graph = new Graph();
        graph.addNode(pablo);
        graph.addNode(juan);
        graph.addNode(christopher);
        graph.addNode(sanford);
        graph.addNode(he);
        graph.addNode(jose);
        juan.seeEdgeNodes(juan);
        return graph;
    }

    public static void main(String[] args) {
        Graph graph = getStuff();
        System.out.println(graph);
    }
}
