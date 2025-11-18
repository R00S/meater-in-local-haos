package cm.aptoide.p092pt.view;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface LifecycleSchim {
    void onDestroyView();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onViewCreated();

    void onViewStateRestored(Bundle bundle);
}
