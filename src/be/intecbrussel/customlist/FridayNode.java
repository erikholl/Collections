package be.intecbrussel.customlist;

public class FridayNode {

    private FridayNode nextNode;
    private int value;

    public FridayNode(int value) {
        this.value = value;
    }

    public FridayNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(FridayNode nextNode) {
        this.nextNode = nextNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void add(FridayNode fridayNode) {
        if (nextNode == null) {
            this.nextNode = fridayNode;
        } else {
            this.nextNode.add(fridayNode);
        }
    }

    public void printAll() {
        System.out.println(value);

        if (nextNode != null) {
            nextNode.printAll();
        }
    }

    public void remove(int numberToRemove) {
        if (nextNode == null) {
            return;
        }

        int valueNextNode = nextNode.getValue();
        if (valueNextNode == numberToRemove) {
            nextNode = nextNode.getNextNode();
        } else {
            nextNode.remove(numberToRemove);
        }
    }
}
