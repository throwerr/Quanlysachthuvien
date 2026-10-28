package Quanlysachthuvien.BTT3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- NHAP THONG TIN CO BAN ---
        System.out.println("=== NHAP THONG TIN SACH ===");
        System.out.print("Nhap ma sach: ");
        String maSach = scanner.nextLine();

        System.out.print("Nhap ten sach: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhap ten tac gia: ");
        String tacGia = scanner.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = scanner.nextInt();

        System.out.print("Nhap don gia: ");
        double donGia = scanner.nextDouble();

        System.out.print("Nhap so luong: ");
        int soLuong = scanner.nextInt();


        // ==========================================================
        // BAI 1: Kiem tra hop le (gia > 0, so luong >= 0, nam xuat ban hop le)
        // ==========================================================
        System.out.println("\n----------------------------------------");
        System.out.println("=== KET QUA BAI 1: KIEM TRA HOP LE ===");
        
        boolean hopLe = (donGia > 0) && (soLuong >= 0) && (namXuatBan > 0 && namXuatBan <= 2026);
        
        if (hopLe) {
            System.out.println("=> Du lieu sach HOP LE.");
        } else {
            System.out.println("=> Du lieu sach KHONG HOP LE!");
            if (donGia <= 0) System.out.println("   - Don gia phai lon hon 0.");
            if (soLuong < 0) System.out.println("   - So luong phai lon hon hoac bang 0.");
            if (namXuatBan <= 0 || namXuatBan > 2026) System.out.println("   - Nam xuat ban khong hop le.");
        }


        // ==========================================================
        // BAI 2: Phan loai gia (thap, trung binh, cao, dac biet)
        // ==========================================================
        System.out.println("\n=== KET QUA BAI 2: PHAN LOAI GIA ===");
        String phanLoaiGia = "";

        if (donGia < 50000) {
            phanLoaiGia = "Sach gia thap";
        } else if (donGia <= 100000) {
            phanLoaiGia = "Sach gia trung binh";
        } else if (donGia <= 200000) {
            phanLoaiGia = "Sach gia cao";
        } else {
            phanLoaiGia = "Sach gia dac biet";
        }
        System.out.println("Phan loai gia: " + phanLoaiGia);


        // ==========================================================
        // BAI 3: Phan loai ton kho (het, sap het, con it, con nhieu)
        // ==========================================================
        System.out.println("\n=== KET QUA BAI 3: PHAN LOAI TON KHO ===");
        String phanLoaiKho = "";

        if (soLuong == 0) {
            phanLoaiKho = "Het sach";
        } else if (soLuong >= 1 && soLuong <= 5) {
            phanLoaiKho = "Sap het";
        } else if (soLuong >= 6 && soLuong <= 20) {
            phanLoaiKho = "Con it";
        } else {
            phanLoaiKho = "Con nhieu";
        }
        System.out.println("Tinh trang kho: " + phanLoaiKho);


        // ==========================================================
        // BAI 4: Dung switch chon loai sach
        // ==========================================================
        System.out.println("\n=== BAI 4: CHON LOAI SACH ===");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Moi ban chon loai sach (1-4): ");
        
        int loaiSachChon = scanner.nextInt();
        String loaiSach = "";

        switch (loaiSachChon) {
            case 1:
                loaiSach = "Sach giao khoa";
                break;
            case 2:
                loaiSach = "Sach tham khao";
                break;
            case 3:
                loaiSach = "Sach chuyen nganh";
                break;
            case 4:
                loaiSach = "Sach khac";
                break;
            default:
                loaiSach = "Khong xac dinh (chon sai so)";
                break;
        }
        System.out.println("Loai sach da chon: " + loaiSach);

        System.out.println("\n----------------------------------------");
        System.out.println("=== BAO CAO TONG HOP SACH ===");
        System.out.println("Ten sach     : " + tenSach + " (" + maSach + ")");
        System.out.println("Loai sach    : " + loaiSach);
        System.out.println("Don gia      : " + donGia + " VND (" + phanLoaiGia + ")");
        System.out.println("Ton kho      : " + soLuong + " cuon (" + phanLoaiKho + ")");

        scanner.close();
    }
}