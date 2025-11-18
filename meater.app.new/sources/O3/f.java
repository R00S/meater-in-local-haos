package O3;

import java.util.List;

/* compiled from: IntegerKeyframeAnimation.java */
/* loaded from: classes.dex */
public class f extends g<Integer> {
    public f(List<Y3.a<Integer>> list) {
        super(list);
    }

    public int q() {
        return r(b(), d());
    }

    int r(Y3.a<Integer> aVar, float f10) {
        Integer num;
        if (aVar.f19387b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int iH = aVar.f19388c == null ? aVar.h() : aVar.e();
        Y3.c<A> cVar = this.f13169e;
        return (cVar == 0 || (num = (Integer) cVar.b(aVar.f19392g, aVar.f19393h.floatValue(), aVar.f19387b, Integer.valueOf(iH), f10, e(), f())) == null) ? X3.i.j(aVar.h(), iH, f10) : num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // O3.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(Y3.a<Integer> aVar, float f10) {
        return Integer.valueOf(r(aVar, f10));
    }
}
