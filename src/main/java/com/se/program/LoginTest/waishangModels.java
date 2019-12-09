package com.se.program.LoginTest;

public class waishangModels {

    private String waishangshuoming;
    private  String gaizhangImg;
    private  String teshuImg;


    public waishangModels() {
    }

    public waishangModels(String waishangshuoming, String gaizhangImg, String teshuImg) {
        this.waishangshuoming = waishangshuoming;
        this.gaizhangImg = gaizhangImg;
        this.teshuImg = teshuImg;
    }
    public String getWaishangshuoming() {
        return waishangshuoming;
    }

    public String getGaizhangImg() {
        return gaizhangImg;
    }

    public String getTeshuImg() {
        return teshuImg;
    }

    public void setWaishangshuoming(String waishangshuoming) {
        this.waishangshuoming = waishangshuoming;
    }

    public void setGaizhangImg(String gaizhangImg) {
        this.gaizhangImg = gaizhangImg;
    }

    public void setTeshuImg(String teshuImg) {
        this.teshuImg = teshuImg;
    }

}
