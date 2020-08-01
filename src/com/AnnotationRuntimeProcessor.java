package com;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationRuntimeProcessor {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.AnnotationExample");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                boolean isHasAnnotation = method.isAnnotationPresent(AnnotationInfo.class);
                if (isHasAnnotation){
                    method.setAccessible(true);
                    AnnotationInfo info = method.getAnnotation(AnnotationInfo.class);
                    if (info==null) return;
                    String[] permissions = info.value();
                    System.out.println("value:"+ Arrays.toString(permissions));
                    int requestCode = info.requestCode();
                    System.out.println("requestCode:"+requestCode);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
