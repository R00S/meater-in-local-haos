package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.AbstractC2106m;
import android.view.C2116x;
import android.view.InterfaceC2104k;
import android.view.S;
import android.view.V;
import android.view.a0;
import android.view.b0;
import android.view.c0;
import t3.C4547d;
import t3.C4548e;
import t3.InterfaceC4549f;

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
class G implements InterfaceC2104k, InterfaceC4549f, c0 {

    /* renamed from: B, reason: collision with root package name */
    private final Fragment f25548B;

    /* renamed from: C, reason: collision with root package name */
    private final b0 f25549C;

    /* renamed from: D, reason: collision with root package name */
    private final Runnable f25550D;

    /* renamed from: E, reason: collision with root package name */
    private a0.c f25551E;

    /* renamed from: F, reason: collision with root package name */
    private C2116x f25552F = null;

    /* renamed from: G, reason: collision with root package name */
    private C4548e f25553G = null;

    G(Fragment fragment, b0 b0Var, Runnable runnable) {
        this.f25548B = fragment;
        this.f25549C = b0Var;
        this.f25550D = runnable;
    }

    @Override // t3.InterfaceC4549f
    public C4547d B() {
        b();
        return this.f25553G.getSavedStateRegistry();
    }

    void a(AbstractC2106m.a aVar) {
        this.f25552F.i(aVar);
    }

    void b() {
        if (this.f25552F == null) {
            this.f25552F = new C2116x(this);
            C4548e c4548eA = C4548e.a(this);
            this.f25553G = c4548eA;
            c4548eA.c();
            this.f25550D.run();
        }
    }

    boolean d() {
        return this.f25552F != null;
    }

    void e(Bundle bundle) {
        this.f25553G.d(bundle);
    }

    void f(Bundle bundle) {
        this.f25553G.e(bundle);
    }

    void g(AbstractC2106m.b bVar) {
        this.f25552F.n(bVar);
    }

    @Override // android.view.InterfaceC2114v
    public AbstractC2106m getLifecycle() {
        b();
        return this.f25552F;
    }

    @Override // android.view.InterfaceC2104k
    /* renamed from: l */
    public a0.c getDefaultViewModelProviderFactory() {
        Application application;
        a0.c cVarL = this.f25548B.getDefaultViewModelProviderFactory();
        if (!cVarL.equals(this.f25548B.f25503z0)) {
            this.f25551E = cVarL;
            return cVarL;
        }
        if (this.f25551E == null) {
            Context applicationContext = this.f25548B.e2().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.f25548B;
            this.f25551E = new V(application, fragment, fragment.X());
        }
        return this.f25551E;
    }

    @Override // android.view.InterfaceC2104k
    public Q1.a m() {
        Application application;
        Context applicationContext = this.f25548B.e2().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        Q1.d dVar = new Q1.d();
        if (application != null) {
            dVar.c(a0.a.f25931h, application);
        }
        dVar.c(S.f25904a, this.f25548B);
        dVar.c(S.f25905b, this);
        if (this.f25548B.X() != null) {
            dVar.c(S.f25906c, this.f25548B.X());
        }
        return dVar;
    }

    @Override // android.view.c0
    public b0 v() {
        b();
        return this.f25549C;
    }
}
