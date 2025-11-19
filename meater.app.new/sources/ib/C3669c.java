package ib;

import ib.AbstractC3670d;

/* renamed from: ib.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3669c implements Ba.l {

    /* renamed from: B, reason: collision with root package name */
    private final AbstractC3670d f43231B;

    /* renamed from: C, reason: collision with root package name */
    private final Lb.o f43232C;

    public C3669c(AbstractC3670d abstractC3670d, Lb.o oVar) {
        this.f43231B = abstractC3670d;
        this.f43232C = oVar;
    }

    @Override // Ba.l
    public Object invoke(Object obj) {
        return AbstractC3670d.I(this.f43231B, this.f43232C, (AbstractC3670d.a) obj);
    }
}
