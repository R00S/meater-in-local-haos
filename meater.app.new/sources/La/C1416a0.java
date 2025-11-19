package La;

import java.util.Comparator;

/* renamed from: La.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C1416a0 implements Comparator {

    /* renamed from: B, reason: collision with root package name */
    private final Ba.p f11177B;

    public C1416a0(Ba.p pVar) {
        this.f11177B = pVar;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return AbstractC1422d0.F(this.f11177B, obj, obj2);
    }
}
