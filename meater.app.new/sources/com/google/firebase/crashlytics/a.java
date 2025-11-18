package com.google.firebase.crashlytics;

import N8.d;
import N8.g;
import N8.l;
import Q8.A;
import Q8.C1614b;
import Q8.C1619g;
import Q8.C1622j;
import Q8.C1626n;
import Q8.G;
import Q8.L;
import V8.b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.firebase.f;
import j9.InterfaceC3754a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import k9.InterfaceC3810e;
import z7.InterfaceC5204f;

/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final A f38153a;

    private a(A a10) {
        this.f38153a = a10;
    }

    public static a b() {
        a aVar = (a) f.l().j(a.class);
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    static a c(f fVar, InterfaceC3810e interfaceC3810e, InterfaceC3754a<N8.a> interfaceC3754a, InterfaceC3754a<I8.a> interfaceC3754a2, InterfaceC3754a<G9.a> interfaceC3754a3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) throws Resources.NotFoundException {
        Context contextK = fVar.k();
        String packageName = contextK.getPackageName();
        g.f().g("Initializing Firebase Crashlytics " + A.m() + " for " + packageName);
        R8.f fVar2 = new R8.f(executorService, executorService2);
        W8.g gVar = new W8.g(contextK);
        G g10 = new G(fVar);
        L l10 = new L(contextK, packageName, interfaceC3810e, g10);
        d dVar = new d(interfaceC3754a);
        M8.d dVar2 = new M8.d(interfaceC3754a2);
        C1626n c1626n = new C1626n(g10, gVar);
        J9.a.e(c1626n);
        A a10 = new A(fVar, l10, dVar, g10, dVar2.e(), dVar2.d(), gVar, c1626n, new l(interfaceC3754a3), fVar2);
        String strC = fVar.n().c();
        String strM = C1622j.m(contextK);
        List<C1619g> listJ = C1622j.j(contextK);
        g.f().b("Mapping file ID is: " + strM);
        for (C1619g c1619g : listJ) {
            g.f().b(String.format("Build id for %s on %s: %s", c1619g.c(), c1619g.a(), c1619g.b()));
        }
        try {
            C1614b c1614bA = C1614b.a(contextK, l10, strC, strM, listJ, new N8.f(contextK));
            g.f().i("Installer package name is: " + c1614bA.f14424d);
            Y8.g gVarL = Y8.g.l(contextK, strC, l10, new b(), c1614bA.f14426f, c1614bA.f14427g, gVar, g10);
            gVarL.o(fVar2).d(executorService3, new InterfaceC5204f() { // from class: M8.g
                @Override // z7.InterfaceC5204f
                public final void d(Exception exc) {
                    com.google.firebase.crashlytics.a.d(exc);
                }
            });
            if (a10.z(c1614bA, gVarL)) {
                a10.k(gVarL);
            }
            return new a(a10);
        } catch (PackageManager.NameNotFoundException e10) {
            g.f().e("Error retrieving app package info.", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Exception exc) {
        g.f().e("Error fetching settings.", exc);
    }

    public void e(Throwable th) {
        if (th == null) {
            g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f38153a.w(th, Collections.emptyMap());
        }
    }

    public void f(boolean z10) {
        this.f38153a.A(Boolean.valueOf(z10));
    }

    public void g(String str) {
        this.f38153a.B(str);
    }
}
