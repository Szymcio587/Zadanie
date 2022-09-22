package com.example.demo;

public class CampaignDto {
    private Long id;
    private String name, town;
    private int bidAmount, radius, campaignFund;
    private boolean status;
    private String keywords;
    public CampaignDto() {}
    public CampaignDto(String name, String town, int bidAmount, int radius, int campaignFund, boolean status, String keywords) {
        this.name = name;
        this.town = town;
        this.bidAmount = bidAmount;
        this.radius = radius;
        this.campaignFund = campaignFund;
        this.status = status;
        this.keywords = keywords;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(int bidAmount) {
        this.bidAmount = bidAmount;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCampaignFund() {
        return campaignFund;
    }

    public void setCampaignFund(int campaignFund) {
        this.campaignFund = campaignFund;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
