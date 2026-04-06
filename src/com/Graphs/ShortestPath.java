/*BFS gives shortest path in unweighted graphs,whether directed or undirected, 
because it explores nodes level by level based on number of edges. */

import java.util.ArrayList;
import java.util.HashMap;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ShortestPath {
    public static int shortestpath(Map<Character, List<Character>> adjList, char source, 
    char destination,Map<Character,Character> parent){
        Queue<Character> queue = new LinkedList<>();
        //to cantain the distance of each node from source
        Map<Character,Integer> distance = new HashMap<>();
      
        queue.offer(source);
        distance.put(source,0);
        parent.put(source,null);

        while(!queue.isEmpty()){
            char current = queue.poll();
            if(current == destination) return distance.get(current);
        
            for(char node : adjList.get(current)){
                if(!distance.containsKey(node)){
                    queue.offer(node);
                    distance.put(node, distance.get(current)+1);
                    parent.put(node,current);
                }
            }
       }
       return -1;
    }

    public static void getPath(Map<Character,Character> parent, char source, char destination){
        if(!parent.containsKey(destination)){
            System.out.println("no path found");
            return;
        }
        // backtrack until we find the source as parent;
        Character current = destination;

        List<Character> path = new ArrayList<>();

        //while(current != source){ //---> when we don't add source to the parent map
        while(current != null){
            path.add(current);
            current = parent.get(current);
        }

        //add source to the path, if not in the parent map
        //path.add(source);
        
        for(int i = path.size()-1;i>=0;i--){
            System.out.print(path.get(i)+"--");
        }
    }
    public static void main(String[] args) {
        List<char[]> edges = new ArrayList<>();
        edges.add(new char[]{'A','B'});
        edges.add(new char[]{'A','C'});
        edges.add(new char[]{'B','D'});
        edges.add(new char[]{'C','E'});
        edges.add(new char[]{'D','F'});
        edges.add(new char[]{'E','F'});
        edges.add(new char[]{'F','G'});

        Map<Character, List<Character>> adjList = UndirectedGraph.createAdjacencyList(edges);
        //parent map of every node
        Map<Character,Character> parent = new HashMap<>();
        System.out.println(shortestpath(adjList,'A','G',parent));
        getPath(parent,'A','G');
    }
}
