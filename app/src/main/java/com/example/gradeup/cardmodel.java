package com.example.gradeup;

import android.widget.ImageView;

public class cardmodel {
    String corsename,title;
    int image;

    public cardmodel(String corsename, String title, int image) {
        this.corsename = corsename;
        this.title = title;
        this.image = image;
    }

    public String getCorsename() {
        return corsename;
    }

    public void setCorsename(String corsename) {
        this.corsename = corsename;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
