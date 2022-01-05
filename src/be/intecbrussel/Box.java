package be.intecbrussel;

public class Box implements Comparable<Box> {

    private int width;
    private int height;
    private int length;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", length=" + length +
                ", volume=" + length * width * height +
                '}';
    }

    @Override
    public int compareTo(Box o) {
        int volumeThisBox = width * height * length;
        int volumeOfBoxO = o.width * o.height * o.length;

        return volumeThisBox - volumeOfBoxO; // if we would switch thisBox
        // and Box, you can switch the order of sorting (think this through)
    }
}
