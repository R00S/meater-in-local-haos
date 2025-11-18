package cm.aptoide.p092pt.store.view.p104my;

import android.text.ParcelableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0468d;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowersFragment;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowingFragment;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.recycler.widget.Widget;
import cm.aptoide.p092pt.view.spannable.SpannableFactory;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public class StoreWidget extends Widget<StoreDisplayable> {
    private Button exploreButton;
    private TextView firstStat;
    private TextView secondStat;
    private StoreAnalytics storeAnalytics;
    private ImageView storeIcon;
    private TextView storeName;
    private TextView suggestionMessage;

    public StoreWidget(View view) {
        super(view);
        this.storeAnalytics = new StoreAnalytics(((AptoideApplication) getContext().getApplicationContext()).getAnalyticsManager(), ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8844a(Store store, String str, Void r5) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newStoreFragment(store.getName(), str), true);
        this.storeAnalytics.sendStoreTabInteractEvent("View Store", false);
        this.storeAnalytics.sendStoreOpenEvent("View Own Store", store.getName(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8845b(String str, StoreDisplayable storeDisplayable, Void r8) {
        this.storeAnalytics.sendFollowingStoresInteractEvent();
        getFragmentNavigator().navigateTo(TimeLineFollowingFragment.newInstanceUsingUser(str, AptoideUtils.StringU.getFormattedString(C1146R.string.social_timeline_following_fragment_title, getContext().getResources(), Long.valueOf(storeDisplayable.getFirstStatsNumber())), storeDisplayable.getStoreContext()), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$bindView$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8846c(String str, StoreDisplayable storeDisplayable, Void r8) {
        this.storeAnalytics.sendFollowersStoresInteractEvent();
        getFragmentNavigator().navigateTo(TimeLineFollowersFragment.newInstanceUsingUser(str, AptoideUtils.StringU.getFormattedString(C1146R.string.social_timeline_followers_fragment_title, getContext().getResources(), Long.valueOf(storeDisplayable.getSecondStatsNumber())), storeDisplayable.getStoreContext()), true);
    }

    private void showStats(StoreDisplayable storeDisplayable) {
        SpannableFactory spannableFactory = new SpannableFactory();
        ParcelableSpan[] parcelableSpanArr = {new StyleSpan(1), new ForegroundColorSpan(storeDisplayable.getTextColor())};
        this.firstStat.setText(spannableFactory.createMultiSpan(String.format(getContext().getString(storeDisplayable.getFirstStatsLabel()), String.valueOf(storeDisplayable.getFirstStatsNumber())), parcelableSpanArr, String.valueOf(storeDisplayable.getFirstStatsNumber())));
        this.secondStat.setText(spannableFactory.createMultiSpan(String.format(getContext().getString(storeDisplayable.getSecondStatsLabel()), String.valueOf(storeDisplayable.getSecondStatsNumber())), parcelableSpanArr, String.valueOf(storeDisplayable.getSecondStatsNumber())));
    }

    private void showStoreDescription(StoreDisplayable storeDisplayable, ActivityC0468d activityC0468d) {
        String suggestionMessage = storeDisplayable.getSuggestionMessage(activityC0468d);
        if (suggestionMessage.isEmpty()) {
            this.suggestionMessage.setVisibility(8);
        } else {
            this.suggestionMessage.setText(suggestionMessage);
            this.suggestionMessage.setVisibility(0);
        }
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.storeIcon = (ImageView) view.findViewById(C1146R.id.store_icon);
        this.storeName = (TextView) view.findViewById(C1146R.id.store_name);
        this.suggestionMessage = (TextView) view.findViewById(C1146R.id.create_store_text);
        this.firstStat = (TextView) view.findViewById(C1146R.id.first_stat);
        this.secondStat = (TextView) view.findViewById(C1146R.id.second_stat);
        this.exploreButton = (Button) view.findViewById(C1146R.id.explore_button);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(final StoreDisplayable storeDisplayable, int i2) {
        ActivityC0468d context = getContext();
        final Store store = storeDisplayable.getStore();
        showStoreDescription(storeDisplayable, context);
        this.exploreButton.setText(storeDisplayable.getExploreButtonText());
        final String theme = store.getAppearance().getTheme();
        ImageLoader.with(context).loadWithShadowCircleTransform(store.getAvatar(), this.storeIcon);
        this.storeName.setText(store.getName());
        this.compositeSubscription.m40667a(C8975a.m28573a(this.exploreButton).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.d0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f11368f.m8844a(store, theme, (Void) obj);
            }
        }));
        showStats(storeDisplayable);
        if (storeDisplayable.isStatsClickable()) {
            this.compositeSubscription.m40667a(C8975a.m28573a(this.firstStat).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.c0
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f11364f.m8845b(theme, storeDisplayable, (Void) obj);
                }
            }));
            this.compositeSubscription.m40667a(C8975a.m28573a(this.secondStat).m40061G0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.view.my.e0
                @Override // p456rx.p460m.InterfaceC11253b
                public final void call(Object obj) {
                    this.f11372f.m8846c(theme, storeDisplayable, (Void) obj);
                }
            }));
        }
    }
}
