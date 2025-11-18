package ib;

import ib.AbstractC3670d;

/* renamed from: ib.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3667a implements Ba.l {

    /* renamed from: B, reason: collision with root package name */
    private final AbstractC3670d f43225B;

    /* renamed from: C, reason: collision with root package name */
    private final AbstractC3670d.a f43226C;

    public C3667a(AbstractC3670d abstractC3670d, AbstractC3670d.a aVar) {
        this.f43225B = abstractC3670d;
        this.f43226C = aVar;
    }

    @Override // Ba.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(AbstractC3670d.i(this.f43225B, this.f43226C, obj));
    }
}
