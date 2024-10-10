package com.example.demo.store;

public class StoreTest {
    public static void main(String[] args) {
        Store store1 = new Store("매머드","서울",7,21);
        Store store2 = new Store("깐부치킨","서울",11,1);
        if(store1.getId() != 1 && store1.getName().equals("메머드")) System.out.println("메머드 커피가 틀렸습니다.");
        if(store2.getId() != 2 && store2.getName().equals("깐부치킨")) System.out.println("깐부치킨이 틀렸습니다.");
        Store store3 = new Store(null,null,0,0);
        if(store3.getId() != 3) System.out.println("세번째커피집 틀렸습니다.");
    }
}
