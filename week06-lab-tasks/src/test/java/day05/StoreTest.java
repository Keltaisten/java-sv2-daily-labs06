package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

        Store store = new Store();

    @BeforeEach
    void init(){
        store.addProduct(new Product("kifli", Type.BAKERY,40));
        store.addProduct(new Product("kenyér", Type.BAKERY,250));
        store.addProduct(new Product("tej", Type.DIARY,300));
        store.addProduct(new Product("tej", Type.DIARY,300));
        store.addProduct(new Product("kifli", Type.BAKERY,40));
        store.addProduct(new Product("kifli", Type.BAKERY,40));
        store.addProduct(new Product("kifli", Type.BAKERY,40));
        store.addProduct(new Product("csirkemell", Type.MEAT,1500));
    }


    @Test
    void testNumberOfProductsByType(){
        List<ProductWithPiece> list = store.numberOfProductsByType();
        int number = 0;
        for(ProductWithPiece pwp: list){
            if(pwp.getType() == Type.BAKERY){
                number = pwp.getCount();
            }
        }
        assertEquals(5,number);
        assertEquals(3,list.size());
        assertEquals(Type.DIARY,list.get(1).getType());
    }

    @Test
    void testContainsProductNullList(){
        Product product = new Product("vaj", Type.DIARY,600);
        List<ProductWithPiece> pwp = new ArrayList<>();
        assertNull(store.containsProduct(product,pwp));
    }

}