package V3;

import W3.c;
import android.graphics.PointF;

/* compiled from: PointFParser.java */
/* loaded from: classes.dex */
public class B implements N<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final B f18015a = new B();

    private B() {
    }

    @Override // V3.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(W3.c cVar, float f10) {
        c.b bVarO = cVar.o();
        if (bVarO == c.b.BEGIN_ARRAY) {
            return s.e(cVar, f10);
        }
        if (bVarO == c.b.BEGIN_OBJECT) {
            return s.e(cVar, f10);
        }
        if (bVarO == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.j()) * f10, ((float) cVar.j()) * f10);
            while (cVar.f()) {
                cVar.t();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarO);
    }
}
