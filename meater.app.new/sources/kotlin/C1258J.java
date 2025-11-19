package kotlin;

import M.l;
import i0.C3602t0;
import i0.e1;
import kotlin.C1560o;
import kotlin.C4748f0;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0013\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0005\u0010\u000eR&\u0010\u0017\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0015\u0010\bR&\u0010\u001b\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0019\u0010\bR&\u0010\u001f\u001a\u00020\u00048GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010*\u001a\u00020'8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0017\u0010+\u001a\u00020'8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000b\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"LK/J;", "", "<init>", "()V", "LU0/h;", "b", "F", "d", "()F", "CircularStrokeWidth", "Li0/e1;", "c", "I", "getLinearStrokeCap-KaPHkGw", "()I", "LinearStrokeCap", "getCircularDeterminateStrokeCap-KaPHkGw", "CircularDeterminateStrokeCap", "e", "CircularIndeterminateStrokeCap", "f", "getLinearTrackStopIndicatorSize-D9Ej5fM", "getLinearTrackStopIndicatorSize-D9Ej5fM$annotations", "LinearTrackStopIndicatorSize", "g", "getLinearIndicatorTrackGapSize-D9Ej5fM", "getLinearIndicatorTrackGapSize-D9Ej5fM$annotations", "LinearIndicatorTrackGapSize", "h", "getCircularIndicatorTrackGapSize-D9Ej5fM", "getCircularIndicatorTrackGapSize-D9Ej5fM$annotations", "CircularIndicatorTrackGapSize", "Lv/f0;", "", "i", "Lv/f0;", "getProgressAnimationSpec", "()Lv/f0;", "ProgressAnimationSpec", "Li0/t0;", "a", "(LO/l;I)J", "circularColor", "circularIndeterminateTrackColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1258J {

    /* renamed from: a, reason: collision with root package name */
    public static final C1258J f7930a = new C1258J();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final float CircularStrokeWidth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final int LinearStrokeCap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final int CircularDeterminateStrokeCap;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final int CircularIndeterminateStrokeCap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float LinearTrackStopIndicatorSize;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float LinearIndicatorTrackGapSize;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float CircularIndicatorTrackGapSize;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final C4748f0<Float> ProgressAnimationSpec;

    static {
        l lVar = l.f11651a;
        CircularStrokeWidth = lVar.e();
        e1.Companion companion = e1.INSTANCE;
        LinearStrokeCap = companion.b();
        CircularDeterminateStrokeCap = companion.b();
        CircularIndeterminateStrokeCap = companion.b();
        LinearTrackStopIndicatorSize = lVar.d();
        LinearIndicatorTrackGapSize = lVar.b();
        CircularIndicatorTrackGapSize = lVar.b();
        ProgressAnimationSpec = new C4748f0<>(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    private C1258J() {
    }

    public final long a(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1803349725, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:847)");
        }
        long jF = C1295p.f(l.f11651a.a(), interfaceC1554l, 6);
        if (C1560o.J()) {
            C1560o.R();
        }
        return jF;
    }

    public final int b() {
        return CircularIndeterminateStrokeCap;
    }

    public final long c(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1947901123, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:868)");
        }
        long jD = C3602t0.INSTANCE.d();
        if (C1560o.J()) {
            C1560o.R();
        }
        return jD;
    }

    public final float d() {
        return CircularStrokeWidth;
    }
}
