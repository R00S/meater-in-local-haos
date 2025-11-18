package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.C8405j;
import com.google.firebase.components.C8111b0;
import com.google.firebase.components.C8124n;
import com.google.firebase.components.C8132v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8126p;
import com.google.firebase.components.InterfaceC8128r;
import com.google.firebase.concurrent.C8162y;
import com.google.firebase.p200o.p201a.InterfaceC8474a;
import com.google.firebase.p200o.p201a.InterfaceC8475b;
import com.google.firebase.p204r.C8490h;
import com.google.firebase.p204r.InterfaceC8491i;
import com.google.firebase.p209u.C8555h;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    static /* synthetic */ InterfaceC8385i lambda$getComponents$0(InterfaceC8126p interfaceC8126p) {
        return new C8384h((C8405j) interfaceC8126p.mo24973a(C8405j.class), interfaceC8126p.mo24975c(InterfaceC8491i.class), (ExecutorService) interfaceC8126p.mo24978f(C8111b0.m24971a(InterfaceC8474a.class, ExecutorService.class)), C8162y.m25126a((Executor) interfaceC8126p.mo24978f(C8111b0.m24971a(InterfaceC8475b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8124n<?>> getComponents() {
        return Arrays.asList(C8124n.m24986c(InterfaceC8385i.class).m25011h(LIBRARY_NAME).m25006b(C8132v.m25060k(C8405j.class)).m25006b(C8132v.m25058i(InterfaceC8491i.class)).m25006b(C8132v.m25059j(C8111b0.m24971a(InterfaceC8474a.class, ExecutorService.class))).m25006b(C8132v.m25059j(C8111b0.m24971a(InterfaceC8475b.class, Executor.class))).m25010f(new InterfaceC8128r() { // from class: com.google.firebase.installations.e
            @Override // com.google.firebase.components.InterfaceC8128r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC8126p);
            }
        }).m25008d(), C8490h.m26692a(), C8555h.m26903a(LIBRARY_NAME, "17.2.0"));
    }
}
