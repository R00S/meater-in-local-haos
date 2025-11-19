package com.google.firebase.datatransport;

import D9.h;
import K6.j;
import K8.A;
import K8.c;
import K8.d;
import K8.g;
import K8.q;
import M6.u;
import a9.InterfaceC1912a;
import a9.InterfaceC1913b;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$0(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().g(a.f33392h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$1(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().g(a.f33392h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$2(d dVar) {
        u.f((Context) dVar.a(Context.class));
        return u.c().g(a.f33391g);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.e(j.class).h(LIBRARY_NAME).b(q.l(Context.class)).f(new g() { // from class: a9.c
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return TransportRegistrar.lambda$getComponents$0(dVar);
            }
        }).d(), c.c(A.a(InterfaceC1912a.class, j.class)).b(q.l(Context.class)).f(new g() { // from class: a9.d
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return TransportRegistrar.lambda$getComponents$1(dVar);
            }
        }).d(), c.c(A.a(InterfaceC1913b.class, j.class)).b(q.l(Context.class)).f(new g() { // from class: a9.e
            @Override // K8.g
            public final Object a(K8.d dVar) {
                return TransportRegistrar.lambda$getComponents$2(dVar);
            }
        }).d(), h.b(LIBRARY_NAME, "19.0.0"));
    }
}
