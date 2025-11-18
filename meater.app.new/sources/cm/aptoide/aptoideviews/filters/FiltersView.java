package cm.aptoide.aptoideviews.filters;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.aptoideviews.C1103R;
import cm.aptoide.aptoideviews.filters.FilterEventListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C10782c0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.C11234e;

/* compiled from: FiltersView.kt */
@Metadata(m32266d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r*\u0001\u000e\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0016H\u0007J\u0016\u0010\u0017\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0014\u0010\u001b\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0010\u0010\u001c\u001a\u00020\u00142\b\b\u0001\u0010\u001d\u001a\u00020\u0007J\u0017\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\u00142\b\b\u0001\u0010\"\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m32267d2 = {"Lcm/aptoide/aptoideviews/filters/FiltersView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "controller", "Lcm/aptoide/aptoideviews/filters/FiltersController;", "filterChangedEventsListener", "Lcm/aptoide/aptoideviews/filters/FiltersChangedEventListener;", "filterEventListener", "cm/aptoide/aptoideviews/filters/FiltersView$filterEventListener$1", "Lcm/aptoide/aptoideviews/filters/FiltersView$filterEventListener$1;", "filters", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/aptoideviews/filters/Filter;", "clearFilters", HttpUrl.FRAGMENT_ENCODE_SET, "filtersChangedEvents", "Lrx/Observable;", "generateIds", "getFilters", "initViews", "refreshData", "setFilters", "setFiltersBackgroundRes", "background", "setFiltersChangedEventsListener", "listener", "setFiltersChangedEventsListener$aptoide_views_prodRelease", "setFiltersTextColorStateList", "color", "aptoide-views_prodRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class FiltersView extends FrameLayout {
    public Map<Integer, View> _$_findViewCache;
    private FiltersController controller;
    private FiltersChangedEventListener filterChangedEventsListener;
    private final FiltersView$filterEventListener$1 filterEventListener;
    private List<Filter> filters;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FiltersView(Context context) {
        this(context, null, 0, 6, null);
        C9801m.m32346f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FiltersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9801m.m32346f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [cm.aptoide.aptoideviews.filters.FilterEventListener, cm.aptoide.aptoideviews.filters.FiltersView$filterEventListener$1] */
    public FiltersView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C9801m.m32346f(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.filters = new ArrayList();
        ?? r3 = new FilterEventListener() { // from class: cm.aptoide.aptoideviews.filters.FiltersView$filterEventListener$1

            /* compiled from: FiltersView.kt */
            @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FilterEventListener.EventType.values().length];
                    iArr[FilterEventListener.EventType.CLEAR_EVENT_CLICK.ordinal()] = 1;
                    iArr[FilterEventListener.EventType.FILTER_CLICK.ordinal()] = 2;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // cm.aptoide.aptoideviews.filters.FilterEventListener
            public void onFilterEvent(FilterEventListener.EventType eventType, Filter filter) {
                int iM38594Z;
                C9801m.m32346f(eventType, "eventType");
                int i3 = WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
                if (i3 == 1) {
                    this.this$0.clearFilters();
                    return;
                }
                if (i3 == 2 && (iM38594Z = C10782c0.m38594Z(this.this$0.filters, filter)) >= 0) {
                    ArrayList arrayList = new ArrayList(this.this$0.filters);
                    arrayList.set(iM38594Z, new Filter(((Filter) this.this$0.filters.get(iM38594Z)).getName(), true ^ ((Filter) this.this$0.filters.get(iM38594Z)).getSelected(), ((Filter) this.this$0.filters.get(iM38594Z)).getIdentifier()));
                    List<Filter> listM38569E0 = C10782c0.m38569E0(arrayList);
                    this.this$0.setFilters(listM38569E0);
                    FiltersChangedEventListener filtersChangedEventListener = this.this$0.filterChangedEventsListener;
                    if (filtersChangedEventListener != null) {
                        filtersChangedEventListener.onFiltersChanged(listM38569E0);
                    }
                }
            }
        };
        this.filterEventListener = r3;
        this.controller = new FiltersController(r3);
        FrameLayout.inflate(context, C1103R.layout.filters_view_layout, this);
        initViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearFilters() {
        ArrayList arrayList = new ArrayList(this.filters);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, new Filter(this.filters.get(i2).getName(), false, this.filters.get(i2).getIdentifier()));
        }
        setFilters(C10782c0.m38569E0(arrayList));
        FiltersChangedEventListener filtersChangedEventListener = this.filterChangedEventsListener;
        if (filtersChangedEventListener != null) {
            filtersChangedEventListener.onFiltersChanged(C10782c0.m38569E0(arrayList));
        }
    }

    private final void generateIds(List<Filter> filters) {
        Iterator<Filter> it = filters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            it.next().setId$aptoide_views_prodRelease(i2);
            i2++;
        }
    }

    private final void initViews() {
        ((FiltersRecyclerView) _$_findCachedViewById(C1103R.id.filters_recycler_view)).setController(this.controller);
        this.controller.getAdapter().registerAdapterDataObserver(new RecyclerView.AbstractC0596i() { // from class: cm.aptoide.aptoideviews.filters.FiltersView.initViews.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
            public void onItemRangeInserted(int positionStart, int itemCount) {
                RecyclerView.AbstractC0602o layoutManager;
                if (positionStart != 0 || (layoutManager = ((FiltersRecyclerView) FiltersView.this._$_findCachedViewById(C1103R.id.filters_recycler_view)).getLayoutManager()) == null) {
                    return;
                }
                layoutManager.scrollToPosition(0);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
            public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
                RecyclerView.AbstractC0602o layoutManager;
                if (fromPosition <= toPosition || (layoutManager = ((FiltersRecyclerView) FiltersView.this._$_findCachedViewById(C1103R.id.filters_recycler_view)).getLayoutManager()) == null) {
                    return;
                }
                layoutManager.scrollToPosition(toPosition);
            }
        });
    }

    private final void refreshData() {
        this.controller.setData(this.filters);
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i2) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i2);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    public final C11234e<List<Filter>> filtersChangedEvents() {
        C11234e<List<Filter>> c11234eM40048l = C11234e.m40048l(new FilterChangedEventOnSubscribe(this));
        C9801m.m32345e(c11234eM40048l, "create(FilterChangedEventOnSubscribe(this))");
        return c11234eM40048l;
    }

    public final List<Filter> getFilters() {
        return this.filters;
    }

    public final void setFilters(List<Filter> filters) {
        C9801m.m32346f(filters, "filters");
        generateIds(filters);
        this.filters = filters;
        refreshData();
    }

    public final void setFiltersBackgroundRes(int background) {
        this.controller.setBackgroundRes(Integer.valueOf(background));
    }

    public final void setFiltersChangedEventsListener$aptoide_views_prodRelease(FiltersChangedEventListener listener) {
        this.filterChangedEventsListener = listener;
    }

    public final void setFiltersTextColorStateList(int color) {
        this.controller.setTextColor(Integer.valueOf(color));
    }

    public /* synthetic */ FiltersView(Context context, AttributeSet attributeSet, int i2, int i3, C9789g c9789g) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
