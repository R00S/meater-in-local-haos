package com.google.firebase.crashlytics;

import D9.h;
import J8.b;
import J8.c;
import J9.b;
import K8.A;
import K8.d;
import K8.q;
import N8.g;
import R8.f;
import android.content.res.Resources;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import k9.InterfaceC3810e;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    private final A<ExecutorService> f38150a = A.a(J8.a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    private final A<ExecutorService> f38151b = A.a(b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    private final A<ExecutorService> f38152c = A.a(c.class, ExecutorService.class);

    static {
        J9.a.a(b.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a b(d dVar) throws Resources.NotFoundException {
        f.f(false);
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVarC = a.c((com.google.firebase.f) dVar.a(com.google.firebase.f.class), (InterfaceC3810e) dVar.a(InterfaceC3810e.class), dVar.i(N8.a.class), dVar.i(I8.a.class), dVar.i(G9.a.class), (ExecutorService) dVar.g(this.f38150a), (ExecutorService) dVar.g(this.f38151b), (ExecutorService) dVar.g(this.f38152c));
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            g.f().b("Initializing Crashlytics blocked main for " + jCurrentTimeMillis2 + " ms");
        }
        return aVarC;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<K8.c<?>> getComponents() {
        return Arrays.asList(K8.c.e(a.class).h("fire-cls").b(q.l(com.google.firebase.f.class)).b(q.l(InterfaceC3810e.class)).b(q.k(this.f38150a)).b(q.k(this.f38151b)).b(q.k(this.f38152c)).b(q.a(N8.a.class)).b(q.a(I8.a.class)).b(q.a(G9.a.class)).f(new K8.g() { // from class: M8.f
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return this.f12131a.b(dVar);
            }
        }).e().d(), h.b("fire-cls", "19.4.0"));
    }
}
