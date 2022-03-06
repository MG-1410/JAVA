package com.data;

public class Student {
        private String name;
        private int age;
        private int id;
        private String dept;
        private String address;

        public Student(String name, int age, int id, String dept,String address) {
            this.name = name;
            this.age = age;
            this.id = id;
            this.dept = dept;
            this.address = address;
        }

        public String display()
        {
            return  "Name :" + name + "  Age :" + age + "  Id :" + id + "  Dept :" + dept + "  Address :" + address;
        }

        int getAge(){
            return age;
        }

        int getId(){
            return id;
        }

        String getDept(){
            return dept;
        }

        String getAddress(){
            return address;
        }
}
