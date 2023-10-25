import org.junit.Before;
import org.junit.Test;

public class JUnitTestAdventureGame {
    private Player player;

    @Before
    public void testPlayer() {
        player = new Player(1);
    }

    @Test
    public void testStartBalance() {
        assertEquals(1000, player.getBalance());
    }

    @Test 
    public void testBalanceNotNegative() {
        player.changeBalance(200);
        assertEquals(1200, player.getBalance());
        player.changeBalance(-1500);
        assertEquals(0, player.getBalance());
    }

    @Test 
    public void testToString() {
        String expected = "Player 1 bankbalance: 1000";
        assertEquals(expected, player.toString());
    }

    public static void assertEquals(Object expected, Object actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Expected: " + expected + ", but was: " + actual);
        }
    }

    public static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected: " + expected + ", but was: " + actual);
        }
    }
}