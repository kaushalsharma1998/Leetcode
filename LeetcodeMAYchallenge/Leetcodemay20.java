package LeetcodeMAYchallenge;

import java.util.PriorityQueue;

import LeetcodeMAYchallenge.Leetcodemay07.TreeNode;

public class Leetcodemay20 {

	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	class Solution {
	    PriorityQueue<Integer>pq=new PriorityQueue<>();
	    public int kthSmallest(TreeNode root, int k) {
	     
	            
	   traverse(root);
	        while(k-->1)
	            pq.remove();
	        return pq.peek();
	   
	    }
	    public void traverse (TreeNode node)
	    {
	        if(node==null)
	            return ;
	        pq.add(node.val);
	        traverse(node.left);
	        traverse(node.right);
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
