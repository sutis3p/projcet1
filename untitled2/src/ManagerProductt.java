import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManagerProductt implements Serializable {
    Scanner scanner = new Scanner(System.in);
    public static File fileProductt = new File("Productt.txt");
    public static ArrayList<Productt> list = new ArrayList<>();
    int id = 0;

    public void add(Productt productt) {
        list.add(productt);
    }

    public Productt creatProductt() {
        id++;
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("nhap gia");
        double price =0;
        while (true) {
            try {
                price = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("phải nhập số");
            }
        }
        System.out.println("nhap soluong");
        int quantity = 0;
        while (true) {
            try {
                quantity = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e1) {
                System.out.println("phải nhập số");
            }
        }
        System.out.println("nhap mota");
        String mota = scanner.nextLine();
        Productt productt = new Productt(id, name, price, quantity, mota);
        return productt;
    }

    public void delete() {
        System.out.println("Nhập id cần xóa");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++)
            if (id == list.get(i).getId()) {
                list.remove(i);
            }
    }

    public void show() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public void edit() {
        System.out.println("nhap id muon sua");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i).getId()==id){
               list.set(i,creatProductt());
           }
        }
    }
    public static void sortPrice(){
        List<Productt> sortedlistProductt = list.stream().sorted(Comparator.comparing(o -> o.getPrice())).collect(Collectors.toList());
        for (int i = 0; i < sortedlistProductt.size(); i++) {
            System.out.println(sortedlistProductt.get(i));

        }
    }

    }
