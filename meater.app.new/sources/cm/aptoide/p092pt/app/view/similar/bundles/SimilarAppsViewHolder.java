package cm.aptoide.p092pt.app.view.similar.bundles;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.app.view.AppViewSimilarAppsAdapter;
import cm.aptoide.p092pt.app.view.similar.SimilarAppClickEvent;
import cm.aptoide.p092pt.app.view.similar.SimilarAppsBundle;
import cm.aptoide.p092pt.app.view.similar.SimilarBundleViewHolder;
import cm.aptoide.p092pt.home.SnapToStartHelper;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.text.DecimalFormat;
import java.util.Collections;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class SimilarAppsViewHolder extends SimilarBundleViewHolder {
    private AppViewSimilarAppsAdapter adapter;
    private final DecimalFormat oneDecimalFormat;
    private final C11418b<SimilarAppClickEvent> similarAppClick;
    private final RecyclerView similarApps;

    public SimilarAppsViewHolder(View view, DecimalFormat decimalFormat, C11418b<SimilarAppClickEvent> c11418b) throws IllegalStateException {
        super(view);
        this.oneDecimalFormat = decimalFormat;
        this.similarAppClick = c11418b;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1146R.id.similar_list);
        this.similarApps = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(new RecyclerView.AbstractC0601n() { // from class: cm.aptoide.pt.app.view.similar.bundles.SimilarAppsViewHolder.1
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0601n
            public void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView2, RecyclerView.C0613z c0613z) {
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(5, view2.getResources());
                rect.set(pixelsForDip, pixelsForDip, 0, pixelsForDip);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        new SnapToStartHelper().attachToRecyclerView(recyclerView);
    }

    private void setSimilarAdapter() {
        AppViewSimilarAppsAdapter appViewSimilarAppsAdapter = new AppViewSimilarAppsAdapter(Collections.emptyList(), this.oneDecimalFormat, this.similarAppClick, AppViewSimilarAppsAdapter.SimilarAppType.SIMILAR_APPS);
        this.adapter = appViewSimilarAppsAdapter;
        this.similarApps.setAdapter(appViewSimilarAppsAdapter);
    }

    @Override // cm.aptoide.p092pt.app.view.similar.SimilarBundleViewHolder
    public void setBundle(SimilarAppsBundle similarAppsBundle, int i2) {
        if (this.adapter == null) {
            setSimilarAdapter();
        }
        this.adapter.update(mapToSimilar(similarAppsBundle.getContent(), similarAppsBundle.getContent().hasAd()));
    }
}
