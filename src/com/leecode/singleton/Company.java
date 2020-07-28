package com.leecode.singleton;

import java.util.ArrayList;
import java.util.List;

//公司类
public class Company {
    private List<Staff> allStaffs = new ArrayList<>();

    public void addStaff(Staff staff){
        allStaffs.add(staff);
    }

    public void showAllStaffs(){
        for (Staff s :
                allStaffs) {
            System.out.println("Obj :"+s.toString());
        }
    }
}
