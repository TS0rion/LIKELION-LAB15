import java.util.Scanner;

public class PersonalExpenseManager {

    static int tienDien = 0;
    static int tienTaxi = 0;
    static int tienLuong = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tiepTuc = true;

        while (tiepTuc) {
            inMenu();
            String luaChon = scanner.nextLine();

            switch (luaChon) {
                case "1":
                    tinhTienDien(scanner);
                    break;
                case "2":
                    tinhTienTaxi(scanner);
                    break;
                case "3":
                    tinhTienLuong(scanner);
                    break;
                case "4":
                    tinhTongThuNhapSauChiTieu();
                    break;
                default:
                    tiepTuc = false;
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
            }
        }

        scanner.close();
    }

    public static void inMenu() {
        System.out.println("===== MENU QUẢN LÝ CHI TIÊU CÁ NHÂN =====");
        System.out.println("1. Tính tiền điện cuối tháng");
        System.out.println("2. Tính tiền taxi cuối tháng (giả sử: đi 1 lần/tháng)");
        System.out.println("3. Tính tiền lương cuối tháng (giả sử: thuế = 15%)");
        System.out.println("4. Tính tổng thu nhập sau khi chi tiêu cuối tháng");
        System.out.print("=> Mời bạn chọn chức năng [1->4], nhấn phím khác để thoát: ");
    }

    public static void tinhTienDien(Scanner scanner) {
        System.out.print("Nhập số kWh tiêu thụ: ");
        int kwh = Integer.parseInt(scanner.nextLine());
        int donGia = 3000;
        tienDien = kwh * donGia;
        System.out.println("=> Tiền điện tháng này: " + tienDien + " VND");
    }

    public static void tinhTienTaxi(Scanner scanner) {
        System.out.print("Nhập số tiền đi taxi 1 lần: ");
        tienTaxi = Integer.parseInt(scanner.nextLine());
        System.out.println("=> Tiền taxi tháng này: " + tienTaxi + " VND");
    }

    public static void tinhTienLuong(Scanner scanner) {
        System.out.print("Nhập tổng lương trước thuế: ");
        int luongGoc = Integer.parseInt(scanner.nextLine());
        tienLuong = (int) (luongGoc * 0.85);
        System.out.println("=> Tiền lương thực nhận sau thuế: " + tienLuong + " VND");
    }

    public static void tinhTongThuNhapSauChiTieu() {
        int thuNhapRong = tienLuong - tienDien - tienTaxi;
        System.out.println("=> Tổng thu nhập sau khi chi tiêu: " + thuNhapRong + " VND");
    }
}
