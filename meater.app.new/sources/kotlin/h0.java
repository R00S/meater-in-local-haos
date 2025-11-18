package kotlin;

import A.C0794b;
import A.C0799g;
import A.C0802j;
import A.W;
import A0.InterfaceC0828g;
import Ba.l;
import Ba.p;
import Ba.q;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.r;
import b0.c;
import b0.i;
import i0.c1;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C1;
import kotlin.C1503H0;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.C5097b;
import y0.H;
import y0.I;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\u001an\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a`\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a+\u0010\u0019\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a+\u0010\u001b\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u001b\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001c\"\u0014\u0010\u001e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c\"\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c\"\u0014\u0010!\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001c\"\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001c\"\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001c\"\u0014\u0010'\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001c\"\u0014\u0010)\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006*"}, d2 = {"Lb0/i;", "modifier", "Lkotlin/Function0;", "Loa/F;", "action", "", "actionOnNewLine", "Li0/c1;", "shape", "Li0/t0;", "backgroundColor", "contentColor", "LU0/h;", "elevation", "content", "c", "(Lb0/i;LBa/p;ZLi0/c1;JJFLBa/p;LO/l;II)V", "LI/c0;", "snackbarData", "actionColor", "d", "(LI/c0;Lb0/i;ZLi0/c1;JJJFLO/l;II)V", "e", "(LBa/p;LO/l;I)V", "text", "a", "(LBa/p;LBa/p;LO/l;I)V", "b", "F", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "SeparateButtonExtraY", "SnackbarVerticalPadding", "f", "TextEndExtraSpacing", "g", "LongButtonVerticalOffset", "h", "SnackbarMinHeightOneLine", "i", "SnackbarMinHeightTwoLines", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: c, reason: collision with root package name */
    private static final float f6233c;

    /* renamed from: f, reason: collision with root package name */
    private static final float f6236f;

    /* renamed from: a, reason: collision with root package name */
    private static final float f6231a = U0.h.u(30);

    /* renamed from: b, reason: collision with root package name */
    private static final float f6232b = U0.h.u(16);

    /* renamed from: d, reason: collision with root package name */
    private static final float f6234d = U0.h.u(2);

    /* renamed from: e, reason: collision with root package name */
    private static final float f6235e = U0.h.u(6);

    /* renamed from: g, reason: collision with root package name */
    private static final float f6237g = U0.h.u(12);

    /* renamed from: h, reason: collision with root package name */
    private static final float f6238h = U0.h.u(48);

    /* renamed from: i, reason: collision with root package name */
    private static final float f6239i = U0.h.u(68);

    /* compiled from: Snackbar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6240B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6241C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f6242D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, int i10) {
            super(2);
            this.f6240B = pVar;
            this.f6241C = pVar2;
            this.f6242D = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            h0.a(this.f6240B, this.f6241C, interfaceC1554l, C1509K0.a(this.f6242D | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;"}, k = 3, mv = {1, 8, 0})
    static final class b implements I {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f6243a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f6244b;

        /* compiled from: Snackbar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ Z f6245B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ int f6246C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ Z f6247D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f6248E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ int f6249F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Z z10, int i10, Z z11, int i11, int i12) {
                super(1);
                this.f6245B = z10;
                this.f6246C = i10;
                this.f6247D = z11;
                this.f6248E = i11;
                this.f6249F = i12;
            }

            public final void a(Z.a aVar) {
                Z.a.l(aVar, this.f6245B, 0, this.f6246C, 0.0f, 4, null);
                Z.a.l(aVar, this.f6247D, this.f6248E, this.f6249F, 0.0f, 4, null);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
                a(aVar);
                return C4153F.f46609a;
            }
        }

        b(String str, String str2) {
            this.f6243a = str;
            this.f6244b = str2;
        }

        @Override // y0.I
        public final J e(K k10, List<? extends H> list, long j10) {
            int i10;
            int height;
            int iMax;
            String str = this.f6243a;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                H h10 = list.get(i11);
                if (C3862t.b(androidx.compose.ui.layout.a.a(h10), str)) {
                    Z zT = h10.T(j10);
                    int iD = Ha.g.d((U0.b.l(j10) - zT.getWidth()) - k10.i1(h0.f6236f), U0.b.n(j10));
                    String str2 = this.f6244b;
                    int size2 = list.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        H h11 = list.get(i12);
                        if (C3862t.b(androidx.compose.ui.layout.a.a(h11), str2)) {
                            Z zT2 = h11.T(U0.b.d(j10, 0, iD, 0, 0, 9, null));
                            int iJ = zT2.J(C5097b.a());
                            int iJ2 = zT2.J(C5097b.b());
                            boolean z10 = true;
                            boolean z11 = (iJ == Integer.MIN_VALUE || iJ2 == Integer.MIN_VALUE) ? false : true;
                            if (iJ != iJ2 && z11) {
                                z10 = false;
                            }
                            int iL = U0.b.l(j10) - zT.getWidth();
                            if (z10) {
                                iMax = Math.max(k10.i1(h0.f6238h), zT.getHeight());
                                int height2 = (iMax - zT2.getHeight()) / 2;
                                int iJ3 = zT.J(C5097b.a());
                                height = iJ3 != Integer.MIN_VALUE ? (iJ + height2) - iJ3 : 0;
                                i10 = height2;
                            } else {
                                int iI1 = k10.i1(h0.f6231a) - iJ;
                                int iMax2 = Math.max(k10.i1(h0.f6239i), zT2.getHeight() + iI1);
                                i10 = iI1;
                                height = (iMax2 - zT.getHeight()) / 2;
                                iMax = iMax2;
                            }
                            return K.E1(k10, U0.b.l(j10), iMax, null, new a(zT2, i10, zT, iL, height), 4, null);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* compiled from: Snackbar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6250B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6251C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f6252D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, int i10) {
            super(2);
            this.f6250B = pVar;
            this.f6251C = pVar2;
            this.f6252D = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            h0.b(this.f6250B, this.f6251C, interfaceC1554l, C1509K0.a(this.f6252D | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6253B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6254C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f6255D;

        /* compiled from: Snackbar.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6256B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6257C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ boolean f6258D;

            /* compiled from: Snackbar.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I.h0$d$a$a, reason: collision with other inner class name */
            static final class C0121a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6259B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6260C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ boolean f6261D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0121a(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, boolean z10) {
                    super(2);
                    this.f6259B = pVar;
                    this.f6260C = pVar2;
                    this.f6261D = z10;
                }

                public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                        interfaceC1554l.C();
                        return;
                    }
                    if (C1560o.J()) {
                        C1560o.S(225114541, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:103)");
                    }
                    if (this.f6259B == null) {
                        interfaceC1554l.S(1850967489);
                        h0.e(this.f6260C, interfaceC1554l, 0);
                        interfaceC1554l.I();
                    } else if (this.f6261D) {
                        interfaceC1554l.S(1850969582);
                        h0.a(this.f6260C, this.f6259B, interfaceC1554l, 0);
                        interfaceC1554l.I();
                    } else {
                        interfaceC1554l.S(1850971719);
                        h0.b(this.f6260C, this.f6259B, interfaceC1554l, 0);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, boolean z10) {
                super(2);
                this.f6256B = pVar;
                this.f6257C = pVar2;
                this.f6258D = z10;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(1939362236, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:101)");
                }
                l0.a(C1129P.f5916a.c(interfaceC1554l, 6).getBody2(), W.c.d(225114541, true, new C0121a(this.f6256B, this.f6257C, this.f6258D), interfaceC1554l, 54), interfaceC1554l, 48);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, boolean z10) {
            super(2);
            this.f6253B = pVar;
            this.f6254C = pVar2;
            this.f6255D = z10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-2084221700, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:100)");
            }
            C1576w.a(C1150m.a().d(Float.valueOf(C1149l.f6359a.c(interfaceC1554l, 6))), W.c.d(1939362236, true, new a(this.f6253B, this.f6254C, this.f6255D), interfaceC1554l, 54), interfaceC1554l, C1503H0.f12626i | 48);
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

    /* compiled from: Snackbar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.i f6262B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6263C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f6264D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ c1 f6265E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f6266F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ long f6267G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ float f6268H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6269I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f6270J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f6271K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(b0.i iVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, boolean z10, c1 c1Var, long j10, long j11, float f10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, int i10, int i11) {
            super(2);
            this.f6262B = iVar;
            this.f6263C = pVar;
            this.f6264D = z10;
            this.f6265E = c1Var;
            this.f6266F = j10;
            this.f6267G = j11;
            this.f6268H = f10;
            this.f6269I = pVar2;
            this.f6270J = i10;
            this.f6271K = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            h0.c(this.f6262B, this.f6263C, this.f6264D, this.f6265E, this.f6266F, this.f6267G, this.f6268H, this.f6269I, interfaceC1554l, C1509K0.a(this.f6270J | 1), this.f6271K);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ c0 f6272B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(c0 c0Var) {
            super(2);
            this.f6272B = c0Var;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-261845785, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:178)");
            }
            l0.b(this.f6272B.a(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 0, 0, 131070);
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

    /* compiled from: Snackbar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ c0 f6273B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.i f6274C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f6275D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ c1 f6276E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f6277F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ long f6278G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ long f6279H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f6280I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f6281J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ int f6282K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(c0 c0Var, b0.i iVar, boolean z10, c1 c1Var, long j10, long j11, long j12, float f10, int i10, int i11) {
            super(2);
            this.f6273B = c0Var;
            this.f6274C = iVar;
            this.f6275D = z10;
            this.f6276E = c1Var;
            this.f6277F = j10;
            this.f6278G = j11;
            this.f6279H = j12;
            this.f6280I = f10;
            this.f6281J = i10;
            this.f6282K = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            h0.d(this.f6273B, this.f6274C, this.f6275D, this.f6276E, this.f6277F, this.f6278G, this.f6279H, this.f6280I, interfaceC1554l, C1509K0.a(this.f6281J | 1), this.f6282K);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ long f6283B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ c0 f6284C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f6285D;

        /* compiled from: Snackbar.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ c0 f6286B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var) {
                super(0);
                this.f6286B = c0Var;
            }

            public final void a() {
                this.f6286B.c();
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* compiled from: Snackbar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA/W;", "Loa/F;", "a", "(LA/W;LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends AbstractC3864v implements q<W, InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ String f6287B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(3);
                this.f6287B = str;
            }

            public final void a(W w10, InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 17) == 16 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-929149933, i10, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:170)");
                }
                l0.b(this.f6287B, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, interfaceC1554l, 0, 0, 131070);
                if (C1560o.J()) {
                    C1560o.R();
                }
            }

            @Override // Ba.q
            public /* bridge */ /* synthetic */ C4153F g(W w10, InterfaceC1554l interfaceC1554l, Integer num) {
                a(w10, interfaceC1554l, num.intValue());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j10, c0 c0Var, String str) {
            super(2);
            this.f6283B = j10;
            this.f6284C = c0Var;
            this.f6285D = str;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1843479216, i10, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:167)");
            }
            InterfaceC1141d interfaceC1141dG = C1142e.f6147a.g(0L, this.f6283B, 0L, interfaceC1554l, 3072, 5);
            boolean zL = interfaceC1554l.l(this.f6284C);
            c0 c0Var = this.f6284C;
            Object objF = interfaceC1554l.f();
            if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new a(c0Var);
                interfaceC1554l.J(objF);
            }
            C1144g.c((Ba.a) objF, null, false, null, null, null, null, interfaceC1141dG, null, W.c.d(-929149933, true, new b(this.f6285D), interfaceC1554l, 54), interfaceC1554l, 805306368, 382);
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

    /* compiled from: Snackbar.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;"}, k = 3, mv = {1, 8, 0})
    static final class i implements I {

        /* renamed from: a, reason: collision with root package name */
        public static final i f6288a = new i();

        /* compiled from: Snackbar.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ ArrayList<Z> f6289B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ int f6290C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ArrayList<Z> arrayList, int i10) {
                super(1);
                this.f6289B = arrayList;
                this.f6290C = i10;
            }

            public final void a(Z.a aVar) {
                ArrayList<Z> arrayList = this.f6289B;
                int i10 = this.f6290C;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Z z10 = arrayList.get(i11);
                    Z.a.l(aVar, z10, 0, (i10 - z10.getHeight()) / 2, 0.0f, 4, null);
                }
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
                a(aVar);
                return C4153F.f46609a;
            }
        }

        i() {
        }

        @Override // y0.I
        public final J e(K k10, List<? extends H> list, long j10) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            boolean z10 = false;
            int iJ = Integer.MIN_VALUE;
            int iJ2 = Integer.MIN_VALUE;
            int iMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                Z zT = list.get(i10).T(j10);
                arrayList.add(zT);
                if (zT.J(C5097b.a()) != Integer.MIN_VALUE && (iJ == Integer.MIN_VALUE || zT.J(C5097b.a()) < iJ)) {
                    iJ = zT.J(C5097b.a());
                }
                if (zT.J(C5097b.b()) != Integer.MIN_VALUE && (iJ2 == Integer.MIN_VALUE || zT.J(C5097b.b()) > iJ2)) {
                    iJ2 = zT.J(C5097b.b());
                }
                iMax = Math.max(iMax, zT.getHeight());
            }
            if (iJ != Integer.MIN_VALUE && iJ2 != Integer.MIN_VALUE) {
                z10 = true;
            }
            int iMax2 = Math.max(k10.i1((iJ == iJ2 || !z10) ? h0.f6238h : h0.f6239i), iMax);
            return K.E1(k10, U0.b.l(j10), iMax2, null, new a(arrayList, iMax2), 4, null);
        }
    }

    /* compiled from: Snackbar.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f6291B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f6292C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10) {
            super(2);
            this.f6291B = pVar;
            this.f6292C = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            h0.e(this.f6291B, interfaceC1554l, C1509K0.a(this.f6292C | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    static {
        float f10 = 8;
        f6233c = U0.h.u(f10);
        f6236f = U0.h.u(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1229075900);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.l(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.l(pVar2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-1229075900, i11, -1, "androidx.compose.material.NewLineButtonSnackbar (Snackbar.kt:293)");
            }
            i.Companion companion = b0.i.INSTANCE;
            b0.i iVarH = r.h(companion, 0.0f, 1, null);
            float f10 = f6232b;
            float f11 = f6233c;
            b0.i iVarM = o.m(iVarH, f10, 0.0f, f11, f6234d, 2, null);
            C0794b.l lVarF = C0794b.f54a.f();
            c.Companion companion2 = b0.c.INSTANCE;
            I iA = C0799g.a(lVarF, companion2.k(), interfaceC1554lR, 0);
            int iA2 = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
            b0.i iVarE = b0.h.e(interfaceC1554lR, iVarM);
            InterfaceC0828g.Companion companion3 = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion3.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.n()) {
                interfaceC1554lR.T(aVarA);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA, iA, companion3.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion3.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion3.b();
            if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA.J(Integer.valueOf(iA2));
                interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion3.d());
            C0802j c0802j = C0802j.f149a;
            b0.i iVarM2 = o.m(androidx.compose.foundation.layout.a.g(companion, f6231a, f6237g), 0.0f, 0.0f, f11, 0.0f, 11, null);
            I iH = androidx.compose.foundation.layout.d.h(companion2.o(), false);
            int iA3 = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF2 = interfaceC1554lR.F();
            b0.i iVarE2 = b0.h.e(interfaceC1554lR, iVarM2);
            Ba.a<InterfaceC0828g> aVarA2 = companion3.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.n()) {
                interfaceC1554lR.T(aVarA2);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA2 = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA2, iH, companion3.c());
            C1.b(interfaceC1554lA2, interfaceC1578xF2, companion3.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB2 = companion3.b();
            if (interfaceC1554lA2.n() || !C3862t.b(interfaceC1554lA2.f(), Integer.valueOf(iA3))) {
                interfaceC1554lA2.J(Integer.valueOf(iA3));
                interfaceC1554lA2.k(Integer.valueOf(iA3), pVarB2);
            }
            C1.b(interfaceC1554lA2, iVarE2, companion3.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
            pVar.invoke(interfaceC1554lR, Integer.valueOf(i11 & 14));
            interfaceC1554lR.P();
            b0.i iVarB = c0802j.b(companion, companion2.j());
            I iH2 = androidx.compose.foundation.layout.d.h(companion2.o(), false);
            int iA4 = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF3 = interfaceC1554lR.F();
            b0.i iVarE3 = b0.h.e(interfaceC1554lR, iVarB);
            Ba.a<InterfaceC0828g> aVarA3 = companion3.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.n()) {
                interfaceC1554lR.T(aVarA3);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA3 = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA3, iH2, companion3.c());
            C1.b(interfaceC1554lA3, interfaceC1578xF3, companion3.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB3 = companion3.b();
            if (interfaceC1554lA3.n() || !C3862t.b(interfaceC1554lA3.f(), Integer.valueOf(iA4))) {
                interfaceC1554lA3.J(Integer.valueOf(iA4));
                interfaceC1554lA3.k(Integer.valueOf(iA4), pVarB3);
            }
            C1.b(interfaceC1554lA3, iVarE3, companion3.d());
            pVar2.invoke(interfaceC1554lR, Integer.valueOf((i11 >> 3) & 14));
            interfaceC1554lR.P();
            interfaceC1554lR.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new a(pVar, pVar2, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-534813202);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.l(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.l(pVar2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-534813202, i11, -1, "androidx.compose.material.OneRowSnackbar (Snackbar.kt:314)");
            }
            i.Companion companion = b0.i.INSTANCE;
            b0.i iVarM = o.m(companion, f6232b, 0.0f, f6233c, 0.0f, 10, null);
            Object objF = interfaceC1554lR.f();
            if (objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new b("action", "text");
                interfaceC1554lR.J(objF);
            }
            I i12 = (I) objF;
            int iA = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
            b0.i iVarE = b0.h.e(interfaceC1554lR, iVarM);
            InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion2.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.n()) {
                interfaceC1554lR.T(aVarA);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA, i12, companion2.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
            if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion2.d());
            b0.i iVarK = o.k(androidx.compose.ui.layout.a.b(companion, "text"), 0.0f, f6235e, 1, null);
            c.Companion companion3 = b0.c.INSTANCE;
            I iH = androidx.compose.foundation.layout.d.h(companion3.o(), false);
            int iA2 = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF2 = interfaceC1554lR.F();
            b0.i iVarE2 = b0.h.e(interfaceC1554lR, iVarK);
            Ba.a<InterfaceC0828g> aVarA2 = companion2.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.n()) {
                interfaceC1554lR.T(aVarA2);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA2 = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA2, iH, companion2.c());
            C1.b(interfaceC1554lA2, interfaceC1578xF2, companion2.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB2 = companion2.b();
            if (interfaceC1554lA2.n() || !C3862t.b(interfaceC1554lA2.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA2.J(Integer.valueOf(iA2));
                interfaceC1554lA2.k(Integer.valueOf(iA2), pVarB2);
            }
            C1.b(interfaceC1554lA2, iVarE2, companion2.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
            pVar.invoke(interfaceC1554lR, Integer.valueOf(i11 & 14));
            interfaceC1554lR.P();
            b0.i iVarB = androidx.compose.ui.layout.a.b(companion, "action");
            I iH2 = androidx.compose.foundation.layout.d.h(companion3.o(), false);
            int iA3 = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF3 = interfaceC1554lR.F();
            b0.i iVarE3 = b0.h.e(interfaceC1554lR, iVarB);
            Ba.a<InterfaceC0828g> aVarA3 = companion2.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.n()) {
                interfaceC1554lR.T(aVarA3);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA3 = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA3, iH2, companion2.c());
            C1.b(interfaceC1554lA3, interfaceC1578xF3, companion2.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB3 = companion2.b();
            if (interfaceC1554lA3.n() || !C3862t.b(interfaceC1554lA3.f(), Integer.valueOf(iA3))) {
                interfaceC1554lA3.J(Integer.valueOf(iA3));
                interfaceC1554lA3.k(Integer.valueOf(iA3), pVarB3);
            }
            C1.b(interfaceC1554lA3, iVarE3, companion2.d());
            pVar2.invoke(interfaceC1554lR, Integer.valueOf((i11 >> 3) & 14));
            interfaceC1554lR.P();
            interfaceC1554lR.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new c(pVar, pVar2, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(b0.i r27, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r28, boolean r29, i0.c1 r30, long r31, long r33, float r35, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r36, kotlin.InterfaceC1554l r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.h0.c(b0.i, Ba.p, boolean, i0.c1, long, long, float, Ba.p, O.l, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(kotlin.c0 r27, b0.i r28, boolean r29, i0.c1 r30, long r31, long r33, long r35, float r37, kotlin.InterfaceC1554l r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.h0.d(I.c0, b0.i, boolean, i0.c1, long, long, long, float, O.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(917397959);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.l(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(917397959, i11, -1, "androidx.compose.material.TextOnlySnackbar (Snackbar.kt:238)");
            }
            i iVar = i.f6288a;
            i.Companion companion = b0.i.INSTANCE;
            int iA = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
            b0.i iVarE = b0.h.e(interfaceC1554lR, companion);
            InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion2.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.n()) {
                interfaceC1554lR.T(aVarA);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA, iVar, companion2.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
            if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion2.d());
            b0.i iVarJ = o.j(companion, f6232b, f6235e);
            I iH = androidx.compose.foundation.layout.d.h(b0.c.INSTANCE.o(), false);
            int iA2 = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF2 = interfaceC1554lR.F();
            b0.i iVarE2 = b0.h.e(interfaceC1554lR, iVarJ);
            Ba.a<InterfaceC0828g> aVarA2 = companion2.a();
            if (interfaceC1554lR.w() == null) {
                C1550j.c();
            }
            interfaceC1554lR.t();
            if (interfaceC1554lR.n()) {
                interfaceC1554lR.T(aVarA2);
            } else {
                interfaceC1554lR.H();
            }
            InterfaceC1554l interfaceC1554lA2 = C1.a(interfaceC1554lR);
            C1.b(interfaceC1554lA2, iH, companion2.c());
            C1.b(interfaceC1554lA2, interfaceC1578xF2, companion2.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB2 = companion2.b();
            if (interfaceC1554lA2.n() || !C3862t.b(interfaceC1554lA2.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA2.J(Integer.valueOf(iA2));
                interfaceC1554lA2.k(Integer.valueOf(iA2), pVarB2);
            }
            C1.b(interfaceC1554lA2, iVarE2, companion2.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
            pVar.invoke(interfaceC1554lR, Integer.valueOf(i11 & 14));
            interfaceC1554lR.P();
            interfaceC1554lR.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new j(pVar, i10));
        }
    }
}
