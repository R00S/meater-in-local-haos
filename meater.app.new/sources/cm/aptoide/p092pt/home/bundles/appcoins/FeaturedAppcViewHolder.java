package cm.aptoide.p092pt.home.bundles.appcoins;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.aptoideviews.common.StringUtilsKt;
import cm.aptoide.aptoideviews.skeleton.Skeleton;
import cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import cm.aptoide.aptoideviews.skeleton.SkeletonView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder;
import cm.aptoide.p092pt.home.bundles.base.FeaturedAppcBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.app.Application;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.p473s.C11418b;

/* compiled from: FeaturedAppcViewHolder.kt */
@Metadata(m32266d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m32267d2 = {"Lcm/aptoide/pt/home/bundles/appcoins/FeaturedAppcViewHolder;", "Lcm/aptoide/pt/home/bundles/base/AppBundleViewHolder;", "view", "Landroid/view/View;", "oneDecimalFormatter", "Ljava/text/DecimalFormat;", "uiEventsListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Landroid/view/View;Ljava/text/DecimalFormat;Lrx/subjects/PublishSubject;)V", "appsInBundleAdapter", "Lcm/aptoide/pt/home/bundles/appcoins/FeaturedAppcBundleAdapter;", "getOneDecimalFormatter", "()Ljava/text/DecimalFormat;", "skeleton", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "getUiEventsListener", "()Lrx/subjects/PublishSubject;", "getView", "()Landroid/view/View;", "setBundle", HttpUrl.FRAGMENT_ENCODE_SET, "homeBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "position", HttpUrl.FRAGMENT_ENCODE_SET, "toggleSkeleton", "showSkeleton", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class FeaturedAppcViewHolder extends AppBundleViewHolder {
    private final FeaturedAppcBundleAdapter appsInBundleAdapter;
    private final DecimalFormat oneDecimalFormatter;
    private Skeleton skeleton;
    private final C11418b<HomeEvent> uiEventsListener;
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedAppcViewHolder(View view, DecimalFormat decimalFormat, C11418b<HomeEvent> c11418b) {
        super(view);
        C9801m.m32346f(view, "view");
        C9801m.m32346f(decimalFormat, "oneDecimalFormatter");
        C9801m.m32346f(c11418b, "uiEventsListener");
        this.view = view;
        this.oneDecimalFormatter = decimalFormat;
        this.uiEventsListener = c11418b;
        FeaturedAppcBundleAdapter featuredAppcBundleAdapter = new FeaturedAppcBundleAdapter(new ArrayList(), decimalFormat, c11418b);
        this.appsInBundleAdapter = featuredAppcBundleAdapter;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        View view2 = this.itemView;
        int i2 = C1146R.id.apps_list;
        ((RecyclerView) view2.findViewById(i2)).addItemDecoration(new RecyclerView.AbstractC0601n() { // from class: cm.aptoide.pt.home.bundles.appcoins.FeaturedAppcViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
            public void getItemOffsets(Rect rect, View view3, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
                C9801m.m32346f(rect, "outRect");
                C9801m.m32346f(view3, "view");
                C9801m.m32346f(recyclerView, "parent");
                C9801m.m32346f(c0613z, "state");
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(5, view3.getResources());
                rect.set(pixelsForDip, pixelsForDip, 0, pixelsForDip);
            }
        });
        ((RecyclerView) this.itemView.findViewById(i2)).setLayoutManager(linearLayoutManager);
        ((RecyclerView) this.itemView.findViewById(i2)).setAdapter(featuredAppcBundleAdapter);
        ((RecyclerView) this.itemView.findViewById(i2)).setNestedScrollingEnabled(false);
        Resources resources = view.getContext().getResources();
        Object systemService = view.getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(i2);
        C9801m.m32345e(recyclerView, "itemView.apps_list");
        this.skeleton = SkeletonUtils.applySkeleton(recyclerView, C1146R.layout.app_home_item_skeleton, Type.APPS_GROUP.getPerLineCount(resources, (WindowManager) systemService) * 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBundle$lambda-2$lambda-0, reason: not valid java name */
    public static final void m40846setBundle$lambda2$lambda0(FeaturedAppcViewHolder featuredAppcViewHolder, HomeBundle homeBundle, View view) {
        C9801m.m32346f(featuredAppcViewHolder, "this$0");
        featuredAppcViewHolder.uiEventsListener.onNext(new HomeEvent(homeBundle, featuredAppcViewHolder.getAdapterPosition(), HomeEvent.Type.MORE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBundle$lambda-2$lambda-1, reason: not valid java name */
    public static final void m40847setBundle$lambda2$lambda1(FeaturedAppcViewHolder featuredAppcViewHolder, HomeBundle homeBundle, View view) {
        C9801m.m32346f(featuredAppcViewHolder, "this$0");
        featuredAppcViewHolder.uiEventsListener.onNext(new HomeEvent(homeBundle, featuredAppcViewHolder.getAdapterPosition(), HomeEvent.Type.APPC_KNOW_MORE));
    }

    private final void toggleSkeleton(boolean showSkeleton) {
        if (showSkeleton) {
            Skeleton skeleton = this.skeleton;
            if (skeleton != null) {
                skeleton.showSkeleton();
            }
            ((SkeletonView) this.itemView.findViewById(C1146R.id.title_skeletonview)).setVisibility(0);
            ((TextView) this.itemView.findViewById(C1146R.id.title)).setVisibility(4);
            ((SkeletonView) this.itemView.findViewById(C1146R.id.description_skeletonview)).setVisibility(0);
            ((TextView) this.itemView.findViewById(C1146R.id.description)).setVisibility(4);
            ((ImageView) this.itemView.findViewById(C1146R.id.bonus_appc_view)).setVisibility(4);
            ((SkeletonView) this.itemView.findViewById(C1146R.id.bonus_appc_skeleton_view)).setVisibility(0);
            return;
        }
        Skeleton skeleton2 = this.skeleton;
        if (skeleton2 != null) {
            skeleton2.showOriginal();
        }
        ((SkeletonView) this.itemView.findViewById(C1146R.id.title_skeletonview)).setVisibility(4);
        ((TextView) this.itemView.findViewById(C1146R.id.title)).setVisibility(0);
        ((SkeletonView) this.itemView.findViewById(C1146R.id.description_skeletonview)).setVisibility(4);
        ((TextView) this.itemView.findViewById(C1146R.id.description)).setVisibility(0);
        ((ImageView) this.itemView.findViewById(C1146R.id.bonus_appc_view)).setVisibility(0);
        ((SkeletonView) this.itemView.findViewById(C1146R.id.bonus_appc_skeleton_view)).setVisibility(4);
    }

    public final DecimalFormat getOneDecimalFormatter() {
        return this.oneDecimalFormatter;
    }

    public final C11418b<HomeEvent> getUiEventsListener() {
        return this.uiEventsListener;
    }

    public final View getView() {
        return this.view;
    }

    @Override // cm.aptoide.p092pt.home.bundles.base.AppBundleViewHolder
    public void setBundle(final HomeBundle homeBundle, int position) throws Resources.NotFoundException {
        boolean z = homeBundle instanceof FeaturedAppcBundle;
        if (!z) {
            throw new IllegalStateException(FeaturedAppcViewHolder.class.getName() + " is getting non FeaturedAppcBundle instance!");
        }
        FeaturedAppcBundle featuredAppcBundle = z ? (FeaturedAppcBundle) homeBundle : null;
        if (featuredAppcBundle != null) {
            FeaturedAppcBundle featuredAppcBundle2 = (FeaturedAppcBundle) homeBundle;
            if (featuredAppcBundle2.getContent() == null || featuredAppcBundle2.getBonusPercentage() == -1) {
                toggleSkeleton(true);
                return;
            }
            toggleSkeleton(false);
            ((TextView) this.itemView.findViewById(C1146R.id.title)).setText(this.itemView.getContext().getString(C1146R.string.incentives_banner_title, String.valueOf(featuredAppcBundle.getBonusPercentage())));
            TextView textView = (TextView) this.itemView.findViewById(C1146R.id.description);
            String string = this.itemView.getResources().getString(C1146R.string.incentives_banner_body);
            C9801m.m32345e(string, "itemView.resources.getSt…g.incentives_banner_body)");
            Resources resources = this.itemView.getResources();
            C9801m.m32345e(resources, "itemView.resources");
            textView.setText(StringUtilsKt.formatWithHtmlImage(string, C1146R.drawable.ic_aptoide_balance, 24, 20, resources));
            this.appsInBundleAdapter.updateBundle(homeBundle, position);
            FeaturedAppcBundleAdapter featuredAppcBundleAdapter = this.appsInBundleAdapter;
            List<Application> apps = featuredAppcBundle2.getApps();
            C9801m.m32345e(apps, "homeBundle.apps");
            featuredAppcBundleAdapter.update(apps);
            ((RecyclerView) this.itemView.findViewById(C1146R.id.apps_list)).addOnScrollListener(new RecyclerView.AbstractC0607t() { // from class: cm.aptoide.pt.home.bundles.appcoins.FeaturedAppcViewHolder$setBundle$1$1
                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
                public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                    C9801m.m32346f(recyclerView, "recyclerView");
                    super.onScrolled(recyclerView, dx, dy);
                    if (dx > 0) {
                        this.this$0.getUiEventsListener().onNext(new HomeEvent(homeBundle, this.this$0.getAdapterPosition(), HomeEvent.Type.SCROLL_RIGHT));
                    }
                }
            });
            ((Button) this.itemView.findViewById(C1146R.id.see_more_btn)).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.appcoins.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeaturedAppcViewHolder.m40846setBundle$lambda2$lambda0(this.f9534f, homeBundle, view);
                }
            });
            ((CardView) this.itemView.findViewById(C1146R.id.featured_appc_card)).setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.appcoins.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FeaturedAppcViewHolder.m40847setBundle$lambda2$lambda1(this.f9532f, homeBundle, view);
                }
            });
        }
    }
}
