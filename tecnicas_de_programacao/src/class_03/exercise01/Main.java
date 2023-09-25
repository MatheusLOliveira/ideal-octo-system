package class_03.exercise01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<List<Product>, BigDecimal> sumProducts = products -> {
            BigDecimal sum = BigDecimal.ZERO;

            for(Product p : products) {
                sum = sum.add(p.getPrice());
            }
            return sum;
        };

        List<Product> products = new ArrayList<>();

        Product product1 = new Product("Beaf", BigDecimal.valueOf(23.43));
        Product product2 = new Product("Water", BigDecimal.valueOf(12.23));
        Product product3 = new Product("Rice", BigDecimal.valueOf(22.54));
        products.add(product1);
        products.add(product2);
        products.add(product3);

        System.out.println(sumProducts.apply(products));
    }

}
