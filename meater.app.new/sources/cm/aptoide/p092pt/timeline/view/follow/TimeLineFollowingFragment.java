package cm.aptoide.p092pt.timeline.view.follow;

import android.os.Bundle;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetFollowers;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.GetFollowingRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.timeline.view.displayable.FollowUserDisplayable;
import cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment;
import cm.aptoide.p092pt.view.fragment.GridRecyclerSwipeWithToolbarFragment;
import cm.aptoide.p092pt.view.recycler.EndlessRecyclerOnScrollListener;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.MessageWhiteBgDisplayable;
import java.util.List;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class TimeLineFollowingFragment extends TimeLineFollowFragment {
    private BodyInterceptor<BaseBody> baseBodyInterceptor;
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    private Long storeId;

    @Inject
    ThemeManager themeManager;
    private TokenInvalidator tokenInvalidator;
    private Long userId;

    private static Bundle buildBundle(String str, String str2, StoreContext storeContext) {
        Bundle bundleBuildBundle = TimeLineFollowFragment.buildBundle(storeContext);
        bundleBuildBundle.putString(GridRecyclerSwipeWithToolbarFragment.TITLE_KEY, str2);
        bundleBuildBundle.putString("storeTheme", str);
        return bundleBuildBundle;
    }

    private String getUserStoreTheme(GetFollowers.TimelineUser timelineUser) {
        return timelineUser.getStore() != null ? timelineUser.getStore().getAppearance().getTheme() : this.themeManager.getBaseTheme().getThemeName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getFirstResponseAction$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ boolean m8867g(List list, GetFollowers getFollowers) {
        list.add(0, new MessageWhiteBgDisplayable(getHeaderMessage()));
        return false;
    }

    public static TimeLineFollowFragment newInstanceUsingStoreId(Long l, String str, String str2, StoreContext storeContext) {
        Bundle bundleBuildBundle = buildBundle(str, str2, storeContext);
        if (l != null) {
            bundleBuildBundle.putLong(TimeLineFollowFragment.BundleKeys.STORE_ID, l.longValue());
        }
        TimeLineFollowingFragment timeLineFollowingFragment = new TimeLineFollowingFragment();
        timeLineFollowingFragment.setArguments(bundleBuildBundle);
        return timeLineFollowingFragment;
    }

    public static TimeLineFollowFragment newInstanceUsingUser(String str, String str2, StoreContext storeContext) {
        Bundle bundleBuildBundle = buildBundle(str, str2, storeContext);
        TimeLineFollowingFragment timeLineFollowingFragment = new TimeLineFollowingFragment();
        timeLineFollowingFragment.setArguments(bundleBuildBundle);
        return timeLineFollowingFragment;
    }

    public static TimeLineFollowFragment newInstanceUsingUserId(Long l, String str, String str2, StoreContext storeContext) {
        Bundle bundleBuildBundle = buildBundle(str, str2, storeContext);
        if (l != null) {
            bundleBuildBundle.putLong(TimeLineFollowFragment.BundleKeys.USER_ID, l.longValue());
        }
        TimeLineFollowingFragment timeLineFollowingFragment = new TimeLineFollowingFragment();
        timeLineFollowingFragment.setArguments(bundleBuildBundle);
        return timeLineFollowingFragment;
    }

    @Override // cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment
    protected AbstractC2229V7 buildRequest() {
        return GetFollowingRequest.m7445of(this.baseBodyInterceptor, this.userId, this.storeId, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
    }

    @Override // cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment
    protected Displayable createUserDisplayable(GetFollowers.TimelineUser timelineUser) {
        return new FollowUserDisplayable(timelineUser, getUserStoreTheme(timelineUser));
    }

    @Override // cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment
    protected EndlessRecyclerOnScrollListener.BooleanAction<GetFollowers> getFirstResponseAction(final List<Displayable> list) {
        return new EndlessRecyclerOnScrollListener.BooleanAction() { // from class: cm.aptoide.pt.timeline.view.follow.g
            @Override // cm.aptoide.pt.view.recycler.EndlessRecyclerOnScrollListener.BooleanAction
            public final boolean call(BaseV7Response baseV7Response) {
                return this.f11526a.m8867g(list, (GetFollowers) baseV7Response);
            }
        };
    }

    @Override // cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment
    public String getFooterMessage(int i2) {
        return getString(C1146R.string.private_following_message, Integer.valueOf(i2));
    }

    @Override // cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment
    public String getHeaderMessage() {
        return getString(C1146R.string.social_timeline_share_bar_following);
    }

    @Override // cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment, cm.aptoide.p092pt.view.fragment.GridRecyclerSwipeWithToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        if (bundle.containsKey(TimeLineFollowFragment.BundleKeys.USER_ID)) {
            this.userId = Long.valueOf(bundle.getLong(TimeLineFollowFragment.BundleKeys.USER_ID));
        }
        if (bundle.containsKey(TimeLineFollowFragment.BundleKeys.STORE_ID)) {
            this.storeId = Long.valueOf(bundle.getLong(TimeLineFollowFragment.BundleKeys.STORE_ID));
        }
    }

    @Override // cm.aptoide.p092pt.timeline.view.follow.TimeLineFollowFragment, cm.aptoide.p092pt.view.fragment.GridRecyclerSwipeWithToolbarFragment, cm.aptoide.p092pt.view.fragment.AptoideBaseFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.baseBodyInterceptor = aptoideApplication.getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.tokenInvalidator = aptoideApplication.getTokenInvalidator();
    }
}
