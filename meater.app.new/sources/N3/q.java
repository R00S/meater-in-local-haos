package N3;

import O3.a;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RoundedCornersContent.java */
/* loaded from: classes.dex */
public class q implements s, a.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.airbnb.lottie.n f12490a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12491b;

    /* renamed from: c, reason: collision with root package name */
    private final O3.a<Float, Float> f12492c;

    /* renamed from: d, reason: collision with root package name */
    private S3.o f12493d;

    public q(com.airbnb.lottie.n nVar, T3.b bVar, S3.n nVar2) {
        this.f12490a = nVar;
        this.f12491b = nVar2.c();
        O3.a<Float, Float> aVarH = nVar2.b().h();
        this.f12492c = aVarH;
        bVar.j(aVarH);
        aVarH.a(this);
    }

    private static int c(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int d(int i10, int i11) {
        return i10 - (c(i10, i11) * i11);
    }

    private S3.o j(S3.o oVar) {
        List<Q3.a> listA = oVar.a();
        boolean zD = oVar.d();
        int size = listA.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            Q3.a aVar = listA.get(size);
            Q3.a aVar2 = listA.get(d(size - 1, listA.size()));
            PointF pointFC = (size != 0 || zD) ? aVar2.c() : oVar.b();
            i10 = (((size != 0 || zD) ? aVar2.b() : pointFC).equals(pointFC) && aVar.a().equals(pointFC) && !(!oVar.d() && (size == 0 || size == listA.size() - 1))) ? i10 + 2 : i10 + 1;
            size--;
        }
        S3.o oVar2 = this.f12493d;
        if (oVar2 == null || oVar2.a().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new Q3.a());
            }
            this.f12493d = new S3.o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f12493d.e(zD);
        return this.f12493d;
    }

    @Override // O3.a.b
    public void a() {
        this.f12490a.invalidateSelf();
    }

    public O3.a<Float, Float> f() {
        return this.f12492c;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    @Override // N3.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public S3.o i(S3.o r19) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.q.i(S3.o):S3.o");
    }

    @Override // N3.c
    public void b(List<c> list, List<c> list2) {
    }
}
