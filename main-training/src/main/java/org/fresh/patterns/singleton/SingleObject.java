package org.fresh.patterns.singleton;

/**
 * Common uses:
 *   The abstract factory, factory method, builder, and prototype patterns can use singletons in their implementation.
 *   Facade objects are often singletons because only one facade object is required.
 *   State objects are often singletons.
 *   Singletons are often preferred to global variables because:
 *     They do not pollute the global namespace (or, in languages with nested namespaces, their containing namespace) with unnecessary variables.[5]
 *     They permit lazy allocation and initialization, whereas global variables in many languages will always consume resources.
 */
public class SingleObject {
    private SingleObject() {

    }

    public static final SingleObject INSTANCE = new SingleObject();

    public void print() {
        System.out.println(this.hashCode());
    }
}
