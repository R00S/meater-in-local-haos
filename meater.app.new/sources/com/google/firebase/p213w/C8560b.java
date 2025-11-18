package com.google.firebase.p213w;

import com.google.firebase.components.C8124n;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8126p;
import com.google.firebase.components.InterfaceC8128r;
import com.google.firebase.components.InterfaceC8129s;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ComponentMonitor.java */
/* renamed from: com.google.firebase.w.b */
/* loaded from: classes2.dex */
public class C8560b implements InterfaceC8129s {
    /* renamed from: b */
    static /* synthetic */ Object m26907b(String str, C8124n c8124n, InterfaceC8126p interfaceC8126p) {
        try {
            C8561c.m26909b(str);
            return c8124n.m24994f().mo24937a(interfaceC8126p);
        } finally {
            C8561c.m26908a();
        }
    }

    @Override // com.google.firebase.components.InterfaceC8129s
    /* renamed from: a */
    public List<C8124n<?>> mo24983a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C8124n<?> c8124nM25001r : componentRegistrar.getComponents()) {
            final String strM24995g = c8124nM25001r.m24995g();
            if (strM24995g != null) {
                c8124nM25001r = c8124nM25001r.m25001r(new InterfaceC8128r() { // from class: com.google.firebase.w.a
                    @Override // com.google.firebase.components.InterfaceC8128r
                    /* renamed from: a */
                    public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                        return C8560b.m26907b(strM24995g, c8124nM25001r, interfaceC8126p);
                    }
                });
            }
            arrayList.add(c8124nM25001r);
        }
        return arrayList;
    }
}
