
package com.company;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class RBTreeTest {
    @Test
    void treeExists(){
        RBTree tree = new RBTree();
        assertNotNull(tree);
    }

    public static void main(String[] args) {
        RBTree rbTree = new RBTree();
        List<Integer> list = new ArrayList();

        // Wstawiamy kilka elementów do drzewa
        rbTree.insert(1, 100);
        rbTree.insert(2, 50);
        rbTree.insert(3, 150);
        // Wyświetlamy wysokość drzewa
        System.out.println("Wysokość drzewa: " + rbTree.getHeight());
        // Wyszukujemy i wyświetlamy wartości dla kilku kluczy
        System.out.println("Wartość dla klucza 1: " + rbTree.getValue(1));
        System.out.println("Wartość dla klucza 2: " + rbTree.getValue(2));
        System.out.println("Wartość dla klucza 3: " + rbTree.getValue(3));
        // Usuwamy kilka elementów z drzewa
        rbTree.removeNode(1);
        rbTree.removeNode(2);
        // Wyświetlamy wysokość drzewa po usunięciu
        System.out.println("Wysokość drzewa po usunięciu: " + rbTree.getHeight());
        // Wyszukujemy i wyświetlamy wartości po usunięciu
        System.out.println("Wartość dla klucza 1 po usunięciu: " + rbTree.getValue(1));
        System.out.println("Wartość dla klucza 2 po usunięciu: " + rbTree.getValue(2));
    }
}
 
