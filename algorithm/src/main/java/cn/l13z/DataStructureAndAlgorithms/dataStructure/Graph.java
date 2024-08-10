package cn.l13z.DataStructureAndAlgorithms.dataStructure;

import java.util.ArrayList;
import java.util.List;

// 节点
class Vertex {
    int id;
    Vertex[] neighbors;
}

// public class Graph {
// Vertex startNode;
// }

// class GraphMatrix {
// boolean[][] matrix;
// }

// 邻接表
class Edge {
    int to;
    int weight;
}

// List<Edge>[] graph;
/**
 * Grap inetrface of General method
 */
interface IGraph {

    void addEdge(int from, int to, int weight);

    void removeEdge(int from, int to);

    boolean hasEdge(int from, int to);

    List<Edge> neighbors(int v);

    int size();
}

class WeightedDigraph {
    public static class Edge {
        int to;
        int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    // 邻接表存储邻居节点
    private List<Edge>[] graph;

    @SuppressWarnings("unchecked")
    public WeightedDigraph(int n) {
        graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

    }

    public void addEdge(int from, int to, int weight) {
        graph[from].add(new Edge(to, weight));
    }

    public void removeEdge(int from, int to) {
        for (int i = 0; i < graph[from].size(); i++) {
            if (graph[from].get(i).to == to) {
                graph[from].remove(i);
                break;
            }
        }
    }

    // 查，判断两个节点是否相邻，复杂度 O(V)
    public boolean hasEdge(int from, int to) {
        for (Edge e : graph[from]) {
            if (e.to == to) {
                return true;
            }
        }
        return false;
    }

    public List<Edge> neighbors(int v) {
        return graph[v];
    }
}

// BFS/DFS 同Tree
