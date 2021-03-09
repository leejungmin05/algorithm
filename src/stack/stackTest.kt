package interface_form

import com.sun.jmx.snmp.SnmpUnsignedInt
import java.lang.Exception
import java.util.*

fun main() {
    val stack = Stack<Int>()
    stack.push(3)
    stack.push(5)
    stack.push(7)
    stack.push(8)
    stack.push(4)
    stack.push(8)
    stack.push(1)
    stack.push(6)
    stack.push(7)


//    println(stack.pop())
//    println(stack.pop())


    println(stack.toString())


    while(true){
        print(
            "\n명령어를 입력해주세요\n"+
                    "1 : push 2: pop 3: peek 4: clear 5:search 6: size 7: empty 8: print 9: exit \n >>>"
        )
        val a = try {readLine()!!.toInt()} catch (e : NumberFormatException) {println("숫자를 입력하세요")}

        when(a) {
            1-> {
                print("push 할 아이템을 입력하세요 : ")
                val item = try{
                    readLine()!!.toInt()
                } catch(e : NumberFormatException) {
                    println("숫자를 입력하세요")
                    continue
                }
                    stack.push(item)
                    println(stack.toString())
            }
            2-> {
                println("가장 위의 아이템을 제거합니다")
                try {
                    stack.pop()
                }catch (e:Exception){
                    println("스택이 비어있습니다.")
                }
            }
            3-> {
                println("stack 가장 위의 아이템입니다")
                println(stack.peek())
            }
            4-> {
                println("스택의 모든 아이템을 삭제합니다")
                stack.clear()
            }
            5-> {
                println("찾고싶은 아이템을 입력하세요")
                val item = try{ readLine()!!.toInt() } catch(e : NumberFormatException) {println("숫자를 입력하세요")}
                if(stack.search(item)==-1) {
                    println("입력하신 아이템이 없습니다")
                }else
                println(stack.search(item))
            }
            6-> println("stack의 사이즈는 " + stack.size() + "입니다")
            7-> println(stack.empty())
            8-> if(stack.empty()) println("stack이 비어있습니다")
                else println(stack.toString())

            9-> return

        }
    }
}
