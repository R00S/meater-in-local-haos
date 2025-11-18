package kotlin;

import kotlin.Metadata;

/* compiled from: Easing.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\r\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\t\u0010\u0004\"\u0017\u0010\f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b\u000b\u0010\u0004¨\u0006\r"}, d2 = {"Lv/D;", "a", "Lv/D;", "d", "()Lv/D;", "FastOutSlowInEasing", "b", "f", "LinearOutSlowInEasing", "c", "FastOutLinearInEasing", "e", "LinearEasing", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4716F {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC4712D f50587a = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC4712D f50588b = new CubicBezierEasing(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC4712D f50589c = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC4712D f50590d = new InterfaceC4712D() { // from class: v.E
        @Override // kotlin.InterfaceC4712D
        public final float a(float f10) {
            return C4716F.b(f10);
        }
    };

    public static final InterfaceC4712D c() {
        return f50589c;
    }

    public static final InterfaceC4712D d() {
        return f50587a;
    }

    public static final InterfaceC4712D e() {
        return f50590d;
    }

    public static final InterfaceC4712D f() {
        return f50588b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f10) {
        return f10;
    }
}
