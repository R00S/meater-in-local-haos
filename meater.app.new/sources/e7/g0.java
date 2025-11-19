package e7;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import c7.C2333b;
import c7.C2336e;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C4734X;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
public abstract class g0 extends C3218h implements DialogInterface.OnCancelListener {

    /* renamed from: C, reason: collision with root package name */
    protected volatile boolean f40691C;

    /* renamed from: D, reason: collision with root package name */
    protected final AtomicReference f40692D;

    /* renamed from: E, reason: collision with root package name */
    private final Handler f40693E;

    /* renamed from: F, reason: collision with root package name */
    protected final C2336e f40694F;

    g0(InterfaceC3219i interfaceC3219i, C2336e c2336e) {
        super(interfaceC3219i);
        this.f40692D = new AtomicReference(null);
        this.f40693E = new p7.j(Looper.getMainLooper());
        this.f40694F = c2336e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(C2333b c2333b, int i10) {
        this.f40692D.set(null);
        m(c2333b, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f40692D.set(null);
        n();
    }

    private static final int p(d0 d0Var) {
        if (d0Var == null) {
            return -1;
        }
        return d0Var.a();
    }

    @Override // e7.C3218h
    public final void e(int i10, int i11, Intent intent) {
        d0 d0Var = (d0) this.f40692D.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iG = this.f40694F.g(b());
                if (iG == 0) {
                    o();
                    return;
                } else {
                    if (d0Var == null) {
                        return;
                    }
                    if (d0Var.b().f0() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (d0Var != null) {
                l(new C2333b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, d0Var.b().toString()), p(d0Var));
                return;
            }
            return;
        }
        if (d0Var != null) {
            l(d0Var.b(), d0Var.a());
        }
    }

    @Override // e7.C3218h
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f40692D.set(bundle.getBoolean("resolving_error", false) ? new d0(new C2333b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // e7.C3218h
    public final void i(Bundle bundle) {
        super.i(bundle);
        d0 d0Var = (d0) this.f40692D.get();
        if (d0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", d0Var.a());
        bundle.putInt("failed_status", d0Var.b().f0());
        bundle.putParcelable("failed_resolution", d0Var.b().r0());
    }

    @Override // e7.C3218h
    public void j() {
        super.j();
        this.f40691C = true;
    }

    @Override // e7.C3218h
    public void k() {
        super.k();
        this.f40691C = false;
    }

    protected abstract void m(C2333b c2333b, int i10);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new C2333b(13, null), p((d0) this.f40692D.get()));
    }

    public final void s(C2333b c2333b, int i10) {
        AtomicReference atomicReference;
        d0 d0Var = new d0(c2333b, i10);
        do {
            atomicReference = this.f40692D;
            if (C4734X.a(atomicReference, null, d0Var)) {
                this.f40693E.post(new f0(this, d0Var));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
