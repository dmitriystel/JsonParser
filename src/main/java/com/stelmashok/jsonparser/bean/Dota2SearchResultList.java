package com.stelmashok.jsonparser.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Dota2SearchResultList {
    String name;
    Platform platform;
    String releaseDate;
    String reviewSummaryResult;
    String price;
    // List<Dota2SearchResultList> resultLists = new ArrayList<>();


    public Dota2SearchResultList() {
    }

    public Dota2SearchResultList(String name, Platform platform, String releaseDate, String reviewSummaryResult, String price) {
        this.name = name;
        this.platform = platform;
        this.releaseDate = releaseDate;
        this.reviewSummaryResult = reviewSummaryResult;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReviewSummaryResult() {
        return reviewSummaryResult;
    }

    public void setReviewSummaryResult(String reviewSummaryResult) {
        this.reviewSummaryResult = reviewSummaryResult;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

//    public List<Dota2SearchResultList> getResultLists() {
//        return resultLists;
//    }

//    public void setResultLists(ArrayList<Dota2SearchResultList> resultLists) {
//        this.resultLists = resultLists;
//    }

//    public List<Dota2SearchResultList> addGameToList(Dota2SearchResultList dota2SearchResultList){
//        resultLists.add(dota2SearchResultList);
//        return resultLists;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dota2SearchResultList)) return false;
        Dota2SearchResultList that = (Dota2SearchResultList) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getPlatform(), that.getPlatform()) && Objects.equals(getReleaseDate(), that.getReleaseDate()) && Objects.equals(getReviewSummaryResult(), that.getReviewSummaryResult()) && Objects.equals(getPrice(), that.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPlatform(), getReleaseDate(), getReviewSummaryResult(), getPrice());
    }

    @Override
    public String toString() {
        return "Dota2SearchResultList{" +
                "name='" + name + '\'' +
                ", platform=" + platform +
                ", releaseDate='" + releaseDate + '\'' +
                ", reviewSummaryResult='" + reviewSummaryResult + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
