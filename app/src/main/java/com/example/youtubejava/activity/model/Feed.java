package com.example.youtubejava.activity.model;

import java.util.List;

/**
 * Created by Eldor Turgunov on 26.05.2022.
 * YouTube Java
 * eldorturgunov777@gmail.com
 */
public class Feed {
    int profile;
    int photo;
    List<Shorts> shorts;

    public Feed(int profile, int photo, List<Shorts> shorts) {
        this.profile = profile;
        this.photo = photo;
        this.shorts = shorts;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public List<Shorts> getShorts() {
        return shorts;
    }

    public void setShorts(List<Shorts> shorts) {
        this.shorts = shorts;
    }
}
