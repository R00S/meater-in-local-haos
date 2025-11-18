package O3;

import java.util.List;

/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public class b extends g<Integer> {
    public b(List<Y3.a<Integer>> list) {
        super(list);
    }

    public int q() {
        return r(b(), d());
    }

    public int r(Y3.a<Integer> aVar, float f10) {
        Float f11;
        Integer num;
        if (aVar.f19387b == null || aVar.f19388c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Y3.c<A> cVar = this.f13169e;
        return (cVar == 0 || (f11 = aVar.f19393h) == null || (num = (Integer) cVar.b(aVar.f19392g, f11.floatValue(), aVar.f19387b, aVar.f19388c, f10, e(), f())) == null) ? X3.b.c(X3.i.b(f10, 0.0f, 1.0f), aVar.f19387b.intValue(), aVar.f19388c.intValue()) : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // O3.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(Y3.a<Integer> aVar, float f10) {
        return Integer.valueOf(r(aVar, f10));
    }
}
