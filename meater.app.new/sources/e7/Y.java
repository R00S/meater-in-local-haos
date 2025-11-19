package e7;

import android.os.DeadObjectException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public final class Y extends b0 {

    /* renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.api.internal.a f40645b;

    public Y(int i10, com.google.android.gms.common.api.internal.a aVar) {
        super(i10);
        this.f40645b = (com.google.android.gms.common.api.internal.a) C3445p.l(aVar, "Null methods are not runnable.");
    }

    @Override // e7.b0
    public final void a(Status status) {
        try {
            this.f40645b.q(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // e7.b0
    public final void b(Exception exc) {
        try {
            this.f40645b.q(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // e7.b0
    public final void c(C3209B c3209b) throws DeadObjectException {
        try {
            this.f40645b.o(c3209b.w());
        } catch (RuntimeException e10) {
            b(e10);
        }
    }

    @Override // e7.b0
    public final void d(r rVar, boolean z10) {
        rVar.c(this.f40645b, z10);
    }
}
