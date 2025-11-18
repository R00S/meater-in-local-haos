package com.airbnb.lottie.p108q.p109a;

import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p112s.p114j.C5267q;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* renamed from: com.airbnb.lottie.q.a.r */
/* loaded from: classes.dex */
public class C5210r implements InterfaceC5194b, AbstractC5211a.a {

    /* renamed from: a */
    private final String f12601a;

    /* renamed from: b */
    private final List<AbstractC5211a.a> f12602b = new ArrayList();

    /* renamed from: c */
    private final C5267q.a f12603c;

    /* renamed from: d */
    private final AbstractC5211a<?, Float> f12604d;

    /* renamed from: e */
    private final AbstractC5211a<?, Float> f12605e;

    /* renamed from: f */
    private final AbstractC5211a<?, Float> f12606f;

    public C5210r(AbstractC5268a abstractC5268a, C5267q c5267q) {
        this.f12601a = c5267q.m9704c();
        this.f12603c = c5267q.m9707f();
        AbstractC5211a<Float, Float> abstractC5211aMo9617a = c5267q.m9706e().mo9617a();
        this.f12604d = abstractC5211aMo9617a;
        AbstractC5211a<Float, Float> abstractC5211aMo9617a2 = c5267q.m9703b().mo9617a();
        this.f12605e = abstractC5211aMo9617a2;
        AbstractC5211a<Float, Float> abstractC5211aMo9617a3 = c5267q.m9705d().mo9617a();
        this.f12606f = abstractC5211aMo9617a3;
        abstractC5268a.m9723i(abstractC5211aMo9617a);
        abstractC5268a.m9723i(abstractC5211aMo9617a2);
        abstractC5268a.m9723i(abstractC5211aMo9617a3);
        abstractC5211aMo9617a.m9548a(this);
        abstractC5211aMo9617a2.m9548a(this);
        abstractC5211aMo9617a3.m9548a(this);
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a.a
    /* renamed from: a */
    public void mo9512a() {
        for (int i2 = 0; i2 < this.f12602b.size(); i2++) {
            this.f12602b.get(i2).mo9512a();
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5194b> list, List<InterfaceC5194b> list2) {
    }

    /* renamed from: c */
    void m9540c(AbstractC5211a.a aVar) {
        this.f12602b.add(aVar);
    }

    /* renamed from: e */
    public AbstractC5211a<?, Float> m9541e() {
        return this.f12605e;
    }

    /* renamed from: h */
    public AbstractC5211a<?, Float> m9542h() {
        return this.f12606f;
    }

    /* renamed from: i */
    public AbstractC5211a<?, Float> m9543i() {
        return this.f12604d;
    }

    /* renamed from: j */
    C5267q.a m9544j() {
        return this.f12603c;
    }
}
