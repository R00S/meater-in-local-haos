package kotlin;

import A.C0794b;
import A.C0799g;
import A.C0802j;
import A.InterfaceC0801i;
import A.N;
import A0.InterfaceC0828g;
import Ba.l;
import Ba.p;
import F0.v;
import F0.x;
import L.j;
import L.k;
import android.content.res.Resources;
import androidx.compose.foundation.layout.o;
import androidx.compose.ui.window.j;
import b0.c;
import b0.i;
import i0.C3602t0;
import i0.c1;
import java.util.ArrayList;
import java.util.List;
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
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.M;
import oa.C4153F;
import y0.H;
import y0.I;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: AlertDialog.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\u001a?\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a®\u0001\u0010\u0018\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0092\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a0\u0010 \u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\"\u001a\u0010%\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$\"\u001a\u0010'\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b&\u0010$\"\u0014\u0010(\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"\"\u0014\u0010)\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,\"\u0014\u00101\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,\"\u0014\u00103\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Lkotlin/Function0;", "Loa/F;", "onDismissRequest", "Lb0/i;", "modifier", "Landroidx/compose/ui/window/j;", "properties", "content", "d", "(LBa/a;Lb0/i;Landroidx/compose/ui/window/j;LBa/p;LO/l;II)V", "confirmButton", "dismissButton", "icon", "title", "text", "Li0/c1;", "shape", "Li0/t0;", "containerColor", "iconContentColor", "titleContentColor", "textContentColor", "LU0/h;", "tonalElevation", "c", "(LBa/a;LBa/p;Lb0/i;LBa/p;LBa/p;LBa/p;LBa/p;Li0/c1;JJJJFLandroidx/compose/ui/window/j;LO/l;II)V", "buttons", "buttonContentColor", "a", "(LBa/p;Lb0/i;LBa/p;LBa/p;LBa/p;Li0/c1;JFJJJJLO/l;III)V", "mainAxisSpacing", "crossAxisSpacing", "b", "(FFLBa/p;LO/l;I)V", "F", "l", "()F", "DialogMinWidth", "k", "DialogMaxWidth", "ButtonsMainAxisSpacing", "ButtonsCrossAxisSpacing", "LA/N;", "e", "LA/N;", "DialogPadding", "f", "IconPadding", "g", "TitlePadding", "h", "TextPadding", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.b, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1276b {

    /* renamed from: a, reason: collision with root package name */
    private static final float f8139a = U0.h.u(280);

    /* renamed from: b, reason: collision with root package name */
    private static final float f8140b = U0.h.u(560);

    /* renamed from: c, reason: collision with root package name */
    private static final float f8141c = U0.h.u(8);

    /* renamed from: d, reason: collision with root package name */
    private static final float f8142d = U0.h.u(12);

    /* renamed from: e, reason: collision with root package name */
    private static final N f8143e;

    /* renamed from: f, reason: collision with root package name */
    private static final N f8144f;

    /* renamed from: g, reason: collision with root package name */
    private static final N f8145g;

    /* renamed from: h, reason: collision with root package name */
    private static final N f8146h;

    /* compiled from: AlertDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.b$a */
    static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8147B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8148C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8149D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ long f8150E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f8151F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ long f8152G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ long f8153H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8154I;

        /* compiled from: AlertDialog.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.b$a$a, reason: collision with other inner class name */
        static final class C0161a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ InterfaceC0801i f8155B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8156C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0161a(InterfaceC0801i interfaceC0801i, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
                super(2);
                this.f8155B = interfaceC0801i;
                this.f8156C = pVar;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(934657765, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:303)");
                }
                InterfaceC0801i interfaceC0801i = this.f8155B;
                i iVarH = o.h(i.INSTANCE, C1276b.f8144f);
                c.Companion companion = b0.c.INSTANCE;
                i iVarB = interfaceC0801i.b(iVarH, companion.g());
                p<InterfaceC1554l, Integer, C4153F> pVar = this.f8156C;
                I iH = androidx.compose.foundation.layout.d.h(companion.o(), false);
                int iA = C1550j.a(interfaceC1554l, 0);
                InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                i iVarE = b0.h.e(interfaceC1554l, iVarB);
                InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
                Ba.a<InterfaceC0828g> aVarA = companion2.a();
                if (interfaceC1554l.w() == null) {
                    C1550j.c();
                }
                interfaceC1554l.t();
                if (interfaceC1554l.n()) {
                    interfaceC1554l.T(aVarA);
                } else {
                    interfaceC1554l.H();
                }
                InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                C1.b(interfaceC1554lA, iH, companion2.c());
                C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
                p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
                if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                    interfaceC1554lA.J(Integer.valueOf(iA));
                    interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                }
                C1.b(interfaceC1554lA, iVarE, companion2.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
                pVar.invoke(interfaceC1554l, 0);
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

        /* compiled from: AlertDialog.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.b$a$b */
        static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ InterfaceC0801i f8157B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8158C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8159D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(InterfaceC0801i interfaceC0801i, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2) {
                super(2);
                this.f8157B = interfaceC0801i;
                this.f8158C = pVar;
                this.f8159D = pVar2;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(434448772, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:313)");
                }
                i iVarB = this.f8157B.b(o.h(i.INSTANCE, C1276b.f8145g), this.f8158C == null ? b0.c.INSTANCE.k() : b0.c.INSTANCE.g());
                p<InterfaceC1554l, Integer, C4153F> pVar = this.f8159D;
                I iH = androidx.compose.foundation.layout.d.h(b0.c.INSTANCE.o(), false);
                int iA = C1550j.a(interfaceC1554l, 0);
                InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                i iVarE = b0.h.e(interfaceC1554l, iVarB);
                InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
                Ba.a<InterfaceC0828g> aVarA = companion.a();
                if (interfaceC1554l.w() == null) {
                    C1550j.c();
                }
                interfaceC1554l.t();
                if (interfaceC1554l.n()) {
                    interfaceC1554l.T(aVarA);
                } else {
                    interfaceC1554l.H();
                }
                InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                C1.b(interfaceC1554lA, iH, companion.c());
                C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
                p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
                if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                    interfaceC1554lA.J(Integer.valueOf(iA));
                    interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                }
                C1.b(interfaceC1554lA, iVarE, companion.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
                pVar.invoke(interfaceC1554l, 0);
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

        /* compiled from: AlertDialog.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.b$a$c */
        static final class c extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ InterfaceC0801i f8160B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8161C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(InterfaceC0801i interfaceC0801i, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
                super(2);
                this.f8160B = interfaceC0801i;
                this.f8161C = pVar;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-796843771, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:334)");
                }
                InterfaceC0801i interfaceC0801i = this.f8160B;
                i iVarH = o.h(interfaceC0801i.a(i.INSTANCE, 1.0f, false), C1276b.f8146h);
                c.Companion companion = b0.c.INSTANCE;
                i iVarB = interfaceC0801i.b(iVarH, companion.k());
                p<InterfaceC1554l, Integer, C4153F> pVar = this.f8161C;
                I iH = androidx.compose.foundation.layout.d.h(companion.o(), false);
                int iA = C1550j.a(interfaceC1554l, 0);
                InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
                i iVarE = b0.h.e(interfaceC1554l, iVarB);
                InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
                Ba.a<InterfaceC0828g> aVarA = companion2.a();
                if (interfaceC1554l.w() == null) {
                    C1550j.c();
                }
                interfaceC1554l.t();
                if (interfaceC1554l.n()) {
                    interfaceC1554l.T(aVarA);
                } else {
                    interfaceC1554l.H();
                }
                InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
                C1.b(interfaceC1554lA, iH, companion2.c());
                C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
                p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
                if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                    interfaceC1554lA.J(Integer.valueOf(iA));
                    interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
                }
                C1.b(interfaceC1554lA, iVarE, companion2.d());
                androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
                pVar.invoke(interfaceC1554l, 0);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, long j10, long j11, long j12, long j13, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4) {
            super(2);
            this.f8147B = pVar;
            this.f8148C = pVar2;
            this.f8149D = pVar3;
            this.f8150E = j10;
            this.f8151F = j11;
            this.f8152G = j12;
            this.f8153H = j13;
            this.f8154I = pVar4;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            p<InterfaceC1554l, Integer, C4153F> pVar;
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-2126308228, i10, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:300)");
            }
            i.Companion companion = i.INSTANCE;
            i iVarH = o.h(companion, C1276b.f8143e);
            p<InterfaceC1554l, Integer, C4153F> pVar2 = this.f8147B;
            p<InterfaceC1554l, Integer, C4153F> pVar3 = this.f8148C;
            p<InterfaceC1554l, Integer, C4153F> pVar4 = this.f8149D;
            long j10 = this.f8150E;
            long j11 = this.f8151F;
            long j12 = this.f8152G;
            long j13 = this.f8153H;
            p<InterfaceC1554l, Integer, C4153F> pVar5 = this.f8154I;
            C0794b.l lVarF = C0794b.f54a.f();
            c.Companion companion2 = b0.c.INSTANCE;
            I iA = C0799g.a(lVarF, companion2.k(), interfaceC1554l, 0);
            int iA2 = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            i iVarE = b0.h.e(interfaceC1554l, iVarH);
            InterfaceC0828g.Companion companion3 = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion3.a();
            if (interfaceC1554l.w() == null) {
                C1550j.c();
            }
            interfaceC1554l.t();
            if (interfaceC1554l.n()) {
                interfaceC1554l.T(aVarA);
            } else {
                interfaceC1554l.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
            C1.b(interfaceC1554lA, iA, companion3.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion3.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion3.b();
            if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA.J(Integer.valueOf(iA2));
                interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion3.d());
            C0802j c0802j = C0802j.f149a;
            interfaceC1554l.S(-1924971291);
            if (pVar2 != null) {
                C1576w.a(C1298s.a().d(C3602t0.g(j10)), W.c.d(934657765, true, new C0161a(c0802j, pVar2), interfaceC1554l, 54), interfaceC1554l, C1503H0.f12626i | 48);
            }
            interfaceC1554l.I();
            interfaceC1554l.S(-1924961479);
            if (pVar3 == null) {
                pVar = pVar5;
            } else {
                pVar = pVar5;
                L.i.a(j11, C1285f0.c(M.c.f11419a.f(), interfaceC1554l, 6), W.c.d(434448772, true, new b(c0802j, pVar2, pVar3), interfaceC1554l, 54), interfaceC1554l, 384);
            }
            interfaceC1554l.I();
            interfaceC1554l.S(-1924936431);
            if (pVar4 != null) {
                L.i.a(j12, C1285f0.c(M.c.f11419a.i(), interfaceC1554l, 6), W.c.d(-796843771, true, new c(c0802j, pVar4), interfaceC1554l, 54), interfaceC1554l, 384);
            }
            interfaceC1554l.I();
            i iVarB = c0802j.b(companion, companion2.j());
            I iH = androidx.compose.foundation.layout.d.h(companion2.o(), false);
            int iA3 = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF2 = interfaceC1554l.F();
            i iVarE2 = b0.h.e(interfaceC1554l, iVarB);
            Ba.a<InterfaceC0828g> aVarA2 = companion3.a();
            if (interfaceC1554l.w() == null) {
                C1550j.c();
            }
            interfaceC1554l.t();
            if (interfaceC1554l.n()) {
                interfaceC1554l.T(aVarA2);
            } else {
                interfaceC1554l.H();
            }
            InterfaceC1554l interfaceC1554lA2 = C1.a(interfaceC1554l);
            C1.b(interfaceC1554lA2, iH, companion3.c());
            C1.b(interfaceC1554lA2, interfaceC1578xF2, companion3.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB2 = companion3.b();
            if (interfaceC1554lA2.n() || !C3862t.b(interfaceC1554lA2.f(), Integer.valueOf(iA3))) {
                interfaceC1554lA2.J(Integer.valueOf(iA3));
                interfaceC1554lA2.k(Integer.valueOf(iA3), pVarB2);
            }
            C1.b(interfaceC1554lA2, iVarE2, companion3.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
            L.i.a(j13, C1285f0.c(M.c.f11419a.b(), interfaceC1554l, 6), pVar, interfaceC1554l, 0);
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

    /* compiled from: AlertDialog.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.b$b */
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8162B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i f8163C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8164D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8165E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8166F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ c1 f8167G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ long f8168H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ float f8169I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ long f8170J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ long f8171K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ long f8172L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ long f8173M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ int f8174N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ int f8175O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ int f8176P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, i iVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4, c1 c1Var, long j10, float f10, long j11, long j12, long j13, long j14, int i10, int i11, int i12) {
            super(2);
            this.f8162B = pVar;
            this.f8163C = iVar;
            this.f8164D = pVar2;
            this.f8165E = pVar3;
            this.f8166F = pVar4;
            this.f8167G = c1Var;
            this.f8168H = j10;
            this.f8169I = f10;
            this.f8170J = j11;
            this.f8171K = j12;
            this.f8172L = j13;
            this.f8173M = j14;
            this.f8174N = i10;
            this.f8175O = i11;
            this.f8176P = i12;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1276b.a(this.f8162B, this.f8163C, this.f8164D, this.f8165E, this.f8166F, this.f8167G, this.f8168H, this.f8169I, this.f8170J, this.f8171K, this.f8172L, this.f8173M, interfaceC1554l, C1509K0.a(this.f8174N | 1), C1509K0.a(this.f8175O), this.f8176P);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AlertDialog.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.b$c */
    static final class c implements I {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f8177a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f8178b;

        /* compiled from: AlertDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.b$c$a */
        static final class a extends AbstractC3864v implements l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ List<List<Z>> f8179B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ K f8180C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ float f8181D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f8182E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ List<Integer> f8183F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<List<Z>> list, K k10, float f10, int i10, List<Integer> list2) {
                super(1);
                this.f8179B = list;
                this.f8180C = k10;
                this.f8181D = f10;
                this.f8182E = i10;
                this.f8183F = list2;
            }

            public final void a(Z.a aVar) {
                List<List<Z>> list = this.f8179B;
                K k10 = this.f8180C;
                float f10 = this.f8181D;
                int i10 = this.f8182E;
                List<Integer> list2 = this.f8183F;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    List<Z> list3 = list.get(i11);
                    int size2 = list3.size();
                    int[] iArr = new int[size2];
                    int i12 = 0;
                    while (i12 < size2) {
                        iArr[i12] = list3.get(i12).getWidth() + (i12 < r.o(list3) ? k10.i1(f10) : 0);
                        i12++;
                    }
                    C0794b.d dVarC = C0794b.f54a.c();
                    int[] iArr2 = new int[size2];
                    for (int i13 = 0; i13 < size2; i13++) {
                        iArr2[i13] = 0;
                    }
                    dVarC.c(k10, i10, iArr, k10.getLayoutDirection(), iArr2);
                    int size3 = list3.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        Z.a.h(aVar, list3.get(i14), iArr2[i14], list2.get(i11).intValue(), 0.0f, 4, null);
                    }
                }
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
                a(aVar);
                return C4153F.f46609a;
            }
        }

        c(float f10, float f11) {
            this.f8177a = f10;
            this.f8178b = f11;
        }

        private static final boolean a(List<Z> list, M m10, K k10, float f10, long j10, Z z10) {
            return list.isEmpty() || (m10.f43976B + k10.i1(f10)) + z10.getWidth() <= U0.b.l(j10);
        }

        private static final void b(List<List<Z>> list, M m10, K k10, float f10, List<Z> list2, List<Integer> list3, M m11, List<Integer> list4, M m12, M m13) {
            if (!list.isEmpty()) {
                m10.f43976B += k10.i1(f10);
            }
            list.add(0, r.W0(list2));
            list3.add(Integer.valueOf(m11.f43976B));
            list4.add(Integer.valueOf(m10.f43976B));
            m10.f43976B += m11.f43976B;
            m12.f43976B = Math.max(m12.f43976B, m13.f43976B);
            list2.clear();
            m13.f43976B = 0;
            m11.f43976B = 0;
        }

        @Override // y0.I
        public final J e(K k10, List<? extends H> list, long j10) {
            M m10;
            M m11;
            ArrayList arrayList;
            M m12;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            M m13 = new M();
            M m14 = new M();
            ArrayList arrayList5 = new ArrayList();
            M m15 = new M();
            M m16 = new M();
            float f10 = this.f8177a;
            float f11 = this.f8178b;
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                ArrayList arrayList6 = arrayList4;
                M m17 = m13;
                Z zT = list.get(i10).T(j10);
                int i11 = i10;
                float f12 = f11;
                int i12 = size;
                float f13 = f10;
                if (a(arrayList5, m15, k10, f10, j10, zT)) {
                    m10 = m16;
                    m11 = m15;
                    arrayList = arrayList5;
                } else {
                    m10 = m16;
                    m11 = m15;
                    arrayList = arrayList5;
                    b(arrayList2, m14, k10, f12, arrayList5, arrayList3, m16, arrayList6, m17, m11);
                }
                if (arrayList.isEmpty()) {
                    m12 = m11;
                } else {
                    m12 = m11;
                    m12.f43976B += k10.i1(f13);
                }
                ArrayList arrayList7 = arrayList;
                arrayList7.add(zT);
                m12.f43976B += zT.getWidth();
                m10.f43976B = Math.max(m10.f43976B, zT.getHeight());
                i10 = i11 + 1;
                m15 = m12;
                f10 = f13;
                m16 = m10;
                arrayList4 = arrayList6;
                m13 = m17;
                size = i12;
                arrayList5 = arrayList7;
                f11 = f12;
            }
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = arrayList4;
            M m18 = m13;
            M m19 = m16;
            M m20 = m15;
            if (!arrayList8.isEmpty()) {
                b(arrayList2, m14, k10, this.f8178b, arrayList8, arrayList3, m19, arrayList9, m18, m20);
            }
            int iMax = Math.max(m18.f43976B, U0.b.n(j10));
            return K.E1(k10, iMax, Math.max(m14.f43976B, U0.b.m(j10)), null, new a(arrayList2, k10, this.f8177a, iMax, arrayList9), 4, null);
        }
    }

    /* compiled from: AlertDialog.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.b$d */
    static final class d extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ float f8184B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f8185C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8186D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f8187E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(float f10, float f11, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10) {
            super(2);
            this.f8184B = f10;
            this.f8185C = f11;
            this.f8186D = pVar;
            this.f8187E = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1276b.b(this.f8184B, this.f8185C, this.f8186D, interfaceC1554l, C1509K0.a(this.f8187E | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AlertDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.b$e */
    static final class e extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8188B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8189C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8190D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ c1 f8191E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ long f8192F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ float f8193G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ long f8194H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ long f8195I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ long f8196J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8197K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8198L;

        /* compiled from: AlertDialog.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.b$e$a */
        static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8199B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8200C;

            /* compiled from: AlertDialog.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: K.b$e$a$a, reason: collision with other inner class name */
            static final class C0162a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

                /* renamed from: B, reason: collision with root package name */
                final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8201B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8202C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0162a(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2) {
                    super(2);
                    this.f8201B = pVar;
                    this.f8202C = pVar2;
                }

                public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                    if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                        interfaceC1554l.C();
                        return;
                    }
                    if (C1560o.J()) {
                        C1560o.S(1887135077, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:258)");
                    }
                    p<InterfaceC1554l, Integer, C4153F> pVar = this.f8201B;
                    interfaceC1554l.S(1497073862);
                    if (pVar != null) {
                        pVar.invoke(interfaceC1554l, 0);
                        C4153F c4153f = C4153F.f46609a;
                    }
                    interfaceC1554l.I();
                    this.f8202C.invoke(interfaceC1554l, 0);
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
            a(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2) {
                super(2);
                this.f8199B = pVar;
                this.f8200C = pVar2;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(1163543932, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:254)");
                }
                C1276b.b(C1276b.f8141c, C1276b.f8142d, W.c.d(1887135077, true, new C0162a(this.f8199B, this.f8200C), interfaceC1554l, 54), interfaceC1554l, 438);
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
        e(p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, c1 c1Var, long j10, float f10, long j11, long j12, long j13, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar5) {
            super(2);
            this.f8188B = pVar;
            this.f8189C = pVar2;
            this.f8190D = pVar3;
            this.f8191E = c1Var;
            this.f8192F = j10;
            this.f8193G = f10;
            this.f8194H = j11;
            this.f8195I = j12;
            this.f8196J = j13;
            this.f8197K = pVar4;
            this.f8198L = pVar5;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1852840226, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:252)");
            }
            C1276b.a(W.c.d(1163543932, true, new a(this.f8197K, this.f8198L), interfaceC1554l, 54), null, this.f8188B, this.f8189C, this.f8190D, this.f8191E, this.f8192F, this.f8193G, C1295p.f(M.c.f11419a.a(), interfaceC1554l, 6), this.f8194H, this.f8195I, this.f8196J, interfaceC1554l, 6, 0, 2);
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

    /* compiled from: AlertDialog.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.b$f */
    static final class f extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f8203B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8204C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ i f8205D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8206E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8207F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8208G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8209H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ c1 f8210I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ long f8211J;

        /* renamed from: K, reason: collision with root package name */
        final /* synthetic */ long f8212K;

        /* renamed from: L, reason: collision with root package name */
        final /* synthetic */ long f8213L;

        /* renamed from: M, reason: collision with root package name */
        final /* synthetic */ long f8214M;

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ float f8215N;

        /* renamed from: O, reason: collision with root package name */
        final /* synthetic */ j f8216O;

        /* renamed from: P, reason: collision with root package name */
        final /* synthetic */ int f8217P;

        /* renamed from: Q, reason: collision with root package name */
        final /* synthetic */ int f8218Q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Ba.a<C4153F> aVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, i iVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar5, c1 c1Var, long j10, long j11, long j12, long j13, float f10, j jVar, int i10, int i11) {
            super(2);
            this.f8203B = aVar;
            this.f8204C = pVar;
            this.f8205D = iVar;
            this.f8206E = pVar2;
            this.f8207F = pVar3;
            this.f8208G = pVar4;
            this.f8209H = pVar5;
            this.f8210I = c1Var;
            this.f8211J = j10;
            this.f8212K = j11;
            this.f8213L = j12;
            this.f8214M = j13;
            this.f8215N = f10;
            this.f8216O = jVar;
            this.f8217P = i10;
            this.f8218Q = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1276b.c(this.f8203B, this.f8204C, this.f8205D, this.f8206E, this.f8207F, this.f8208G, this.f8209H, this.f8210I, this.f8211J, this.f8212K, this.f8213L, this.f8214M, this.f8215N, this.f8216O, interfaceC1554l, C1509K0.a(this.f8217P | 1), C1509K0.a(this.f8218Q));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AlertDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.b$g */
    static final class g extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i f8219B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8220C;

        /* compiled from: AlertDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.b$g$a */
        static final class a extends AbstractC3864v implements l<x, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ String f8221B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(1);
                this.f8221B = str;
            }

            public final void a(x xVar) {
                v.F(xVar, this.f8221B);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
                a(xVar);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(i iVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
            super(2);
            this.f8219B = iVar;
            this.f8220C = pVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) throws Resources.NotFoundException {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(905289008, i10, -1, "androidx.compose.material3.BasicAlertDialog.<anonymous> (AlertDialog.kt:150)");
            }
            j.Companion companion = L.j.INSTANCE;
            String strA = k.a(L.j.a(C1260L.f7970a), interfaceC1554l, 0);
            i iVarP = androidx.compose.foundation.layout.r.p(this.f8219B, C1276b.l(), 0.0f, C1276b.k(), 0.0f, 10, null);
            i.Companion companion2 = i.INSTANCE;
            boolean zR = interfaceC1554l.R(strA);
            Object objF = interfaceC1554l.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new a(strA);
                interfaceC1554l.J(objF);
            }
            i iVarE = iVarP.e(F0.o.d(companion2, false, (l) objF, 1, null));
            p<InterfaceC1554l, Integer, C4153F> pVar = this.f8220C;
            I iH = androidx.compose.foundation.layout.d.h(b0.c.INSTANCE.o(), true);
            int iA = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            i iVarE2 = b0.h.e(interfaceC1554l, iVarE);
            InterfaceC0828g.Companion companion3 = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion3.a();
            if (interfaceC1554l.w() == null) {
                C1550j.c();
            }
            interfaceC1554l.t();
            if (interfaceC1554l.n()) {
                interfaceC1554l.T(aVarA);
            } else {
                interfaceC1554l.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
            C1.b(interfaceC1554lA, iH, companion3.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion3.e());
            p<InterfaceC0828g, Integer, C4153F> pVarB = companion3.b();
            if (interfaceC1554lA.n() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE2, companion3.d());
            androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
            pVar.invoke(interfaceC1554l, 0);
            interfaceC1554l.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) throws Resources.NotFoundException {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AlertDialog.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: K.b$h */
    static final class h extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f8222B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i f8223C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.j f8224D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f8225E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f8226F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f8227G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Ba.a<C4153F> aVar, i iVar, androidx.compose.ui.window.j jVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10, int i11) {
            super(2);
            this.f8222B = aVar;
            this.f8223C = iVar;
            this.f8224D = jVar;
            this.f8225E = pVar;
            this.f8226F = i10;
            this.f8227G = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C1276b.d(this.f8222B, this.f8223C, this.f8224D, this.f8225E, interfaceC1554l, C1509K0.a(this.f8226F | 1), this.f8227G);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    static {
        float f10 = 24;
        f8143e = o.a(U0.h.u(f10));
        float f11 = 16;
        f8144f = o.e(0.0f, 0.0f, 0.0f, U0.h.u(f11), 7, null);
        f8145g = o.e(0.0f, 0.0f, 0.0f, U0.h.u(f11), 7, null);
        f8146h = o.e(0.0f, 0.0f, 0.0f, U0.h.u(f10), 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r33, b0.i r34, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r35, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r36, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r37, i0.c1 r38, long r39, float r41, long r42, long r44, long r46, long r48, kotlin.InterfaceC1554l r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1276b.a(Ba.p, b0.i, Ba.p, Ba.p, Ba.p, i0.c1, long, float, long, long, long, long, O.l, int, int, int):void");
    }

    public static final void b(float f10, float f11, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10) {
        int i11;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(586821353);
        if ((i10 & 6) == 0) {
            i11 = (interfaceC1554lR.g(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= interfaceC1554lR.g(f11) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= interfaceC1554lR.l(pVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(586821353, i11, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:364)");
            }
            boolean z10 = ((i11 & 14) == 4) | ((i11 & 112) == 32);
            Object objF = interfaceC1554lR.f();
            if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new c(f10, f11);
                interfaceC1554lR.J(objF);
            }
            I i12 = (I) objF;
            int i13 = (i11 >> 6) & 14;
            i.Companion companion = i.INSTANCE;
            int iA = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
            i iVarE = b0.h.e(interfaceC1554lR, companion);
            InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion2.a();
            int i14 = ((i13 << 6) & 896) | 6;
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
            pVar.invoke(interfaceC1554lR, Integer.valueOf((i14 >> 6) & 14));
            interfaceC1554lR.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new d(f10, f11, pVar, i10));
        }
    }

    public static final void c(Ba.a<C4153F> aVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, i iVar, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar2, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar3, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar4, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar5, c1 c1Var, long j10, long j11, long j12, long j13, float f10, androidx.compose.ui.window.j jVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        int i12;
        int i13;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-919826268);
        if ((i10 & 6) == 0) {
            i12 = (interfaceC1554lR.l(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= interfaceC1554lR.l(pVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= interfaceC1554lR.R(iVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= interfaceC1554lR.l(pVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= interfaceC1554lR.l(pVar3) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= interfaceC1554lR.l(pVar4) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= interfaceC1554lR.l(pVar5) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= interfaceC1554lR.R(c1Var) ? 8388608 : 4194304;
        }
        int i14 = i12;
        if ((i10 & 100663296) == 0) {
            i14 |= interfaceC1554lR.i(j10) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i14 |= interfaceC1554lR.i(j11) ? 536870912 : 268435456;
        }
        int i15 = i14;
        if ((i11 & 6) == 0) {
            i13 = i11 | (interfaceC1554lR.i(j12) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= interfaceC1554lR.i(j13) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= interfaceC1554lR.g(f10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= interfaceC1554lR.R(jVar) ? 2048 : 1024;
        }
        int i16 = i13;
        if ((306783379 & i15) == 306783378 && (i16 & 1171) == 1170 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-919826268, i15, i16, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:247)");
            }
            d(aVar, iVar, jVar, W.c.d(-1852840226, true, new e(pVar3, pVar4, pVar5, c1Var, j10, f10, j11, j12, j13, pVar2, pVar), interfaceC1554lR, 54), interfaceC1554lR, ((i16 >> 3) & 896) | (i15 & 14) | 3072 | ((i15 >> 3) & 112), 0);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new f(aVar, pVar, iVar, pVar2, pVar3, pVar4, pVar5, c1Var, j10, j11, j12, j13, f10, jVar, i10, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(Ba.a<oa.C4153F> r19, b0.i r20, androidx.compose.ui.window.j r21, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r22, kotlin.InterfaceC1554l r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1276b.d(Ba.a, b0.i, androidx.compose.ui.window.j, Ba.p, O.l, int, int):void");
    }

    public static final float k() {
        return f8140b;
    }

    public static final float l() {
        return f8139a;
    }
}
