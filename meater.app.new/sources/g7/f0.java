package g7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import c7.C2333b;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class f0 extends Q {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f42034g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC3433d f42035h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(AbstractC3433d abstractC3433d, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC3433d, i10, bundle);
        this.f42035h = abstractC3433d;
        this.f42034g = iBinder;
    }

    @Override // g7.Q
    protected final void f(C2333b c2333b) {
        if (this.f42035h.f42000W != null) {
            this.f42035h.f42000W.c(c2333b);
        }
        this.f42035h.L(c2333b);
    }

    @Override // g7.Q
    protected final boolean g() throws RemoteException {
        try {
            IBinder iBinder = this.f42034g;
            C3445p.k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f42035h.E().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f42035h.E() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceS = this.f42035h.s(this.f42034g);
            if (iInterfaceS == null || !(AbstractC3433d.g0(this.f42035h, 2, 4, iInterfaceS) || AbstractC3433d.g0(this.f42035h, 3, 4, iInterfaceS))) {
                return false;
            }
            this.f42035h.f42004a0 = null;
            AbstractC3433d abstractC3433d = this.f42035h;
            Bundle bundleX = abstractC3433d.x();
            if (abstractC3433d.f41999V == null) {
                return true;
            }
            this.f42035h.f41999V.k(bundleX);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
