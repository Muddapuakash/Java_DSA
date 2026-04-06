import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndirectedGraph {

    public static Map<Character,List<Character>> createAdjacencyList(List<char[]> edges){
        Map<Character,List<Character>> adjList = new HashMap<>();

        for(char[] edge : edges){
            char node1 = edge[0];
            char node2 = edge[1];

            /*check if that node is present in the adjList of not, if not then put it in the adjList
            if(adjList.get(node1) == null) adjList.put(node1,new ArrayList<>);
            if(adjList.get(node2) == null) adjList.put(node2,new ArrayList<>);
            */
            adjList.putIfAbsent(node1, new ArrayList<>());
            adjList.putIfAbsent(node2, new ArrayList<>());

            adjList.get(node1).add(node2);
            adjList.get(node2).add(node1);
        }

        return adjList;
    } 
    public static void main(String[] args) {
        List<char[]> edges = new ArrayList<>();

        edges.add(new char[]{'i','j'});
        edges.add(new char[]{'k','i'});
        edges.add(new char[]{'k','j'});
        edges.add(new char[]{'m','k'});
        edges.add(new char[]{'k','l'});
        edges.add(new char[]{'o','n'});

        for(char[] edge : edges){
            System.out.println(Arrays.toString(edge));
        }

        Map<Character,List<Character>> adjList = createAdjacencyList(edges);
        System.out.println(adjList);
    }
}
