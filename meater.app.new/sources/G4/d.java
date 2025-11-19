package G4;

import A.C0794b;
import A.C0799g;
import A.C0802j;
import A.InterfaceC0801i;
import A.U;
import A.X;
import A0.InterfaceC0828g;
import Ba.p;
import Ba.q;
import U0.h;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import b0.c;
import b0.i;
import com.apptionlabs.meater_app.R;
import kotlin.C1;
import kotlin.C1252D;
import kotlin.C1273Z;
import kotlin.C1293n;
import kotlin.C1301v;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.I;

/* compiled from: CalibrationScreenItems.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001aG\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "containerTitle", "row1Text", "row1Value", "row2Text", "row2Value", "row3Text", "row3Value", "Loa/F;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LO/l;I)V", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LO/l;I)V", "label", "value", "h", "(Ljava/lang/String;Ljava/lang/String;LO/l;I)V", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* compiled from: CalibrationScreenItems.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f4884B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ String f4885C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f4886D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f4887E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ String f4888F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ String f4889G;

        a(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f4884B = str;
            this.f4885C = str2;
            this.f4886D = str3;
            this.f4887E = str4;
            this.f4888F = str5;
            this.f4889G = str6;
        }

        public final void a(InterfaceC0801i Card, InterfaceC1554l interfaceC1554l, int i10) {
            C3862t.g(Card, "$this$Card");
            if ((i10 & 17) == 16 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(646166375, i10, -1, "com.apptionlabs.meater_app.compose.ContainerWithThreeRows.<anonymous>.<anonymous> (CalibrationScreenItems.kt:70)");
            }
            d.h(this.f4884B, this.f4885C, interfaceC1554l, 0);
            float f10 = 1;
            C1301v.a(null, h.u(f10), D0.b.a(R.color.screen_default_color, interfaceC1554l, 6), interfaceC1554l, 48, 1);
            d.h(this.f4886D, this.f4887E, interfaceC1554l, 0);
            C1301v.a(null, h.u(f10), D0.b.a(R.color.screen_default_color, interfaceC1554l, 6), interfaceC1554l, 48, 1);
            d.h(this.f4888F, this.f4889G, interfaceC1554l, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(InterfaceC0801i interfaceC0801i, InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC0801i, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: CalibrationScreenItems.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f4890B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ String f4891C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f4892D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ String f4893E;

        b(String str, String str2, String str3, String str4) {
            this.f4890B = str;
            this.f4891C = str2;
            this.f4892D = str3;
            this.f4893E = str4;
        }

        public final void a(InterfaceC0801i Card, InterfaceC1554l interfaceC1554l, int i10) {
            C3862t.g(Card, "$this$Card");
            if ((i10 & 17) == 16 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(252907637, i10, -1, "com.apptionlabs.meater_app.compose.ContainerWithTwoRows.<anonymous>.<anonymous> (CalibrationScreenItems.kt:105)");
            }
            d.h(this.f4890B, this.f4891C, interfaceC1554l, 0);
            float f10 = 0;
            C1301v.a(o.l(i.INSTANCE, h.u(f10), h.u(f10), h.u(f10), h.u(f10)), h.u(1), D0.b.a(R.color.screen_default_color, interfaceC1554l, 6), interfaceC1554l, 54, 0);
            d.h(this.f4892D, this.f4893E, interfaceC1554l, 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(InterfaceC0801i interfaceC0801i, InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC0801i, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public static final void d(final String containerTitle, final String row1Text, final String row1Value, final String row2Text, final String row2Value, final String row3Text, final String row3Value, InterfaceC1554l interfaceC1554l, final int i10) {
        int i11;
        InterfaceC1554l interfaceC1554l2;
        C3862t.g(containerTitle, "containerTitle");
        C3862t.g(row1Text, "row1Text");
        C3862t.g(row1Value, "row1Value");
        C3862t.g(row2Text, "row2Text");
        C3862t.g(row2Value, "row2Value");
        C3862t.g(row3Text, "row3Text");
        C3862t.g(row3Value, "row3Value");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(586585679);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.R(containerTitle) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.R(row1Text) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1554lR.R(row1Value) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC1554lR.R(row2Text) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC1554lR.R(row2Value) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= interfaceC1554lR.R(row3Text) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= interfaceC1554lR.R(row3Value) ? 1048576 : 524288;
        }
        int i12 = i11;
        if ((599187 & i12) == 599186 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
            interfaceC1554l2 = interfaceC1554lR;
        } else {
            if (C1560o.J()) {
                C1560o.S(586585679, i12, -1, "com.apptionlabs.meater_app.compose.ContainerWithThreeRows (CalibrationScreenItems.kt:49)");
            }
            i.Companion companion = i.INSTANCE;
            i iVarS = r.s(companion, null, false, 3, null);
            c.Companion companion2 = b0.c.INSTANCE;
            I iA = C0799g.a(C0794b.f54a.f(), companion2.k(), interfaceC1554lR, 48);
            int iA2 = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
            i iVarE = b0.h.e(interfaceC1554lR, iVarS);
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
            C1.b(interfaceC1554lA, iA, companion3.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion3.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion3.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA.J(Integer.valueOf(iA2));
                interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion3.d());
            C0802j c0802j = C0802j.f149a;
            float f10 = 8;
            float f11 = 0;
            C1273Z.b(containerTitle, o.l(r.s(companion, null, false, 3, null), h.u(f10), h.u(24), h.u(f11), h.u(f11)), D0.b.a(R.color.black_color, interfaceC1554lR, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C1252D.f7860a.c(interfaceC1554lR, C1252D.f7861b).getTitleSmall(), interfaceC1554lR, (i12 & 14) | 48, 0, 65528);
            interfaceC1554l2 = interfaceC1554lR;
            C1293n.b(r.s(r.h(o.l(companion, h.u(f11), h.u(f10), h.u(f11), h.u(f11)), 0.0f, 1, null), companion2.l(), false, 2, null), null, null, null, null, W.c.d(646166375, true, new a(row1Text, row1Value, row2Text, row2Value, row3Text, row3Value), interfaceC1554l2, 54), interfaceC1554l2, 196614, 30);
            interfaceC1554l2.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554l2.y();
        if (w0Y != null) {
            w0Y.a(new p() { // from class: G4.b
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return d.e(containerTitle, row1Text, row1Value, row2Text, row2Value, row3Text, row3Value, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F e(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        d(str, str2, str3, str4, str5, str6, str7, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void f(final String containerTitle, final String row1Text, final String row1Value, final String row2Text, final String row2Value, InterfaceC1554l interfaceC1554l, final int i10) {
        int i11;
        InterfaceC1554l interfaceC1554l2;
        C3862t.g(containerTitle, "containerTitle");
        C3862t.g(row1Text, "row1Text");
        C3862t.g(row1Value, "row1Value");
        C3862t.g(row2Text, "row2Text");
        C3862t.g(row2Value, "row2Value");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1454423901);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.R(containerTitle) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.R(row1Text) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1554lR.R(row1Value) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= interfaceC1554lR.R(row2Text) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= interfaceC1554lR.R(row2Value) ? 16384 : 8192;
        }
        int i12 = i11;
        if ((i12 & 9363) == 9362 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
            interfaceC1554l2 = interfaceC1554lR;
        } else {
            if (C1560o.J()) {
                C1560o.S(1454423901, i12, -1, "com.apptionlabs.meater_app.compose.ContainerWithTwoRows (CalibrationScreenItems.kt:84)");
            }
            i.Companion companion = i.INSTANCE;
            i iVarS = r.s(companion, null, false, 3, null);
            c.Companion companion2 = b0.c.INSTANCE;
            I iA = C0799g.a(C0794b.f54a.f(), companion2.k(), interfaceC1554lR, 48);
            int iA2 = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
            i iVarE = b0.h.e(interfaceC1554lR, iVarS);
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
            C1.b(interfaceC1554lA, iA, companion3.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion3.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion3.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA.J(Integer.valueOf(iA2));
                interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion3.d());
            C0802j c0802j = C0802j.f149a;
            float f10 = 8;
            float f11 = 0;
            C1273Z.b(containerTitle, o.l(r.s(companion, null, false, 3, null), h.u(f10), h.u(24), h.u(f11), h.u(f11)), D0.b.a(R.color.black_color, interfaceC1554lR, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C1252D.f7860a.c(interfaceC1554lR, C1252D.f7861b).getTitleSmall(), interfaceC1554lR, (i12 & 14) | 48, 0, 65528);
            interfaceC1554l2 = interfaceC1554lR;
            C1293n.b(r.s(r.h(o.l(companion, h.u(f11), h.u(f10), h.u(f11), h.u(f11)), 0.0f, 1, null), companion2.l(), false, 2, null), null, null, null, null, W.c.d(252907637, true, new b(row1Text, row1Value, row2Text, row2Value), interfaceC1554lR, 54), interfaceC1554lR, 196614, 30);
            interfaceC1554l2.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554l2.y();
        if (w0Y != null) {
            w0Y.a(new p() { // from class: G4.a
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return d.g(containerTitle, row1Text, row1Value, row2Text, row2Value, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F g(String str, String str2, String str3, String str4, String str5, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        f(str, str2, str3, str4, str5, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void h(final String label, final String value, InterfaceC1554l interfaceC1554l, final int i10) {
        int i11;
        InterfaceC1554l interfaceC1554l2;
        C3862t.g(label, "label");
        C3862t.g(value, "value");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1262750895);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.R(label) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.R(value) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) == 18 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
            interfaceC1554l2 = interfaceC1554lR;
        } else {
            if (C1560o.J()) {
                C1560o.S(-1262750895, i12, -1, "com.apptionlabs.meater_app.compose.RowContainer (CalibrationScreenItems.kt:118)");
            }
            i.Companion companion = i.INSTANCE;
            float f10 = 8;
            float f11 = 16;
            i iVarL = o.l(r.h(androidx.compose.foundation.b.b(companion, D0.b.a(R.color.view_active_color, interfaceC1554lR, 6), null, 2, null), 0.0f, 1, null), h.u(f10), h.u(f11), h.u(f10), h.u(f11));
            I iB = U.b(C0794b.f54a.d(), b0.c.INSTANCE.l(), interfaceC1554lR, 6);
            int iA = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
            i iVarE = b0.h.e(interfaceC1554lR, iVarL);
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
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion2.d());
            X x10 = X.f45a;
            i iVarS = r.s(companion, null, false, 3, null);
            C1252D c1252d = C1252D.f7860a;
            int i13 = C1252D.f7861b;
            C1273Z.b(label, iVarS, D0.b.a(R.color.black_color, interfaceC1554lR, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c1252d.c(interfaceC1554lR, i13).getBodyMedium(), interfaceC1554lR, (i12 & 14) | 48, 0, 65528);
            interfaceC1554l2 = interfaceC1554lR;
            C1273Z.b(value, r.s(companion, null, false, 3, null), D0.b.a(R.color.black_color, interfaceC1554lR, 6), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c1252d.c(interfaceC1554lR, i13).getBodyMedium(), interfaceC1554l2, ((i12 >> 3) & 14) | 48, 0, 65528);
            interfaceC1554l2.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554l2.y();
        if (w0Y != null) {
            w0Y.a(new p() { // from class: G4.c
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return d.i(label, value, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F i(String str, String str2, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        h(str, str2, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }
}
