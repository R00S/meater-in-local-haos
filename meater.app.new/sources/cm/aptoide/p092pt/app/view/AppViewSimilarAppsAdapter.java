package cm.aptoide.p092pt.app.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.AppViewSimilarApp;
import cm.aptoide.p092pt.app.view.similar.SimilarAppClickEvent;
import java.text.DecimalFormat;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class AppViewSimilarAppsAdapter extends RecyclerView.AbstractC0594g<AppViewSimilarAppViewHolder> {
    private C11418b<SimilarAppClickEvent> appClicked;
    private DecimalFormat oneDecimalFormater;
    private List<AppViewSimilarApp> similarApps;
    private SimilarAppType type;

    public enum SimilarAppType {
        APPC_SIMILAR_APPS("appc_similar_apps"),
        SIMILAR_APPS("similar_apps");

        private final String description;

        SimilarAppType(String str) {
            this.description = str;
        }

        public String getDescription() {
            return this.description;
        }
    }

    public AppViewSimilarAppsAdapter(List<AppViewSimilarApp> list, DecimalFormat decimalFormat, C11418b<SimilarAppClickEvent> c11418b, SimilarAppType similarAppType) {
        this.similarApps = list;
        this.oneDecimalFormater = decimalFormat;
        this.appClicked = c11418b;
        this.type = similarAppType;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.similarApps.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemViewType(int i2) {
        return this.similarApps.get(i2).getNetworkAdType();
    }

    public void update(List<AppViewSimilarApp> list) {
        this.similarApps = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(AppViewSimilarAppViewHolder appViewSimilarAppViewHolder, int i2) {
        if (this.similarApps.get(i2) != null) {
            appViewSimilarAppViewHolder.setSimilarApp(this.similarApps.get(i2), this.type);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public AppViewSimilarAppViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new AppViewSimilarAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.displayable_grid_ad, viewGroup, false), this.oneDecimalFormater, this.appClicked);
    }
}
