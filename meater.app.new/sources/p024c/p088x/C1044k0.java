package p024c.p088x;

import android.os.IBinder;

/* compiled from: WindowIdApi14.java */
/* renamed from: c.x.k0 */
/* loaded from: classes.dex */
class C1044k0 implements InterfaceC1048m0 {

    /* renamed from: a */
    private final IBinder f6867a;

    C1044k0(IBinder iBinder) {
        this.f6867a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1044k0) && ((C1044k0) obj).f6867a.equals(this.f6867a);
    }

    public int hashCode() {
        return this.f6867a.hashCode();
    }
}
