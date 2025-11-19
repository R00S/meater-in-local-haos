package U1;

import X1.C1804a;
import java.util.Arrays;

/* compiled from: TrackGroup.java */
/* loaded from: classes.dex */
public final class H {

    /* renamed from: f, reason: collision with root package name */
    private static final String f16860f = X1.L.B0(0);

    /* renamed from: g, reason: collision with root package name */
    private static final String f16861g = X1.L.B0(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f16862a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16863b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16864c;

    /* renamed from: d, reason: collision with root package name */
    private final s[] f16865d;

    /* renamed from: e, reason: collision with root package name */
    private int f16866e;

    public H(s... sVarArr) {
        this("", sVarArr);
    }

    private static void c(String str, String str2, String str3, int i10) {
        X1.n.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    private static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int e(int i10) {
        return i10 | 16384;
    }

    private void f() {
        String strD = d(this.f16865d[0].f17151d);
        int iE = e(this.f16865d[0].f17153f);
        int i10 = 1;
        while (true) {
            s[] sVarArr = this.f16865d;
            if (i10 >= sVarArr.length) {
                return;
            }
            if (!strD.equals(d(sVarArr[i10].f17151d))) {
                s[] sVarArr2 = this.f16865d;
                c("languages", sVarArr2[0].f17151d, sVarArr2[i10].f17151d, i10);
                return;
            } else {
                if (iE != e(this.f16865d[i10].f17153f)) {
                    c("role flags", Integer.toBinaryString(this.f16865d[0].f17153f), Integer.toBinaryString(this.f16865d[i10].f17153f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public s a(int i10) {
        return this.f16865d[i10];
    }

    public int b(s sVar) {
        int i10 = 0;
        while (true) {
            s[] sVarArr = this.f16865d;
            if (i10 >= sVarArr.length) {
                return -1;
            }
            if (sVar == sVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || H.class != obj.getClass()) {
            return false;
        }
        H h10 = (H) obj;
        return this.f16863b.equals(h10.f16863b) && Arrays.equals(this.f16865d, h10.f16865d);
    }

    public int hashCode() {
        if (this.f16866e == 0) {
            this.f16866e = ((527 + this.f16863b.hashCode()) * 31) + Arrays.hashCode(this.f16865d);
        }
        return this.f16866e;
    }

    public H(String str, s... sVarArr) {
        C1804a.a(sVarArr.length > 0);
        this.f16863b = str;
        this.f16865d = sVarArr;
        this.f16862a = sVarArr.length;
        int iK = z.k(sVarArr[0].f17162o);
        this.f16864c = iK == -1 ? z.k(sVarArr[0].f17161n) : iK;
        f();
    }
}
