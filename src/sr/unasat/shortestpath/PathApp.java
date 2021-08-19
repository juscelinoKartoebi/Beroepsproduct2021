package sr.unasat.shortestpath;

class PathApp {
    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex("Paramaribo");         // 0 (start)
        theGraph.addVertex("Port of Spain");      // 1
        theGraph.addVertex("Caracas");            // 2
        theGraph.addVertex("Oranjestad");         // 3
        theGraph.addVertex("Kingston");           // 4
        theGraph.addVertex("San Juan");           //5
        theGraph.addVertex("Saint John's");       //6
        theGraph.addVertex("Bridgetown");         //7

        theGraph.addEdge(0, 1, 400);
        theGraph.addEdge(0, 7, 700);
        theGraph.addEdge(1, 2, 500);
        theGraph.addEdge(1, 7, 200);
        theGraph.addEdge(2, 3, 200);
        theGraph.addEdge(3, 4, 400);
        theGraph.addEdge(3, 5, 600);
        theGraph.addEdge(5, 4, 700);
        theGraph.addEdge(6, 5, 200);
        theGraph.addEdge(7, 6, 400);
        theGraph.addEdge(7, 3, 300);

        System.out.println("Shortest paths");
        theGraph.path();
        // shortest paths
        System.out.println();
    } // end main()
} // end class PathApp

