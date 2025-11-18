package cm.aptoide.p092pt.comments.view;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.comments.CommentDialogCallbackContract;
import cm.aptoide.p092pt.comments.CommentNode;
import cm.aptoide.p092pt.comments.ComplexComment;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Comment;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListComments;
import cm.aptoide.p092pt.dataprovider.model.p096v7.SetComment;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListCommentsRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.dataprovider.util.CommentType;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtils;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.util.CommentOperations;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.custom.HorizontalDividerItemDecoration;
import cm.aptoide.p092pt.view.fragment.GridRecyclerSwipeFragment;
import cm.aptoide.p092pt.view.recycler.EndlessRecyclerOnScrollListener;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayableGroup;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class CommentListFragment extends GridRecyclerSwipeFragment implements CommentDialogCallbackContract {
    private static final String COMMENT_TYPE = "comment_type";
    private static final String ELEMENT_ID_AS_LONG = "element_id_as_long";
    private static final String STORE_ANALYTICS_ACTION = "store_analytics_action";
    private static final String STORE_CONTEXT = "store_context";
    private static final String URL_VAL = "url_val";
    private AptoideAccountManager accountManager;
    private AccountNavigator accountNavigator;

    @Inject
    AnalyticsManager analyticsManager;
    private BodyInterceptor<BaseBody> bodyDecorator;
    private CommentOperations commentOperations;
    private CommentType commentType;
    private List<CommentNode> comments;
    private Converter.Factory converterFactory;
    private List<Displayable> displayables;
    private long elementIdAsLong;
    private FloatingActionButton floatingActionButton;
    private OkHttpClient httpClient;

    @Inject
    NavigationTracker navigationTracker;
    private SharedPreferences sharedPreferences;
    private StoreAnalytics storeAnalytics;
    private String storeAnalyticsAction;
    private StoreContext storeContext;

    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    private String storeName;

    @Inject
    ThemeManager themeManager;
    private TokenInvalidator tokenInvalidator;
    private String url;

    private C11231b createNewCommentFragment(final long j2, final long j3, final String str) {
        return this.accountManager.accountStatus().m40057E().m40085Z0().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8321f.m7357g(j2, j3, str, (Account) obj);
            }
        });
    }

    private ComplexComment getComplexComment(String str, Long l, long j2) {
        Comment comment = new Comment();
        Comment.User user = new Comment.User();
        if (!TextUtils.isEmpty(this.accountManager.getAccount().getAvatar())) {
            user.setAvatar(this.accountManager.getAccount().getAvatar());
        } else if (!TextUtils.isEmpty(this.accountManager.getAccount().getStore().getAvatar())) {
            user.setAvatar(this.accountManager.getAccount().getStore().getAvatar());
        }
        user.setName(this.accountManager.getAccount().getNickname());
        comment.setUser(user);
        comment.setBody(str);
        comment.setAdded(new Date());
        comment.setId(j2);
        CommentNode commentNode = new CommentNode(comment);
        if (l != null) {
            Comment.Parent parent = new Comment.Parent();
            parent.setId(l.longValue());
            comment.setParent(parent);
            commentNode.setLevel(2);
        }
        return new ComplexComment(commentNode, createNewCommentFragment(this.elementIdAsLong, commentNode.getComment().getId(), this.storeName));
    }

    private void insertChildCommentInsideParent(ComplexComment complexComment) {
        this.displayables.clear();
        ArrayList arrayList = new ArrayList(this.comments.size() + 1);
        boolean z = false;
        for (CommentNode commentNode : this.comments) {
            ComplexComment complexComment2 = new ComplexComment(commentNode, createNewCommentFragment(this.elementIdAsLong, commentNode.getComment().getId(), this.storeName));
            FragmentNavigator fragmentNavigator = getFragmentNavigator();
            arrayList.add(new CommentDisplayable(complexComment2, fragmentNavigator, AptoideApplication.getFragmentProvider()));
            if (commentNode.getComment().getId() == complexComment.getParent().getId() && !z) {
                FragmentNavigator fragmentNavigator2 = getFragmentNavigator();
                arrayList.add(new CommentDisplayable(complexComment, fragmentNavigator2, AptoideApplication.getFragmentProvider()));
                z = true;
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        this.displayables = arrayList2;
        arrayList2.add(new DisplayableGroup(arrayList, (WindowManager) getContext().getSystemService("window"), getContext().getResources()));
        clearDisplayables();
        addDisplayables(this.displayables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$caseListStoreComments$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7355e(long j2, String str, ListComments listComments) {
        if (listComments == null || listComments.getDataList() == null || listComments.getDataList().getList() == null) {
            return;
        }
        CommentOperations commentOperations = this.commentOperations;
        this.comments = commentOperations.flattenByDepth(commentOperations.transform(listComments.getDataList().getList()));
        ArrayList arrayList = new ArrayList(this.comments.size());
        for (CommentNode commentNode : this.comments) {
            ComplexComment complexComment = new ComplexComment(commentNode, createNewCommentFragment(j2, commentNode.getComment().getId(), str));
            FragmentNavigator fragmentNavigator = getFragmentNavigator();
            arrayList.add(new CommentDisplayable(complexComment, fragmentNavigator, AptoideApplication.getFragmentProvider()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        this.displayables = arrayList2;
        arrayList2.add(new DisplayableGroup(arrayList, (WindowManager) getContext().getSystemService("window"), getContext().getResources()));
        addDisplayables(this.displayables);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createNewCommentFragment$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7356f(long j2, String str, Account account) {
        if (!account.isLoggedIn()) {
            return showSignInMessage();
        }
        final FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        final CommentDialogFragment commentDialogFragmentNewInstanceStoreComment = CommentDialogFragment.newInstanceStoreComment(j2, str);
        commentDialogFragmentNewInstanceStoreComment.setCommentDialogCallbackContract(this);
        return commentDialogFragmentNewInstanceStoreComment.lifecycle().m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.comments.view.q
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                commentDialogFragmentNewInstanceStoreComment.show(supportFragmentManager, "fragment_comment_dialog");
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.r
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EnumC8762b) obj).equals(EnumC8762b.DESTROY_VIEW));
            }
        }).m40083X0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$createNewCommentFragment$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7357g(long j2, long j3, String str, Account account) {
        if (!account.isLoggedIn()) {
            return showSignInMessage();
        }
        final FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        final CommentDialogFragment commentDialogFragmentNewInstanceStoreCommentReply = CommentDialogFragment.newInstanceStoreCommentReply(j2, j3, str);
        commentDialogFragmentNewInstanceStoreCommentReply.setCommentDialogCallbackContract(this);
        return commentDialogFragmentNewInstanceStoreCommentReply.lifecycle().m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.comments.view.h
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                commentDialogFragmentNewInstanceStoreCommentReply.show(supportFragmentManager, "fragment_comment_dialog");
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.j
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EnumC8762b) obj).equals(EnumC8762b.DESTROY_VIEW));
            }
        }).m40083X0();
    }

    private /* synthetic */ Void lambda$reloadComments$8() throws Exception {
        ManagerPreferences.setForceServerRefreshFlag(true, this.sharedPreferences);
        super.reload();
        return null;
    }

    static /* synthetic */ void lambda$setupViews$10(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupViews$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7359i(Void r3) {
        return createNewCommentFragment(this.elementIdAsLong, this.storeName).m39968M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSignInMessage$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7360j(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.COMMENT_LIST);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSignInMessage$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7361k(FloatingActionButton floatingActionButton) {
        Snackbar.m24763Z(floatingActionButton, C1146R.string.you_need_to_be_logged_in, 0).m24765b0(C1146R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.comments.view.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8327f.m7360j(view);
            }
        }).mo24744P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSignInMessage$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m7362l(final FloatingActionButton floatingActionButton) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.comments.view.s
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f8339f.m7361k(floatingActionButton);
            }
        });
    }

    public static Fragment newInstanceUrl(CommentType commentType, String str, String str2, StoreContext storeContext) {
        Bundle bundle = new Bundle();
        bundle.putString(URL_VAL, str);
        bundle.putSerializable(STORE_CONTEXT, storeContext);
        bundle.putString(COMMENT_TYPE, commentType.name());
        bundle.putString(STORE_ANALYTICS_ACTION, str2);
        CommentListFragment commentListFragment = new CommentListFragment();
        commentListFragment.setArguments(bundle);
        return commentListFragment;
    }

    private C11234e<Void> reloadComments() {
        return C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.comments.view.l
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                this.f8314f.m7358h();
                return null;
            }
        });
    }

    private C11231b showSignInMessage() {
        return Single.m39913m(this.floatingActionButton).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.t
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8342f.m7362l((FloatingActionButton) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void bindViews(View view) {
        super.bindViews(view);
        this.commentOperations = new CommentOperations();
        FloatingActionButton floatingActionButton = (FloatingActionButton) view.findViewById(C1146R.id.fabAdd);
        this.floatingActionButton = floatingActionButton;
        if (floatingActionButton != null) {
            this.floatingActionButton.setImageDrawable(Build.VERSION.SDK_INT >= 21 ? getContext().getDrawable(this.themeManager.getAttributeForTheme(C1146R.attr.penDrawable).resourceId) : getActivity().getResources().getDrawable(this.themeManager.getAttributeForTheme(C1146R.attr.penDrawable).resourceId));
            this.floatingActionButton.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [cm.aptoide.pt.view.recycler.BaseAdapter] */
    void caseListStoreComments(String str, BaseRequestWithStore.StoreCredentials storeCredentials, boolean z) {
        ListCommentsRequest listCommentsRequestOfStoreAction = ListCommentsRequest.ofStoreAction(str, z, storeCredentials, this.bodyDecorator, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
        if (storeCredentials == null || storeCredentials.getId() == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Current store credentials does not have a store id");
            CrashReport.getInstance().log(illegalStateException);
            throw illegalStateException;
        }
        final long jLongValue = storeCredentials.getId() != null ? storeCredentials.getId().longValue() : -1L;
        final String name = storeCredentials.getName();
        InterfaceC11253b interfaceC11253b = new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.u
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8346f.m7355e(jLongValue, name, (ListComments) obj);
            }
        };
        getRecyclerView().clearOnScrollListeners();
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener = new EndlessRecyclerOnScrollListener(getAdapter(), listCommentsRequestOfStoreAction, interfaceC11253b, new ErrorRequestListener() { // from class: cm.aptoide.pt.comments.view.m
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                th.printStackTrace();
            }
        }, true, false);
        getRecyclerView().addOnScrollListener(endlessRecyclerOnScrollListener);
        endlessRecyclerOnScrollListener.onLoadMore(z, z);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    protected boolean displayHomeUpAsEnabled() {
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.GridRecyclerSwipeFragment, cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1146R.layout.recycler_swipe_fragment_with_toolbar;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        String simpleName = getClass().getSimpleName();
        StoreContext storeContext = this.storeContext;
        return ScreenTagHistory.Builder.build(simpleName, HttpUrl.FRAGMENT_ENCODE_SET, storeContext != null ? storeContext.name() : null);
    }

    @Override // cm.aptoide.p092pt.view.fragment.GridRecyclerFragmentWithDecorator
    protected RecyclerView.AbstractC0601n getItemDecoration() {
        return new HorizontalDividerItemDecoration(getActivity(), this.themeManager);
    }

    /* renamed from: h */
    public /* synthetic */ Void m7358h() throws Exception {
        lambda$reloadComments$8();
        return null;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.LoadInterface
    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        if (z || z2) {
            refreshData();
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        BaseRequestWithStore.StoreCredentials storeCredentialsFromUrl;
        super.loadExtras(bundle);
        this.storeContext = (StoreContext) bundle.getSerializable(STORE_CONTEXT);
        this.elementIdAsLong = bundle.getLong(ELEMENT_ID_AS_LONG);
        this.url = bundle.getString(URL_VAL);
        this.commentType = CommentType.valueOf(bundle.getString(COMMENT_TYPE));
        this.storeAnalyticsAction = bundle.getString(STORE_ANALYTICS_ACTION);
        if (this.commentType != CommentType.STORE || (storeCredentialsFromUrl = StoreUtils.getStoreCredentialsFromUrl(this.url, this.storeCredentialsProvider)) == null) {
            return;
        }
        Long id = storeCredentialsFromUrl.getId();
        if (id != null) {
            this.elementIdAsLong = id.longValue();
        }
        if (TextUtils.isEmpty(storeCredentialsFromUrl.getName())) {
            return;
        }
        this.storeName = storeCredentialsFromUrl.getName();
    }

    @Override // cm.aptoide.p092pt.comments.CommentDialogCallbackContract
    public void okSelected(BaseV7Response baseV7Response, long j2, Long l, String str) {
        if (baseV7Response instanceof SetComment) {
            SetComment setComment = (SetComment) baseV7Response;
            ComplexComment complexComment = getComplexComment(setComment.getData().getBody(), l, setComment.getData().getId());
            FragmentNavigator fragmentNavigator = getFragmentNavigator();
            CommentDisplayable commentDisplayable = new CommentDisplayable(complexComment, fragmentNavigator, AptoideApplication.getFragmentProvider());
            if (complexComment.getParent() != null) {
                insertChildCommentInsideParent(complexComment);
            } else {
                addDisplayable(0, (Displayable) commentDisplayable, true);
            }
            ManagerPreferences.setForceServerRefreshFlag(true, this.sharedPreferences);
            ShowMessage.asSnack(getActivity(), C1146R.string.comment_submitted);
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.AptoideBaseFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        getFragmentComponent(bundle).inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.sharedPreferences = aptoideApplication.getDefaultSharedPreferences();
        this.tokenInvalidator = aptoideApplication.getTokenInvalidator();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1146R.menu.menu_empty, menu);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.bodyDecorator = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.accountNavigator = ((ActivityResultNavigator) getContext()).getAccountNavigator();
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        return viewOnCreateView;
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.commentType == CommentType.STORE) {
            StoreAnalytics storeAnalytics = this.storeAnalytics;
            String str = this.storeAnalyticsAction;
            String str2 = this.storeName;
            if (str2 == null) {
                str2 = "unknown";
            }
            storeAnalytics.sendStoreInteractEvent(str, "Home", str2);
        }
    }

    void refreshData() {
        String str = this.url;
        caseListStoreComments(str, StoreUtils.getStoreCredentialsFromUrl(str, this.storeCredentialsProvider), true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    public void setupToolbarDetails(Toolbar toolbar) {
        if (this.commentType != CommentType.STORE || TextUtils.isEmpty(this.storeName)) {
            toolbar.setTitle(C1146R.string.comments_title_comments);
        } else {
            toolbar.setTitle(String.format(getString(C1146R.string.commentlist_title_comment_on_store), this.storeName));
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.GridRecyclerFragmentWithDecorator, cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void setupViews() {
        super.setupViews();
        setupToolbar();
        C8975a.m28573a(this.floatingActionButton).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8296f.m7359i((Void) obj);
            }
        }).m40091f(bindUntilEvent(View.LifecycleEvent.DESTROY)).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.p
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CommentListFragment.lambda$setupViews$10(obj);
            }
        });
    }

    public C11231b createNewCommentFragment(final long j2, final String str) {
        return this.accountManager.accountStatus().m40057E().m40085Z0().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8308f.m7356f(j2, str, (Account) obj);
            }
        });
    }
}
