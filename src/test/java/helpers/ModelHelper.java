package helpers;

import model.Product;

import java.util.List;

public class ModelHelper {

    public static Product getProductName(String productName) {
        List<Product> products = JsonHelper.getDataFromJson("product.json", Product.class);
        Product testProduct = products.stream().filter(product -> productName.equals(product.getProductName())).findAny().orElse(null);
        System.out.println(testProduct);
        return testProduct;
    }

}
