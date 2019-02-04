public class IntLL {
    private Node head;//the head is the first node created
    private Node curr;//the current node is the current node we are looking at

    //creates a private class called Node like an index in an array but it is a custom Object
    //it can be private because we only use it with the IntLL class
    private class Node{
        //a variable data for the data the node stores
        private int data;
        //an instance variable link of type node this will give the computer the memory reference to be used later
        private Node link;
        private Node(int aData, Node aLink){
            link = aLink;
            data = aData;
        }

    }

    //a default constructor for the list itself
    public IntLL(){
        head = curr = null;
    }

    public void addNode(int aData){
        //creates a new node with a passed data and with a link that starts null
        Node newNode = new Node(aData,null);

        //the case there is no head node
        if(head == null) {
            //the new node becomes the head node
            head = newNode;
            //the head node is set to the current node
            curr = head;
            //then the method ends
            return;
        }
        // a temporary nod is made called temp and it is set to the head node
        Node temp = head;
        //while the temp's link is not null (so while it hasn't hit the end of the linked lists)
        while(temp.link != null){
            //the temp will be set to its own link
            temp = temp.link;
        }
        //the temp link is then set to the new node
        temp.link = newNode;
    }

    //counts the number of nodes in the list
    public int listNodeCount(){
        //creates a temporary node that "clones the head"
        Node temp = head;
        //a variable count to count the nodes
        int count =0;

        //while temp != null
        while(temp != null){
            temp = temp.link;
            count++;
        }

        return count;
    }
    public int returnNodeData(){
        return curr.data;
    }

    public void printNodeData(){
        if(curr!=null)
            System.out.println(curr.data);
        else
            System.out.println("The current node has no data");
    }
    public int returnCurrentNodesPosition(){
        Node temp = head;
        int count =0;
        while(temp!=curr){
            count++;
            temp = temp.link;
        }
        return count;
    }
    //sets the current node
    public void setCurrentNode(int forwardAmount) {
        //takes in the integer to set the node to
        //if the number the node is to be set to is less than the amount of nodes is the list
        if(forwardAmount<=listNodeCount()){
            //calls this method to start from the head
            moveCurrentNodeToHead();
            for(int i =0; i<forwardAmount; i++){
                //calls this method to move the node forward from its current position
                moveNodeForward();
            }
        }
        //if the node count is greater than the number of nodes in the list
        else{
            System.out.println("The requested amount exceeds the length of the nodes");
        }
    }

    //moves the current node to the head
    public void moveCurrentNodeToHead(){
        //if the head value is not null
        if(head!= null)
            //then the current is set to the value of the head node
            curr = head;
    }
    //moves the current node forward
    public void moveNodeForward(){
        if(curr.link != null)
            curr = curr.link;
    }
    public void insertAfterCurrent(int aData){
        if (curr == null) {
            System.out.println("the current node is null");
            return;
        }
        curr.link = new Node(aData, curr.link);
    }

    public void printAllNodeData(){
        //sets a node called temp equal to the head node so we start from the beginning of the list
        Node temp = head;
        ////while the temp is not null (so while it hasn't hit the end of the linked lists)
        while(temp!=null){
            //print the data in the temp node which will be the current node until we reach the last null node
            System.out.println(temp.data);
            //sets the current temp node to the next node in the list
            temp = temp.link;
        }


    }
    public int totalNodeSum(){
        Node temp = curr;

        curr = head;
        int sum =0;
        while(curr != null){
            sum += curr.data;
            curr = curr.link;
        }
        curr = temp;
        return sum;
    }








}
