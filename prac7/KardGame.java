package prac7;

import java.util.*;

public class KardGame {
    int count = 0, temp = 0, temp2 = 0;

    KardGame() {
        Deque<Integer> first = new ArrayDeque<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        first.add(5);

        Deque<Integer> second = new ArrayDeque<>();
        second.add(6);
        second.add(7);
        second.add(8);
        second.add(9);
        second.add(0);

        while (!first.isEmpty() && !second.isEmpty()) {
            if (count > 106) {
                System.out.println("botva");
                break;
            }

            if (first.getFirst() == 0 && second.getFirst() == 9) {
                temp = first.getFirst();
                first.removeFirst();

                temp2 = second.getFirst();
                second.removeFirst();

                first.addLast(temp);
                first.addLast(temp2);
                count++;
            } else if (second.getFirst() == 0 && first.getFirst() == 9) {
                temp = first.getFirst();
                first.removeFirst();

                temp2 = second.getFirst();
                second.removeFirst();

                second.addLast(temp2);
                second.addLast(temp);
                count++;
            } else if (first.getFirst() > second.getFirst()) {
                temp = first.getFirst();
                first.removeFirst();

                temp2 = second.getFirst();
                second.removeFirst();

                first.addLast(temp);
                first.addLast(temp2);
                count++;
            } else if (first.getFirst() < second.getFirst()) {
                temp = first.getFirst();
                first.removeFirst();

                temp2 = second.getFirst();
                second.removeFirst();

                second.addLast(temp2);
                second.addLast(temp);
                count++;
            } else {
                System.out.println("Eror");
            }
        }
        if (first.isEmpty()) {
            System.out.println("second: " + count);
        } else {
            System.out.println("first: " + count);
        }
    }
}