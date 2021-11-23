package day05;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product p){
        productList.add(p);
    }

    public List<ProductWithPiece> numberOfProductsByType(){
        List<ProductWithPiece> result = new ArrayList<>();
        for(Product actual: productList){
            ProductWithPiece productWithPiece = containsProduct(actual,result);
            if(productWithPiece != null){
                productWithPiece.incrementCount();
            }else{
                result.add(new ProductWithPiece((actual.getType())));
            }
        }
        return result;
    }

    public ProductWithPiece containsProduct(Product actual, List<ProductWithPiece> productsPieceList) {
        for (ProductWithPiece pwp: productsPieceList){
            if(actual.getType() == pwp.getType()){
                return pwp;
            }
        }
        return null;
    }

}
