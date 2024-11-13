import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        MaterialMananger mananger = new MaterialMananger();

        //Tao 5 bot
        mananger.addMaterial(new CrispyFlour("111", "Bot nha lam", LocalDate.of(2024,1, 1), 11000,1));
        mananger.addMaterial(new CrispyFlour("222", "Bot Manh lam", LocalDate.of(2024,2, 2), 22000,2));
        mananger.addMaterial(new CrispyFlour("333", "Bot Dung lam", LocalDate.of(2024,3, 3), 33000,3));
        mananger.addMaterial(new CrispyFlour("444", "Bot Vuong lam", LocalDate.of(2024,4, 4), 44000,4));
        mananger.addMaterial(new CrispyFlour("555", "Bot nhap lau", LocalDate.of(2024,5, 5), 55000,5));

        //Tao 5 thit
        mananger.addMaterial(new Meat("666", "Thit nha lam", LocalDate.of(2024,6, 6), 66000,6));
        mananger.addMaterial(new Meat("777", "Thit Campuchia", LocalDate.of(2024,7, 7), 77000,7));
        mananger.addMaterial(new Meat("888", "Thit cho Long Bien", LocalDate.of(2024,8, 8), 88000,8));
        mananger.addMaterial(new Meat("999", "Thit sieu thi", LocalDate.of(2024,9, 9), 99000,9));
        mananger.addMaterial(new Meat("1010", "Thit", LocalDate.of(2024,10, 10), 1010000,6));

        //Tinh tong tien
        System.out.println("Tong tien 5 bot + 5 thit: " + mananger.totalAmount());

        //Sap xep
        mananger.sortMaterials();
        System.out.println("Danh sach vat lieu xep theo gia: ");
        for (Material material : mananger.getMaterials()) {
                System.out.println(material);
        }

        //Tinh chenh lech
        System.out.println("So tien chenh lech giua truoc va sau chiet khau: " + mananger.calDiffDiscountvsStockPrice());


    }
}