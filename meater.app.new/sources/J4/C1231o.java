package J4;

import com.apptionlabs.meater_app.R;
import kotlin.C1250B;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: MainScreenToolBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: J4.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1231o {

    /* renamed from: a, reason: collision with root package name */
    public static final C1231o f7510a = new C1231o();

    /* renamed from: b, reason: collision with root package name */
    public static Ba.p<InterfaceC1554l, Integer, C4153F> f7511b = W.c.b(-1792733556, false, a.f7513B);

    /* renamed from: c, reason: collision with root package name */
    public static Ba.p<InterfaceC1554l, Integer, C4153F> f7512c = W.c.b(538601786, false, b.f7514B);

    /* compiled from: MainScreenToolBar.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: J4.o$a */
    static final class a implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f7513B = new a();

        a() {
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1792733556, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ComposableSingletons$MainScreenToolBarKt.lambda-1.<anonymous> (MainScreenToolBar.kt:80)");
            }
            D0.k(D0.h.a(R.string.meater_label, interfaceC1554l, 6), interfaceC1554l, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: MainScreenToolBar.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: J4.o$b */
    static final class b implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f7514B = new b();

        b() {
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(538601786, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ComposableSingletons$MainScreenToolBarKt.lambda-2.<anonymous> (MainScreenToolBar.kt:125)");
            }
            C1250B.a(D0.e.c(R.drawable.ic_vertical_more, interfaceC1554l, 6), "Localized description", null, D0.b.a(R.color.black_color, interfaceC1554l, 6), interfaceC1554l, 48, 4);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public final Ba.p<InterfaceC1554l, Integer, C4153F> a() {
        return f7511b;
    }

    public final Ba.p<InterfaceC1554l, Integer, C4153F> b() {
        return f7512c;
    }
}
