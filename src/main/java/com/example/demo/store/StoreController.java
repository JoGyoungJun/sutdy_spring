package com.example.demo.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class StoreController {
    @GetMapping
    public List<Store> getAllStores() {
        return Utils.stores;
    }
    @PostMapping
    public Store saveStore(
            @RequestBody StoreRequest request
    ) {
        System.out.println(request);
        String name = "매머드";
        String address = "서울";
        int openTime = 7;
        int closeTime = 21;
        Store store = new Store(name, address, openTime, closeTime);
        Utils.stores.add(store);
        return store;
    }

    public static void main(String[] args) {
        Store store1 = new Store("매머드","서울",7,21);
        Store store2 = new Store("깐부치킨","서울",11,1);
        Utils.stores.add(store1);
        Utils.stores.add(store2);
        List<Store> allStores = new StoreController().getAllStores();
        for(int i=0;i<allStores.size();i++) {
            if(!Utils.stores.get(i).equals(allStores.get(i)))
                throw new RuntimeException();
        }
    }
}
