public class Main {
    public static void main(String[] args) {

        int switchValue =3;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            default -> System.out.println("Was not 1 or 2");
        }
    }
}