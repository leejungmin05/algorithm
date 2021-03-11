package set

fun main() {
    val set = Set<Int>()

    while(true) {
        println("set 인터페이스 구현")
        println("명령어를 입력하세요")
        println("1 : add  2 : clear  3 : isEmpty  4 : remove" +
                "5 : contains  6 : size  7 : print  8 : exit \n>>>")

        val a = try {readLine()!!.toInt()} catch (e : NumberFormatException) {println("숫자를 입력하세요")}

        when(a) {
            1->{
                print("set에 추가 할 숫자 입력하세요 : ")
                val e = try{
                    readLine()!!.toInt()
                } catch(e : NumberFormatException) {
                    println("숫자를 입력하세요")
                    continue
                }
                set.add(e)
                println("추가 되었습니다")

            }
            2->{
                try{
                    println("모든 요소가 삭제됩니다.")
                    set.clear()
                }catch (e:Exception) {
                    println("set 비어있습니다")
                }

            }
            3->{
                if(set.isEmpty()==true) {
                    println("set이 비어있습니다")
                } else println("set에 값이 존재합니다")
            }
            4-> {
                print("set에 삭제 할 숫자 입력하세요 : ")
                val e = try{
                    readLine()!!.toInt()
                } catch(e : NumberFormatException) {
                    println("숫자를 입력하세요")
                    continue
                }
                set.remove(e)
                println("삭제되었습니다.")
            }
            5->{
                print("확인 할 숫자 입력하세요 : ")
                val e = try{
                    readLine()!!.toInt()
                } catch(e : NumberFormatException) {
                    println("숫자를 입력하세요")
                    continue
                }
                if(set.contains(e) == true) {
                    println("set에 존재합니다")
                } else println("set에 존재하지 않습니다.")
            }
            6->{
                println("set의 사이즈는" + set.size() + " 입니다.")
            }
            7->{
                try{
                    println(set.toString())
                }catch (e:Exception) {
                    println("set이 비어있습니다")
                }
            }
            8-> return
        }
    }

}