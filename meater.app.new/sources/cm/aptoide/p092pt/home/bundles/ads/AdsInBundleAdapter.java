package cm.aptoide.p092pt.home.bundles.ads;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import java.text.DecimalFormat;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
class AdsInBundleAdapter extends RecyclerView.AbstractC0594g<AdInBundleViewHolder> {
    private final C11418b<AdHomeEvent> adClickedEvents;
    private List<AdClick> ads;
    private final DecimalFormat oneDecimalFormatter;
    private HomeBundle homeBundle = null;
    private int bundlePosition = -1;

    public AdsInBundleAdapter(List<AdClick> list, DecimalFormat decimalFormat, C11418b<AdHomeEvent> c11418b) {
        this.ads = list;
        this.oneDecimalFormatter = decimalFormat;
        this.adClickedEvents = c11418b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.ads.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemViewType(int i2) {
        return this.ads.get(i2).getAd().getNetwork().ordinal();
    }

    public void update(List<AdClick> list) {
        this.ads = list;
        notifyDataSetChanged();
    }

    public void updateBundle(HomeBundle homeBundle, int i2) {
        this.homeBundle = homeBundle;
        this.bundlePosition = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(AdInBundleViewHolder adInBundleViewHolder, int i2) {
        adInBundleViewHolder.setApp(this.ads.get(i2), this.homeBundle, this.bundlePosition, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public AdInBundleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new AdInBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.displayable_grid_ad, viewGroup, false), this.adClickedEvents, this.oneDecimalFormatter);
    }
}
