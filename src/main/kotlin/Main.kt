import dsa.BinaryTree

fun main(args: Array<String>) {

    val root = BinaryTree(5)

    root.insert(root.root, 3)
    root.insert(root.root, 7)

    root.inverse(root.root)

    root.inOrder(root.root)

    val PI = 3.14F
    var num = 1
    var name = "gian"

    println(name[3])
    println(name.indexOf("ia"))

    val n = 2

    val n2 = when (n % 2) {
        0 -> "Even"
        else -> "Odd"
    }

    println(n2)

    var n3 = name.length - 1
    var temp = ""

    while (n3 >= 0) {
        temp+=name[n3]
        n3--
    }

    name = temp

    println(name)

    for (char in name) {
        println(char)
    }

    for (ite in 1..10) {
        print(ite)
    }
}