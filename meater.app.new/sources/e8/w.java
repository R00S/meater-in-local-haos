package e8;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
final class w extends AbstractRunnableC3254q {

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ IBinder f40783C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ z f40784D;

    w(z zVar, IBinder iBinder) {
        this.f40784D = zVar;
        this.f40783C = iBinder;
    }

    @Override // e8.AbstractRunnableC3254q
    public final void a() throws RemoteException {
        this.f40784D.f40786B.f40756m = AbstractBinderC3247j.g(this.f40783C);
        C3236A.q(this.f40784D.f40786B);
        this.f40784D.f40786B.f40750g = false;
        Iterator it = this.f40784D.f40786B.f40747d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f40784D.f40786B.f40747d.clear();
    }
}
