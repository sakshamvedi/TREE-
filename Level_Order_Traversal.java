static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        Queue<Node> q1 = new LinkedList<>();
        q1.add(node);
        while(!q1.isEmpty())
        {
            Node currnode = q1.poll();
            l1.add(currnode.data);
          if(currnode.left!=null)
          {
              q1.add(currnode.left);
          }
           if(currnode.right!=null)
          {
              q1.add(currnode.right);
          }
        }
        
       return l1;
       }
       }
