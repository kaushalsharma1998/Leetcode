package Trees;

import java.util.ArrayList;
import java.util.List;


import LeetcodeMAYchallenge.Leetcodemay07.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Leetcode863 {
	 public List<Integer> ans=new ArrayList<Integer>();
	 public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
		kAway01(root, target.val, K);
		return ans;
	        
	    }
	 public static ArrayList<TreeNode> nodeToRootPath(TreeNode node, int data)
		{
			if (node==null)
			{ 
				ArrayList<TreeNode>base=new ArrayList<TreeNode>();
			
				return base; 
			}
			if(node.val==data)
			{
				ArrayList<TreeNode>base=new ArrayList<TreeNode>();
				base.add(node);
				return base;
			}
			ArrayList<TreeNode>left=nodeToRootPath(node.left,data);
			if(left.size()!=0)
			{
				left.add(node);
				return left;
			}
			ArrayList<TreeNode>right=nodeToRootPath(node.right,data);
			if(right.size()!=0)
			{
				right.add(node);
				return right;
			}
			return new ArrayList<TreeNode>();
			
		}
		public   void kDown(TreeNode node,TreeNode pnode, int level)
		{
			if(node==null||node==pnode)
				return;
			if(level==0)
			{	  ans.add(node.val);
				return;
			}
			kDown(node.left,pnode, level-1);
			kDown(node.right, pnode,level-1);
		}
		
		public void kAway01(TreeNode node,int data,int k)
		{ 	TreeNode pnode=null;
			ArrayList<TreeNode>list=nodeToRootPath(node, data);
			for(int i=0;i<list.size();i++)
			{
				kDown(list.get(i), pnode, k-i);
				pnode=list.get(i);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
