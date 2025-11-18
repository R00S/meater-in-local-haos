package Q3;

import android.graphics.PointF;

/* compiled from: DocumentData.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f14285a;

    /* renamed from: b, reason: collision with root package name */
    public String f14286b;

    /* renamed from: c, reason: collision with root package name */
    public float f14287c;

    /* renamed from: d, reason: collision with root package name */
    public a f14288d;

    /* renamed from: e, reason: collision with root package name */
    public int f14289e;

    /* renamed from: f, reason: collision with root package name */
    public float f14290f;

    /* renamed from: g, reason: collision with root package name */
    public float f14291g;

    /* renamed from: h, reason: collision with root package name */
    public int f14292h;

    /* renamed from: i, reason: collision with root package name */
    public int f14293i;

    /* renamed from: j, reason: collision with root package name */
    public float f14294j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14295k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f14296l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f14297m;

    /* compiled from: DocumentData.java */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f14285a = str;
        this.f14286b = str2;
        this.f14287c = f10;
        this.f14288d = aVar;
        this.f14289e = i10;
        this.f14290f = f11;
        this.f14291g = f12;
        this.f14292h = i11;
        this.f14293i = i12;
        this.f14294j = f13;
        this.f14295k = z10;
        this.f14296l = pointF;
        this.f14297m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f14285a.hashCode() * 31) + this.f14286b.hashCode()) * 31) + this.f14287c)) * 31) + this.f14288d.ordinal()) * 31) + this.f14289e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f14290f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f14292h;
    }

    public b() {
    }
}
