package prelearning;

public class variablesUpdate {
    public static void main(String[] args)
    {
        // declaring and initialization of prelearning.variables in one line
        int distanceAdam = 0, distanceLucy = 0;

        // printing out initial values of these prelearning.variables
        System.out.println(distanceAdam);
        System.out.println(distanceLucy);

        // updating these prelearning.variables
        distanceAdam = distanceAdam + 20;

        // another way to update by overwriting
        distanceLucy = 15;

        // printing out final updated values

        System.out.println(distanceAdam);
        System.out.println(distanceLucy);

    }
}
