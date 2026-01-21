class Person {
    void showRole() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    void showRole() {
        System.out.println("I am a student");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.showRole();
    }
}
