import java.util.*;

class GList<T>{
    class IntNode {
        public T item;
        public IntNode next;
        private IntNode(T i, IntNode n)
        {
            item = i;
            next = n;
        }
    }
    private IntNode first;
    public GList(T x)
    {
        first = new IntNode(x, null);
    }
    public void addFirst(T x)
    {
        first = new IntNode(x, first);
    }
}

