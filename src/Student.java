public class Student implements Comparable<Student> {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }


    @Override
    public boolean equals(Object student) {
        if (this == student)
            return true;
        if (student == null)
            return false;
        if (student.getClass() != this.getClass())
            return false;

        Student another = (Student) student;
        return another.name.equals(this.name);
    }

    @Override
    public int compareTo(Student another) {
        return this.age - another.age;

    }

    @Override
    public String toString() {
        return String.format("Student(name: %s age: %d)", name, age);
    }

    public static void main(String[] args) {
        Student[] students = {new Student("Alice", 12),
                new Student("Bobo", 26),
                new Student("Jiaqi", 20)
        };

        Student another = new Student("Jiaqi", 20);

        SelectionSort.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }


    }
}





