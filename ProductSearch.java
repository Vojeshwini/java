class ProductSearch {
    static double getPriceByProduct(String productName) { 
        System.out.println("Running getPriceByProduct: " + productName);

        if (productName == "Laptop")
			{
            return 9000;
        } 
		else if (productName == "kurtha") 
		{
            return 250;
        } 
		else if (productName == "pencil") 
		{
            return 20;
        } 
		else if (productName == "watch")
			{
            return 500;
        } 
		else if (productName == "glows") 
		{
            return 300;
        } 
		
		else if (productName == "baloon") {
            return 40;
        } 
		else if (productName == "chair") 
		{
            return 600;
        } 
		else if (productName == "knife")
			{
            return 50;
        }
		else if (productName == "plate") 
		{
            return 350;
        } 
		else if (productName == "glass")
			{
            return 150;
        } 
		else if (productName == "ac")
			{
            return 50000;
        } 
		else if (productName == "cooker")
			{
            return 800;
        }
		else if (productName == "tab")
			{
            return 3000;
        }
		else if (productName == "tap") 
		{
            return 180;
        } 
		else if (productName == "mouse") 
		{
            return 1500;
        } else if (productName == "light")
			{
            return 100;
        } 
		else if (productName == "bulb") 
		{
            return 25;
        }
		else if (productName == "earring") 
		{
            return 120;
        } 
		else if (productName == "bangle")
			{
            return 800;
        }
		else if (productName == "coat") 
		{
            return 100;
        } 
		else if (productName == "tv") 
		{
            return 500;
        }
		else 
		{
            System.out.println("vessel");
            return 0;
        }
    }

    static String[] getBrandsByProduct(String productName) { 
        System.out.println("Running getBrandsByProduct: " + productName);

        if (productName == "kurtha") 
		{
            return new String[]{"avasa", "lehenga", "trends", "silk", "oswal"};
        }
		else if (productName == "pencil") 
		{
            return new String[]{"apsara", "classmate", "nataraj", "doms", "ab"};
        } 
		else if (productName == "cooker") 
		{
            return new String[]{"ganesh", "preeti", "hawkins", "prestige", "ayush"};
        }
		else if (productName == "watch") 
		{
            return new String[]{"Apple", "Samsung", "Garmin", "Fossil", "Fitbit"};
        } else if (productName == "mouse") 
		{
            return new String[]{"Apple", "Samsung", "Lenovo", "Huawei", "Microsoft"};
        } 
		
		else {
            System.out.println("No brands found");
            return new String[0];
        }
    }

    static void searchProductAvailability(String productName) { 
        System.out.println("Running searchProductAvailability: " + productName);

        if (productName == "kurtha" || productName == "pencil" || productName == "cooker")
			{
            System.out.println("Product is available in stock.");
        } 
		else if (productName == "watch" || productName == "mouse" || productName == "knife")
			{
            System.out.println("Product is available but in limited stock.");
        } 
		else 
		{
            System.out.println("Product is out of stock.");
        }
    }
}
