package com.codingdojo.dll;

public class DLL {
    public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
// the push method will add a new node to the end of the list
public void push(Node newNode) {
// if there is no head in the list, aka, an empty list, we set the newNode to be the head and tail of the list
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        
        // first find the lastNode in the list
        // then, set the lastNode's next to be the newNode;
        // then, we have to set the previous of the lastNode to the lastNode that we found previously.
        // finally, set the list's tail to be the node that we have added
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    
public void printValuesForward() {
        // find the first node, also known as head.
        Node current = this.head;
        
        // while the current node exists...
        while(current != null) {
            // print it's value
            System.out.println(current.value);
            // and move on to it's next node.
            current = current.next;
        }
    }

public void printValuesBackward() {
	Node runner = this.tail;
	while(runner != null) {
		System.out.println(runner.value);
		runner = runner.previous;
	}
}

public Node pop() {
	if(this.tail == null) {
		System.out.println("No nodes!");
	}
	Node lastNode = this.tail;
	this.tail = lastNode.previous;
	return lastNode;    	
}

@SuppressWarnings("null")
public boolean contains(Integer value) {
	if(this.head == null ) {
		System.out.println("No Nodes!");
	Node runner = this.head;
	while(runner != null);
		if(runner.value == value) {
			System.out.println("Value found!");
			return true;
		}
		runner = runner.next;
	}
	System.out.println("Value not found!");
	return false;
}
	
public int size() {
	if(this.head == null);
		System.out.println("No Nodes!");
	Node runner = this.head;
	int count = 0;
	while(runner != null) {
		count ++;
		runner = runner.next;
	}
	System.out.println("A total of " + count + " nodes found!");
	return count;
}
}