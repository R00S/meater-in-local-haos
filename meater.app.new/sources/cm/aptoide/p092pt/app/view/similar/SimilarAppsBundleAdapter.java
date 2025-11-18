package cm.aptoide.p092pt.app.view.similar;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.view.similar.SimilarAppsBundle;
import cm.aptoide.p092pt.app.view.similar.bundles.SimilarAppcAppsViewHolder;
import cm.aptoide.p092pt.app.view.similar.bundles.SimilarAppsViewHolder;
import java.text.DecimalFormat;
import java.util.List;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class SimilarAppsBundleAdapter extends RecyclerView.AbstractC0594g<SimilarBundleViewHolder> {
    private static final int APPC_APPS = 2131492921;
    private static final int APPS = 2131492922;
    private List<SimilarAppsBundle> bundles;
    private final DecimalFormat decimalFormat;
    private final C11418b<SimilarAppClickEvent> similarAppClick;

    /* renamed from: cm.aptoide.pt.app.view.similar.SimilarAppsBundleAdapter$1 */
    static /* synthetic */ class C18391 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$app$view$similar$SimilarAppsBundle$BundleType */
        static final /* synthetic */ int[] f8059x549d0114;

        static {
            int[] iArr = new int[SimilarAppsBundle.BundleType.values().length];
            f8059x549d0114 = iArr;
            try {
                iArr[SimilarAppsBundle.BundleType.APPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8059x549d0114[SimilarAppsBundle.BundleType.APPC_APPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public SimilarAppsBundleAdapter(List<SimilarAppsBundle> list, DecimalFormat decimalFormat, C11418b<SimilarAppClickEvent> c11418b) {
        this.bundles = list;
        this.decimalFormat = decimalFormat;
        this.similarAppClick = c11418b;
    }

    public void add(SimilarAppsBundle similarAppsBundle) {
        this.bundles.add(similarAppsBundle);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.bundles.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemViewType(int i2) {
        int i3 = C18391.f8059x549d0114[this.bundles.get(i2).getType().ordinal()];
        if (i3 == 1) {
            return C1146R.layout.appview_similar_layout;
        }
        if (i3 == 2) {
            return C1146R.layout.appview_similar_appc_layout;
        }
        throw new IllegalStateException("Bundle type not supported by the adapter: " + this.bundles.get(i2).getType().name());
    }

    public void update(List<SimilarAppsBundle> list) {
        this.bundles = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(SimilarBundleViewHolder similarBundleViewHolder, int i2) {
        similarBundleViewHolder.setBundle(this.bundles.get(i2), i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public SimilarBundleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        switch (i2) {
            case C1146R.layout.appview_similar_appc_layout /* 2131492921 */:
                return new SimilarAppcAppsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.appview_similar_appc_layout, viewGroup, false), this.decimalFormat, this.similarAppClick);
            case C1146R.layout.appview_similar_layout /* 2131492922 */:
                return new SimilarAppsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1146R.layout.appview_similar_layout, viewGroup, false), this.decimalFormat, this.similarAppClick);
            default:
                throw new IllegalStateException("Invalid bundle view type");
        }
    }

    public void add(List<SimilarAppsBundle> list) {
        this.bundles.addAll(list);
        notifyItemInserted(list.size() - 1);
    }
}
