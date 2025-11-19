package O3;

import java.util.List;

/* compiled from: TextKeyframeAnimation.java */
/* loaded from: classes.dex */
public class o extends g<Q3.b> {

    /* compiled from: TextKeyframeAnimation.java */
    class a extends Y3.c<Q3.b> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y3.b f13212d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Y3.c f13213e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Q3.b f13214f;

        a(Y3.b bVar, Y3.c cVar, Q3.b bVar2) {
            this.f13212d = bVar;
            this.f13213e = cVar;
            this.f13214f = bVar2;
        }

        @Override // Y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Q3.b a(Y3.b<Q3.b> bVar) {
            this.f13212d.h(bVar.f(), bVar.a(), bVar.g().f14285a, bVar.b().f14285a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f13213e.a(this.f13212d);
            Q3.b bVarB = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f13214f.a(str, bVarB.f14286b, bVarB.f14287c, bVarB.f14288d, bVarB.f14289e, bVarB.f14290f, bVarB.f14291g, bVarB.f14292h, bVarB.f14293i, bVarB.f14294j, bVarB.f14295k, bVarB.f14296l, bVarB.f14297m);
            return this.f13214f;
        }
    }

    public o(List<Y3.a<Q3.b>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // O3.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Q3.b i(Y3.a<Q3.b> aVar, float f10) {
        Q3.b bVar;
        Y3.c<A> cVar = this.f13169e;
        if (cVar == 0) {
            return (f10 != 1.0f || (bVar = aVar.f19388c) == null) ? aVar.f19387b : bVar;
        }
        float f11 = aVar.f19392g;
        Float f12 = aVar.f19393h;
        float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        Q3.b bVar2 = aVar.f19387b;
        Q3.b bVar3 = bVar2;
        Q3.b bVar4 = aVar.f19388c;
        return (Q3.b) cVar.b(f11, fFloatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f10, d(), f());
    }

    public void r(Y3.c<String> cVar) {
        super.o(new a(new Y3.b(), cVar, new Q3.b()));
    }
}
