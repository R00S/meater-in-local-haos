package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.C3856m;

/* compiled from: Animatable.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a+\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007\"\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000b\"\u0014\u0010\u001a\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f\"\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013¨\u0006\u001d"}, d2 = {"", "initialValue", "visibilityThreshold", "Lv/a;", "Lv/m;", "a", "(FF)Lv/a;", "Lv/m;", "positiveInfinityBounds1D", "Lv/n;", "b", "Lv/n;", "positiveInfinityBounds2D", "Lv/o;", "c", "Lv/o;", "positiveInfinityBounds3D", "Lv/p;", "d", "Lv/p;", "positiveInfinityBounds4D", "e", "negativeInfinityBounds1D", "f", "negativeInfinityBounds2D", "g", "negativeInfinityBounds3D", "h", "negativeInfinityBounds4D", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4739b {

    /* renamed from: a, reason: collision with root package name */
    private static final C4761m f50705a = C4771r.a(Float.POSITIVE_INFINITY);

    /* renamed from: b, reason: collision with root package name */
    private static final C4763n f50706b = C4771r.b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: c, reason: collision with root package name */
    private static final C4765o f50707c = C4771r.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    private static final C4767p f50708d = C4771r.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: e, reason: collision with root package name */
    private static final C4761m f50709e = C4771r.a(Float.NEGATIVE_INFINITY);

    /* renamed from: f, reason: collision with root package name */
    private static final C4763n f50710f = C4771r.b(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: g, reason: collision with root package name */
    private static final C4765o f50711g = C4771r.c(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* renamed from: h, reason: collision with root package name */
    private static final C4767p f50712h = C4771r.d(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final C4737a<Float, C4761m> a(float f10, float f11) {
        return new C4737a<>(Float.valueOf(f10), C4774s0.i(C3856m.f44008a), Float.valueOf(f11), null, 8, null);
    }

    public static /* synthetic */ C4737a b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.01f;
        }
        return a(f10, f11);
    }
}
