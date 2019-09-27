package uz.coder.firstdev.model;

public class ChannelItem {
    private String imgUrl;
    private String name;
    private int subscriberInfo;
    private int videoCount;
    private boolean isSubscrib;

    public ChannelItem(String imgUrl, String name, int subscriberInfo, int videoCount) {
        this.imgUrl = imgUrl;
        this.name = name;
        this.subscriberInfo = subscriberInfo;
        this.videoCount = videoCount;

    }

    public ChannelItem() {
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubscriberInfo() {
        return subscriberInfo;
    }

    public void setSubscriberInfo(int subscriberInfo) {
        this.subscriberInfo = subscriberInfo;
    }

    public int getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(int videoCount) {
        this.videoCount = videoCount;
    }

    public boolean isSubscrib() {
        return isSubscrib;
    }

    public void setSubscrib(boolean subscrib) {
        isSubscrib = subscrib;
    }
}
