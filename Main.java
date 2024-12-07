public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone1 = new SmartPhone("Appel", "Iphone 16 pro", 50000, 108, 16, 128, "IOS 18");
        SmartPhone smartPhone2 = new SmartPhone("Samsung", "S25 ", 50000, 108, 16, 128, "Android 16");

        smartPhone1.showDetails();
        System.out.println("\n");
        smartPhone2.showDetails();
    }
}
