package j8;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
final class p extends j {

    /* renamed from: C, reason: collision with root package name */
    final /* synthetic */ IBinder f43549C;

    /* renamed from: D, reason: collision with root package name */
    final /* synthetic */ r f43550D;

    p(r rVar, IBinder iBinder) {
        this.f43549C = iBinder;
        this.f43550D = rVar;
    }

    @Override // j8.j
    public final void a() throws RemoteException {
        this.f43550D.f43552B.f43566m = e.g(this.f43549C);
        t.q(this.f43550D.f43552B);
        this.f43550D.f43552B.f43560g = false;
        Iterator it = this.f43550D.f43552B.f43557d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f43550D.f43552B.f43557d.clear();
    }
}
