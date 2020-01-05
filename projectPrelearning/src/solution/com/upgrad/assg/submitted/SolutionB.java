package solution.com.upgrad.assg.submitted;

import java.util.*;

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

class SolutionB {

    private static Queue<SiteStats> sites = new LinkedList<SiteStats>();

    /**
     *
     * Please see below for definition of the SiteStats class
     *
     * The function will print the top 5 sites and the no. of times they are visited. If multiple websites have been visited
     * the same no. of times, then they should be ordered by recency (the last visited).
     *
     * If the user has no browsing history, the function will print an empty array of type String
     *
     * @param sites sites is a queue that represents all the websites that the user has visited,
     *              as well the number of times that the user has visited each website
     * @param n n represents the top n most visited sites that we want to retrieve from the queue
     *          0 < n <= m, where m is the number of websites tracked by Queue<SiteStats> sites or the size of the queue
     */

    // Main method to list top n visited sites
    public static void listTopVisitedSites(Queue<SiteStats> sites, int n) {
        // WRITE CODE HERE
        int count = 1;
        if(sites.size() == 0){
            System.out.println("");
        }else {
            count = 1;
            int sitesSize = sites.size();

//          Comparator for getNumVisits field
            Comparator<SiteStats> sortNumVisits = Comparator.comparing(SiteStats::getNumVisits);
            PriorityQueue<SiteStats> priorityQueue = new PriorityQueue<>( sortNumVisits );

            for (int i = 0; i < sites.size(); i++) {
                priorityQueue.add((SiteStats)sites.peek());
                sites.remove();
            }

            int priorityQueueSize = priorityQueue.size() - n;
            while(true){
                SiteStats e = priorityQueue.poll();
                if(e == null) break;

                if(count > priorityQueueSize)
                    System.out.println(e);

                count ++;
            }
        }
    }

    /**
     * This method finds the given website in the queue and increments the visited count by 1, if the website is found
     * in the queue. If the website is not  found, it adds a new node to the queue.
     *
     */
    // Method to find the website in the queue and increment the visited count by 1, adding new node in case website is not found
    public static void updateCount(String url) {
        // WRITE CODE HERE

        Queue<SiteStats> tempSites = new LinkedList<SiteStats>();
        boolean siteFound = false;

        for(int i = 0; i < sites.size(); i++) {
            if(sites.peek().getUrl().equalsIgnoreCase(url)){
                sites.peek().setNumVisits( sites.peek().getNumVisits() + 1 );
                siteFound = true;
            }
            tempSites.add((SiteStats)sites.peek());
            sites.remove();
        }

        if(!siteFound)
            tempSites.add(new SiteStats(url,1));

        sites.addAll(tempSites);
    }

    public static void main(String[] args) {
        String[] visitedSites = { "www.google.co.in", "www.google.co.in", "www.facebook.com", "www.upgrad.com", "www.google.co.in", "www.youtube.com",
                "www.facebook.com", "www.upgrad.com", "www.facebook.com", "www.google.co.in", "www.microsoft.com", "www.9gag.com", "www.netflix.com",
                "www.netflix.com", "www.9gag.com", "www.microsoft.com", "www.amazon.com", "www.amazon.com", "www.uber.com", "www.amazon.com",
                "www.microsoft.com", "www.upgrad.com" };

        for (String url : visitedSites) {
            updateCount(url);
        }
        listTopVisitedSites(sites, 5);

    }
}
