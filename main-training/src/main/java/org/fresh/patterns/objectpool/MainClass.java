package org.fresh.patterns.objectpool;

/**
 * Object pooling can offer a significant performance boost in situations where the cost of initializing a class instance is high and the rate of instantiation and destruction of a class is high – in this case objects can frequently be reused, and each reuse saves a significant amount of time. Object pooling requires resources – memory and possibly other resources, such as network sockets, and thus it is preferable that the number of instances in use at any one time is low, but this is not required.
 * The pooled object is obtained in predictable time when creation of the new objects (especially over network) may take variable time. These benefits are mostly true for objects that are expensive with respect to time, such as database connections, socket connections, threads and large graphic objects like fonts or bitmaps.
 * In other situations, simple object pooling (that hold no external resources, but only occupy memory) may not be efficient and could decrease performance.[1] In case of simple memory pooling, the slab allocation memory management technique is more suited, as the only goal is to minimize the cost of memory allocation and deallocation by reducing fragmentation.
 * <p>
 * Criticism
 * Some publications do not recommend using object pooling with certain languages, such as Java, especially for objects that only use memory and hold no external resources (such as connections to database). Opponents usually say that object allocation is relatively fast in modern languages with garbage collectors; while the operator new needs only ten instructions, the classic new - delete pair found in pooling designs requires hundreds of them as it does more complex work. Also, most garbage collectors scan "live" object references, and not the memory that these objects use for their content. This means that any number of "dead" objects without references can be discarded with little cost. In contrast, keeping a large number of "live" but unused objects increases the duration of garbage collection.[1]
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println(UsersPool.getUser());
        System.out.println(UsersPool.getUser());
        System.out.println(UsersPool.getUser());
        System.out.println(UsersPool.getUser());
        System.out.println(UsersPool.getUser());
        final UserObject user = UsersPool.getUser();
        System.out.println(user);

        UsersPool.releaseObject(user);
        System.out.println(UsersPool.getUser());
        UsersPool.releaseObject(user);
        System.out.println(UsersPool.getUser());
        System.out.println(UsersPool.getUser());
        UsersPool.releaseObject(user);
        System.out.println(UsersPool.getUser());
        UsersPool.releaseObject(user);
        System.out.println(UsersPool.getUser());
    }
}
