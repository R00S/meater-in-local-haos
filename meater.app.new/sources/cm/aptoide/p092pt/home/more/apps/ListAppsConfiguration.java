package cm.aptoide.p092pt.home.more.apps;

import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ListAppsConfiguration.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000eJJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, m32267d2 = {"Lcm/aptoide/pt/home/more/apps/ListAppsConfiguration;", HttpUrl.FRAGMENT_ENCODE_SET, "title", HttpUrl.FRAGMENT_ENCODE_SET, StoreTabGridRecyclerFragment.BundleCons.TAG, "action", "eventName", "groupId", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getAction", "()Ljava/lang/String;", "getEventName", "getGroupId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTag", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcm/aptoide/pt/home/more/apps/ListAppsConfiguration;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ListAppsConfiguration {
    private final String action;
    private final String eventName;
    private final Long groupId;
    private final String tag;
    private final String title;

    public ListAppsConfiguration(String str, String str2, String str3, String str4, Long l) {
        this.title = str;
        this.tag = str2;
        this.action = str3;
        this.eventName = str4;
        this.groupId = l;
    }

    public static /* synthetic */ ListAppsConfiguration copy$default(ListAppsConfiguration listAppsConfiguration, String str, String str2, String str3, String str4, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = listAppsConfiguration.title;
        }
        if ((i2 & 2) != 0) {
            str2 = listAppsConfiguration.tag;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = listAppsConfiguration.action;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = listAppsConfiguration.eventName;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            l = listAppsConfiguration.groupId;
        }
        return listAppsConfiguration.copy(str, str5, str6, str7, l);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getGroupId() {
        return this.groupId;
    }

    public final ListAppsConfiguration copy(String title, String tag, String action, String eventName, Long groupId) {
        return new ListAppsConfiguration(title, tag, action, eventName, groupId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListAppsConfiguration)) {
            return false;
        }
        ListAppsConfiguration listAppsConfiguration = (ListAppsConfiguration) other;
        return C9801m.m32341a(this.title, listAppsConfiguration.title) && C9801m.m32341a(this.tag, listAppsConfiguration.tag) && C9801m.m32341a(this.action, listAppsConfiguration.action) && C9801m.m32341a(this.eventName, listAppsConfiguration.eventName) && C9801m.m32341a(this.groupId, listAppsConfiguration.groupId);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Long getGroupId() {
        return this.groupId;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.action;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.eventName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.groupId;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        return "ListAppsConfiguration(title=" + this.title + ", tag=" + this.tag + ", action=" + this.action + ", eventName=" + this.eventName + ", groupId=" + this.groupId + ')';
    }
}
