package U0;

import kotlin.Metadata;

/* compiled from: FontScaling.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u0002*\u00020\u0003H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8&X§\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"LU0/l;", "", "LU0/h;", "LU0/v;", "s", "(F)J", "i0", "(J)F", "", "R0", "()F", "getFontScale$annotations", "()V", "fontScale", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface l {
    /* renamed from: R0 */
    float getFontScale();

    default float i0(long j10) {
        if (!x.g(v.g(j10), x.INSTANCE.b())) {
            m.b("Only Sp can convert to Px");
        }
        V0.b bVar = V0.b.f17991a;
        if (!bVar.f(getFontScale())) {
            return h.u(v.h(j10) * getFontScale());
        }
        V0.a aVarB = bVar.b(getFontScale());
        float fH = v.h(j10);
        return h.u(aVarB == null ? fH * getFontScale() : aVarB.b(fH));
    }

    default long s(float f10) {
        V0.b bVar = V0.b.f17991a;
        if (!bVar.f(getFontScale())) {
            return w.d(f10 / getFontScale());
        }
        V0.a aVarB = bVar.b(getFontScale());
        return w.d(aVarB != null ? aVarB.a(f10) : f10 / getFontScale());
    }
}
