package cm.aptoide.aptoideviews.filters;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.AbstractC11245j;
import p456rx.C11234e;
import p456rx.p457l.AbstractC11247a;

/* compiled from: FilterChangedEventOnSubscribe.kt */
@Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\u00020\n2\u0014\u0010\u000b\u001a\u0010\u0012\f\b\u0000\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m32267d2 = {"Lcm/aptoide/aptoideviews/filters/FilterChangedEventOnSubscribe;", "Lrx/Observable$OnSubscribe;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/filters/Filter;", "view", "Lcm/aptoide/aptoideviews/filters/FiltersView;", "(Lcm/aptoide/aptoideviews/filters/FiltersView;)V", "getView", "()Lcm/aptoide/aptoideviews/filters/FiltersView;", "call", HttpUrl.FRAGMENT_ENCODE_SET, "subscriber", "Lrx/Subscriber;", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class FilterChangedEventOnSubscribe implements C11234e.a<List<? extends Filter>> {
    private final FiltersView view;

    public FilterChangedEventOnSubscribe(FiltersView filtersView) {
        C9801m.m32346f(filtersView, "view");
        this.view = filtersView;
    }

    public final FiltersView getView() {
        return this.view;
    }

    @Override // p456rx.p460m.InterfaceC11253b
    public void call(final AbstractC11245j<? super List<Filter>> abstractC11245j) {
        C9801m.m32346f(abstractC11245j, "subscriber");
        AbstractC11247a.verifyMainThread();
        FiltersChangedEventListener filtersChangedEventListener = new FiltersChangedEventListener() { // from class: cm.aptoide.aptoideviews.filters.FilterChangedEventOnSubscribe$call$eventListener$1
            @Override // cm.aptoide.aptoideviews.filters.FiltersChangedEventListener
            public void onFiltersChanged(List<Filter> filters) {
                C9801m.m32346f(filters, "filters");
                if (abstractC11245j.isUnsubscribed()) {
                    return;
                }
                abstractC11245j.onNext(filters);
            }
        };
        abstractC11245j.add(new AbstractC11247a() { // from class: cm.aptoide.aptoideviews.filters.FilterChangedEventOnSubscribe.call.1
            @Override // p456rx.p457l.AbstractC11247a
            protected void onUnsubscribe() {
                FilterChangedEventOnSubscribe.this.getView().setFiltersChangedEventsListener$aptoide_views_prodRelease(null);
            }
        });
        this.view.setFiltersChangedEventsListener$aptoide_views_prodRelease(filtersChangedEventListener);
    }
}
