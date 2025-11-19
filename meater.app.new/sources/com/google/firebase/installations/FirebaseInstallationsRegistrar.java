package com.google.firebase.installations;

import K8.A;
import K8.q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import h9.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k9.InterfaceC3810e;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3810e lambda$getComponents$0(K8.d dVar) {
        return new c((com.google.firebase.f) dVar.a(com.google.firebase.f.class), dVar.d(i.class), (ExecutorService) dVar.g(A.a(J8.a.class, ExecutorService.class)), L8.i.b((Executor) dVar.g(A.a(J8.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<K8.c<?>> getComponents() {
        return Arrays.asList(K8.c.e(InterfaceC3810e.class).h(LIBRARY_NAME).b(q.l(com.google.firebase.f.class)).b(q.j(i.class)).b(q.k(A.a(J8.a.class, ExecutorService.class))).b(q.k(A.a(J8.b.class, Executor.class))).f(new K8.g() { // from class: k9.f
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(dVar);
            }
        }).d(), h9.h.a(), D9.h.b(LIBRARY_NAME, "18.0.0"));
    }
}
