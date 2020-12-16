package com.company;

public class Tree {
    private Node root;

    public void insert(int value)
    {
        if(root==null) root = new Node(value);

        else root.insert(value);
    }

    public void traverseInOrder()
    {
        if(root!= null)
        {
            root.traverseInOrder();
        }
    }

    public void traverseInOrderDescending()
    {
        if(root!= null)
        {
            root.traverseInOrderDescending();
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }

    public Node getMin()
    {
        if (root != null)
        {
            if(root.getLeftChild()==null) return root;
            return root.getMin();
        }
        return null;
    }

    public Node getMax()
    {
        if (root != null)
        {
            if(root.getRightChild()==null) return root;
            return root.getMax();
        }
        return null;

    }
}
