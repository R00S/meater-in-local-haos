package O3;

import java.util.List;

/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes.dex */
public class d extends g<Float> {
    public d(List<Y3.a<Float>> list) {
        super(list);
    }

    public float q() {
        return r(b(), d());
    }

    float r(Y3.a<Float> aVar, float f10) {
        Float f11;
        if (aVar.f19387b == null || aVar.f19388c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Y3.c<A> cVar = this.f13169e;
        return (cVar == 0 || (f11 = (Float) cVar.b(aVar.f19392g, aVar.f19393h.floatValue(), aVar.f19387b, aVar.f19388c, f10, e(), f())) == null) ? X3.i.i(aVar.g(), aVar.d(), f10) : f11.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // O3.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Float i(Y3.a<Float> aVar, float f10) {
        return Float.valueOf(r(aVar, f10));
    }
}
