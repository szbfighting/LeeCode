package com.leecode.singleton;

public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        //CEO对象只能通过getCEO函数获取
        Staff ceo1 = CEO.getCEO();
        Staff ceo2 = CEO.getCEO();
        company.addStaff(ceo1);
        company.addStaff(ceo2);
        //通过new创建VP对象
        Staff vp1 = new VP();
        Staff vp2 = new VP();
        company.addStaff(vp1);
        company.addStaff(vp2);
        //通过new创建Staff对象
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();
        company.addStaff(staff1);
        company.addStaff(staff2);
        company.addStaff(staff3);
        company.showAllStaffs();
    }
}
