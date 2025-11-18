package com.google.firebase.perf;

import D9.h;
import K6.j;
import K8.A;
import K8.d;
import K8.g;
import K8.q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import com.google.firebase.n;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import k9.InterfaceC3810e;
import s9.C4519b;
import s9.e;
import t9.C4584a;
import u9.C4687a;

@Keep
/* loaded from: classes2.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C4519b lambda$getComponents$0(A a10, d dVar) {
        return new C4519b((f) dVar.a(f.class), (n) dVar.d(n.class).get(), (Executor) dVar.g(a10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e providesFirebasePerformance(d dVar) {
        dVar.a(C4519b.class);
        return C4584a.a().b(new C4687a((f) dVar.a(f.class), (InterfaceC3810e) dVar.a(InterfaceC3810e.class), dVar.d(c.class), dVar.d(j.class))).a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<K8.c<?>> getComponents() {
        final A a10 = A.a(J8.d.class, Executor.class);
        return Arrays.asList(K8.c.e(e.class).h(LIBRARY_NAME).b(q.l(f.class)).b(q.n(c.class)).b(q.l(InterfaceC3810e.class)).b(q.n(j.class)).b(q.l(C4519b.class)).f(new g() { // from class: s9.c
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return FirebasePerfRegistrar.providesFirebasePerformance(dVar);
            }
        }).d(), K8.c.e(C4519b.class).h(EARLY_LIBRARY_NAME).b(q.l(f.class)).b(q.j(n.class)).b(q.k(a10)).e().f(new g() { // from class: s9.d
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return FirebasePerfRegistrar.lambda$getComponents$0(a10, dVar);
            }
        }).d(), h.b(LIBRARY_NAME, "21.0.4"));
    }
}
