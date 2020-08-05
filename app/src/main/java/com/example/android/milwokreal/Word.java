package com.example.android.milwokreal;

public class Word {
    private String milwokTranslation;
    private String englishTranslation;
    private int imageID;
    private int audioID;

    public Word(String milwokTranslation, String englishTranslation, int audioID) {
        this.milwokTranslation = milwokTranslation;
        this.englishTranslation = englishTranslation;
        this.audioID = audioID;
    }

    public Word(String milwokTranslation, String englishTranslation, int imageID, int audioID) {
        this.milwokTranslation = milwokTranslation;
        this.englishTranslation = englishTranslation;
        this.imageID = imageID;
        this.audioID = audioID;
    }

    public String getMilwokTranslation() {
        return milwokTranslation;
    }

    public void setMilwokTranslation(String milwokTranslation) {
        this.milwokTranslation = milwokTranslation;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public void setEnglishTranslation(String englishTranslation) {
        this.englishTranslation = englishTranslation;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public int getAudioID() {
        return audioID;
    }

    public void setAudioID(int audioID) {
        this.audioID = audioID;
    }


}
