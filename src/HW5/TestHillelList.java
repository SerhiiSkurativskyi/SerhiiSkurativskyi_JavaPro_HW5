package HW5;

import org.junit.Assert;
import org.junit.Test;

public class TestHillelList {
    @Test
    public void testAdd() {
        ListHillelList testList = new ListHillelList();
        testList.add("zero");
        testList.add("first");
        testList.add("second");
        Assert.assertArrayEquals(new String[]{"zero", "first", "second"}, testList.getAll());
    }

    @Test
    public void testRemove() {
        ListHillelList testList = new ListHillelList();
        testList.add("zero");
        testList.add("first");
        testList.add("second");
        testList.remove(1);
        Assert.assertArrayEquals(new String[]{"zero", "second"}, testList.getAll());
    }

    @Test
    public void testContainsTrue() {
        ListHillelList testList = new ListHillelList();
        testList.add("zero");
        testList.add("first");
        testList.add("second");
        boolean result = testList.contains("first");
        Assert.assertTrue(result);
    }

    @Test
    public void testContainsFalse() {
        ListHillelList testList = new ListHillelList();
        testList.add("zero");
        testList.add("first");
        testList.add("second");
        boolean result = testList.contains("fourth");
        Assert.assertFalse(result);
    }

    @Test
    public void testIndexOf() {
        ListHillelList testList = new ListHillelList();
        testList.add("zero");
        testList.add("first");
        testList.add("second");
        Assert.assertEquals(1, testList.indexOf("first"));
    }

    @Test
    public void testSize() {
        ListHillelList testList = new ListHillelList();
        testList.add("zero");
        testList.add("first");
        testList.add("second");
        Assert.assertEquals(3, testList.size());
    }

    @Test
    public void testGet() {
        ListHillelList testList = new ListHillelList();
        testList.add("zero");
        testList.add("first");
        testList.add("second");
        Assert.assertEquals("first", testList.get(1));
    }

    @Test
    public void testGetAll() {
        ListHillelList testList = new ListHillelList();
        testList.add("zero");
        testList.add("first");
        testList.add("second");
        Assert.assertArrayEquals(new String[]{"zero", "first", "second"}, testList.getAll());
    }
}
