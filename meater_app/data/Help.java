package com.apptionlabs.meater_app.data;

/* loaded from: /tmp/meat/meat/classes.dex */
public class Help {
    public static final int HEADER = 0;
    public static final int PAGE = 2;
    public static final int VIDEO = 1;
    private String content;
    private String content2;
    private int deviceID;
    private int helpType;
    private boolean isHeader;
    private String thumbnail;
    private String thumbnail2;
    private String title;
    private String title2;
    private String urlIcon;
    private String youTubeID;
    private String youTubeID2;

    public String getContent() {
        return this.content;
    }

    public String getContent2() {
        return this.content2;
    }

    public int getDeviceID() {
        return this.deviceID;
    }

    public int getHelpType() {
        return this.helpType;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public String getThumbnail2() {
        return this.thumbnail2;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitle2() {
        return this.title2;
    }

    public String getUrlIcon() {
        return this.urlIcon;
    }

    public boolean isHeader() {
        return this.isHeader;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setContent2(String str) {
        this.content2 = str;
    }

    public void setDeviceID(int i10) {
        this.deviceID = i10;
    }

    public void setHeader(boolean z10) {
        this.isHeader = z10;
    }

    public void setHelpType(int i10) {
        this.helpType = i10;
    }

    public void setIsHeader(boolean z10) {
        this.isHeader = z10;
    }

    public void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public void setThumbnail2(String str) {
        this.thumbnail2 = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTitle2(String str) {
        this.title2 = str;
    }

    public void setUrlIcon(String str) {
        this.urlIcon = str;
    }

    public void setYouTubeID(String str) {
        this.youTubeID = str;
    }

    public void setYouTubeID2(String str) {
        this.youTubeID2 = str;
    }

    public String youTubeID() {
        return this.youTubeID;
    }

    public String youTubeID2() {
        return this.youTubeID2;
    }
}
