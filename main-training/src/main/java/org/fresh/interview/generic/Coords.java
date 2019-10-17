package org.fresh.interview.generic;

public class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        this.coords = o;
    }

    public static void main(String[] args) {
        TwoD[] td = {new TwoD(1, 2), new TwoD(0, 1)};
        Coords<TwoD> ct = new Coords<>(td);
        showXY(ct);

        FourD[] fd = {new FourD(1, 2, 3, 4), new FourD(1, 2, 3, 54)};
        Coords<FourD> cfd = new Coords<>(fd);
        showAll(cfd);
    }

    static void showXY(Coords<?> c) {
        System.out.println("(x, y) -> ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(String.format("(%s, %s)", c.coords[i].x, c.coords[i].y));
        }
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("(x, y, z) -> ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(String.format("(%s, %s, %s)", c.coords[i].x, c.coords[i].y, c.coords[i].z));
        }
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("(x, y, z, t) -> ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(String.format("(%s, %s, %s, %s)", c.coords[i].x, c.coords[i].y, c.coords[i].z, c.coords[i].t));
        }
    }
}
