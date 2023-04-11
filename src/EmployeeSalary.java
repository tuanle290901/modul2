//import java.util.Scanner;
//
//public class EmployeeSalary {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        Employee[] employees = new Employee[100];
//        int choice = -1;
//
//        do {
//            System.out.println("Menu:");
//            System.out.println("1. Hiển thị nhân viên full time");
//            System.out.println("2. Hiển thị nhân viên part time");
//            System.out.println("3. Xóa 1 nhân viên");
//            System.out.println("4. Thêm 1 nhân viên mới");
//            System.out.println("5. khai báo nhân viên");
//            System.out.println("0. Thoát");
//
//            System.out.print("Lựa chọn của bạn: ");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    if (employees != null) {
//                        displayFullTimeEmployees(employees);
//                    } else {
//                        System.out.println("Chưa có nhân viên nào");
//                    }
//                    break;
//                case 2:
//                    if (employees != null) {
//                        displayPartTimeEmployees(employees);
//                    } else {
//                        System.out.println("Chưa có nhân viên nào");
//                    }
//                    break;
//                case 3:
////                    if (employees != null) {
////                        employees = deleteEmployee(scanner, employees);
////                    } else {
////                        System.out.println("Chưa có nhân viên nào");
////                    }
////                    break;
//                case 4:
//                    employees = addEmployees(scanner);
//                    break;
//                case 5:
//                    employees = addEmployees(scanner);
//                case 0:
//                    System.out.println("Chương trình kết thúc");
//                    break;
//                default:
//                    System.out.println("Lựa chọn không hợp lệ");
//                    break;
//            }
//        } while (choice != 0);
//    }
//
//
//    public static Employee[] addEmployees(Employee[] employeesOld, Scanner scanner) {
//        System.out.print("Nhập số lượng nhân viên: ");
//        int n = scanner.nextInt();
//
//        Employee[] employees = new Employee[n];
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Nhập thông tin nhân viên %d:\n", i + 1);
//            System.out.print("  - ID: ");
//            int id = scanner.nextInt();
//
//            System.out.print("  - Tên: ");
//            String name = scanner.nextLine();
//
//            System.out.print("  - Tuổi: ");
//            int age = scanner.nextInt();
//
//            System.out.print("  - Loại nhân viên (1 - Full time, 2 - Part time): ");
//            String type = scanner.nextLine();
//            employees[i] = new Employee(id, name, age, type);
//
//        }
//        for (int i = 0; i < employeesOld.length; i++) {
//
//        }
//        Employee[] newEmployees = new Employee[employeesOld.length + employees.length];
//
//        for (int i = 0; i < newEmployees.length; i++) {
//            if (i>= employeesOld.length) {
////                employees[i] =
//            }
//        }
//        return employees;
//    }
//
//    public static Employee addOneEmployee() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Nhập số lượng nhân viên: ");
//        int n = scanner.nextInt();
//        Employee employee = new Employee();
//        System.out.println(" nhập id của nhân viên");
//        int id = scanner.nextInt();
//        System.out.println(" nhập tên của nhân viên");
//        String name = scanner.nextLine();
//        System.out.println(" nhập tuôổi của nhân viên");
//        int age = scanner.nextInt();
//        System.out.println(" nhập type");
//        String type = scanner.nextLine();
//        employee = new Employee(id, name, age, type);
//
//        return employee;
//    }
//
//    public static void displayFullTimeEmployees(Employee[] employees) {
//        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i]);
//        }
//
//    }
//
//    public static void displayPartTimeEmployees(Employee[] employees) {
//        for (int i = 0; i < employees.length; i++) {
//            System.out.println(employees[i]);
//        }
//
//    }
//
//    public static Employee[] deleteEmployess(Scanner scanner, Employee[] employees) {
//        System.out.println("Nhập mã nhân viên bạn muốn xóa: ");
//        String code = scanner.nextLine();
//        Employee[] deleteEmployess = new Employee[employees.length - 1];
//        int index = 0;
////        boolean check = false;
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i].getId() == Integer.parseInt(code)) {
//                System.out.println();
//            }
//        }
//        return employees;
//    }
//
//
//}
//
//
