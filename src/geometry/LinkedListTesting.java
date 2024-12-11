package geometry;
import org.junit.jupiter.api.Test;

public class LinkedListTesting {

    @Test
    public void testAddAndFind() {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");

        assert(list.find(0).equals("First")) : "First item should be 'First'";
        assert(list.find(1).equals("Second")) : "Second item should be 'Second'";
    }

    @Test
    public void testRemove() {
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        assert(list.remove("First")) : "Should successfully remove 'First'";
        assert(list.find(0) == null) : "First item should be 'Second' after removal";
    }

    @Test
    public void testFindInvalidIndex() {
        LinkedList<String> list = new LinkedList<>();
        assert(list.find(0) == null) : "Finding an invalid index should return null";
    }
}
