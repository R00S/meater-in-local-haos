package cm.aptoide.p092pt.store.view.recommended;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.design.ShowMessage;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class RecommendedStoreWidget extends Widget<RecommendedStoreDisplayable> {
    private AppCompatButton followButton;
    private TextView followingUsers;
    private TextView numberStoreApps;
    private StoreAnalytics storeAnalytics;
    private ImageView storeIcon;
    private TextView storeName;

    public RecommendedStoreWidget(View view) {
        super(view);
        this.storeAnalytics = new StoreAnalytics(((AptoideApplication) getContext().getApplicationContext()).getAnalyticsManager(), ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8847a(RecommendedStoreDisplayable recommendedStoreDisplayable, Store store, Void r4) {
        recommendedStoreDisplayable.openStoreFragment(getFragmentNavigator());
        if (recommendedStoreDisplayable.getOrigin().isEmpty()) {
            this.storeAnalytics.sendStoreOpenEvent("Recommended Stores", store.getName(), false);
            this.storeAnalytics.sendStoreTabInteractEvent("Open a Recommended Store", false);
        } else {
            this.storeAnalytics.sendStoreOpenEvent(recommendedStoreDisplayable.getOrigin(), store.getName(), false);
            this.storeAnalytics.sendStoreTabInteractEvent("More Recommended Stores", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setButtonText$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8848b(RecommendedStoreDisplayable recommendedStoreDisplayable, Boolean bool) {
        this.followButton.setText(AptoideUtils.StringU.getFormattedString(bool.booleanValue() ? C1146R.string.followed : C1146R.string.follow, getContext().getResources(), recommendedStoreDisplayable.getPojo().getName()));
        this.followButton.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setFollowButtonListener$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m8849c(RecommendedStoreDisplayable recommendedStoreDisplayable, Boolean bool) {
        if (bool.booleanValue()) {
            recommendedStoreDisplayable.unsubscribeStore(getContext().getApplicationContext());
        } else {
            recommendedStoreDisplayable.subscribeStore();
        }
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setFollowButtonListener$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8850d(final RecommendedStoreDisplayable recommendedStoreDisplayable, Void r5) {
        this.followButton.setEnabled(false);
        this.storeAnalytics.sendStoreTabInteractEvent("Follow a Recommended Store", recommendedStoreDisplayable.getPojo().getStats().getApps(), recommendedStoreDisplayable.getPojo().getStats().getSubscribers());
        return recommendedStoreDisplayable.isFollowing().m40057E().m40095j0(Schedulers.computation()).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.recommended.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11434f.m8849c(recommendedStoreDisplayable, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setFollowButtonListener$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8851e(RecommendedStoreDisplayable recommendedStoreDisplayable, Boolean bool) {
        this.followButton.setEnabled(true);
        ShowMessage.asSnack(this.itemView, AptoideUtils.StringU.getFormattedString(bool.booleanValue() ? C1146R.string.store_followed : C1146R.string.unfollowing_store_message, getContext().getResources(), recommendedStoreDisplayable.getPojo().getName()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setFollowButtonListener$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8852f(Throwable th) {
        CrashReport.getInstance().log(th);
        ShowMessage.asSnack(this.itemView, C1146R.string.error_occured);
    }

    private void setButtonText(final RecommendedStoreDisplayable recommendedStoreDisplayable) {
        this.followButton.setVisibility(8);
        this.compositeSubscription.m40667a(recommendedStoreDisplayable.isFollowing().m40095j0(C11250a.m40156b()).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.recommended.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11428f.m8848b(recommendedStoreDisplayable, (Boolean) obj);
            }
        }));
    }

    private void setFollowButtonListener(final RecommendedStoreDisplayable recommendedStoreDisplayable) {
        this.compositeSubscription.m40667a(C8975a.m28573a(this.followButton).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.recommended.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11423f.m8850d(recommendedStoreDisplayable, (Void) obj);
            }
        }).m40095j0(C11250a.m40156b()).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.recommended.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11432f.m8851e(recommendedStoreDisplayable, (Boolean) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.recommended.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11431f.m8852f((Throwable) obj);
            }
        }));
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.storeName = (TextView) view.findViewById(C1146R.id.recommended_store_name);
        this.followingUsers = (TextView) view.findViewById(C1146R.id.recommended_store_users);
        this.numberStoreApps = (TextView) view.findViewById(C1146R.id.recommended_store_apps);
        this.storeIcon = (ImageView) view.findViewById(C1146R.id.store_avatar_row);
        this.followButton = (AppCompatButton) view.findViewById(C1146R.id.recommended_store_action);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final RecommendedStoreDisplayable recommendedStoreDisplayable, int i2) {
        final Store pojo = recommendedStoreDisplayable.getPojo();
        this.storeName.setText(pojo.getName());
        this.followingUsers.setText(String.valueOf(pojo.getStats().getSubscribers()));
        this.numberStoreApps.setText(String.valueOf(pojo.getStats().getApps()));
        ImageLoader.with(getContext()).loadUsingCircleTransform(pojo.getAvatar(), this.storeIcon);
        setFollowButtonListener(recommendedStoreDisplayable);
        setButtonText(recommendedStoreDisplayable);
        this.compositeSubscription.m40667a(C8975a.m28573a(this.itemView).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.recommended.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11425f.m8847a(recommendedStoreDisplayable, pojo, (Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.recommended.d
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }));
    }
}
