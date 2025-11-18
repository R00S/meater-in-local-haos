package g7;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class d0 extends T {

    /* renamed from: B, reason: collision with root package name */
    private AbstractC3433d f42009B;

    /* renamed from: C, reason: collision with root package name */
    private final int f42010C;

    public d0(AbstractC3433d abstractC3433d, int i10) {
        this.f42009B = abstractC3433d;
        this.f42010C = i10;
    }

    @Override // g7.InterfaceC3440k
    public final void U(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // g7.InterfaceC3440k
    public final void Y(int i10, IBinder iBinder, h0 h0Var) {
        AbstractC3433d abstractC3433d = this.f42009B;
        C3445p.l(abstractC3433d, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C3445p.k(h0Var);
        AbstractC3433d.c0(abstractC3433d, h0Var);
        r0(i10, iBinder, h0Var.f42056B);
    }

    @Override // g7.InterfaceC3440k
    public final void r0(int i10, IBinder iBinder, Bundle bundle) {
        C3445p.l(this.f42009B, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f42009B.N(i10, iBinder, bundle, this.f42010C);
        this.f42009B = null;
    }
}
