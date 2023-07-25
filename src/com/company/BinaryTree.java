package com.company;
public class BinaryTree {
    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    private Node root;

    public BinaryTree(){
        root = null;
    }

    public void insert(int data){
        root = insert(root, data);
    }

    private Node insert(Node current, int data){
        if(current == null){
            return new Node(data);
        }
        if(data<current.data){
            current.left = insert(current.left, data);
        }
        else if(data> current.data){
            current.right=insert(current.right,data);
        }
        return current;
    }

    public void remove(int data){
        root = remove(root, data);
    }

    private Node remove(Node current, int data){
        if(current == null){
            return null;
        }
        if(data<current.data){
            current.left = remove(current.left, data);
        }
        else if(data> current.data){
            current.right=remove(current.right,data);
        }
        else{
            //case 1
            if(current.left==null&&current.right==null){
                return null;
            }
            //case2
            if(current.left == null){
                return current.right;
            }
            if(current.right==null){
                return current.left;
            }
            //case 3
            int smallestValue = smallestValue(current.right);
            current.data = smallestValue;
            current.right = remove(current.right, smallestValue);
        }
        return current;
    }

    private int smallestValue(Node root){
        return root.left == null ? root.data : smallestValue(root.left);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node!=null){
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }
}

