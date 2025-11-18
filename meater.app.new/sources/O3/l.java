package O3;

import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* loaded from: classes.dex */
public class l extends g<Y3.d> {

    /* renamed from: i, reason: collision with root package name */
    private final Y3.d f13200i;

    public l(List<Y3.a<Y3.d>> list) {
        super(list);
        this.f13200i = new Y3.d();
    }

    @Override // O3.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Y3.d i(Y3.a<Y3.d> aVar, float f10) {
        Y3.d dVar;
        Y3.d dVar2;
        Y3.d dVar3 = aVar.f19387b;
        if (dVar3 == null || (dVar = aVar.f19388c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Y3.d dVar4 = dVar3;
        Y3.d dVar5 = dVar;
        Y3.c<A> cVar = this.f13169e;
        if (cVar != 0 && (dVar2 = (Y3.d) cVar.b(aVar.f19392g, aVar.f19393h.floatValue(), dVar4, dVar5, f10, e(), f())) != null) {
            return dVar2;
        }
        this.f13200i.d(X3.i.i(dVar4.b(), dVar5.b(), f10), X3.i.i(dVar4.c(), dVar5.c(), f10));
        return this.f13200i;
    }
}
