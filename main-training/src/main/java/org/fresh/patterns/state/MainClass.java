package org.fresh.patterns.state;

/**
 * The state pattern is set to solve two main problems:[4]
 * <p>
 * An object should change its behavior when its internal state changes.
 * State-specific behavior should be defined independently. That is, adding new states should not affect the behavior of existing states.
 * <p>
 * Implementing state-specific behavior directly within a class is inflexible because it commits the class to a particular behavior and makes it impossible to add a new state or change the behavior of an existing state later independently from (without changing) the class. In this, the pattern describes two solutions:
 * <p>
 * Define separate (state) objects that encapsulate state-specific behavior for each state. That is, define an interface (state) for performing state-specific behavior, and define classes that implement the interface for each state.
 * A class delegates state-specific behavior to its current state object instead of implementing state-specific behavior directly.
 * <p>
 * This makes a class independent of how state-specific behavior is implemented. New states can be added by defining new state classes. A class can change its behavior at run-time by changing its current state object.
 */
public class MainClass {
    public static void main(String[] args) {
        StateContext context = new StateContext();

        context.writeName("Monday");
        context.writeName("Tuesday");
        context.writeName("Wednesday");
        context.writeName("Thursday");
        context.writeName("Friday");
        context.writeName("Saturday");
        context.writeName("Sunday");
    }
}
