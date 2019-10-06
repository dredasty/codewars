package org.fresh.interview.printallpaths;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {
    private Stack<String> path = new Stack<>();
    private Set<String> onPath = new HashSet<>();

    public Solution(Graph graph, String from, String to) {
        enumerate(graph, from, to);
    }

    public void enumerate(Graph g, String current, String end) {
        path.push(current);
        onPath.add(current);

        if (current.equals(end)) {
            System.out.println(path);
        } else {
            for (String w : g.adjacentTo(current)) {
                if (!onPath.contains(w)) {
                    enumerate(g, w, end);
                }
            }
        }

        path.pop();
        onPath.remove(current);
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("C", "D");
        graph.addEdge("D", "E");
        graph.addEdge("C", "F");
        graph.addEdge("B", "F");
        graph.addEdge("F", "D");
        graph.addEdge("D", "G");
        graph.addEdge("E", "G");

        System.out.println(graph);
        new Solution(graph, "A", "graph");
        System.out.println();
        ;
        new Solution(graph, "B", "F");
    }
}
