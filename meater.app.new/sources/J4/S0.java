package J4;

import A.C0794b;
import A.C0811t;
import A0.InterfaceC0828g;
import H0.C1060d;
import H0.SpanStyle;
import P5.EnumC1593a;
import P5.EnumC1600h;
import android.content.res.Configuration;
import b0.i;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.model.Probe;
import kotlin.C1;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.W0;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Temperature.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LO4/g;", "whichType", "LU0/h;", "size", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "", "outerText", "", "color", "LU0/v;", "innerTextSize", "Loa/F;", "e", "(LO4/g;FLcom/apptionlabs/meater_app/model/Probe;Ljava/lang/String;IJLO/l;I)V", "LP5/h;", "contentType", "h", "(LP5/h;Lcom/apptionlabs/meater_app/model/Probe;LO/l;I)V", "LP5/a;", "scaleType", "g", "(LP5/h;LP5/a;Lcom/apptionlabs/meater_app/model/Probe;LO/l;I)V", "k", "(LO4/g;Lcom/apptionlabs/meater_app/model/Probe;Ljava/lang/String;IJLO/l;I)V", "temperature", "LH0/d;", "m", "(Ljava/lang/String;J)LH0/d;", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class S0 {

    /* compiled from: Temperature.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Ba.q<A.A, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Probe f7421B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ long f7422C;

        a(Probe probe, long j10) {
            this.f7421B = probe;
            this.f7422C = j10;
        }

        public final void a(A.A FlowRow, InterfaceC1554l interfaceC1554l, int i10) {
            C3862t.g(FlowRow, "$this$FlowRow");
            if ((i10 & 17) == 16 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1969480084, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.TemperatureRow.<anonymous> (Temperature.kt:402)");
            }
            S0.k(O4.g.f13259B, this.f7421B, D0.h.a(R.string.internal_label, interfaceC1554l, 6), R.color.internal_temperature, this.f7422C, interfaceC1554l, 3078);
            i.Companion companion = b0.i.INSTANCE;
            float f10 = 8;
            A.Y.a(androidx.compose.foundation.layout.r.q(companion, U0.h.u(f10)), interfaceC1554l, 6);
            S0.k(O4.g.f13260C, this.f7421B, D0.h.a(R.string.target_label, interfaceC1554l, 6), R.color.aqua, this.f7422C, interfaceC1554l, 3078);
            A.Y.a(androidx.compose.foundation.layout.r.q(companion, U0.h.u(f10)), interfaceC1554l, 6);
            S0.k(O4.g.f13261D, this.f7421B, D0.h.a(R.string.ambient_label, interfaceC1554l, 6), R.color.green_61, this.f7422C, interfaceC1554l, 3078);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(A.A a10, InterfaceC1554l interfaceC1554l, Integer num) {
            a(a10, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Temperature.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7423a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7424b;

        static {
            int[] iArr = new int[O4.g.values().length];
            try {
                iArr[O4.g.f13259B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O4.g.f13260C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O4.g.f13261D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7423a = iArr;
            int[] iArr2 = new int[EnumC1600h.values().length];
            try {
                iArr2[EnumC1600h.f14039B.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC1600h.f14040C.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC1600h.f14041D.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC1600h.f14042E.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC1600h.f14043F.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC1600h.f14044G.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC1600h.f14045H.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            f7424b = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final O4.g r35, final float r36, final com.apptionlabs.meater_app.model.Probe r37, final java.lang.String r38, final int r39, final long r40, kotlin.InterfaceC1554l r42, final int r43) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J4.S0.e(O4.g, float, com.apptionlabs.meater_app.model.Probe, java.lang.String, int, long, O.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F f(O4.g gVar, float f10, Probe probe, String str, int i10, long j10, int i11, InterfaceC1554l interfaceC1554l, int i12) {
        e(gVar, f10, probe, str, i10, j10, interfaceC1554l, C1509K0.a(i11 | 1));
        return C4153F.f46609a;
    }

    public static final void g(final EnumC1600h contentType, final EnumC1593a scaleType, final Probe probe, InterfaceC1554l interfaceC1554l, final int i10) {
        long jE;
        C3862t.g(contentType, "contentType");
        C3862t.g(scaleType, "scaleType");
        C3862t.g(probe, "probe");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1813495153);
        if (C1560o.J()) {
            C1560o.S(1813495153, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.TemperatureRow (Temperature.kt:368)");
        }
        float fU = U0.h.u(((Configuration) interfaceC1554lR.o(androidx.compose.ui.platform.M.f())).screenWidthDp);
        switch (b.f7424b[contentType.ordinal()]) {
            case 1:
                jE = U0.w.e(20);
                break;
            case 2:
                jE = U0.w.e(26);
                break;
            case 3:
                jE = U0.w.e(26);
                break;
            case 4:
            case 5:
                jE = U0.w.e(22);
                break;
            case 6:
                jE = U0.w.e(22);
                break;
            case 7:
                if (U0.h.t(fU, U0.h.u(350)) <= 0) {
                    jE = U0.w.e(16);
                    break;
                } else {
                    jE = U0.w.e(17);
                    break;
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
        C0811t.a(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), C0794b.f54a.d(), null, 0, 0, null, W.c.d(-1969480084, true, new a(probe, jE), interfaceC1554lR, 54), interfaceC1554lR, 1572918, 60);
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.P0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return S0.j(contentType, scaleType, probe, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void h(final EnumC1600h contentType, final Probe probe, InterfaceC1554l interfaceC1554l, final int i10) {
        long jE;
        C3862t.g(contentType, "contentType");
        C3862t.g(probe, "probe");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1898846989);
        if (C1560o.J()) {
            C1560o.S(1898846989, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.TemperatureRow (Temperature.kt:142)");
        }
        float fU = U0.h.u(((Configuration) interfaceC1554lR.o(androidx.compose.ui.platform.M.f())).screenWidthDp);
        boolean zN1 = x4.g.t().n1();
        int[] iArr = b.f7424b;
        switch (iArr[contentType.ordinal()]) {
            case 1:
                if (!zN1) {
                    jE = U0.w.e(20);
                    break;
                } else {
                    jE = U0.w.e(20);
                    break;
                }
            case 2:
                if (!zN1) {
                    jE = U0.w.e(26);
                    break;
                } else {
                    jE = U0.w.e(22);
                    break;
                }
            case 3:
                if (!zN1) {
                    jE = U0.w.e(26);
                    break;
                } else {
                    jE = U0.w.e(22);
                    break;
                }
            case 4:
            case 5:
                if (!zN1) {
                    jE = U0.w.e(22);
                    break;
                } else {
                    jE = U0.w.e(19);
                    break;
                }
            case 6:
                if (!zN1) {
                    jE = U0.w.e(22);
                    break;
                } else {
                    jE = U0.w.e(19);
                    break;
                }
            case 7:
                if (U0.h.t(fU, U0.h.u(350)) <= 0) {
                    if (!zN1) {
                        jE = U0.w.e(16);
                        break;
                    } else {
                        jE = U0.w.e(14);
                        break;
                    }
                } else if (!zN1) {
                    jE = U0.w.e(17);
                    break;
                } else {
                    jE = U0.w.e(16);
                    break;
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
        long j10 = jE;
        int i11 = contentType == EnumC1600h.f14043F ? 50 : 70;
        switch (iArr[contentType.ordinal()]) {
            case 1:
                interfaceC1554lR.S(-1052622034);
                i.Companion companion = b0.i.INSTANCE;
                y0.I iB = A.U.b(C0794b.f54a.e(), b0.c.INSTANCE.l(), interfaceC1554lR, 0);
                int iA = C1550j.a(interfaceC1554lR, 0);
                InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
                b0.i iVarE = b0.h.e(interfaceC1554lR, companion);
                InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
                Ba.a<InterfaceC0828g> aVarA = companion2.a();
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
                C1.b(interfaceC1554lA, iB, companion2.c());
                C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
                Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
                if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                    interfaceC1554lA.J(Integer.valueOf(iA));
                    interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                }
                C1.b(interfaceC1554lA, iVarE, companion2.d());
                A.X x10 = A.X.f45a;
                float f10 = 55;
                int i12 = ((i10 << 3) & 896) | 24630;
                e(O4.g.f13259B, U0.h.u(f10), probe, D0.h.a(R.string.internal_label, interfaceC1554lR, 6), R.color.internal_temperature, j10, interfaceC1554lR, i12);
                float f11 = 8;
                A.Y.a(androidx.compose.foundation.layout.r.q(companion, U0.h.u(f11)), interfaceC1554lR, 6);
                e(O4.g.f13260C, U0.h.u(f10), probe, D0.h.a(R.string.target_label, interfaceC1554lR, 6), R.color.aqua, j10, interfaceC1554lR, i12);
                A.Y.a(androidx.compose.foundation.layout.r.q(companion, U0.h.u(f11)), interfaceC1554lR, 6);
                e(O4.g.f13261D, U0.h.u(f10), probe, D0.h.a(R.string.ambient_label, interfaceC1554lR, 6), R.color.green_61, j10, interfaceC1554lR, i12);
                interfaceC1554lR.P();
                interfaceC1554lR.I();
                C4153F c4153f = C4153F.f46609a;
                break;
            case 2:
            case 3:
            case 6:
                interfaceC1554lR.S(-1051192097);
                i.Companion companion3 = b0.i.INSTANCE;
                b0.i iVarG = androidx.compose.foundation.layout.r.g(companion3, 0.55f);
                y0.I iB2 = A.U.b(C0794b.f54a.e(), b0.c.INSTANCE.l(), interfaceC1554lR, 0);
                int iA2 = C1550j.a(interfaceC1554lR, 0);
                InterfaceC1578x interfaceC1578xF2 = interfaceC1554lR.F();
                b0.i iVarE2 = b0.h.e(interfaceC1554lR, iVarG);
                InterfaceC0828g.Companion companion4 = InterfaceC0828g.INSTANCE;
                Ba.a<InterfaceC0828g> aVarA2 = companion4.a();
                if (interfaceC1554lR.w() == null) {
                    C1550j.c();
                }
                interfaceC1554lR.t();
                if (interfaceC1554lR.getInserting()) {
                    interfaceC1554lR.T(aVarA2);
                } else {
                    interfaceC1554lR.H();
                }
                InterfaceC1554l interfaceC1554lA2 = C1.a(interfaceC1554lR);
                C1.b(interfaceC1554lA2, iB2, companion4.c());
                C1.b(interfaceC1554lA2, interfaceC1578xF2, companion4.e());
                Ba.p<InterfaceC0828g, Integer, C4153F> pVarB2 = companion4.b();
                if (interfaceC1554lA2.getInserting() || !C3862t.b(interfaceC1554lA2.f(), Integer.valueOf(iA2))) {
                    interfaceC1554lA2.J(Integer.valueOf(iA2));
                    interfaceC1554lA2.k(Integer.valueOf(iA2), pVarB2);
                }
                C1.b(interfaceC1554lA2, iVarE2, companion4.d());
                A.X x11 = A.X.f45a;
                A.Y.a(A.W.c(x11, companion3, 1.0f, false, 2, null), interfaceC1554lR, 0);
                float f12 = 70;
                int i13 = ((i10 << 3) & 896) | 24630;
                e(O4.g.f13259B, U0.h.u(f12), probe, D0.h.a(R.string.internal_label, interfaceC1554lR, 6), R.color.internal_temperature, j10, interfaceC1554lR, i13);
                A.Y.a(A.W.c(x11, companion3, 1.0f, false, 2, null), interfaceC1554lR, 0);
                e(O4.g.f13260C, U0.h.u(f12), probe, D0.h.a(R.string.target_label, interfaceC1554lR, 6), R.color.aqua, j10, interfaceC1554lR, i13);
                A.Y.a(A.W.c(x11, companion3, 1.0f, false, 2, null), interfaceC1554lR, 0);
                e(O4.g.f13261D, U0.h.u(f12), probe, D0.h.a(R.string.ambient_label, interfaceC1554lR, 6), R.color.green_61, j10, interfaceC1554lR, i13);
                A.Y.a(A.W.c(x11, companion3, 1.0f, false, 2, null), interfaceC1554lR, 0);
                interfaceC1554lR.P();
                interfaceC1554lR.I();
                C4153F c4153f2 = C4153F.f46609a;
                break;
            case 4:
            case 5:
                interfaceC1554lR.S(-1049609485);
                i.Companion companion5 = b0.i.INSTANCE;
                b0.i iVarG2 = androidx.compose.foundation.layout.r.g(companion5, 0.5f);
                y0.I iB3 = A.U.b(C0794b.f54a.e(), b0.c.INSTANCE.l(), interfaceC1554lR, 0);
                int iA3 = C1550j.a(interfaceC1554lR, 0);
                InterfaceC1578x interfaceC1578xF3 = interfaceC1554lR.F();
                b0.i iVarE3 = b0.h.e(interfaceC1554lR, iVarG2);
                InterfaceC0828g.Companion companion6 = InterfaceC0828g.INSTANCE;
                Ba.a<InterfaceC0828g> aVarA3 = companion6.a();
                if (interfaceC1554lR.w() == null) {
                    C1550j.c();
                }
                interfaceC1554lR.t();
                if (interfaceC1554lR.getInserting()) {
                    interfaceC1554lR.T(aVarA3);
                } else {
                    interfaceC1554lR.H();
                }
                InterfaceC1554l interfaceC1554lA3 = C1.a(interfaceC1554lR);
                C1.b(interfaceC1554lA3, iB3, companion6.c());
                C1.b(interfaceC1554lA3, interfaceC1578xF3, companion6.e());
                Ba.p<InterfaceC0828g, Integer, C4153F> pVarB3 = companion6.b();
                if (interfaceC1554lA3.getInserting() || !C3862t.b(interfaceC1554lA3.f(), Integer.valueOf(iA3))) {
                    interfaceC1554lA3.J(Integer.valueOf(iA3));
                    interfaceC1554lA3.k(Integer.valueOf(iA3), pVarB3);
                }
                C1.b(interfaceC1554lA3, iVarE3, companion6.d());
                A.X x12 = A.X.f45a;
                float f13 = i11;
                int i14 = ((i10 << 3) & 896) | 24582;
                e(O4.g.f13259B, U0.h.u(f13), probe, D0.h.a(R.string.internal_label, interfaceC1554lR, 6), R.color.internal_temperature, j10, interfaceC1554lR, i14);
                A.Y.a(A.W.c(x12, companion5, 1.0f, false, 2, null), interfaceC1554lR, 0);
                e(O4.g.f13260C, U0.h.u(f13), probe, D0.h.a(R.string.target_label, interfaceC1554lR, 6), R.color.aqua, j10, interfaceC1554lR, i14);
                A.Y.a(A.W.c(x12, companion5, 1.0f, false, 2, null), interfaceC1554lR, 0);
                e(O4.g.f13261D, U0.h.u(f13), probe, D0.h.a(R.string.ambient_label, interfaceC1554lR, 6), R.color.green_61, j10, interfaceC1554lR, i14);
                A.Y.a(A.W.c(x12, companion5, 1.0f, false, 2, null), interfaceC1554lR, 0);
                interfaceC1554lR.P();
                interfaceC1554lR.I();
                C4153F c4153f3 = C4153F.f46609a;
                break;
            case 7:
                interfaceC1554lR.S(-1048169690);
                float fU2 = U0.h.t(fU, U0.h.u((float) 350)) > 0 ? U0.h.u(50) : U0.h.u(40);
                i.Companion companion7 = b0.i.INSTANCE;
                y0.I iB4 = A.U.b(C0794b.f54a.e(), b0.c.INSTANCE.l(), interfaceC1554lR, 0);
                int iA4 = C1550j.a(interfaceC1554lR, 0);
                InterfaceC1578x interfaceC1578xF4 = interfaceC1554lR.F();
                b0.i iVarE4 = b0.h.e(interfaceC1554lR, companion7);
                InterfaceC0828g.Companion companion8 = InterfaceC0828g.INSTANCE;
                Ba.a<InterfaceC0828g> aVarA4 = companion8.a();
                if (interfaceC1554lR.w() == null) {
                    C1550j.c();
                }
                interfaceC1554lR.t();
                if (interfaceC1554lR.getInserting()) {
                    interfaceC1554lR.T(aVarA4);
                } else {
                    interfaceC1554lR.H();
                }
                InterfaceC1554l interfaceC1554lA4 = C1.a(interfaceC1554lR);
                C1.b(interfaceC1554lA4, iB4, companion8.c());
                C1.b(interfaceC1554lA4, interfaceC1578xF4, companion8.e());
                Ba.p<InterfaceC0828g, Integer, C4153F> pVarB4 = companion8.b();
                if (interfaceC1554lA4.getInserting() || !C3862t.b(interfaceC1554lA4.f(), Integer.valueOf(iA4))) {
                    interfaceC1554lA4.J(Integer.valueOf(iA4));
                    interfaceC1554lA4.k(Integer.valueOf(iA4), pVarB4);
                }
                C1.b(interfaceC1554lA4, iVarE4, companion8.d());
                A.X x13 = A.X.f45a;
                int i15 = ((i10 << 3) & 896) | 24582;
                e(O4.g.f13259B, fU2, probe, D0.h.a(R.string.internal_label, interfaceC1554lR, 6), R.color.internal_temperature, j10, interfaceC1554lR, i15);
                float f14 = 8;
                A.Y.a(androidx.compose.foundation.layout.r.q(companion7, U0.h.u(f14)), interfaceC1554lR, 6);
                e(O4.g.f13260C, fU2, probe, D0.h.a(R.string.target_label, interfaceC1554lR, 6), R.color.aqua, j10, interfaceC1554lR, i15);
                A.Y.a(androidx.compose.foundation.layout.r.q(companion7, U0.h.u(f14)), interfaceC1554lR, 6);
                e(O4.g.f13261D, fU2, probe, D0.h.a(R.string.ambient_label, interfaceC1554lR, 6), R.color.green_61, j10, interfaceC1554lR, i15);
                interfaceC1554lR.P();
                interfaceC1554lR.I();
                C4153F c4153f4 = C4153F.f46609a;
                break;
            default:
                interfaceC1554lR.S(1628615016);
                interfaceC1554lR.I();
                throw new NoWhenBranchMatchedException();
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.O0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return S0.i(contentType, probe, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F i(EnumC1600h enumC1600h, Probe probe, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        h(enumC1600h, probe, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F j(EnumC1600h enumC1600h, EnumC1593a enumC1593a, Probe probe, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        g(enumC1600h, enumC1593a, probe, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(final O4.g r38, final com.apptionlabs.meater_app.model.Probe r39, final java.lang.String r40, final int r41, final long r42, kotlin.InterfaceC1554l r44, final int r45) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J4.S0.k(O4.g, com.apptionlabs.meater_app.model.Probe, java.lang.String, int, long, O.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F l(O4.g gVar, Probe probe, String str, int i10, long j10, int i11, InterfaceC1554l interfaceC1554l, int i12) {
        k(gVar, probe, str, i10, j10, interfaceC1554l, C1509K0.a(i11 | 1));
        return C4153F.f46609a;
    }

    public static final C1060d m(String temperature, long j10) {
        C3862t.g(temperature, "temperature");
        C1060d.a aVar = new C1060d.a(0, 1, null);
        int iK = aVar.k(new SpanStyle(0L, j10, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65533, null));
        try {
            String strSubstring = temperature.substring(0, Ub.n.Y(temperature, ".", 0, false, 6, null));
            C3862t.f(strSubstring, "substring(...)");
            aVar.h(strSubstring);
            C4153F c4153f = C4153F.f46609a;
            aVar.j(iK);
            U0.w.b(j10);
            iK = aVar.k(new SpanStyle(0L, U0.w.g(U0.v.f(j10), U0.v.h(j10) / 2), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65533, null));
            try {
                String strSubstring2 = temperature.substring(Ub.n.Y(temperature, ".", 0, false, 6, null), temperature.length() - 1);
                C3862t.f(strSubstring2, "substring(...)");
                aVar.h(strSubstring2);
                aVar.j(iK);
                iK = aVar.k(new SpanStyle(0L, j10, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65533, null));
                try {
                    aVar.append(Ub.n.W0(temperature));
                    aVar.j(iK);
                    return aVar.l();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }
}
