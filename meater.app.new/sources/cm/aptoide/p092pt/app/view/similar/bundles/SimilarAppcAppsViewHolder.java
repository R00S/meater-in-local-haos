package cm.aptoide.p092pt.app.view.similar.bundles;

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
import cm.aptoide.p092pt.view.custom.HorizontalHeaderItemDecoration;
import java.text.DecimalFormat;
import java.util.Collections;
import p456rx.p473s.C11418b;

/* loaded from: classes.dex */
public class SimilarAppcAppsViewHolder extends SimilarBundleViewHolder {
    private AppViewSimilarAppsAdapter adapter;
    private final DecimalFormat oneDecimalFormat;
    private final C11418b<SimilarAppClickEvent> similarAppClick;
    private final RecyclerView similarAppcApps;

    public SimilarAppcAppsViewHolder(View view, DecimalFormat decimalFormat, C11418b<SimilarAppClickEvent> c11418b) throws IllegalStateException {
        super(view);
        this.oneDecimalFormat = decimalFormat;
        this.similarAppClick = c11418b;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1146R.id.similar_appc_list);
        this.similarAppcApps = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.addItemDecoration(new HorizontalHeaderItemDecoration(view.getContext(), recyclerView, C1146R.layout.appview_appc_similar_header, AptoideUtils.ScreenU.getPixelsForDip(112, view.getResources()), AptoideUtils.ScreenU.getPixelsForDip(5, view.getResources())));
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        new SnapToStartHelper().attachToRecyclerView(recyclerView);
        recyclerView.setAdapter(getSimilarAdapter());
    }

    private RecyclerView.AbstractC0594g getSimilarAdapter() {
        AppViewSimilarAppsAdapter appViewSimilarAppsAdapter = new AppViewSimilarAppsAdapter(Collections.emptyList(), this.oneDecimalFormat, this.similarAppClick, AppViewSimilarAppsAdapter.SimilarAppType.APPC_SIMILAR_APPS);
        this.adapter = appViewSimilarAppsAdapter;
        return appViewSimilarAppsAdapter;
    }

    @Override // cm.aptoide.p092pt.app.view.similar.SimilarBundleViewHolder
    public void setBundle(SimilarAppsBundle similarAppsBundle, int i2) {
        this.adapter.update(mapToSimilar(similarAppsBundle.getContent(), false));
    }
}
