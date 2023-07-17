import dsa.BinaryTree

fun main(args: Array<String>) {

    val root = BinaryTree(5)

    root.insert(root.root, 3)
    root.insert(root.root, 7)

    root.inverse(root.root)

    root.inOrder(root.root)
}