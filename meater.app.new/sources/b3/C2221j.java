package b3;

import U1.s;
import X1.C1808e;
import android.util.SparseArray;
import b3.L;
import java.util.ArrayList;
import java.util.List;
import m8.AbstractC4009y;

/* compiled from: DefaultTsPayloadReaderFactory.java */
/* renamed from: b3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2221j implements L.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f30280a;

    /* renamed from: b, reason: collision with root package name */
    private final List<U1.s> f30281b;

    public C2221j(int i10) {
        this(i10, AbstractC4009y.G());
    }

    private G c(L.b bVar) {
        return new G(e(bVar));
    }

    private N d(L.b bVar) {
        return new N(e(bVar));
    }

    private List<U1.s> e(L.b bVar) {
        String str;
        int i10;
        if (f(32)) {
            return this.f30281b;
        }
        X1.y yVar = new X1.y(bVar.f30201e);
        List<U1.s> arrayList = this.f30281b;
        while (yVar.a() > 0) {
            int iH = yVar.H();
            int iF = yVar.f() + yVar.H();
            if (iH == 134) {
                arrayList = new ArrayList<>();
                int iH2 = yVar.H() & 31;
                for (int i11 = 0; i11 < iH2; i11++) {
                    String strE = yVar.E(3);
                    int iH3 = yVar.H();
                    boolean z10 = (iH3 & 128) != 0;
                    if (z10) {
                        i10 = iH3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bH = (byte) yVar.H();
                    yVar.X(1);
                    arrayList.add(new s.b().s0(str).i0(strE).N(i10).f0(z10 ? C1808e.e((bH & 64) != 0) : null).M());
                }
            }
            yVar.W(iF);
        }
        return arrayList;
    }

    private boolean f(int i10) {
        return (i10 & this.f30280a) != 0;
    }

    @Override // b3.L.c
    public SparseArray<L> a() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0057  */
    @Override // b3.L.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b3.L b(int r5, b3.L.b r6) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C2221j.b(int, b3.L$b):b3.L");
    }

    public C2221j(int i10, List<U1.s> list) {
        this.f30280a = i10;
        this.f30281b = list;
    }
}
