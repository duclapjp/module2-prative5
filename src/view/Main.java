package view;

import controller.Town;
import model.HouseHold;
import model.People;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<HouseHold> houseHoldList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Town hanoi = new Town();

        boolean check = true;
        while (check) {
            System.out.println("--------MENU-----------");
            System.out.println("--1:Tạo Mới");
            System.out.println("--2:Hiện thị danh sách hộ dân");
            System.out.println("--3:Thêm hộ dân");
            System.out.println("--4:Sửa thông tin");
            System.out.println("--5:Xóa");
            System.out.println("--6:Tìm");
            System.out.println("--7:Thoát");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                case 3:
                    creatHouse(houseHoldList, hanoi);
                    break;
                case 2:
                    hanoi.showAllHouseHold();
                    break;
                case 4:
                    editHouse(scanner, hanoi);
                    break;
                case 5:
                    deleteHouse(scanner, hanoi);
                    break;
                case 6:
                    seachHouse(scanner, hanoi);
                    break;
                case 7:
                    check = false;
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("nhập lại menu");
            }
        }
    }

    private static void seachHouse(Scanner scanner, Town hanoi) {
        System.out.println("nhập vào số nhà muốn tìm");
        scanner.nextLine();
        String numhouse1 = scanner.nextLine();
        HouseHold newH = hanoi.seachHouseHold(numhouse1);
        if (newH!=null){
            System.out.println(newH.toString());
        }else System.out.println("không tìm thấy");
    }

    private static void deleteHouse(Scanner scanner, Town hanoi) {
        System.out.println("nhập vào số nhà muốn xóa");
        scanner.nextLine();
        String num = scanner.nextLine();
        hanoi.deleteHouseHold(num);
        hanoi.showAllHouseHold();
    }

    private static void creatHouse(ArrayList<HouseHold> houseHoldList, Town hanoi) {
        HouseHold houseHold = createHouse();
        houseHoldList.add(houseHold);
        hanoi.setHouseHoldList(houseHoldList);
        hanoi.showAllHouseHold();
    }

    private static void editHouse(Scanner scanner, Town hanoi) {
        System.out.println("nhập vào số nhà muốn sửa");
        scanner.nextLine();
        String numHouse = scanner.nextLine();
        System.out.println("nhập số nhà mới");
        String newNumhouse = scanner.nextLine();
        HouseHold newHouse = creatPeople();
        newHouse.setNumHouse(newNumhouse);
        hanoi.editHouseHold(newNumhouse, newHouse);
        hanoi.showAllHouseHold();
    }

    public static HouseHold createHouse() {                              //tao thong tin nguoi trong nha`
        Scanner scanner = new Scanner(System.in);
        HouseHold house = new HouseHold();
        System.out.println("nhập vào số hộ dân");
        int z = scanner.nextInt();
        for (int i = 0; i < z; i++) {
            System.out.println("nhập vào số nhà");
            scanner.nextLine();
            String numhouse = scanner.nextLine();
            house.setNumHouse(numhouse);
            System.out.println("Nhập vào số người trong nhà ");
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.println("người:" + (j + 1));
                People people = new People();
                people.inputPeople();
                house.addPeople(people);
            }
        }
        return house;
    }

    public static HouseHold creatPeople() {
        Scanner scanner = new Scanner(System.in);
        HouseHold house = new HouseHold();
        System.out.println("Nhập vào số người trong nhà ");
        int n = scanner.nextInt();
        for (int j = 0; j < n; j++) {
            System.out.println("người:" + (j + 1));
            People people = new People();
            people.inputPeople();
            house.addPeople(people);
        }
        return house;
    }
}