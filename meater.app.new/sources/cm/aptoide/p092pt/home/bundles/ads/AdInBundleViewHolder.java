package cm.aptoide.p092pt.home.bundles.ads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.ads.data.Payout;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import java.text.DecimalFormat;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
class AdInBundleViewHolder extends RecyclerView.AbstractC0590c0 {
    private final C11418b<AdHomeEvent> adClickedEvents;
    private final View appInfoLayout;
    private final View appcEarnLayout;
    private final ImageView iconView;
    private final TextView nameTextView;
    private final DecimalFormat oneDecimalFormatter;
    private final TextView rating;
    private final TextView rewardTextView;

    public AdInBundleViewHolder(View view, C11418b<AdHomeEvent> c11418b, DecimalFormat decimalFormat) {
        super(view);
        this.nameTextView = (TextView) view.findViewById(C1146R.id.name);
        this.iconView = (ImageView) view.findViewById(C1146R.id.icon);
        this.rating = (TextView) view.findViewById(C1146R.id.rating_label);
        this.appcEarnLayout = view.findViewById(C1146R.id.appc_earn_layout);
        this.appInfoLayout = view.findViewById(C1146R.id.app_info_layout);
        this.rewardTextView = (TextView) view.findViewById(C1146R.id.reward_textview);
        this.adClickedEvents = c11418b;
        this.oneDecimalFormatter = decimalFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setApp$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8067a(AdClick adClick, int i2, HomeBundle homeBundle, int i3, View view) {
        this.adClickedEvents.onNext(new AdHomeEvent(adClick, i2, homeBundle, i3, HomeEvent.Type.AD));
    }

    public void setApp(final AdClick adClick, final HomeBundle homeBundle, final int i2, final int i3) {
        this.nameTextView.setText(adClick.getAd().getAdTitle());
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(adClick.getAd().getIconUrl(), 8, this.iconView, C1146R.attr.placeholder_square);
        if (adClick.getAd().hasAppcPayout()) {
            Payout appcPayout = adClick.getAd().getAppcPayout();
            this.appInfoLayout.setVisibility(8);
            this.appcEarnLayout.setVisibility(0);
            this.rewardTextView.setText(this.itemView.getContext().getString(C1146R.string.poa_app_card_short, appcPayout.getFiatSymbol() + this.oneDecimalFormatter.format(appcPayout.getFiatAmount())));
        } else {
            this.appInfoLayout.setVisibility(0);
            this.appcEarnLayout.setVisibility(8);
            float fIntValue = adClick.getAd().getStars().intValue();
            if (fIntValue == 0.0f) {
                this.rating.setText(C1146R.string.appcardview_title_no_stars);
            } else {
                this.rating.setText(this.oneDecimalFormatter.format(fIntValue));
            }
        }
        adClick.getAd().registerClickableView(this.itemView);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: cm.aptoide.pt.home.bundles.ads.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9513f.m8067a(adClick, i3, homeBundle, i2, view);
            }
        });
    }
}
