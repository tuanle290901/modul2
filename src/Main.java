//import java.util.Scanner;
//
//// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
//// then press Enter. You can now see whitespace characters in your code.
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //tạo menu chương trình
//        do {
//            System.out.println("MENU");
//            System.out.println("1. Tạo mảng sản phẩm");
//            System.out.println("2. Tạo sản phẩm");
//            System.out.println("3. Tính tổng tiền sản phẩm");
//            System.out.println("4. Tìm kiếm sản phẩm theo tên");
//            System.out.println("5. Tìm kiếm sản phẩm theo tên gần đúng");
//            System.out.println("6. Hiển thị sản phẩm");
//            System.out.println("7. Xóa sản phẩm theo mã");
//            System.out.println("8. Sửa sản phẩm theo mã");
//            System.out.println("0. Thoát");
//            System.out.println("Nhập lựa chọn của bạn: ");
//            int choice = Integer.parseInt(scanner.nextLine());
//            switch (choice) {
//                case 1:
//                    products = getArrayProduct(scanner);
//                    break;
//                case 2:
//                    createProducts(scanner, products);
//                    break;
//                case 3:
//                    System.out.println("Tổng giá tiền của các sản phẩm là: " + sumPriceOfProducts(products) + "USD");
//                    break;
//                case 4:
//                    Product productSearch = searchByName(scanner, products);
//                    if (productSearch == null) {
//                        System.out.println("Không tìm thấy sản phẩm có tên tương ứng!");
//                    } else {
//                        System.out.println(productSearch);
//                    }
//                    break;
//                case 5:
//                    Product[] productSearchAll = searchByNameContaining(scanner, products);
//                    displayAllProduct(productSearchAll);
//                    break;
//                case 6:
//                    displayAllProduct(products);
//                    break;
//                case 7:
//                    displayAllProduct(products);
//                    products = deleteProduct(scanner, products);
//                    break;
//                case 8:
//                    displayAllProduct(products);
//                    updateProduct(scanner, products);
//                    System.out.println("Sửa thành công!");
//                    break;
//                case 0:
//                    System.exit(0);
//            }
//        } while (true);
//    }
//}