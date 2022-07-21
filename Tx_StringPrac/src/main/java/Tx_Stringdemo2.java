public class Tx_Stringdemo2 {

    //创建对象的两种方式:田欣的对象

    public static void main(String[] args) {
        String name="1989年6月4日";
        System.out.println(name);
        //

        System.out.println("第二种创建string对象的方式");
        //
       char[] tianxin_chars ={'8','9','6','4'};
       String tianxin_Object =new String(tianxin_chars);
        System.out.println(tianxin_Object);

    }
}
