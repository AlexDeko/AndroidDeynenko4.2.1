package com.homework1_3.androiddeynenko421new;

import androidx.annotation.DrawableRes;

public class Notice {
    private String tittle;
    private String subtittle;
    private @DrawableRes int resId;
    private boolean isChecked;

    public Notice(String tittle, String subtittle, int resId, boolean isChecked) {
        this.tittle = tittle;
        this.subtittle = subtittle;
        this.resId = resId;
        this.isChecked = isChecked;
    }

    public String getTittle() {
        return tittle;
    }

    public String getSubtittle() {
        return subtittle;
    }

    public int getResId() {
        return resId;
    }

    public boolean getIsChecked() {
        return isChecked;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setSubtittle(String subtittle) {
        this.subtittle = subtittle;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "tittle='" + tittle + '\'' +
                ", subtittle='" + subtittle + '\'' +
                ", imageID=" + resId +
                ", checkBox=" + isChecked +
                '}';
    }


}
