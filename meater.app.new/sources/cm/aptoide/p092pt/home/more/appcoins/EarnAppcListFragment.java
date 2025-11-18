package cm.aptoide.p092pt.home.more.appcoins;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import cm.aptoide.aptoideviews.recyclerview.GridRecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.home.bundles.apps.RewardApp;
import cm.aptoide.p092pt.home.more.base.ListAppsFragment;
import cm.aptoide.p092pt.promotions.WalletApp;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.utils.GenericDialogs;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import p241e.p294g.p295a.p304c.C8975a;
import p456rx.C11234e;
import p456rx.InterfaceC11246k;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* compiled from: EarnAppcListFragment.kt */
@Metadata(m32266d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001CB\u0005¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u001a\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\b\u0010'\u001a\u00020$H\u0016J\u0012\u0010(\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u001b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00100\u001a\u00020$H\u0016J\u001a\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u001a\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0010\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u00109\u001a\u00020:H\u0016J\u0018\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>H\u0002J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0017H\u0016J\u0010\u0010B\u001a\u00020$2\u0006\u00109\u001a\u00020:H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006D"}, m32267d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListFragment;", "Lcm/aptoide/pt/home/more/base/ListAppsFragment;", "Lcm/aptoide/pt/home/bundles/apps/RewardApp;", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListViewHolder;", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListView;", "()V", "errorMessageSubscription", "Lrx/Subscription;", "oneDecimalFormatter", "Ljava/text/DecimalFormat;", "presenter", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListPresenter;", "getPresenter", "()Lcm/aptoide/pt/home/more/appcoins/EarnAppcListPresenter;", "setPresenter", "(Lcm/aptoide/pt/home/more/appcoins/EarnAppcListPresenter;)V", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "setThemeManager", "(Lcm/aptoide/pt/themes/ThemeManager;)V", "cancelDownload", "Lrx/Observable;", "Ljava/lang/Void;", "createViewHolder", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", HttpUrl.FRAGMENT_ENCODE_SET, "getAdapterStrategy", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$AdaptStrategy;", "getContainerPaddingDp", "Landroid/graphics/Rect;", "getItemSizeHeight", "getItemSizeWidth", "handleDownloadError", HttpUrl.FRAGMENT_ENCODE_SET, "downloadState", "Lcm/aptoide/pt/app/DownloadModel$DownloadState;", "hideWalletArea", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "onDestroy", "onViewCreated", "view", "onWalletInstallClick", "pauseDownload", "resumeDownload", "setDownloadState", "progress", "setupWallet", "walletApp", "Lcm/aptoide/pt/promotions/WalletApp;", "showDownloadError", "showErrorDialog", "title", HttpUrl.FRAGMENT_ENCODE_SET, "message", "showRootInstallWarningPopup", HttpUrl.FRAGMENT_ENCODE_SET, "updateState", "Companion", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class EarnAppcListFragment extends ListAppsFragment<RewardApp, EarnAppcListViewHolder> implements EarnAppcListView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private InterfaceC11246k errorMessageSubscription;

    @Inject
    public EarnAppcListPresenter presenter;

    @Inject
    public ThemeManager themeManager;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final DecimalFormat oneDecimalFormatter = new DecimalFormat("0.0");

    /* compiled from: EarnAppcListFragment.kt */
    @Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, m32267d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListFragment$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "newInstance", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListFragment;", "title", HttpUrl.FRAGMENT_ENCODE_SET, StoreTabGridRecyclerFragment.BundleCons.TAG, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C9789g c9789g) {
            this();
        }

        public final EarnAppcListFragment newInstance(String title, String tag) {
            C9801m.m32346f(title, "title");
            C9801m.m32346f(tag, StoreTabGridRecyclerFragment.BundleCons.TAG);
            EarnAppcListFragment earnAppcListFragment = new EarnAppcListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("title", title);
            bundle.putString(StoreTabGridRecyclerFragment.BundleCons.TAG, tag);
            earnAppcListFragment.setArguments(bundle);
            return earnAppcListFragment;
        }
    }

    /* compiled from: EarnAppcListFragment.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadModel.DownloadState.values().length];
            iArr[DownloadModel.DownloadState.ACTIVE.ordinal()] = 1;
            iArr[DownloadModel.DownloadState.INDETERMINATE.ordinal()] = 2;
            iArr[DownloadModel.DownloadState.PAUSE.ordinal()] = 3;
            iArr[DownloadModel.DownloadState.COMPLETE.ordinal()] = 4;
            iArr[DownloadModel.DownloadState.INSTALLING.ordinal()] = 5;
            iArr[DownloadModel.DownloadState.ERROR.ordinal()] = 6;
            iArr[DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: EarnAppcListFragment.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", HttpUrl.FRAGMENT_ENCODE_SET, "invoke"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListFragment$createViewHolder$1 */
    static final class C31801 extends Lambda implements Function2<ViewGroup, Integer, EarnAppcListViewHolder> {
        public static final C31801 INSTANCE = new C31801();

        C31801() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ EarnAppcListViewHolder invoke(ViewGroup viewGroup, Integer num) {
            return invoke(viewGroup, num.intValue());
        }

        public final EarnAppcListViewHolder invoke(ViewGroup viewGroup, int i2) {
            C9801m.m32346f(viewGroup, "parent");
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.earn_appcoins_item_more, viewGroup, false);
            C9801m.m32345e(viewInflate, "from(parent.context).inf…ent,\n              false)");
            return new EarnAppcListViewHolder(viewInflate, new DecimalFormat("0.00"));
        }
    }

    private final void handleDownloadError(DownloadModel.DownloadState downloadState) {
        if (downloadState == DownloadModel.DownloadState.ERROR) {
            String string = requireContext().getString(C1146R.string.error_occured);
            C9801m.m32345e(string, "requireContext().getString(R.string.error_occured)");
            showErrorDialog(HttpUrl.FRAGMENT_ENCODE_SET, string);
        }
    }

    private final void setDownloadState(int progress, DownloadModel.DownloadState downloadState) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        switch (downloadState != null ? WhenMappings.$EnumSwitchMapping$0[downloadState.ordinal()] : -1) {
            case 1:
                int i2 = C1146R.id.appview_download_progress_bar;
                ((ProgressBar) _$_findCachedViewById(i2)).setIndeterminate(false);
                ((ProgressBar) _$_findCachedViewById(i2)).setProgress(progress);
                TextView textView = (TextView) _$_findCachedViewById(C1146R.id.appview_download_progress_number);
                StringBuilder sb = new StringBuilder();
                sb.append(progress);
                sb.append('%');
                textView.setText(sb.toString());
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_pause_download)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_cancel_button)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_resume_download)).setVisibility(8);
                ((LinearLayout) _$_findCachedViewById(C1146R.id.install_controls_layout)).setLayoutParams(layoutParams);
                ((TextView) _$_findCachedViewById(C1146R.id.appview_download_download_state)).setText(getString(C1146R.string.appview_short_downloading));
                break;
            case 2:
                ((ProgressBar) _$_findCachedViewById(C1146R.id.appview_download_progress_bar)).setIndeterminate(true);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_pause_download)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_cancel_button)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_resume_download)).setVisibility(8);
                ((LinearLayout) _$_findCachedViewById(C1146R.id.install_controls_layout)).setLayoutParams(layoutParams);
                ((TextView) _$_findCachedViewById(C1146R.id.appview_download_download_state)).setText(getString(C1146R.string.appview_short_downloading));
                break;
            case 3:
                int i3 = C1146R.id.appview_download_progress_bar;
                ((ProgressBar) _$_findCachedViewById(i3)).setIndeterminate(false);
                ((ProgressBar) _$_findCachedViewById(i3)).setProgress(progress);
                TextView textView2 = (TextView) _$_findCachedViewById(C1146R.id.appview_download_progress_number);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(progress);
                sb2.append('%');
                textView2.setText(sb2.toString());
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_pause_download)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_cancel_button)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_resume_download)).setVisibility(0);
                ((LinearLayout) _$_findCachedViewById(C1146R.id.install_controls_layout)).setLayoutParams(layoutParams2);
                ((TextView) _$_findCachedViewById(C1146R.id.appview_download_download_state)).setText(getString(C1146R.string.appview_short_downloading));
                break;
            case 4:
                ((ProgressBar) _$_findCachedViewById(C1146R.id.appview_download_progress_bar)).setIndeterminate(true);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_pause_download)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_cancel_button)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_resume_download)).setVisibility(8);
                ((LinearLayout) _$_findCachedViewById(C1146R.id.install_controls_layout)).setLayoutParams(layoutParams);
                ((TextView) _$_findCachedViewById(C1146R.id.appview_download_download_state)).setText(getString(C1146R.string.appview_short_downloading));
                break;
            case 5:
                ((ProgressBar) _$_findCachedViewById(C1146R.id.appview_download_progress_bar)).setIndeterminate(true);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_pause_download)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_cancel_button)).setVisibility(8);
                ((ImageView) _$_findCachedViewById(C1146R.id.appview_download_resume_download)).setVisibility(8);
                ((LinearLayout) _$_findCachedViewById(C1146R.id.install_controls_layout)).setLayoutParams(layoutParams2);
                ((TextView) _$_findCachedViewById(C1146R.id.appview_download_download_state)).setText(getString(C1146R.string.appview_short_installing));
                break;
            case 6:
                String string = requireContext().getString(C1146R.string.error_occured);
                C9801m.m32345e(string, "requireContext().getString(R.string.error_occured)");
                showErrorDialog(HttpUrl.FRAGMENT_ENCODE_SET, string);
                break;
            case 7:
                String string2 = requireContext().getString(C1146R.string.out_of_space_dialog_title);
                C9801m.m32345e(string2, "requireContext().getStri…ut_of_space_dialog_title)");
                String string3 = requireContext().getString(C1146R.string.out_of_space_dialog_message);
                C9801m.m32345e(string3, "requireContext().getStri…_of_space_dialog_message)");
                showErrorDialog(string2, string3);
                break;
        }
    }

    private final void showErrorDialog(String title, String message) {
        this.errorMessageSubscription = GenericDialogs.createGenericOkMessage(getContext(), title, message, getThemeManager().getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40065I0(C11250a.m40156b()).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListFragment.m40856showErrorDialog$lambda3((GenericDialogs.EResponse) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.home.more.appcoins.b
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                EarnAppcListFragment.m40857showErrorDialog$lambda4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showErrorDialog$lambda-3, reason: not valid java name */
    public static final void m40856showErrorDialog$lambda3(GenericDialogs.EResponse eResponse) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showErrorDialog$lambda-4, reason: not valid java name */
    public static final void m40857showErrorDialog$lambda4(Throwable th) {
        new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showRootInstallWarningPopup$lambda-5, reason: not valid java name */
    public static final Boolean m40858showRootInstallWarningPopup$lambda5(GenericDialogs.EResponse eResponse) {
        return Boolean.valueOf(eResponse.equals(GenericDialogs.EResponse.YES));
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsFragment
    public View _$_findCachedViewById(int i2) {
        View viewFindViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (viewFindViewById = view2.findViewById(i2)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    @Override // cm.aptoide.p092pt.home.more.appcoins.EarnAppcListView
    public C11234e<Void> cancelDownload() {
        C11234e<Void> c11234eM28573a = C8975a.m28573a((ImageView) _$_findCachedViewById(C1146R.id.appview_download_cancel_button));
        C9801m.m32345e(c11234eM28573a, "clicks(appview_download_cancel_button)");
        return c11234eM28573a;
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsFragment
    public Function2<ViewGroup, Integer, EarnAppcListViewHolder> createViewHolder() {
        return C31801.INSTANCE;
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsFragment
    public GridRecyclerView.AdaptStrategy getAdapterStrategy() {
        return GridRecyclerView.AdaptStrategy.SCALE_KEEP_ASPECT_RATIO;
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsFragment
    protected Rect getContainerPaddingDp() {
        return new Rect(8, 8, 8, 118);
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsFragment
    public int getItemSizeHeight() {
        return 158;
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsFragment
    public int getItemSizeWidth() {
        return 168;
    }

    public final EarnAppcListPresenter getPresenter() {
        EarnAppcListPresenter earnAppcListPresenter = this.presenter;
        if (earnAppcListPresenter != null) {
            return earnAppcListPresenter;
        }
        C9801m.m32363w("presenter");
        return null;
    }

    public final ThemeManager getThemeManager() {
        ThemeManager themeManager = this.themeManager;
        if (themeManager != null) {
            return themeManager;
        }
        C9801m.m32363w("themeManager");
        return null;
    }

    @Override // cm.aptoide.p092pt.home.more.appcoins.EarnAppcListView
    public void hideWalletArea() throws Resources.NotFoundException {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), C1146R.anim.slide_down);
        animationLoadAnimation.setFillAfter(true);
        ((RelativeLayout) _$_findCachedViewById(C1146R.id.app_cardview_layout)).startAnimation(animationLoadAnimation);
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentComponent(savedInstanceState).inject(this);
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        C9801m.m32346f(inflater, "inflater");
        View viewOnCreateView = super.onCreateView(inflater, container, savedInstanceState);
        if (viewOnCreateView == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewOnCreateView;
        inflater.inflate(C1146R.layout.earn_appcoins_wallet_install_layout, viewGroup);
        return viewGroup;
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroy() {
        InterfaceC11246k interfaceC11246k = this.errorMessageSubscription;
        if (interfaceC11246k != null && !interfaceC11246k.isUnsubscribed()) {
            interfaceC11246k.unsubscribe();
        }
        super.onDestroy();
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        C9801m.m32346f(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getPresenter().present();
    }

    @Override // cm.aptoide.p092pt.home.more.appcoins.EarnAppcListView
    public C11234e<Void> onWalletInstallClick() {
        C11234e<Void> c11234eM28573a = C8975a.m28573a((Button) _$_findCachedViewById(C1146R.id.wallet_install_button));
        C9801m.m32345e(c11234eM28573a, "clicks(wallet_install_button)");
        return c11234eM28573a;
    }

    @Override // cm.aptoide.p092pt.home.more.appcoins.EarnAppcListView
    public C11234e<Void> pauseDownload() {
        C11234e<Void> c11234eM28573a = C8975a.m28573a((ImageView) _$_findCachedViewById(C1146R.id.appview_download_pause_download));
        C9801m.m32345e(c11234eM28573a, "clicks(appview_download_pause_download)");
        return c11234eM28573a;
    }

    @Override // cm.aptoide.p092pt.home.more.appcoins.EarnAppcListView
    public C11234e<Void> resumeDownload() {
        C11234e<Void> c11234eM28573a = C8975a.m28573a((ImageView) _$_findCachedViewById(C1146R.id.appview_download_resume_download));
        C9801m.m32345e(c11234eM28573a, "clicks(appview_download_resume_download)");
        return c11234eM28573a;
    }

    public final void setPresenter(EarnAppcListPresenter earnAppcListPresenter) {
        C9801m.m32346f(earnAppcListPresenter, "<set-?>");
        this.presenter = earnAppcListPresenter;
    }

    public final void setThemeManager(ThemeManager themeManager) {
        C9801m.m32346f(themeManager, "<set-?>");
        this.themeManager = themeManager;
    }

    @Override // cm.aptoide.p092pt.home.more.appcoins.EarnAppcListView
    public void setupWallet(WalletApp walletApp) {
        C9801m.m32346f(walletApp, "walletApp");
        if (walletApp.isInstalled()) {
            return;
        }
        int i2 = C1146R.id.app_cardview_layout;
        ((RelativeLayout) _$_findCachedViewById(i2)).startAnimation(AnimationUtils.loadAnimation(getContext(), C1146R.anim.slide_up));
        ((RelativeLayout) _$_findCachedViewById(i2)).setVisibility(0);
        ((TextView) _$_findCachedViewById(C1146R.id.wallet_app_title_textview)).setText(walletApp.getAppName());
        ((TextView) _$_findCachedViewById(C1146R.id.rating_label)).setText(this.oneDecimalFormatter.format(Float.valueOf(walletApp.getRating())));
    }

    @Override // cm.aptoide.p092pt.home.more.appcoins.EarnAppcListView
    public void showDownloadError(WalletApp walletApp) {
        C9801m.m32346f(walletApp, "walletApp");
        DownloadModel downloadModel = walletApp.getDownloadModel();
        if (downloadModel == null || !downloadModel.hasError()) {
            return;
        }
        handleDownloadError(downloadModel.getDownloadState());
    }

    @Override // cm.aptoide.p092pt.home.more.appcoins.EarnAppcListView
    public C11234e<Boolean> showRootInstallWarningPopup() {
        C11234e c11234eM40082X = GenericDialogs.createGenericYesNoCancelMessage(requireContext(), null, getResources().getString(C1146R.string.root_access_dialog), getThemeManager().getAttributeForTheme(C1146R.attr.dialogsTheme).resourceId).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.home.more.appcoins.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return EarnAppcListFragment.m40858showRootInstallWarningPopup$lambda5((GenericDialogs.EResponse) obj);
            }
        });
        C9801m.m32345e(c11234eM40082X, "createGenericYesNoCancel…cDialogs.EResponse.YES) }");
        return c11234eM40082X;
    }

    @Override // cm.aptoide.p092pt.home.more.appcoins.EarnAppcListView
    public void updateState(WalletApp walletApp) {
        C9801m.m32346f(walletApp, "walletApp");
        DownloadModel downloadModel = walletApp.getDownloadModel();
        if (downloadModel != null) {
            if (downloadModel.isDownloadingOrInstalling()) {
                ((LinearLayout) _$_findCachedViewById(C1146R.id.appview_transfer_info)).setVisibility(0);
                ((Group) _$_findCachedViewById(C1146R.id.install_group)).setVisibility(8);
                setDownloadState(downloadModel.getProgress(), downloadModel.getDownloadState());
            } else {
                if (walletApp.isInstalled()) {
                    return;
                }
                ((LinearLayout) _$_findCachedViewById(C1146R.id.appview_transfer_info)).setVisibility(8);
                ((Group) _$_findCachedViewById(C1146R.id.install_group)).setVisibility(0);
            }
        }
    }
}
