package lambda.predefineFI;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        // Funtion -> apply(data,returnTYpe) -> return any value

//        Function<String, Integer> strLenFunction = String::length;
//        Function<String, Integer> strLenFunction = s -> s.length();
//        System.out.println(strLenFunction.apply("HiKapil"));

        // remove space from string

//        Function<String , String> removeSpace = s -> s.replaceAll(" ","");

        //System.out.println(removeSpace.apply("Hi Kapil"));
//        System.out.println(removeSpace.andThen(strLenFunction).apply("Hi Kapil Kaushik")); // both are same f1.addThen(f2)  ->  execution f1 then f2
//        System.out.println(strLenFunction.compose(removeSpace).apply("Hi Kapil Kaushik")); // both are same  f2.compose(f1) ->  execution f1 then f2


        // func for count space in string

//        Function<String, Integer> countSpace = s -> s.length() - s.replaceAll(" ","").length();
//        System.out.println(countSpace.apply("Hi Kapil Kaushik"));

// show andThen vs compose
//        Function<Integer, Integer> f1 = i -> i + i;
//        Function<Integer, Integer> f2 = i -> i * i * i;

//        System.out.println(f1.andThen(f2).apply(2));
//        System.out.println(f1.compose(f2).apply(2));
//        System.out.println(f2.andThen(f1).apply(2));
//        System.out.println(f2.compose(f1).apply(2));


    }
}
