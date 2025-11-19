package O4;

/* compiled from: MEATERPLUSV2Battery.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f13256a;

    /* renamed from: b, reason: collision with root package name */
    public int f13257b;

    /* renamed from: c, reason: collision with root package name */
    public int f13258c;

    public static f a(byte[] bArr) {
        f fVar = new f();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (i10 == 0) {
                fVar.f13256a = bArr[i10];
            } else if (i10 == 1) {
                fVar.f13257b = bArr[i10];
            } else if (i10 == 2) {
                fVar.f13258c = bArr[i10];
            }
        }
        return fVar;
    }
}
