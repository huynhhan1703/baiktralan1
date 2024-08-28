/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLyCD {

    static ArrayList<CD> cd = new ArrayList<>();
    static CD cs = null;
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        cd.add(new CD("CD01", "noi buon gac tro", "Quang Linh", 195000, 2018));
        cd.add(new CD("CD02", "bai tinh ca dem", "Duc Tuan", 185000, 2021));
        cd.add(new CD("CD03", "cau ho chieu que", "Nhieu ca si", 172000, 2022));
        cd.add(new CD("CD04", "tinh dau tinh cuoi", "Van Khanh", 139000, 2022));
        cd.add(new CD("CD05", "thanh pho mưa bay", "Dan nguyen", 182000, 2019));
        int chon = 0;
        while (chon != 8) {
            System.out.print("\n=====QUAN LY CD=====");
            System.out.print("\n1. xuat va tong gia tri cd:"
                    + "\n2. Hien thi cd truoc 2020: "
                    + "\n3. Tim cd có ten 'tinh'"
                    + "\n4. sap xep cd giam dan"
                    + "\n5. xoa cd theoo ma so: "
                    + "\n6. sua cd theoo ma so:"
                    + "\n7. tong gia tri cd trong cua hang:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    xuatDS();
                    break;
                case 2:
                    dsTruoc2020();
                    break;
                case 3:
                    tim();
                    break;
                case 4:
                    sapXep();
                    break;
                case 5:
                    xoa();
                    break;
                case 6:
                    sua();
                    break;
                case 7:
                    tonggiatri();
                    break;
                case 8:
                    System.out.print("\nGoodbye. Thanks for using our program!");
                    break;
            }
        }
    }

    public static void xuatDS() {
        int tong = 0;
        for (CD cs : cd) {
            tong += cs.getGiaban();
        }
        for (CD cs : cd) {
            System.out.println("Maso: " + cs.getMaso()
                    + "\nTenCD: " + cs.getTenCD()
                    + "\nTen ca si: " + cs.getCasi()
                    + "\ngia ban: " + cs.getGiaban()
                    + "\nnam phat hanh: " + cs.getNamphatthanh()
            );

        }
        System.out.println("tong giá trị" + tong);
    }

    public static void dsTruoc2020() {
        System.out.println("Danh truoc 2020: ");
        for (CD cs : cd) {
            if (cs.getNamphatthanh() < 2020) {
                System.out.println(cs);
            }
        }
    }

    private static void sapXep() {
        System.out.println("thuc hien sap xep: ");

        Comparator<CD> cmp = new Comparator<CD>() {
            @Override
            public int compare(CD cd1, CD cd2) {
                return Double.compare(cd2.getGiaban(), cd1.getGiaban());
            }
        };

        Collections.sort(cd, cmp);
        for (CD cs : cd) {
            System.out.println(cs.toString());
        }
    }

    public static void xoa() {
        System.out.println("xoa theo ma so");
        Scanner sc = new Scanner(System.in);
        String mscd = sc.nextLine();
        for (CD cs : cd) {
            if (cs.getMaso() == mscd) {
                cd.remove(mscd);
            }
        }
        System.out.println(cs.toString());

    }

    private static void sua() {
    }

    private static void tim() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void tonggiatri() {
        int tong=0;
        for (CD cs : cd) {
            tong += cs.getGiaban();
        }
        System.out.println("tong giá trị" + tong);
    }
}
