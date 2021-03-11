import edu.ense475.Buggy.HockeyLeague;

import junit.framework.TestCase;
/**
 * @author Alihusain (SID: 200379478)
 *
 */

public class TestHockeyLeague extends TestCase {

	public void testHockeyLeague() {
		HockeyLeague league = new HockeyLeague();
		assertTrue(league.getTeam("Blackhawks").getRoster().size() > 0);
	}

	public void testAddPlayer() {
		HockeyLeague league = new HockeyLeague();
		league.deletePlayer("Blackhawks", "Marian", "Hossa");
		assertTrue(league.addPlayer("Blackhawks", "D", "A", "A", 0));
		assertFalse(league.addPlayer("Blackhawks", "D", "A", "A", 0));
	}

	public void testDeletePlayer() {
		HockeyLeague league = new HockeyLeague();
		assertTrue(league.deletePlayer("Blackhawks", "Marian", "Hossa"));
	}

	public void testEditPlayer() {
		HockeyLeague league = new HockeyLeague();
		assertTrue(league.editPlayer("Blackhawks", "D", "Marian", "Hossa", 0));
		assertEquals(0, league.getPlayer("Blackhawks", "Marian", "Hossa").getRating());
		assertEquals("D", league.getPlayer("Blackhawks", "Marian", "Hossa").getPosition());
	}

	public void testGetTeam() {
		HockeyLeague league = new HockeyLeague();
		assertEquals("Blackhawks", league.getTeam("Blackhawks").teamName);
	}

	public void testGetPlayer() {
		HockeyLeague league = new HockeyLeague();
		assertEquals("LW Hossa, Marian 89", league.getPlayer("Blackhawks", "Marian", "Hossa").toString());
	}

	
}
