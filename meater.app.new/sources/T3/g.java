package T3;

import S3.q;
import V3.C1796j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.n;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeLayer.java */
/* loaded from: classes.dex */
public class g extends b {

    /* renamed from: D, reason: collision with root package name */
    private final N3.d f15957D;

    /* renamed from: E, reason: collision with root package name */
    private final c f15958E;

    g(n nVar, e eVar, c cVar, L3.i iVar) {
        super(nVar, eVar);
        this.f15958E = cVar;
        N3.d dVar = new N3.d(nVar, this, new q("__container", eVar.o(), false), iVar);
        this.f15957D = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // T3.b
    protected void J(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2) {
        this.f15957D.d(eVar, i10, list, eVar2);
    }

    @Override // T3.b, N3.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        this.f15957D.e(rectF, this.f15889o, z10);
    }

    @Override // T3.b
    void u(Canvas canvas, Matrix matrix, int i10) {
        this.f15957D.g(canvas, matrix, i10);
    }

    @Override // T3.b
    public S3.a x() {
        S3.a aVarX = super.x();
        return aVarX != null ? aVarX : this.f15958E.x();
    }

    @Override // T3.b
    public C1796j z() {
        C1796j c1796jZ = super.z();
        return c1796jZ != null ? c1796jZ : this.f15958E.z();
    }
}
