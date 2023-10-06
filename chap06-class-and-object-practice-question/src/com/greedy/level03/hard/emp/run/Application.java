package com.greedy.level03.hard.emp.run;

import com.greedy.level03.hard.emp.model.dto.EmploteeDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("번호를 입력하세요 : ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("부서를 입력하세요 : ");
        String dept = sc.nextLine();
        System.out.print("직위를 입력하세요 : ");
        String job = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);sc.nextLine();
        System.out.print("월급을 입력하세요 : ");
        int salary = sc.nextInt();sc.nextLine();
        System.out.print("보너스를 입력하세요 : ");
        double bonusPoint = sc.nextDouble();sc.nextLine();
        System.out.print("핸드폰 번호를 입력하세요 : ");
        String phone = sc.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String address = sc.nextLine();

        EmploteeDTO emp = new EmploteeDTO();
        emp.setNumber(number);
        emp.setName(name);
        emp.setDept(dept);
        emp.setJob(job);
        emp.setAge(age);
        emp.setGender(gender);
        emp.setSalary(salary);
        emp.setBonusPoint(bonusPoint);
        emp.setPhone(phone);
        emp.setAddress(address);
        System.out.println(emp.getNumber()+"\n"+
                emp.getName()+"\n"+
                emp.getDept()+"\n"+
                emp.getJob()+"\n"+
                emp.getAge()+"\n"+
                emp.getGender()+"\n"+
                emp.getSalary()+"\n"+
                emp.getBonusPoint()+"\n"+
                emp.getPhone()+"\n"+
                emp.getPhone()+"\n"+
                emp.getAddress()+"\n");
    }
}
