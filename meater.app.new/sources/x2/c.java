package x2;

import X1.y;

/* compiled from: AviMainHeaderChunk.java */
/* loaded from: classes.dex */
final class c implements InterfaceC5052a {

    /* renamed from: a, reason: collision with root package name */
    public final int f52570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52571b;

    /* renamed from: c, reason: collision with root package name */
    public final int f52572c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52573d;

    private c(int i10, int i11, int i12, int i13) {
        this.f52570a = i10;
        this.f52571b = i11;
        this.f52572c = i12;
        this.f52573d = i13;
    }

    public static c c(y yVar) {
        int iU = yVar.u();
        yVar.X(8);
        int iU2 = yVar.u();
        int iU3 = yVar.u();
        yVar.X(4);
        int iU4 = yVar.u();
        yVar.X(12);
        return new c(iU, iU2, iU3, iU4);
    }

    @Override // x2.InterfaceC5052a
    public int a() {
        return 1751742049;
    }

    public boolean b() {
        return (this.f52571b & 16) == 16;
    }
}
