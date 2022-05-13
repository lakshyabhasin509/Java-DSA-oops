package com.leetcode

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
    public TreeNode sortedArrayToBST(int[] nums) {
        return  kindaBinarySearchApproach(nums,0,nums.length-1);
    }
    public TreeNode kindaBinarySearchApproach(int[]nums,int start,int end){
        if(start>end)return null;
        int mid=(start+end)/2;
        
        TreeNode root=new TreeNode(nums[mid]);
        
        root.left= kindaBinarySearchApproach(nums,start,mid-1);
        root.right= kindaBinarySearchApproach(nums,mid+1,end);
        
        return root;
    }
}