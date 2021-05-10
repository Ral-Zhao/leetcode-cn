package utils;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeUtil {

    public static TreeNode buildTree(Integer... vals) {
        if (vals == null) {
            return null;
        }
        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int index = 1;
        while (index < vals.length - 1) {
            TreeNode parent = queue.poll();
            if (parent == null) {
                break;
            }
            if (vals[index] != null) {
                parent.left = new TreeNode(vals[index]);
                queue.add(parent.left);
            }
            if (vals[++index] != null) {
                parent.right = new TreeNode(vals[index]);
                queue.add(parent.right);
            }
            index++;
        }


        return root;
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    //递归实现中序遍历
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    //递归实现后序遍历
    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    public static void levelOrderPrint(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        if (root != null) {
            queue.add(root);
        }
        int limit = 1;
        int count = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            limit--;
            System.out.print(node.val + " ");
            if (node.left != null) {
                queue.add(node.left);
                count++;
            }
            if (node.right != null) {
                queue.add(node.right);
                count++;
            }
            if (limit == 0) {
                limit = count;
                count = 0;
                System.out.println();
            }
        }
    }
}
