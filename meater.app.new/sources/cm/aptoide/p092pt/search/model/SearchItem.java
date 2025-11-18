package cm.aptoide.p092pt.search.model;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: SearchItem.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m32267d2 = {"Lcm/aptoide/pt/search/model/SearchItem;", HttpUrl.FRAGMENT_ENCODE_SET, "getId", HttpUrl.FRAGMENT_ENCODE_SET, "getType", "Lcm/aptoide/pt/search/model/SearchItem$Type;", "Type", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface SearchItem {

    /* compiled from: SearchItem.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m32267d2 = {"Lcm/aptoide/pt/search/model/SearchItem$Type;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "LOADING", "APP", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public enum Type {
        LOADING,
        APP
    }

    long getId();

    Type getType();
}
