public class VirtualDemo {
    public static void main(String[] args) {
        // Menggunakan Staff sebagai tipe data array
        Staff[] dataStaff = new Staff[2];

        // Polimorpisme, asumsikan Gaji adalah turunan dari Staff
        dataStaff[0] = new Gaji("Athaya", "Binuang", 3, 500000.00);
        dataStaff[1] = new Gaji("Awem", "Pasaman", 2, 650000.00);

        System.out.println("Memanggil mailCheck menggunakan polimorfisme---");
        for (Staff staff : dataStaff) {
            staff.mailCheck();
        }
    }
}
