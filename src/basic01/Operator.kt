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

    println("----------------------------");

    // 산술연산자
    val r11:Int = 10 + 3;
    val r12:Int = 10 - 3;
    val r13:Int = 10 * 3;
    var r14:Int = 10 / 3;
    val r15:Int = 10 % 3;

    println("$r11, $r12, $r13, $r14, $r15");

    val r16:IntRange = 10..20;

    println("r16 : $r16");
    // r16 : 10..20

    println("----------------------------");

    // 대입연산자
    var a11:Int = 10;
    var a12:Int = 10;
    var a13:Int = 10;
    var a14:Int = 10;
    var a15:Int = 10;

    a11 += 3;
    a12 -= 3;
    a13 *= 3;
    a14 /= 3;
    a15 %= 3;

    println("$a11, $a12, $a13, $a14, $a15");
    // 13, 7, 30, 3, 1

    println("----------------------------");

    // 비교 연산자
    val a16:Int = 10;

    val r17:Boolean = a16 == 10;
    val r18:Boolean = a16 != 10;

    println("$r17, $r18");

    // true, false

    val r19:Boolean = a16 == 20;
    val r20:Boolean = a16 != 20;

    println("$r19, $r20");
    // false, true

    println("----------------------------");

    val a17:Int = 10;
    val r21:Boolean = a17 < 20;
    val r22:Boolean = a17 > 20;
    val r23:Boolean = a17 <= 10;
    val r24:Boolean = a17 >= 10;

    println("$r21, $r22, $r23, $r24");
    // true, false, true, true

}