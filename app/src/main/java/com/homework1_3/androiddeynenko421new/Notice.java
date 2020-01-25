package com.homework1_3.androiddeynenko421new;

import android.graphics.drawable.Drawable;
import android.widget.CheckBox;

public class Notice {
    private String tittle;
    private String subtittle;
    private Drawable image;
    private CheckBox checkBox;

    public Notice(String tittle, String subtittle, Drawable image, CheckBox checkBox) {
        this.tittle = tittle;
        this.subtittle = subtittle;
        this.image = image;
        this.checkBox = checkBox;
    }

    public String getTittle() {
        return tittle;
    }

    public String getSubtittle() {
        return subtittle;
    }

    public Drawable getImage() {
        return image;
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setSubtittle(String subtittle) {
        this.subtittle = subtittle;
    }

    public void setImage(Drawable imageID) {
        this.image = imageID;
    }

    public void setCheckBox(CheckBox checkBox) {
        this.checkBox = checkBox;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "tittle='" + tittle + '\'' +
                ", subtittle='" + subtittle + '\'' +
                ", imageID=" + image +
                ", checkBox=" + checkBox +
                '}';
    }


}
