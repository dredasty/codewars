package org.fresh.interview.printallpaths;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graph {

    private HashMap<String, Set<String>> map;

    private int E;

    public Graph() {
        map = new HashMap<>();
    }

    public int V() {
        return map.size();
    }

    public int E() {
        return E;
    }

    private void validateVertex(String v) {
        if (!hasVertex(v)) throw new IllegalArgumentException(v + " is not a vertex");
    }

    public int degree(String v) {
        validateVertex(v);
        return map.get(v).size();
    }

    public void addEdge(String v, String w) {
        if (!hasVertex(v)) addVertex(v);
        if (!hasVertex(w)) addVertex(w);
        if (!hasEdge(v, w)) E++;
        map.get(v).add(w);
        map.get(w).add(v);
    }

    public void addVertex(String v) {
        if (!hasVertex(v)) map.put(v, new HashSet<>());
    }

    public Iterable<String> vertices() {
        return map.keySet();
    }

    public Iterable<String> adjacentTo(String v) {
        validateVertex(v);
        return map.get(v);
    }

    public boolean hasVertex(String v) {
        return map.containsKey(v);
    }

    public boolean hasEdge(String v, String w) {
        validateVertex(v);
        validateVertex(w);
        return map.get(v).contains(w);
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (String v : map.keySet()) {
            s.append(v + ": ");
            for (String w : map.get(v)) {
                s.append(w + " ");
            }
            s.append('\n');
        }
        return s.toString();
    }
}
