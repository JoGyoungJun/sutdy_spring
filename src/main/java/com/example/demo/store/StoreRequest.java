package com.example.demo.store;
// 모든 필드가 파이널이고, 모든 필드에 대한 겟터가 필요할때,
public record StoreRequest(String name, String address, int openTime, int closeTime) {

}
