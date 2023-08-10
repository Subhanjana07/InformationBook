package com.company.informationbook;

public class ModelClass {


    private String categoryName;
    private String imageName;

    public ModelClass(String categoryName, String imageName) {
        this.categoryName = categoryName;
        this.imageName = imageName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getImageName() {
        return imageName;
    }
}

