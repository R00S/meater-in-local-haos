package e7;

import android.util.Log;
import c7.C2333b;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
final class E implements Runnable {

    /* renamed from: B, reason: collision with root package name */
    final /* synthetic */ C2333b f40605B;

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ F f40606C;

    E(F f10, C2333b c2333b) {
        this.f40606C = f10;
        this.f40605B = c2333b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F f10 = this.f40606C;
        C3209B c3209b = (C3209B) f10.f40612f.f40682K.get(f10.f40608b);
        if (c3209b == null) {
            return;
        }
        if (!this.f40605B.G0()) {
            c3209b.I(this.f40605B, null);
            return;
        }
        this.f40606C.f40611e = true;
        if (this.f40606C.f40607a.n()) {
            this.f40606C.i();
            return;
        }
        try {
            F f11 = this.f40606C;
            f11.f40607a.f(null, f11.f40607a.b());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.f40606C.f40607a.c("Failed to get service from broker.");
            c3209b.I(new C2333b(10), null);
        }
    }
}
