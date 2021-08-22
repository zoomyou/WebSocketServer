package com.example.demo.service;

import com.example.demo.controller.WebSocketServer;

public class MyThread extends Thread {
    private WebSocketServer webSocketServer;

    public MyThread(WebSocketServer webSocketServer){
        this.webSocketServer = webSocketServer;
    }

    @Override
    public void run(){
        if (webSocketServer == null){
            Thread.yield();
        }
        while (true){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            webSocketServer.sendMessage("fdafds", this.webSocketServer.getSession());
        }
    }
}
