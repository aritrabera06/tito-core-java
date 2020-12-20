package org.datastructure;

public class SinglyLinkedList {

	Node head; // head of list

	/* Linked list Node */
	static class Node {
		int data;
		Node next;

		// Constructor to create a new node. Next is by default initialized as null.
		Node(int d) {
			data = d;
			next = null;
		}
	}

	// method insert a new node at the end.
	public static SinglyLinkedList insert(SinglyLinkedList singlyLinkedList, int data) {

		// Create a new node with given data
		Node newNode = new Node(data);
		newNode.next = null;

		// If the Linked List is empty, then make the new node as head
		if (singlyLinkedList.head == null) {
			singlyLinkedList.head = newNode;
		} else {
			// Else traverse till the last node and insert the new_node there
			Node last = singlyLinkedList.head;
			while (last.next != null) {
				last = last.next;
			}
			// Insert the new_node at last node
			last.next = newNode;
		}
		// Return the list by head
		return singlyLinkedList;

	} // End of insert

	// Method to print the LinkedList.
	public static void displayList(SinglyLinkedList singlyLinkedList) {
		Node currentNode = singlyLinkedList.head;
		System.out.print("LinkedList: ");
		// Traverse through the LinkedList
		int nodeIndex = 1;
		while (currentNode != null) {
			// Print the data at current node
			System.out.print("[Node" + nodeIndex + "-Data(" + currentNode.data + ")] --> ");
			nodeIndex++;
			// Go to next node
			currentNode = currentNode.next;
		}
		System.out.println("");
	}

	// **************DELETION BY KEY**************
	public static SinglyLinkedList deleteByKey(SinglyLinkedList singlyLinkedList, int key) {
		// Store head node
		Node currNode = singlyLinkedList.head, prev = null;

		// CASE 1: If head node itself holds the key to be deleted
		if (currNode != null && currNode.data == key) {
			singlyLinkedList.head = currNode.next;
			System.out.println(key + " found and deleted");
			return singlyLinkedList;
		}

		// CASE 2: If the key is somewhere other than at head
		// Search for the key to be deleted, keep track of the previous node as it is
		// needed to change currNode.next
		while (currNode != null && currNode.data != key) {
			// If currNode does not hold key continue to next node
			prev = currNode;
			currNode = currNode.next;
		}
		// If the key was present, it should be at currNode Therefore the currNode shall
		// not be null
		if (currNode != null) {
			// Since the key is at currNode Unlink currNode from linked list
			prev.next = currNode.next;
			System.out.println(key + " found and deleted");
		}

		// CASE 3: The key is not present
		if (currNode == null) {
			// Display the message
			System.out.println(key + " not found");
		}

		return singlyLinkedList;
	}

	public static void main(String[] args) {
		/* Start with the empty list. */
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		// inserting
		singlyLinkedList = SinglyLinkedList.insert(singlyLinkedList, 100);
		singlyLinkedList = SinglyLinkedList.insert(singlyLinkedList, 200);
		singlyLinkedList = SinglyLinkedList.insert(singlyLinkedList, -300);
		singlyLinkedList = SinglyLinkedList.insert(singlyLinkedList, -800);
		singlyLinkedList = SinglyLinkedList.insert(singlyLinkedList, 450);
		singlyLinkedList = SinglyLinkedList.insert(singlyLinkedList, -5);
		SinglyLinkedList.displayList(singlyLinkedList);
		
		
		// In this case the key is ***at head*** 
        deleteByKey(singlyLinkedList, 100); 
        SinglyLinkedList.displayList(singlyLinkedList);
        
       // In this case the key is present ***in the middle*** 
        deleteByKey(singlyLinkedList, -300); 
  
        // Print the LinkedList 
        SinglyLinkedList.displayList(singlyLinkedList);
        
        // In this case the key is ***not present*** 
        deleteByKey(singlyLinkedList, 10); 
  
        // Print the LinkedList 
        SinglyLinkedList.displayList(singlyLinkedList); 
	}
}
