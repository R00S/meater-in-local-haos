package v4;

import A.C0794b;
import A.C0799g;
import A.C0802j;
import A0.InterfaceC0828g;
import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import b0.c;
import b0.i;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.SensorResistance;
import com.apptionlabs.meater_app.model.UiState;
import java.text.NumberFormat;
import java.util.List;
import kotlin.C1;
import kotlin.C1259K;
import kotlin.C1266S;
import kotlin.C1278c;
import kotlin.C1286g;
import kotlin.C1287h;
import kotlin.C1289j;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import kotlin.x1;
import oa.C4153F;
import v4.L0;

/* compiled from: ProbeCalibrationCertificate.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\u0004\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LT5/a;", "viewModel", "Loa/F;", "h", "(LT5/a;LO/l;I)V", "", "shouldShowDialog", "e", "(ZLO/l;I)V", "j", "", "number", "", "l", "(F)Ljava/lang/String;", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L0 {

    /* compiled from: ProbeCalibrationCertificate.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Activity f51304B;

        a(Activity activity) {
            this.f51304B = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4153F c(Activity activity) {
            if (activity != null) {
                activity.finish();
            }
            return C4153F.f46609a;
        }

        public final void b(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-806931675, i10, -1, "com.apptionlabs.meater_app.activities.ErrorDialog.<anonymous> (ProbeCalibrationCertificate.kt:146)");
            }
            C1286g c1286gB = C1287h.f8410a.b(D0.b.a(R.color.primary_color, interfaceC1554l, 6), 0L, 0L, 0L, interfaceC1554l, C1287h.f8424o << 12, 14);
            interfaceC1554l.S(-60494620);
            boolean zL = interfaceC1554l.l(this.f51304B);
            final Activity activity = this.f51304B;
            Object objF = interfaceC1554l.f();
            if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new Ba.a() { // from class: v4.K0
                    @Override // Ba.a
                    public final Object invoke() {
                        return L0.a.c(activity);
                    }
                };
                interfaceC1554l.J(objF);
            }
            interfaceC1554l.I();
            C1289j.a((Ba.a) objF, null, false, null, c1286gB, null, null, null, null, C4855h.f51356a.c(), interfaceC1554l, 805306368, 494);
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

    /* compiled from: ProbeCalibrationCertificate.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Ba.q<A.N, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ x1<UiState> f51305B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ T5.a f51306C;

        /* JADX WARN: Multi-variable type inference failed */
        b(x1<? extends UiState> x1Var, T5.a aVar) {
            this.f51305B = x1Var;
            this.f51306C = aVar;
        }

        public final void a(A.N innerPadding, InterfaceC1554l interfaceC1554l, int i10) throws Resources.NotFoundException {
            int i11;
            C3862t.g(innerPadding, "innerPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC1554l.R(innerPadding) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-42089181, i11, -1, "com.apptionlabs.meater_app.activities.Screen.<anonymous> (ProbeCalibrationCertificate.kt:82)");
            }
            i.Companion companion = b0.i.INSTANCE;
            float f10 = 8;
            float f11 = 16;
            b0.i iVarL = androidx.compose.foundation.layout.o.l(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.o.h(androidx.compose.foundation.layout.r.e(companion, 1.0f), innerPadding), D0.b.a(R.color.screen_default_color, interfaceC1554l, 6), null, 2, null), U0.h.u(f10), U0.h.u(f11), U0.h.u(f10), U0.h.u(f11));
            x1<UiState> x1Var = this.f51305B;
            T5.a aVar = this.f51306C;
            c.Companion companion2 = b0.c.INSTANCE;
            y0.I iH = androidx.compose.foundation.layout.d.h(companion2.o(), false);
            int iA = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            b0.i iVarE = b0.h.e(interfaceC1554l, iVarL);
            InterfaceC0828g.Companion companion3 = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion3.a();
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
            C1.b(interfaceC1554lA, iH, companion3.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion3.e());
            Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion3.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion3.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
            UiState value = x1Var.getValue();
            if (value instanceof UiState.Error) {
                interfaceC1554l.S(544956082);
                L0.e(true, interfaceC1554l, 6);
                interfaceC1554l.I();
            } else if (C3862t.b(value, UiState.Loading.INSTANCE)) {
                interfaceC1554l.S(545057793);
                C1259K.a(fVar.a(androidx.compose.foundation.layout.r.m(companion, U0.h.u(60)), companion2.e()), D0.b.a(R.color.primary_color, interfaceC1554l, 6), 0.0f, 0L, 0, interfaceC1554l, 0, 28);
                interfaceC1554l.I();
            } else if (value instanceof UiState.Success) {
                interfaceC1554l.S(545460576);
                b0.i iVarD = androidx.compose.foundation.m.d(fVar.a(androidx.compose.foundation.layout.r.c(androidx.compose.foundation.layout.r.p(companion, 0.0f, 0.0f, U0.h.u(((Configuration) interfaceC1554l.o(androidx.compose.ui.platform.M.f())).orientation == 2 ? 600 : 2200), 0.0f, 11, null), 1.0f), companion2.e()), androidx.compose.foundation.m.a(0, interfaceC1554l, 0, 1), false, null, false, 14, null);
                y0.I iA2 = C0799g.a(C0794b.f54a.f(), companion2.k(), interfaceC1554l, 0);
                int iA3 = C1550j.a(interfaceC1554l, 0);
                InterfaceC1578x interfaceC1578xF2 = interfaceC1554l.F();
                b0.i iVarE2 = b0.h.e(interfaceC1554l, iVarD);
                Ba.a<InterfaceC0828g> aVarA2 = companion3.a();
                if (interfaceC1554l.w() == null) {
                    C1550j.c();
                }
                interfaceC1554l.t();
                if (interfaceC1554l.getInserting()) {
                    interfaceC1554l.T(aVarA2);
                } else {
                    interfaceC1554l.H();
                }
                InterfaceC1554l interfaceC1554lA2 = C1.a(interfaceC1554l);
                C1.b(interfaceC1554lA2, iA2, companion3.c());
                C1.b(interfaceC1554lA2, interfaceC1578xF2, companion3.e());
                Ba.p<InterfaceC0828g, Integer, C4153F> pVarB2 = companion3.b();
                if (interfaceC1554lA2.getInserting() || !C3862t.b(interfaceC1554lA2.f(), Integer.valueOf(iA3))) {
                    interfaceC1554lA2.J(Integer.valueOf(iA3));
                    interfaceC1554lA2.k(Integer.valueOf(iA3), pVarB2);
                }
                C1.b(interfaceC1554lA2, iVarE2, companion3.d());
                C0802j c0802j = C0802j.f149a;
                L0.j(aVar, interfaceC1554l, 0);
                interfaceC1554l.P();
                interfaceC1554l.I();
            } else {
                if (value != null) {
                    interfaceC1554l.S(-398063416);
                    interfaceC1554l.I();
                    throw new NoWhenBranchMatchedException();
                }
                interfaceC1554l.S(545989777);
                L0.e(true, interfaceC1554l, 6);
                interfaceC1554l.I();
            }
            interfaceC1554l.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(A.N n10, InterfaceC1554l interfaceC1554l, Integer num) throws Resources.NotFoundException {
            a(n10, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public static final void e(final boolean z10, InterfaceC1554l interfaceC1554l, final int i10) {
        int i11;
        InterfaceC1554l interfaceC1554l2;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(29118552);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.c(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
            interfaceC1554l2 = interfaceC1554lR;
        } else {
            if (C1560o.J()) {
                C1560o.S(29118552, i11, -1, "com.apptionlabs.meater_app.activities.ErrorDialog (ProbeCalibrationCertificate.kt:131)");
            }
            Object objO = interfaceC1554lR.o(androidx.compose.ui.platform.M.g());
            Activity activity = objO instanceof Activity ? (Activity) objO : null;
            if (z10) {
                interfaceC1554lR.S(-933086574);
                Object objF = interfaceC1554lR.f();
                if (objF == InterfaceC1554l.INSTANCE.a()) {
                    objF = new Ba.a() { // from class: v4.I0
                        @Override // Ba.a
                        public final Object invoke() {
                            return L0.f();
                        }
                    };
                    interfaceC1554lR.J(objF);
                }
                interfaceC1554lR.I();
                W.a aVarD = W.c.d(-806931675, true, new a(activity), interfaceC1554lR, 54);
                C4855h c4855h = C4855h.f51356a;
                Ba.p<InterfaceC1554l, Integer, C4153F> pVarD = c4855h.d();
                Ba.p<InterfaceC1554l, Integer, C4153F> pVarE = c4855h.e();
                interfaceC1554l2 = interfaceC1554lR;
                C1278c.a((Ba.a) objF, aVarD, null, null, null, pVarD, pVarE, null, 0L, 0L, 0L, 0L, 0.0f, null, interfaceC1554l2, 1769526, 0, 16284);
            } else {
                interfaceC1554l2 = interfaceC1554lR;
            }
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        kotlin.W0 w0Y = interfaceC1554l2.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: v4.J0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return L0.g(z10, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F f() {
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F g(boolean z10, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        e(z10, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void h(final T5.a viewModel, InterfaceC1554l interfaceC1554l, final int i10) {
        int i11;
        InterfaceC1554l interfaceC1554l2;
        C3862t.g(viewModel, "viewModel");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1816904914);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.l(viewModel) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
            interfaceC1554l2 = interfaceC1554lR;
        } else {
            if (C1560o.J()) {
                C1560o.S(1816904914, i11, -1, "com.apptionlabs.meater_app.activities.Screen (ProbeCalibrationCertificate.kt:67)");
            }
            x1 x1VarA = X.b.a(viewModel.l(), interfaceC1554lR, 0);
            b0.i iVarF = androidx.compose.foundation.layout.r.f(b0.i.INSTANCE, 0.0f, 1, null);
            Ba.p<InterfaceC1554l, Integer, C4153F> pVarB = C4855h.f51356a.b();
            W.a aVarD = W.c.d(-42089181, true, new b(x1VarA, viewModel), interfaceC1554lR, 54);
            interfaceC1554l2 = interfaceC1554lR;
            C1266S.a(iVarF, pVarB, null, null, null, 0, 0L, 0L, null, aVarD, interfaceC1554lR, 805306422, 508);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        kotlin.W0 w0Y = interfaceC1554l2.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: v4.G0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return L0.i(viewModel, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F i(T5.a aVar, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        h(aVar, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void j(final T5.a viewModel, InterfaceC1554l interfaceC1554l, final int i10) throws Resources.NotFoundException {
        C3862t.g(viewModel, "viewModel");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1642382863);
        int i11 = (i10 & 6) == 0 ? (interfaceC1554lR.l(viewModel) ? 4 : 2) | i10 : i10;
        if ((i11 & 3) == 2 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(1642382863, i11, -1, "com.apptionlabs.meater_app.activities.ScreenCells (ProbeCalibrationCertificate.kt:163)");
            }
            String strA = D0.h.a(R.string.information, interfaceC1554lR, 6);
            String strA2 = D0.h.a(R.string.date_of_test, interfaceC1554lR, 6);
            String calibrationTestDate = viewModel.k().getCalibrationTestDate();
            C3862t.f(calibrationTestDate, "getCalibrationTestDate(...)");
            G4.d.d(strA, strA2, calibrationTestDate, D0.h.a(R.string.engineering_units, interfaceC1554lR, 6), "°C", D0.h.a(R.string.resolution, interfaceC1554lR, 6), l(0.1f) + "°C", interfaceC1554lR, 24576);
            G4.d.f(D0.h.a(R.string.laboratory_environmental_conditions, interfaceC1554lR, 6), D0.h.a(R.string.setting_screen_heading_1, interfaceC1554lR, 6), l(23.0f) + "°C ± " + l(5.0f) + "°C ", D0.h.a(R.string.relative_humidity, interfaceC1554lR, 6), "30% to 80%", interfaceC1554lR, 24576);
            String strA3 = D0.h.a(R.string.reference_temperatures, interfaceC1554lR, 6);
            String strA4 = D0.h.a(R.string.bath_zero_c, interfaceC1554lR, 6);
            Float bath0C = viewModel.k().getBath0C();
            C3862t.f(bath0C, "getBath0C(...)");
            String str = l(bath0C.floatValue()) + "°C";
            String strA5 = D0.h.a(R.string.bath_fifty_c, interfaceC1554lR, 6);
            Float bath50C = viewModel.k().getBath50C();
            C3862t.f(bath50C, "getBath50C(...)");
            String str2 = l(bath50C.floatValue()) + "°C";
            String strA6 = D0.h.a(R.string.bath_one_hundred_c, interfaceC1554lR, 6);
            Float bath100C = viewModel.k().getBath100C();
            C3862t.f(bath100C, "getBath100C(...)");
            G4.d.d(strA3, strA4, str, strA5, str2, strA6, l(bath100C.floatValue()) + "°C", interfaceC1554lR, 0);
            List<SensorResistance> sensorResistances = viewModel.k().getSensorResistances();
            interfaceC1554lR.S(-2057067565);
            for (SensorResistance sensorResistance : sensorResistances) {
                String str3 = "Sensor " + sensorResistance.sensorNumber;
                String strA7 = D0.h.a(R.string.temperature_zero_c, interfaceC1554lR, 6);
                Float temperature0C = sensorResistance.temperature0C;
                C3862t.f(temperature0C, "temperature0C");
                String str4 = l(temperature0C.floatValue()) + "°C";
                String strA8 = D0.h.a(R.string.temperature_fifty_c, interfaceC1554lR, 6);
                Float temperature50C = sensorResistance.temperature50C;
                C3862t.f(temperature50C, "temperature50C");
                String str5 = l(temperature50C.floatValue()) + "°C";
                String strA9 = D0.h.a(R.string.temperature_one_hundred_c, interfaceC1554lR, 6);
                Float temperature100C = sensorResistance.temperature100C;
                C3862t.f(temperature100C, "temperature100C");
                G4.d.d(str3, strA7, str4, strA8, str5, strA9, l(temperature100C.floatValue()) + "°C", interfaceC1554lR, 0);
            }
            interfaceC1554lR.I();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        kotlin.W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: v4.H0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return L0.k(viewModel, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F k(T5.a aVar, int i10, InterfaceC1554l interfaceC1554l, int i11) throws Resources.NotFoundException {
        j(aVar, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    private static final String l(float f10) {
        try {
            return NumberFormat.getInstance().format(Float.valueOf(f10));
        } catch (Exception unused) {
            return String.valueOf(f10);
        }
    }
}
