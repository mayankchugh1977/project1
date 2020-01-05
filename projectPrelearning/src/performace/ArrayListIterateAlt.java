package performace;

import java.util.List;
        import java.util.ArrayList;
        import java.util.ListIterator;

class ArrayListIterateAlt{

    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        iterateFwd(random);
    }

    public static void iterateFwd(List<Float> num) {
        ListIterator<Float> it = num.listIterator();
        while(it.hasNext()) {
            it.next();
            System.out.println(it.next());
        }
    }
}