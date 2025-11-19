package J;

import i0.C3602t0;
import i0.C3606v0;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import oa.InterfaceC4156a;

/* compiled from: RippleTheme.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003J\u0015\u0010\u0003\u001a\u00020\u0002H'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"LJ/r;", "", "Li0/t0;", "a", "(LO/l;I)J", "LJ/g;", "b", "(LO/l;I)LJ/g;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC4156a
/* loaded from: classes.dex */
public interface r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f7151a;

    /* compiled from: RippleTheme.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"LJ/r$a;", "", "<init>", "()V", "Li0/t0;", "contentColor", "", "lightTheme", "b", "(JZ)J", "LJ/g;", "a", "(JZ)LJ/g;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: J.r$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f7151a = new Companion();

        private Companion() {
        }

        @InterfaceC4156a
        public final RippleAlpha a(long contentColor, boolean lightTheme) {
            return lightTheme ? ((double) C3606v0.i(contentColor)) > 0.5d ? s.f7153b : s.f7154c : s.f7155d;
        }

        @InterfaceC4156a
        public final long b(long contentColor, boolean lightTheme) {
            return (lightTheme || ((double) C3606v0.i(contentColor)) >= 0.5d) ? contentColor : C3602t0.INSTANCE.f();
        }
    }

    @InterfaceC4156a
    long a(InterfaceC1554l interfaceC1554l, int i10);

    @InterfaceC4156a
    RippleAlpha b(InterfaceC1554l interfaceC1554l, int i10);
}
