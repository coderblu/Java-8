package lambdas;

import java.util.Comparator;

public class ComparatorMethode {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Reasult of Comparator is :"+ comparator.compare(3,2));

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Reasult of Comparator is using LAmbda: "+comparatorLambda.compare(3,2));
    }

}
