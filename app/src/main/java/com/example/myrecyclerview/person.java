package com.example.myrecyclerview;

public class person {
    int id,imageId;
    String personName,personInfo;

    public person(int id, String personName, String personInfo,int imageId) {
        this.id = id;
        this.personName = personName;
        this.personInfo = personInfo;
        this.imageId=imageId;

    }

    public int getId() {
        return id;
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonInfo() {
        return personInfo;
    }

    public int getImageId() {
        return imageId;
    }
}
