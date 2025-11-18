package Ra;

/* loaded from: classes3.dex */
class Q implements Ba.l {

    /* renamed from: B, reason: collision with root package name */
    private final qb.c f15127B;

    public Q(qb.c cVar) {
        this.f15127B = cVar;
    }

    @Override // Ba.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(S.g(this.f15127B, (qb.c) obj));
    }
}
