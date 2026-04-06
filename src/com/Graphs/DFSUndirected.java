import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DFSUndirected {
    public static void dfs(Map<Character,List<Character>> adjList, char source, Set<Character> visited){
        //correct but it calls dfs for visited nodes also and immediately returns, more recursive calls
        //if(visited.contains(source)) return;  
        
        System.out.print(source+ " ");
        visited.add(source);
        
        for(char ch : adjList.get(source)){
            //better as it only allows recursive calls for unvisited nodes
            if(!visited.contains(ch)){
                dfs(adjList,ch,visited);
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
        for (char node : adjList.keySet()) {
            if (!visited.contains(node)) {
                dfs(adjList, node, visited);
                count++;
            }
        }
        
        System.out.println("\n"+count);
    }
}
