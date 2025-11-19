package V3;

import W3.c;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeDataParser.java */
/* loaded from: classes.dex */
public class H implements N<S3.o> {

    /* renamed from: a, reason: collision with root package name */
    public static final H f18021a = new H();

    /* renamed from: b, reason: collision with root package name */
    private static final c.a f18022b = c.a.a("c", "v", "i", "o");

    private H() {
    }

    @Override // V3.N
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public S3.o a(W3.c cVar, float f10) {
        if (cVar.o() == c.b.BEGIN_ARRAY) {
            cVar.b();
        }
        cVar.c();
        List<PointF> listF = null;
        List<PointF> listF2 = null;
        List<PointF> listF3 = null;
        boolean zG = false;
        while (cVar.f()) {
            int iQ = cVar.q(f18022b);
            if (iQ == 0) {
                zG = cVar.g();
            } else if (iQ == 1) {
                listF = s.f(cVar, f10);
            } else if (iQ == 2) {
                listF2 = s.f(cVar, f10);
            } else if (iQ != 3) {
                cVar.s();
                cVar.t();
            } else {
                listF3 = s.f(cVar, f10);
            }
        }
        cVar.e();
        if (cVar.o() == c.b.END_ARRAY) {
            cVar.d();
        }
        if (listF == null || listF2 == null || listF3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listF.isEmpty()) {
            return new S3.o(new PointF(), false, Collections.emptyList());
        }
        int size = listF.size();
        PointF pointF = listF.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = listF.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new Q3.a(X3.i.a(listF.get(i11), listF3.get(i11)), X3.i.a(pointF2, listF2.get(i10)), pointF2));
        }
        if (zG) {
            PointF pointF3 = listF.get(0);
            int i12 = size - 1;
            arrayList.add(new Q3.a(X3.i.a(listF.get(i12), listF3.get(i12)), X3.i.a(pointF3, listF2.get(0)), pointF3));
        }
        return new S3.o(pointF, zG, arrayList);
    }
}
