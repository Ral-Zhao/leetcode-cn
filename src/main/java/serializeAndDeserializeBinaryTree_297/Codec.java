package serializeAndDeserializeBinaryTree_297;

import common.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
 * <p>
 * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 * <p>
 * 提示: 输入输出格式与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方法解决这个问题。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,2,3,null,null,4,5]
 * 输出：[1,2,3,null,null,4,5]
 * 示例 2：
 * <p>
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：root = [1]
 * 输出：[1]
 * 示例 4：
 * <p>
 * 输入：root = [1,2]
 * 输出：[1,2]
 *  
 * <p>
 * 提示：
 * <p>
 * 树中结点数在范围 [0, 104] 内
 * -1000 <= Node.val <= 1000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Codec {

    public String serialize(TreeNode root) {
        if (root==null){
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

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null) {
            return null;
        }
        data = data.replace("[", "");
        data = data.replace("]", "");
        if (data.equals("")) {
            return null;
        }
        String[] vals = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int index = 1;
        while (index < vals.length) {
            TreeNode parent = queue.poll();
            if (parent == null) {
                break;
            }
            if (!vals[index].equals("null")) {
                parent.left = new TreeNode(Integer.parseInt(vals[index]));
                queue.add(parent.left);
            }
            index++;
            if (index < vals.length && !vals[index].equals("null")) {
                parent.right = new TreeNode(Integer.parseInt(vals[index]));
                queue.add(parent.right);
            }
            index++;
        }


        return root;
    }
}
