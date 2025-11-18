package kotlin;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.M;
import java.util.Locale;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: PrefetchScheduler.android.kt */
@Metadata(d1 = {"\u0000\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\"\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LC/N;", "a", "(LO/l;I)LC/N;", "C/O$a", "LC/O$a;", "getRobolectricImpl$annotations", "()V", "RobolectricImpl", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    private static final a f2011a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        C3862t.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        f2011a = C3862t.b(lowerCase, "robolectric") ? new a() : null;
    }

    public static final N a(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(1141871251, i10, -1, "androidx.compose.foundation.lazy.layout.rememberDefaultPrefetchScheduler (PrefetchScheduler.android.kt:32)");
        }
        N n10 = f2011a;
        if (n10 != null) {
            interfaceC1554l.S(1213893039);
            interfaceC1554l.I();
        } else {
            interfaceC1554l.S(1213931944);
            View view = (View) interfaceC1554l.o(M.k());
            boolean zR = interfaceC1554l.R(view);
            Object objF = interfaceC1554l.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new RunnableC0963a(view);
                interfaceC1554l.J(objF);
            }
            n10 = (RunnableC0963a) objF;
            interfaceC1554l.I();
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        return n10;
    }

    /* compiled from: PrefetchScheduler.android.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"C/O$a", "LC/N;", "LC/L;", "prefetchRequest", "Loa/F;", "a", "(LC/L;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements N {
        a() {
        }

        @Override // kotlin.N
        public void a(L prefetchRequest) {
        }
    }
}
