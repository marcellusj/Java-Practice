

public class Main {

    public static void main(String[] args) {
        String[] fruits = { "Apple", "Mango", "Orange" };

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        // Only forward can't change order or go backwards
        // Don't have access to index of all items
        for (String fruit : fruits)
            System.out.println(fruit);

    }
}