package interface_form

fun main() {
    val stack = Stack<Int>()
    stack.push(3)
    stack.push(5)
    stack.push(7)
    stack.push(8)

    println(stack.pop())
    println(stack.pop())

    println(stack.toString())
    while(true){
        println(
            "명령어를 입력해주세요\n"+
                    "1 : push 2: pop"
        )
        val a = readLine()!!.toInt()
        when(a) {
            1-> {
                val item = readLine()!!.toInt()
                stack.push(item)
            }
            2-> stack.pop()
            3-> println(stack.toString())
            4-> return

        }
    }
}
/***
 * 1 : push
 * 2 : pop
 * 3 : print
 * clear
 * serach
 * peek
 * 4 : exit
        ***/