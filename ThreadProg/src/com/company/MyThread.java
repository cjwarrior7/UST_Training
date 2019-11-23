package com.company;

public class MyThread extends Thread{
    Resource res;

    public MyThread(Resource res) {
        this.res = res;
    }

    @Override
    public void run() {

        res.print();
    }
}

