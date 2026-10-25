package com.codegnan.app.weeklyassignmentproductmanagement.program;

import com.codegnan.app.weeklyassignmentproductmanagement.entity.Product;
import com.codegnan.app.weeklyassignmentproductmanagement.operation.ProductOperations;

import static java.lang.System.out;

public class MainProgram {
    public static void main(String[] args) {
        out.println();
        ProductOperations productOperations = new ProductOperations();

        Product[] product = productOperations.getProducts();

        for (Product products : product){
            out.println(products);
        }

        out.println();

        Product product6 = new Product(6,"WebCam",3200.00);

        boolean isAdded = productOperations.addProduct(product6);

        if (isAdded) {
            out.println("Product Added");
        } else {
            out.println("Product Not Added");

        }

        out.println();

        Product product7 = new Product(7,"HeadPhones",1500.00);
        Product product8 = new Product(8,"External SSD",6500.00);
        Product product9 = new Product(9,"HDD",6500.00);
        Product product10 = new Product(10,"HeadPhones-Wired",500.00);
        Product product11= new Product(11,"External SSD-1TB",8500.00);

        productOperations.addProducts(product7,product8,product9,product10);

        isAdded = productOperations.addProduct(product11);
        if (isAdded) {
            out.println("Product Added");
        } else {
            out.println("Product Not Added");

        }

        out.println();

       Product productById = productOperations.findProductById(5);

        if (productById == null ) {
            out.println("Product not Found");
        } else {
            out.println("Product Found");
            out.println(productById);
        }

        out.println();

        productById = productOperations.findProductById(99);

        if (productById == null ) {
            out.println("Product not Found");
        } else {
            out.println("Product Found");
            out.println(productById);
        }

        out.println();

        boolean isUpdatded = productOperations.updateProductPrice(2,850.00);
        if (isUpdatded) {
            out.println("Price Updated ");
        } else {
            out.println("Price Not Updated ");
        }

        out.println();

       boolean isDeleted = productOperations.deleteProduct(10);

        if (isDeleted) {
            out.println("Product Deleted");
        } else {
            out.println("Product Not Deleted");
        }

        out.println();

        product = productOperations.getProducts();

        for (Product products : product){
            out.println(products);
        }


    }
}
