import com.company.BST;

public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();
        bst.put(5, "Five");
        bst.put(3, "Three");
        bst.put(7, "Seven");
        bst.put(1, "One");
        bst.put(4, "Four");
        bst.put(6, "Six");
        bst.put(8, "Eight");

        System.out.println("Size of BST: " + bst.size());
        System.out.println("Value for key 4: " + bst.get(4));

        bst.delete(5);
        System.out.println("Size of BST after deleting key 5: " + bst.size());

        System.out.println("Iterating through the BST:");
        for (BST.BSTEntry entry : bst) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

