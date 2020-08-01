package com;

public class AnnotationExample {

    @AnnotationInfo(value = {"android.permission.CALL_PHONE","android.permission.CAMERA"},requestCode = 10)
    public void requestPermission(){

    }
}
