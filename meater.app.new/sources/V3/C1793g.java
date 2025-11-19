package V3;

import W3.c;
import android.graphics.Color;

/* compiled from: ColorParser.java */
/* renamed from: V3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1793g implements N<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1793g f18037a = new C1793g();

    private C1793g() {
    }

    @Override // V3.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(W3.c cVar, float f10) {
        boolean z10 = cVar.o() == c.b.BEGIN_ARRAY;
        if (z10) {
            cVar.b();
        }
        double dJ = cVar.j();
        double dJ2 = cVar.j();
        double dJ3 = cVar.j();
        double dJ4 = cVar.o() == c.b.NUMBER ? cVar.j() : 1.0d;
        if (z10) {
            cVar.d();
        }
        if (dJ <= 1.0d && dJ2 <= 1.0d && dJ3 <= 1.0d) {
            dJ *= 255.0d;
            dJ2 *= 255.0d;
            dJ3 *= 255.0d;
            if (dJ4 <= 1.0d) {
                dJ4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dJ4, (int) dJ, (int) dJ2, (int) dJ3));
    }
}
