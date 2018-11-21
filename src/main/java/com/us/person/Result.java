package com.us.person;

/**
 * created by zhangalong on 2018/10/30
 */
public class Result {

    private boolean temp;




    public Result(boolean temp) {
        this.temp = temp;
    }

    public boolean isTemp() {
        return temp;
    }

    public void setTemp(boolean temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Result{" +
                "temp=" + temp +
                '}';
    }
}
