package com.codegnan.app.weeklyassignmentproductmanagement.operation;

import com.codegnan.app.weeklyassignmentproductmanagement.entity.Product;

public class ProductOperations {

    Product[] products = new Product[10];

    public ProductOperations() {

        Product product1 = new Product(1,"Laptop",55000.00);
        Product product2 = new Product(2,"Wireless Mouse ",750.00);
        Product product3 = new Product(3,"Mechanical Keyboard",2500.00);
        Product product4 = new Product(4,"Monitor",12500.00);
        Product product5 = new Product(5,"USB-C Hub",1800.00);

        products[0] = product1;
        products[1] = product2;
        products[2] = product3;
        products[3] = product4;
        products[4] = product5;

    }

    public boolean addProduct(Product product) {
        boolean isAdded = false;

        for (int index = 0; index <products.length; index++) {
            if(products[index]== null) {
                products[index] = product;
                isAdded = true;
                break;
            }
        }

        return isAdded;
    }

    public void addProducts(Product... inputProducts) {
        int index = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = inputProducts[index];
                index++;

                if (index == inputProducts.length) {
                    break;
                }
            }
        }
    }

    public Product[] getProducts() {
        return products;
    }

    public Product findProductById(int productId) {
        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product.id() == productId) {
                return product;
            }
        }
        return null;
    }

    public boolean updateProductPrice(int productId, double newPrice) {
        boolean isProductPriceUpdated = false;

        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product.id() == productId) {
                products[index] = new Product(productId, product.name(),newPrice);
                isProductPriceUpdated = true;
                break;
            }
        }

        return isProductPriceUpdated;
    }

    public boolean deleteProduct(int productId) {
        boolean isProductDeleted = false;

        for (int index = 0; index < products.length; index++) {
            Product product = products[index];
            if (product.id() == productId) {
                products[index] = null;
                isProductDeleted = true;
                break;
            }
        }

        return isProductDeleted;
    }



}
