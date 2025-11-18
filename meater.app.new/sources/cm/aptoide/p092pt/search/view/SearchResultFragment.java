package cm.aptoide.p092pt.search.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.AutoCompleteTextView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.app.ActivityC0067d;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.C0265a;
import androidx.core.view.C0298h;
import androidx.recyclerview.widget.C0624e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.aptoideviews.errors.ErrorView;
import cm.aptoide.aptoideviews.filters.Filter;
import cm.aptoide.aptoideviews.filters.FiltersView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationItem;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.download.view.DownloadClick;
import cm.aptoide.p092pt.search.model.SearchAppResult;
import cm.aptoide.p092pt.search.model.SearchAppResultWrapper;
import cm.aptoide.p092pt.search.model.SearchFilterType;
import cm.aptoide.p092pt.search.model.SearchQueryModel;
import cm.aptoide.p092pt.search.model.SearchResultError;
import cm.aptoide.p092pt.search.model.SearchViewModel;
import cm.aptoide.p092pt.search.model.Suggestion;
import cm.aptoide.p092pt.search.suggestions.SearchQueryEvent;
import cm.aptoide.p092pt.search.view.SearchResultView;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.view.BackButtonFragment;
import cm.aptoide.p092pt.view.p107rx.RxAlertDialog;
import cm.aptoide.p092pt.view.settings.InputDialog;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import okhttp3.HttpUrl;
import org.parceler.C11187d;
import p024c.p052i.p059j.C0955e;
import p241e.p294g.p295a.p297b.p302c.p303a.C8967a;
import p241e.p294g.p295a.p297b.p302c.p303a.C8969c;
import p241e.p294g.p295a.p297b.p302c.p303a.C8970d;
import p241e.p294g.p295a.p297b.p302c.p303a.C8971e;
import p241e.p294g.p295a.p297b.p302c.p303a.C8973g;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class SearchResultFragment extends BackButtonFragment implements SearchResultView, SearchSuggestionsView {
    private static final String ALL_STORES_SEARCH_LIST_STATE = "all_stores_search_list_state";
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.SEARCH;
    private static final int COMPLETION_THRESHOLD = 0;
    private static final String FOCUS_IN_SEARCH = "focus_in_search";
    private static final int LAYOUT = 2131493049;
    private static final String UNSUBMITTED_QUERY = "unsubmitted_query";
    private static final String VIEW_MODEL = "view_model";
    private static final int VISIBLE_THRESHOLD = 2;
    private AbstractC0064a actionBar;
    private BottomNavigationActivity bottomNavigationActivity;
    private String currentQuery;
    private C11418b<DownloadClick> downloadClickPublishSubject;
    private RxAlertDialog enableAdultContentDialog;
    private InputDialog enableAdultContentDialogWithPin;
    private ErrorView errorView;
    private CardView filtersCardView;
    private C11418b<Void> filtersChanged;
    private FiltersView filtersView;
    private boolean focusInSearchBar;
    private boolean isFreshLoading = false;
    private boolean isSearchExpanded;
    private boolean networkError;
    private boolean noResults;
    private C11418b<Boolean> noResultsAdultContentSubject;
    private C11418b<Void> noResultsPublishSubject;
    private SwitchCompat noSearchAdultContentSwitch;
    private View noSearchLayout;
    private C11418b<SearchAppResultWrapper> onItemViewClickSubject;
    private ProgressBar progressBar;
    private ProgressBar progressBarResults;
    private C11418b<SearchQueryEvent> queryTextChangedPublisher;
    private C11418b<ScreenShotClickEvent> screenShotClick;
    private C11418b<Void> searchHasNoResults;
    private MenuItem searchMenuItem;
    private RecyclerView searchResultList;

    @Inject
    SearchResultPresenter searchResultPresenter;
    private SearchResultAdapter searchResultsAdapter;
    private View searchResultsLayout;
    private C11418b<Void> searchSetupPublishSubject;
    private SearchSuggestionsAdapter searchSuggestionsAdapter;
    private SearchSuggestionsAdapter searchTrendingAdapter;
    private SearchView searchView;
    private C11418b<SearchQueryEvent> suggestionClickedPublishSubject;
    private RecyclerView suggestionsResultList;

    @Inject
    ThemeManager themeManager;
    private Toolbar toolbar;
    private RecyclerView trendingResultList;
    private String unsubmittedQuery;
    private SearchViewModel viewModel;

    private void attachAllStoresResultListDependencies() {
        this.searchResultList.setAdapter(this.searchResultsAdapter);
        this.searchResultList.setLayoutManager(getDefaultLayoutManager());
    }

    private C11234e<Void> filtersChanged() {
        return this.filtersChanged;
    }

    private void findChildViews(View view) {
        this.filtersCardView = (CardView) view.findViewById(C1146R.id.filters_card_view);
        this.searchResultList = (RecyclerView) view.findViewById(C1146R.id.fragment_search_result_all_stores_app_list);
        this.suggestionsResultList = (RecyclerView) view.findViewById(C1146R.id.suggestions_list);
        this.trendingResultList = (RecyclerView) view.findViewById(C1146R.id.trending_list);
        this.searchResultsLayout = view.findViewById(C1146R.id.fragment_search_result_layout);
        this.noSearchLayout = view.findViewById(C1146R.id.no_search_results_layout);
        this.noSearchAdultContentSwitch = (SwitchCompat) view.findViewById(C1146R.id.no_search_adult_switch);
        this.progressBar = (ProgressBar) view.findViewById(C1146R.id.progress_bar);
        this.progressBarResults = (ProgressBar) view.findViewById(C1146R.id.progress_bar_results);
        this.toolbar = (Toolbar) view.findViewById(C1146R.id.toolbar);
        this.errorView = (ErrorView) view.findViewById(C1146R.id.error_view);
        this.filtersView = (FiltersView) view.findViewById(C1146R.id.filters_view);
        this.noSearchAdultContentSwitch.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.search.view.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f11235f.m8645h(view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void forceSuggestions() {
        this.noSearchLayout.setVisibility(8);
        this.errorView.setVisibility(8);
        this.searchResultsLayout.setVisibility(8);
        this.trendingResultList.setVisibility(0);
        this.suggestionsResultList.setVisibility(8);
    }

    private LinearLayoutManager getDefaultLayoutManager() {
        return new LinearLayoutManager(getContext(), 1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasSearchResults() {
        return this.searchResultsAdapter.getItemCount() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEndReached(C8967a c8967a) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c8967a.m28577a().getLayoutManager();
        return linearLayoutManager.getItemCount() - linearLayoutManager.findLastVisibleItemPosition() <= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$filtersChangeEvents$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8643f(List list) {
        this.viewModel.setFilters(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$filtersChangeEvents$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8644g(List list) {
        this.filtersChanged.onNext(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$findChildViews$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8645h(View view) {
        this.noResultsAdultContentSubject.onNext(Boolean.valueOf(this.noSearchAdultContentSwitch.isChecked()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$listenToSuggestionClick$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C0955e m8646i(SearchQueryEvent searchQueryEvent) {
        return new C0955e(this.unsubmittedQuery, searchQueryEvent);
    }

    static /* synthetic */ Boolean lambda$recyclerViewReachedBottom$3(Boolean bool) {
        return bool;
    }

    static /* synthetic */ Void lambda$recyclerViewReachedBottom$4(Boolean bool) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$searchMenuItemClick$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8647j(MenuItem menuItem) {
        return Boolean.valueOf(menuItem.getItemId() == this.searchMenuItem.getItemId());
    }

    public static SearchResultFragment newInstance(SearchQueryModel searchQueryModel) {
        return newInstance(searchQueryModel, false);
    }

    private C11234e<Void> recyclerViewReachedBottom(RecyclerView recyclerView) {
        return C11234e.m40034b0(C8969c.m28565a(recyclerView).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.z
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(this.f11267f.isEndReached((C8967a) obj));
            }
        }), filtersChanged().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.y
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        }), searchHasNoResults().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        })).m40111t().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Boolean bool = (Boolean) obj;
                SearchResultFragment.lambda$recyclerViewReachedBottom$3(bool);
                return bool;
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.a0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                SearchResultFragment.lambda$recyclerViewReachedBottom$4((Boolean) obj);
                return null;
            }
        });
    }

    private void restoreViewState(Parcelable parcelable) {
        if (parcelable != null) {
            RecyclerView.AbstractC0602o layoutManager = this.searchResultList.getLayoutManager();
            if (layoutManager == null) {
                layoutManager = getDefaultLayoutManager();
                this.searchResultList.setLayoutManager(layoutManager);
            }
            layoutManager.onRestoreInstanceState(parcelable);
        }
        showResultsView();
    }

    private C11234e<Void> searchHasNoResults() {
        return this.searchHasNoResults;
    }

    private void setupDefaultTheme() {
        this.themeManager.resetToBaseTheme();
    }

    private void setupFilters() {
        SearchViewModel searchViewModel = this.viewModel;
        this.filtersView.setFilters((searchViewModel == null || searchViewModel.getStoreName() == null || this.viewModel.getStoreName().isEmpty()) ? Arrays.asList(new Filter(getString(C1146R.string.search_filters_followed_stores), false, SearchFilterType.FOLLOWED_STORES.name()), new Filter(getString(C1146R.string.search_filters_trusted), false, SearchFilterType.TRUSTED.name()), new Filter(getString(C1146R.string.search_filters_beta), false, SearchFilterType.BETA.name()), new Filter(getString(C1146R.string.search_filters_appcoins), false, SearchFilterType.APPC.name())) : Arrays.asList(new Filter(getString(C1146R.string.search_filters_trusted), false, SearchFilterType.TRUSTED.name()), new Filter(getString(C1146R.string.search_filters_beta), false, SearchFilterType.BETA.name()), new Filter(getString(C1146R.string.search_filters_appcoins), false, SearchFilterType.APPC.name())));
    }

    private void setupTheme() {
        SearchViewModel searchViewModel = this.viewModel;
        if (searchViewModel == null || !storeThemeExists(searchViewModel.getStoreTheme())) {
            this.themeManager.resetToBaseTheme();
            String themeName = this.themeManager.getBaseTheme().getThemeName();
            this.filtersView.setFiltersBackgroundRes(this.themeManager.getAttributeForTheme(themeName, C1146R.attr.homeChips).resourceId);
            this.filtersView.setFiltersTextColorStateList(this.themeManager.getAttributeForTheme(themeName, C1146R.attr.homeChipsTextColorSelector).resourceId);
            return;
        }
        String storeTheme = this.viewModel.getStoreTheme();
        this.themeManager.setTheme(storeTheme);
        this.toolbar.setBackgroundResource(this.themeManager.getAttributeForTheme(storeTheme, C1146R.attr.toolbarBackground).resourceId);
        if (Build.VERSION.SDK_INT < 21) {
            Drawable drawableM1821r = C0265a.m1821r(this.progressBar.getIndeterminateDrawable());
            C0265a.m1817n(drawableM1821r, this.themeManager.getAttributeForTheme(C1146R.attr.colorPrimary).data);
            this.progressBar.setIndeterminateDrawable(C0265a.m1820q(drawableM1821r));
        } else {
            this.progressBar.getIndeterminateDrawable().setColorFilter(this.themeManager.getAttributeForTheme(C1146R.attr.colorPrimary).data, PorterDuff.Mode.SRC_IN);
        }
        this.filtersView.setFiltersBackgroundRes(this.themeManager.getAttributeForTheme(storeTheme, C1146R.attr.homeChips).resourceId);
        this.filtersView.setFiltersTextColorStateList(this.themeManager.getAttributeForTheme(storeTheme, C1146R.attr.homeChipsTextColorSelector).resourceId);
    }

    private void setupToolbar() {
        String finalQuery = this.viewModel.getSearchQueryModel().getFinalQuery();
        if (finalQuery.isEmpty() && !this.noResults) {
            this.toolbar.setTitle(C1146R.string.search_hint_title);
            this.toolbar.setTitleMarginStart(100);
        } else if (finalQuery.isEmpty()) {
            this.toolbar.setTitle(C1146R.string.search_hint_title);
        } else {
            this.toolbar.setTitle(finalQuery);
        }
        ActivityC0067d activityC0067d = (ActivityC0067d) getActivity();
        activityC0067d.setSupportActionBar(this.toolbar);
        AbstractC0064a supportActionBar = activityC0067d.getSupportActionBar();
        this.actionBar = supportActionBar;
        if (supportActionBar != null) {
            supportActionBar.mo227r(true);
            this.actionBar.mo231v(this.toolbar.getTitle());
        }
    }

    private boolean storeThemeExists(String str) {
        return str != null && str.length() > 0;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void addAllStoresResult(String str, List<SearchAppResult> list, boolean z, boolean z2, boolean z3, SearchResultError searchResultError) throws Resources.NotFoundException {
        if (z) {
            this.isFreshLoading = false;
            this.searchResultsAdapter.setResultForSearch(this.searchResultList, str, list, z2);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), C1146R.anim.slide_up_disappear);
            animationLoadAnimation.setFillAfter(true);
            animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: cm.aptoide.pt.search.view.SearchResultFragment.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    SearchResultFragment.this.progressBarResults.setVisibility(8);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            this.progressBarResults.startAnimation(animationLoadAnimation);
            this.searchResultList.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(getContext(), C1146R.anim.list_apps_anim));
            this.searchResultList.scheduleLayoutAnimation();
        } else {
            this.searchResultsAdapter.addResultForSearch(str, list, z2);
        }
        this.viewModel.setLoadedResults(true);
        hideLoading();
        if (z3) {
            if (searchResultError == SearchResultError.NO_NETWORK) {
                showNoNetworkView();
                return;
            } else {
                showGenericErrorView();
                return;
            }
        }
        if (list.size() <= 0) {
            showNoResultsView();
        } else {
            showResultsView();
        }
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<DialogInterface> adultContentDialogNegativeClick() {
        return this.enableAdultContentDialog.negativeClicks();
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<DialogInterface> adultContentDialogPositiveClick() {
        return this.enableAdultContentDialog.positiveClicks();
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<DialogInterface> adultContentPinDialogNegativeClick() {
        return this.enableAdultContentDialogWithPin.negativeClicks();
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<CharSequence> adultContentWithPinDialogPositiveClick() {
        return this.enableAdultContentDialogWithPin.positiveClicks();
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void clearUnsubmittedQuery() {
        this.unsubmittedQuery = HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<Boolean> clickAdultContentSwitch() {
        return this.noResultsAdultContentSubject;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public void collapseSearchBar(boolean z) {
        MenuItem menuItem = this.searchMenuItem;
        if (menuItem != null) {
            menuItem.collapseActionView();
        }
        if (hasResults()) {
            return;
        }
        this.toolbar.setTitle(C1146R.string.search_hint_title);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void disableAdultContent() {
        this.noSearchAdultContentSwitch.setChecked(false);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void disableUpNavigation() {
        AbstractC0064a abstractC0064a = this.actionBar;
        if (abstractC0064a != null) {
            abstractC0064a.mo229t(false);
            this.actionBar.mo227r(false);
            this.actionBar.mo228s(false);
        }
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void enableAdultContent() {
        this.noSearchAdultContentSwitch.setChecked(true);
    }

    public void enableUpNavigation() {
        AbstractC0064a abstractC0064a = this.actionBar;
        if (abstractC0064a != null) {
            abstractC0064a.mo229t(true);
            this.actionBar.mo227r(true);
            this.actionBar.mo228s(true);
        }
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<List<Filter>> filtersChangeEvents() {
        return this.filtersView.filtersChangedEvents().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.d0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11067f.m8643f((List) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.search.view.w
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11243f.m8644g((List) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public void focusInSearchBar() {
        String str;
        MenuItem menuItem = this.searchMenuItem;
        if (menuItem != null) {
            menuItem.expandActionView();
        }
        SearchView searchView = this.searchView;
        if (searchView != null && (str = this.unsubmittedQuery) != null) {
            searchView.m808d0(str, false);
        } else if (searchView != null && !getCurrentQuery().isEmpty()) {
            this.searchView.m808d0(getCurrentQuery(), false);
        }
        showSuggestionsView();
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public String getCurrentQuery() {
        String str = this.currentQuery;
        return str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<DownloadClick> getDownloadClickEvents() {
        return this.downloadClickPublishSubject;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<ScreenShotClickEvent> getScreenshotClickEvent() {
        return this.screenShotClick;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public SearchResultView.Model getViewModel() {
        return this.viewModel;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public boolean hasResults() {
        return (this.searchResultsAdapter.getItemCount() == 0 || this.searchMenuItem.isActionViewExpanded()) ? false : true;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void hideLoading() {
        this.progressBar.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void hideSuggestionsViews() {
        this.suggestionsResultList.setVisibility(8);
        this.trendingResultList.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public boolean isSearchViewExpanded() {
        return this.searchMenuItem.isActionViewExpanded();
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<C0955e<String, SearchQueryEvent>> listenToSuggestionClick() {
        return this.suggestionClickedPublishSubject.m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.e0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11076f.m8646i((SearchQueryEvent) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BottomNavigationActivity) {
            this.bottomNavigationActivity = (BottomNavigationActivity) activity;
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        CrashReport crashReport = CrashReport.getInstance();
        if (this.viewModel == null && bundle != null && bundle.containsKey(VIEW_MODEL)) {
            this.viewModel = (SearchViewModel) C11187d.m39873a(bundle.getParcelable(VIEW_MODEL));
        } else if (this.viewModel == null && getArguments().containsKey(VIEW_MODEL)) {
            this.viewModel = (SearchViewModel) C11187d.m39873a(getArguments().getParcelable(VIEW_MODEL));
        }
        if (bundle != null && bundle.containsKey(FOCUS_IN_SEARCH)) {
            this.focusInSearchBar = bundle.getBoolean(FOCUS_IN_SEARCH);
        } else if (getArguments().containsKey(FOCUS_IN_SEARCH) && bundle == null) {
            this.focusInSearchBar = getArguments().getBoolean(FOCUS_IN_SEARCH);
        }
        SearchViewModel searchViewModel = this.viewModel;
        if (searchViewModel != null) {
            this.currentQuery = searchViewModel.getSearchQueryModel().getFinalQuery();
        }
        this.noResults = false;
        this.networkError = false;
        this.onItemViewClickSubject = C11418b.m40637g1();
        this.downloadClickPublishSubject = C11418b.m40637g1();
        this.screenShotClick = C11418b.m40637g1();
        this.suggestionClickedPublishSubject = C11418b.m40637g1();
        this.searchSetupPublishSubject = C11418b.m40637g1();
        this.queryTextChangedPublisher = C11418b.m40637g1();
        this.noResultsAdultContentSubject = C11418b.m40637g1();
        this.noResultsPublishSubject = C11418b.m40637g1();
        this.filtersChanged = C11418b.m40637g1();
        this.searchHasNoResults = C11418b.m40637g1();
        SearchResultAdapter searchResultAdapter = new SearchResultAdapter(this.onItemViewClickSubject, this.downloadClickPublishSubject, this.screenShotClick, new ArrayList(), crashReport);
        this.searchResultsAdapter = searchResultAdapter;
        searchResultAdapter.registerAdapterDataObserver(new RecyclerView.AbstractC0596i() { // from class: cm.aptoide.pt.search.view.SearchResultFragment.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0596i
            public void onItemRangeInserted(int i2, int i3) {
                RecyclerView.AbstractC0602o layoutManager;
                if (i2 != 0 || (layoutManager = SearchResultFragment.this.searchResultList.getLayoutManager()) == null) {
                    return;
                }
                layoutManager.scrollToPosition(0);
            }
        });
        this.searchSuggestionsAdapter = new SearchSuggestionsAdapter(new ArrayList(), this.suggestionClickedPublishSubject);
        this.searchTrendingAdapter = new SearchSuggestionsAdapter(new ArrayList(), this.suggestionClickedPublishSubject);
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1146R.menu.fragment_search_result, menu);
        MenuItem menuItemFindItem = menu.findItem(C1146R.id.menu_item_search);
        this.searchMenuItem = menuItemFindItem;
        SearchView searchView = (SearchView) menuItemFindItem.getActionView();
        this.searchView = searchView;
        searchView.setMaxWidth(Integer.MAX_VALUE);
        boolean z = false;
        ((AutoCompleteTextView) this.searchView.findViewById(C1146R.id.search_src_text)).setThreshold(0);
        C0298h.m2053g(this.searchMenuItem, new C0298h.b() { // from class: cm.aptoide.pt.search.view.SearchResultFragment.4
            @Override // androidx.core.view.C0298h.b
            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                if (SearchResultFragment.this.hasSearchResults()) {
                    SearchResultFragment.this.showResultsView();
                } else if (SearchResultFragment.this.networkError) {
                    SearchResultFragment.this.showNoNetworkView();
                } else if (SearchResultFragment.this.noResults) {
                    SearchResultFragment.this.showNoResultsView();
                } else {
                    SearchResultFragment.this.forceSuggestions();
                }
                if (SearchResultFragment.this.shouldHideUpNavigation()) {
                    SearchResultFragment.this.disableUpNavigation();
                }
                SearchResultFragment.this.isSearchExpanded = false;
                return true;
            }

            @Override // androidx.core.view.C0298h.b
            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                SearchResultFragment.this.enableUpNavigation();
                SearchResultFragment.this.isSearchExpanded = true;
                return true;
            }
        });
        if (this.currentQuery.isEmpty() && !this.noResults) {
            z = true;
        }
        this.focusInSearchBar = z;
        this.searchSetupPublishSubject.onNext(null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1146R.layout.global_search_fragment, viewGroup, false);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.noResultsAdultContentSubject = null;
        this.noResultsPublishSubject = null;
    }

    @Override // com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.searchResultList.clearAnimation();
        setupDefaultTheme();
        super.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public C11234e<SearchQueryEvent> onQueryTextChanged() {
        return this.queryTextChangedPublisher;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(VIEW_MODEL, C11187d.m39875c(this.viewModel));
        RecyclerView recyclerView = this.searchResultList;
        if (recyclerView != null && recyclerView.getLayoutManager() != null) {
            bundle.putParcelable(ALL_STORES_SEARCH_LIST_STATE, this.searchResultList.getLayoutManager().onSaveInstanceState());
        }
        bundle.putString(UNSUBMITTED_QUERY, this.unsubmittedQuery);
        if (this.isSearchExpanded) {
            bundle.putBoolean(FOCUS_IN_SEARCH, true);
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity = this.bottomNavigationActivity;
        if (bottomNavigationActivity != null) {
            bottomNavigationActivity.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        findChildViews(view);
        attachAllStoresResultListDependencies();
        setupToolbar();
        setupTheme();
        setupFilters();
        this.searchResultList.setItemAnimator(new C0624e() { // from class: cm.aptoide.pt.search.view.SearchResultFragment.2
            @Override // androidx.recyclerview.widget.AbstractC0636q, androidx.recyclerview.widget.RecyclerView.AbstractC0599l
            public boolean canReuseUpdatedViewHolder(RecyclerView.AbstractC0590c0 abstractC0590c0) {
                return true;
            }
        });
        this.suggestionsResultList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.trendingResultList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.suggestionsResultList.setAdapter(this.searchSuggestionsAdapter);
        this.trendingResultList.setAdapter(this.searchTrendingAdapter);
        if (this.viewModel != null) {
            restoreViewState(bundle != null ? bundle.getParcelable(ALL_STORES_SEARCH_LIST_STATE) : null);
        }
        SearchViewModel searchViewModel = this.viewModel;
        if (searchViewModel != null) {
            if (searchViewModel.getFilters() != null) {
                this.filtersView.setFilters(this.viewModel.getFilters());
            } else {
                this.viewModel.setFilters(this.filtersView.getFilters());
            }
        }
        if (bundle != null) {
            this.unsubmittedQuery = bundle.containsKey(UNSUBMITTED_QUERY) ? bundle.getString(UNSUBMITTED_QUERY) : HttpUrl.FRAGMENT_ENCODE_SET;
        }
        this.enableAdultContentDialog = new RxAlertDialog.Builder(getContext(), this.themeManager).setMessage(C1146R.string.are_you_adult).setPositiveButton(C1146R.string.yes).setNegativeButton(C1146R.string.f7167no).build();
        this.enableAdultContentDialogWithPin = new InputDialog.Builder(getContext(), this.themeManager).setMessage(C1146R.string.request_adult_pin).setPositiveButton(C1146R.string.all_button_ok).setNegativeButton(C1146R.string.cancel).setView(C1146R.layout.dialog_request_input).setEditText(C1146R.id.input).build();
        attachPresenter(this.searchResultPresenter);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<SearchAppResultWrapper> onViewItemClicked() {
        return this.onItemViewClickSubject;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<C8973g> queryChanged() {
        return C8970d.m28566a(this.searchView);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void queryEvent(C8973g c8973g) {
        this.queryTextChangedPublisher.onNext(new SearchQueryEvent(c8973g.m28571d().toString(), c8973g.m28570c()));
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<Void> retryClicked() {
        return this.errorView.retryClick();
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void scrollToTop() {
        RecyclerView recyclerView = this.searchResultList;
        if (((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition() > 10) {
            recyclerView.scrollToPosition(10);
        }
        recyclerView.smoothScrollToPosition(0);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<MenuItem> searchMenuItemClick() {
        return C8971e.m28567a(this.toolbar).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.search.view.b0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11049f.m8647j((MenuItem) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<Void> searchResultsReachedBottom() {
        return recyclerViewReachedBottom(this.searchResultList);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<Void> searchSetup() {
        return this.searchSetupPublishSubject;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void setAdultContentSwitch(Boolean bool) {
        this.noSearchAdultContentSwitch.setChecked(bool.booleanValue());
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public void setSuggestionsList(List<String> list) {
        this.searchSuggestionsAdapter.addSuggestionsFromString(list);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public void setTrendingCursor(List<String> list) {
    }

    @Override // cm.aptoide.p092pt.search.view.SearchSuggestionsView
    public void setTrendingList(List<Suggestion> list) {
        this.searchTrendingAdapter.addSuggestions(list);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void setUnsubmittedQuery(String str) {
        this.unsubmittedQuery = str;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void setVisibilityOnRestore() {
        if (this.focusInSearchBar) {
            return;
        }
        if (hasSearchResults()) {
            showResultsView();
        } else {
            showSuggestionsView();
        }
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public boolean shouldFocusInSearchBar() {
        return this.focusInSearchBar;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public boolean shouldHideUpNavigation() {
        return this.searchResultsAdapter.getItemCount() == 0 && !(this.noSearchLayout.getVisibility() == 0 && this.errorView.getVisibility() == 0);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public boolean shouldShowSuggestions() {
        return this.toolbar.getTitle().equals(getResources().getString(C1146R.string.search_hint_title));
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void showAdultContentConfirmationDialog() {
        this.enableAdultContentDialog.show();
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void showAdultContentConfirmationDialogWithPin() {
        this.enableAdultContentDialogWithPin.show();
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void showBannerAd() {
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void showGenericErrorView() {
        this.errorView.setError(ErrorView.Error.GENERIC);
        this.errorView.setVisibility(0);
        this.noSearchLayout.setVisibility(8);
        this.searchResultsLayout.setVisibility(0);
        this.filtersCardView.setVisibility(0);
        this.searchResultList.setVisibility(8);
        this.suggestionsResultList.setVisibility(8);
        this.trendingResultList.setVisibility(8);
        this.networkError = true;
        this.noResults = true;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void showLoading() {
        this.progressBar.setVisibility(0);
        this.noSearchLayout.setVisibility(8);
        this.errorView.setVisibility(8);
        this.searchResultsLayout.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void showMoreLoading() {
        this.searchResultsAdapter.setMoreLoading();
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void showNativeAds() {
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void showNoNetworkView() {
        this.errorView.setError(ErrorView.Error.NO_NETWORK);
        this.errorView.setVisibility(0);
        this.noSearchLayout.setVisibility(8);
        this.searchResultsLayout.setVisibility(0);
        this.filtersCardView.setVisibility(0);
        this.searchResultList.setVisibility(8);
        this.suggestionsResultList.setVisibility(8);
        this.trendingResultList.setVisibility(8);
        this.networkError = true;
        this.noResults = true;
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void showNoResultsView() {
        this.searchHasNoResults.onNext(null);
        this.noSearchLayout.setVisibility(0);
        this.searchResultsLayout.setVisibility(0);
        this.filtersCardView.setVisibility(0);
        this.searchResultList.setVisibility(8);
        this.suggestionsResultList.setVisibility(8);
        this.trendingResultList.setVisibility(8);
        this.noResults = true;
        this.noResultsPublishSubject.onNext(null);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void showResultsLoading() throws Resources.NotFoundException {
        this.errorView.setVisibility(8);
        this.noSearchLayout.setVisibility(8);
        if (this.isFreshLoading) {
            return;
        }
        this.isFreshLoading = true;
        LayoutAnimationController layoutAnimationControllerLoadLayoutAnimation = AnimationUtils.loadLayoutAnimation(getContext(), C1146R.anim.exit_list_apps_anim);
        layoutAnimationControllerLoadLayoutAnimation.getAnimation().setFillAfter(true);
        this.searchResultList.setLayoutAnimation(layoutAnimationControllerLoadLayoutAnimation);
        this.searchResultList.scheduleLayoutAnimation();
        this.progressBarResults.setVisibility(0);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), C1146R.anim.slide_down_appear);
        animationLoadAnimation.setFillAfter(true);
        this.progressBarResults.startAnimation(animationLoadAnimation);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void showResultsView() {
        this.noResults = false;
        this.noSearchLayout.setVisibility(8);
        this.errorView.setVisibility(8);
        this.suggestionsResultList.setVisibility(8);
        this.trendingResultList.setVisibility(8);
        this.searchResultList.setVisibility(0);
        this.searchResultsLayout.setVisibility(0);
    }

    public void showSuggestionsView() {
        if (this.searchView.getQuery().toString().isEmpty()) {
            this.noSearchLayout.setVisibility(8);
            this.errorView.setVisibility(8);
            this.searchResultsLayout.setVisibility(8);
            this.trendingResultList.setVisibility(0);
            this.suggestionsResultList.setVisibility(8);
            return;
        }
        this.noSearchLayout.setVisibility(8);
        this.errorView.setVisibility(8);
        this.searchResultsLayout.setVisibility(8);
        this.suggestionsResultList.setVisibility(0);
        this.trendingResultList.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void showWrongPinErrorMessage() {
        Snackbar.m24763Z(getView(), C1146R.string.adult_pin_wrong, 0);
        this.noSearchAdultContentSwitch.setChecked(false);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void toggleSuggestionsView() {
        this.suggestionsResultList.setVisibility(0);
        this.trendingResultList.setVisibility(8);
        this.noSearchLayout.setVisibility(8);
        this.errorView.setVisibility(8);
        this.searchResultList.setVisibility(8);
        this.searchResultsLayout.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public void toggleTrendingView() {
        this.suggestionsResultList.setVisibility(8);
        this.trendingResultList.setVisibility(0);
        this.noSearchLayout.setVisibility(8);
        this.errorView.setVisibility(8);
        this.searchResultList.setVisibility(8);
        this.searchResultsLayout.setVisibility(8);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<Void> toolbarClick() {
        return C8975a.m28573a(this.toolbar);
    }

    @Override // cm.aptoide.p092pt.search.view.SearchResultView
    public C11234e<Void> viewHasNoResults() {
        return this.noResultsPublishSubject;
    }

    public static SearchResultFragment newInstance(boolean z) {
        return newInstance(new SearchQueryModel(), false, z);
    }

    public static SearchResultFragment newInstance(SearchQueryModel searchQueryModel, boolean z) {
        SearchViewModel searchViewModel = new SearchViewModel(searchQueryModel, z);
        Bundle bundle = new Bundle();
        bundle.putParcelable(VIEW_MODEL, C11187d.m39875c(searchViewModel));
        SearchResultFragment searchResultFragment = new SearchResultFragment();
        searchResultFragment.setArguments(bundle);
        return searchResultFragment;
    }

    public static SearchResultFragment newInstance(SearchQueryModel searchQueryModel, boolean z, boolean z2) {
        SearchViewModel searchViewModel = new SearchViewModel(searchQueryModel, z);
        Bundle bundle = new Bundle();
        bundle.putParcelable(VIEW_MODEL, C11187d.m39875c(searchViewModel));
        bundle.putBoolean(FOCUS_IN_SEARCH, z2);
        SearchResultFragment searchResultFragment = new SearchResultFragment();
        searchResultFragment.setArguments(bundle);
        return searchResultFragment;
    }

    public static SearchResultFragment newInstance(SearchQueryModel searchQueryModel, String str, String str2) {
        SearchViewModel searchViewModel = new SearchViewModel(searchQueryModel, str, str2);
        Bundle bundle = new Bundle();
        bundle.putParcelable(VIEW_MODEL, C11187d.m39875c(searchViewModel));
        SearchResultFragment searchResultFragment = new SearchResultFragment();
        searchResultFragment.setArguments(bundle);
        return searchResultFragment;
    }
}
