package cm.aptoide.p092pt.database.room;

import java.util.List;

/* loaded from: classes.dex */
public class RoomUpdate {
    private String alternativeApkPath;
    private String apkPath;
    private long appId;
    private List<RoomCampaignUrl> downloadCampaigns;
    private boolean excluded;
    private boolean hasAppc;
    private String icon;
    private String label;
    private String mainObbMd5;
    private String mainObbName;
    private String mainObbPath;
    private String md5;
    private String packageName;
    private String patchObbMd5;
    private String patchObbName;
    private String patchObbPath;
    private List<String> requiredSplits;
    private List<RoomSplit> roomSplits;
    private long size;
    private String storeName;
    private String trustedBadge;
    private int updateVersionCode;
    private String updateVersionName;

    public RoomUpdate(long j2, String str, String str2, String str3, String str4, String str5, long j3, String str6, String str7, int i2, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z, List<RoomSplit> list, List<String> list2, String str15, List<RoomCampaignUrl> list3) {
        this.appId = j2;
        this.label = str;
        this.icon = str2;
        this.packageName = str3;
        this.md5 = str4;
        this.apkPath = str5;
        this.size = j3;
        this.updateVersionName = str6;
        this.alternativeApkPath = str7;
        this.updateVersionCode = i2;
        this.trustedBadge = str8;
        this.mainObbName = str9;
        this.mainObbPath = str10;
        this.mainObbMd5 = str11;
        this.patchObbName = str12;
        this.patchObbPath = str13;
        this.patchObbMd5 = str14;
        this.hasAppc = z;
        this.roomSplits = list;
        this.requiredSplits = list2;
        this.storeName = str15;
        this.downloadCampaigns = list3;
    }

    public String getAlternativeApkPath() {
        return this.alternativeApkPath;
    }

    public String getApkPath() {
        return this.apkPath;
    }

    public long getAppId() {
        return this.appId;
    }

    public List<RoomCampaignUrl> getDownloadCampaigns() {
        return this.downloadCampaigns;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getLabel() {
        return this.label;
    }

    public String getMainObbMd5() {
        return this.mainObbMd5;
    }

    public String getMainObbName() {
        return this.mainObbName;
    }

    public String getMainObbPath() {
        return this.mainObbPath;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPatchObbMd5() {
        return this.patchObbMd5;
    }

    public String getPatchObbName() {
        return this.patchObbName;
    }

    public String getPatchObbPath() {
        return this.patchObbPath;
    }

    public List<String> getRequiredSplits() {
        return this.requiredSplits;
    }

    public List<RoomSplit> getRoomSplits() {
        return this.roomSplits;
    }

    public long getSize() {
        return this.size;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getTrustedBadge() {
        return this.trustedBadge;
    }

    public int getUpdateVersionCode() {
        return this.updateVersionCode;
    }

    public String getUpdateVersionName() {
        return this.updateVersionName;
    }

    public boolean hasAppc() {
        return this.hasAppc;
    }

    public boolean hasSplits() {
        List<RoomSplit> list = this.roomSplits;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isExcluded() {
        return this.excluded;
    }

    public void setExcluded(boolean z) {
        this.excluded = z;
    }
}
