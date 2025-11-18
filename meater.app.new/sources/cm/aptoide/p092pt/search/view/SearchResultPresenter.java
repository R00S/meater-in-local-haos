package cm.aptoide.p092pt.search.view;

import android.content.DialogInterface;
import android.view.MenuItem;
import cm.aptoide.aptoideviews.filters.Filter;
import cm.aptoide.p092pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationItem;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationMapper;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.view.DownloadStatusModel;
import cm.aptoide.p092pt.download.view.DownloadViewActionPresenter;
import cm.aptoide.p092pt.home.AptoideBottomNavigator;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.search.SearchManager;
import cm.aptoide.p092pt.search.SearchNavigator;
import cm.aptoide.p092pt.search.analytics.SearchAnalytics;
import cm.aptoide.p092pt.search.analytics.SearchSource;
import cm.aptoide.p092pt.search.model.SearchAppResultWrapper;
import cm.aptoide.p092pt.search.model.SearchQueryModel;
import cm.aptoide.p092pt.search.model.SearchResult;
import cm.aptoide.p092pt.search.model.Source;
import cm.aptoide.p092pt.search.suggestions.SearchQueryEvent;
import cm.aptoide.p092pt.search.suggestions.SearchSuggestionManager;
import cm.aptoide.p092pt.search.suggestions.TrendingManager;
import cm.aptoide.p092pt.search.view.SearchResultView;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.HttpUrl;
import p024c.p052i.p059j.C0955e;
import p241e.p294g.p295a.p297b.p302c.p303a.C8973g;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class SearchResultPresenter implements Presenter {
    private static final String TAG = "cm.aptoide.pt.search.view.SearchResultPresenter";
    private final SearchAnalytics analytics;
    private final BottomNavigationMapper bottomNavigationMapper;
    private final AptoideBottomNavigator bottomNavigator;
    private final CrashReport crashReport;
    private final DownloadViewActionPresenter downloadActionPresenter;
    private final AbstractC11243h ioScheduler;
    private final SearchNavigator navigator;
    private final SearchManager searchManager;
    private final SearchSuggestionManager suggestionManager;
    private final TrendingManager trendingManager;
    private final SearchResultView view;
    private final AbstractC11243h viewScheduler;

    public SearchResultPresenter(SearchResultView searchResultView, SearchAnalytics searchAnalytics, SearchNavigator searchNavigator, CrashReport crashReport, AbstractC11243h abstractC11243h, SearchManager searchManager, TrendingManager trendingManager, SearchSuggestionManager searchSuggestionManager, AptoideBottomNavigator aptoideBottomNavigator, BottomNavigationMapper bottomNavigationMapper, AbstractC11243h abstractC11243h2, DownloadViewActionPresenter downloadViewActionPresenter) {
        this.view = searchResultView;
        this.analytics = searchAnalytics;
        this.navigator = searchNavigator;
        this.crashReport = crashReport;
        this.viewScheduler = abstractC11243h;
        this.searchManager = searchManager;
        this.trendingManager = trendingManager;
        this.suggestionManager = searchSuggestionManager;
        this.bottomNavigator = aptoideBottomNavigator;
        this.bottomNavigationMapper = bottomNavigationMapper;
        this.ioScheduler = abstractC11243h2;
        this.downloadActionPresenter = downloadViewActionPresenter;
    }

    private C11234e<SearchQueryEvent> getDebouncedQueryChanges() {
        return this.view.onQueryTextChanged().m40099m(250L, TimeUnit.MILLISECONDS);
    }

    private void handleAdultContentDialogNegativeClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.h3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.f6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11091f.m8722l((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.a6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11046f.m8724m((DialogInterface) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.m2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleAdultContentDialogNegativeClick$73((DialogInterface) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.w5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11249f.m8726n((Throwable) obj);
            }
        });
    }

    private void handleAdultContentDialogPositiveClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.e2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.t0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11219f.m8728o((View.LifecycleEvent) obj);
            }
        }).m40095j0(Schedulers.m40658io()).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.h4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11107f.m8730p((DialogInterface) obj);
            }
        }).m40095j0(this.viewScheduler).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.f5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11090f.m8732q((Throwable) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.q4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleAdultContentDialogPositiveClick$68((DialogInterface) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.l4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11149f.m8734r((Throwable) obj);
            }
        });
    }

    private void handleAdultContentDialogWithPinPositiveClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.q3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.a1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11041f.m8740u((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.j1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleAdultContentDialogWithPinPositiveClick$79(obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.x3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11255f.m8742v((Throwable) obj);
            }
        });
    }

    private void handleClickOnScreenshot() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.i2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.v1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11237f.m8668K((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.t2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                ScreenShotClickEvent screenShotClickEvent = (ScreenShotClickEvent) obj;
                return Boolean.valueOf(!screenShotClickEvent.isVideo());
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.q2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11193f.m8670L((ScreenShotClickEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.k4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleClickOnScreenshot$17((ScreenShotClickEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.n5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11168f.m8672M((Throwable) obj);
            }
        });
    }

    private void handleErrorRetryClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.k1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.c4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11062f.m8680Q((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.x4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11256f.m8682R((Void) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.v2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11238f.m8684S((SearchResultView.Model) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4204a4 c4204a4 = new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.a4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleErrorRetryClick$23((SearchResultView.Model) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c4204a4, new C4199a(crashReport));
    }

    private void handleFiltersClick() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.v4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11240f.m8686T((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.w2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11246f.m8688U((SearchResultView.Model) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4367s3 c4367s3 = new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.s3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleFiltersClick$12((SearchResultView.Model) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c4367s3, new C4199a(crashReport));
    }

    private void handleNewSearchResults() {
        C11234e c11234eM40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.i0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.a5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11045f.m8705c0((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.s1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11210f.m8711f0((SearchResultView.Model) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4364s0 c4364s0 = new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.s0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleNewSearchResults$5((SearchResult) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        c11234eM40091f.m40063H0(c4364s0, new C4199a(crashReport));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$doFirstSearch$82, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ SearchResultView.Model m8700a(View.LifecycleEvent lifecycleEvent) {
        return this.view.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$doFirstSearch$83, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8702b(SearchResultView.Model model) {
        return search(model, model.hasLoadedResults());
    }

    static /* synthetic */ void lambda$doFirstSearch$84(SearchResultView.Model model) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$doFirstSearch$85, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8704c(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$focusInSearchBar$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8706d(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchSetup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$focusInSearchBar$38, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8708e(Void r1) {
        return Boolean.valueOf(this.view.shouldFocusInSearchBar());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$focusInSearchBar$39, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8710f(Void r1) {
        this.view.focusInSearchBar();
    }

    static /* synthetic */ void lambda$focusInSearchBar$40(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$focusInSearchBar$41, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8712g(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getTrendingOnStart$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8714h(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchSetup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getTrendingOnStart$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8716i(List list) {
        this.view.setTrendingList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getTrendingOnStart$33, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8718j(Void r2) {
        return this.trendingManager.getTrendingListSuggestions().m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.d3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11070f.m8716i((List) obj);
            }
        });
    }

    static /* synthetic */ void lambda$getTrendingOnStart$34(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getTrendingOnStart$35, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8720k(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdultContentDialogNegativeClick$71, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8722l(View.LifecycleEvent lifecycleEvent) {
        return C11234e.m40033a0(this.view.adultContentPinDialogNegativeClick(), this.view.adultContentDialogNegativeClick());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdultContentDialogNegativeClick$72, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8724m(DialogInterface dialogInterface) {
        this.view.disableAdultContent();
    }

    static /* synthetic */ void lambda$handleAdultContentDialogNegativeClick$73(DialogInterface dialogInterface) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdultContentDialogNegativeClick$74, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8726n(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdultContentDialogPositiveClick$65, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8728o(View.LifecycleEvent lifecycleEvent) {
        return this.view.adultContentDialogPositiveClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdultContentDialogPositiveClick$66, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8730p(DialogInterface dialogInterface) {
        return this.searchManager.enableAdultContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdultContentDialogPositiveClick$67, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8732q(Throwable th) {
        this.view.disableAdultContent();
    }

    static /* synthetic */ void lambda$handleAdultContentDialogPositiveClick$68(DialogInterface dialogInterface) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdultContentDialogPositiveClick$69, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8734r(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdultContentDialogWithPinPositiveClick$76, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8736s(Throwable th) {
        if (th instanceof SecurityException) {
            this.view.showWrongPinErrorMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdultContentDialogWithPinPositiveClick$77, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8738t(CharSequence charSequence) {
        return this.searchManager.enableAdultContentWithPin(charSequence.toString().isEmpty() ? 0 : Integer.valueOf(charSequence.toString()).intValue()).m39968M().m40095j0(this.viewScheduler).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.y0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11260f.m8736s((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdultContentDialogWithPinPositiveClick$78, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8740u(View.LifecycleEvent lifecycleEvent) {
        return this.view.adultContentWithPinDialogPositiveClick().m40095j0(Schedulers.m40658io()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.h6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11109f.m8738t((CharSequence) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleAdultContentDialogWithPinPositiveClick$79(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAdultContentDialogWithPinPositiveClick$80, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8742v(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAdultContentSwitch$55, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8744w(View.LifecycleEvent lifecycleEvent) {
        return this.view.clickAdultContentSwitch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAdultContentSwitch$56, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8746x(Throwable th) {
        this.view.enableAdultContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAdultContentSwitch$58, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8748y(Boolean bool) {
        return !bool.booleanValue() ? this.searchManager.disableAdultContent().m39986z(this.viewScheduler).m39981n(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.j6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11133f.m8746x((Throwable) obj);
            }
        }).m39968M().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.z3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        }) : C11234e.m40025S(Boolean.TRUE);
    }

    static /* synthetic */ Boolean lambda$handleClickOnAdultContentSwitch$59(Boolean bool) {
        return bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAdultContentSwitch$60, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8750z(Boolean bool) {
        return this.searchManager.isAdultContentPinRequired();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAdultContentSwitch$61, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8648A(Boolean bool) {
        if (bool.booleanValue()) {
            this.view.showAdultContentConfirmationDialogWithPin();
        } else {
            this.view.showAdultContentConfirmationDialog();
        }
    }

    static /* synthetic */ void lambda$handleClickOnAdultContentSwitch$62(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAdultContentSwitch$63, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8650B(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBottomNavWithResults$145, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8652C(Integer num) {
        return Boolean.valueOf(this.bottomNavigationMapper.mapItemClicked(num).equals(BottomNavigationItem.SEARCH));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBottomNavWithResults$146, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8654D(Integer num) {
        return Boolean.valueOf(this.view.hasResults());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBottomNavWithResults$147, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8656E(Integer num) {
        this.view.scrollToTop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBottomNavWithResults$148, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8658F(View.LifecycleEvent lifecycleEvent) {
        return this.bottomNavigator.navigationEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.o2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11174f.m8652C((Integer) obj);
            }
        }).m40095j0(this.viewScheduler).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.n3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11166f.m8654D((Integer) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.u5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11233f.m8656E((Integer) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleClickOnBottomNavWithResults$149(Integer num) {
    }

    static /* synthetic */ void lambda$handleClickOnBottomNavWithResults$150(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBottomNavWithoutResults$152, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8660G(Integer num) {
        return Boolean.valueOf(this.bottomNavigationMapper.mapItemClicked(num).equals(BottomNavigationItem.SEARCH));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBottomNavWithoutResults$153, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8662H(Integer num) {
        return Boolean.valueOf(!this.view.hasResults());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBottomNavWithoutResults$154, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8664I(Integer num) {
        this.view.focusInSearchBar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnBottomNavWithoutResults$155, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8666J(View.LifecycleEvent lifecycleEvent) {
        return this.bottomNavigator.navigationEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.i5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11117f.m8660G((Integer) obj);
            }
        }).m40095j0(this.viewScheduler).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.w0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11244f.m8662H((Integer) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.p2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11184f.m8664I((Integer) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleClickOnBottomNavWithoutResults$156(Integer num) {
    }

    static /* synthetic */ void lambda$handleClickOnBottomNavWithoutResults$157(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnScreenshot$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8668K(View.LifecycleEvent lifecycleEvent) {
        return this.view.getScreenshotClickEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnScreenshot$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8670L(ScreenShotClickEvent screenShotClickEvent) {
        this.navigator.navigateToScreenshots(screenShotClickEvent.getImagesUris(), screenShotClickEvent.getImagesIndex());
    }

    static /* synthetic */ void lambda$handleClickOnScreenshot$17(ScreenShotClickEvent screenShotClickEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnScreenshot$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8672M(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickToOpenAppViewFromItem$50, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8674N(View.LifecycleEvent lifecycleEvent) {
        return this.view.onViewItemClicked();
    }

    static /* synthetic */ void lambda$handleClickToOpenAppViewFromItem$52(SearchAppResultWrapper searchAppResultWrapper) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickToOpenAppViewFromItem$53, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8678P(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleErrorRetryClick$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8680Q(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleErrorRetryClick$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ SearchResultView.Model m8682R(Void r1) {
        return this.view.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleErrorRetryClick$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8684S(SearchResultView.Model model) {
        return search(model, false);
    }

    static /* synthetic */ void lambda$handleErrorRetryClick$23(SearchResultView.Model model) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFiltersClick$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8686T(View.LifecycleEvent lifecycleEvent) {
        return this.view.filtersChangeEvents().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.g6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11100f.m8690V((List) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.r3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11203f.m8692W((SearchResultView.Model) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.u3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11231f.m8694X((SearchResultView.Model) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFiltersClick$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8688U(SearchResultView.Model model) {
        this.view.getViewModel();
    }

    static /* synthetic */ void lambda$handleFiltersClick$12(SearchResultView.Model model) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFiltersClick$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ SearchResultView.Model m8690V(List list) {
        return this.view.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFiltersClick$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8692W(SearchResultView.Model model) {
        this.view.showResultsLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFiltersClick$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8694X(SearchResultView.Model model) {
        return loadData(model.getSearchQueryModel().getFinalQuery(), model.getStoreName(), model.getFilters(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFragmentRestorationVisibility$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8696Y(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchSetup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFragmentRestorationVisibility$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8698Z(Void r1) {
        return Boolean.valueOf(!this.view.shouldFocusInSearchBar() && this.view.shouldShowSuggestions());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFragmentRestorationVisibility$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8701a0(Void r1) {
        this.view.setVisibilityOnRestore();
    }

    static /* synthetic */ void lambda$handleFragmentRestorationVisibility$28(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFragmentRestorationVisibility$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8703b0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleNewSearchResults$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ SearchResultView.Model m8705c0(View.LifecycleEvent lifecycleEvent) {
        return this.view.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleNewSearchResults$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8707d0(SearchResult searchResult) {
        this.view.addAllStoresResult(searchResult.getQuery(), searchResult.getSearchResultsList(), searchResult.isFreshResult(), searchResult.hasMore(), searchResult.hasError(), searchResult.getError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleNewSearchResults$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8709e0(SearchResultView.Model model, SearchResult searchResult) {
        if (searchResult.hasError() || searchResult.getSearchResultsList().size() != 0) {
            return;
        }
        this.analytics.searchNoResults(model.getSearchQueryModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleNewSearchResults$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8711f0(final SearchResultView.Model model) {
        return this.searchManager.observeSearchResults().m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.d6
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11073f.m8707d0((SearchResult) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.p1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11182f.m8709e0(model, (SearchResult) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleNewSearchResults$5(SearchResult searchResult) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$109, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8713g0(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchSetup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$110, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8715h0(Void r1) {
        return getDebouncedQueryChanges();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$113, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8717i0(String str) {
        this.view.setUnsubmittedQuery(str);
    }

    static /* synthetic */ Single lambda$handleQueryTextChanged$114(Throwable th) {
        if (th instanceof TimeoutException) {
            Logger.getInstance().m8282i(TAG, "Timeout reached while waiting for application suggestions");
        }
        return Single.m39911h(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$115, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8719j0(List list) {
        this.view.setSuggestionsList(list);
        this.view.toggleSuggestionsView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$116, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8721k0(String str) {
        return this.suggestionManager.getSuggestionsForApp(str).m39925q(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.p0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return SearchResultPresenter.lambda$handleQueryTextChanged$114((Throwable) obj);
            }
        }).m39924p(this.viewScheduler).m39919g(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.t1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11220f.m8719j0((List) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleQueryTextChanged$117(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextChanged$118, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8723l0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextCleaned$103, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8725m0(SearchQueryEvent searchQueryEvent) {
        return Boolean.valueOf(!searchQueryEvent.hasQuery() && this.view.isSearchViewExpanded());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextCleaned$104, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8727n0(SearchQueryEvent searchQueryEvent) {
        this.view.clearUnsubmittedQuery();
        this.view.toggleTrendingView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextCleaned$105, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8729o0(View.LifecycleEvent lifecycleEvent) {
        return getDebouncedQueryChanges().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.b2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11051f.m8725m0((SearchQueryEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.r5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11205f.m8727n0((SearchQueryEvent) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleQueryTextCleaned$106(SearchQueryEvent searchQueryEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextCleaned$107, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8731p0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextSubmitted$120, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8733q0(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchSetup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextSubmitted$121, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8735r0(Void r1) {
        return getDebouncedQueryChanges();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextSubmitted$123, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8737s0(SearchQueryEvent searchQueryEvent) {
        this.view.collapseSearchBar(false);
        this.view.hideSuggestionsViews();
        SearchQueryModel searchQueryModel = new SearchQueryModel(searchQueryEvent.getQuery());
        this.analytics.search(searchQueryModel);
        this.navigator.navigate(searchQueryModel);
    }

    static /* synthetic */ void lambda$handleQueryTextSubmitted$124(SearchQueryEvent searchQueryEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleQueryTextSubmitted$125, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8739t0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSearchListReachedBottom$43, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8741u0(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchResultsReachedBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSearchListReachedBottom$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ SearchResultView.Model m8743v0(Void r1) {
        return this.view.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSearchListReachedBottom$45, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8745w0(SearchResultView.Model model) {
        this.view.showMoreLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSearchListReachedBottom$46, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8747x0(SearchResultView.Model model) {
        return loadData(model.getSearchQueryModel().getFinalQuery(), model.getStoreName(), model.getFilters(), false);
    }

    static /* synthetic */ void lambda$handleSearchListReachedBottom$47(SearchResultView.Model model) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSearchListReachedBottom$48, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8749y0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSearchMenuItemClick$139, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8751z0(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchMenuItemClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSearchMenuItemClick$140, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8649A0(MenuItem menuItem) {
        if (this.view.shouldFocusInSearchBar()) {
            return;
        }
        this.analytics.searchStart(SearchSource.SEARCH_ICON, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSearchMenuItemClick$141, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8651B0(MenuItem menuItem) {
        this.view.focusInSearchBar();
    }

    static /* synthetic */ void lambda$handleSearchMenuItemClick$142(MenuItem menuItem) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSearchMenuItemClick$143, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8653C0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSuggestionClicked$127, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8655D0(View.LifecycleEvent lifecycleEvent) {
        return this.view.listenToSuggestionClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: lambda$handleSuggestionClicked$129, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8657E0(C0955e c0955e) {
        this.view.collapseSearchBar(false);
        this.view.hideSuggestionsViews();
        SearchQueryModel searchQueryModel = new SearchQueryModel((String) c0955e.f6405a, ((SearchQueryEvent) c0955e.f6406b).getQuery(), ((String) c0955e.f6405a).isEmpty() ? Source.FROM_TRENDING : Source.FROM_AUTOCOMPLETE);
        this.navigator.navigate(searchQueryModel);
        this.analytics.searchFromSuggestion(searchQueryModel, ((SearchQueryEvent) c0955e.f6406b).getPosition());
    }

    static /* synthetic */ void lambda$handleSuggestionClicked$130(C0955e c0955e) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSuggestionClicked$131, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8659F0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleToolbarClick$133, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8661G0(View.LifecycleEvent lifecycleEvent) {
        return this.view.toolbarClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleToolbarClick$134, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8663H0(Void r3) {
        if (this.view.shouldFocusInSearchBar()) {
            return;
        }
        this.analytics.searchStart(SearchSource.SEARCH_TOOLBAR, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleToolbarClick$135, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8665I0(Void r1) {
        this.view.focusInSearchBar();
    }

    static /* synthetic */ void lambda$handleToolbarClick$136(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleToolbarClick$137, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8667J0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$listenToSearchQueries$159, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8669K0(View.LifecycleEvent lifecycleEvent) {
        return this.view.searchSetup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$listenToSearchQueries$160, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8671L0(Void r1) {
        return this.view.queryChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$listenToSearchQueries$161, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8673M0(C8973g c8973g) {
        this.view.queryEvent(c8973g);
    }

    static /* synthetic */ void lambda$listenToSearchQueries$162(C8973g c8973g) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$listenToSearchQueries$163, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8675N0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$redoSearchAfterAdultContentSwitch$87, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8677O0(View.LifecycleEvent lifecycleEvent) {
        return C11234e.m40033a0(this.view.adultContentDialogPositiveClick(), this.view.adultContentWithPinDialogPositiveClick());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$redoSearchAfterAdultContentSwitch$88, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ SearchResultView.Model m8679P0(Object obj) {
        return this.view.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$redoSearchAfterAdultContentSwitch$89, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8681Q0(SearchResultView.Model model) {
        return search(model, false);
    }

    static /* synthetic */ void lambda$redoSearchAfterAdultContentSwitch$90(SearchResultView.Model model) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$redoSearchAfterAdultContentSwitch$91, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8683R0(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$search$100, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8685S0(SearchResultView.Model model) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$search$101, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m8687T0(boolean z, SearchResultView.Model model) {
        return loadData(model.getSearchQueryModel().getFinalQuery(), model.getStoreName(), model.getFilters(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$search$98, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8689U0(SearchResultView.Model model) {
        return Boolean.valueOf(hasValidQuery(model));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$search$99, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8691V0(SearchResultView.Model model) {
        this.view.hideSuggestionsViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAdultContentSwitchOnNoResults$93, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8693W0(View.LifecycleEvent lifecycleEvent) {
        return this.view.viewHasNoResults();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAdultContentSwitchOnNoResults$94, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8695X0(Void r1) {
        return this.searchManager.isAdultContentEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAdultContentSwitchOnNoResults$95, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8697Y0(Boolean bool) {
        this.view.setAdultContentSwitch(bool);
    }

    static /* synthetic */ void lambda$updateAdultContentSwitchOnNoResults$96(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAdultContentSwitchOnNoResults$97, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8699Z0(Throwable th) {
        this.crashReport.log(th);
    }

    private C11231b loadData(String str, String str2, List<Filter> list, boolean z) {
        return (str2 == null || str2.trim().equals(HttpUrl.FRAGMENT_ENCODE_SET)) ? this.searchManager.searchAppInStores(str, list, z) : this.searchManager.searchInStore(str, str2, list, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: openAppView, reason: merged with bridge method [inline-methods] */
    public void m8676O(SearchAppResultWrapper searchAppResultWrapper) {
        String packageName = searchAppResultWrapper.getSearchAppResult().getPackageName();
        long appId = searchAppResultWrapper.getSearchAppResult().getAppId();
        String storeName = searchAppResultWrapper.getSearchAppResult().getStoreName();
        this.analytics.searchAppClick(this.view.getViewModel().getSearchQueryModel(), packageName, searchAppResultWrapper.getPosition(), searchAppResultWrapper.getSearchAppResult().isAppcApp(), searchAppResultWrapper.getSearchAppResult().getDownloadModel() != null && searchAppResultWrapper.getSearchAppResult().getDownloadModel().getAction() == DownloadStatusModel.Action.MIGRATE, !searchAppResultWrapper.getSearchAppResult().getSplits().isEmpty(), searchAppResultWrapper.getSearchAppResult().getObb() != null, searchAppResultWrapper.getSearchAppResult().getVersionCode(), searchAppResultWrapper.getSearchAppResult().isInCatappult(), searchAppResultWrapper.getSearchAppResult().getAppCategory());
        this.navigator.goToAppView(appId, packageName, this.view.getViewModel().getStoreTheme(), storeName);
    }

    public void doFirstSearch() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.f3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.m5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11159f.m8700a((View.LifecycleEvent) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.g1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11095f.m8702b((SearchResultView.Model) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.h0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$doFirstSearch$84((SearchResultView.Model) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.r0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11200f.m8704c((Throwable) obj);
            }
        });
    }

    public void focusInSearchBar() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.i3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.c6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11064f.m8706d((View.LifecycleEvent) obj);
            }
        }).m40057E().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.f1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11086f.m8708e((Void) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.o4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11176f.m8710f((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.v0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$focusInSearchBar$40((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.k5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11141f.m8712g((Throwable) obj);
            }
        });
    }

    public void getTrendingOnStart() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.o3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.e4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11080f.m8714h((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.r4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11204f.m8718j((Void) obj);
            }
        }).m40110s0().m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.g4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$getTrendingOnStart$34((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.f0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11085f.m8720k((Throwable) obj);
            }
        });
    }

    public void handleClickOnAdultContentSwitch() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.v3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.q5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11196f.m8744w((View.LifecycleEvent) obj);
            }
        }).m40095j0(Schedulers.m40658io()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.y1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11261f.m8748y((Boolean) obj);
            }
        }).m40095j0(this.viewScheduler).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.b3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                SearchResultPresenter.lambda$handleClickOnAdultContentSwitch$59(bool);
                return bool;
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.b1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11050f.m8750z((Boolean) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.u2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11230f.m8648A((Boolean) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.v5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleClickOnAdultContentSwitch$62((Boolean) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.a3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11043f.m8650B((Throwable) obj);
            }
        });
    }

    public void handleClickOnBottomNavWithResults() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.c2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.k3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11139f.m8658F((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.f2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleClickOnBottomNavWithResults$149((Integer) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.b4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleClickOnBottomNavWithResults$150((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleClickOnBottomNavWithoutResults() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.g2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.k6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11142f.m8666J((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.s4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleClickOnBottomNavWithoutResults$156((Integer) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.o1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleClickOnBottomNavWithoutResults$157((Throwable) obj);
                throw null;
            }
        });
    }

    public void handleClickToOpenAppViewFromItem() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.i1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.h1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11104f.m8674N((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.s2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11211f.m8676O((SearchAppResultWrapper) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.y4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleClickToOpenAppViewFromItem$52((SearchAppResultWrapper) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.x2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11254f.m8678P((Throwable) obj);
            }
        });
    }

    public void handleFragmentRestorationVisibility() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.j4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.b6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11055f.m8696Y((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.a2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11042f.m8698Z((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.u1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11229f.m8701a0((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.u4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleFragmentRestorationVisibility$28((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.z0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11268f.m8703b0((Throwable) obj);
            }
        });
    }

    public void handleQueryTextChanged() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.x5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.p3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11185f.m8713g0((View.LifecycleEvent) obj);
            }
        }).m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.m0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11154f.m8715h0((Void) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.z5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                SearchQueryEvent searchQueryEvent = (SearchQueryEvent) obj;
                return Boolean.valueOf(searchQueryEvent.hasQuery() && !searchQueryEvent.isSubmitted());
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.g5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((SearchQueryEvent) obj).getQuery();
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.r2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11202f.m8717i0((String) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.i4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11116f.m8721k0((String) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.m3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleQueryTextChanged$117((List) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.w1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11245f.m8723l0((Throwable) obj);
            }
        });
    }

    public void handleQueryTextCleaned() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.c3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.z1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11269f.m8729o0((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.n4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleQueryTextCleaned$106((SearchQueryEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.t4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11223f.m8731p0((Throwable) obj);
            }
        });
    }

    public void handleQueryTextSubmitted() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.l3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.r1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11201f.m8733q0((View.LifecycleEvent) obj);
            }
        }).m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.u0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11228f.m8735r0((Void) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.d1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                SearchQueryEvent searchQueryEvent = (SearchQueryEvent) obj;
                return Boolean.valueOf(searchQueryEvent.hasQuery() && searchQueryEvent.isSubmitted());
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.n2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11165f.m8737s0((SearchQueryEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.z4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleQueryTextSubmitted$124((SearchQueryEvent) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.q0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11191f.m8739t0((Throwable) obj);
            }
        });
    }

    public void handleSearchListReachedBottom() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.l5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.m4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11158f.m8741u0((View.LifecycleEvent) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.j5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11132f.m8743v0((Void) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.g3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11097f.m8745w0((SearchResultView.Model) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.j0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11127f.m8747x0((SearchResultView.Model) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.e5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleSearchListReachedBottom$47((SearchResultView.Model) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.w3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11247f.m8749y0((Throwable) obj);
            }
        });
    }

    public void handleSearchMenuItemClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.y3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.RESUME);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.z2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11270f.m8751z0((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.j3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11130f.m8649A0((MenuItem) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.h2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11105f.m8651B0((MenuItem) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.PAUSE)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.f4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleSearchMenuItemClick$142((MenuItem) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.d5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11072f.m8653C0((Throwable) obj);
            }
        });
    }

    public void handleSuggestionClicked() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.p4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.t5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11224f.m8655D0((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.n1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                C0955e c0955e = (C0955e) obj;
                return Boolean.valueOf(((SearchQueryEvent) c0955e.f6406b).hasQuery() && ((SearchQueryEvent) c0955e.f6406b).isSubmitted());
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.l1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11146f.m8657E0((C0955e) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.x0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleSuggestionClicked$130((C0955e) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.m1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11155f.m8659F0((Throwable) obj);
            }
        });
    }

    public void handleToolbarClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.d4
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.m6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11160f.m8661G0((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.x1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11253f.m8663H0((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.o0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11172f.m8665I0((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.b5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$handleToolbarClick$136((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.d2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11069f.m8667J0((Throwable) obj);
            }
        });
    }

    public boolean hasValidQuery(SearchResultView.Model model) {
        return (model.getSearchQueryModel() == null || model.getSearchQueryModel().getFinalQuery().isEmpty()) ? false : true;
    }

    public void listenToSearchQueries() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.l6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.RESUME);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.o5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11177f.m8669K0((View.LifecycleEvent) obj);
            }
        }).m40057E().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.y2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11262f.m8671L0((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.l2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11147f.m8673M0((C8973g) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.w4
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$listenToSearchQueries$162((C8973g) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.k2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11138f.m8675N0((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleNewSearchResults();
        getTrendingOnStart();
        handleToolbarClick();
        handleSearchMenuItemClick();
        focusInSearchBar();
        handleSuggestionClicked();
        handleFragmentRestorationVisibility();
        doFirstSearch();
        handleClickToOpenAppViewFromItem();
        handleSearchListReachedBottom();
        handleQueryTextSubmitted();
        handleQueryTextChanged();
        handleQueryTextCleaned();
        handleClickOnBottomNavWithResults();
        handleClickOnBottomNavWithoutResults();
        handleErrorRetryClick();
        handleFiltersClick();
        handleClickOnScreenshot();
        listenToSearchQueries();
        handleClickOnAdultContentSwitch();
        handleAdultContentDialogPositiveClick();
        handleAdultContentDialogNegativeClick();
        handleAdultContentDialogWithPinPositiveClick();
        redoSearchAfterAdultContentSwitch();
        updateAdultContentSwitchOnNoResults();
        this.downloadActionPresenter.setContextParams(DownloadAnalytics.AppContext.SEARCH, false, null);
        this.downloadActionPresenter.present(this.view.getDownloadClickEvents(), this.view);
    }

    public void redoSearchAfterAdultContentSwitch() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.p5
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.e6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11082f.m8677O0((View.LifecycleEvent) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11145f.m8679P0(obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.e3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11079f.m8681Q0((SearchResultView.Model) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.s5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$redoSearchAfterAdultContentSwitch$90((SearchResultView.Model) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.h5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11108f.m8683R0((Throwable) obj);
            }
        });
    }

    public C11231b search(SearchResultView.Model model, final boolean z) {
        return C11234e.m40025S(model).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.q1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11192f.m8689U0((SearchResultView.Model) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.k0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11136f.m8691V0((SearchResultView.Model) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.e1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11077f.m8685S0((SearchResultView.Model) obj);
            }
        }).m40095j0(this.ioScheduler).m40057E().m40085Z0().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.i6
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11118f.m8687T0(z, (SearchResultView.Model) obj);
            }
        });
    }

    public void updateAdultContentSwitchOnNoResults() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.n0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.j2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11129f.m8693W0((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.c1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11059f.m8695X0((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.y5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11265f.m8697Y0((Boolean) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.t3
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                SearchResultPresenter.lambda$updateAdultContentSwitchOnNoResults$96((Boolean) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.c5
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11063f.m8699Z0((Throwable) obj);
            }
        });
    }
}
