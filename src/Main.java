import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.add("first");
        list.add("second");
        list.add("third");
        System.out.println(Arrays.toString(list.getAll()));
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.indexOf("second"));
        System.out.println(list.contains("third"));
        System.out.println(list.contains("fourth"));
        System.out.println(list.remove(1));
        System.out.println(Arrays.toString(list.getAll()));
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println(list.indexOf("second"));
        System.out.println(list.contains("third"));
        System.out.println(list.contains("fourth"));
    }
}