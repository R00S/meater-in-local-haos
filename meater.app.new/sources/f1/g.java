package f1;

import android.os.Bundle;
import android.os.IBinder;

/* compiled from: BundleCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class g {
    @Deprecated
    public static IBinder a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }
}
