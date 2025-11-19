package kotlin;

import U0.d;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.C2013e0;
import kotlin.C1560o;
import kotlin.C4708B;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC4787z;
import kotlin.Metadata;

/* compiled from: SplineBasedFloatDecayAnimationSpec.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"T", "Lv/z;", "b", "(LO/l;I)Lv/z;", "", "a", "F", "()F", "platformFlingScrollFriction", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: u.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4614h {

    /* renamed from: a, reason: collision with root package name */
    private static final float f50173a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f50173a;
    }

    public static final <T> InterfaceC4787z<T> b(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(904445851, i10, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        d dVar = (d) interfaceC1554l.o(C2013e0.d());
        boolean zG = interfaceC1554l.g(dVar.getDensity());
        Object objF = interfaceC1554l.f();
        if (zG || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = C4708B.a(new C4613g(dVar));
            interfaceC1554l.J(objF);
        }
        InterfaceC4787z<T> interfaceC4787z = (InterfaceC4787z) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return interfaceC4787z;
    }
}
