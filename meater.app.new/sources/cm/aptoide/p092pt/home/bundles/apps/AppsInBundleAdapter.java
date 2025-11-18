package cm.aptoide.p092pt.home.bundles.apps;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;
import cm.aptoide.p092pt.home.bundles.base.HomeEvent;
import cm.aptoide.p092pt.view.app.AppViewHolder;
import cm.aptoide.p092pt.view.app.Application;
import java.text.DecimalFormat;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
class AppsInBundleAdapter extends RecyclerView.AbstractC0594g<RecyclerView.AbstractC0590c0> {
    private static final int APP = 2131492901;
    private static final int REWARD_APP = 2131493160;
    private final C11418b<HomeEvent> appClickedEvents;
    private List<Application> apps;
    private ExperimentClicked experimentClickedEvent;
    private final DecimalFormat oneDecimalFormatter;
    private HomeBundle homeBundle = null;
    private int bundlePosition = -1;

    AppsInBundleAdapter(List<Application> list, DecimalFormat decimalFormat, C11418b<HomeEvent> c11418b, ExperimentClicked experimentClicked) {
        this.apps = list;
        this.oneDecimalFormatter = decimalFormat;
        this.appClickedEvents = c11418b;
        this.experimentClickedEvent = experimentClicked;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.apps.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemViewType(int i2) {
        return this.apps.get(i2) instanceof RewardApp ? C1146R.layout.reward_app_home_item : C1146R.layout.app_home_item;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(RecyclerView.AbstractC0590c0 abstractC0590c0, int i2) {
        ((AppViewHolder) abstractC0590c0).setApp(this.apps.get(i2), this.homeBundle, this.bundlePosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public RecyclerView.AbstractC0590c0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        if (i2 == C1146R.layout.app_home_item) {
            return new AppInBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.app_home_item, viewGroup, false), this.appClickedEvents, this.oneDecimalFormatter);
        }
        if (i2 == C1146R.layout.reward_app_home_item) {
            return new RewardAppInBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.reward_app_home_item, viewGroup, false), this.appClickedEvents);
        }
        throw new IllegalArgumentException("Wrong type of App");
    }

    public void update(List<Application> list) {
        this.apps = list;
        notifyDataSetChanged();
    }

    public void updateBundle(HomeBundle homeBundle, int i2) {
        this.homeBundle = homeBundle;
        this.bundlePosition = i2;
    }
}
