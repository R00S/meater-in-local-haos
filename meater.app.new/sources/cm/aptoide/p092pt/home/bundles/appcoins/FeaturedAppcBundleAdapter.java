package cm.aptoide.p092pt.home.bundles.appcoins;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.home.bundles.apps.AppInBundleViewHolder;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.view.app.AppViewHolder;
import cm.aptoide.p092pt.view.app.Application;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.p473s.C11418b;

/* compiled from: FeaturedAppcBundleAdapter.kt */
@Metadata(m32266d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0014\u0010!\u001a\u00020\u001a2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0016\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m32267d2 = {"Lcm/aptoide/pt/home/bundles/appcoins/FeaturedAppcBundleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", DeepLinkIntentReceiver.DeepLinksTargets.APPS, HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/view/app/Application;", "oneDecimalFormatter", "Ljava/text/DecimalFormat;", "appClickedEvents", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Ljava/util/List;Ljava/text/DecimalFormat;Lrx/subjects/PublishSubject;)V", "getAppClickedEvents", "()Lrx/subjects/PublishSubject;", "getApps", "()Ljava/util/List;", "setApps", "(Ljava/util/List;)V", "bundlePosition", HttpUrl.FRAGMENT_ENCODE_SET, "homeBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "getOneDecimalFormatter", "()Ljava/text/DecimalFormat;", "getItemCount", "onBindViewHolder", HttpUrl.FRAGMENT_ENCODE_SET, "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "updateBundle", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class FeaturedAppcBundleAdapter extends RecyclerView.AbstractC0594g<RecyclerView.AbstractC0590c0> {
    private final C11418b<HomeEvent> appClickedEvents;
    private List<? extends Application> apps;
    private int bundlePosition;
    private HomeBundle homeBundle;
    private final DecimalFormat oneDecimalFormatter;

    public FeaturedAppcBundleAdapter(List<? extends Application> list, DecimalFormat decimalFormat, C11418b<HomeEvent> c11418b) {
        C9801m.m32346f(list, DeepLinkIntentReceiver.DeepLinksTargets.APPS);
        C9801m.m32346f(decimalFormat, "oneDecimalFormatter");
        C9801m.m32346f(c11418b, "appClickedEvents");
        this.apps = list;
        this.oneDecimalFormatter = decimalFormat;
        this.appClickedEvents = c11418b;
        this.bundlePosition = -1;
    }

    public final C11418b<HomeEvent> getAppClickedEvents() {
        return this.appClickedEvents;
    }

    public final List<Application> getApps() {
        return this.apps;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.apps.size();
    }

    public final DecimalFormat getOneDecimalFormatter() {
        return this.oneDecimalFormatter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(RecyclerView.AbstractC0590c0 abstractC0590c0, int i2) {
        C9801m.m32346f(abstractC0590c0, "holder");
        ((AppViewHolder) abstractC0590c0).setApp(this.apps.get(i2), this.homeBundle, this.bundlePosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public RecyclerView.AbstractC0590c0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        C9801m.m32346f(viewGroup, "parent");
        return new AppInBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.bonus_appc_home_item, viewGroup, false), this.appClickedEvents, this.oneDecimalFormatter);
    }

    public final void setApps(List<? extends Application> list) {
        C9801m.m32346f(list, "<set-?>");
        this.apps = list;
    }

    public final void update(List<? extends Application> apps) {
        C9801m.m32346f(apps, DeepLinkIntentReceiver.DeepLinksTargets.APPS);
        this.apps = apps;
        notifyDataSetChanged();
    }

    public final void updateBundle(HomeBundle homeBundle, int position) {
        C9801m.m32346f(homeBundle, "homeBundle");
        this.homeBundle = homeBundle;
        this.bundlePosition = position;
    }
}
