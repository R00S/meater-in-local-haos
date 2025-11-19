package d8;

import android.content.Context;
import e8.C3237B;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3064h {

    /* renamed from: a, reason: collision with root package name */
    private static InterfaceC3061e f39760a;

    static synchronized InterfaceC3061e a(Context context) {
        try {
            if (f39760a == null) {
                C3063g c3063g = new C3063g(null);
                c3063g.b(new C3070n(C3237B.a(context)));
                f39760a = c3063g.a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f39760a;
    }
}
