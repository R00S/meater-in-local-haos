package g7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f41969a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f41970b;

    /* renamed from: c, reason: collision with root package name */
    private static String f41971c;

    /* renamed from: d, reason: collision with root package name */
    private static int f41972d;

    public static int a(Context context) {
        b(context);
        return f41972d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f41969a) {
            try {
                if (f41970b) {
                    return;
                }
                f41970b = true;
                try {
                    bundle = l7.c.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
                if (bundle == null) {
                    return;
                }
                f41971c = bundle.getString("com.google.app.id");
                f41972d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
