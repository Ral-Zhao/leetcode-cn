package utils;

import common.Node;
import common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
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
        while (index < vals.length) {
            TreeNode parent = queue.poll();
            if (parent == null) {
                break;
            }
            if (vals[index] != null) {
                parent.left = new TreeNode(vals[index]);
                queue.add(parent.left);
            }
            index++;
            if (index < vals.length && vals[index] != null) {
                parent.right = new TreeNode(vals[index]);
                queue.add(parent.right);
            }
            index++;
        }


        return root;
    }

    public static void printTree(TreeNode root) {
        System.out.println(serialize(root));
    }

    public static String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        TreeNode unused = new TreeNode();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int num = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (size == num) {
                break;
            }
            num = 0;
            for (int i = 0; i < size; i++) {
                root = queue.poll();
                if (root == unused) {
                    sb.append("null").append(",");
                    continue;
                }
                sb.append(root.val).append(",");
                if (root.left != null) {
                    queue.add(root.left);
                } else {
                    queue.add(unused);
                    num++;
                }
                if (root.right != null) {
                    queue.add(root.right);
                } else {
                    queue.add(unused);
                    num++;
                }

            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    public static Node buildNTree(Integer... vals) {
        if (vals == null) {
            return null;
        }
        Node root = new Node(vals[0]);
        if (vals.length < 3) {
            return root;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty()) {
            Node parent = queue.poll();
            List<Node> childs = new ArrayList<>();
            parent.children = childs;
            while (++index < vals.length && vals[index] != null) {
                Node node = new Node(vals[index]);
                childs.add(node);
                queue.add(node);
            }
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
