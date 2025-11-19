package d8;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import f8.InterfaceC3346a;
import z7.AbstractC5208j;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: d8.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3068l implements InterfaceC3058b {

    /* renamed from: a, reason: collision with root package name */
    private final C3077u f39763a;

    /* renamed from: b, reason: collision with root package name */
    private final C3065i f39764b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f39765c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f39766d = new Handler(Looper.getMainLooper());

    C3068l(C3077u c3077u, C3065i c3065i, Context context) {
        this.f39763a = c3077u;
        this.f39764b = c3065i;
        this.f39765c = context;
    }

    @Override // d8.InterfaceC3058b
    public final AbstractC5208j<C3057a> a() {
        return this.f39763a.c(this.f39765c.getPackageName());
    }

    @Override // d8.InterfaceC3058b
    public final boolean b(C3057a c3057a, int i10, Activity activity, int i11) {
        AbstractC3060d abstractC3060dC = AbstractC3060d.c(i10);
        if (activity == null) {
            return false;
        }
        return c(c3057a, new C3067k(this, activity), abstractC3060dC, i11);
    }

    public final boolean c(C3057a c3057a, InterfaceC3346a interfaceC3346a, AbstractC3060d abstractC3060d, int i10) {
        if (c3057a == null || interfaceC3346a == null || abstractC3060d == null || !c3057a.b(abstractC3060d) || c3057a.g()) {
            return false;
        }
        c3057a.f();
        interfaceC3346a.a(c3057a.d(abstractC3060d).getIntentSender(), i10, null, 0, 0, 0, null);
        return true;
    }
}
