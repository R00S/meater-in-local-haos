package com.google.firebase.messaging;

import a9.InterfaceC1913b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import i9.InterfaceC3635a;
import java.util.Arrays;
import java.util.List;
import k9.InterfaceC3810e;

@Keep
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(K8.A a10, K8.d dVar) {
        return new FirebaseMessaging((com.google.firebase.f) dVar.a(com.google.firebase.f.class), (InterfaceC3635a) dVar.a(InterfaceC3635a.class), dVar.d(D9.i.class), dVar.d(h9.j.class), (InterfaceC3810e) dVar.a(InterfaceC3810e.class), dVar.f(a10), (g9.d) dVar.a(g9.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<K8.c<?>> getComponents() {
        final K8.A a10 = K8.A.a(InterfaceC1913b.class, K6.j.class);
        return Arrays.asList(K8.c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(K8.q.l(com.google.firebase.f.class)).b(K8.q.h(InterfaceC3635a.class)).b(K8.q.j(D9.i.class)).b(K8.q.j(h9.j.class)).b(K8.q.l(InterfaceC3810e.class)).b(K8.q.i(a10)).b(K8.q.l(g9.d.class)).f(new K8.g() { // from class: com.google.firebase.messaging.z
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(a10, dVar);
            }
        }).c().d(), D9.h.b(LIBRARY_NAME, "24.1.0"));
    }
}
