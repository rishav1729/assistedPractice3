//●	Write a program in Java to traverse a doubly linked list in the forward and backward directions
package assistedPractice3;
	public class DoublyLinkedList {
		Node head; // head of list (first node address)

		static class Node {
			int data;
			Node next;
			Node prev;

			Node(int d) {
				prev = null;
				data = d;
				next = null;
			}
		}

		public static DoublyLinkedList insert(DoublyLinkedList list, int data) {
			
			Node new_node=new Node(data);
			if (list.head == null) {
				list.head = new_node;
			}
			else
				
				{
					Node last;
					//to move pointer to last node to insert new node
					for(last=list.head;last.next!=null;last=last.next){}
					last.next=new_node;
					new_node.prev=last;
				}
			return list;

			/*
			 * for(Node last=list.head;last.next!=null;last=last.next);
			 * last.next=new_node;
			 */

		}

		public static void printList(DoublyLinkedList list){
			System.out.print("Forward LinkedList: ");
			for(Node last=list.head;last!=null;last=last.next){
				
				System.out.print(last.data+" ");
				
			}
			System.out.println();
		}
			
		

		public static void printListReverse(DoublyLinkedList list) {
			Node last = list.head;
			System.out.print("Reverse LinkedList: ");
			// Traverse through the LinkedList and stops at end node
			for (last=list.head;last.next != null;last = last.next) {}


			for (;last != null;last = last.prev) {
				// Print the data at current node
				System.out.print(last.data + " ");
				// Go to next node
				
			}

			
		}


		// method to create a Singly linked list with n nodes
		public static void main(String[] args) {
			/* Start with the empty list. */
			DoublyLinkedList list = new DoublyLinkedList();
			// Insert the values
			list = insert(list, 1);
			list = insert(list, 2);
			list = insert(list, 3);
			list = insert(list, 4);
			list = insert(list, 5);
			list = insert(list, 6);
			list = insert(list, 7);
			list = insert(list, 8);
			// Print the LinkedList
			printList(list);
			// Print reverse LinkedList
			printListReverse(list);
		}
	}
