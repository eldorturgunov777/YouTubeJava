package com.example.youtubejava.activity.model;

/**
 * Created by Eldor Turgunov on 27.05.2022.
 * YouTube Java
 * eldorturgunov777@gmail.com
 */
public class Shorts {
    int img;
    String title;
    String desc;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Shorts(int img, String title, String desc) {
        this.img = img;
        this.title = title;
        this.desc = desc;
    }
}
