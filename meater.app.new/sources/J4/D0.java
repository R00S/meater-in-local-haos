package J4;

import A.C0794b;
import A.InterfaceC0801i;
import A0.InterfaceC0828g;
import J4.D0;
import android.app.Activity;
import android.content.Intent;
import b0.c;
import b0.i;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.ConnectionsControllerActivity;
import com.apptionlabs.meater_app.activities.CookHistory;
import com.apptionlabs.meater_app.activities.CustomSettingActivity;
import com.apptionlabs.meater_app.activities.DebugActivity;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.apptionlabs.meater_app.model.CloudMQTTConnectionState;
import com.apptionlabs.meater_app.model.TemperatureLog;
import com.apptionlabs.meater_app.model.ThisDevice;
import e.C3109f;
import g.C3369a;
import kotlin.C1;
import kotlin.C1249A;
import kotlin.C1250B;
import kotlin.C1272Y;
import kotlin.C1273Z;
import kotlin.C1277b0;
import kotlin.C1280d;
import kotlin.C1282e;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.C1721a;
import kotlin.C1724d;
import kotlin.FontWeight;
import kotlin.InterfaceC1279c0;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.W0;
import kotlin.jvm.internal.C3862t;
import kotlin.m1;
import kotlin.r1;
import kotlin.x1;
import o0.C4083d;
import oa.C4153F;
import x4.b;

/* compiled from: MainScreenToolBar.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aA\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015²\u0006\u000e\u0010\u0013\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"LK/c0;", "scrollBehavior", "LO/x1;", "Lcom/apptionlabs/meater_app/model/CloudMQTTConnectionState;", "cloudStatus", "Le/f;", "Landroid/content/Intent;", "Lg/a;", "settingScreenLauncher", "LT5/m;", "viewModel", "Loa/F;", "d", "(LK/c0;LO/x1;Le/f;LT5/m;LO/l;I)V", "", "title", "k", "(Ljava/lang/String;LO/l;I)V", "", "isPopupVisible", "isDropDownVisible", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class D0 {

    /* compiled from: Inject.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Ba.a<cd.a> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ x1 f7292B;

        public a(x1 x1Var) {
            this.f7292B = x1Var;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cd.a invoke() {
            cd.a aVar;
            Ba.a aVarB = C1721a.b(this.f7292B);
            return (aVarB == null || (aVar = (cd.a) aVarB.invoke()) == null) ? cd.b.a() : aVar;
        }
    }

    /* compiled from: MainScreenToolBar.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<Boolean> f7293B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ x1<CloudMQTTConnectionState> f7294C;

        /* compiled from: MainScreenToolBar.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements Ba.p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ x1<CloudMQTTConnectionState> f7295B;

            /* compiled from: MainScreenToolBar.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: J4.D0$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0150a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f7296a;

                static {
                    int[] iArr = new int[CloudMQTTConnectionState.values().length];
                    try {
                        iArr[CloudMQTTConnectionState.CONNECTING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CloudMQTTConnectionState.DISCONNECTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CloudMQTTConnectionState.CONNECTED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CloudMQTTConnectionState.BAD_CREDENTIALS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f7296a = iArr;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(x1<? extends CloudMQTTConnectionState> x1Var) {
                this.f7295B = x1Var;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-1452775591, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreenToolBar.<anonymous>.<anonymous> (MainScreenToolBar.kt:93)");
                }
                A.Y.a(androidx.compose.foundation.layout.r.q(b0.i.INSTANCE, U0.h.u(8)), interfaceC1554l, 6);
                int i11 = C0150a.f7296a[this.f7295B.getValue().ordinal()];
                if (i11 == 1) {
                    interfaceC1554l.S(226271350);
                    C1205b.b(interfaceC1554l, 0);
                    interfaceC1554l.I();
                } else if (i11 == 2) {
                    interfaceC1554l.S(226407750);
                    w.y.b(D0.i.b(C4083d.INSTANCE, R.drawable.icon_meater_cloud_disconnected, interfaceC1554l, 54), "Localized description", null, null, null, 0.0f, null, interfaceC1554l, 48, 124);
                    interfaceC1554l.I();
                } else if (i11 == 3) {
                    interfaceC1554l.S(226740969);
                    w.y.b(D0.i.b(C4083d.INSTANCE, R.drawable.icon_meater_cloud_connected, interfaceC1554l, 54), "Localized description", null, null, null, 0.0f, null, interfaceC1554l, 48, 124);
                    interfaceC1554l.I();
                } else {
                    if (i11 != 4) {
                        interfaceC1554l.S(284392106);
                        interfaceC1554l.I();
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC1554l.S(227077350);
                    w.y.b(D0.i.b(C4083d.INSTANCE, R.drawable.icon_meater_cloud_disconnected, interfaceC1554l, 54), "Localized description", null, null, null, 0.0f, null, interfaceC1554l, 48, 124);
                    interfaceC1554l.I();
                }
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

        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC1563p0<Boolean> interfaceC1563p0, x1<? extends CloudMQTTConnectionState> x1Var) {
            this.f7293B = interfaceC1563p0;
            this.f7294C = x1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4153F c(InterfaceC1563p0 interfaceC1563p0) {
            D0.f(interfaceC1563p0, true);
            return C4153F.f46609a;
        }

        public final void b(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(221111822, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreenToolBar.<anonymous> (MainScreenToolBar.kt:85)");
            }
            long jA = D0.b.a(R.color.dashboard_background, interfaceC1554l, 6);
            float f10 = 36;
            b0.i iVarI = androidx.compose.foundation.layout.o.i(androidx.compose.foundation.layout.r.n(b0.i.INSTANCE, U0.h.u(f10), U0.h.u(f10)), U0.h.u(2));
            interfaceC1554l.S(-1888503230);
            final InterfaceC1563p0<Boolean> interfaceC1563p0 = this.f7293B;
            Object objF = interfaceC1554l.f();
            if (objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new Ba.a() { // from class: J4.E0
                    @Override // Ba.a
                    public final Object invoke() {
                        return D0.b.c(interfaceC1563p0);
                    }
                };
                interfaceC1554l.J(objF);
            }
            interfaceC1554l.I();
            C1272Y.b((Ba.a) objF, iVarI, false, null, jA, 0L, 0.0f, 0.0f, null, null, W.c.d(-1452775591, true, new a(this.f7294C), interfaceC1554l, 54), interfaceC1554l, 54, 6, 1004);
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

    /* compiled from: MainScreenToolBar.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Ba.q<A.W, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<Boolean> f7297B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Activity f7298C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C3109f<Intent, C3369a> f7299D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ T5.m f7300E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ b0.i f7301F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ NetworkConstant f7302G;

        /* compiled from: MainScreenToolBar.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements Ba.q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Activity f7303B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C3109f<Intent, C3369a> f7304C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ T5.m f7305D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ b0.i f7306E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ InterfaceC1563p0<Boolean> f7307F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ NetworkConstant f7308G;

            /* compiled from: MainScreenToolBar.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: J4.D0$c$a$a, reason: collision with other inner class name */
            static final class C0151a implements Ba.p<InterfaceC1554l, Integer, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ NetworkConstant f7309B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ b0.i f7310C;

                C0151a(NetworkConstant networkConstant, b0.i iVar) {
                    this.f7309B = networkConstant;
                    this.f7310C = iVar;
                }

                public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                        interfaceC1554l.C();
                        return;
                    }
                    if (C1560o.J()) {
                        C1560o.S(1188235293, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreenToolBar.<anonymous>.<anonymous>.<anonymous> (MainScreenToolBar.kt:268)");
                    }
                    int i11 = Ub.n.L(this.f7309B.getCloudMQTTHost(), "gammon", false, 2, null) ? R.drawable.ic_gam : Ub.n.L(this.f7309B.getCloudMQTTHost(), "psyduck", false, 2, null) ? R.drawable.ic_img_nav_psy : Ub.n.L(this.f7309B.getCloudMQTTHost(), "duck", false, 2, null) ? R.drawable.ic_img_nav_duck : R.drawable.ic_dev_icon;
                    b0.i iVar = this.f7310C;
                    i.Companion companion = b0.i.INSTANCE;
                    y0.I iB = A.U.b(C0794b.f54a.e(), b0.c.INSTANCE.l(), interfaceC1554l, 0);
                    int iA = C1550j.a(interfaceC1554l, 0);
                    InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                    b0.i iVarE = b0.h.e(interfaceC1554l, companion);
                    InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
                    Ba.a<InterfaceC0828g> aVarA = companion2.a();
                    if (interfaceC1554l.w() == null) {
                        C1550j.c();
                    }
                    interfaceC1554l.t();
                    if (interfaceC1554l.getInserting()) {
                        interfaceC1554l.T(aVarA);
                    } else {
                        interfaceC1554l.H();
                    }
                    InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                    C1.b(interfaceC1554lA, iB, companion2.c());
                    C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
                    Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
                    if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                        interfaceC1554lA.J(Integer.valueOf(iA));
                        interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                    }
                    C1.b(interfaceC1554lA, iVarE, companion2.d());
                    A.X x10 = A.X.f45a;
                    C1250B.a(D0.e.c(i11, interfaceC1554l, 0), "Localized description", iVar, D0.b.a(R.color.black_color, interfaceC1554l, 6), interfaceC1554l, 432, 0);
                    A.Y.a(androidx.compose.foundation.layout.r.q(companion, U0.h.u(8)), interfaceC1554l, 6);
                    C1273Z.b("Debug Logs", null, D0.b.a(R.color.black_color, interfaceC1554l, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 6, 0, 131066);
                    interfaceC1554l.P();
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
            static final class b implements Ba.p<InterfaceC1554l, Integer, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ b0.i f7311B;

                b(b0.i iVar) {
                    this.f7311B = iVar;
                }

                public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                        interfaceC1554l.C();
                        return;
                    }
                    if (C1560o.J()) {
                        C1560o.S(927430722, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreenToolBar.<anonymous>.<anonymous>.<anonymous> (MainScreenToolBar.kt:142)");
                    }
                    b0.i iVar = this.f7311B;
                    i.Companion companion = b0.i.INSTANCE;
                    y0.I iB = A.U.b(C0794b.f54a.e(), b0.c.INSTANCE.l(), interfaceC1554l, 0);
                    int iA = C1550j.a(interfaceC1554l, 0);
                    InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                    b0.i iVarE = b0.h.e(interfaceC1554l, companion);
                    InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
                    Ba.a<InterfaceC0828g> aVarA = companion2.a();
                    if (interfaceC1554l.w() == null) {
                        C1550j.c();
                    }
                    interfaceC1554l.t();
                    if (interfaceC1554l.getInserting()) {
                        interfaceC1554l.T(aVarA);
                    } else {
                        interfaceC1554l.H();
                    }
                    InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                    C1.b(interfaceC1554lA, iB, companion2.c());
                    C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
                    Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
                    if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                        interfaceC1554lA.J(Integer.valueOf(iA));
                        interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                    }
                    C1.b(interfaceC1554lA, iVarE, companion2.d());
                    A.X x10 = A.X.f45a;
                    C1250B.a(D0.e.c(R.drawable.ic_img_nav_my_phone_home, interfaceC1554l, 6), "Localized description", iVar, D0.b.a(R.color.black_color, interfaceC1554l, 6), interfaceC1554l, 432, 0);
                    A.Y.a(androidx.compose.foundation.layout.r.q(companion, U0.h.u(8)), interfaceC1554l, 6);
                    C1273Z.b(D0.h.a(R.string.my_devices, interfaceC1554l, 6), null, D0.b.a(R.color.black_color, interfaceC1554l, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 0, 0, 131066);
                    interfaceC1554l.P();
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
            /* renamed from: J4.D0$c$a$c, reason: collision with other inner class name */
            static final class C0152c implements Ba.p<InterfaceC1554l, Integer, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ b0.i f7312B;

                C0152c(b0.i iVar) {
                    this.f7312B = iVar;
                }

                public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                        interfaceC1554l.C();
                        return;
                    }
                    if (C1560o.J()) {
                        C1560o.S(-1716582919, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreenToolBar.<anonymous>.<anonymous>.<anonymous> (MainScreenToolBar.kt:165)");
                    }
                    b0.i iVar = this.f7312B;
                    i.Companion companion = b0.i.INSTANCE;
                    y0.I iB = A.U.b(C0794b.f54a.e(), b0.c.INSTANCE.l(), interfaceC1554l, 0);
                    int iA = C1550j.a(interfaceC1554l, 0);
                    InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                    b0.i iVarE = b0.h.e(interfaceC1554l, companion);
                    InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
                    Ba.a<InterfaceC0828g> aVarA = companion2.a();
                    if (interfaceC1554l.w() == null) {
                        C1550j.c();
                    }
                    interfaceC1554l.t();
                    if (interfaceC1554l.getInserting()) {
                        interfaceC1554l.T(aVarA);
                    } else {
                        interfaceC1554l.H();
                    }
                    InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                    C1.b(interfaceC1554lA, iB, companion2.c());
                    C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
                    Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
                    if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                        interfaceC1554lA.J(Integer.valueOf(iA));
                        interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                    }
                    C1.b(interfaceC1554lA, iVarE, companion2.d());
                    A.X x10 = A.X.f45a;
                    C1250B.a(D0.e.c(R.drawable.ic_img_nav_add, interfaceC1554l, 6), "Localized description", iVar, D0.b.a(R.color.black_color, interfaceC1554l, 6), interfaceC1554l, 432, 0);
                    A.Y.a(androidx.compose.foundation.layout.r.q(companion, U0.h.u(8)), interfaceC1554l, 6);
                    C1273Z.b(D0.h.a(R.string.menu_dropdown_main_add_devices, interfaceC1554l, 6), null, D0.b.a(R.color.black_color, interfaceC1554l, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 0, 0, 131066);
                    interfaceC1554l.P();
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
            static final class d implements Ba.p<InterfaceC1554l, Integer, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ b0.i f7313B;

                d(b0.i iVar) {
                    this.f7313B = iVar;
                }

                public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                        interfaceC1554l.C();
                        return;
                    }
                    if (C1560o.J()) {
                        C1560o.S(831366586, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreenToolBar.<anonymous>.<anonymous>.<anonymous> (MainScreenToolBar.kt:188)");
                    }
                    b0.i iVar = this.f7313B;
                    i.Companion companion = b0.i.INSTANCE;
                    y0.I iB = A.U.b(C0794b.f54a.e(), b0.c.INSTANCE.l(), interfaceC1554l, 0);
                    int iA = C1550j.a(interfaceC1554l, 0);
                    InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                    b0.i iVarE = b0.h.e(interfaceC1554l, companion);
                    InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
                    Ba.a<InterfaceC0828g> aVarA = companion2.a();
                    if (interfaceC1554l.w() == null) {
                        C1550j.c();
                    }
                    interfaceC1554l.t();
                    if (interfaceC1554l.getInserting()) {
                        interfaceC1554l.T(aVarA);
                    } else {
                        interfaceC1554l.H();
                    }
                    InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                    C1.b(interfaceC1554lA, iB, companion2.c());
                    C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
                    Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
                    if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                        interfaceC1554lA.J(Integer.valueOf(iA));
                        interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                    }
                    C1.b(interfaceC1554lA, iVarE, companion2.d());
                    A.X x10 = A.X.f45a;
                    C1250B.a(D0.e.c(R.drawable.ic_img_nav_clock, interfaceC1554l, 6), "Localized description", iVar, D0.b.a(R.color.black_color, interfaceC1554l, 6), interfaceC1554l, 432, 0);
                    A.Y.a(androidx.compose.foundation.layout.r.q(companion, U0.h.u(8)), interfaceC1554l, 6);
                    C1273Z.b(D0.h.a(R.string.previous_cook_fragment_title, interfaceC1554l, 6), null, D0.b.a(R.color.black_color, interfaceC1554l, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 0, 0, 131066);
                    interfaceC1554l.P();
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
            static final class e implements Ba.p<InterfaceC1554l, Integer, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ b0.i f7314B;

                e(b0.i iVar) {
                    this.f7314B = iVar;
                }

                public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                        interfaceC1554l.C();
                        return;
                    }
                    if (C1560o.J()) {
                        C1560o.S(-915651205, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreenToolBar.<anonymous>.<anonymous>.<anonymous> (MainScreenToolBar.kt:217)");
                    }
                    b0.i iVar = this.f7314B;
                    i.Companion companion = b0.i.INSTANCE;
                    y0.I iB = A.U.b(C0794b.f54a.e(), b0.c.INSTANCE.l(), interfaceC1554l, 0);
                    int iA = C1550j.a(interfaceC1554l, 0);
                    InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                    b0.i iVarE = b0.h.e(interfaceC1554l, companion);
                    InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
                    Ba.a<InterfaceC0828g> aVarA = companion2.a();
                    if (interfaceC1554l.w() == null) {
                        C1550j.c();
                    }
                    interfaceC1554l.t();
                    if (interfaceC1554l.getInserting()) {
                        interfaceC1554l.T(aVarA);
                    } else {
                        interfaceC1554l.H();
                    }
                    InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                    C1.b(interfaceC1554lA, iB, companion2.c());
                    C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
                    Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
                    if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                        interfaceC1554lA.J(Integer.valueOf(iA));
                        interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                    }
                    C1.b(interfaceC1554lA, iVarE, companion2.d());
                    A.X x10 = A.X.f45a;
                    C1250B.a(D0.e.c(R.drawable.ic_img_nav_settings, interfaceC1554l, 6), "Localized description", iVar, D0.b.a(R.color.black_color, interfaceC1554l, 6), interfaceC1554l, 432, 0);
                    A.Y.a(androidx.compose.foundation.layout.r.q(companion, U0.h.u(8)), interfaceC1554l, 6);
                    C1273Z.b(D0.h.a(R.string.menu_dropdown_main_settings, interfaceC1554l, 6), null, D0.b.a(R.color.black_color, interfaceC1554l, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 0, 0, 131066);
                    interfaceC1554l.P();
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
            static final class f implements Ba.p<InterfaceC1554l, Integer, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ b0.i f7315B;

                f(b0.i iVar) {
                    this.f7315B = iVar;
                }

                public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                        interfaceC1554l.C();
                        return;
                    }
                    if (C1560o.J()) {
                        C1560o.S(-1004748232, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreenToolBar.<anonymous>.<anonymous>.<anonymous> (MainScreenToolBar.kt:245)");
                    }
                    b0.i iVar = this.f7315B;
                    i.Companion companion = b0.i.INSTANCE;
                    y0.I iB = A.U.b(C0794b.f54a.e(), b0.c.INSTANCE.l(), interfaceC1554l, 0);
                    int iA = C1550j.a(interfaceC1554l, 0);
                    InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                    b0.i iVarE = b0.h.e(interfaceC1554l, companion);
                    InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
                    Ba.a<InterfaceC0828g> aVarA = companion2.a();
                    if (interfaceC1554l.w() == null) {
                        C1550j.c();
                    }
                    interfaceC1554l.t();
                    if (interfaceC1554l.getInserting()) {
                        interfaceC1554l.T(aVarA);
                    } else {
                        interfaceC1554l.H();
                    }
                    InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                    C1.b(interfaceC1554lA, iB, companion2.c());
                    C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
                    Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
                    if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                        interfaceC1554lA.J(Integer.valueOf(iA));
                        interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                    }
                    C1.b(interfaceC1554lA, iVarE, companion2.d());
                    A.X x10 = A.X.f45a;
                    C1250B.a(D0.e.c(R.drawable.ic_close, interfaceC1554l, 6), "Localized description", iVar, D0.b.a(R.color.black_color, interfaceC1554l, 6), interfaceC1554l, 432, 0);
                    A.Y.a(androidx.compose.foundation.layout.r.q(companion, U0.h.u(8)), interfaceC1554l, 6);
                    C1273Z.b("Reset Recipe", null, D0.b.a(R.color.black_color, interfaceC1554l, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 6, 0, 131066);
                    interfaceC1554l.P();
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

            a(Activity activity, C3109f<Intent, C3369a> c3109f, T5.m mVar, b0.i iVar, InterfaceC1563p0<Boolean> interfaceC1563p0, NetworkConstant networkConstant) {
                this.f7303B = activity;
                this.f7304C = c3109f;
                this.f7305D = mVar;
                this.f7306E = iVar;
                this.f7307F = interfaceC1563p0;
                this.f7308G = networkConstant;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C4153F n(Activity activity, InterfaceC1563p0 interfaceC1563p0) {
                x4.b.j(b.EnumC0768b.f52706e0.title, "", "", null, 8, null);
                ConnectionsControllerActivity.n3(activity, ThisDevice.INSTANCE);
                D0.h(interfaceC1563p0, false);
                return C4153F.f46609a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C4153F o(Activity activity, InterfaceC1563p0 interfaceC1563p0) {
                activity.startActivity(new Intent(activity, (Class<?>) DebugActivity.class));
                D0.h(interfaceC1563p0, false);
                return C4153F.f46609a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C4153F p(Activity activity, InterfaceC1563p0 interfaceC1563p0) {
                x4.b.j(b.EnumC0768b.f52704d0.title, "", "", null, 8, null);
                z0.r0(activity);
                D0.h(interfaceC1563p0, false);
                return C4153F.f46609a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C4153F q(Activity activity, InterfaceC1563p0 interfaceC1563p0) {
                x4.b.j(b.EnumC0768b.f52702c0.title, "", "", null, 8, null);
                Intent intent = new Intent(activity, (Class<?>) CookHistory.class);
                intent.putExtra("PC", true);
                intent.putExtra(MEATERIntent.INTENT_FRAGMENT_TYPE, CookHistory.c.PreviousCookFragment.ordinal());
                intent.putExtra(MEATERIntent.INTENT_FRAGMENT_CONTEXT, CookHistory.b.history.ordinal());
                activity.startActivity(intent);
                D0.h(interfaceC1563p0, false);
                return C4153F.f46609a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C4153F r(Activity activity, C3109f c3109f, InterfaceC1563p0 interfaceC1563p0) {
                x4.b.j(b.EnumC0768b.f52699b0.title, "", "", null, 8, null);
                Intent intent = new Intent(activity, (Class<?>) CustomSettingActivity.class);
                intent.putExtra("MA", true);
                c3109f.a(intent);
                D0.h(interfaceC1563p0, false);
                return C4153F.f46609a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C4153F s(T5.m mVar, InterfaceC1563p0 interfaceC1563p0) {
                mVar.z();
                D0.h(interfaceC1563p0, false);
                return C4153F.f46609a;
            }

            @Override // Ba.q
            public /* bridge */ /* synthetic */ C4153F g(InterfaceC0801i interfaceC0801i, InterfaceC1554l interfaceC1554l, Integer num) {
                m(interfaceC0801i, interfaceC1554l, num.intValue());
                return C4153F.f46609a;
            }

            public final void m(InterfaceC0801i DropdownMenu, InterfaceC1554l interfaceC1554l, int i10) {
                C3862t.g(DropdownMenu, "$this$DropdownMenu");
                if ((i10 & 17) == 16 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-1292466062, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreenToolBar.<anonymous>.<anonymous> (MainScreenToolBar.kt:140)");
                }
                W.a aVarD = W.c.d(927430722, true, new b(this.f7306E), interfaceC1554l, 54);
                interfaceC1554l.S(284480219);
                boolean zL = interfaceC1554l.l(this.f7303B);
                final Activity activity = this.f7303B;
                final InterfaceC1563p0<Boolean> interfaceC1563p0 = this.f7307F;
                Object objF = interfaceC1554l.f();
                if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                    objF = new Ba.a() { // from class: J4.H0
                        @Override // Ba.a
                        public final Object invoke() {
                            return D0.c.a.n(activity, interfaceC1563p0);
                        }
                    };
                    interfaceC1554l.J(objF);
                }
                interfaceC1554l.I();
                C1280d.b(aVarD, (Ba.a) objF, null, null, null, false, null, null, null, interfaceC1554l, 6, 508);
                W.a aVarD2 = W.c.d(-1716582919, true, new C0152c(this.f7306E), interfaceC1554l, 54);
                interfaceC1554l.S(284518395);
                boolean zL2 = interfaceC1554l.l(this.f7303B);
                final Activity activity2 = this.f7303B;
                final InterfaceC1563p0<Boolean> interfaceC1563p02 = this.f7307F;
                Object objF2 = interfaceC1554l.f();
                if (zL2 || objF2 == InterfaceC1554l.INSTANCE.a()) {
                    objF2 = new Ba.a() { // from class: J4.I0
                        @Override // Ba.a
                        public final Object invoke() {
                            return D0.c.a.p(activity2, interfaceC1563p02);
                        }
                    };
                    interfaceC1554l.J(objF2);
                }
                interfaceC1554l.I();
                C1280d.b(aVarD2, (Ba.a) objF2, null, null, null, false, null, null, null, interfaceC1554l, 6, 508);
                W.a aVarD3 = W.c.d(831366586, true, new d(this.f7306E), interfaceC1554l, 54);
                interfaceC1554l.S(284556094);
                boolean zL3 = interfaceC1554l.l(this.f7303B);
                final Activity activity3 = this.f7303B;
                final InterfaceC1563p0<Boolean> interfaceC1563p03 = this.f7307F;
                Object objF3 = interfaceC1554l.f();
                if (zL3 || objF3 == InterfaceC1554l.INSTANCE.a()) {
                    objF3 = new Ba.a() { // from class: J4.J0
                        @Override // Ba.a
                        public final Object invoke() {
                            return D0.c.a.q(activity3, interfaceC1563p03);
                        }
                    };
                    interfaceC1554l.J(objF3);
                }
                interfaceC1554l.I();
                C1280d.b(aVarD3, (Ba.a) objF3, null, null, null, false, null, null, null, interfaceC1554l, 6, 508);
                W.a aVarD4 = W.c.d(-915651205, true, new e(this.f7306E), interfaceC1554l, 54);
                interfaceC1554l.S(284605446);
                boolean zL4 = interfaceC1554l.l(this.f7303B) | interfaceC1554l.l(this.f7304C);
                final Activity activity4 = this.f7303B;
                final C3109f<Intent, C3369a> c3109f = this.f7304C;
                final InterfaceC1563p0<Boolean> interfaceC1563p04 = this.f7307F;
                Object objF4 = interfaceC1554l.f();
                if (zL4 || objF4 == InterfaceC1554l.INSTANCE.a()) {
                    objF4 = new Ba.a() { // from class: J4.K0
                        @Override // Ba.a
                        public final Object invoke() {
                            return D0.c.a.r(activity4, c3109f, interfaceC1563p04);
                        }
                    };
                    interfaceC1554l.J(objF4);
                }
                interfaceC1554l.I();
                C1280d.b(aVarD4, (Ba.a) objF4, null, null, null, false, null, null, null, interfaceC1554l, 6, 508);
                Config.Companion companion = Config.INSTANCE;
                if (companion.getInstance().DEBUG_UI_ENABLED) {
                    interfaceC1554l.S(284623873);
                    if (companion.getInstance().SHOULD_SHOW_RECIPE) {
                        W.a aVarD5 = W.c.d(-1004748232, true, new f(this.f7306E), interfaceC1554l, 54);
                        interfaceC1554l.S(284654592);
                        boolean zL5 = interfaceC1554l.l(this.f7305D);
                        final T5.m mVar = this.f7305D;
                        final InterfaceC1563p0<Boolean> interfaceC1563p05 = this.f7307F;
                        Object objF5 = interfaceC1554l.f();
                        if (zL5 || objF5 == InterfaceC1554l.INSTANCE.a()) {
                            objF5 = new Ba.a() { // from class: J4.L0
                                @Override // Ba.a
                                public final Object invoke() {
                                    return D0.c.a.s(mVar, interfaceC1563p05);
                                }
                            };
                            interfaceC1554l.J(objF5);
                        }
                        interfaceC1554l.I();
                        C1280d.b(aVarD5, (Ba.a) objF5, null, null, null, false, null, null, null, interfaceC1554l, 6, 508);
                    }
                    interfaceC1554l.I();
                    W.a aVarD6 = W.c.d(1188235293, true, new C0151a(this.f7308G, this.f7306E), interfaceC1554l, 54);
                    interfaceC1554l.S(284707609);
                    boolean zL6 = interfaceC1554l.l(this.f7303B);
                    final Activity activity5 = this.f7303B;
                    final InterfaceC1563p0<Boolean> interfaceC1563p06 = this.f7307F;
                    Object objF6 = interfaceC1554l.f();
                    if (zL6 || objF6 == InterfaceC1554l.INSTANCE.a()) {
                        objF6 = new Ba.a() { // from class: J4.M0
                            @Override // Ba.a
                            public final Object invoke() {
                                return D0.c.a.o(activity5, interfaceC1563p06);
                            }
                        };
                        interfaceC1554l.J(objF6);
                    }
                    interfaceC1554l.I();
                    C1280d.b(aVarD6, (Ba.a) objF6, null, null, null, false, null, null, null, interfaceC1554l, 6, 508);
                }
                if (C1560o.J()) {
                    C1560o.R();
                }
            }
        }

        c(InterfaceC1563p0<Boolean> interfaceC1563p0, Activity activity, C3109f<Intent, C3369a> c3109f, T5.m mVar, b0.i iVar, NetworkConstant networkConstant) {
            this.f7297B = interfaceC1563p0;
            this.f7298C = activity;
            this.f7299D = c3109f;
            this.f7300E = mVar;
            this.f7301F = iVar;
            this.f7302G = networkConstant;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4153F d(InterfaceC1563p0 interfaceC1563p0) {
            D0.h(interfaceC1563p0, !D0.g(interfaceC1563p0));
            return C4153F.f46609a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4153F i(InterfaceC1563p0 interfaceC1563p0) {
            D0.h(interfaceC1563p0, false);
            return C4153F.f46609a;
        }

        public final void c(A.W TopAppBar, InterfaceC1554l interfaceC1554l, int i10) {
            C3862t.g(TopAppBar, "$this$TopAppBar");
            if ((i10 & 17) == 16 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1257340041, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreenToolBar.<anonymous> (MainScreenToolBar.kt:124)");
            }
            interfaceC1554l.S(-1888458796);
            final InterfaceC1563p0<Boolean> interfaceC1563p0 = this.f7297B;
            Object objF = interfaceC1554l.f();
            InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
            if (objF == companion.a()) {
                objF = new Ba.a() { // from class: J4.F0
                    @Override // Ba.a
                    public final Object invoke() {
                        return D0.c.d(interfaceC1563p0);
                    }
                };
                interfaceC1554l.J(objF);
            }
            interfaceC1554l.I();
            C1249A.a((Ba.a) objF, null, false, null, null, C1231o.f7510a.b(), interfaceC1554l, 196614, 30);
            b0.i iVarB = androidx.compose.foundation.b.b(b0.i.INSTANCE, D0.b.a(R.color.dropdown_menu_background, interfaceC1554l, 6), null, 2, null);
            boolean zG = D0.g(this.f7297B);
            interfaceC1554l.S(-1888440346);
            final InterfaceC1563p0<Boolean> interfaceC1563p02 = this.f7297B;
            Object objF2 = interfaceC1554l.f();
            if (objF2 == companion.a()) {
                objF2 = new Ba.a() { // from class: J4.G0
                    @Override // Ba.a
                    public final Object invoke() {
                        return D0.c.i(interfaceC1563p02);
                    }
                };
                interfaceC1554l.J(objF2);
            }
            interfaceC1554l.I();
            C1280d.a(zG, (Ba.a) objF2, iVarB, 0L, null, null, null, 0L, 0.0f, 0.0f, null, W.c.d(-1292466062, true, new a(this.f7298C, this.f7299D, this.f7300E, this.f7301F, this.f7297B, this.f7302G), interfaceC1554l, 54), interfaceC1554l, 48, 48, 2040);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(A.W w10, InterfaceC1554l interfaceC1554l, Integer num) {
            c(w10, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public static final void d(final InterfaceC1279c0 scrollBehavior, final x1<? extends CloudMQTTConnectionState> cloudStatus, final C3109f<Intent, C3369a> settingScreenLauncher, final T5.m viewModel, InterfaceC1554l interfaceC1554l, final int i10) {
        C3862t.g(scrollBehavior, "scrollBehavior");
        C3862t.g(cloudStatus, "cloudStatus");
        C3862t.g(settingScreenLauncher, "settingScreenLauncher");
        C3862t.g(viewModel, "viewModel");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(438462408);
        if (C1560o.J()) {
            C1560o.S(438462408, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreenToolBar (MainScreenToolBar.kt:66)");
        }
        interfaceC1554lR.S(-1187770420);
        Object objF = interfaceC1554lR.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = r1.c(Boolean.FALSE, null, 2, null);
            interfaceC1554lR.J(objF);
        }
        final InterfaceC1563p0 interfaceC1563p0 = (InterfaceC1563p0) objF;
        interfaceC1554lR.I();
        interfaceC1554lR.S(-1187768372);
        Object objF2 = interfaceC1554lR.f();
        if (objF2 == companion.a()) {
            objF2 = r1.c(Boolean.FALSE, null, 2, null);
            interfaceC1554lR.J(objF2);
        }
        InterfaceC1563p0 interfaceC1563p02 = (InterfaceC1563p0) objF2;
        interfaceC1554lR.I();
        Object objO = interfaceC1554lR.o(androidx.compose.ui.platform.M.g());
        C3862t.e(objO, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) objO;
        b0.i iVarM = androidx.compose.foundation.layout.r.m(b0.i.INSTANCE, U0.h.u(20));
        interfaceC1554lR.e(414512006);
        fd.a aVarE = C1724d.e(interfaceC1554lR, 0);
        x1 x1VarM = m1.m(null, interfaceC1554lR, 0);
        interfaceC1554lR.e(855641119);
        boolean zR = interfaceC1554lR.R(null) | interfaceC1554lR.R(aVarE);
        Object objF3 = interfaceC1554lR.f();
        if (zR || objF3 == companion.a()) {
            objF3 = aVarE.c(kotlin.jvm.internal.P.b(NetworkConstant.class), null, new a(x1VarM));
            interfaceC1554lR.J(objF3);
        }
        interfaceC1554lR.O();
        interfaceC1554lR.O();
        C1282e.d(C1231o.f7510a.a(), null, W.c.d(221111822, true, new b(interfaceC1563p0, cloudStatus), interfaceC1554lR, 54), W.c.d(-1257340041, true, new c(interfaceC1563p02, activity, settingScreenLauncher, viewModel, iVarM, (NetworkConstant) objF3), interfaceC1554lR, 54), 0.0f, null, C1277b0.f8228a.f(D0.b.a(R.color.dashboard_background, interfaceC1554lR, 6), 0L, 0L, D0.b.a(R.color.black_color, interfaceC1554lR, 6), 0L, interfaceC1554lR, C1277b0.f8234g << 15, 22), scrollBehavior, interfaceC1554lR, ((i10 << 21) & 29360128) | 3462, 50);
        if (e(interfaceC1563p0)) {
            PopupContent popupContentO = C1225l.o(activity);
            if (popupContentO == null) {
                f(interfaceC1563p0, false);
            }
            if (popupContentO != null) {
                interfaceC1554lR.S(-1888165313);
                Object objF4 = interfaceC1554lR.f();
                if (objF4 == companion.a()) {
                    objF4 = new Ba.a() { // from class: J4.A0
                        @Override // Ba.a
                        public final Object invoke() {
                            return D0.i(interfaceC1563p0);
                        }
                    };
                    interfaceC1554lR.J(objF4);
                }
                interfaceC1554lR.I();
                C1225l.i(popupContentO, (Ba.a) objF4, interfaceC1554lR, 48);
            }
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.B0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return D0.j(scrollBehavior, cloudStatus, settingScreenLauncher, viewModel, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean e(InterfaceC1563p0<Boolean> interfaceC1563p0) {
        return interfaceC1563p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(InterfaceC1563p0<Boolean> interfaceC1563p0, boolean z10) {
        interfaceC1563p0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(InterfaceC1563p0<Boolean> interfaceC1563p0) {
        return interfaceC1563p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(InterfaceC1563p0<Boolean> interfaceC1563p0, boolean z10) {
        interfaceC1563p0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F i(InterfaceC1563p0 interfaceC1563p0) {
        f(interfaceC1563p0, false);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F j(InterfaceC1279c0 interfaceC1279c0, x1 x1Var, C3109f c3109f, T5.m mVar, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        d(interfaceC1279c0, x1Var, c3109f, mVar, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void k(final String title, InterfaceC1554l interfaceC1554l, final int i10) {
        C3862t.g(title, "title");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1541898908);
        if (C1560o.J()) {
            C1560o.S(-1541898908, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.TopBarWithImageAndText (MainScreenToolBar.kt:321)");
        }
        i.Companion companion = b0.i.INSTANCE;
        b0.i iVarH = androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.d(companion, 0.0f, 1, null), 0.0f, 1, null);
        C0794b.e eVarB = C0794b.f54a.b();
        c.Companion companion2 = b0.c.INSTANCE;
        y0.I iB = A.U.b(eVarB, companion2.i(), interfaceC1554lR, 54);
        int iA = C1550j.a(interfaceC1554lR, 0);
        InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
        b0.i iVarE = b0.h.e(interfaceC1554lR, iVarH);
        InterfaceC0828g.Companion companion3 = InterfaceC0828g.INSTANCE;
        Ba.a<InterfaceC0828g> aVarA = companion3.a();
        if (interfaceC1554lR.w() == null) {
            C1550j.c();
        }
        interfaceC1554lR.t();
        if (interfaceC1554lR.getInserting()) {
            interfaceC1554lR.T(aVarA);
        } else {
            interfaceC1554lR.H();
        }
        InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554lR);
        C1.b(interfaceC1554lA, iB, companion3.c());
        C1.b(interfaceC1554lA, interfaceC1578xF, companion3.e());
        Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion3.b();
        if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
            interfaceC1554lA.J(Integer.valueOf(iA));
            interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
        }
        C1.b(interfaceC1554lA, iVarE, companion3.d());
        A.X x10 = A.X.f45a;
        w.y.a(D0.e.c(R.drawable.meater_recommends_icon, interfaceC1554lR, 6), null, x10.b(androidx.compose.foundation.layout.r.m(androidx.compose.foundation.layout.o.m(companion, 0.0f, 0.0f, U0.h.u(4), 0.0f, 11, null), U0.h.u(36)), companion2.i()), null, null, 0.0f, null, interfaceC1554lR, 48, TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES);
        C1273Z.b(title, x10.b(companion, companion2.i()), D0.b.a(R.color.black_color, interfaceC1554lR, 6), U0.w.e(26), null, FontWeight.INSTANCE.c(), T0.b(), 0L, null, R0.i.h(R0.i.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, interfaceC1554lR, (i10 & 14) | 1772544, 0, 130448);
        interfaceC1554lR.P();
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.C0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return D0.l(title, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F l(String str, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        k(str, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }
}
