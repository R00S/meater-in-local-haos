package n1;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: ConfigurationCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: ConfigurationCompat.java */
    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static j a(Configuration configuration) {
        return j.h(a.a(configuration));
    }
}
