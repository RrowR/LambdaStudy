package com.study.lambda;

public class Lambda3 {
    public static class Person {
        private String name;
        private int age;

        public void set(String name,int age){
            setName(name);
            setAge(age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public interface GetInfo {
        //        String info(Person person);
        String getName(Person person);
    }

    public interface GetInfo2 {
        int getAge(Person person);
    }

    public interface SetInfo {
        //        String info(Person person);
        void setName(Person person);
    }

    public interface SetMultipleParameters {
        void setInfo(Person person,String name);
    }

    public interface SetMultipleParameters2 {
        void setInfo2(Person person,String name,int age);
    }

    public interface SetMultipleParameters3 {
        void setInfo2(Person person,int age);
    }

    public static void main(String[] args) {
        Person person = new Person();
//        person.setName("叮咚");


//        SetInfo setInfo = Person::setName();      //这条语句不能执行，好像是因为setName有参数    Non-static method cannot be referenced from a static context （不能从静态上下文引用非静态方法）但是get可以

        GetInfo lambda1 = person1 -> person1.getName();
        System.out.println(lambda1.getName(person));
        //这里在使用Lambda的时候只能使用get方法，set方法会显示这不是一个静态方法
//        GetInfo getInfo = Person::getName;
//        System.out.println(getInfo.getName(person));

//        SetMultipleParameters lambda2 = (x,n) -> x.setName(n);
        SetMultipleParameters lambda2  = Person::setName;       //可以设定这样的一个接口来实现set方法，前提是要有对象，还要有对象的名字，在这之前要先创建好对象才能set
        lambda2.setInfo(person,"小明");
        System.out.println(lambda1.getName(person));

//        SetMultipleParameters2 lambda3 = (p, name, age) -> p.set(name,age);
        SetMultipleParameters2 lambda3 = Person::set;
        lambda3.setInfo2(person,"小花",12);
        System.out.println(person);

//        SetMultipleParameters3 lambda4 = p -> p.set();
        SetMultipleParameters3 lambda4 = Person::setAge;        //使用set的前提是接口里必须要用对应的其他参数，不能只有一个对象
        lambda4.setInfo2(person,23);
        System.out.println(person);

        GetInfo2 lambda5 = Person::getAge;
        System.out.println(lambda5.getAge(person));


    }
}
