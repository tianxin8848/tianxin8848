//
//注释快捷键Ctrl+/

import java.util.Scanner;

public class Tx_StringEque {
    public static void main(String[] args) {
//        正确登录名
            String tx_okname    ="TX";
            String tx_okpswd   ="8964";
//                自己输入的登录名
//扫描类转变为对象
     Scanner   tx_sc =new Scanner(System.in);  //扫描功能

        System.out.println("请输入登录名称TX：");
              String   tx_name =tx_sc.next();
        System.out.println("请输入登录密码8964：");
               String  tx_pswd=tx_sc.next();
                  //判断用户的登录名称是否有自己相等
       if (tx_okname.equals(tx_name)&& tx_okpswd.equals(tx_pswd)){
           System.out.println("登录成功");
           System.out.println("welcome to the new world of history" +
                   "haha");
        }
       else {
           System.out.println("it's my duty!!!!!");
       }
    }
}
