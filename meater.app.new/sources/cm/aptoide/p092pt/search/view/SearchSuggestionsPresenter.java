package cm.aptoide.p092pt.search.view;

import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.search.SearchNavigator;
import cm.aptoide.p092pt.search.SuggestionCursorAdapter;
import cm.aptoide.p092pt.search.analytics.SearchAnalytics;
import cm.aptoide.p092pt.search.model.SearchQueryModel;
import cm.aptoide.p092pt.search.suggestions.SearchQueryEvent;
import cm.aptoide.p092pt.search.suggestions.SearchSuggestionManager;
import cm.aptoide.p092pt.search.suggestions.TrendingManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class SearchSuggestionsPresenter implements Presenter {
    private static final String TAG = "cm.aptoide.pt.search.view.SearchSuggestionsPresenter";
    private final CrashReport crashReport;
    private final SearchNavigator navigator;
    private final SearchAnalytics searchAnalytics;
    private final SearchSuggestionManager searchSuggestionManager;
    private boolean showSuggestionsOnFirstLoadWithEmptyQuery;
    private final SuggestionCursorAdapter suggestionCursorAdapter;
    private final TrendingManager trendingManager;
    private final SearchSuggestionsView view;
    private final AbstractC11243h viewScheduler;

    public SearchSuggestionsPresenter(SearchSuggestionsView searchSuggestionsView, SearchSuggestionManager searchSuggestionManager, AbstractC11243h abstractC11243h, SuggestionCursorAdapter suggestionCursorAdapter, CrashReport crashReport, TrendingManager trendingManager, SearchNavigator searchNavigator, boolean z, SearchAnalytics searchAnalytics) {
        this.view = searchSuggestionsView;
        this.searchSuggestionManager = searchSuggestionManager;
        this.viewScheduler = abstractC11243h;
        this.suggestionCursorAdapter = suggestionCursorAdapter;
        this.crashReport = crashReport;
        this.trendingManager = trendingManager;
        this.navigator = searchNavigator;
        this.showSuggestionsOnFirstLoadWithEmptyQuery = z;
        this.searchAnalytics = searchAnalytics;
    }

    private C11234e<SearchQueryEvent> getDebouncedQueryChanges() {
        return this.view.onQueryTextChanged().m40099m(250L, TimeUnit.MILLISECONDS);
    }

    private void handleQueryTextChanged() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.z6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.q7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11198f.m8755d((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.w6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.lambda$handleQueryTextChanged$20((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.e7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11083f.m8756e((Throwable) obj);
            }
        });
    }

    private void handleQueryTextCleaned() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.t6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.k7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11143f.m8757f((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.i7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.lambda$handleQueryTextCleaned$11((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.y6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11266f.m8758g((Throwable) obj);
            }
        });
    }

    private void handleQueryTextSubmitted() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.f7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.o6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11178f.m8761j((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.o7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11179f.m8762k((SearchQueryEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.n6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.lambda$handleQueryTextSubmitted$4((SearchQueryEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.c7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11065f.m8763l((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8752a(Throwable th) {
        if (!(th instanceof TimeoutException)) {
            return Single.m39911h(th);
        }
        Logger.getInstance().m8282i(TAG, "Timeout reached while waiting for application suggestions");
        return Single.m39913m(this.suggestionCursorAdapter.getSuggestions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8753b(List list) {
        this.suggestionCursorAdapter.setData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8754c(String str) {
        return this.searchSuggestionManager.getSuggestionsForApp(str).m39925q(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.x6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11258f.m8752a((Throwable) obj);
            }
        }).m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.r6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11206f.m8753b((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8755d(View.LifecycleEvent lifecycleEvent) {
        return getDebouncedQueryChanges().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.l7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                SearchQueryEvent searchQueryEvent = (SearchQueryEvent) obj;
                return Boolean.valueOf(searchQueryEvent.hasQuery() && !searchQueryEvent.isSubmitted());
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.g7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((SearchQueryEvent) obj).getQuery().toString();
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.v6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11242f.m8754c((String) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleQueryTextChanged$20(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8756e(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextCleaned$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8757f(View.LifecycleEvent lifecycleEvent) {
        return getDebouncedQueryChanges().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.j7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                SearchQueryEvent searchQueryEvent = (SearchQueryEvent) obj;
                return Boolean.valueOf(!searchQueryEvent.hasQuery());
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.h7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11110f.m8760i((SearchQueryEvent) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleQueryTextCleaned$11(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextCleaned$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8758g(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextCleaned$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8759h(List list) {
        this.view.setTrendingCursor(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextCleaned$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8760i(SearchQueryEvent searchQueryEvent) {
        return this.trendingManager.getTrendingCursorSuggestions().m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.m7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11161f.m8759h((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextSubmitted$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8761j(View.LifecycleEvent lifecycleEvent) {
        return getDebouncedQueryChanges().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.p6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                SearchQueryEvent searchQueryEvent = (SearchQueryEvent) obj;
                return Boolean.valueOf(searchQueryEvent.hasQuery() && searchQueryEvent.isSubmitted());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextSubmitted$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8762k(SearchQueryEvent searchQueryEvent) {
        this.view.collapseSearchBar(true);
        SearchQueryModel searchQueryModel = new SearchQueryModel(searchQueryEvent.getQuery());
        this.navigator.navigate(searchQueryModel);
        if (searchQueryEvent.isSuggestion()) {
            this.searchAnalytics.searchFromSuggestion(searchQueryModel, searchQueryEvent.getPosition());
        } else {
            this.searchAnalytics.search(searchQueryModel);
        }
    }

    static /* synthetic */ void lambda$handleQueryTextSubmitted$4(SearchQueryEvent searchQueryEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextSubmitted$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8763l(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSuggestionsIfCurrentQueryIsEmpty$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8764m(View.LifecycleEvent lifecycleEvent) {
        return this.view.onQueryTextChanged().m40057E().m40085Z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSuggestionsIfCurrentQueryIsEmpty$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8765n(SearchQueryEvent searchQueryEvent) {
        String currentQuery = this.view.getCurrentQuery();
        return Boolean.valueOf((searchQueryEvent == null || searchQueryEvent.getQuery().length() == 0) && (currentQuery == null || currentQuery.isEmpty()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSuggestionsIfCurrentQueryIsEmpty$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8766o(SearchQueryEvent searchQueryEvent) {
        return this.trendingManager.getTrendingCursorSuggestions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSuggestionsIfCurrentQueryIsEmpty$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8767p(List list) {
        this.view.setTrendingCursor(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSuggestionsIfCurrentQueryIsEmpty$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8768q(List list) {
        this.view.focusInSearchBar();
    }

    static /* synthetic */ void lambda$showSuggestionsIfCurrentQueryIsEmpty$29(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSuggestionsIfCurrentQueryIsEmpty$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8769r(Throwable th) {
        this.crashReport.log(th);
    }

    private void showSuggestionsIfCurrentQueryIsEmpty() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.p7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.a7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11047f.m8764m((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.r7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11207f.m8765n((SearchQueryEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.d7
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11074f.m8766o((SearchQueryEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.s6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                return Boolean.valueOf(list != null && list.size() > 0);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.q6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11197f.m8767p((List) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.n7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11170f.m8768q((List) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.u6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchSuggestionsPresenter.lambda$showSuggestionsIfCurrentQueryIsEmpty$29((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.b7
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11056f.m8769r((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleQueryTextSubmitted();
        handleQueryTextCleaned();
        handleQueryTextChanged();
        if (this.showSuggestionsOnFirstLoadWithEmptyQuery) {
            showSuggestionsIfCurrentQueryIsEmpty();
        }
    }
}
