package cm.aptoide.aptoideviews.filters;

import java.util.List;
import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: FiltersChangedEventListener.kt */
@Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, m32267d2 = {"Lcm/aptoide/aptoideviews/filters/FiltersChangedEventListener;", HttpUrl.FRAGMENT_ENCODE_SET, "onFiltersChanged", HttpUrl.FRAGMENT_ENCODE_SET, "filters", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/filters/Filter;", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface FiltersChangedEventListener {
    void onFiltersChanged(List<Filter> filters);
}
