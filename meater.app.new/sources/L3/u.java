package L3;

import android.graphics.Bitmap;

/* compiled from: LottieImageAsset.java */
/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final int f9200a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9201b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9202c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9203d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9204e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f9205f;

    public u(int i10, int i11, String str, String str2, String str3) {
        this.f9200a = i10;
        this.f9201b = i11;
        this.f9202c = str;
        this.f9203d = str2;
        this.f9204e = str3;
    }

    public u a(float f10) {
        u uVar = new u((int) (this.f9200a * f10), (int) (this.f9201b * f10), this.f9202c, this.f9203d, this.f9204e);
        Bitmap bitmap = this.f9205f;
        if (bitmap != null) {
            uVar.g(Bitmap.createScaledBitmap(bitmap, uVar.f9200a, uVar.f9201b, true));
        }
        return uVar;
    }

    public Bitmap b() {
        return this.f9205f;
    }

    public String c() {
        return this.f9203d;
    }

    public int d() {
        return this.f9201b;
    }

    public String e() {
        return this.f9202c;
    }

    public int f() {
        return this.f9200a;
    }

    public void g(Bitmap bitmap) {
        this.f9205f = bitmap;
    }
}
