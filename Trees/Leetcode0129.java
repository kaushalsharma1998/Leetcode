class 	Leetcodejune26 {
     public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    public int sumNumbers(TreeNode node, int sum) {
        if (node == null) return 0;
		int curr_sum = sum * 10 + node.val;
        if (node.left == null && node.right == null) return curr_sum;
        return sumNumbers(node.left, curr_sum) + sumNumbers(node.right, curr_sum);
    }}