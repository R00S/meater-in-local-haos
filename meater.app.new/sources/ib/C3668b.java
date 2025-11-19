package ib;

/* renamed from: ib.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3668b implements Ba.l {

    /* renamed from: B, reason: collision with root package name */
    private final j0 f43228B;

    /* renamed from: C, reason: collision with root package name */
    private final C3674h[] f43229C;

    public C3668b(j0 j0Var, C3674h[] c3674hArr) {
        this.f43228B = j0Var;
        this.f43229C = c3674hArr;
    }

    @Override // Ba.l
    public Object invoke(Object obj) {
        return AbstractC3670d.e(this.f43228B, this.f43229C, ((Number) obj).intValue());
    }
}
