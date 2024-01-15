package com.example.demo;

interface ProductInterface {

}

class Product implements ProductInterface {
    int product_id;
    String product_name;
    int product_cost;
    int product_quantity;

    static int oCnt = 0;

    Product() {
        oCnt++;
        product_id = 0;
        product_name = "";
        product_cost = 0;
        product_quantity = 0;
    }

    Product(int pId, String pNm, int pCost, int pCount) {
        oCnt++;
        product_id = pId;
        product_name = pNm;
        product_cost = pCost;
        product_quantity = pCount;
    }

    void display() {
        System.out.println("Product Id = " + product_id + " product name = " + product_name
        + " product count = " + product_quantity + " product cost = " + product_cost);
    }
}

public class SetBQ2 {

    public static void main(String[] args) {
        Product product = new Product(1, "Jewellery", 2500, 2);
        Product product2 = new Product(2, "Hijab", 1100, 5);
        product.display();
        product2.display();
        System.out.println("Object Count = " + Product.oCnt);
    }
}
