package com.company.ioc;

import java.util.Arrays;
import java.util.Base64;

public class Main {

    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // Base 64 encoding
        Base64Encoder base64Encoder = new Base64Encoder();
        String base64Result = base64Encoder.encode(url);

        System.out.println(base64Result);

        // Url encoding
        IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);

        System.out.println(urlResult);

        // DI
        Encoder encoder = new Encoder(new Base64Encoder());
        String result = encoder.encode(url);

        System.out.println(result);
    }
}
