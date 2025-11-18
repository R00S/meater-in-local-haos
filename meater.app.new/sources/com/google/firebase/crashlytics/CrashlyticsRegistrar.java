package com.google.firebase.crashlytics;

import com.google.firebase.C8405j;
import com.google.firebase.analytics.p179a.InterfaceC8095a;
import com.google.firebase.components.C8124n;
import com.google.firebase.components.C8132v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8126p;
import com.google.firebase.components.InterfaceC8128r;
import com.google.firebase.crashlytics.internal.InterfaceC8175d;
import com.google.firebase.installations.InterfaceC8385i;
import com.google.firebase.p209u.C8555h;
import com.google.firebase.p210v.p211a.InterfaceC8557a;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        FirebaseSessionsDependencies.m26789a(SessionSubscriber.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C8171g m25133a(InterfaceC8126p interfaceC8126p) {
        return C8171g.m25151a((C8405j) interfaceC8126p.mo24973a(C8405j.class), (InterfaceC8385i) interfaceC8126p.mo24973a(InterfaceC8385i.class), interfaceC8126p.mo24981i(InterfaceC8175d.class), interfaceC8126p.mo24981i(InterfaceC8095a.class), interfaceC8126p.mo24981i(InterfaceC8557a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8124n<?>> getComponents() {
        return Arrays.asList(C8124n.m24986c(C8171g.class).m25011h("fire-cls").m25006b(C8132v.m25060k(C8405j.class)).m25006b(C8132v.m25060k(InterfaceC8385i.class)).m25006b(C8132v.m25055a(InterfaceC8175d.class)).m25006b(C8132v.m25055a(InterfaceC8095a.class)).m25006b(C8132v.m25055a(InterfaceC8557a.class)).m25010f(new InterfaceC8128r() { // from class: com.google.firebase.crashlytics.d
            @Override // com.google.firebase.components.InterfaceC8128r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                return this.f30834a.m25133a(interfaceC8126p);
            }
        }).m25009e().m25008d(), C8555h.m26903a("fire-cls", "18.6.1"));
    }
}
