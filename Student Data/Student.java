package com.data;

public class Student extends Object{
        private String name;
        private int age;
        private int id;
        private String dept;
        private Address address;

        public Student(String name, int age, int id, String dept,Address address) {
            this.name = name;
            this.age = age;
            this.id = id;
            this.dept = dept;
            this.address = address;
        }

        public String display()
        {
            return  "Name :" + name + "  Age :" + age + "  Id :" + id + "  Dept :" + dept ;
        }

        public int getAge(){
            return age;
        }

        public int getId(){
            return id;
        }

        public String getDept(){
            return dept;
        }

        public String toString() {
            return "" + address;
        }
}
