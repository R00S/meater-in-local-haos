package v2;

/* compiled from: DolbyVisionConfig.java */
/* renamed from: v2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4808n {

    /* renamed from: a, reason: collision with root package name */
    public final int f51205a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51206b;

    /* renamed from: c, reason: collision with root package name */
    public final String f51207c;

    private C4808n(int i10, int i11, String str) {
        this.f51205a = i10;
        this.f51206b = i11;
        this.f51207c = str;
    }

    public static C4808n a(X1.y yVar) {
        String str;
        yVar.X(2);
        int iH = yVar.H();
        int i10 = iH >> 1;
        int iH2 = ((yVar.H() >> 3) & 31) | ((iH & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(iH2 >= 10 ? "." : ".0");
        sb2.append(iH2);
        return new C4808n(i10, iH2, sb2.toString());
    }
}
