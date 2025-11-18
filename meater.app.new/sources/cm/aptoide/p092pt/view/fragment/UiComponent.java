package cm.aptoide.p092pt.view.fragment;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public interface UiComponent {
    void bindViews(View view);

    int getContentViewId();

    void loadExtras(Bundle bundle);

    void setupToolbar();

    void setupViews();
}
