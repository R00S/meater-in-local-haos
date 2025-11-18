package M;

import kotlin.Metadata;

/* compiled from: ProgressIndicatorTokens.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0015\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0017\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0005\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001d\u0010\u001d\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014R\u001d\u0010\u001f\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u0017\u0010%\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b$\u0010\u000eR\u001d\u0010'\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001d\u0010)\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u0012\u001a\u0004\b\u000b\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"LM/l;", "", "<init>", "()V", "LM/b;", "b", "LM/b;", "a", "()LM/b;", "ActiveIndicatorColor", "LM/m;", "c", "LM/m;", "getActiveShape", "()LM/m;", "ActiveShape", "LU0/h;", "d", "F", "getActiveThickness-D9Ej5fM", "()F", "ActiveThickness", "e", "ActiveTrackSpace", "f", "getStopColor", "StopColor", "g", "getStopShape-D9Ej5fM", "StopShape", "h", "StopSize", "i", "getTrackColor", "TrackColor", "j", "getTrackShape", "TrackShape", "k", "TrackThickness", "l", "Size", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f11651a = new l();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b ActiveIndicatorColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final m ActiveShape;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveThickness;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float ActiveTrackSpace;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final b StopColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final float StopShape;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float StopSize;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final b TrackColor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final m TrackShape;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float TrackThickness;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final float Size;

    static {
        b bVar = b.Primary;
        ActiveIndicatorColor = bVar;
        m mVar = m.CornerFull;
        ActiveShape = mVar;
        float f10 = (float) 4.0d;
        ActiveThickness = U0.h.u(f10);
        ActiveTrackSpace = U0.h.u(f10);
        StopColor = bVar;
        StopShape = U0.h.u(f10);
        StopSize = U0.h.u(f10);
        TrackColor = b.SecondaryContainer;
        TrackShape = mVar;
        TrackThickness = U0.h.u(f10);
        Size = U0.h.u((float) 48.0d);
    }

    private l() {
    }

    public final b a() {
        return ActiveIndicatorColor;
    }

    public final float b() {
        return ActiveTrackSpace;
    }

    public final float c() {
        return Size;
    }

    public final float d() {
        return StopSize;
    }

    public final float e() {
        return TrackThickness;
    }
}
