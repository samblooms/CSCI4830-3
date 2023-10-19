package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
      // other implementation
	  extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
      // other implementation
	  extractedMethod(edgeList, p);
      return null;
   }

   // TODO: Your answer
   // ? extractedMethod(?) {
   //
   // }
   private <T> void extractedMethod(List<T> items, String p) {
	      for(T item : items) {
	         if (item instanceof Node) {
	            Node node = (Node) item;
	            if (node.contains(p)) {
	               System.out.println(node);
	            }
	         } else if (item instanceof Edge) {
	            Edge edge = (Edge) item;
	            if (edge.contains(p)) {
	               System.out.println(edge);
	            }
	         }
	      }
   }
}

class Node {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
} 

class Edge {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}