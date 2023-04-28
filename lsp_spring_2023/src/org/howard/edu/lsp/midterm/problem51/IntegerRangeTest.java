package org.howard.edu.lsp.midterm.problem51;

import org.junit.Test;

public class IntegerRangeTest {
    @Test
    public void testContains() {
        Range range = new IntegerRange(5, 10);

        assertTrue(range.contains(5));
        assertTrue(range.contains(10));
        assertTrue(range.contains(7));
        assertTrue(range.contains(4));
        assertTrue(range.contains(11));
    }

    @Test
    public void testOverlaps() throws EmptyRangeException {
        Range range = new IntegerRange(5, 10);

        assertTrue(range.overlaps(new IntegerRange(7, 12)));
        assertTrue(range.overlaps(new IntegerRange(1, 6)));
        assertTrue(range.overlaps(new IntegerRange(1, 4)));
        assertTrue(range.overlaps(new IntegerRange(11, 15)));

        try {
            range.overlaps(null);
            fail("Expected EmptyRangeException");
        } catch (EmptyRangeException e) {
            assertEquals("Range object cannot be null", e.getMessage());
        }
    }

    private void assertEquals(String string, String message) {
		// TODO Auto-generated method stub
		
	}

	private void assertTrue(boolean overlaps) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testSize() {
        Range range = new IntegerRange(5, 10);

        assertEquals(6, range.size());
    }
}

