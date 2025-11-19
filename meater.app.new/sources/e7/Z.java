package e7;

import android.os.DeadObjectException;
import android.os.RemoteException;
import c7.C2335d;
import com.google.android.gms.common.api.Status;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class Z extends J {

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3225o f40646b;

    /* renamed from: c, reason: collision with root package name */
    private final C5209k f40647c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3224n f40648d;

    public Z(int i10, AbstractC3225o abstractC3225o, C5209k c5209k, InterfaceC3224n interfaceC3224n) {
        super(i10);
        this.f40647c = c5209k;
        this.f40646b = abstractC3225o;
        this.f40648d = interfaceC3224n;
        if (i10 == 2 && abstractC3225o.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // e7.b0
    public final void a(Status status) {
        this.f40647c.d(this.f40648d.a(status));
    }

    @Override // e7.b0
    public final void b(Exception exc) {
        this.f40647c.d(exc);
    }

    @Override // e7.b0
    public final void c(C3209B c3209b) throws DeadObjectException {
        try {
            this.f40646b.b(c3209b.w(), this.f40647c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(b0.e(e11));
        } catch (RuntimeException e12) {
            this.f40647c.d(e12);
        }
    }

    @Override // e7.b0
    public final void d(r rVar, boolean z10) {
        rVar.d(this.f40647c, z10);
    }

    @Override // e7.J
    public final boolean f(C3209B c3209b) {
        return this.f40646b.c();
    }

    @Override // e7.J
    public final C2335d[] g(C3209B c3209b) {
        return this.f40646b.e();
    }
}
