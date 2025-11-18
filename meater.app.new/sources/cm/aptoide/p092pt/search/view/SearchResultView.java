package cm.aptoide.p092pt.search.view;

import android.content.DialogInterface;
import android.view.MenuItem;
import cm.aptoide.aptoideviews.filters.Filter;
import cm.aptoide.p092pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.p092pt.download.view.DownloadClick;
import cm.aptoide.p092pt.search.model.SearchAppResult;
import cm.aptoide.p092pt.search.model.SearchAppResultWrapper;
import cm.aptoide.p092pt.search.model.SearchQueryModel;
import cm.aptoide.p092pt.search.model.SearchResultError;
import cm.aptoide.p092pt.search.suggestions.SearchQueryEvent;
import java.util.List;
import p024c.p052i.p059j.C0955e;
import p241e.p294g.p295a.p297b.p302c.p303a.C8973g;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface SearchResultView extends SearchSuggestionsView {

    public interface Model {
        List<Filter> getFilters();

        SearchQueryModel getSearchQueryModel();

        String getStoreName();

        String getStoreTheme();

        boolean hasLoadedAds();

        boolean hasLoadedResults();
    }

    void addAllStoresResult(String str, List<SearchAppResult> list, boolean z, boolean z2, boolean z3, SearchResultError searchResultError);

    C11234e<DialogInterface> adultContentDialogNegativeClick();

    C11234e<DialogInterface> adultContentDialogPositiveClick();

    C11234e<DialogInterface> adultContentPinDialogNegativeClick();

    C11234e<CharSequence> adultContentWithPinDialogPositiveClick();

    void clearUnsubmittedQuery();

    C11234e<Boolean> clickAdultContentSwitch();

    void disableAdultContent();

    void disableUpNavigation();

    void enableAdultContent();

    C11234e<List<Filter>> filtersChangeEvents();

    C11234e<DownloadClick> getDownloadClickEvents();

    C11234e<ScreenShotClickEvent> getScreenshotClickEvent();

    Model getViewModel();

    boolean hasResults();

    void hideLoading();

    void hideSuggestionsViews();

    boolean isSearchViewExpanded();

    C11234e<C0955e<String, SearchQueryEvent>> listenToSuggestionClick();

    C11234e<SearchAppResultWrapper> onViewItemClicked();

    C11234e<C8973g> queryChanged();

    void queryEvent(C8973g c8973g);

    C11234e<Void> retryClicked();

    void scrollToTop();

    C11234e<MenuItem> searchMenuItemClick();

    C11234e<Void> searchResultsReachedBottom();

    C11234e<Void> searchSetup();

    void setAdultContentSwitch(Boolean bool);

    void setUnsubmittedQuery(String str);

    void setVisibilityOnRestore();

    boolean shouldFocusInSearchBar();

    boolean shouldHideUpNavigation();

    boolean shouldShowSuggestions();

    void showAdultContentConfirmationDialog();

    void showAdultContentConfirmationDialogWithPin();

    void showBannerAd();

    void showGenericErrorView();

    void showLoading();

    void showMoreLoading();

    void showNativeAds();

    void showNoNetworkView();

    void showNoResultsView();

    void showResultsLoading();

    void showResultsView();

    void showWrongPinErrorMessage();

    void toggleSuggestionsView();

    void toggleTrendingView();

    C11234e<Void> toolbarClick();

    C11234e<Void> viewHasNoResults();
}
