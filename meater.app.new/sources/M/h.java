package M;

import kotlin.Metadata;

/* compiled from: IconButtonTokens.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0005\u0010\u001fR\u001d\u0010\"\u001a\u00020\n8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010(\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010.\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"LM/h;", "", "<init>", "()V", "LM/b;", "b", "LM/b;", "getDisabledIconColor", "()LM/b;", "DisabledIconColor", "LU0/h;", "c", "F", "a", "()F", "IconSize", "d", "getSelectedFocusIconColor", "SelectedFocusIconColor", "e", "getSelectedHoverIconColor", "SelectedHoverIconColor", "f", "getSelectedIconColor", "SelectedIconColor", "g", "getSelectedPressedIconColor", "SelectedPressedIconColor", "LM/m;", "h", "LM/m;", "()LM/m;", "StateLayerShape", "i", "StateLayerSize", "j", "getUnselectedFocusIconColor", "UnselectedFocusIconColor", "k", "getUnselectedHoverIconColor", "UnselectedHoverIconColor", "l", "getUnselectedIconColor", "UnselectedIconColor", "m", "getUnselectedPressedIconColor", "UnselectedPressedIconColor", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f11480a = new h();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b DisabledIconColor = b.OnSurface;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float IconSize = U0.h.u((float) 24.0d);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final b SelectedFocusIconColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final b SelectedHoverIconColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final b SelectedIconColor;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final b SelectedPressedIconColor;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final m StateLayerShape;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float StateLayerSize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final b UnselectedFocusIconColor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final b UnselectedHoverIconColor;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final b UnselectedIconColor;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final b UnselectedPressedIconColor;

    static {
        b bVar = b.Primary;
        SelectedFocusIconColor = bVar;
        SelectedHoverIconColor = bVar;
        SelectedIconColor = bVar;
        SelectedPressedIconColor = bVar;
        StateLayerShape = m.CornerFull;
        StateLayerSize = U0.h.u((float) 40.0d);
        b bVar2 = b.OnSurfaceVariant;
        UnselectedFocusIconColor = bVar2;
        UnselectedHoverIconColor = bVar2;
        UnselectedIconColor = bVar2;
        UnselectedPressedIconColor = bVar2;
    }

    private h() {
    }

    public final float a() {
        return IconSize;
    }

    public final m b() {
        return StateLayerShape;
    }

    public final float c() {
        return StateLayerSize;
    }
}
