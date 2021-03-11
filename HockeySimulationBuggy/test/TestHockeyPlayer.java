import edu.ense475.Buggy.HockeyPlayer;
import junit.framework.TestCase;

/**
 * @author Alihusain (SID: 200379478)
 *
 */

public class TestHockeyPlayer extends TestCase {

	public void testHockeyPlayerStringStringStringInt() {
		HockeyPlayer player = new HockeyPlayer("D", "Joe", "Blow", 6);
		assertEquals("Joe", player.getFirstName());
		assertEquals("Blow", player.getLastName());
		assertEquals("D", player.getPosition());
		assertEquals(6, player.getRating());
	}

	public void testHockeyPlayer() {
		HockeyPlayer player = new HockeyPlayer();
		assertEquals("", player.getFirstName());
		assertEquals("", player.getLastName());
		assertEquals("", player.getPosition());
		assertEquals(0, player.getRating());
	}

	public void testSetPosition() {
		HockeyPlayer player = new HockeyPlayer();
		player.setPosition("D");
		assertEquals("D", player.getPosition());
	}

	public void testSetRating() {
		HockeyPlayer player = new HockeyPlayer();
		player.setRating(2);
		assertEquals(2, player.getRating());
	}

	public void testToString() {
		HockeyPlayer player = new HockeyPlayer("D", "Joe", "Blow", 6);
		assertEquals("D Blow, Joe 6", player.toString());
	}

}
