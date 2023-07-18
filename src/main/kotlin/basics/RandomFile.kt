package basics

import dsa.BinaryTree

class RandomFile {

    fun randomS() {
        val root = BinaryTree(5)

        root.insert(root.root, 3)
        root.insert(root.root, 7)

        root.inverse(root.root)

        root.inOrder(root.root)

        val pi = 3.14F
        var name = "gian"

        println(pi * pi)
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

        val arr = arrayOf(1, 2, 3, 4, 5)

        arr[0] = 0

        println()

        for (i in arr) {
            println(i)
        }

        val list = ArrayList<Int>()

        list.add(5)
        list.add(4)

        for (i in list) {
            println(i)
        }

        val map = HashMap<String, Int>()

        map["gian"] = 2
        map["kianna"] = 3

        for (key in map.keys) {
            println(map[key])
        }
    }
}