package com.xiaozhisha.vv.utils;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * 校验入参是否为空
 */
public class EmptyChecker {
    public EmptyChecker() {
    }

    public static boolean isEmpty(Object... obj){
        if (obj == null || obj.length ==0){
            return true;
        }
        for (Object o : obj) {
            if (isEmpty(o)){
                return  false;
            }
        }
        return true;
    }

    public static boolean isEmpty(Object o){
        if (o == null){
            return true;
        }
        if (o instanceof CharSequence){
            return Objects.isNull(o.toString().trim());
        }
        if (o instanceof Collection){
            return ((Collection) o).isEmpty();
        }
        if (o instanceof Map){
            return ((Map) o).isEmpty();
        }
        return false;
    }

    public static boolean notEmpty(Object obj){
        return !isEmpty(obj);
    }

}
