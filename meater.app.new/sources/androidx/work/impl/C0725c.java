package androidx.work.impl;

import androidx.lifecycle.C0521q;
import androidx.work.InterfaceC0810q;
import androidx.work.impl.utils.p017o.C0798c;

/* compiled from: OperationImpl.java */
/* renamed from: androidx.work.impl.c */
/* loaded from: classes.dex */
public class C0725c implements InterfaceC0810q {

    /* renamed from: c */
    private final C0521q<InterfaceC0810q.b> f4595c = new C0521q<>();

    /* renamed from: d */
    private final C0798c<InterfaceC0810q.b.c> f4596d = C0798c.m5203u();

    public C0725c() {
        m4927a(InterfaceC0810q.f4984b);
    }

    /* renamed from: a */
    public void m4927a(InterfaceC0810q.b bVar) {
        this.f4595c.mo3820l(bVar);
        if (bVar instanceof InterfaceC0810q.b.c) {
            this.f4596d.mo5193q((InterfaceC0810q.b.c) bVar);
        } else if (bVar instanceof InterfaceC0810q.b.a) {
            this.f4596d.mo5194r(((InterfaceC0810q.b.a) bVar).m5234a());
        }
    }
}
