package cm.aptoide.p092pt.comments.view;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.comments.CommentNode;
import cm.aptoide.p092pt.comments.ComplexComment;
import cm.aptoide.p092pt.comments.view.StoreLatestCommentsWidget;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Comment;
import cm.aptoide.p092pt.dataprovider.model.p096v7.ListComments;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListCommentsRequest;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.navigator.FragmentNavigator;
import cm.aptoide.p092pt.preferences.managed.ManagerPreferences;
import cm.aptoide.p092pt.store.view.StoreLatestCommentsDisplayable;
import cm.aptoide.p092pt.util.CommentOperations;
import cm.aptoide.p092pt.view.FragmentProvider;
import cm.aptoide.p092pt.view.custom.HorizontalDividerItemDecoration;
import cm.aptoide.p092pt.view.recycler.BaseAdapter;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import com.google.android.material.snackbar.Snackbar;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import okhttp3.OkHttpClient;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class StoreLatestCommentsWidget extends Widget<StoreLatestCommentsDisplayable> {
    private AptoideAccountManager accountManager;
    private AccountNavigator accountNavigator;
    private BodyInterceptor<BaseBody> baseBodyInterceptor;
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    private RecyclerView recyclerView;
    private long storeId;
    private String storeName;
    private TokenInvalidator tokenInvalidator;

    /* JADX INFO: Access modifiers changed from: private */
    static class CommentListAdapter extends BaseAdapter {
        private final AptoideAccountManager accountManager;
        private AccountNavigator accountNavigator;

        CommentListAdapter(long j2, String str, List<Comment> list, FragmentManager fragmentManager, View view, C11234e<Void> c11234e, AptoideAccountManager aptoideAccountManager, AccountNavigator accountNavigator, FragmentNavigator fragmentNavigator, FragmentProvider fragmentProvider) {
            this.accountManager = aptoideAccountManager;
            this.accountNavigator = accountNavigator;
            CommentOperations commentOperations = new CommentOperations();
            List<CommentNode> listFlattenByDepth = commentOperations.flattenByDepth(commentOperations.transform(list));
            ArrayList arrayList = new ArrayList(listFlattenByDepth.size());
            for (CommentNode commentNode : listFlattenByDepth) {
                arrayList.add(new CommentDisplayable(new ComplexComment(commentNode, showStoreCommentFragment(j2, commentNode.getComment(), str, fragmentManager, view, c11234e)), fragmentNavigator, fragmentProvider));
            }
            addDisplayables(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$showSignInMessage$4, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m7382n(View view) {
            this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.LATEST_COMMENTS_STORE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$showSignInMessage$5, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m7383o(View view) {
            Snackbar.m24763Z(view, C1146R.string.you_need_to_be_logged_in, 0).m24765b0(C1146R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.comments.view.k1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f8313f.m7382n(view2);
                }
            }).mo24744P();
        }

        static /* synthetic */ C11234e lambda$showStoreCommentFragment$2(C11234e c11234e, EnumC8762b enumC8762b) {
            return c11234e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$showStoreCommentFragment$3, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ C11231b m7384p(long j2, Comment comment, String str, final FragmentManager fragmentManager, final C11234e c11234e, View view, Account account) {
            if (!account.isLoggedIn()) {
                return showSignInMessage(view);
            }
            final CommentDialogFragment commentDialogFragmentNewInstanceStoreCommentReply = CommentDialogFragment.newInstanceStoreCommentReply(j2, comment.getId(), str);
            return commentDialogFragmentNewInstanceStoreCommentReply.lifecycle().m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.comments.view.g1
                @Override // p456rx.p460m.InterfaceC11252a
                public final void call() {
                    commentDialogFragmentNewInstanceStoreCommentReply.show(fragmentManager, "fragment_comment_dialog_latest");
                }
            }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.f1
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return Boolean.valueOf(((EnumC8762b) obj).equals(EnumC8762b.DESTROY_VIEW));
                }
            }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.j1
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    C11234e c11234e2 = c11234e;
                    StoreLatestCommentsWidget.CommentListAdapter.lambda$showStoreCommentFragment$2(c11234e2, (EnumC8762b) obj);
                    return c11234e2;
                }
            }).m40083X0();
        }

        private C11231b showSignInMessage(final View view) {
            return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.comments.view.h1
                @Override // p456rx.p460m.InterfaceC11252a
                public final void call() {
                    this.f8294f.m7383o(view);
                }
            });
        }

        private C11231b showStoreCommentFragment(final long j2, final Comment comment, final String str, final FragmentManager fragmentManager, final View view, final C11234e<Void> c11234e) {
            return this.accountManager.accountStatus().m40057E().m40085Z0().m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.i1
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f8298f.m7384p(j2, comment, str, fragmentManager, c11234e, view, (Account) obj);
                }
            });
        }
    }

    public StoreLatestCommentsWidget(View view) {
        super(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$reloadComments$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7380a(ListComments listComments) {
        setAdapter(listComments.getDataList().getList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: reloadComments, reason: merged with bridge method [inline-methods] */
    public Void m7381b() {
        ManagerPreferences.setForceServerRefreshFlag(true, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
        this.compositeSubscription.m40667a(ListCommentsRequest.m7448of(this.storeId, 0, 3, false, this.baseBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()).observe().m40065I0(Schedulers.m40658io()).m40095j0(C11250a.m40156b()).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.m1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f8320f.m7380a((ListComments) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.l1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
        return null;
    }

    private void setAdapter(List<Comment> list) {
        RecyclerView recyclerView = this.recyclerView;
        long j2 = this.storeId;
        String str = this.storeName;
        FragmentManager supportFragmentManager = getContext().getSupportFragmentManager();
        RecyclerView recyclerView2 = this.recyclerView;
        C11234e c11234eM40022P = C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.comments.view.n1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8326f.m7381b();
            }
        });
        AptoideAccountManager aptoideAccountManager = this.accountManager;
        AccountNavigator accountNavigator = this.accountNavigator;
        FragmentNavigator fragmentNavigator = getFragmentNavigator();
        recyclerView.setAdapter(new CommentListAdapter(j2, str, list, supportFragmentManager, recyclerView2, c11234eM40022P, aptoideAccountManager, accountNavigator, fragmentNavigator, AptoideApplication.getFragmentProvider()));
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.recyclerView = (RecyclerView) view.findViewById(C1146R.id.comments);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(StoreLatestCommentsDisplayable storeLatestCommentsDisplayable, int i2) {
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.tokenInvalidator = ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator();
        this.baseBodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.accountNavigator = ((ActivityResultNavigator) getContext()).getAccountNavigator();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this.recyclerView.getContext()));
        this.recyclerView.addItemDecoration(new HorizontalDividerItemDecoration(((ActivityResultNavigator) getContext()).getActivity(), storeLatestCommentsDisplayable.getThemeManager()));
        this.storeId = storeLatestCommentsDisplayable.getStoreId();
        this.storeName = storeLatestCommentsDisplayable.getStoreName();
        setAdapter(storeLatestCommentsDisplayable.getComments());
    }
}
