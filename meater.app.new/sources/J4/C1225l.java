package J4;

import A.C0794b;
import A.C0799g;
import A.C0802j;
import A0.InterfaceC0828g;
import android.app.Activity;
import android.content.Intent;
import b0.c;
import b0.i;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.CloudAccountActivity;
import com.apptionlabs.meater_app.activities.CustomSettingActivity;
import com.apptionlabs.meater_app.activities.WebViewActivity;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.v3protobuf.CloudDisconnectedState;
import f0.C3303d;
import g5.EnumC3427c;
import h0.C3482m;
import i0.C3561Y;
import i0.C3602t0;
import kotlin.AbstractC1341l;
import kotlin.C1;
import kotlin.C1250B;
import kotlin.C1273Z;
import kotlin.C1287h;
import kotlin.C1289j;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.FontWeight;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.W0;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import w.C4960e;

/* compiled from: CloudPopupWindow.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LJ4/N0;", "popupContent", "Lkotlin/Function0;", "Loa/F;", "popupDismissListener", "i", "(LJ4/N0;LBa/a;LO/l;I)V", "Li0/t0;", "color", "Lb0/i;", "modifier", "l", "(JLb0/i;LO/l;II)V", "Landroid/app/Activity;", "activity", "o", "(Landroid/app/Activity;)LJ4/N0;", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: J4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1225l {

    /* compiled from: CloudPopupWindow.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: J4.l$a */
    static final class a implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ PopupContent f7491B;

        /* compiled from: CloudPopupWindow.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: J4.l$a$a, reason: collision with other inner class name */
        static final class C0153a implements Ba.q<A.W, InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ PopupContent f7492B;

            C0153a(PopupContent popupContent) {
                this.f7492B = popupContent;
            }

            public final void a(A.W Button, InterfaceC1554l interfaceC1554l, int i10) {
                C3862t.g(Button, "$this$Button");
                if ((i10 & 17) == 16 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(1796935084, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ShowCloudPopupWindow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CloudPopupWindow.kt:114)");
                }
                C1273Z.b(this.f7492B.getActionText(), null, 0L, U0.w.e(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 3072, 0, 131062);
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

        a(PopupContent popupContent) {
            this.f7491B = popupContent;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            i.Companion companion;
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1212324699, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ShowCloudPopupWindow.<anonymous> (CloudPopupWindow.kt:65)");
            }
            i.Companion companion2 = b0.i.INSTANCE;
            b0.i iVarQ = androidx.compose.foundation.layout.r.q(companion2, U0.h.u(200));
            PopupContent popupContent = this.f7491B;
            C0794b c0794b = C0794b.f54a;
            C0794b.l lVarF = c0794b.f();
            c.Companion companion3 = b0.c.INSTANCE;
            y0.I iA = C0799g.a(lVarF, companion3.k(), interfaceC1554l, 0);
            int iA2 = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            b0.i iVarE = b0.h.e(interfaceC1554l, iVarQ);
            InterfaceC0828g.Companion companion4 = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion4.a();
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
            C1.b(interfaceC1554lA, iA, companion4.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion4.e());
            Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion4.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA.J(Integer.valueOf(iA2));
                interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion4.d());
            C0802j c0802j = C0802j.f149a;
            float f10 = 4;
            b0.i iVarM = androidx.compose.foundation.layout.o.m(companion2, U0.h.u(20), U0.h.u(f10), 0.0f, 0.0f, 12, null);
            y0.I iB = A.U.b(c0794b.e(), companion3.l(), interfaceC1554l, 0);
            int iA3 = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF2 = interfaceC1554l.F();
            b0.i iVarE2 = b0.h.e(interfaceC1554l, iVarM);
            Ba.a<InterfaceC0828g> aVarA2 = companion4.a();
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
            C1.b(interfaceC1554lA2, iB, companion4.c());
            C1.b(interfaceC1554lA2, interfaceC1578xF2, companion4.e());
            Ba.p<InterfaceC0828g, Integer, C4153F> pVarB2 = companion4.b();
            if (interfaceC1554lA2.getInserting() || !C3862t.b(interfaceC1554lA2.f(), Integer.valueOf(iA3))) {
                interfaceC1554lA2.J(Integer.valueOf(iA3));
                interfaceC1554lA2.k(Integer.valueOf(iA3), pVarB2);
            }
            C1.b(interfaceC1554lA2, iVarE2, companion4.d());
            A.X x10 = A.X.f45a;
            float f11 = 12;
            float f12 = 8;
            C1225l.l(D0.b.a(R.color.grey_28, interfaceC1554l, 6), androidx.compose.foundation.layout.r.n(companion2, U0.h.u(f11), U0.h.u(f12)), interfaceC1554l, 48, 0);
            interfaceC1554l.P();
            float f13 = 5;
            b0.i iVarB = androidx.compose.foundation.b.b(C3303d.a(androidx.compose.foundation.layout.r.u(androidx.compose.foundation.layout.o.m(companion2, U0.h.u(f13), 0.0f, 0.0f, 0.0f, 14, null), null, false, 3, null), E.g.c(U0.h.u(f13))), D0.b.a(R.color.grey_28, interfaceC1554l, 6), null, 2, null);
            y0.I iH = androidx.compose.foundation.layout.d.h(companion3.o(), false);
            int iA4 = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF3 = interfaceC1554l.F();
            b0.i iVarE3 = b0.h.e(interfaceC1554l, iVarB);
            Ba.a<InterfaceC0828g> aVarA3 = companion4.a();
            if (interfaceC1554l.w() == null) {
                C1550j.c();
            }
            interfaceC1554l.t();
            if (interfaceC1554l.getInserting()) {
                interfaceC1554l.T(aVarA3);
            } else {
                interfaceC1554l.H();
            }
            InterfaceC1554l interfaceC1554lA3 = C1.a(interfaceC1554l);
            C1.b(interfaceC1554lA3, iH, companion4.c());
            C1.b(interfaceC1554lA3, interfaceC1578xF3, companion4.e());
            Ba.p<InterfaceC0828g, Integer, C4153F> pVarB3 = companion4.b();
            if (interfaceC1554lA3.getInserting() || !C3862t.b(interfaceC1554lA3.f(), Integer.valueOf(iA4))) {
                interfaceC1554lA3.J(Integer.valueOf(iA4));
                interfaceC1554lA3.k(Integer.valueOf(iA4), pVarB3);
            }
            C1.b(interfaceC1554lA3, iVarE3, companion4.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
            b0.i iVarI = androidx.compose.foundation.layout.o.i(companion2, U0.h.u(f12));
            y0.I iA5 = C0799g.a(c0794b.f(), companion3.g(), interfaceC1554l, 48);
            int iA6 = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF4 = interfaceC1554l.F();
            b0.i iVarE4 = b0.h.e(interfaceC1554l, iVarI);
            Ba.a<InterfaceC0828g> aVarA4 = companion4.a();
            if (interfaceC1554l.w() == null) {
                C1550j.c();
            }
            interfaceC1554l.t();
            if (interfaceC1554l.getInserting()) {
                interfaceC1554l.T(aVarA4);
            } else {
                interfaceC1554l.H();
            }
            InterfaceC1554l interfaceC1554lA4 = C1.a(interfaceC1554l);
            C1.b(interfaceC1554lA4, iA5, companion4.c());
            C1.b(interfaceC1554lA4, interfaceC1578xF4, companion4.e());
            Ba.p<InterfaceC0828g, Integer, C4153F> pVarB4 = companion4.b();
            if (interfaceC1554lA4.getInserting() || !C3862t.b(interfaceC1554lA4.f(), Integer.valueOf(iA6))) {
                interfaceC1554lA4.J(Integer.valueOf(iA6));
                interfaceC1554lA4.k(Integer.valueOf(iA6), pVarB4);
            }
            C1.b(interfaceC1554lA4, iVarE4, companion4.d());
            interfaceC1554l.S(-102273722);
            if (popupContent.getInformationText().length() > 0) {
                b0.i iVarS = androidx.compose.foundation.layout.r.s(companion2, null, false, 3, null);
                companion = companion2;
                C1273Z.b(popupContent.getInformationText(), iVarS, D0.b.a(android.R.color.white, interfaceC1554l, 6), U0.w.e(12), null, FontWeight.INSTANCE.d(), AbstractC1341l.INSTANCE.b(), 0L, null, R0.i.h(R0.i.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, interfaceC1554l, 199728, 0, 130448);
            } else {
                companion = companion2;
            }
            interfaceC1554l.I();
            interfaceC1554l.S(-102253258);
            if (popupContent.getActionText().length() > 0) {
                i.Companion companion5 = companion;
                A.Y.a(androidx.compose.foundation.layout.r.i(companion5, U0.h.u(f12)), interfaceC1554l, 6);
                if (popupContent.getButtonStyle() == EnumC1207c.f7462B) {
                    interfaceC1554l.S(1125258931);
                    C1289j.a(popupContent.d(), null, false, null, C1287h.f8410a.b(D0.b.a(R.color.meater_red, interfaceC1554l, 6), D0.b.a(R.color.white, interfaceC1554l, 6), 0L, 0L, interfaceC1554l, C1287h.f8424o << 12, 12), null, null, null, null, W.c.d(1796935084, true, new C0153a(popupContent), interfaceC1554l, 54), interfaceC1554l, 805306368, 494);
                    interfaceC1554l.I();
                } else {
                    interfaceC1554l.S(1125980518);
                    b0.i iVarD = androidx.compose.foundation.d.d(companion5, true, null, null, popupContent.d(), 6, null);
                    y0.I iB2 = A.U.b(c0794b.e(), companion3.i(), interfaceC1554l, 48);
                    int iA7 = C1550j.a(interfaceC1554l, 0);
                    InterfaceC1578x interfaceC1578xF5 = interfaceC1554l.F();
                    b0.i iVarE5 = b0.h.e(interfaceC1554l, iVarD);
                    Ba.a<InterfaceC0828g> aVarA5 = companion4.a();
                    if (interfaceC1554l.w() == null) {
                        C1550j.c();
                    }
                    interfaceC1554l.t();
                    if (interfaceC1554l.getInserting()) {
                        interfaceC1554l.T(aVarA5);
                    } else {
                        interfaceC1554l.H();
                    }
                    InterfaceC1554l interfaceC1554lA5 = C1.a(interfaceC1554l);
                    C1.b(interfaceC1554lA5, iB2, companion4.c());
                    C1.b(interfaceC1554lA5, interfaceC1578xF5, companion4.e());
                    Ba.p<InterfaceC0828g, Integer, C4153F> pVarB5 = companion4.b();
                    if (interfaceC1554lA5.getInserting() || !C3862t.b(interfaceC1554lA5.f(), Integer.valueOf(iA7))) {
                        interfaceC1554lA5.J(Integer.valueOf(iA7));
                        interfaceC1554lA5.k(Integer.valueOf(iA7), pVarB5);
                    }
                    C1.b(interfaceC1554lA5, iVarE5, companion4.d());
                    C1250B.a(D0.e.c(R.drawable.ic_link_icon, interfaceC1554l, 6), "", androidx.compose.foundation.layout.r.n(companion5, U0.h.u(f11), U0.h.u(10)), D0.b.a(R.color.aqua, interfaceC1554l, 6), interfaceC1554l, 432, 0);
                    A.Y.a(androidx.compose.foundation.layout.r.q(companion5, U0.h.u(f10)), interfaceC1554l, 6);
                    C1273Z.b(popupContent.getActionText(), null, D0.b.a(R.color.aqua, interfaceC1554l, 6), U0.w.e(12), null, FontWeight.INSTANCE.d(), AbstractC1341l.INSTANCE.b(), 0L, null, R0.i.h(R0.i.INSTANCE.a()), 0L, 0, false, 0, 0, null, null, interfaceC1554l, 199680, 0, 130450);
                    interfaceC1554l.P();
                    interfaceC1554l.I();
                }
            }
            interfaceC1554l.I();
            interfaceC1554l.P();
            interfaceC1554l.P();
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

    /* compiled from: CloudPopupWindow.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: J4.l$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7493a;

        static {
            int[] iArr = new int[CloudDisconnectedState.values().length];
            try {
                iArr[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_DEVICES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_INTERNET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_CLOUD_CONNECTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f7493a = iArr;
        }
    }

    public static final void i(final PopupContent popupContent, final Ba.a<C4153F> popupDismissListener, InterfaceC1554l interfaceC1554l, final int i10) {
        int i11;
        C3862t.g(popupContent, "popupContent");
        C3862t.g(popupDismissListener, "popupDismissListener");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-677470818);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.R(popupContent) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.l(popupDismissListener) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-677470818, i11, -1, "com.apptionlabs.meater_app.dashboard.ui.ShowCloudPopupWindow (CloudPopupWindow.kt:53)");
            }
            androidx.compose.ui.window.s sVar = new androidx.compose.ui.window.s(true, true, true, null, true, false, 40, null);
            b0.c cVarO = b0.c.INSTANCE.o();
            long jA = U0.o.a(0, 130);
            interfaceC1554lR.S(357726417);
            boolean z10 = (i11 & 112) == 32;
            Object objF = interfaceC1554lR.f();
            if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new Ba.a() { // from class: J4.d
                    @Override // Ba.a
                    public final Object invoke() {
                        return C1225l.j(popupDismissListener);
                    }
                };
                interfaceC1554lR.J(objF);
            }
            interfaceC1554lR.I();
            androidx.compose.ui.window.c.c(cVarO, jA, (Ba.a) objF, sVar, W.c.d(1212324699, true, new a(popupContent), interfaceC1554lR, 54), interfaceC1554lR, 27702, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.e
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return C1225l.k(popupContent, popupDismissListener, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F j(Ba.a aVar) {
        aVar.invoke();
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F k(PopupContent popupContent, Ba.a aVar, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        i(popupContent, aVar, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void l(final long j10, b0.i iVar, InterfaceC1554l interfaceC1554l, final int i10, final int i11) {
        int i12;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1456568788);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC1554lR.i(j10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC1554lR.R(iVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (i13 != 0) {
                j10 = C3602t0.INSTANCE.a();
            }
            if (i14 != 0) {
                iVar = b0.i.INSTANCE;
            }
            if (C1560o.J()) {
                C1560o.S(-1456568788, i12, -1, "com.apptionlabs.meater_app.dashboard.ui.TriangleShape (CloudPopupWindow.kt:151)");
            }
            b0.i iVarF = androidx.compose.foundation.layout.r.f(iVar, 0.0f, 1, null);
            interfaceC1554lR.S(-1075409513);
            boolean z10 = (i12 & 14) == 4;
            Object objF = interfaceC1554lR.f();
            if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new Ba.l() { // from class: J4.j
                    @Override // Ba.l
                    public final Object invoke(Object obj) {
                        return C1225l.m(j10, (k0.f) obj);
                    }
                };
                interfaceC1554lR.J(objF);
            }
            interfaceC1554lR.I();
            C4960e.a(iVarF, (Ba.l) objF, interfaceC1554lR, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        final long j11 = j10;
        final b0.i iVar2 = iVar;
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.k
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return C1225l.n(j11, iVar2, i10, i11, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F m(long j10, k0.f Canvas) {
        C3862t.g(Canvas, "$this$Canvas");
        i0.R0 r0A = C3561Y.a();
        r0A.p(C3482m.i(Canvas.C()) / 2, 0.0f);
        r0A.w(C3482m.i(Canvas.C()), C3482m.g(Canvas.C()));
        r0A.w(0.0f, C3482m.g(Canvas.C()));
        r0A.close();
        k0.f.J0(Canvas, r0A, j10, 0.0f, k0.j.f43725a, null, 0, 52, null);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F n(long j10, b0.i iVar, int i10, int i11, InterfaceC1554l interfaceC1554l, int i12) {
        l(j10, iVar, interfaceC1554l, C1509K0.a(i10 | 1), i11);
        return C4153F.f46609a;
    }

    public static final PopupContent o(final Activity activity) {
        String string;
        String string2;
        Ba.a aVar;
        EnumC1207c enumC1207c;
        String string3;
        C3862t.g(activity, "activity");
        EnumC1207c enumC1207c2 = EnumC1207c.f7462B;
        Ba.a aVar2 = new Ba.a() { // from class: J4.f
            @Override // Ba.a
            public final Object invoke() {
                return C1225l.q();
            }
        };
        CloudDisconnectedState cloudDisconnectedStateO = E4.i.D().O();
        String string4 = "";
        switch (cloudDisconnectedStateO == null ? -1 : b.f7493a[cloudDisconnectedStateO.ordinal()]) {
            case 1:
                MEATERCloudAccount mEATERCloudAccountL = x4.g.t().l();
                String str = mEATERCloudAccountL != null ? mEATERCloudAccountL.email : "";
                string = x4.g.h().getString(R.string.you_are_connected_as) + " " + str;
                aVar = aVar2;
                enumC1207c = enumC1207c2;
                string3 = string;
                return new PopupContent(string3, string4, enumC1207c, aVar);
            case 2:
                activity.startActivity(new Intent(activity, (Class<?>) CloudAccountActivity.class));
                return null;
            case 3:
                string2 = x4.g.h().getString(R.string.meater_cloud_is_disabled);
                string4 = x4.g.h().getString(R.string.open_setting);
                aVar = new Ba.a() { // from class: J4.g
                    @Override // Ba.a
                    public final Object invoke() {
                        return C1225l.r(activity);
                    }
                };
                String str2 = string2;
                enumC1207c = enumC1207c2;
                string3 = str2;
                return new PopupContent(string3, string4, enumC1207c, aVar);
            case 4:
                string2 = x4.g.h().getString(R.string.you_currently_have_no_device);
                string4 = x4.g.h().getString(R.string.add_meater_devices);
                aVar = new Ba.a() { // from class: J4.h
                    @Override // Ba.a
                    public final Object invoke() {
                        return C1225l.s(activity);
                    }
                };
                String str22 = string2;
                enumC1207c = enumC1207c2;
                string3 = str22;
                return new PopupContent(string3, string4, enumC1207c, aVar);
            case 5:
                string = x4.g.h().getString(R.string.device_appears_to_disconnected);
                aVar = aVar2;
                enumC1207c = enumC1207c2;
                string3 = string;
                return new PopupContent(string3, string4, enumC1207c, aVar);
            case 6:
                string3 = x4.g.h().getString(R.string.meater_cloud_down);
                string4 = x4.g.h().getString(R.string.customer_support);
                enumC1207c = EnumC1207c.f7463C;
                aVar = new Ba.a() { // from class: J4.i
                    @Override // Ba.a
                    public final Object invoke() {
                        return C1225l.p(activity);
                    }
                };
                return new PopupContent(string3, string4, enumC1207c, aVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F p(Activity activity) {
        String str = S4.a.f15457E;
        Boolean bool = Boolean.TRUE;
        WebViewActivity.F2(activity, null, str, null, bool, bool, null);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F q() {
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F r(Activity activity) {
        activity.startActivity(new Intent(activity, (Class<?>) CustomSettingActivity.class));
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F s(Activity activity) {
        int iX = x4.g.t().x();
        EnumC3427c enumC3427c = EnumC3427c.f41920Y;
        if (iX != enumC3427c.getProgress()) {
            x4.g.t().o0(enumC3427c.getProgress());
        }
        Intent intent = new Intent(activity, (Class<?>) QSGActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_QSG_FROM_INSIDE_APP, true);
        activity.startActivity(intent);
        return C4153F.f46609a;
    }
}
