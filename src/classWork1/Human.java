package classWork1;

public class Human {
    String name;
     private int  age;
     String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String  toMarrige (Human male, Human female){
        String result;
        if(male.getAge()>=18&&female.getAge()>=18){
            result=" You can marrige";

        }else result="You must have 18 in order to marrige";
        return result;
    }
}
