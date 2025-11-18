package cm.aptoide.p092pt.comments.view;

import android.view.View;
import android.widget.Button;
import androidx.fragment.app.FragmentManager;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.account.view.AccountNavigator;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.navigator.ActivityResultNavigator;
import cm.aptoide.p092pt.store.view.StoreAddCommentDisplayable;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import com.trello.rxlifecycle.p234g.EnumC8762b;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class StoreAddCommentWidget extends Widget<StoreAddCommentDisplayable> {
    private static final String TAG = "cm.aptoide.pt.comments.view.StoreAddCommentWidget";
    private AptoideAccountManager accountManager;
    private AccountNavigator accountNavigator;
    private Button commentStore;

    public StoreAddCommentWidget(View view) {
        super(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7377a(StoreAddCommentDisplayable storeAddCommentDisplayable, Void r8) {
        return showStoreCommentFragment(storeAddCommentDisplayable.getStoreId(), storeAddCommentDisplayable.getStoreName(), getContext().getSupportFragmentManager(), this.commentStore);
    }

    static /* synthetic */ void lambda$bindView$1(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showSignInMessage$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7378b(View view) {
        this.accountNavigator.navigateToAccountView(AccountAnalytics.AccountOrigins.STORE_COMMENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showStoreCommentFragment$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m7379c(long j2, String str, final FragmentManager fragmentManager, View view, Boolean bool) {
        if (!bool.booleanValue()) {
            return showSignInMessage(view).m39968M();
        }
        final CommentDialogFragment commentDialogFragmentNewInstanceStoreComment = CommentDialogFragment.newInstanceStoreComment(j2, str);
        return commentDialogFragmentNewInstanceStoreComment.lifecycle().m40121y(new InterfaceC11252a() { // from class: cm.aptoide.pt.comments.view.x0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                commentDialogFragmentNewInstanceStoreComment.show(fragmentManager, "fragment_comment_dialog");
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.y0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((EnumC8762b) obj).equals(EnumC8762b.DESTROY_VIEW));
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.e1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return C11234e.m40016B();
            }
        });
    }

    private C11231b showSignInMessage(View view) {
        return ShowMessage.asObservableSnack(view, C1146R.string.you_need_to_be_logged_in, C1146R.string.login, new View.OnClickListener() { // from class: cm.aptoide.pt.comments.view.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8362f.m7378b(view2);
            }
        });
    }

    private C11234e<Void> showStoreCommentFragment(final long j2, final String str, final FragmentManager fragmentManager, final View view) {
        return C11234e.m40025S(Boolean.valueOf(this.accountManager.isLoggedIn())).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.c1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8268f.m7379c(j2, str, fragmentManager, view, (Boolean) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.commentStore = (Button) view.findViewById(C1146R.id.comment_store_button);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final StoreAddCommentDisplayable storeAddCommentDisplayable, int i2) {
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.accountNavigator = ((ActivityResultNavigator) getContext()).getAccountNavigator();
        this.commentStore.setBackgroundResource(storeAddCommentDisplayable.getRaisedButtonDrawable());
        this.compositeSubscription.m40667a(C8975a.m28573a(this.commentStore).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.comments.view.a1
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8260f.m7377a(storeAddCommentDisplayable, (Void) obj);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.d1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                StoreAddCommentWidget.lambda$bindView$1((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.comments.view.b1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }
}
