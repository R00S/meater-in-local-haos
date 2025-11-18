package cm.aptoide.aptoideviews.filters;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: FilterEventListener.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\t"}, m32267d2 = {"Lcm/aptoide/aptoideviews/filters/FilterEventListener;", HttpUrl.FRAGMENT_ENCODE_SET, "onFilterEvent", HttpUrl.FRAGMENT_ENCODE_SET, "eventType", "Lcm/aptoide/aptoideviews/filters/FilterEventListener$EventType;", "filter", "Lcm/aptoide/aptoideviews/filters/Filter;", "EventType", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public interface FilterEventListener {

    /* compiled from: FilterEventListener.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m32267d2 = {"Lcm/aptoide/aptoideviews/filters/FilterEventListener$EventType;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "FILTER_CLICK", "CLEAR_EVENT_CLICK", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public enum EventType {
        FILTER_CLICK,
        CLEAR_EVENT_CLICK
    }

    void onFilterEvent(EventType eventType, Filter filter);
}
