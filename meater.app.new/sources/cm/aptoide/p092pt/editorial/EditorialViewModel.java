package cm.aptoide.p092pt.editorial;

import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.app.mmpcampaigns.Campaign;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class EditorialViewModel {
    private final String appName;
    private final String background;
    private final List<String> bdsFlags;
    private final Campaign campaign;
    private final String caption;
    private final String captionColor;
    private final String cardId;
    private final List<EditorialContent> contentList;
    private final Error error;
    private final String groupId;
    private final boolean hasAppc;
    private final String icon;

    /* renamed from: id */
    private final long f8878id;
    private final boolean loading;
    private final String md5sum;
    private final Obb obb;
    private final String packageName;
    private final String path;
    private final String pathAlt;
    private final List<EditorialContent> placeHolderContent;
    private final List<Integer> placeHolderPositions;
    private final String rank;
    private final List<String> requiredSplits;
    private final boolean shouldHaveAnimation;
    private final long size;
    private final List<Split> splits;
    private final String storeName;
    private final String title;
    private final int versionCode;
    private final String versionName;

    public enum Error {
        NETWORK,
        GENERIC
    }

    public EditorialViewModel(List<EditorialContent> list, String str, String str2, String str3, List<Integer> list2, List<EditorialContent> list3, boolean z, String str4, String str5, String str6) {
        this.contentList = list;
        this.title = str;
        this.caption = str2;
        this.background = str3;
        this.placeHolderPositions = list2;
        this.placeHolderContent = list3;
        this.shouldHaveAnimation = z;
        this.cardId = str4;
        this.groupId = str5;
        this.captionColor = str6;
        this.appName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.icon = null;
        this.f8878id = -1L;
        this.packageName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.md5sum = HttpUrl.FRAGMENT_ENCODE_SET;
        this.versionCode = -1;
        this.size = 0L;
        this.versionName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.path = HttpUrl.FRAGMENT_ENCODE_SET;
        this.pathAlt = HttpUrl.FRAGMENT_ENCODE_SET;
        this.obb = null;
        this.loading = false;
        this.error = null;
        this.splits = null;
        this.requiredSplits = null;
        this.bdsFlags = null;
        this.hasAppc = false;
        this.rank = HttpUrl.FRAGMENT_ENCODE_SET;
        this.storeName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.campaign = null;
    }

    String getBackgroundImage() {
        return this.background;
    }

    public List<String> getBdsFlags() {
        return this.bdsFlags;
    }

    long getBottomCardAppId() {
        return this.f8878id;
    }

    String getBottomCardAppName() {
        return this.appName;
    }

    public Campaign getBottomCardCampaign() {
        return this.campaign;
    }

    String getBottomCardIcon() {
        return this.icon;
    }

    String getBottomCardMd5() {
        return this.md5sum;
    }

    Obb getBottomCardObb() {
        return this.obb;
    }

    String getBottomCardPackageName() {
        return this.packageName;
    }

    String getBottomCardPath() {
        return this.path;
    }

    String getBottomCardPathAlt() {
        return this.pathAlt;
    }

    public List<String> getBottomCardRequiredSplits() {
        return this.requiredSplits;
    }

    public long getBottomCardSize() {
        return this.size;
    }

    public List<Split> getBottomCardSplits() {
        return this.splits;
    }

    int getBottomCardVersionCode() {
        return this.versionCode;
    }

    String getBottomCardVersionName() {
        return this.versionName;
    }

    String getCaption() {
        return this.caption;
    }

    public String getCaptionColor() {
        return this.captionColor;
    }

    public String getCardId() {
        return this.cardId;
    }

    public EditorialContent getContent(int i2) {
        return this.contentList.get(i2);
    }

    List<EditorialContent> getContentList() {
        return this.contentList;
    }

    public Error getError() {
        return this.error;
    }

    public String getGroupId() {
        return this.groupId;
    }

    List<EditorialContent> getPlaceHolderContent() {
        return this.placeHolderContent;
    }

    List<Integer> getPlaceHolderPositions() {
        return this.placeHolderPositions;
    }

    public String getRank() {
        return this.rank;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean hasAppc() {
        return this.hasAppc;
    }

    boolean hasBackgroundImage() {
        return !this.background.equals(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    boolean hasContent() {
        List<EditorialContent> list = this.contentList;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean hasError() {
        return this.error != null;
    }

    public boolean hasSplits() {
        List<Split> list = this.splits;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isLoading() {
        return this.loading;
    }

    boolean shouldHaveAnimation() {
        return this.shouldHaveAnimation;
    }

    public EditorialViewModel(boolean z) {
        this.loading = z;
        this.title = HttpUrl.FRAGMENT_ENCODE_SET;
        this.caption = HttpUrl.FRAGMENT_ENCODE_SET;
        this.background = HttpUrl.FRAGMENT_ENCODE_SET;
        this.placeHolderPositions = Collections.emptyList();
        this.contentList = Collections.emptyList();
        this.placeHolderContent = Collections.emptyList();
        this.appName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.icon = null;
        this.f8878id = -1L;
        this.groupId = HttpUrl.FRAGMENT_ENCODE_SET;
        this.packageName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.md5sum = HttpUrl.FRAGMENT_ENCODE_SET;
        this.versionCode = -1;
        this.size = 0L;
        this.versionName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.path = HttpUrl.FRAGMENT_ENCODE_SET;
        this.pathAlt = HttpUrl.FRAGMENT_ENCODE_SET;
        this.obb = null;
        this.cardId = HttpUrl.FRAGMENT_ENCODE_SET;
        this.shouldHaveAnimation = false;
        this.error = null;
        this.captionColor = HttpUrl.FRAGMENT_ENCODE_SET;
        this.splits = null;
        this.requiredSplits = null;
        this.bdsFlags = null;
        this.hasAppc = false;
        this.rank = HttpUrl.FRAGMENT_ENCODE_SET;
        this.storeName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.campaign = null;
    }

    public EditorialViewModel(Error error) {
        this.error = error;
        this.loading = false;
        this.contentList = Collections.emptyList();
        this.title = HttpUrl.FRAGMENT_ENCODE_SET;
        this.caption = HttpUrl.FRAGMENT_ENCODE_SET;
        this.background = HttpUrl.FRAGMENT_ENCODE_SET;
        this.placeHolderPositions = Collections.emptyList();
        this.placeHolderContent = Collections.emptyList();
        this.appName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.icon = null;
        this.f8878id = -1L;
        this.groupId = HttpUrl.FRAGMENT_ENCODE_SET;
        this.packageName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.md5sum = HttpUrl.FRAGMENT_ENCODE_SET;
        this.versionCode = -1;
        this.size = 0L;
        this.versionName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.path = HttpUrl.FRAGMENT_ENCODE_SET;
        this.pathAlt = HttpUrl.FRAGMENT_ENCODE_SET;
        this.cardId = HttpUrl.FRAGMENT_ENCODE_SET;
        this.obb = null;
        this.shouldHaveAnimation = false;
        this.captionColor = HttpUrl.FRAGMENT_ENCODE_SET;
        this.splits = null;
        this.requiredSplits = null;
        this.bdsFlags = null;
        this.hasAppc = false;
        this.rank = HttpUrl.FRAGMENT_ENCODE_SET;
        this.storeName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.campaign = null;
    }

    public EditorialViewModel(List<EditorialContent> list, String str, String str2, String str3, List<Integer> list2, List<EditorialContent> list3, String str4, String str5, long j2, String str6, String str7, int i2, String str8, String str9, String str10, Obb obb, boolean z, String str11, String str12, long j3, String str13, List<Split> list4, List<String> list5, boolean z2, String str14, String str15, List<String> list6, Campaign campaign) {
        this.contentList = list;
        this.title = str;
        this.caption = str2;
        this.background = str3;
        this.placeHolderPositions = list2;
        this.placeHolderContent = list3;
        this.appName = str4;
        this.icon = str5;
        this.f8878id = j2;
        this.packageName = str6;
        this.md5sum = str7;
        this.versionCode = i2;
        this.versionName = str8;
        this.path = str9;
        this.pathAlt = str10;
        this.size = j3;
        this.obb = obb;
        this.shouldHaveAnimation = z;
        this.cardId = str11;
        this.groupId = str12;
        this.captionColor = str13;
        this.splits = list4;
        this.requiredSplits = list5;
        this.bdsFlags = list6;
        this.hasAppc = z2;
        this.rank = str14;
        this.storeName = str15;
        this.campaign = campaign;
        this.error = null;
        this.loading = false;
    }
}
