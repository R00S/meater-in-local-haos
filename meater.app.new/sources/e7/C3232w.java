package e7;

import e7.ComponentCallbacks2C3213c;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* renamed from: e7.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3232w implements ComponentCallbacks2C3213c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3216f f40738a;

    C3232w(C3216f c3216f) {
        this.f40738a = c3216f;
    }

    @Override // e7.ComponentCallbacks2C3213c.a
    public final void a(boolean z10) {
        C3216f c3216f = this.f40738a;
        c3216f.f40686O.sendMessage(c3216f.f40686O.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
