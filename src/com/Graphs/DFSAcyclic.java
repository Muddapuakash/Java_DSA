/*An acyclic graph is a graph with no cycles in it.*/
/*DFS is a depth first traversal of a graph.
Its done with the help of a stack, i.e until the stack is empty we pop 1 node and add its
neighbor(s) to the stack. */
import java.util.Map;
import java.util.Stack;
import java.util.HashMap;
import java.util.List;

public class DFSAcyclic {
    public static void dfsIterative(Map<Character,List<Character>> adjList, char source){
        Stack<Character> stack = new Stack<>();
        stack.push(source);

        while(!stack.isEmpty()){
            char current = stack.pop();
            System.out.print(current + " ");
            
            for(char ch : adjList.get(current)){
                stack.push(ch);
            }
        }
    }

    /*instead of using the iteration and stack we can use the stack in recursion to make space efficent */
    public static void dfsRecursive(Map<Character, List<Character>> adjList, char source){
       
        /* no base case because we are traversing all nodes 
       but the recursion stops on if there is no edges b/w to nodes
       i.e it has no neighbours.
       */
        System.out.print(source + " ");

        for(char ch : adjList.get(source)){
            dfsRecursive(adjList, ch);
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

        dfsIterative(adjList, 'a');
        System.out.println();
        dfsRecursive(adjList, 'a');
    }
}
