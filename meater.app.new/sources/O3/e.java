package O3;

import java.util.List;

/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public class e extends g<S3.d> {

    /* renamed from: i, reason: collision with root package name */
    private final S3.d f13188i;

    public e(List<Y3.a<S3.d>> list) {
        super(list);
        int iMax = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            S3.d dVar = list.get(i10).f19387b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f13188i = new S3.d(new float[iMax], new int[iMax]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // O3.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public S3.d i(Y3.a<S3.d> aVar, float f10) {
        this.f13188i.g(aVar.f19387b, aVar.f19388c, f10);
        return this.f13188i;
    }
}
