package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        List<Pair> p = new ArrayList<>(Arrays.asList(
//                new Pair(1.2,1.3), new Pair("Bibek", 1.3)
//        ));
//
//        for(Pair ele:p){
//            String f = (String) ele.getFirst();
//            String s = (String) ele.getSecond();
//            System.out.println(f);
//            System.out.println(s);
//        }

//        PairGenerics<Integer, String> a = new PairGenerics<>(1,"Bibek");
//        PairGenerics<String, Integer> b = new PairGenerics<>("Bibek",2);
//
//        PairGenerics.doSomethingElse(1,"Bibek");

        List<String> demo = new ArrayList<>();
        System.out.println(demo.getClass().getName());
    }
}
