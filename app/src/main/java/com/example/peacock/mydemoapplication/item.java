package com.example.peacock.mydemoapplication;

import android.view.View;

/**
 * Created by peacock on 6/15/16.
 */
public class item {
    private String itenname;
    private int imgid;
    private int imgindustry;

    public item(String itenname, int imgid,int imgindustry) {
        this.itenname = itenname;
        this.imgid = imgid;
        this.imgindustry=imgindustry;
    }

    public void setItenname(String itenname){
        this.itenname=itenname;
    }
    public String getItenname(){
        return itenname;
    }
    public int getImgid(){
        return  imgid;
    }
    public void setImgid(int imgid){
        this.imgid=imgid;
    }
    public int getImgindustry()
    {
        return imgindustry;
    }
    public void  setImgindustry(int imgindustry){
        this.imgindustry=imgindustry;
    }
}
