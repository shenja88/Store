import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Product> prodList;

    public Store() {
        prodList = new ArrayList<>();
    }


    public void addProd(Product product) throws DuplicateProductException {
        if (prodList.contains(product)) {
            throw new DuplicateProductException(product.getId());
        }
        prodList.add(product);
    }

    public List<Product> getProdList() {
        return prodList;
    }

    public void removeProd(int id) {
        prodList.remove(new Product(id));
    }

    public void updateProd(Product product) {
        int idx = prodList.indexOf(product);
        if(idx >= 0){
            prodList.set(idx, product);
        }
    }
}



