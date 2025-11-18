package cm.aptoide.p092pt.view.app;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.home.bundles.base.HomeBundle;

/* loaded from: classes.dex */
public abstract class AppViewHolder extends RecyclerView.AbstractC0590c0 {
    public AppViewHolder(View view) {
        super(view);
    }

    public abstract void setApp(Application application, HomeBundle homeBundle, int i2);
}
