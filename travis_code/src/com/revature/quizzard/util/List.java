package com.revature.quizzard.util;

/*Interfaces
Interfaces act as a "contract" for implementing classes (any concrete class that implements this interface will
be required to provide logic for the declared methods of this interface
DO not have constructors and therefore cannot be instantiated

the interface declaration is implicitly abstract

all method stubs declared within an interface are also implicitly abstract and public

can contain non abstract methods
    -static methods
    -default methods (intodued in Java 8)


*/
public interface List<T> extends Collection<T> {

    //example of a method stub (a method without an implementation; can only be declared
    //within an abstract contruct (abstract class or interface)
    T get(int index);

    //defaults methods are inerface methods that have a default implementation
    //introdued in Java v8(added to help to maintain backward compatibility)
    //can be overridden
    default void defaultMethodExample() {
        System.out.println("This is a default method in an interface, it can be overridden by implementing classes");
    }

    //static methods
    //since java 1
    //cannot be overridden
    //Accessed like this: List.
    static void staticMethodExample() {
        System.out.println("This is a static method in an interface, it cannot be overridden - bit it can be shadowed");
    }


}
