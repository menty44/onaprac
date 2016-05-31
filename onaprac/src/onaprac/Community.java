package onaprac;

/**
 * 
 * @author oluoch
 */
public class Community implements Comparable<Community> {

    private int totalWaterPoints;
    private int brokenWaterPoints;
    private String communityName;
    
    public Community(String name, int totalWaterPoints, int brokenWaterPoints) {
        this.communityName = name;
        this.totalWaterPoints = totalWaterPoints;
        this.brokenWaterPoints = brokenWaterPoints;
    }

    //return the totalWaterPoints for a community.     
    public int getTotalWaterPoints() {
        return totalWaterPoints;
    }

    //set the totalWaterPoints      
    public void setTotalWaterPoints(int totalWaterPoints) {
        this.totalWaterPoints = totalWaterPoints;
    }

    //get or return the brokenWaterPoints
    public int getBrokenWaterPoints() {
        return brokenWaterPoints;
    }

    //set the brokenWaterPoints 
    public void setBrokenWaterPoints(int brokenWaterPoints) {
        this.brokenWaterPoints = brokenWaterPoints;
    }
    
    //return the communityName     
    public String getCommunityName() {
        return communityName;
    }

    //set the communityName 
    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
    
    //return percentage of broken water points     
    public double getBrokenPercentage() {
        return (double) this.brokenWaterPoints / this.totalWaterPoints;
    }

    //return a comparative integer value for sorting.
    @Override
    public int compareTo(Community comp) {
        if (getBrokenPercentage() == comp.getBrokenPercentage()) {
            return 0;
        } else if (getBrokenPercentage() > comp.getBrokenPercentage()) {
            return 1;
        } else {
            return -1;
        }
    }
}
