package be.intecbrussel.customlist;

public class FridayList {

    private FridayNode firstNode;

    public void add(int value) {
        if (firstNode == null) {
            this.firstNode = new FridayNode(value);
        } else {
            firstNode.add(new FridayNode(value));
        }

    }

    public void printAll() {
        if (firstNode != null) {
            firstNode.printAll();
        }

    }

    public void remove(int numberToRemove) {
        if (firstNode == null) {
            return;
        }

        int valueNextNode = firstNode.getValue();
        if (valueNextNode == numberToRemove) {
            firstNode = firstNode.getNextNode();
        } else {
            firstNode.remove(numberToRemove);
        }
    }


}
