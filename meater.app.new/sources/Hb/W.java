package Hb;

import java.util.List;

/* loaded from: classes3.dex */
class W implements Ba.l {

    /* renamed from: B, reason: collision with root package name */
    private final y0 f5712B;

    /* renamed from: C, reason: collision with root package name */
    private final List f5713C;

    /* renamed from: D, reason: collision with root package name */
    private final u0 f5714D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f5715E;

    /* renamed from: F, reason: collision with root package name */
    private final Ab.k f5716F;

    public W(y0 y0Var, List list, u0 u0Var, boolean z10, Ab.k kVar) {
        this.f5712B = y0Var;
        this.f5713C = list;
        this.f5714D = u0Var;
        this.f5715E = z10;
        this.f5716F = kVar;
    }

    @Override // Ba.l
    public Object invoke(Object obj) {
        return X.o(this.f5712B, this.f5713C, this.f5714D, this.f5715E, this.f5716F, (Ib.g) obj);
    }
}
