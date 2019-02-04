public class Main {

    public static void main(String [] args){

        IntLL intLL = new IntLL();


        for(int i = 0; i < 10; i++){
            intLL.addNode(i);
        }
        //prints the data in all of the nodes in the list
        intLL.printAllNodeData();

        //gives a count of how many nodes are in the list
        System.out.println("this is the node count: "+intLL.listNodeCount());
        //returns node data of current node
        System.out.println("this is the current node's data: "+intLL.returnNodeData());


        //sets the current node to an invalid value
        intLL.setCurrentNode(109);
        // sets the current node to the final value
        //which gives us some errors because its link is null
        intLL.setCurrentNode(10);
        System.out.println("this is the current node's data: "+intLL.returnNodeData());
        intLL.moveNodeForward();
        intLL.printNodeData();


        intLL.setCurrentNode(9);
        System.out.println("The node that is currently being looked at is : " + intLL.returnCurrentNodesPosition());
        intLL.insertAfterCurrent(885);
        intLL.printAllNodeData();

        intLL.moveCurrentNodeToHead();
        System.out.println("The node that is currently being looked at is : " + intLL.returnCurrentNodesPosition());

        System.out.println("This is the total of all of the nodes: " + intLL.totalNodeSum());




    }

}
