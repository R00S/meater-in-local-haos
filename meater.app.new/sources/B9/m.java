package B9;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;
import v9.C4925a;

/* compiled from: URLAllowlist.java */
/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static String[] f1951a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        C4925a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f1951a == null) {
            f1951a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f1951a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
