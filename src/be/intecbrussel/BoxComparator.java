package be.intecbrussel;

import java.util.Comparator;

public interface BoxComparator {
    // here we're making a custom Comparator interface class for the Box
    // class. we create 3 inner classes (3 different comparators you
    // could say), implement in all of them the the Comparator functional
    // interface class and give it type Box and define the compare method by
    // overiding the compare method from the Comparator class. I'm not really
    // sure why we do NOT need to mention 'extends Comparator' when declaring
    // the public interface BoxComparator.
    // TODO: check why it is not needed to indicate 'extends Comparator'.
    // TODO: further reading comparator and how to implement

    class lengthBoxComparator implements Comparator<Box> {

        @Override
        public int compare(Box o1, Box o2) {
            return o1.getLength() - o2.getLength();
        }
    }

    class widthBoxComparator implements Comparator<Box> {

        @Override
        public int compare(Box o1, Box o2) {
            return o1.getWidth() - o2.getWidth();
        }
    }

    class reverseBoxComparator implements Comparator<Box> {

        @Override
        public int compare(Box o1, Box o2) {
            return o2.getLength() - o1.getLength();
        }
    }


}
