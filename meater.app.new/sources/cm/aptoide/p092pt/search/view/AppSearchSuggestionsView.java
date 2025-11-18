package cm.aptoide.p092pt.search.view;

import android.view.MenuItem;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.widget.SearchView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.search.SuggestionCursorAdapter;
import cm.aptoide.p092pt.search.analytics.SearchAnalytics;
import cm.aptoide.p092pt.search.analytics.SearchSource;
import cm.aptoide.p092pt.search.model.Suggestion;
import cm.aptoide.p092pt.search.suggestions.SearchQueryEvent;
import cm.aptoide.p092pt.view.fragment.FragmentView;
import com.trello.rxlifecycle.InterfaceC8756b;
import java.util.List;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p297b.p302c.p303a.C8970d;
import p241e.p294g.p295a.p297b.p302c.p303a.C8973g;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class AppSearchSuggestionsView implements SearchSuggestionsView {
    private static final int COMPLETION_THRESHOLD = 0;
    private final CrashReport crashReport;
    private final String currentQuery;
    private final FragmentView parentView;
    private final C11418b<SearchQueryEvent> queryTextChangedPublisher;
    private final SearchAnalytics searchAnalytics;
    private MenuItem searchMenuItem;
    private SearchView searchView;
    private final SuggestionCursorAdapter suggestionCursorAdapter;
    private final C11234e<Void> toolbarClickObservable;
    private C11234e<MenuItem> toolbarMenuItemClick;

    public AppSearchSuggestionsView(FragmentView fragmentView, C11234e<Void> c11234e, CrashReport crashReport, SuggestionCursorAdapter suggestionCursorAdapter, C11418b<SearchQueryEvent> c11418b, C11234e<MenuItem> c11234e2, SearchAnalytics searchAnalytics) {
        this(fragmentView, c11234e, crashReport, HttpUrl.FRAGMENT_ENCODE_SET, suggestionCursorAdapter, c11418b, c11234e2, searchAnalytics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initialize$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8628a(View.LifecycleEvent lifecycleEvent) {
        return C8970d.m28566a(this.searchView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initialize$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8629b(C8973g c8973g) {
        this.queryTextChangedPublisher.onNext(new SearchQueryEvent(c8973g.m28571d().toString(), c8973g.m28570c()));
    }

    static /* synthetic */ void lambda$initialize$3(C8973g c8973g) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initialize$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8630c(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$searchMenuItemClickExpandsSearch$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8631d(View.LifecycleEvent lifecycleEvent) {
        return this.toolbarMenuItemClick;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$searchMenuItemClickExpandsSearch$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8632e(MenuItem menuItem) {
        return Boolean.valueOf(menuItem.getItemId() == this.searchMenuItem.getItemId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$searchMenuItemClickExpandsSearch$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8633f(MenuItem menuItem) {
        this.searchAnalytics.searchStart(SearchSource.SEARCH_ICON, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$searchMenuItemClickExpandsSearch$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8634g(MenuItem menuItem) {
        focusInSearchBar();
    }

    static /* synthetic */ void lambda$searchMenuItemClickExpandsSearch$16(MenuItem menuItem) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$searchMenuItemClickExpandsSearch$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8635h(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$toolbarClickExpandsSearch$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8636i(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$toolbarClickExpandsSearch$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8637j(View.LifecycleEvent lifecycleEvent) {
        return this.toolbarClickObservable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$toolbarClickExpandsSearch$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8638k(Void r3) {
        this.searchAnalytics.searchStart(SearchSource.SEARCH_TOOLBAR, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$toolbarClickExpandsSearch$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8639l(Void r1) {
        focusInSearchBar();
    }

    static /* synthetic */ void lambda$toolbarClickExpandsSearch$9(Void r0) {
    }

    private void searchMenuItemClickExpandsSearch() {
        getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.RESUME);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11084f.m8631d((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11057f.m8632e((MenuItem) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.l
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11144f.m8633f((MenuItem) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.k
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11135f.m8634g((MenuItem) obj);
            }
        }).m40091f(bindUntilEvent(View.LifecycleEvent.PAUSE)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppSearchSuggestionsView.lambda$searchMenuItemClickExpandsSearch$16((MenuItem) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.m
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11153f.m8635h((Throwable) obj);
            }
        });
    }

    private void toolbarClickExpandsSearch() {
        getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.RESUME);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11180f.m8637j((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.j
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11126f.m8638k((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.q
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11190f.m8639l((Void) obj);
            }
        }).m40091f(bindUntilEvent(View.LifecycleEvent.PAUSE)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppSearchSuggestionsView.lambda$toolbarClickExpandsSearch$9((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.i
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11111f.m8636i((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public void attachPresenter(Presenter presenter) {
        this.parentView.attachPresenter(presenter);
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public <T> InterfaceC8756b<T> bindUntilEvent(View.LifecycleEvent lifecycleEvent) {
        return this.parentView.bindUntilEvent(lifecycleEvent);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public void collapseSearchBar(boolean z) {
        MenuItem menuItem = this.searchMenuItem;
        if (menuItem != null) {
            menuItem.collapseActionView();
        }
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public void focusInSearchBar() {
        MenuItem menuItem = this.searchMenuItem;
        if (menuItem != null) {
            menuItem.expandActionView();
        }
        if (this.searchView == null || getCurrentQuery().isEmpty()) {
            return;
        }
        this.searchView.m808d0(getCurrentQuery(), false);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public String getCurrentQuery() {
        String str = this.currentQuery;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public C11234e<View.LifecycleEvent> getLifecycleEvent() {
        return this.parentView.getLifecycleEvent();
    }

    public void initialize(MenuItem menuItem) {
        this.searchMenuItem = menuItem;
        SearchView searchView = (SearchView) menuItem.getActionView();
        this.searchView = searchView;
        searchView.setSuggestionsAdapter(this.suggestionCursorAdapter);
        this.searchView.setOnSuggestionListener(new SearchView.InterfaceC0140m() { // from class: cm.aptoide.pt.search.view.AppSearchSuggestionsView.1
            @Override // androidx.appcompat.widget.SearchView.InterfaceC0140m
            public boolean onSuggestionClick(int i2) {
                AppSearchSuggestionsView.this.queryTextChangedPublisher.onNext(new SearchQueryEvent(AppSearchSuggestionsView.this.suggestionCursorAdapter.getSuggestionAt(i2).toString(), i2, true, true));
                return true;
            }

            @Override // androidx.appcompat.widget.SearchView.InterfaceC0140m
            public boolean onSuggestionSelect(int i2) {
                return false;
            }
        });
        ((AutoCompleteTextView) this.searchView.findViewById(C1146R.id.search_src_text)).setThreshold(0);
        getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.RESUME);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11171f.m8628a((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11093f.m8629b((C8973g) obj);
            }
        }).m40091f(bindUntilEvent(View.LifecycleEvent.PAUSE)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                AppSearchSuggestionsView.lambda$initialize$3((C8973g) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.r
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11199f.m8630c((Throwable) obj);
            }
        });
        toolbarClickExpandsSearch();
        searchMenuItemClickExpandsSearch();
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public C11234e<SearchQueryEvent> onQueryTextChanged() {
        return this.queryTextChangedPublisher;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public void setSuggestionsList(List<String> list) {
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public void setTrendingCursor(List<String> list) {
        this.suggestionCursorAdapter.setData(list);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public void setTrendingList(List<Suggestion> list) {
    }

    public AppSearchSuggestionsView(FragmentView fragmentView, C11234e<Void> c11234e, CrashReport crashReport, String str, SuggestionCursorAdapter suggestionCursorAdapter, C11418b<SearchQueryEvent> c11418b, C11234e<MenuItem> c11234e2, SearchAnalytics searchAnalytics) {
        this.parentView = fragmentView;
        this.toolbarClickObservable = c11234e;
        this.crashReport = crashReport;
        this.currentQuery = str;
        this.suggestionCursorAdapter = suggestionCursorAdapter;
        this.queryTextChangedPublisher = c11418b;
        this.toolbarMenuItemClick = c11234e2;
        this.searchAnalytics = searchAnalytics;
    }
}
