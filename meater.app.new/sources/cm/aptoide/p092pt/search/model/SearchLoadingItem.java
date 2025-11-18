package cm.aptoide.p092pt.search.model;

import cm.aptoide.p092pt.search.model.SearchItem;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: SearchLoadingItem.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m32267d2 = {"Lcm/aptoide/pt/search/model/SearchLoadingItem;", "Lcm/aptoide/pt/search/model/SearchItem;", "()V", "getId", HttpUrl.FRAGMENT_ENCODE_SET, "getType", "Lcm/aptoide/pt/search/model/SearchItem$Type;", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SearchLoadingItem implements SearchItem {
    @Override // cm.aptoide.p092pt.search.model.SearchItem
    public long getId() {
        return SearchItem.Type.LOADING.ordinal();
    }

    @Override // cm.aptoide.p092pt.search.model.SearchItem
    public SearchItem.Type getType() {
        return SearchItem.Type.LOADING;
    }
}
