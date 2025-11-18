package cm.aptoide.p092pt.home.bundles.appcoins;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.bundles.apps.RewardApp;
import cm.aptoide.p092pt.home.bundles.base.AppHomeEvent;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p141p.InterfaceC5564g;
import com.bumptech.glide.p141p.p142l.InterfaceC5577i;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;
import p456rx.p473s.C11418b;

/* compiled from: EarnAppCoinsItemViewHolder.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m32267d2 = {"Lcm/aptoide/pt/home/bundles/appcoins/EarnAppCoinsItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "appClicks", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "decimalFormatter", "Ljava/text/DecimalFormat;", "(Landroid/view/View;Lrx/subjects/PublishSubject;Ljava/text/DecimalFormat;)V", "getAppClicks", "()Lrx/subjects/PublishSubject;", "getDecimalFormatter", "()Ljava/text/DecimalFormat;", "getView", "()Landroid/view/View;", "setApp", HttpUrl.FRAGMENT_ENCODE_SET, "app", "Lcm/aptoide/pt/home/bundles/apps/RewardApp;", "homeBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "bundlePosition", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class EarnAppCoinsItemViewHolder extends RecyclerView.AbstractC0590c0 {
    private final C11418b<HomeEvent> appClicks;
    private final DecimalFormat decimalFormatter;
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarnAppCoinsItemViewHolder(View view, C11418b<HomeEvent> c11418b, DecimalFormat decimalFormat) {
        super(view);
        C9801m.m32346f(view, "view");
        C9801m.m32346f(c11418b, "appClicks");
        C9801m.m32346f(decimalFormat, "decimalFormatter");
        this.view = view;
        this.appClicks = c11418b;
        this.decimalFormatter = decimalFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setApp$lambda-0, reason: not valid java name */
    public static final void m40843setApp$lambda0(EarnAppCoinsItemViewHolder earnAppCoinsItemViewHolder, RewardApp rewardApp, HomeBundle homeBundle, int i2, View view) {
        C9801m.m32346f(earnAppCoinsItemViewHolder, "this$0");
        C9801m.m32346f(rewardApp, "$app");
        earnAppCoinsItemViewHolder.appClicks.onNext(new AppHomeEvent(rewardApp, earnAppCoinsItemViewHolder.getAdapterPosition(), homeBundle, i2, HomeEvent.Type.APP));
    }

    public final C11418b<HomeEvent> getAppClicks() {
        return this.appClicks;
    }

    public final DecimalFormat getDecimalFormatter() {
        return this.decimalFormatter;
    }

    public final View getView() {
        return this.view;
    }

    public final void setApp(final RewardApp app, final HomeBundle homeBundle, final int bundlePosition) {
        C9801m.m32346f(app, "app");
        RewardApp.Reward reward = app.getReward();
        RewardApp.Fiat fiat = reward != null ? reward.getFiat() : null;
        TextView textView = (TextView) this.itemView.findViewById(C1146R.id.reward_textview);
        Context context = this.view.getContext();
        Object[] objArr = new Object[1];
        StringBuilder sb = new StringBuilder();
        sb.append(fiat != null ? fiat.getSymbol() : null);
        sb.append(this.decimalFormatter.format(fiat != null ? Double.valueOf(fiat.getAmount()) : null));
        objArr[0] = sb.toString();
        textView.setText(context.getString(C1146R.string.poa_app_card_short, objArr));
        ((TextView) this.itemView.findViewById(C1146R.id.app_title_textview)).setText(app.getName());
        ImageLoader.with(this.itemView.getContext()).loadWithColorAttrPlaceholder(app.getFeatureGraphic(), C1146R.attr.skeletonColor, (ImageView) this.itemView.findViewById(C1146R.id.app_feature_graphic));
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(app.getIcon(), 8, (ImageView) this.itemView.findViewById(C1146R.id.app_image), C1146R.attr.skeletonColor, new InterfaceC5564g<Drawable>() { // from class: cm.aptoide.pt.home.bundles.appcoins.EarnAppCoinsItemViewHolder.setApp.1
            @Override // com.bumptech.glide.p141p.InterfaceC5564g
            public boolean onLoadFailed(GlideException glideException, Object obj, InterfaceC5577i<Drawable> interfaceC5577i, boolean z) {
                return false;
            }

            @Override // com.bumptech.glide.p141p.InterfaceC5564g
            public boolean onResourceReady(Drawable drawable, Object obj, InterfaceC5577i<Drawable> interfaceC5577i, EnumC5365a enumC5365a, boolean z) {
                View view = EarnAppCoinsItemViewHolder.this.itemView;
                int i2 = C1146R.id.app_feature_graphic;
                ((ImageView) view.findViewById(i2)).setColorFilter(1073741824);
                ImageLoader imageLoaderWith = ImageLoader.with(EarnAppCoinsItemViewHolder.this.itemView.getContext());
                String featureGraphic = app.getFeatureGraphic();
                if (drawable == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                }
                imageLoaderWith.loadWithPalettePlaceholder(featureGraphic, (BitmapDrawable) drawable, -1, (ImageView) EarnAppCoinsItemViewHolder.this.itemView.findViewById(i2));
                return false;
            }
        });
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.appcoins.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EarnAppCoinsItemViewHolder.m40843setApp$lambda0(this.f9524f, app, homeBundle, bundlePosition, view);
            }
        });
    }
}
