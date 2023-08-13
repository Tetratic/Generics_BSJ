package main;
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

		GenericLinkedList<Integer> gListI = new GenericLinkedList<Integer>();
		GenericLinkedList<Double> gListD = new GenericLinkedList<Double>();
		GenericLinkedList<String> gListS = new GenericLinkedList<String>();
		
		GenericNode<Integer> aNodeI=new GenericNode<Integer>();
		aNodeI.setData(2);
		gListI.addNode(aNodeI);
		aNodeI = new GenericNode<Integer>();
		aNodeI.setData(1);
		gListI.addNode(aNodeI);
		
		GenericNode<Integer> tempnodeI=gListI.getList();
		do 
		{
			System.out.println(tempnodeI.getData());
			tempnodeI=tempnodeI.getNextNode();
		} while (tempnodeI!=null);
		
		
		
		GenericNode<Double> aNodeD=new GenericNode<Double>();
		aNodeD.setData(2.5);
		gListD.addNode(aNodeD);
		aNodeD = new GenericNode<Double>();
		aNodeD.setData(16.8485);
		gListD.addNode(aNodeD);
		
		GenericNode<Double> tempnodeD=gListD.getList();
		do 
		{
			System.out.println(tempnodeD.getData());
			tempnodeD=tempnodeD.getNextNode();
		} while (tempnodeD!=null);
		
		
		
		GenericNode<String> aNodeS=new GenericNode<String>();
		aNodeS.setData("Element 1");
		gListS.addNode(aNodeS);
		aNodeS = new GenericNode<String>();
		aNodeS.setData("Element 2");
		gListS.addNode(aNodeS);
		
		GenericNode<String> tempnodeS=gListS.getList();
		do 
		{
			System.out.println(tempnodeS.getData());
			tempnodeS=tempnodeS.getNextNode();
		} while (tempnodeS!=null);
		
	}//end main

}//end class
