class MarksValidation {

    static void validateMarks(int marks) throws Exception {
        if (marks < 0 || marks > 100) {
            throw new Exception("Invalid Marks");
        }
        System.out.println("Valid Marks");
    }

    public static void main(String[] args) {
        try {
            validateMarks(110);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
