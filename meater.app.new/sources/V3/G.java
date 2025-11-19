package V3;

import W3.c;

/* compiled from: ScaleXYParser.java */
/* loaded from: classes.dex */
public class G implements N<Y3.d> {

    /* renamed from: a, reason: collision with root package name */
    public static final G f18020a = new G();

    private G() {
    }

    @Override // V3.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Y3.d a(W3.c cVar, float f10) {
        boolean z10 = cVar.o() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.b();
        }
        float fJ = (float) cVar.j();
        float fJ2 = (float) cVar.j();
        while (cVar.f()) {
            cVar.t();
        }
        if (z10) {
            cVar.d();
        }
        return new Y3.d((fJ / 100.0f) * f10, (fJ2 / 100.0f) * f10);
    }
}
