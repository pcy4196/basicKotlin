package basic01

class Variable {
}

fun main() {
    // 정수 리터럴
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
}