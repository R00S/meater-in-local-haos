package J4;

import com.apptionlabs.meater_app.R;
import i0.C3602t0;
import kotlin.C1250B;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: DashboardComponents.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: J4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1227m {

    /* renamed from: a, reason: collision with root package name */
    public static final C1227m f7495a = new C1227m();

    /* renamed from: b, reason: collision with root package name */
    public static Ba.p<InterfaceC1554l, Integer, C4153F> f7496b = W.c.b(-1869707643, false, a.f7497B);

    /* compiled from: DashboardComponents.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: J4.m$a */
    static final class a implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f7497B = new a();

        a() {
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1869707643, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ComposableSingletons$DashboardComponentsKt.lambda-1.<anonymous> (DashboardComponents.kt:1232)");
            }
            C1250B.a(D0.e.c(R.drawable.cancel_cook, interfaceC1554l, 6), D0.h.a(R.string.end_cook_title, interfaceC1554l, 6), null, C3602t0.INSTANCE.f(), interfaceC1554l, 3072, 4);
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
        return f7496b;
    }
}
