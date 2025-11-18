package R3;

import java.util.Arrays;
import java.util.List;

/* compiled from: AnimatableGradientColorValue.java */
/* loaded from: classes.dex */
public class c extends n<S3.d, S3.d> {
    public c(List<Y3.a<S3.d>> list) {
        super(b(list));
    }

    private static Y3.a<S3.d> a(Y3.a<S3.d> aVar) {
        S3.d dVar = aVar.f19387b;
        S3.d dVar2 = aVar.f19388c;
        if (dVar == null || dVar2 == null || dVar.e().length == dVar2.e().length) {
            return aVar;
        }
        float[] fArrC = c(dVar.e(), dVar2.e());
        return aVar.b(dVar.b(fArrC), dVar2.b(fArrC));
    }

    private static List<Y3.a<S3.d>> b(List<Y3.a<S3.d>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, a(list.get(i10)));
        }
        return list;
    }

    static float[] c(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // R3.n, R3.m
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // R3.m
    public O3.a<S3.d, S3.d> h() {
        return new O3.e(this.f14794a);
    }

    @Override // R3.n, R3.m
    public /* bridge */ /* synthetic */ List i() {
        return super.i();
    }

    @Override // R3.n
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
