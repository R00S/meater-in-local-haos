package J4;

import J4.Z;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import kotlin.C1273Z;
import kotlin.C1278c;
import kotlin.C1286g;
import kotlin.C1287h;
import kotlin.C1289j;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.C1724d;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: DashboardDialogs.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "LK4/b;", "onGoingRecipe", "Lkotlin/Function0;", "Loa/F;", "onDismiss", "c", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;LK4/b;LBa/a;LO/l;II)V", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Z {

    /* compiled from: DashboardDialogs.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ MEATERDevice f7440B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ K4.b f7441C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ T5.m f7442D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f7443E;

        a(MEATERDevice mEATERDevice, K4.b bVar, T5.m mVar, Ba.a<C4153F> aVar) {
            this.f7440B = mEATERDevice;
            this.f7441C = bVar;
            this.f7442D = mVar;
            this.f7443E = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4153F c(MEATERDevice mEATERDevice, K4.b bVar, T5.m mVar, Ba.a aVar) {
            if (mEATERDevice != null) {
                ((Probe) mEATERDevice).cancelCook(true);
            }
            if (bVar != null) {
                mVar.D(bVar);
                K4.a.f8678a.b(bVar.getOngoingRecipeId());
            }
            aVar.invoke();
            return C4153F.f46609a;
        }

        public final void b(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(567405320, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ShowConfirmEndRecipeDialog.<anonymous> (DashboardDialogs.kt:60)");
            }
            C1286g c1286gB = C1287h.f8410a.b(D0.b.a(R.color.meater_red, interfaceC1554l, 6), 0L, 0L, 0L, interfaceC1554l, C1287h.f8424o << 12, 14);
            interfaceC1554l.S(2062950274);
            boolean zL = interfaceC1554l.l(this.f7440B) | interfaceC1554l.l(this.f7441C) | interfaceC1554l.l(this.f7442D) | interfaceC1554l.R(this.f7443E);
            final MEATERDevice mEATERDevice = this.f7440B;
            final K4.b bVar = this.f7441C;
            final T5.m mVar = this.f7442D;
            final Ba.a<C4153F> aVar = this.f7443E;
            Object objF = interfaceC1554l.f();
            if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new Ba.a() { // from class: J4.Y
                    @Override // Ba.a
                    public final Object invoke() {
                        return Z.a.c(mEATERDevice, bVar, mVar, aVar);
                    }
                };
                interfaceC1554l.J(objF);
            }
            interfaceC1554l.I();
            C1289j.a((Ba.a) objF, null, false, null, c1286gB, null, null, null, null, C1229n.f7499a.a(), interfaceC1554l, 805306368, 494);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            b(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: DashboardDialogs.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f7444B;

        b(Ba.a<C4153F> aVar) {
            this.f7444B = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4153F c(Ba.a aVar) {
            aVar.invoke();
            return C4153F.f46609a;
        }

        public final void b(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1157203002, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ShowConfirmEndRecipeDialog.<anonymous> (DashboardDialogs.kt:82)");
            }
            C1286g c1286gB = C1287h.f8410a.b(D0.b.a(R.color.meater_red, interfaceC1554l, 6), 0L, 0L, 0L, interfaceC1554l, C1287h.f8424o << 12, 14);
            interfaceC1554l.S(2062977068);
            boolean zR = interfaceC1554l.R(this.f7444B);
            final Ba.a<C4153F> aVar = this.f7444B;
            Object objF = interfaceC1554l.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new Ba.a() { // from class: J4.a0
                    @Override // Ba.a
                    public final Object invoke() {
                        return Z.b.c(aVar);
                    }
                };
                interfaceC1554l.J(objF);
            }
            interfaceC1554l.I();
            C1289j.a((Ba.a) objF, null, false, null, c1286gB, null, null, null, null, C1229n.f7499a.b(), interfaceC1554l, 805306368, 494);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            b(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: DashboardDialogs.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f7445B;

        c(String str) {
            this.f7445B = str;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1413155972, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ShowConfirmEndRecipeDialog.<anonymous> (DashboardDialogs.kt:48)");
            }
            C1273Z.b(this.f7445B, null, D0.b.a(R.color.black_color, interfaceC1554l, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 0, 0, 131066);
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

    /* compiled from: DashboardDialogs.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f7446B;

        d(String str) {
            this.f7446B = str;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(550851811, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ShowConfirmEndRecipeDialog.<anonymous> (DashboardDialogs.kt:54)");
            }
            C1273Z.b(this.f7446B, null, D0.b.a(R.color.black_color, interfaceC1554l, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 0, 0, 131066);
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

    public static final void c(MEATERDevice mEATERDevice, K4.b bVar, final Ba.a<C4153F> onDismiss, InterfaceC1554l interfaceC1554l, final int i10, final int i11) {
        String strA;
        String strA2;
        C3862t.g(onDismiss, "onDismiss");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-90603952);
        MEATERDevice mEATERDevice2 = (i11 & 1) != 0 ? null : mEATERDevice;
        K4.b bVar2 = (i11 & 2) != 0 ? null : bVar;
        if (C1560o.J()) {
            C1560o.S(-90603952, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ShowConfirmEndRecipeDialog (DashboardDialogs.kt:26)");
        }
        Object objO = interfaceC1554lR.o(androidx.compose.ui.platform.M.g());
        C3862t.e(objO, "null cannot be cast to non-null type com.apptionlabs.meater_app.MainActivity");
        MainActivity mainActivity = (MainActivity) objO;
        interfaceC1554lR.e(-1614864554);
        android.view.Y yB = ld.b.b(kotlin.jvm.internal.P.b(T5.m.class), mainActivity.v(), null, ld.a.a(mainActivity), null, C1724d.e(interfaceC1554lR, 0), null);
        interfaceC1554lR.O();
        T5.m mVar = (T5.m) yB;
        if (mEATERDevice2 == null || bVar2 == null) {
            interfaceC1554lR.S(1470838009);
            strA = D0.h.a(R.string.end_cook_title, interfaceC1554lR, 6);
            strA2 = D0.h.a(R.string.end_cook_alert_detail_text, interfaceC1554lR, 6);
            interfaceC1554lR.I();
        } else {
            interfaceC1554lR.S(1470687318);
            strA = D0.h.a(R.string.end_cook_title, interfaceC1554lR, 6);
            strA2 = D0.h.a(R.string.cancel_cook_message_dashboard, interfaceC1554lR, 6);
            interfaceC1554lR.I();
        }
        String str = strA;
        String str2 = strA2;
        long jA = D0.b.a(R.color.dialog_background, interfaceC1554lR, 6);
        interfaceC1554lR.S(1848569949);
        boolean z10 = (((i10 & 896) ^ 384) > 256 && interfaceC1554lR.R(onDismiss)) || (i10 & 384) == 256;
        Object objF = interfaceC1554lR.f();
        if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new Ba.a() { // from class: J4.W
                @Override // Ba.a
                public final Object invoke() {
                    return Z.d(onDismiss);
                }
            };
            interfaceC1554lR.J(objF);
        }
        interfaceC1554lR.I();
        final K4.b bVar3 = bVar2;
        C1278c.a((Ba.a) objF, W.c.d(567405320, true, new a(mEATERDevice2, bVar2, mVar, onDismiss), interfaceC1554lR, 54), null, W.c.d(-1157203002, true, new b(onDismiss), interfaceC1554lR, 54), null, W.c.d(1413155972, true, new c(str), interfaceC1554lR, 54), W.c.d(550851811, true, new d(str2), interfaceC1554lR, 54), null, jA, 0L, 0L, 0L, 0.0f, null, interfaceC1554lR, 1772592, 0, 16020);
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            final MEATERDevice mEATERDevice3 = mEATERDevice2;
            w0Y.a(new Ba.p() { // from class: J4.X
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return Z.e(mEATERDevice3, bVar3, onDismiss, i10, i11, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F d(Ba.a aVar) {
        aVar.invoke();
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F e(MEATERDevice mEATERDevice, K4.b bVar, Ba.a aVar, int i10, int i11, InterfaceC1554l interfaceC1554l, int i12) {
        c(mEATERDevice, bVar, aVar, interfaceC1554l, C1509K0.a(i10 | 1), i11);
        return C4153F.f46609a;
    }
}
