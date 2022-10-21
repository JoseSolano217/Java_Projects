package model;

public class Edge {
    private Node origin;
    private Node destination;
    private double value;

    public Edge(Node origin, Node destination, double value) {
        this.origin = origin;
        this.destination = destination;
        this.value = value;
    }

    public Edge(double value) {
        this.value = value;
    }

    public Node getOrigin() {
        return origin;
    }

    public void setOrigin(Node origin) {
        this.origin = origin;
    }

    public Node getDestination() {
        return destination;
    }

    public void setDestination(Node destination) {
        this.destination = destination;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "\n Edge [He=" + origin.getPerson() + ", Them=" + destination.getPerson() + ", Difference="
                + value + "]";
    }
}
