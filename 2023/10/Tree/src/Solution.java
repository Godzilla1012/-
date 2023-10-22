class Solution {
    public treeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length == 0 || inorder.length == 0)
            return null;
        return buildHelper(inorder, 0, inorder.length, postorder, 0, postorder.length);

    }
    private treeNode buildHelper(int[] inorder, int inorderStart, int inorderEnd, int[] postorder, int postorderStart, int postorderEnd){
        if(postorderStart == postorderEnd)
            return null;
        int rootVal = postorder[postorderEnd - 1];     //根节点为后续遍历的最后一个节点
        treeNode root = new treeNode(rootVal);        //将根节点放入树
        int middleIndex;
        for (middleIndex = inorderStart; middleIndex < inorderEnd; middleIndex++){   //定义middleindex切割中序遍历数组
            if(inorder[middleIndex] == rootVal)
                break;
        }

        int leftInorderStart = inorderStart;                               //将中序遍历数组分为两份
        int leftInorderEnd = middleIndex;
        int rightInorderStart = middleIndex + 1;
        int rightInorderEnd = inorderEnd;


        int leftPostorderStart = postorderStart;
        int leftPostorderEnd = postorderStart + (middleIndex - inorderStart);          //将后续遍历数组分为两部分
        int rightPostorderStart = leftPostorderEnd;
        int rightPostorderEnd = postorderEnd - 1;
        root.left = buildHelper(inorder, leftInorderStart, leftInorderEnd,  postorder, leftPostorderStart, leftPostorderEnd);
        root.right = buildHelper(inorder, rightInorderStart, rightInorderEnd, postorder, rightPostorderStart, rightPostorderEnd);

        return root;
    }

        public void printTree(treeNode root) {
            int depth = getDepth(root);
            printHelper(root, 0, depth);
        }

        private void printHelper(treeNode node, int level, int depth) {
            if (node == null) {
                printSpaces(level);
                System.out.println("null");
                return;
            }

            printSpaces(level);
            System.out.println(node.val);

            if (level < depth - 1) {
                printHelper(node.left, level + 1, depth);
                printHelper(node.right, level + 1, depth);
            }
        }

        private void printSpaces(int count) {
            for (int i = 0; i < count; i++) {
                System.out.print("  "); // 每层缩进两个空格
            }
        }

        private int getDepth(treeNode node) {
            if (node == null) {
                return 0;
            }
            int leftDepth = getDepth(node.left);
            int rightDepth = getDepth(node.right);
            return Math.max(leftDepth, rightDepth) + 1;

    }

}