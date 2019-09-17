/*
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
package leetcodeLesson.easy;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		ListNode ln1_1 = new ListNode(1);
		ListNode ln1_2 = new ListNode(2);
		ListNode ln1_3 = new ListNode(4);
		ln1_1.next = ln1_2;
		ln1_2.next = ln1_3;
		
		ListNode ln2_1 = new ListNode(1);
		ListNode ln2_2 = new ListNode(3);
		ListNode ln2_3 = new ListNode(4);
		ln2_1.next = ln2_2;
		ln2_2.next = ln2_3;
		
		ListNode n = mergeTwoLists(ln1_1, ln2_1);
		
		while( n != null ){
			System.out.print(n.val + " ");
			n = n.next;
		}
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if( l1 == null ){
			return l2;
		}
		if( l2 == null ){
			return l1;
		}
		
		if( l1.val < l2.val ){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		}else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
		
	}
	
}


class ListNode{
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

