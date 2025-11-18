package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: AnimationVectors.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u0017\"\b\b\u0000\u0010\u0012*\u00020\u0011*\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "v1", "Lv/m;", "a", "(F)Lv/m;", "v2", "Lv/n;", "b", "(FF)Lv/n;", "v3", "Lv/o;", "c", "(FFF)Lv/o;", "v4", "Lv/p;", "d", "(FFFF)Lv/p;", "Lv/q;", "T", "g", "(Lv/q;)Lv/q;", "e", "source", "Loa/F;", "f", "(Lv/q;Lv/q;)V", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4771r {
    public static final C4761m a(float f10) {
        return new C4761m(f10);
    }

    public static final C4763n b(float f10, float f11) {
        return new C4763n(f10, f11);
    }

    public static final C4765o c(float f10, float f11, float f12) {
        return new C4765o(f10, f11, f12);
    }

    public static final C4767p d(float f10, float f11, float f12, float f13) {
        return new C4767p(f10, f11, f12, f13);
    }

    public static final <T extends AbstractC4769q> T e(T t10) {
        T t11 = (T) g(t10);
        int size = t11.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            t11.e(i10, t10.a(i10));
        }
        return t11;
    }

    public static final <T extends AbstractC4769q> void f(T t10, T t11) {
        int size = t10.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            t10.e(i10, t11.a(i10));
        }
    }

    public static final <T extends AbstractC4769q> T g(T t10) {
        T t11 = (T) t10.c();
        C3862t.e(t11, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t11;
    }
}
