package dsa

class Node(n: Int) {
    var value: Int = n
    var left: Node? = null
    var right: Node? = null
}

class BinaryTree(n: Int) {
    var root: Node? = Node(n)

    fun insert(mRoot: Node?, num: Int): Node {
        if (mRoot == null)
            return Node(num)
        else if (num < mRoot.value)
            mRoot.left = insert(mRoot.left, num)
        else
            mRoot.right = insert(mRoot.right, num)

        return mRoot
    }

    fun inOrder(mRoot: Node?) {
        if (mRoot == null)
            return

        inOrder(mRoot.left)
        println("${mRoot.value} ")
        inOrder(mRoot.right)
    }

    fun inverse(mRoot: Node?) {
        if (mRoot == null)
            return

        val temp: Node? = mRoot.right
        mRoot.right = mRoot.left
        mRoot.left = temp
    }
}