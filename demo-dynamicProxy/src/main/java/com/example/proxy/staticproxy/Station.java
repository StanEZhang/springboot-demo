package com.example.proxy.staticproxy;

/**
 * @project: springboot-demo
 * @className: Station
 * @description:
 * @author: zhanghaibin
 * @create: 2023-12-28
 */
public class Station implements TicketService{
    @Override
    public void sellTicket() {
        System.out.println("\n\t售票...\n");
    }

    @Override
    public void inquire() {
        System.out.println("\n\t问询...\n");

    }

    @Override
    public void withdraw() {
        System.out.println("\n\t退票...\n");

    }
}
