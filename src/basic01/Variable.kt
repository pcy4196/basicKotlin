package basic01

class Variable {
}

fun main() {
    // 1. 정수 리터럴
    println(100);
    println(1000000000000000000);
    println(1000000000000000000L);
    println(938_492_934_823);
    /*
    -- JAVA 변환
    byte var0 = 100;
    System.out.println(var0);
    long var3 = 1000000000000000000L;
    System.out.println(var3);
    var3 = 1000000000000000000L;
    System.out.println(var3);
    var3 = 938492934823L;
    System.out.println(var3);
     */

    // 실수 리터럴
    println(11.11);
    println(22.22F);
    /*
    -- JAVA 변환
    double var4 = 11.11D;
    System.out.println(var4);
    float var5 = 22.22F;
    System.out.println(var5);
     */

    // 문자 리터럴
    println('A');
    println('가');

    // 문자열 리터럴
    println("문자");

    // 논리 리터럴
    println(true);
    println(false);
    /*
    -- JAVA 변환
    var0 = 'A';
    System.out.println(var0);
    char var6 = '가';
    System.out.println(var6);
    String var7 = "문자";
    System.out.println(var7);
    boolean var8 = true;
    System.out.println(var8);
    var8 = false;
    System.out.println(var8);
     */

    // Raw String
    println("동해물과 백두산이\n마르고 닳도록\n하느님이 보우하사\n우리나라 만세");
    println("""동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |n우리나라 만세""".trimMargin());
    /*
    -- JAVA 변환
    var7 = "동해물과 백두산이\n마르고 닳도록\n하느님이 보우하사\n우리나라 만세";
    var1 = false;
    System.out.println(var7);
    var7 = "동해물과 백두산이\n마르고 닳도록\n하느님이 보우하사\nn우리나라 만세";
    var1 = false;
    System.out.println(var7);
     */

    println("-------------------------------------------------");

    // 2.변수
    val a1:Int = 100;
    println("a1 : ${a1}");
    println("a1 : $a1");    // 변수만 {} 생략가능

    // 변수 선언 자료형을 생략하면 저장하는 값에 따라 자동으로 결정된다.
    val a2 = 100;           // 자료형 생략 가능
    println("a2 : ${a2}");
    /*
    --JAVA 변환
    a1 = 'd'
    int a2 = 100;
     */

    var a3:Int = 100;
    val a4:Int = 100;

    println("a3 : ${a3}");
    println("a4 : ${a4}");

    a3 = 200;
//    a4 = 200; // 오류 발생 -- val 변수는 값을 다시 저장하지 못한다.
    println("a3 : ${a3}");
    /*
    -- JAVA 변환
    int a3 = 100;
    int a4 = 100;
    String var4 = "a3 : " + a3;
    System.out.println(var4);
    var4 = "a4 : " + a4;
    System.out.println(var4);
    int a3 = 200;
    var4 = "a3 : " + a3;
    System.out.println(var4);
     */

    println("-------------------------------------------------");

    // 3. null 허용 변수
    var a5:Int = 100; // null 선언 불가
    var a6:Int? = null;

    println("a5 : ${a5}");
    println("a6 : ${a6}");

    var a7:Int? = a5;
    println("a7 : ${a7}");

//    var a8:Int = a6; // 오류 발생
    var a8:Int = a6!!; // !! --> null 허용하지 않는 변수로 변환
    println("a8 : ${a8}");
    /*
    Exception in thread "main" java.lang.NullPointerException
        at basic01.VariableKt.main(Variable.kt:126)
        at basic01.VariableKt.main(Variable.kt)
     */
    /*
    -- JAVA 변환
    int a5 = 100;
    Integer a6 = (Integer)null;
    String var6 = "a5 : " + a5;
    System.out.println(var6);
    var6 = "a6 : " + a6;
    System.out.println(var6);
    Integer a7 = Integer.valueOf(a5);
    String var25 = "a7 : " + a7;
    System.out.println(var25);
    Intrinsics.checkNotNull(a6);
    int a8 = a6;
    String var27 = "a8 : " + a8;
    System.out.println(var27);
     */
}