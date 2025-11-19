package e7;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f40654a;

    public b0(int i10) {
        this.f40654a = i10;
    }

    static /* bridge */ /* synthetic */ Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(C3209B c3209b);

    public abstract void d(r rVar, boolean z10);
}
