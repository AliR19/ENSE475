import java.util.ArrayList;


import edu.ense475.Buggy.HockeyPlayer;
import edu.ense475.Buggy.HockeyTeam;
import junit.framework.TestCase;
/**
 * @author Alihusain (SID: 200379478)
 *
 */

public class TestHockeyTeam extends TestCase {

	public void testGetRoster() {
		HockeyTeam ducks = new HockeyTeam("Ducks");
		ArrayList<HockeyPlayer> check = new ArrayList<HockeyPlayer>();
		
		HockeyPlayer one = new HockeyPlayer("D", "1", "1", 1);
		HockeyPlayer two = new HockeyPlayer("D", "2", "2", 2);
		HockeyPlayer three = new HockeyPlayer("D", "3", "3", 3);
		
		check.add(one);
		check.add(two);
		check.add(three);
		
		assertEquals(true, ducks.addPlayer(one));
		assertEquals(true, ducks.addPlayer(two));
		assertEquals(true, ducks.addPlayer(three));
		assertEquals(check, ducks.getRoster());
	}

	public void testAddPlayer() {
		HockeyTeam ducks = new HockeyTeam("Ducks");
		assertEquals(true, ducks.addPlayer(new HockeyPlayer()));
		assertEquals(false, ducks.addPlayer(new HockeyPlayer()));
	}

	public void testDeletePlayer() {
		HockeyTeam ducks = new HockeyTeam("Ducks");
		HockeyPlayer badPlayer = new HockeyPlayer();

		assertEquals(false, ducks.deletePlayer(badPlayer));
		assertEquals(true, ducks.addPlayer(badPlayer));
		assertEquals(true, ducks.deletePlayer(badPlayer));
		assertEquals(false, ducks.deletePlayer(badPlayer));
	}

	public void testGetPlayer() {
		HockeyTeam ducks = new HockeyTeam("Ducks");
		HockeyPlayer badPlayer = new HockeyPlayer();

		assertEquals(null, ducks.getPlayer(badPlayer));
		assertEquals(true, ducks.addPlayer(badPlayer));
		assertEquals(badPlayer, ducks.getPlayer(badPlayer));
	}

	public void testEditPlayer() {
		HockeyTeam ducks = new HockeyTeam("Ducks");
		HockeyPlayer badPlayer = new HockeyPlayer();

		assertEquals(false, ducks.editPlayer(new HockeyPlayer()));
		assertEquals(true, ducks.addPlayer(badPlayer));
		assertEquals(true, ducks.editPlayer(badPlayer));
		badPlayer.setPosition("D");
		assertEquals(true, ducks.editPlayer(badPlayer));
		assertEquals("D", ducks.getPlayer(badPlayer).getPosition());
	}

}
