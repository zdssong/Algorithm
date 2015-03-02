package easy;

import model.ListNode;

/**
 * Write a program to find the node at which the intersection of two singly
 * linked lists begins.
 * 
 * 
 * For example, the following two linked lists:
 * 
 * A: a1 → a2 ↘ c1 → c2 → c3 ↗ B: b1 → b2 → b3 begin to intersect at node c1.
 * 
 * 
 * Notes:
 * 
 * If the two linked lists have no intersection at all, return null. The linked
 * lists must retain their original structure after the function returns. You
 * may assume there are no cycles anywhere in the entire linked structure. Your
 * code should preferably run in O(n) time and use only O(1) memory. Credits:
 * Special thanks to @stellari for adding this problem and creating all test
 * cases.
 * 
 * url:https://oj.leetcode.com/problems/intersection-of-two-linked-lists/
 */
public class IntersectionOfTwoLinkedLists {
	/**
	 * 42 / 42 test cases passed.
Status: Accepted
Runtime: 336 ms
Submitted: 0 minutes ago
*/
	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			int lengthA = 0;
			int lengthB = 0;
			ListNode tempA = headA;
			ListNode tempB = headB;
			while (tempA != null) {
				lengthA++;
				tempA = tempA.next;
			}
			while (tempB != null) {
				lengthB++;
				tempB = tempB.next;
			}
			int gap = 0;
			tempA = headA;
			tempB = headB;
			if (lengthA >= lengthB) {
				gap = lengthA - lengthB;
				for (int i = 0; i < gap; i++) {
					tempA = tempA.next;
				}
				for (int i = 0; i < lengthB; i++) {
					if (tempA.val == tempB.val)
						return tempA;
					tempA = tempA.next;
					tempB = tempB.next;
				}
			} else {
				gap = lengthB - lengthA;
				for (int i = 0; i < gap; i++) {
					tempB = tempB.next;
				}
				for (int i = 0; i < lengthA; i++) {
					if (tempA.val == tempB.val)
						return tempA;
					tempA = tempA.next;
					tempB = tempB.next;
				}
			}
			return null;
		}
	}
}
