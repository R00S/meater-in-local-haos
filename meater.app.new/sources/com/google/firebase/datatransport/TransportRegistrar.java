package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.C6239c;
import com.google.firebase.components.C8124n;
import com.google.firebase.components.C8132v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8126p;
import com.google.firebase.components.InterfaceC8128r;
import com.google.firebase.p209u.C8555h;
import java.util.Arrays;
import java.util.List;
import p241e.p254e.p256b.p257a.InterfaceC8790g;
import p241e.p254e.p256b.p257a.p258i.C8878u;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    static /* synthetic */ InterfaceC8790g lambda$getComponents$0(InterfaceC8126p interfaceC8126p) {
        C8878u.m28178f((Context) interfaceC8126p.mo24973a(Context.class));
        return C8878u.m28176c().m28180g(C6239c.f16584f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8124n<?>> getComponents() {
        return Arrays.asList(C8124n.m24986c(InterfaceC8790g.class).m25011h(LIBRARY_NAME).m25006b(C8132v.m25060k(Context.class)).m25010f(new InterfaceC8128r() { // from class: com.google.firebase.datatransport.a
            @Override // com.google.firebase.components.InterfaceC8128r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                return TransportRegistrar.lambda$getComponents$0(interfaceC8126p);
            }
        }).m25008d(), C8555h.m26903a(LIBRARY_NAME, "18.1.8"));
    }
}
