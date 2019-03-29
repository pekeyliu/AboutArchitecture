package com.pekey.framework.Tree;

/**
 * 二叉树检索
 *
 */
public class SearchBinaryTree {
    static TreeNode node = new TreeNode(1, "H");
    static BinaryTree tree = new BinaryTree(node);

    /**
     * 按顺序插入
     */
    public static TreeNode put(TreeNode root, TreeNode node){
        if (root == null) return node;
        if (getNodeData(root, node) > 0)
            root.setLeftChild(put(root.getLeftChild(), node));
        else if (getNodeData(root, node) < 0)
            root.setRightChild(put(root.getRightChild(), node));
        return root;
    }

    /**
     * 对比两个节点的数据，node1大则应将node2置入node1的左孩子
     * @return
     */
    public static int getNodeData(TreeNode node1, TreeNode node2){
        if (node1.getData().charAt(0) > node2.getData().charAt(0)) return 1;
        else if(node1.getData().charAt(0) < node2.getData().charAt(0)) return -1;
        else return 0;
    }

    /**
     * 对比两个节点的数据，node1大则应将node2置入node1的左孩子
     * @return
     */
    public static int getNodeData(TreeNode node1, String data1){
        if (node1.getData().charAt(0) > data1.charAt(0)) return 1;
        else if(node1.getData().charAt(0) < data1.charAt(0)) return -1;
        else return 0;
    }

    /**
     * 树的查询2
     * @param node1
     * @param data1
     * @return
     */
    public static TreeNode searchTree(TreeNode node1, String data1){
//        if (node1 == null) return node1;
        if (getNodeData(node1, data1) > 0){
            return searchTree(node1.getLeftChild(), data1);
        }else if (getNodeData(node1, data1) < 0){
            return searchTree(node1.getRightChild(), data1);
        }else{
            return node1;
        }
    }

    /**
     * 树的查询
     * @param data
     * @return
     */
    public static TreeNode searchTree(String data){
        return searchTree(tree.getRoot(), data);
    }
    /**
     * 构造树
     * @return
     */
    public static TreeNode createTree(){

        put(tree.getRoot(), new TreeNode(2, "C"));
        put(tree.getRoot(), new TreeNode(5, "M"));
        put(tree.getRoot(), new TreeNode(6, "K"));
        put(tree.getRoot(), new TreeNode(7, "X"));
        put(tree.getRoot(), new TreeNode(3, "A"));
        return put(tree.getRoot(), new TreeNode(4, "B"));
    }

    public static void main(String[] args) {

        createTree();

        System.out.println("*******二叉树的查询*****************");
        System.out.println(searchTree("M"));



        System.out.println("*******(前序遍历)[ABDECF]遍历*****************");
        tree.preOrder(tree.getRoot());

        System.out.println("*******(中序遍历)[DBEACF]遍历*****************");
        tree.inOrder(tree.getRoot());

        System.out.println("*******(后序遍历)[DEBFCA]遍历*****************");
        tree.postOrder(tree.getRoot());


    }
}
