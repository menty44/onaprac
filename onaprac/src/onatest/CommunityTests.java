package onatest;

import onaprac.Community;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author oluoch
 */
public class CommunityTests {
    public static final String FREDDY = "freddy";
    public static final String OLUOCH = "oluoch";
    public static final String OTIENO = "otieno";
    
    /**
     * Test creating new community and setting data.
     */
    @Test
    public void testCreateCommunity() {
        Community community = new Community(FREDDY, 5, 2);
        assertEquals(community.getCommunityName(), FREDDY);
        assertEquals(community.getTotalWaterPoints(), 5);
        assertEquals(community.getBrokenWaterPoints(), 2);
    }
    
    /**
     * Test whether community data variables are updated correctly.
     */
    @Test
    public void testCommunityAfterUpdate() {
        Community community = new Community(FREDDY, 5, 2);
        int totalWP = community.getTotalWaterPoints();
        community.setTotalWaterPoints( totalWP + 1);
        int brokenWP = community.getBrokenWaterPoints();
        community.setBrokenWaterPoints(brokenWP + 1);
        community.setCommunityName(OLUOCH);
        assertEquals(community.getTotalWaterPoints(), 6);
        assertEquals(community.getBrokenWaterPoints(), 3);
        assertEquals(community.getCommunityName(), OLUOCH);
    }
    
    /**
     * Test whether broken percentage works as expected.
     */
    @Test
    public void testBrokenWaterPointPercentage() {
        Community community1 = new Community(FREDDY, 5, 2);
        Community community2 = new Community(OLUOCH, 5, 2);
        int brokenPerc1 = (int) (community1.getBrokenPercentage() * 100);
        int brokenPerc2 = (int) (community2.getBrokenPercentage() * 100);
        assertEquals(brokenPerc1, brokenPerc2);
        community2.setBrokenWaterPoints(3);
        assertTrue(community2.getBrokenPercentage() > community1.getBrokenPercentage());
    }

    //Test ranking communities on broken water points percentage.     
    @Test
    public void testRankCommunitiesOnBrokenPercentage() {
        Community community1 = new Community(FREDDY, 5, 2);
        Community community2 = new Community(OLUOCH, 5, 3);
        Community community3 = new Community(OTIENO, 10, 1);
        List<Community> list = new ArrayList<Community>();
        list.add(community1);
        list.add(community2);
        list.add(community3);
        Collections.sort(list);
        Collections.reverse(list);
        assertEquals(list.get(0).getCommunityName(), OLUOCH);
        assertEquals(list.get(1).getCommunityName(), FREDDY);
        assertEquals(list.get(2).getCommunityName(), OTIENO);
    }
}
