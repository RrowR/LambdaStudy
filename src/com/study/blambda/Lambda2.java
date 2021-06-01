package com.study.blambda;

public class Lambda2 {
    public static class Person{

        private String name;
        private int age;

        public Person() {
            System.out.println("无参构造");
        }

        public Person(String name) {
            this.name = name;
            System.out.println(name+"的单个有参构造");
        }

        public Person(int age) {
            this.age = age;
            System.out.println(age+"的单个有参构造");
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println(name+"和"+age+"的有参构造");
        }
    }

    @FunctionalInterface
    public interface GetPerson{
        Person get();
    }

    @FunctionalInterface
    public interface GetOneParameterOfNamePerson{
        Person get(String name);
    }

    @FunctionalInterface
    public interface GetOneParameterOfAgePerson{
        Person get(int age);
    }

    @FunctionalInterface
    public interface GetMultipleParameterPerson{
        Person get(String name,int age);
    }

    public static void main(String[] args) {
        //这里一定要是无参的 静态 对象才可以
        GetPerson getPerson = Person::new;
        getPerson.get();

        GetOneParameterOfNamePerson getOneParameterOfNamePerson = Person::new;
        getOneParameterOfNamePerson.get("镜嬅");

        GetOneParameterOfAgePerson getOneParameterOfAgePerson = Person::new;
        getOneParameterOfAgePerson.get(23);

        GetMultipleParameterPerson getMultipleParameterPerson = Person::new;
        getMultipleParameterPerson.get("美美",12);

    }

}
