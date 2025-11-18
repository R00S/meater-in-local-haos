package cm.aptoide.p092pt.editorial;

import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.mmpcampaigns.Campaign;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import cm.aptoide.p092pt.editorial.EditorialEvent;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class EditorialDownloadEvent {
    private final DownloadModel.Action action;
    private final long appId;
    private final String appName;
    private final List<String> bdsFlags;
    private final EditorialEvent.Type button;
    private final Campaign campaign;
    private final String icon;
    private final String md5sum;
    private final Obb obb;
    private final String packageName;
    private final String path;
    private final String pathAlt;
    private final List<String> requiredSplits;
    private final long size;
    private final List<Split> splits;
    private final String storeName;
    private final String trustedBadge;
    private final int verCode;
    private final String verName;

    public EditorialDownloadEvent(EditorialEvent.Type type, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, Obb obb, long j2, List<Split> list, List<String> list2, List<String> list3, Campaign campaign) {
        this.button = type;
        this.appName = str;
        this.packageName = str2;
        this.md5sum = str3;
        this.icon = str4;
        this.verName = str5;
        this.verCode = i2;
        this.path = str6;
        this.pathAlt = str7;
        this.obb = obb;
        this.trustedBadge = HttpUrl.FRAGMENT_ENCODE_SET;
        this.storeName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.appId = -1L;
        this.action = null;
        this.size = j2;
        this.splits = list;
        this.requiredSplits = list2;
        this.bdsFlags = list3;
        this.campaign = campaign;
    }

    public DownloadModel.Action getAction() {
        return this.action;
    }

    public long getAppId() {
        return this.appId;
    }

    public String getAppName() {
        return this.appName;
    }

    public List<String> getBdsFlags() {
        return this.bdsFlags;
    }

    public Campaign getCampaign() {
        return this.campaign;
    }

    public EditorialEvent.Type getClickType() {
        return this.button;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getMd5() {
        return this.md5sum;
    }

    public Obb getObb() {
        return this.obb;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getPath() {
        return this.path;
    }

    public String getPathAlt() {
        return this.pathAlt;
    }

    public List<String> getRequiredSplits() {
        return this.requiredSplits;
    }

    public long getSize() {
        return this.size;
    }

    public List<Split> getSplits() {
        return this.splits;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getTrustedBadge() {
        return this.trustedBadge;
    }

    public int getVerCode() {
        return this.verCode;
    }

    public String getVerName() {
        return this.verName;
    }

    public EditorialDownloadEvent(EditorialViewModel editorialViewModel, DownloadModel.Action action) {
        this.button = null;
        this.appName = editorialViewModel.getBottomCardAppName();
        this.packageName = editorialViewModel.getBottomCardPackageName();
        this.md5sum = editorialViewModel.getBottomCardMd5();
        this.icon = editorialViewModel.getBottomCardIcon();
        this.verName = editorialViewModel.getBottomCardVersionName();
        this.verCode = editorialViewModel.getBottomCardVersionCode();
        this.path = editorialViewModel.getBottomCardPath();
        this.pathAlt = editorialViewModel.getBottomCardPathAlt();
        this.obb = editorialViewModel.getBottomCardObb();
        this.appId = editorialViewModel.getBottomCardAppId();
        this.size = editorialViewModel.getBottomCardSize();
        this.splits = editorialViewModel.getBottomCardSplits();
        this.requiredSplits = editorialViewModel.getBottomCardRequiredSplits();
        this.bdsFlags = editorialViewModel.getBdsFlags();
        this.action = action;
        this.storeName = editorialViewModel.getStoreName();
        this.trustedBadge = editorialViewModel.getRank();
        this.campaign = editorialViewModel.getBottomCardCampaign();
    }

    public EditorialDownloadEvent(EditorialEvent.Type type, String str, String str2, int i2, long j2) {
        this.button = type;
        this.appName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.packageName = str;
        this.md5sum = str2;
        this.icon = HttpUrl.FRAGMENT_ENCODE_SET;
        this.verName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.size = 0L;
        this.verCode = i2;
        this.path = HttpUrl.FRAGMENT_ENCODE_SET;
        this.pathAlt = HttpUrl.FRAGMENT_ENCODE_SET;
        this.obb = null;
        this.appId = j2;
        this.splits = null;
        this.requiredSplits = null;
        this.bdsFlags = null;
        this.action = null;
        this.trustedBadge = HttpUrl.FRAGMENT_ENCODE_SET;
        this.storeName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.campaign = null;
    }

    public EditorialDownloadEvent(EditorialEvent.Type type, String str, String str2, int i2, long j2, DownloadModel.Action action) {
        this.button = type;
        this.appName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.packageName = str;
        this.md5sum = str2;
        this.icon = HttpUrl.FRAGMENT_ENCODE_SET;
        this.verName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.size = 0L;
        this.verCode = i2;
        this.path = HttpUrl.FRAGMENT_ENCODE_SET;
        this.pathAlt = HttpUrl.FRAGMENT_ENCODE_SET;
        this.obb = null;
        this.appId = j2;
        this.splits = null;
        this.requiredSplits = null;
        this.bdsFlags = null;
        this.trustedBadge = HttpUrl.FRAGMENT_ENCODE_SET;
        this.storeName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.action = action;
        this.campaign = null;
    }

    public EditorialDownloadEvent(EditorialEvent.Type type, String str, String str2, String str3, String str4, String str5, int i2, String str6, String str7, Obb obb, DownloadModel.Action action, long j2, List<Split> list, List<String> list2, String str8, String str9, List<String> list3, Campaign campaign) {
        this.button = type;
        this.appName = str;
        this.packageName = str2;
        this.md5sum = str3;
        this.icon = str4;
        this.verName = str5;
        this.verCode = i2;
        this.path = str6;
        this.pathAlt = str7;
        this.obb = obb;
        this.trustedBadge = str8;
        this.storeName = str9;
        this.appId = -1L;
        this.action = action;
        this.size = j2;
        this.splits = list;
        this.requiredSplits = list2;
        this.bdsFlags = list3;
        this.campaign = campaign;
    }
}
