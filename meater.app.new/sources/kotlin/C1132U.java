package kotlin;

import J.RippleAlpha;
import i0.C3602t0;
import i0.C3606v0;
import kotlin.Metadata;

/* compiled from: Ripple.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"LI/U;", "", "<init>", "()V", "Li0/t0;", "contentColor", "", "lightTheme", "b", "(JZ)J", "LJ/g;", "a", "(JZ)LJ/g;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132U {

    /* renamed from: a, reason: collision with root package name */
    public static final C1132U f5923a = new C1132U();

    private C1132U() {
    }

    public final RippleAlpha a(long contentColor, boolean lightTheme) {
        return lightTheme ? ((double) C3606v0.i(contentColor)) > 0.5d ? C1133V.f5928e : C1133V.f5929f : C1133V.f5930g;
    }

    public final long b(long contentColor, boolean lightTheme) {
        return (lightTheme || ((double) C3606v0.i(contentColor)) >= 0.5d) ? contentColor : C3602t0.INSTANCE.f();
    }
}
