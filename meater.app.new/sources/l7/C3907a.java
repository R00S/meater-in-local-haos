package l7;

import android.content.Context;
import com.google.android.gms.common.util.l;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3907a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f44417a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f44418b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f44417a;
        if (context2 != null && (bool = f44418b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f44418b = null;
        if (l.e()) {
            f44418b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f44418b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f44418b = Boolean.FALSE;
            }
        }
        f44417a = applicationContext;
        return f44418b.booleanValue();
    }
}
