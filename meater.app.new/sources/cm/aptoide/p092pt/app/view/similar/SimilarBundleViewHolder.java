package cm.aptoide.p092pt.app.view.similar;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.app.AppViewSimilarApp;
import cm.aptoide.p092pt.app.SimilarAppsViewModel;
import cm.aptoide.p092pt.view.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class SimilarBundleViewHolder extends RecyclerView.AbstractC0590c0 {
    public SimilarBundleViewHolder(View view) {
        super(view);
    }

    public List<AppViewSimilarApp> mapToSimilar(SimilarAppsViewModel similarAppsViewModel, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new AppViewSimilarApp(null, similarAppsViewModel.getAd()));
        }
        Iterator<Application> it = similarAppsViewModel.getRecommendedApps().iterator();
        while (it.hasNext()) {
            arrayList.add(new AppViewSimilarApp(it.next(), null));
        }
        return arrayList;
    }

    public abstract void setBundle(SimilarAppsBundle similarAppsBundle, int i2);
}
