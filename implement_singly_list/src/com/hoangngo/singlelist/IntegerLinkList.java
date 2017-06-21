package com.hoangngo.singlelist;

public class IntegerLinkList {

	private IntegerLink head;

	private int size;

	public IntegerLinkList() {
		size = 0;
		head = null;
	}

	public int length() {
		return size;
	}

	public void add(int value) {
		IntegerLink newLink = new IntegerLink(value);
		if (head == null){
			newLink.next = head;
			head = newLink;
		}else{
			IntegerLink temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newLink;
		}
		size++;
	}

	public void removeTail() {
		if (head == null){
			System.out.println("List is empty now!");
		}else{
			IntegerLink temp1 = head;
			if (temp1.next == null){
				head = null;
			}else{
				IntegerLink temp2 = temp1;
				temp1 = temp1.next;
				while(temp1.next != null){
					temp2 = temp1;
					temp1 = temp1.next;
				}
				temp2 = null;
			}
			size--;
		}
		
	}
	
}
