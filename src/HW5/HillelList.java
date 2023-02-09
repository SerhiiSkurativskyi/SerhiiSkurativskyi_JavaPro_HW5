package HW5;

import java.util.Objects;

public interface HillelList {
    int length = 1000;
    String[] list = new String[length];

    default void add(String item) {
        for (int i = 0; i < length; i++) {
            boolean ifNull = list[i] == null;
            if (ifNull) {
                list[i] = item;
                break;
            }
        }
    }

    default String remove(int index) {
        if (index < 0 || index > size()) {
            System.out.println("Index is out of List borders");
        } else {
        System.arraycopy(list, index + 1, list, index, list.length - 1 - index);}
        return list[index];
    }

    default boolean contains(String item) {
        boolean equal = false;
        for (String s : list) {
            equal = Objects.equals(s, item);
            if (equal) {
                break;
            }
        }
        return equal;
    }


    default int indexOf(String item) {
        int i;
        for (i = 0; i < list.length; i++) {
            boolean equal = Objects.equals(list[i], item);
            if (equal) {
                break;
            }
        }
        return i;
    }


    default int size() {
        int i;
        for (i = 0; i < length; i++) {
            boolean ifNull = list[i] == null;
            if (ifNull) {
                break;
            }
        }
        return i;
    }


    default String get(int index) {
        if (index < 0 || index > size()) {
            System.out.println("Index is out of List borders");
        } else {
            return list[index];
        }
        return list[index];
    }


    default String[] getAll() {
        String[] listGetAll = new String[size()];
        if (size() >= 0) System.arraycopy(list, 0, listGetAll, 0, size());
        return listGetAll;
    }
}
