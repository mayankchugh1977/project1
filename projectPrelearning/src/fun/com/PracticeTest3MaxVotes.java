package fun.com;

class PracticeTest3MaxVotes {
    public static void main(String args[]) {
        int[] votes = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
        int userWithMostVotes = mostVotes(votes);
        System.out.println("User with the most votes is User: " + userWithMostVotes);
    }

    public static int mostVotes(int[] votes) {
        int maxNumber = 0;
        int maxIndex = 0;
        for(int i=0; i <= votes.length -1; i++) {
           // System.out.println(votes[i]);
            if(maxNumber < votes[i]){
                maxNumber =  votes[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}