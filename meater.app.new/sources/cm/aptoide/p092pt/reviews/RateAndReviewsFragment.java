package cm.aptoide.p092pt.reviews;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.UserFeedbackAnalytics;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.app.view.AppViewFragment;
import cm.aptoide.p092pt.comments.ListFullReviewsSuccessRequestListener;
import cm.aptoide.p092pt.comments.view.CommentDisplayable;
import cm.aptoide.p092pt.comments.view.CommentsAdapter;
import cm.aptoide.p092pt.comments.view.CommentsReadMoreDisplayable;
import cm.aptoide.p092pt.comments.view.ItemCommentAdderView;
import cm.aptoide.p092pt.comments.view.RateAndReviewCommentDisplayable;
import cm.aptoide.p092pt.comments.view.SimpleReviewCommentAdder;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Comment;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetApp;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Review;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetAppRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListReviewsRequest;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.reviews.LanguageFilterHelper;
import cm.aptoide.p092pt.reviews.LanguageFilterSpinnerHelper;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.util.MarketResourceFormatter;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.view.dialog.DialogUtils;
import cm.aptoide.p092pt.view.fragment.AptoideBaseFragment;
import cm.aptoide.p092pt.view.recycler.EndlessRecyclerOnScrollListener;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.ProgressBarDisplayable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class RateAndReviewsFragment extends AptoideBaseFragment<CommentsAdapter> implements ItemCommentAdderView<Review, CommentsAdapter> {
    private static final String TAG = RateAndReviewsFragment.class.getSimpleName();
    private long appId;
    private String appName;

    @Inject
    AppNavigator appNavigator;

    @Inject
    AptoideInstalledAppsRepository aptoideInstalledAppsRepository;
    private BodyInterceptor<BaseBody> baseBodyInterceptor;
    private Converter.Factory converterFactory;

    @Inject
    DialogUtils dialogUtils;
    private EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    private OkHttpClient httpClient;
    private MenuItem installMenuItem;

    @Inject
    @Named
    String marketName;

    @Inject
    MarketResourceFormatter marketResourceFormatter;
    private String packageName;
    private SharedPreferences preferences;
    private long reviewId;
    private ReviewsLanguageFilterDisplayable reviewsLanguageFilterDisplayable;

    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    private String storeName;
    private String storeTheme;

    @Inject
    ThemeManager themeManager;
    private TokenInvalidator tokenInvalidator;

    @Inject
    UserFeedbackAnalytics userFeedbackAnalytics;

    public static class BundleCons {
        public static final String APP_ID = "app_id";
        public static final String APP_NAME = "app_name";
        public static final String PACKAGE_NAME = "package_name";
        public static final String REVIEW_ID = "review_id";
        public static final String STORE_NAME = "store_name";
        public static final String STORE_THEME = "store_theme";
    }

    private ListReviewsRequest createListReviewsRequest(String str) {
        String str2 = this.storeName;
        return ListReviewsRequest.m7454of(str2, this.packageName, this.storeCredentialsProvider.get(str2), this.baseBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), str);
    }

    private void fetchRating(boolean z) {
        GetAppRequest.m7441of(this.packageName, this.baseBodyInterceptor, this.appId, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()).observe(z, ManagerPreferences.getAndResetForceServerRefresh(this.preferences)).m40065I0(Schedulers.m40658io()).m40095j0(C11250a.m40156b()).m40091f(bindUntilEvent(EnumC8762b.DESTROY_VIEW)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.reviews.i
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10968f.m8602g((GetApp) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.reviews.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindViews$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8600e(Void r5) {
        return this.dialogUtils.showRateDialog(getActivity(), this.appName, this.packageName, this.storeName);
    }

    static /* synthetic */ void lambda$bindViews$3(GenericDialogs.EResponse eResponse) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$fetchRating$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8601f(LanguageFilterHelper.LanguageFilter languageFilter) {
        removeDisplayables(1, getDisplayablesSize() - 1);
        fetchReviews(languageFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$fetchRating$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8602g(GetApp getApp) {
        if (getApp.isOk()) {
            GetAppMeta.App data = getApp.getNodes().getMeta().getData();
            setupTitle(data.getName());
            addDisplayable(0, new ReviewsRatingDisplayable(data), true);
            ReviewsLanguageFilterDisplayable reviewsLanguageFilterDisplayable = new ReviewsLanguageFilterDisplayable(new LanguageFilterSpinnerHelper.OnItemSelected() { // from class: cm.aptoide.pt.reviews.j
                @Override // cm.aptoide.pt.reviews.LanguageFilterSpinnerHelper.OnItemSelected
                public final void onItemSelected(LanguageFilterHelper.LanguageFilter languageFilter) {
                    this.f10969a.m8601f(languageFilter);
                }
            });
            this.reviewsLanguageFilterDisplayable = reviewsLanguageFilterDisplayable;
            addDisplayable(reviewsLanguageFilterDisplayable);
        }
        finishLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$fetchReviews$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8603h(LanguageFilterHelper.LanguageFilter languageFilter, EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener) {
        if (languageFilter.hasMoreCountryCodes()) {
            this.endlessRecyclerOnScrollListener.reset(createListReviewsRequest(languageFilter.inc().getValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateOptionsMenu$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8604i(RoomInstalled roomInstalled) {
        if (roomInstalled != null) {
            this.installMenuItem.setTitle(C1146R.string.reviewappview_button_open);
        }
    }

    public static RateAndReviewsFragment newInstance(long j2, String str, String str2, String str3, String str4) {
        RateAndReviewsFragment rateAndReviewsFragment = new RateAndReviewsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong(BundleCons.APP_ID, j2);
        bundle.putString("app_name", str);
        bundle.putString("store_name", str2);
        bundle.putString("package_name", str3);
        bundle.putString(BundleCons.STORE_THEME, str4);
        rateAndReviewsFragment.setArguments(bundle);
        return rateAndReviewsFragment;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        super.bindViews(view);
        C8975a.m28573a((FloatingActionButton) view.findViewById(C1146R.id.fab)).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.reviews.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10965f.m8600e((Void) obj);
            }
        }).m40091f(bindUntilEvent(EnumC8762b.DESTROY_VIEW)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.reviews.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                RateAndReviewsFragment.lambda$bindViews$3((GenericDialogs.EResponse) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.reviews.h
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void checkAndRemoveProgressBarDisplayable() {
        for (int i2 = 0; i2 < ((CommentsAdapter) getAdapter()).getItemCount(); i2++) {
            if (((CommentsAdapter) getAdapter()).getDisplayable(i2) instanceof ProgressBarDisplayable) {
                ((CommentsAdapter) getAdapter()).removeDisplayable(i2);
                ((CommentsAdapter) getAdapter()).notifyItemRemoved(i2);
            }
        }
    }

    @Override // cm.aptoide.p092pt.comments.view.CommentAdderView
    public void createDisplayableComments(List<Comment> list, List<Displayable> list2) {
        for (Comment comment : list) {
            FragmentNavigator fragmentNavigator = getFragmentNavigator();
            list2.add(new CommentDisplayable(comment, fragmentNavigator, AptoideApplication.getFragmentProvider()));
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    protected boolean displayHomeUpAsEnabled() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cm.aptoide.pt.view.recycler.BaseAdapter] */
    void fetchReviews(final LanguageFilterHelper.LanguageFilter languageFilter) {
        addDisplayable(this.reviewsLanguageFilterDisplayable);
        ListReviewsRequest listReviewsRequestCreateListReviewsRequest = createListReviewsRequest(languageFilter.getValue());
        getRecyclerView().removeOnScrollListener(this.endlessRecyclerOnScrollListener);
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener = new EndlessRecyclerOnScrollListener(getAdapter(), listReviewsRequestCreateListReviewsRequest, new ListFullReviewsSuccessRequestListener(this, this.storeCredentialsProvider, this.baseBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), this.userFeedbackAnalytics), new ErrorRequestListener() { // from class: cm.aptoide.pt.reviews.d
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                th.printStackTrace();
            }
        });
        this.endlessRecyclerOnScrollListener = endlessRecyclerOnScrollListener;
        endlessRecyclerOnScrollListener.addOnEndlessFinishListener(new EndlessRecyclerOnScrollListener.OnEndlessFinish() { // from class: cm.aptoide.pt.reviews.m
            @Override // cm.aptoide.pt.view.recycler.EndlessRecyclerOnScrollListener.OnEndlessFinish
            public final void onEndlessFinish(EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener2) {
                this.f10972a.m8603h(languageFilter, endlessRecyclerOnScrollListener2);
            }
        });
        getRecyclerView().addOnScrollListener(this.endlessRecyclerOnScrollListener);
        this.endlessRecyclerOnScrollListener.onLoadMore(false, false);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.comments.view.CommentAdderView
    public /* bridge */ /* synthetic */ CommentsAdapter getAdapter() {
        return (CommentsAdapter) super.getAdapter();
    }

    public String getAppName() {
        return this.appName;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1146R.layout.fragment_rate_and_reviews;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    public long getReviewId() {
        return this.reviewId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.LoadInterface
    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        Logger.getInstance().m8273d(TAG, "Other versions should refresh? " + z);
        fetchRating(z2);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.appId = bundle.getLong(BundleCons.APP_ID);
        this.reviewId = bundle.getLong(BundleCons.REVIEW_ID);
        this.packageName = bundle.getString("package_name");
        this.storeName = bundle.getString("store_name");
        this.appName = bundle.getString("app_name");
        this.storeTheme = bundle.getString(BundleCons.STORE_THEME);
    }

    @Override // cm.aptoide.p092pt.view.fragment.AptoideBaseFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.preferences = ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences();
        this.tokenInvalidator = ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator();
        this.baseBodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1146R.menu.menu_install, menu);
        this.installMenuItem = menu.findItem(C1146R.id.menu_install);
        this.aptoideInstalledAppsRepository.getInstalled(this.packageName).m40091f(bindUntilEvent(EnumC8762b.DESTROY_VIEW)).m40095j0(C11250a.m40156b()).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.reviews.k
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10970f.m8604i((RoomInstalled) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.reviews.l
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.themeManager.resetToBaseTheme();
        super.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            getActivity().onBackPressed();
            return true;
        }
        if (itemId != C1146R.id.menu_install) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.appNavigator.navigateWithPackageAndStoreNames(this.packageName, this.storeName, AppViewFragment.OpenType.OPEN_AND_INSTALL);
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String str = this.storeTheme;
        if (str != null) {
            this.themeManager.setTheme(str);
        }
    }

    public void setupTitle(String str) {
        if (hasToolbar()) {
            getToolbar().setTitle(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cm.aptoide.p092pt.view.fragment.GridRecyclerFragment, cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment
    public CommentsAdapter createAdapter() {
        return new CommentsAdapter(RateAndReviewCommentDisplayable.class);
    }

    @Override // cm.aptoide.p092pt.comments.view.ItemCommentAdderView
    public CommentsReadMoreDisplayable createReadMoreDisplayable(int i2, Review review) {
        return new CommentsReadMoreDisplayable(review.getId(), true, review.getCommentList().getDataList().getNext(), new SimpleReviewCommentAdder(i2, this));
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.LifecycleSchim
    public void onViewCreated() {
        super.onViewCreated();
    }

    public static RateAndReviewsFragment newInstance(long j2, String str, String str2, String str3, long j3) {
        RateAndReviewsFragment rateAndReviewsFragment = new RateAndReviewsFragment();
        Bundle bundle = new Bundle();
        bundle.putLong(BundleCons.APP_ID, j2);
        bundle.putString("app_name", str);
        bundle.putString("store_name", str2);
        bundle.putString("package_name", str3);
        bundle.putLong(BundleCons.REVIEW_ID, j3);
        rateAndReviewsFragment.setArguments(bundle);
        return rateAndReviewsFragment;
    }
}
