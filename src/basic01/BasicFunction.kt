package basic01

class BasicFunction {
}

fun main() {
    test1();

    println("----------------------------------");

    test2(200, 66.66);
    test2(a2=77.77, a1=300);
    /*
    test2가 호출되었습니다
    a1 : 300
    a2 : 77.77
     */

    println("----------------------------------");
    test3(100);
    test3(a2 = 66.66);
    /*
    test3이 호출되었습니다
    a1 : 100
    a2 : 0.0
    test3이 호출되었습니다
    a1 : 0
    a2 : 66.66
     */

    println("----------------------------------");
    val a2 = test4(1000, 2000);
    println("a2 : $a2");
    /*
    test4가 호출되었습니다
    a2 : 3000
     */

    println("----------------------------------");
    test5(100, 100);
    /*
    test5가 호출되었습니다
     */

    println("----------------------------------");
    test6();
    test6(100);
    /*
    test7이 호출되었습니다 - 매개변수 없음
    test7이 호출되었습니다 - 정수형 매개변수 : 100
     */

    println("----------------------------------");
    test7();
    /*
    test7 함수 호출
    test8 함수 호출
     */
}

// 기본 함수
fun test1() {
    println("test1 함수 호출");
}
/*
public static final void test1() {
  String var0 = "test1 함수 호출";
  System.out.println(var0);
}
*/

// 매개변수가 있는 함수
fun test2(a1:Int, a2:Double){
    println("test2가 호출되었습니다")
    println("a1 : $a1")
    println("a2 : $a2")
}
/*
public static final void test2(int a1, double a2) {
    String var3 = "test2가 호출되었습니다";
    System.out.println(var3);
    var3 = "a1 : " + a1;
    System.out.println(var3);
    var3 = "a2 : " + a2;
    System.out.println(var3);
}
*/

// 기본 값이 설정된 매개변수
fun test3(a1:Int=0, a2:Double=0.0){
    println("test3이 호출되었습니다");
    println("a1 : $a1");
    println("a2 : $a2");
}

// 함수에서 반환할 값이 있다면 return 문을 통해 반환한다
fun test4(a1:Int, a2:Int) : Int {
    println("test4가 호출되었습니다");
    return a1 + a2;
}

// 반환 타입이 없는 함수
// - 반환할 값이 없으면 반환 타입을 Unit로 지정한다.
// - Unit는 생략이 가능하다.
fun test5(a1:Int, a2:Int) : Unit {
    println("test5가 호출되었습니다");
}

// 함수의 오버로딩
// - 매개 변수의 형태를 다르게 하여 같은 이름으로 여러 함수를 정의하는 개념
fun test6(){
    println("test6이 호출되었습니다 - 매개변수 없음");
}

fun test6(a1:Int) {
    println("test6이 호출되었습니다 - 정수형 매개변수 : $a1");
}

// 지역 함수
// - 함수 내에 정의한 함수
// - 함수를 정의한 함수 안에서만 호출이 가능
fun test7() {
    println("test7 함수 호출");

    fun test8() {
        print("test8 함수 호출");
    }

    test8();
}