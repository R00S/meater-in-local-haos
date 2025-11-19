package e7;

import android.util.Log;
import c7.C2333b;
import com.google.android.gms.common.api.a;
import g7.AbstractC3433d;
import g7.InterfaceC3439j;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes2.dex */
final class F implements AbstractC3433d.c, T {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f40607a;

    /* renamed from: b, reason: collision with root package name */
    private final C3212b f40608b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC3439j f40609c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f40610d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f40611e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C3216f f40612f;

    public F(C3216f c3216f, a.f fVar, C3212b c3212b) {
        this.f40612f = c3216f;
        this.f40607a = fVar;
        this.f40608b = c3212b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        InterfaceC3439j interfaceC3439j;
        if (!this.f40611e || (interfaceC3439j = this.f40609c) == null) {
            return;
        }
        this.f40607a.f(interfaceC3439j, this.f40610d);
    }

    @Override // e7.T
    public final void a(C2333b c2333b) {
        C3209B c3209b = (C3209B) this.f40612f.f40682K.get(this.f40608b);
        if (c3209b != null) {
            c3209b.J(c2333b);
        }
    }

    @Override // e7.T
    public final void b(InterfaceC3439j interfaceC3439j, Set set) {
        if (interfaceC3439j == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new C2333b(4));
        } else {
            this.f40609c = interfaceC3439j;
            this.f40610d = set;
            i();
        }
    }

    @Override // g7.AbstractC3433d.c
    public final void c(C2333b c2333b) {
        this.f40612f.f40686O.post(new E(this, c2333b));
    }

    @Override // e7.T
    public final void d(int i10) {
        C3209B c3209b = (C3209B) this.f40612f.f40682K.get(this.f40608b);
        if (c3209b != null) {
            if (c3209b.f40598J) {
                c3209b.J(new C2333b(17));
            } else {
                c3209b.g(i10);
            }
        }
    }
}
