public class Program {
    public static void main(String[] args) {
        baseProduct milk = new milk("Молоко 'Каждый день'", 79.99, 1,
                "шт", 0.9, 2.5, "неделя");
        baseProduct bread = new bread("Хлеб 'Каждый день'", 49.99, 1,
                "шт", "3 дня", "ржаная");
        baseProduct eggs = new eggs("Яйца 'Каждый день'", 89.99, 1,
                "шт", "21 день", 9);
        baseProduct lemonade = new lemonade("Лимонад 'Coca-Cola'", 100.0, 1,
                "шт", 0.33);
        baseProduct pacifier = new pacifier("Соска 'Каждый день'", 99.99,
                1, "шт", 0, false);
        baseProduct diapers = new diapers("Подгузники 'Каждый день'", 599.49, 1,
                "шт", 49, 20.0, 0.0,120.5, "На все случаи");
        baseProduct masks = new masks("Маски Каждый день", 149.99, 4, "шт", 5);
        baseProduct paper = new toiletPaper("Туалетная бумага 'Каждый день'", 19.89,
                1, "шт", 50, 1);

        baseProduct[] products = {milk, bread, eggs, lemonade, pacifier, diapers, masks, paper};
        System.out.println("--------");
        showProducts(products);
    }
    static void showProducts(baseProduct [] products){
        for (baseProduct product: products) {
            System.out.println(product);
            System.out.println("--------");
        }
    }
}
