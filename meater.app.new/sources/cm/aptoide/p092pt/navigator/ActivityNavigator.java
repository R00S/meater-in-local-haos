package cm.aptoide.p092pt.navigator;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface ActivityNavigator {
    Activity getActivity();

    void navigateBack();

    void navigateBackWithResult(int i2, Bundle bundle);

    C11234e<Result> navigateForResult(String str, Uri uri, int i2);

    void navigateForResult(Intent intent, int i2);

    void navigateForResult(Class<? extends Activity> cls, int i2, Bundle bundle);

    void navigateForResult(String str, Uri uri, int i2, String str2, String str3);

    C11234e<Result> navigateForResultWithOutput(String str, Uri uri, int i2);

    void navigateTo(Uri uri);

    void navigateTo(Class<? extends Activity> cls);

    void navigateTo(Class<? extends Activity> cls, Bundle bundle);

    void navigateWithIntent(Intent intent);

    C11234e<Result> results();

    C11234e<Result> results(int i2);
}
