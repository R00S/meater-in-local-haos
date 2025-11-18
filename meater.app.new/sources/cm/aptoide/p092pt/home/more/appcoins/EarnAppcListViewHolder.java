package cm.aptoide.p092pt.home.more.appcoins;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.bundles.apps.RewardApp;
import cm.aptoide.p092pt.home.more.base.ListAppsViewHolder;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p141p.InterfaceC5564g;
import com.bumptech.glide.p141p.p142l.InterfaceC5577i;
import java.text.DecimalFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: EarnAppcListViewHolder.kt */
@Metadata(m32266d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, m32267d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListViewHolder;", "Lcm/aptoide/pt/home/more/base/ListAppsViewHolder;", "Lcm/aptoide/pt/home/bundles/apps/RewardApp;", "view", "Landroid/view/View;", "decimalFormatter", "Ljava/text/DecimalFormat;", "(Landroid/view/View;Ljava/text/DecimalFormat;)V", "getView", "()Landroid/view/View;", "bindApp", HttpUrl.FRAGMENT_ENCODE_SET, "app", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class EarnAppcListViewHolder extends ListAppsViewHolder<RewardApp> {
    private final DecimalFormat decimalFormatter;
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarnAppcListViewHolder(View view, DecimalFormat decimalFormat) {
        super(view);
        C9801m.m32346f(view, "view");
        C9801m.m32346f(decimalFormat, "decimalFormatter");
        this.view = view;
        this.decimalFormatter = decimalFormat;
    }

    public final View getView() {
        return this.view;
    }

    @Override // cm.aptoide.p092pt.home.more.base.ListAppsViewHolder
    public void bindApp(final RewardApp app) {
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
        ImageLoader.with(this.itemView.getContext()).loadWithColorPlaceholderRoundCorners(app.getIcon(), 8, (ImageView) this.itemView.findViewById(C1146R.id.app_image), C1146R.attr.skeletonColor, new InterfaceC5564g<Drawable>() { // from class: cm.aptoide.pt.home.more.appcoins.EarnAppcListViewHolder.bindApp.1
            @Override // com.bumptech.glide.p141p.InterfaceC5564g
            public boolean onLoadFailed(GlideException glideException, Object obj, InterfaceC5577i<Drawable> interfaceC5577i, boolean z) {
                return false;
            }

            @Override // com.bumptech.glide.p141p.InterfaceC5564g
            public boolean onResourceReady(Drawable drawable, Object obj, InterfaceC5577i<Drawable> interfaceC5577i, EnumC5365a enumC5365a, boolean z) {
                View view = EarnAppcListViewHolder.this.itemView;
                int i2 = C1146R.id.app_feature_graphic;
                ((ImageView) view.findViewById(i2)).setColorFilter(1073741824);
                ImageLoader imageLoaderWith = ImageLoader.with(EarnAppcListViewHolder.this.itemView.getContext());
                String featureGraphic = app.getFeatureGraphic();
                if (drawable == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                }
                imageLoaderWith.loadWithPalettePlaceholder(featureGraphic, (BitmapDrawable) drawable, -1, (ImageView) EarnAppcListViewHolder.this.itemView.findViewById(i2));
                return false;
            }
        });
    }
}
