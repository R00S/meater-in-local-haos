package cm.aptoide.p092pt.home.more.apps;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.ads.data.AptoideNativeAd;
import cm.aptoide.p092pt.home.more.base.ListAppsViewHolder;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.view.app.Application;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: ListAppsMoreViewHolder.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m32267d2 = {"Lcm/aptoide/pt/home/more/apps/ListAppsMoreViewHolder;", "Lcm/aptoide/pt/home/more/base/ListAppsViewHolder;", "Lcm/aptoide/pt/view/app/Application;", "view", "Landroid/view/View;", "decimalFormatter", "Ljava/text/DecimalFormat;", "(Landroid/view/View;Ljava/text/DecimalFormat;)V", "bindApp", HttpUrl.FRAGMENT_ENCODE_SET, "app", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class ListAppsMoreViewHolder extends ListAppsViewHolder<Application> {
    private final DecimalFormat decimalFormatter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListAppsMoreViewHolder(View view, DecimalFormat decimalFormat) {
        super(view);
        C9801m.m32346f(view, "view");
        C9801m.m32346f(decimalFormat, "decimalFormatter");
        this.decimalFormatter = decimalFormat;
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsViewHolder
    public void bindApp(Application app) {
        C9801m.m32346f(app, "app");
        ((TextView) this.itemView.findViewById(C1146R.id.name)).setText(app.getName());
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(app.getIcon(), 8, (ImageView) this.itemView.findViewById(C1146R.id.icon), C1146R.attr.placeholder_square);
        if (app.hasAppcBilling()) {
            ((LinearLayout) this.itemView.findViewById(C1146R.id.appc_info_layout)).setVisibility(0);
            ((TextView) this.itemView.findViewById(C1146R.id.appc_text)).setText(C1146R.string.appc_card_short);
            ((LinearLayout) this.itemView.findViewById(C1146R.id.rating_info_layout)).setVisibility(8);
            ((TextView) this.itemView.findViewById(C1146R.id.ad_label)).setVisibility(8);
            return;
        }
        if (app instanceof AptoideNativeAd) {
            ((TextView) this.itemView.findViewById(C1146R.id.ad_label)).setVisibility(0);
            ((LinearLayout) this.itemView.findViewById(C1146R.id.rating_info_layout)).setVisibility(0);
            ((LinearLayout) this.itemView.findViewById(C1146R.id.appc_info_layout)).setVisibility(8);
            ((TextView) this.itemView.findViewById(C1146R.id.rating_label)).setText(this.decimalFormatter.format(((AptoideNativeAd) app).getStars()));
            return;
        }
        if (app.getRating() == 0.0f) {
            ((TextView) this.itemView.findViewById(C1146R.id.rating_label)).setText(C1146R.string.appcardview_title_no_stars);
        } else {
            ((TextView) this.itemView.findViewById(C1146R.id.rating_label)).setText(this.decimalFormatter.format(Float.valueOf(app.getRating())));
        }
        ((LinearLayout) this.itemView.findViewById(C1146R.id.rating_info_layout)).setVisibility(0);
        ((LinearLayout) this.itemView.findViewById(C1146R.id.appc_info_layout)).setVisibility(8);
        ((TextView) this.itemView.findViewById(C1146R.id.ad_label)).setVisibility(8);
    }
}
