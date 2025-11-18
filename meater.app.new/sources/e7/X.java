package e7;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import z7.C5209k;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
abstract class X extends J {

    /* renamed from: b, reason: collision with root package name */
    protected final C5209k f40644b;

    public X(int i10, C5209k c5209k) {
        super(i10);
        this.f40644b = c5209k;
    }

    @Override // e7.b0
    public final void a(Status status) {
        this.f40644b.d(new ApiException(status));
    }

    @Override // e7.b0
    public final void b(Exception exc) {
        this.f40644b.d(exc);
    }

    @Override // e7.b0
    public final void c(C3209B c3209b) throws DeadObjectException {
        try {
            h(c3209b);
        } catch (DeadObjectException e10) {
            a(b0.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(b0.e(e11));
        } catch (RuntimeException e12) {
            this.f40644b.d(e12);
        }
    }

    protected abstract void h(C3209B c3209b);
}
