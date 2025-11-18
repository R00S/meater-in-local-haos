package O3;

import N3.s;
import android.graphics.Path;
import java.util.List;

/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes.dex */
public class m extends a<S3.o, Path> {

    /* renamed from: i, reason: collision with root package name */
    private final S3.o f13201i;

    /* renamed from: j, reason: collision with root package name */
    private final Path f13202j;

    /* renamed from: k, reason: collision with root package name */
    private Path f13203k;

    /* renamed from: l, reason: collision with root package name */
    private Path f13204l;

    /* renamed from: m, reason: collision with root package name */
    private List<s> f13205m;

    public m(List<Y3.a<S3.o>> list) {
        super(list);
        this.f13201i = new S3.o();
        this.f13202j = new Path();
    }

    @Override // O3.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Path i(Y3.a<S3.o> aVar, float f10) {
        S3.o oVar = aVar.f19387b;
        S3.o oVar2 = aVar.f19388c;
        this.f13201i.c(oVar, oVar2 == null ? oVar : oVar2, f10);
        S3.o oVarI = this.f13201i;
        List<s> list = this.f13205m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVarI = this.f13205m.get(size).i(oVarI);
            }
        }
        X3.i.h(oVarI, this.f13202j);
        if (this.f13169e == null) {
            return this.f13202j;
        }
        if (this.f13203k == null) {
            this.f13203k = new Path();
            this.f13204l = new Path();
        }
        X3.i.h(oVar, this.f13203k);
        if (oVar2 != null) {
            X3.i.h(oVar2, this.f13204l);
        }
        Y3.c<A> cVar = this.f13169e;
        float f11 = aVar.f19392g;
        float fFloatValue = aVar.f19393h.floatValue();
        Path path = this.f13203k;
        return (Path) cVar.b(f11, fFloatValue, path, oVar2 == null ? path : this.f13204l, f10, e(), f());
    }

    public void r(List<s> list) {
        this.f13205m = list;
    }
}
