# 算法综述

## 存储方式
 - 数组(顺序存储)
 - 链表(链式存储)
 
## 基本数据结构
 - 队列
   - ...
 - 栈
 - 哈希表
 - 树
  - ... 
 - 堆
 - 跳表
 - 字符串

## 基本操作
遍历 + 访问 -> 增删改查 -> 线性的和非线性

线性：
`    void traverse(int[] arr){
        for (int i = 0; i < arr.length; i++){}
}`
迭代递归：
 单链表
`void traverse(ListNode head) {
    for (ListNode p = head; p != null; p = p.next) {
    // 迭代访问 p.val
}
}`

`void traverse(ListNode head) {
    // 递归访问 head.val
    traverse(head.next);
}`
  二叉树：
`/* 基本的二叉树节点 */
class TreeNode {
int val;
TreeNode left, right;
}`
`
void traverse(TreeNode root) {
traverse(root.left);
traverse(root.right);
}`

多查树：
`   class TreeNode{
        int val;
        reeNode[] children;
}
``
void traverse(TreeNode root){
    for (TreeNode child : root.children){
        traverse(child);
}`