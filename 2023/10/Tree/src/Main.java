import org.w3c.dom.ls.LSOutput;
import javax.swing.tree.TreeNode;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入中序遍历节点的个数：");
        int n1 = scanner.nextInt();
        int[] inorder = new int[n1];
        for(int i = 0;i<n1;i++)

        {
            System.out.print("请输入第 " + (i + 1) + " 个整数：");
            inorder[i] = scanner.nextInt();
        }
        System.out.println("请输入后序遍历节点的个数：");
        int n2 = scanner.nextInt();
        int[] postorder = new int[n2];
        for(int i = 0;i<n2;i++)

        {
            System.out.print("请输入第 " + (i + 1) + " 个整数：");
            postorder[i] = scanner.nextInt();
        }
        Solution s=new Solution();
        treeNode Node=new treeNode();
        Node= s.buildTree(inorder,postorder);

        s.printTree(Node);

    }
}