package cls.practice;

class Person {

    public static void main(String[] args){
        Person p1=new Person(50,"Yong Long");
        Person p2=new Person(50,"Yong Long");
        p1.objectMethods(p2);
    }

    private int age;
    private String name;
    public Person(int ageParam, String nameParam) {
        this.age = ageParam;
        this.name = nameParam;
    }

    public void objectMethods(Person anotherObject) {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(anotherObject));
    }
}
