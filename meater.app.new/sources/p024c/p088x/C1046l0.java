package p024c.p088x;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
/* renamed from: c.x.l0 */
/* loaded from: classes.dex */
class C1046l0 implements InterfaceC1048m0 {

    /* renamed from: a */
    private final WindowId f6870a;

    C1046l0(View view) {
        this.f6870a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1046l0) && ((C1046l0) obj).f6870a.equals(this.f6870a);
    }

    public int hashCode() {
        return this.f6870a.hashCode();
    }
}
