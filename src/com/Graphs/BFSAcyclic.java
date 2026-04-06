/*An acyclic graph is a graph with no cycles in it.*/
/*BFS is a breadth first traversal of a graph.
It is done with the help of a queue i.e. until the queque is empty we poll one item
and add its neighbour(s) to the queue */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFSAcyclic {
    public static  void bfsIterative(Map<Character,List<Character>> adjList, char source){
        Queue<Character> queue = new LinkedList<>();
        queue.offer(source);

        while(!queue.isEmpty()){
            char current = queue.poll();
            System.out.print(current + " ");

            for(char ch : adjList.get(current)){
                queue.offer(ch);
            }
        }
    }
     public static void main(String[] args) {

        //create the graph adjacency list
        Map<Character,List<Character>> adjList = new HashMap<>();

        adjList.put('a',List.of('b','c'));
        adjList.put('b',List.of('d'));
        adjList.put('c',List.of('e'));
        adjList.put('d',List.of('f'));
        adjList.put('e',List.of());
        adjList.put('f',List.of());

        bfsIterative(adjList, 'a');
        System.out.println();
        
    }
}

