class ProductSearchRunner {
    public static void main(String[] args) {
        String product = "kurtha";
        double price = ProductSearch.getPriceByProduct(product);
        System.out.println("Price: " + price);

        product = "watch";
        price = ProductSearch.getPriceByProduct(product);
        System.out.println("Price: " + price);

        product = "glows";
        price = ProductSearch.getPriceByProduct(product);
        System.out.println("Price: " + price);

        String[] brands = ProductSearch.getBrandsByProduct("kurtha");
        System.out.println("kurtha Brands:");
        for (String brand : brands)
			{
            System.out.println(brand);
        }

        brands = ProductSearch.getBrandsByProduct("cooker");
        System.out.println("cooker Brands:");
        for (String brand : brands) 
		{
            System.out.println(brand);
        }

        brands = ProductSearch.getBrandsByProduct("noProduct");
        System.out.println("not available");
        for (String brand : brands) 
		{
            System.out.println(brand);
        }

        ProductSearch.searchProductAvailability("kurtha");
        ProductSearch.searchProductAvailability("Smartwatch");
        ProductSearch.searchProductAvailability("no product");
    }
}
