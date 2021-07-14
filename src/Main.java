import java.util.List;

public class Main {
    public static void main(String[] args) {

        Store storeGame = new Store();

        try {
            storeGame.addProd(new Product(242, "Monopoly", 190));
        } catch (DuplicateProductException e) {
            e.printStackTrace();
        }
        try {
            storeGame.addProd(new Product(12, "TicTacToe", 60));
        } catch (DuplicateProductException e) {
            e.printStackTrace();
        }
        try {
            storeGame.addProd(new Product(60, "Munchkin", 480));
        } catch (DuplicateProductException e) {
            e.printStackTrace();
        }
        try {
            storeGame.addProd(new Product(60, "Mafia", 360));
        } catch (DuplicateProductException e) {
            System.out.println(e.getMessage());
        }

        List<Product> productsList = storeGame.getProdList();
        productsList.sort(new SortByPrice().reversed());
        for (Product value : productsList) {
            System.out.println(value);
        }

        System.out.println();
        System.out.println();
        storeGame.removeProd(12);
        storeGame.updateProd(new Product(242, "Monopopoly2", 246));
        productsList = storeGame.getProdList();
        for (Product product : productsList) {
            System.out.println(product);
        }
    }
}
