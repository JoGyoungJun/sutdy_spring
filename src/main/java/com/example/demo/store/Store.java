package com.example.demo.store;
// 1.가게
// 메머드 커피
// address :서울
// opentime : 7
// closetime : 21
// id : ai auto increse
// 2. 가게
// name : 깐부치킨
// address : 서울
// opentime : 11
// closetime : 1
// id : 2
// ...

public class Store {
    String name;
    String address;
    int openTime;
    int closeTime;
    int id;

    public Store(String name, String address, int openTime, int closeTime) {
        this.name = name;
        this.address = address;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.id = Utils.idAi++;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", openTime=" + openTime +
                ", closeTime=" + closeTime +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getOpenTime() {
        return openTime;
    }

    public int getCloseTime() {
        return closeTime;
    }

    public int getId() {
        return id;
    }


}
