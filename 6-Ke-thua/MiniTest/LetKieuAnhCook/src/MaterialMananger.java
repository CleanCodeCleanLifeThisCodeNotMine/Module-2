import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaterialMananger {
    private List<Material> materials = new ArrayList<Material>();

    //Them vat lieu
    public void addMaterial(Material material) {
        materials.add(material);
    }

    //Sua vat lieu
    public void updateMaterial(int index, Material material) {
        if (index >= 0 && index < materials.size()) {
            materials.set(index, material);
        }
    }

    //Xoa vat lieu
    public void removeMaterial(int index) {
        if (index >= 0 && index < materials.size()) {
            materials.remove(index);
        }
    }

    //Tinh tong tien
    public double totalAmount() {
        double total = 0;
        for (Material material : materials) {
            total += material.getAmount();
        }
        return total;
    }

    //Sap xep theo gia
    public void sortMaterials() {
        materials.sort(Comparator.comparingInt(Material::getCost)); //?
    }
    //Tinh chenh lech chiet khau va nguyen gia
    public double calDiffDiscountvsStockPrice() {
        double stockPrice = 0;
        double discountPrice = 0;
        for (Material material : materials) {
            stockPrice+= material.getAmount();
            if (material instanceof Discount){
                discountPrice += ((Discount) material).getRealMoney();
            }
        } return stockPrice - discountPrice;
    }

    //Lay danh sach
    public List<Material> getMaterials() {
        return materials;
    }

}
