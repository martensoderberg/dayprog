import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

/* A Radix Tree for words or something */

public class RadixTree {
  private Node root;

  





  public int lookup(CharSequence word) {
    return lookupHelper(word, root);
  }

  private int lookupHelper(CharSequence cs, Node n) {
    if (n == null) {
      throw new IllegalStateException("This shouldn't happen!");
    }

    if (cs.length() == 0) {
      // Reached end
      return n.getValue();

    } else if (n.getEdges().size() == 0) {
      // Not reached end, no further edges exist
      throw new NoSuchElementException("Could not find " + cs);

    }
    
    // If we have not returned yet, look at further edges
    // (it's time for the recursive step)
    List<Edge> edges = n.getEdges();
    edges.stream()
      .map()

    return 0;
  }

  // Finds if an edge's chars prefixes this CharSequence
  private static Edge findEdge(CharSequence cs) {

  }

  private class Edge {
    private CharSequence chars;
    private Node next;
    
    private Edge(CharSequence chars, Node next) {
      this.chars = chars;
      this.next  = next;
    }
  }

  private class Node {
    private int value;
    private List<Edge> edges;
    
    public Node (int value, List<Edge> edges) { 
      this.value = value;
      this.edges = edges;
      if (edges == null) {
        edges = new ArrayList<Edge>();
      }
    }
    
    public int getValue() { return value; }
    public List<Edge> getEdges() { return edges; }
  }

  public class NoSuchElementException extends RuntimeException {
    public NoSuchElementException(String description) {
      super(description);
    }
  }
}