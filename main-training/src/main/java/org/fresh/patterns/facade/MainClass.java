package org.fresh.patterns.facade;

/**
 * The Facade [1] design pattern is one of the twenty-three well-known GoF design patterns that describe how to solve recurring design problems to design flexible and reusable object-oriented software, that is, objects that are easier to implement, change, test, and reuse.
 * <p>
 * What problems can the Facade design pattern solve? [2]
 * <p>
 * To make a complex subsystem easier to use, a simple interface should be provided for a set of interfaces in the subsystem.
 * The dependencies on a subsystem should be minimized.
 * <p>
 * Clients that access a complex subsystem directly refer to (depend on) many different objects having different interfaces (tight coupling), which makes the clients hard to implement, change, test, and reuse.
 * <p>
 * What solution does the Facade design pattern describe?
 * <p>
 * Define a Facade object that
 * <p>
 * implements a simple interface in terms of (by delegating to) the interfaces in the subsystem and
 * may perform additional functionality before/after forwarding a request.
 * <p>
 * This enables to work through a Facade object to minimize the dependencies on a subsystem.
 * See also the UML class and sequence diagram below.
 */
public class MainClass {

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
