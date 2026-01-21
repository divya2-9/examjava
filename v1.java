class Patient {
    String name;
    double height;
    double weight;

    double computeBMI() {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        Patient p = new Patient();
        p.name = "Rahul";
        p.height = 1.75;
        p.weight = 70;

        System.out.println(p.computeBMI());
    }
}
