import java.util.*;

class StudentRollNumbers {
    public static void main(String[] args) {
        Set<Integer> rollNumbers = new LinkedHashSet<>();

        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(102);

        System.out.println(rollNumbers);
    }
}
