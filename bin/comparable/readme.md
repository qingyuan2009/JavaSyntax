# 涓轰綍闇�瑕佸疄鐜癈omparable鎺ュ彛

鎴戜滑鐭ラ亾Collections绫讳腑鍖呭惈寰堝瀵瑰疄鐜癈ollection鎺ュ彛鐨勫鍣ㄥ悇绉嶆搷浣滅殑闈欐�佹柟娉�.

褰撶劧, 鍏朵腑鏈�闀跨敤鐨勮帿杩囦簬鎺掑簭浜�(Collections.sort(List l).

涓嬮潰鏄�1涓畝鍗曚緥瀛�:

public class Compare1{
    public static void f(){
        ArrayList arr = new ArrayList();
        arr.add(10);
        arr.add(23);
        arr.add(7);
 
        System.out.println(arr);
 
        Collections.sort(arr);
        
        System.out.println(arr);
    } 
}

閫昏緫寰堢畝鍗�, 灏辨槸鍦�1涓猯ist瀹瑰櫒涓坊鍔�3涓猧nt鏁板��(娉ㄦ剰瀹為檯琚嚜鍔ㄨ绠辨垚Integer瀵硅薄).
姝ｅ父杈撳嚭瀹瑰櫒鍏冪礌涓�娆�, 鍒╃敤Collections.sort()鏂规硶鎺掑簭鍚�, 鍐嶈緭鍑�1娆�.


杈撳嚭:

   [java] [10, 23, 7]
   [java] [7, 10, 23]


浣嗘槸褰揕ist瀹瑰櫒娣诲姞鐨勫厓绱犲璞℃槸灞炰簬鑷繁鍐欑殑绫绘椂, 灏卞彲鑳藉嚭闂浜�.

渚嬪瓙:

import java.util.ArrayList;
import java.util.Collections;
 
class Student{
    private String name;
    private int ranking;
 
    public Student(String name, int ranking){
        this.name = name;
        this.ranking = ranking;
    } 
 
    public String toString(){
        return this.name + ":" + this.ranking;
    }
}
 
public class Compare2{
    public static void f(){
        ArrayList arr = new ArrayList();
        arr.add(new Student("Jack",10));
        arr.add(new Student("Bill",23));
        arr.add(new Student("Rudy",7)); 
        System.out.println(arr);
    } 
}

涓婇潰瀹氫箟浜�1涓猄tudent绫�, 瀹冨彧鏈変袱涓垚鍛�, 鍚嶅瓧鍜屾帓鍚�.
鍦╢()鏂规硶鍐�, 娣诲姞3涓猄tudent鐨勫璞″埌1涓猯ist瀹瑰櫒涓�, 鐒跺悗杈撳嚭(蹇呴』閲嶅啓String鏂规硶, 杩欓噷涓嶈В閲婁簡):

[java] [Jack:10, Bill:23, Rudy:7]

鍒版涓烘, 鏄病鏈夐棶棰樼殑. 聽浣嗘槸褰撴垜瀵硅繖涓鍣ㄨ繘琛屾帓搴忔椂灏辨湁闂浜�.

渚嬪灏嗕笂闈㈢殑f()鏂规硶鏀规垚:

public class Compare2{
    public static void f(){
        ArrayList arr = new ArrayList();
        arr.add(new Student("Jack",10));
        arr.add(new Student("Bill",23));
        arr.add(new Student("Rudy",7));
 
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    } 
}

缂栬瘧鏃跺氨浼氬嚭閿�:
 [java] Caused by: java.lang.ClassCastException: Collection_kng.Comparable_kng.Student cannot be cast to java.lang.Comparable

鎻愮ず杩欎釜绫籗tudent娌℃湁瀹炵幇Comparable鎺ュ彛.
鍘熷洜涔熷緢绠�鍗�, 鍥犱负Java涓嶇煡閬撳簲璇ユ�庢牱涓篠tudent瀵硅薄鎺掑簭, 鏄簲璇ユ寜鍚嶅瓧鎺掑簭? 杩樻槸鎸塺anking鏉ユ帓搴�?


涓轰粈涔堟湰鏂囩1涓緥瀛愬氨鎺掑簭鎴愬姛? 鏄洜涓篔ava鏈韩鎻愪緵鐨勭被Integer宸茬粡瀹炵幇浜咰omparable鎺ュ彛. 涔熻〃鏄嶪nteger杩欎釜绫荤殑瀵硅薄鏄彲浠ユ瘮杈冪殑.


鑰孲tudent绫荤殑瀵硅薄榛樿鏄笉鍙互姣旇緝鐨�. 聽闄ら潪瀹冨疄鐜颁簡Comparable鎺ュ彛.


鎬昏�岃█涔�, 聽濡傛灉浣犳兂1涓被鐨勫璞℃敮鎸佹瘮杈�(鎺掑簭), 灏卞繀椤诲疄鐜癈omparable鎺ュ彛.


# Comparable鎺ュ彛绠�浠�.

Comparable 鎺ュ彛鍐呴儴鍙湁1涓閲嶅啓鐨勫叧閿殑鏂规硶.

灏辨槸

**int compareTo(T o)**

杩欎釜鏂规硶杩斿洖1涓狪nt鏁板��, 聽

渚嬪 i = x.compareTo(y)

濡傛灉i=0, 涔熻〃鏄庡璞涓巠鎺掍綅涓婃槸鐩哥瓑鐨�(骞堕潪鎰忓懗x.equals(y) = true, 浣嗘槸jdk api涓婂己鐑堝缓璁繖鏍峰鐞�)

濡傛灉杩斿洖鏁板�糹>0 鍒欐剰鍛宠��, x > y鍟︼紝銆�

鍙嶄箣鑻<0鍒欍��鎰忓懗x < y


# Comparable鎺ュ彛鐨勫疄鐜板強鐢ㄦ硶.
鐢ㄥ洖涓婇潰鐨勪緥瀛愶紝銆�鎴戜滑淇敼Student绫�, 浠ゅ叾瀹炵幇Comparable鎺ュ彛骞堕噸鍐檆ompareTo鏂规硶.

    import java.util.ArrayList;
    import java.util.Collections;

    class Student implements Comparable{
        private String name;
        private int ranking;
 
        public Student(String name, int ranking){
            this.name = name;
            this.ranking = ranking;
        } 
 
        public String toString(){
            return this.name + ":" + this.ranking;
        }
 
        public int compareTo(Object o){
            Student s = (Student)(o);
            return this.ranking - s.ranking;
        }
    }
 
    public class Compare2{
        public static void f(){
            ArrayList arr = new ArrayList();
            arr.add(new Student("Jack",10));
            arr.add(new Student("Bill",23));
            arr.add(new Student("Rudy",7));
 
            System.out.println(arr);
            Collections.sort(arr);
            System.out.println(arr);
        } 
    }


娉ㄦ剰閲嶅啓鐨刢ompareTo(Object o)鏂规硶鍐�. 聽鏍规嵁Student鐨剅anking鎴愬憳鏉ユ瘮杈冪殑, 涔熷氨鏄璺熷鍚嶆棤鍏充簡.

杩欐椂鍐嶇紪璇戞墽琛�, 灏辫兘瑙佸埌List瀹瑰櫒鍐呯殑Student瀵硅薄宸茬粡鏍规嵁ranking鏉ユ帓搴忎簡.聽

杈撳嚭:

[java] [Jack:10, Bill:23, Rudy:7]
[java] [Rudy:7, Jack:10, Bill:23]

