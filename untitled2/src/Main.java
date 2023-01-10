import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerProductt managerProductt = new ManagerProductt();
        DocGhiFile docGhiFile = new DocGhiFile();


        int choice = 0;
        while (true){
            System.out.println("-----------------");
            System.out.println("MENU");
            System.out.println("-----------------");
            System.out.println("nhap lua chon");
            System.out.println("nhap 1 de them");
            System.out.println("nhap 2 de hien thi");
            System.out.println("nhap 3 de sua");
            System.out.println("nhap 4 de xoa");
            System.out.println("nhap 5 de sap xep");
            System.out.println("nhap 6 de thoat");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e3){
                System.out.println("phai nhap so");
            }
            switch (choice){
                case 1:
                    managerProductt.add(managerProductt.creatProductt());
                    docGhiFile.write(ManagerProductt.fileProductt,ManagerProductt.list);
                    docGhiFile.read(ManagerProductt.fileProductt);
                    break;
                case 2:
                    managerProductt.show();
                    break;
                case 3:
                    managerProductt.edit();
                    docGhiFile.write(ManagerProductt.fileProductt,ManagerProductt.list);
                    docGhiFile.read(ManagerProductt.fileProductt);
                    break;
                case 4:
                    managerProductt.delete();
                    break;
                case 5:
                    ManagerProductt.sortPrice();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
