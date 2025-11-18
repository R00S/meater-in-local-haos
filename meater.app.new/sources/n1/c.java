package n1;

import android.os.Build;
import android.os.Bundle;

/* compiled from: BundleCompat.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: BundleCompat.java */
    static class a {
        static <T> T a(Bundle bundle, String str, Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }
    }

    public static <T> T a(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(bundle, str, cls);
        }
        T t10 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }
}
