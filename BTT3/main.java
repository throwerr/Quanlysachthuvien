package Quanlysachthuvien.BTT3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==========================================================
        // BÀI 1: Nhập mã sách, tên sách, tác giả, năm xuất bản, 
        // đơn giá, số lượng và hiển thị lại
        // ==========================================================
        System.out.println("=== BÀI 1: NHẬP VÀ HIỂN THỊ THÔNG TIN SÁCH ===");
        
        System.out.print("Nhập mã sách: ");
        String maSach = scanner.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhập tên tác giả: ");
        String tacGia = scanner.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = scanner.nextInt();

        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soLuong = scanner.nextInt();

        // Hiển thị lại thông tin sách
        System.out.println("\n--- Thông tin sách đã nhập ---");
        System.out.println("Mã sách      : " + maSach);
        System.out.println("Tên sách     : " + tenSach);
        System.out.println("Tác giả      : " + tacGia);
        System.out.println("Năm xuất bản : " + namXuatBan);
        System.out.println("Đơn giá      : " + donGia);
        System.out.println("Số lượng     : " + soLuong);


        // ==========================================================
        // BÀI 2: Tính thành tiền = đơn giá × số lượng
        // ==========================================================
        double thanhTien = donGia * soLuong;


        // ==========================================================
        // BÀI 3: Phí vận chuyển = 5% giá trị sách
        // ==========================================================
        double phiVanChuyen = thanhTien * 0.05;


        // ==========================================================
        // BÀI 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
        // ==========================================================
        double tongTienNhap = thanhTien + phiVanChuyen;


        // ==========================================================
        // HIỂN THỊ KẾT QUẢ CÁC BÀI 2, 3, 4
        // ==========================================================
        System.out.println("\n=== BÀI 2, 3, 4: KẾT QUẢ TÍNH TOÁN ===");
        System.out.println("Thành tiền     : " + thanhTien);
        System.out.println("Phí vận chuyển : " + phiVanChuyen);
        System.out.println("Tổng tiền nhập : " + tongTienNhap);

        scanner.close();
    }
}
