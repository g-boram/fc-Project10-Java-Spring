package org.example;

import java.io.IOException;

// GET /calculate?operand1=11&operator=*&operand2=55
// GET 요청이고, 해당하는 패스는 calculate 이며, 피연산자 2개 연산자 1개를 전달하면 이에 대한 결과값을 리턴해준다.
public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplicationServer(8080).start();
    }
}