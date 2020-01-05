package solution.com.upgrad.assg;

import java.util.Stack;
import java.util.Scanner;

public class SolutionA {

    private static Stack<String> history = new Stack<String>();

    /**
     * Or false if the browsing history is not empty
     * @return Returns true if the browsing history is empty
     *
     * Or false if the browsing history is not empty
     */
    public static Boolean isBrowsingHistoryEmpty() {
       // Add CODE BELOW
        if(history.size() == 0){
            return true;
        }else {
            return false;
        }
    }
    /**
     * @return Returns url of the website that the user most recently visited
     *
     */

    public static String mostRecentlyVisitedSite() {
        // Add CODE BELOW
        return history.peek();
    }

    /**
     * Adds a website url to the browsing history
     *
     */
    public static void addSiteToHistory(String url) {
        // Add CODE BELOW
        history.push(url);
    }

    /**
     * Removes the n most recently websites from the browsing history
     *
     * Where 1 <= n <= m, and m is the number of urls stored in the browsing
     *
     * If there the user has an empty browsing history, then do nothing
     *
     */
    public static void goBackInTime(int n) {
        // Add CODE BELOW
        for (int j = 0; j < n; j++) {
            history.pop();
        }
    }

    /**
     * Prints out all of the website urls in the browsing history to the command prompt
     *
     * If the user has an empty browsing history, then print “Browsing history is empty”
     *
     */
    public static void printBrowsingHistory() {
        // Add CODE BELOW
        Stack<String> historyBkup = new Stack<String>();

        if(history == null){
            System.out.println("Browsing history is empty");
        }else{
            while (!history.isEmpty()){
                System.out.println(history.peek());
                historyBkup.push(history.peek());
                history.pop();
            }
            while (!historyBkup.isEmpty()){
                history.push(historyBkup.peek());
                historyBkup.pop();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        addSiteToHistory("www.google.co.in"); // Navigating to Google
        addSiteToHistory("www.facebook.com"); // Navigating to Facebook
        addSiteToHistory("www.upgrad.com"); // Navigating to UpGrad
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad)
        addSiteToHistory("www.youtube.com"); // Navigating to Youtube
        goBackInTime(2); // Going back by 2 sites
        addSiteToHistory("www.yahoo.com"); // Navigating to UpGrad platform site
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad Learn Platform)
        printBrowsingHistory(); // Printing browsing history

    }

}

/**
 * Your code should have the following Output:
 * <p>
 * true
 * false
 * www.upgrad.com
 * www.yahoo.com
 * [www.google.co.in, www.facebook.com, www.yahoo.com]
 */
