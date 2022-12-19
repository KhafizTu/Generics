public class Main {
    public static void main(String[] args) {

        Box<String> box = new Box<>("Khafiz");
        System.out.println(box);

        box.method("Dastan");
    }
}