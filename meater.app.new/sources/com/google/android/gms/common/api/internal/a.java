package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import d7.InterfaceC3051e;
import e7.InterfaceC3214d;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public abstract class a<R extends InterfaceC3051e, A extends a.b> extends BasePendingResult<R> implements InterfaceC3214d<R> {

    /* renamed from: o, reason: collision with root package name */
    private final a.c<A> f33501o;

    /* renamed from: p, reason: collision with root package name */
    private final com.google.android.gms.common.api.a<?> f33502p;

    protected a(com.google.android.gms.common.api.a<?> aVar, com.google.android.gms.common.api.c cVar) {
        super((com.google.android.gms.common.api.c) C3445p.l(cVar, "GoogleApiClient must not be null"));
        C3445p.l(aVar, "Api must not be null");
        this.f33501o = aVar.b();
        this.f33502p = aVar;
    }

    private void p(RemoteException remoteException) {
        q(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    public /* bridge */ /* synthetic */ void a(Object obj) {
        super.g((InterfaceC3051e) obj);
    }

    protected abstract void m(A a10);

    public final void o(A a10) throws DeadObjectException {
        try {
            m(a10);
        } catch (DeadObjectException e10) {
            p(e10);
            throw e10;
        } catch (RemoteException e11) {
            p(e11);
        }
    }

    public final void q(Status status) {
        C3445p.b(!status.G0(), "Failed result must not be success");
        R rD = d(status);
        g(rD);
        n(rD);
    }

    protected void n(R r10) {
    }
}
