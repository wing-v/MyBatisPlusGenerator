package com.xiaozhisha.vv.lambda;

import com.xiaozhisha.vv.inter.sister;

public class LambdaTest {

    public static void main(String[] args) {
        hireSister( food -> {
            System.out.println("将" +food +"做成可口的饭菜");
        });

        hireSister( Cook ::CookFood  );
    }

    public static void hireSister(sister sister) {
         sister.makeFood("白菜");
    }
}
