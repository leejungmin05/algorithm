package list

fun main() {
    val list = List_new<Int>(10)
    list.add(0, 3)
    list.add(1, 1)
    list.add(2, 5)
    list.add(3, 1)
    list.add(4, 8)
    list.add(5, 11)
    list.add(6, 16)
    list.add(7, 4)
    list.add(8, 45)

    println(list.toString())

    while (true) {
        println("List 인터페이스 구현")
        println("명령어를 입력하시오")
        println(
            "1: add  2: remove  3: set  4: get  5: contains  6: index of  7: size" +
                    " 8: clear 9: print  10: exit  "
        )
        println(">>>")

        val a = try {
            readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            println("숫자를 입력하시오")
        }

        when (a) {
            1 -> {
                println("추가 하고싶은 곳의 인덱스와 원소를 입력하세요")
                val idx = try {
                    (readLine() ?: "").toInt()
                } catch (e: Exception) {
                    println("정수만넣으셈!! 뺴애애액!")
                    continue
                }
                val value = readLine()!!.toInt()
                list.add(idx, value)
                println("추가되었습니다")
            }
            2 -> {
                println("제거하고 싶은 요소의 인덱스를 입력하세요")
                val idx = readLine()!!.toInt()
                list.remove(idx)
                println("삭제되었습니다")
            }
            3 -> {
                println("넣고 싶은 위치와 요소를 입력하세요")
                val idx = readLine()!!.toInt()
                val value = readLine()!!.toInt()
                list.set(idx, value)
                println("완료되었습니다")
            }
            4 -> {
                println("인덱스를 입력하세요")
                val idx = readLine()!!.toInt()
                println(list.get(idx))
                println("완료되었습니다")

            }
            5 -> {
                println("찾고싶은 요소를 입력하세요")
                val value = readLine()!!.toInt()
                if (list.contains(value)) {
                    println("리스트에 존재합니다")
                } else {
                    println("존재하지 않는 요소입니다")
                }

            }
            6 -> {
                println("찾고싶은 요소를 입력하세요")
                val value = readLine()!!.toInt()
                val result = list.indexOf(value)
                if (result == -1) {
                    println("리스트에 존재하지 않습니다")
                }
                println(result)
            }
            7 -> {
                println("리스트 사이즈는 " + list.size() + "입니다")
            }
            8 -> {
                println("모든 요소가 삭제됩니다")
                list.clear()
            }
            9 -> println(list.toString())

            10 -> return
        }

    }
}
