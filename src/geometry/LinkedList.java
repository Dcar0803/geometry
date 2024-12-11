package geometry;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a linked list for storing objects of any type.
 * @param <T> The type of objects to store in the list.
 */

public class LinkedList<T> {
    private List<T> items;
    
    /**
     * Constructs an empty linked list.
     */

    public LinkedList() {
        items = new ArrayList<>();
    }
    
    /**
     * Adds an item to the linked list.
     * @param item The item to add.
     */

    public void add(T item) {
        items.add(item);
    }
    
    /**
     * Removes an item from the linked list.
     * @param item The item to remove.
     * @return True if the item was removed, otherwise false.
     */

    public boolean remove(T item) {
        return items.remove(item);
    }
    
    /**
     * Finds an item in the linked list by index.
     * @param index The index of the item to find.
     * @return The item at the specified index, or null if not found.
     */

    public T find(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }
    
    /**
     * Retrieves all items in the linked list.
     * @return A list of all items in the linked list.
     */

    public List<T> getAll() {
        return items;
    }
}