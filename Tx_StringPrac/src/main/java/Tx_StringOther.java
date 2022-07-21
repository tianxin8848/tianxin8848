public class Tx_StringOther {
    public static void main(String[] args) {

        //获取字符串长度
        String tx_string="没想到他文化程度这么低";
        System.out.println(tx_string.length());
        //获取某个索引位置

        char tx_string6 =  tx_string.charAt(6);
        System.out.println(tx_string6);

        System.out.println("---------获取字符所有字符————————————");

        for(int i =0;i<tx_string.length();i++){
          char tx_stringAll =tx_string.charAt(i);
            System.out.println(tx_stringAll);
        }

//字符串转换字符数组

                char[]   tx_stringAll2  =   tx_string.toCharArray();
            for (int i=0 ; i<tx_stringAll2.length; i++){
                char tx_ch =tx_stringAll2[i];
            }
                System.out.println(tx_stringAll2);

//4
       String tx_string2="厉害了我的墙国";

       String Fk_xibaozi = tx_string2.substring(0,7);
        System.out.println(Fk_xibaozi);

        //敏感词替换
       String FKbaozi_string ="三年大吃饱，十年大健身";
       String FK_baozi1 = FKbaozi_string.replace("吃饱","***");
        System.out.println(FK_baozi1);

        //
        System.out.println(FK_baozi1.contains("十年"));
        System.out.println(FK_baozi1.contains("包子"));
//8
        System.out.println(FK_baozi1.startsWith("三年"));
        System.out.println(FK_baozi1.startsWith("包子"));

        //9

        String FK_baozi2="毛腊肉,庆丰帝";
        String[] FK_2=  FK_baozi2.split(",");

        for(int i =0; i<FK_2.length;i++){
            System.out.println("选择了"+FK_2[i]);
        }
    }

}
