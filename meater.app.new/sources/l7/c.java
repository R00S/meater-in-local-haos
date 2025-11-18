package l7;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private static final c f44420b = new c();

    /* renamed from: a, reason: collision with root package name */
    private b f44421a = null;

    public static b a(Context context) {
        return f44420b.b(context);
    }

    public final synchronized b b(Context context) {
        try {
            if (this.f44421a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f44421a = new b(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f44421a;
    }
}
