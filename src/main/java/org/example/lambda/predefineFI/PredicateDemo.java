package org.example.lambda.predefineFI;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // Predicate -> test(args) -> return boolean value
//        Predicate<Integer> predicate = i -> i >= 18;
//        Predicate<String> stringPredicate = s -> s.length() > 5;

        // false
//        System.out.println(predicate.test(18)); // true

        // for reverse predicate
//        System.out.println(predicate.test(12));
//        predicate = predicate.negate();
//        System.out.println(predicate.test(12)); // true
//
//        System.out.println(stringPredicate.test("Kapil")); //false
//        System.out.println(stringPredicate.test("KapilKaushik")); // true

//        Predicate<Integer> p = i -> i % 2 == 0;
//        Predicate<Integer> and = predicate.and(p);
//        System.out.println(and.test(-12));
//        System.out.println(and.test(-2));
//        System.out.println(and.test(18));

//        predicate start with k
//        Predicate<String> kStart = s -> s.charAt(0) == 'K' || s.charAt(0) == 'k';
//        String kArr[] = {"kapil", "kaushik", "tushar", "mohit", "Kaju"};
//        for (String s : kArr) {
//            if (kStart.test(s)) System.out.println(s);
//        }

// remove null values from string arr
//        Predicate<String> removeNull = s -> !(s == null || s.isEmpty() || s.trim().length() == 0 );
//        String nullArr[] = {"",null,"Kapil","kaushik"," ","mohit"};
//        for (String s : nullArr) {
//            if (removeNull.test(s)) System.out.println(s);
//        }


        // auth user
        Predicate<User> authUser = user -> user.getUserName().equals("kapil") && user.getPassWord().equals("dummy");
        User u = new User("kaushik", "dummy");
        System.out.println(authUser.test(u));
        u = new User("kapil", "dummy");
        System.out.println(authUser.test(u));
    }
}

class User {
    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
}
