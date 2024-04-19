//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
//        product.setName("Laptop");
//        product.SetId(1);
//        product.setDescription("Asus Laptop");
//        product.setPrice(5000.0);
//        product.setStockAmount(3);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
        Product product2 = new Product();
        System.out.println(product2.id);
        product2.getId();

    }
}