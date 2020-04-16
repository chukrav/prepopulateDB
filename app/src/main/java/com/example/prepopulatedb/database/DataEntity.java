package com.example.prepopulatedb.database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class DataEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String imageUrl;
    private String title;
    private String text;

    public DataEntity(String imageUrl, String title, String text) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static DataEntity[] populateData() {

        return new DataEntity[] {
                new DataEntity("image1.jpg", "title1", "text1"),
                new DataEntity("image2.jpg", "title2", "text2"),
                new DataEntity("image3.jpg", "title3", "text3"),
                new DataEntity("image4.jpg", "title4", "text4"),
                new DataEntity("image5.jpg", "title5", "text5")
        };
    }
}
