package com.google.firebase.remoteconfig;

import D9.h;
import K8.A;
import K8.d;
import K8.g;
import K8.q;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import k9.InterfaceC3810e;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$getComponents$0(A a10, d dVar) {
        return new c((Context) dVar.a(Context.class), (ScheduledExecutorService) dVar.g(a10), (f) dVar.a(f.class), (InterfaceC3810e) dVar.a(InterfaceC3810e.class), ((com.google.firebase.abt.component.a) dVar.a(com.google.firebase.abt.component.a.class)).b("frc"), dVar.d(I8.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<K8.c<?>> getComponents() {
        final A a10 = A.a(J8.b.class, ScheduledExecutorService.class);
        return Arrays.asList(K8.c.f(c.class, G9.a.class).h(LIBRARY_NAME).b(q.l(Context.class)).b(q.k(a10)).b(q.l(f.class)).b(q.l(InterfaceC3810e.class)).b(q.l(com.google.firebase.abt.component.a.class)).b(q.j(I8.a.class)).f(new g() { // from class: E9.m
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return RemoteConfigRegistrar.lambda$getComponents$0(a10, dVar);
            }
        }).e().d(), h.b(LIBRARY_NAME, "22.1.0"));
    }
}
