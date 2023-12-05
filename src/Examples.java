import org.junit.Test;
import static org.junit.Assert.*;

public class Examples{

    IBinTree mt = new EmptyBT();

    //add int(i) tests
    @Test
    public void testAddCurrentContainsI(){
        MaxHeapValidator validator = new MaxHeapValidator();
        assertFalse(validator.validAdd(new NodeBT(3, mt, mt), 3, new NodeBT(3, mt, mt)));
        assertTrue(validator.validAdd(mt, 3, new NodeBT(3, mt, mt)));
    }

    @Test
    public void testAddResultContainsI(){
        MaxHeapValidator validator = new MaxHeapValidator();
        assertTrue(validator.validAdd(mt, 3, new NodeBT(3, mt, mt)));
        assertFalse(validator.validAdd(mt, 3, new NodeBT(4, mt,mt)));
    }

    @Test
    public void testAddResultContainsAllElem(){
        MaxHeapValidator validator = new MaxHeapValidator();
        assertTrue(validator.validAdd(new NodeBT(5, mt, mt), 3, new NodeBT(5, new NodeBT(3, mt, mt), mt)));
        assertFalse(validator.validAdd(new NodeBT(5, mt, mt), 3, new NodeBT(3, mt, mt)));
    }

    @Test
    public void testAddResultContainsOnlyCurrentAndI(){
        MaxHeapValidator validator = new MaxHeapValidator();
        assertTrue(validator.validAdd(new NodeBT(5, mt, mt), 3, new NodeBT(5, new NodeBT(3, mt, mt), mt)));
        assertFalse(validator.validAdd(new NodeBT(5, mt, mt), 3, new NodeBT(5, new NodeBT(3, mt, mt), new NodeBT(4, mt, mt))));
    }

    @Test
    public void testAddResultIsMaxHeap(){
        MaxHeapValidator validator = new MaxHeapValidator();
        assertTrue(validator.validAdd(new NodeBT(5, mt, mt), 3, new NodeBT(5, new NodeBT(3, mt, mt), mt)));
        assertFalse(validator.validAdd(new NodeBT(5, mt, mt), 3, new NodeBT(3, new NodeBT(5, mt, mt), mt)));
    }

    //remove int(i) tests
    @Test
    public void testRemoveCurrentContainsI(){
        MaxHeapValidator validator = new MaxHeapValidator();
        assertTrue(validator.validRemove(new NodeBT(3, mt, mt), 3, mt));
        assertFalse(validator.validRemove(mt, 3, mt));
    }

    @Test
    public void testRemoveResultingContainsI(){
        MaxHeapValidator validator = new MaxHeapValidator();
        assertTrue(validator.validRemove(new NodeBT(3, mt, mt), 3, mt));
        assertFalse(validator.validRemove(new NodeBT(3, mt, mt), 3, new NodeBT(3, mt, mt)));
    }

    @Test
    public void testRemoveCurrentContainsAllResulting(){
        MaxHeapValidator validator = new MaxHeapValidator();
        assertTrue(validator.validRemove(new NodeBT(3, mt, mt), 3, mt));
        assertFalse(validator.validRemove(new NodeBT(3, mt, mt), 3, new NodeBT(5, mt, mt)));
    }

    @Test
    public void testRemoveCurrentOnlyContainsResultAndI(){
        MaxHeapValidator validator = new MaxHeapValidator();
        assertTrue(validator.validRemove(new NodeBT(3, mt, mt), 3, mt));
        assertFalse(validator.validRemove(new NodeBT(3, new NodeBT(2, mt, mt), mt), 3, mt));
    }

    @Test
    public void testRemoveResultIsMaxHeap(){
        MaxHeapValidator validator = new MaxHeapValidator();
        assertTrue(validator.validRemove(new NodeBT(5, new NodeBT(3, new NodeBT(2, mt, mt), mt), mt),
                2,
                new NodeBT(5, new NodeBT(3, mt, mt), mt)));
        assertFalse(validator.validRemove(new NodeBT(5, new NodeBT(3, new NodeBT(2, mt, mt), mt), mt),
                2,
                new NodeBT(3, new NodeBT(5, mt, mt), mt)));
    }


}
