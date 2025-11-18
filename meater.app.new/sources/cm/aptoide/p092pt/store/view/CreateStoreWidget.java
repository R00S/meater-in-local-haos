package cm.aptoide.p092pt.store.view;

import android.text.ParcelableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.account.view.store.ManageStoreFragment;
import cm.aptoide.p092pt.account.view.store.ManageStoreViewModel;
import cm.aptoide.p092pt.account.view.user.CreateStoreDisplayable;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import cm.aptoide.p092pt.view.spannable.SpannableFactory;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class CreateStoreWidget extends Widget<CreateStoreDisplayable> {
    private Button button;
    private final CrashReport crashReport;
    private TextView followers;
    private TextView following;

    public CreateStoreWidget(View view) {
        super(view);
        this.crashReport = CrashReport.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8785a(Void r3) {
        getFragmentNavigator().navigateTo(ManageStoreFragment.newInstance(new ManageStoreViewModel(), false), true);
    }

    static /* synthetic */ void lambda$bindView$2(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8786b(Throwable th) {
        this.crashReport.log(th);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.button = (Button) view.findViewById(C1146R.id.create_store_action);
        this.followers = (TextView) view.findViewById(C1146R.id.followers);
        this.following = (TextView) view.findViewById(C1146R.id.following);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final CreateStoreDisplayable createStoreDisplayable, int i2) {
        SpannableFactory spannableFactory = new SpannableFactory();
        String str = String.format(getContext().getString(C1146R.string.storetab_short_followers), String.valueOf(createStoreDisplayable.getFollowers()));
        ParcelableSpan[] parcelableSpanArr = {new StyleSpan(1), new ForegroundColorSpan(createStoreDisplayable.getTextAccentColor())};
        this.followers.setText(spannableFactory.createMultiSpan(str, parcelableSpanArr, String.valueOf(createStoreDisplayable.getFollowers())));
        this.following.setText(spannableFactory.createMultiSpan(String.format(getContext().getString(C1146R.string.storetab_short_followings), String.valueOf(createStoreDisplayable.getFollowings())), parcelableSpanArr, String.valueOf(createStoreDisplayable.getFollowings())));
        this.compositeSubscription.m40667a(C8975a.m28573a(this.button).m40095j0(C11250a.m40156b()).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.z
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11498f.m8785a((Void) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.y
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                createStoreDisplayable.getStoreAnalytics().sendStoreTabInteractEvent("Login", false);
            }
        }).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.a0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CreateStoreWidget.lambda$bindView$2((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.x
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11489f.m8786b((Throwable) obj);
            }
        }));
    }
}
