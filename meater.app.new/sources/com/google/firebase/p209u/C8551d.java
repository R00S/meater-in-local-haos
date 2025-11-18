package com.google.firebase.p209u;

import com.google.firebase.components.C8124n;
import com.google.firebase.components.C8132v;
import com.google.firebase.components.InterfaceC8126p;
import com.google.firebase.components.InterfaceC8128r;
import java.util.Iterator;
import java.util.Set;

/* compiled from: DefaultUserAgentPublisher.java */
/* renamed from: com.google.firebase.u.d */
/* loaded from: classes2.dex */
public class C8551d implements InterfaceC8556i {

    /* renamed from: a */
    private final String f32407a;

    /* renamed from: b */
    private final C8552e f32408b;

    C8551d(Set<AbstractC8554g> set, C8552e c8552e) {
        this.f32407a = m26897d(set);
        this.f32408b = c8552e;
    }

    /* renamed from: b */
    public static C8124n<InterfaceC8556i> m26895b() {
        return C8124n.m24986c(InterfaceC8556i.class).m25006b(C8132v.m25063n(AbstractC8554g.class)).m25010f(new InterfaceC8128r() { // from class: com.google.firebase.u.a
            @Override // com.google.firebase.components.InterfaceC8128r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8126p interfaceC8126p) {
                return C8551d.m26896c(interfaceC8126p);
            }
        }).m25008d();
    }

    /* renamed from: c */
    static /* synthetic */ InterfaceC8556i m26896c(InterfaceC8126p interfaceC8126p) {
        return new C8551d(interfaceC8126p.mo24979g(AbstractC8554g.class), C8552e.m26899a());
    }

    /* renamed from: d */
    private static String m26897d(Set<AbstractC8554g> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<AbstractC8554g> it = set.iterator();
        while (it.hasNext()) {
            AbstractC8554g next = it.next();
            sb.append(next.mo26893b());
            sb.append('/');
            sb.append(next.mo26894c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.p209u.InterfaceC8556i
    /* renamed from: a */
    public String mo26898a() {
        if (this.f32408b.m26900b().isEmpty()) {
            return this.f32407a;
        }
        return this.f32407a + ' ' + m26897d(this.f32408b.m26900b());
    }
}
