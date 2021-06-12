package com.builder;

public class Main {

    public static void main(String[] args) {
        PaymentInformation payU=new PaymentInformation.PaymentInformationBuilder(10.0,"Tushar","XYZ")
                .remarks("Builder Test")
                .build();
        System.out.println(payU.toString());
    }
}
