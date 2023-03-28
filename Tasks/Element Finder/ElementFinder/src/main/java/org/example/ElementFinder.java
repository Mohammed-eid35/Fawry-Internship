package org.example;

import java.util.Collection;
import java.util.Comparator;

public class ElementFinder {

    public static <T extends Comparable<T>> T getMinimumElement(Collection<T> data) {
        if (data == null || data.isEmpty())
            return null;

        T min = data.iterator().next();
        for (T element : data) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public static <T> T getMinimumElement(Collection<T> data, Comparator<T> comparator) {
        if (data == null || data.isEmpty())
            return null;

        T min = data.iterator().next();
        for (T element : data) {
            if (comparator.compare(element, min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> T getMaximumElement(Collection<T> data) {
        if (data == null || data.isEmpty())
            return null;

        T max = data.iterator().next();
        for (T element : data) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static <T> T getMaximumElement(Collection<T> data, Comparator<T> comparator) {
        if (data == null || data.isEmpty())
            return null;

        T max = data.iterator().next();
        for (T element : data) {
            if (comparator.compare(element, max) > 0) {
                max = element;
            }
        }
        return max;
    }
}