package com.revature.quizzard.util;

public class TempDriver {

    public static void main(String[] args) {
        // Access static members by using the type that declared them
        List.staticMethodExample();
        LinkedList.staticMethodExample();
        List<String> myStringList = new LinkedList<>();
        myStringList.defaultMethodExample();

        myStringList.add("test-1");
        myStringList.add("test-2");
        myStringList.add("test-3");
        System.out.println(myStringList.contains("test-1")); // true
        System.out.println(myStringList.contains("test-2")); // true
        System.out.println(myStringList.contains("test-3")); // true
        System.out.println(myStringList.contains("test-123")); // false
        
<<<<<<< HEAD
        // Make some different change to a file
=======
        // THIS WILL CAUSE A MERGE CONFLICT
>>>>>>> 8062c3fc168c38bcebadcda33e4725166684be21

    }

}
