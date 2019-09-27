package uz.coder.firstdev.model;

public class VideosItem {
    private String videoUrl;
    private String title;
    private int uploadTime;
    private int videoCount;


    public VideosItem(String videoUrl, String title, int uploadTime, int videoCount) {
        this.videoUrl = videoUrl;
        this.title = title;
        this.uploadTime = uploadTime;
        this.videoCount = videoCount;
    }

    public VideosItem() {
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(int uploadTime) {
        this.uploadTime = uploadTime;
    }

    public int getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(int videoCount) {
        this.videoCount = videoCount;
    }
}