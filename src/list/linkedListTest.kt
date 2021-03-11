//package list
//
//fun main() {
//    val linkedList = LinkedListNew<Int>()
//
//    while(true) {
//        println("LinkedList 인터페이스 구현")
//        println("명령어를 입력하세요")
//        println("1 : add  2 : remove   3 : get  4 : set  5: indexOf" +
//                "6 : contains  7 : size 8 : isEmpty  9 : clear 10 : print  11 : exit \n>>>")
//
//        val a = try {readLine()!!.toInt()} catch (e : NumberFormatException) {println("숫자를 입력하세요")}
//
//        when(a) {
//            1->{
//                print("LinkedList 추가 할 숫자 입력하세요 : ")
//                val e = try{
//                    readLine()!!.toInt()
//                } catch(e : NumberFormatException) {
//                    println("숫자를 입력하세요")
//                    continue
//                }
//                linkedList.add(e)
//                println(linkedList)
//
//            }
//            2->{
//                print("LinkedList 삭제 할 숫자 입력하세요 : ")
//                val e = try{
//                    readLine()!!.toInt()
//                }catch (e:Exception) {
//                    println("linkedList 비어있습니다")
//                    continue
//                }
//                linkedList.remove(e)
//                println("삭제되었습니다")
//
//            }
//            3->{
//                print("LinkedList 가져 올 숫자의 인덱스 입력하세요 : ")
//                val e = try{
//                    readLine()!!.toInt()
//                }catch(e : NumberFormatException) {
//                    println("숫자를 입력하세요")
//                    continue
//                }
//                println(linkedList.get(e))
//
//            }
//            4-> {
//                print("LinkedList set 위치의 인덱스와 값을 입력하세요 : ")
//                val e = readLine()!!.toInt()
//                val v = readLine()!!.toInt()
//                linkedList.set(e,v)
//            }
//            5->{
//                print("찾고싶은 값을 입력하세요 : ")
//                val e = try{
//                    readLine()!!.toInt()
//                }catch(e : NumberFormatException) {
//                    println("숫자를 입력하세요")
//                    continue
//                }
//
//                if(linkedList.indexOf(e) == -1) {
//                    println("존재하지 않습니다")
//                }
//                print(linkedList.indexOf(e))
//                println(" 에 있습니다")
//            }
//            6->{
//                print("확인하고 싶은 값을 입력하세요 : ")
//                val e = try{
//                    readLine()!!.toInt()
//                }catch(e : NumberFormatException) {
//                    println("숫자를 입력하세요")
//                    continue
//                }
//
//                if(linkedList.contains(e)) {
//                    println("값이 존재합니다")
//                } else {
//                    println("존재하지 않는 값입니다")
//                }
//            }
//            7->{
//                println("사이즈는 " + linkedList.size() + "입니다")
//            }
//            8->{
//                if(linkedList.isEmpty()) {
//                    println("리스트가 비어있습니다")
//                } else {
//                    println("리스트에 값이 존재합니다")
//                }
//            }
//            9-> println(linkedList.toString())
//            10-> return
//        }
//    }
//}