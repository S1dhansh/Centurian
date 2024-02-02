public class Feb2GitBasics {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
            System.out.println(marks[i]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int marks[] = {5, 9, 8};

        update(marks);
        System.out.println("Hello world!");
    }
}