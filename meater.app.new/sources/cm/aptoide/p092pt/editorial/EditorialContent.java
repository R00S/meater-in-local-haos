package cm.aptoide.p092pt.editorial;

import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.app.mmpcampaigns.Campaign;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class EditorialContent {
    private final String actionTitle;
    private final float avg;
    private List<String> bdsFlags;
    private Campaign campaign;
    private final String graphic;
    private boolean hasAppc;
    private final String icon;

    /* renamed from: id */
    private final long f8876id;
    private final boolean isPlaceHolder;
    private final String md5sum;
    private final List<EditorialMedia> media;
    private final String message;
    private final String name;
    private final Obb obb;
    private final String packageName;
    private final String path;
    private final String pathAlt;
    private final int position;
    private String rank;
    private final List<String> requiredSplits;
    private final long size;
    private final List<Split> splits;
    private final long storeId;
    private final String storeName;
    private final String title;
    private final String type;
    private final String url;
    private final int verCode;
    private final String verName;

    public EditorialContent(String str, List<EditorialMedia> list, String str2, String str3, long j2, String str4, String str5, float f2, String str6, long j3, String str7, Obb obb, long j4, String str8, String str9, int i2, String str10, String str11, String str12, String str13, String str14, int i3, List<Split> list2, List<String> list3, boolean z, String str15, List<String> list4, Campaign campaign) {
        this.title = str;
        this.media = list;
        this.message = str2;
        this.type = str3;
        this.f8876id = j2;
        this.name = str4;
        this.icon = str5;
        this.avg = f2;
        this.packageName = str6;
        this.size = j3;
        this.graphic = str7;
        this.obb = obb;
        this.storeId = j4;
        this.storeName = str8;
        this.verName = str9;
        this.verCode = i2;
        this.path = str10;
        this.pathAlt = str11;
        this.md5sum = str12;
        this.actionTitle = str13;
        this.url = str14;
        this.position = i3;
        this.splits = list2;
        this.requiredSplits = list3;
        this.rank = str15;
        this.isPlaceHolder = true;
        this.hasAppc = z;
        this.bdsFlags = list4;
        this.campaign = campaign;
    }

    public String getActionTitle() {
        return this.actionTitle;
    }

    public String getActionUrl() {
        return this.url;
    }

    public String getAppName() {
        return this.name;
    }

    public List<String> getBdsFlags() {
        return this.bdsFlags;
    }

    public Campaign getCampaign() {
        return this.campaign;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public String getIcon() {
        return this.icon;
    }

    public long getId() {
        return this.f8876id;
    }

    public String getMd5sum() {
        return this.md5sum;
    }

    public List<EditorialMedia> getMedia() {
        return this.media;
    }

    public String getMessage() {
        return this.message;
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

    public int getPosition() {
        return this.position;
    }

    public String getRank() {
        return this.rank;
    }

    public float getRating() {
        return this.avg;
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

    public long getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public int getVerCode() {
        return this.verCode;
    }

    public String getVerName() {
        return this.verName;
    }

    public boolean hasAction() {
        return !this.actionTitle.equals(HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public boolean hasAnyMediaDescription() {
        Iterator<EditorialMedia> it = this.media.iterator();
        while (it.hasNext()) {
            if (it.next().hasDescription()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAppc() {
        return this.hasAppc;
    }

    public boolean hasListOfMedia() {
        return hasMedia() && this.media.size() > 1;
    }

    public boolean hasMedia() {
        List<EditorialMedia> list = this.media;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean hasMessage() {
        String str = this.message;
        return (str == null || str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) ? false : true;
    }

    public boolean hasTitle() {
        String str = this.title;
        return (str == null || str.equals(HttpUrl.FRAGMENT_ENCODE_SET)) ? false : true;
    }

    public boolean isPlaceHolderType() {
        return this.isPlaceHolder;
    }

    public EditorialContent(String str, List<EditorialMedia> list, String str2, String str3, String str4, String str5, int i2) {
        this.title = str;
        this.media = list;
        this.message = str2;
        this.type = str3;
        this.actionTitle = str4;
        this.url = str5;
        this.position = i2;
        this.isPlaceHolder = false;
        this.f8876id = -1L;
        this.name = HttpUrl.FRAGMENT_ENCODE_SET;
        this.icon = null;
        this.avg = 0.0f;
        this.packageName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.size = 0L;
        this.graphic = HttpUrl.FRAGMENT_ENCODE_SET;
        this.obb = null;
        this.storeId = -1L;
        this.storeName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.verName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.verCode = -1;
        this.path = HttpUrl.FRAGMENT_ENCODE_SET;
        this.pathAlt = HttpUrl.FRAGMENT_ENCODE_SET;
        this.md5sum = HttpUrl.FRAGMENT_ENCODE_SET;
        this.splits = null;
        this.requiredSplits = null;
        this.hasAppc = false;
        this.rank = HttpUrl.FRAGMENT_ENCODE_SET;
        this.bdsFlags = null;
        this.campaign = null;
    }

    public EditorialContent(String str, List<EditorialMedia> list, String str2, String str3, long j2, String str4, String str5, float f2, String str6, long j3, String str7, Obb obb, long j4, String str8, String str9, int i2, String str10, String str11, String str12, int i3, List<Split> list2, List<String> list3, boolean z, String str13, List<String> list4, Campaign campaign) {
        this.title = str;
        this.media = list;
        this.message = str2;
        this.type = str3;
        this.f8876id = j2;
        this.name = str4;
        this.icon = str5;
        this.avg = f2;
        this.packageName = str6;
        this.size = j3;
        this.graphic = str7;
        this.obb = obb;
        this.storeId = j4;
        this.storeName = str8;
        this.verName = str9;
        this.verCode = i2;
        this.path = str10;
        this.pathAlt = str11;
        this.md5sum = str12;
        this.position = i3;
        this.splits = list2;
        this.requiredSplits = list3;
        this.hasAppc = z;
        this.rank = str13;
        this.isPlaceHolder = true;
        this.bdsFlags = list4;
        this.actionTitle = HttpUrl.FRAGMENT_ENCODE_SET;
        this.url = HttpUrl.FRAGMENT_ENCODE_SET;
        this.campaign = campaign;
    }

    public EditorialContent(String str, List<EditorialMedia> list, String str2, String str3, int i2) {
        this.title = str;
        this.media = list;
        this.message = str2;
        this.type = str3;
        this.position = i2;
        this.isPlaceHolder = false;
        this.f8876id = -1L;
        this.name = HttpUrl.FRAGMENT_ENCODE_SET;
        this.icon = null;
        this.avg = 0.0f;
        this.packageName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.size = 0L;
        this.graphic = HttpUrl.FRAGMENT_ENCODE_SET;
        this.obb = null;
        this.storeId = -1L;
        this.storeName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.verName = HttpUrl.FRAGMENT_ENCODE_SET;
        this.verCode = -1;
        this.path = HttpUrl.FRAGMENT_ENCODE_SET;
        this.pathAlt = HttpUrl.FRAGMENT_ENCODE_SET;
        this.md5sum = HttpUrl.FRAGMENT_ENCODE_SET;
        this.actionTitle = HttpUrl.FRAGMENT_ENCODE_SET;
        this.url = HttpUrl.FRAGMENT_ENCODE_SET;
        this.splits = null;
        this.requiredSplits = null;
        this.bdsFlags = null;
        this.hasAppc = false;
        this.rank = HttpUrl.FRAGMENT_ENCODE_SET;
        this.campaign = null;
    }
}
