package kotlin;

import Ba.q;
import W.c;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: SnackbarHost.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1148k {

    /* renamed from: a, reason: collision with root package name */
    public static final C1148k f6320a = new C1148k();

    /* renamed from: b, reason: collision with root package name */
    public static q<c0, InterfaceC1554l, Integer, C4153F> f6321b = c.b(996639038, false, a.f6322B);

    /* compiled from: SnackbarHost.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI/c0;", "it", "Loa/F;", "a", "(LI/c0;LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.k$a */
    static final class a extends AbstractC3864v implements q<c0, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f6322B = new a();

        a() {
            super(3);
        }

        public final void a(c0 c0Var, InterfaceC1554l interfaceC1554l, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? interfaceC1554l.R(c0Var) : interfaceC1554l.l(c0Var) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(996639038, i11, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:156)");
            }
            h0.d(c0Var, null, false, null, 0L, 0L, 0L, 0.0f, interfaceC1554l, i11 & 14, 254);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(c0 c0Var, InterfaceC1554l interfaceC1554l, Integer num) {
            a(c0Var, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public final q<c0, InterfaceC1554l, Integer, C4153F> a() {
        return f6321b;
    }
}
