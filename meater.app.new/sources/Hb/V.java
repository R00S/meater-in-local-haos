package Hb;

import java.util.List;

/* loaded from: classes3.dex */
class V implements Ba.l {

    /* renamed from: B, reason: collision with root package name */
    private final y0 f5708B;

    /* renamed from: C, reason: collision with root package name */
    private final List f5709C;

    /* renamed from: D, reason: collision with root package name */
    private final u0 f5710D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean f5711E;

    public V(y0 y0Var, List list, u0 u0Var, boolean z10) {
        this.f5708B = y0Var;
        this.f5709C = list;
        this.f5710D = u0Var;
        this.f5711E = z10;
    }

    @Override // Ba.l
    public Object invoke(Object obj) {
        return X.l(this.f5708B, this.f5709C, this.f5710D, this.f5711E, (Ib.g) obj);
    }
}
