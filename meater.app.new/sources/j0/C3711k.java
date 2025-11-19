package j0;

import kotlin.Metadata;

/* compiled from: Illuminant.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0014\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\r\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u001a\u0010#\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\n\u0010\"¨\u0006$"}, d2 = {"Lj0/k;", "", "<init>", "()V", "Lj0/z;", "b", "Lj0/z;", "getA", "()Lj0/z;", "A", "c", "getB", "B", "d", "a", "C", "e", "D50", "f", "getD55", "D55", "g", "D60", "h", "D65", "i", "getD75", "D75", "j", "getE", "E", "", "k", "[F", "()[F", "D50Xyz", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3711k {

    /* renamed from: a, reason: collision with root package name */
    public static final C3711k f43359a = new C3711k();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final WhitePoint A = new WhitePoint(0.44757f, 0.40745f);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final WhitePoint B = new WhitePoint(0.34842f, 0.35161f);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final WhitePoint C = new WhitePoint(0.31006f, 0.31616f);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final WhitePoint D50 = new WhitePoint(0.34567f, 0.3585f);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final WhitePoint D55 = new WhitePoint(0.33242f, 0.34743f);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final WhitePoint D60 = new WhitePoint(0.32168f, 0.33767f);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final WhitePoint D65 = new WhitePoint(0.31271f, 0.32902f);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final WhitePoint D75 = new WhitePoint(0.29902f, 0.31485f);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final WhitePoint E = new WhitePoint(0.33333f, 0.33333f);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float[] D50Xyz = {0.964212f, 1.0f, 0.825188f};

    private C3711k() {
    }

    public final WhitePoint a() {
        return C;
    }

    public final WhitePoint b() {
        return D50;
    }

    public final float[] c() {
        return D50Xyz;
    }

    public final WhitePoint d() {
        return D60;
    }

    public final WhitePoint e() {
        return D65;
    }
}
