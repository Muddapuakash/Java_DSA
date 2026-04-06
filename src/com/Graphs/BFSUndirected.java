import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BFSUndirected {

    public static void bfs(Map<Character,List<Character>> adjList,char source,Set<Character> visited){
        Queue<Character> queue = new LinkedList<>();
        queue.offer(source);
        visited.add(source);

        while(!queue.isEmpty()){
            char current = queue.poll();
            System.out.print(current + " ");
            
            for(char ch : adjList.get(current)){
                if(!visited.contains(ch)){
                    queue.offer(ch);
                    visited.add(ch);
                }
            }
        }

    }
    public static void main(String[] args) {
      List<char[]> edges = new ArrayList<>();
        edges.add(new char[]{'i','j'});
        edges.add(new char[]{'k','i'});
        edges.add(new char[]{'k','j'});
        edges.add(new char[]{'m','k'});
        edges.add(new char[]{'k','l'});
        edges.add(new char[]{'o','n'});

        Map<Character,List<Character>> adjList = UndirectedGraph.createAdjacencyList(edges);
        Set<Character> visited = new HashSet<>();

        //find the total no. of connected components
        int count = 0;
        for(char node : adjList.keySet()){
            if(!visited.contains(node)){
                bfs(adjList,node, visited);
                count++;
            }
        }
        System.out.println("\n"+count);
   
    }
}
