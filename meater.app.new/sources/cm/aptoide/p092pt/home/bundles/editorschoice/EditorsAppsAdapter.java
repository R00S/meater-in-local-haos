package cm.aptoide.p092pt.home.bundles.editorschoice;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.view.app.Application;
import cm.aptoide.p092pt.view.app.FeatureGraphicApplication;
import java.text.DecimalFormat;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
class EditorsAppsAdapter extends RecyclerView.AbstractC0594g<FeatureGraphicInBundleViewHolder> {
    private final C11418b<HomeEvent> appClickedEvents;
    private List<Application> apps;
    private final DecimalFormat oneDecimalFormatter;
    private HomeBundle homeBundle = null;
    private int bundlePosition = -1;

    public EditorsAppsAdapter(List<Application> list, DecimalFormat decimalFormat, C11418b<HomeEvent> c11418b) {
        this.apps = list;
        this.oneDecimalFormatter = decimalFormat;
        this.appClickedEvents = c11418b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.apps.size();
    }

    public void update(List<Application> list) {
        this.apps = list;
        notifyDataSetChanged();
    }

    public void updateBundle(HomeBundle homeBundle, int i2) {
        this.homeBundle = homeBundle;
        this.bundlePosition = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(FeatureGraphicInBundleViewHolder featureGraphicInBundleViewHolder, int i2) {
        featureGraphicInBundleViewHolder.setFeatureGraphicApplication((FeatureGraphicApplication) this.apps.get(i2), this.homeBundle, this.bundlePosition, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public FeatureGraphicInBundleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new FeatureGraphicInBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.feature_graphic_home_item, viewGroup, false), this.oneDecimalFormatter, this.appClickedEvents);
    }
}
