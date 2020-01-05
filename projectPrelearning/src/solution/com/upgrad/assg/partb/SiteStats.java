package solution.com.upgrad.assg.partb;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class SiteStats {
    private String url;
    private int numVisits;

    /**
     * Constructor for the SiteStats class
     *
     * @param url
     *            String that represents an URL that the user has visited
     * @param numVisits
     *            An int that represents the number of times that the user has
     *            visited the url
     */
    public SiteStats(String url, int numVisits) {
        this.url = url;
        this.numVisits = numVisits;
    }

    /**
     * This method returns the number of times that the user has visited the url.
     *
     * @return An int that represents the number of times that the user has visited
     *         the url
     */
    public int getNumVisits() {
        return this.numVisits;
    }

    /**
     * This method returns the url that we are currently tracking
     *
     * @return A String that represents the url that we are currently tracking
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * This method updates the number of times that we have visited the url
     *
     * @param updatedNumVisits
     *            int that represents the number that we want to set numVisits to
     */
    public void setNumVisits(int updatedNumVisits) {
        this.numVisits = updatedNumVisits;
    }

    public String toString() {
        return this.url + " | " + this.numVisits;
    }
}