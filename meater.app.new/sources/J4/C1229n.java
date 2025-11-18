package J4;

import com.apptionlabs.meater_app.R;
import kotlin.C1273Z;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: DashboardDialogs.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: J4.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1229n {

    /* renamed from: a, reason: collision with root package name */
    public static final C1229n f7499a = new C1229n();

    /* renamed from: b, reason: collision with root package name */
    public static Ba.q<A.W, InterfaceC1554l, Integer, C4153F> f7500b = W.c.b(228071704, false, a.f7502B);

    /* renamed from: c, reason: collision with root package name */
    public static Ba.q<A.W, InterfaceC1554l, Integer, C4153F> f7501c = W.c.b(-1496536618, false, b.f7503B);

    /* compiled from: DashboardDialogs.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: J4.n$a */
    static final class a implements Ba.q<A.W, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f7502B = new a();

        a() {
        }

        public final void a(A.W Button, InterfaceC1554l interfaceC1554l, int i10) {
            C3862t.g(Button, "$this$Button");
            if ((i10 & 17) == 16 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(228071704, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ComposableSingletons$DashboardDialogsKt.lambda-1.<anonymous> (DashboardDialogs.kt:76)");
            }
            C1273Z.b(D0.h.a(R.string.yes_alert_button_text, interfaceC1554l, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 0, 0, 131070);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(A.W w10, InterfaceC1554l interfaceC1554l, Integer num) {
            a(w10, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: DashboardDialogs.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: J4.n$b */
    static final class b implements Ba.q<A.W, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f7503B = new b();

        b() {
        }

        public final void a(A.W Button, InterfaceC1554l interfaceC1554l, int i10) {
            C3862t.g(Button, "$this$Button");
            if ((i10 & 17) == 16 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1496536618, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ComposableSingletons$DashboardDialogsKt.lambda-2.<anonymous> (DashboardDialogs.kt:87)");
            }
            C1273Z.b(D0.h.a(R.string.no_alert_button_text, interfaceC1554l, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 0, 0, 131070);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(A.W w10, InterfaceC1554l interfaceC1554l, Integer num) {
            a(w10, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public final Ba.q<A.W, InterfaceC1554l, Integer, C4153F> a() {
        return f7500b;
    }

    public final Ba.q<A.W, InterfaceC1554l, Integer, C4153F> b() {
        return f7501c;
    }
}
