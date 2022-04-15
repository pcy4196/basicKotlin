package basic01

class Operator {
}

fun main() {
    // 단항 연산자 : 항이 하나인 연산자
    // + 양수 -> 음수, 음수 -> 음수
    val a1:Int = 10;
    val a2:Int = -10;

    val r1:Int = +a1;
    val r2:Int = +a2;

    println("a1 : $a1, r1 : $r1");
    println("a2 : $a2, r2 : $r2");

    // - : 양수 -> 음수, 음수 -> 양수
    val a3:Int = 10;
    val a4:Int = -10;

    val r3:Int = +a3;
    val r4:Int = +a4;

    println("a3 : $a3, r3 : $r3");
    println("a4 : $a4, r4 : $r4");

    // ! : true -> false, false -> true
    val a5:Boolean = true;
    val a6:Boolean = false;

    val r5:Boolean = !a5;
    val r6:Boolean = !a6;

    println("a5 : $a5, r5 : $r5");
    println("a6 : $a6, r6 : $r6");

    println("------------------------------------");

    var a7:Int = 10;
    var a8:Int = 10;

    val r7:Int = a7++;
    val r8:Int = a8--;

    /*
    a7 : 11, r7 : 10
    a8 : 9, r8 : 10
     */
    // 후위 연산자일 경우 변수에 원래값 입력하고 연산작업
    println("a7 : $a7, r7 : $r7");
    println("a8 : $a8, r8 : $r8");

    var a9:Int = 10;
    var a10:Int = 10;

    val r9:Int = ++a9;
    val r10:Int = --a10;

    /*
    a9 : 11, r9 : 11
    a10 : 9, r10 : 9
     */
    // 전위 연산자일 경우 연산작업 이후 변수에 갑 대입
    println("a9 : $a9, r9 : $r9");
    println("a10 : $a10, r10 : $r10");
}