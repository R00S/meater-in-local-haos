package androidx.compose.ui.window;

import A0.InterfaceC0828g;
import F0.v;
import F0.x;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.C1;
import kotlin.C1509K0;
import kotlin.C1510L;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.x1;
import oa.C4153F;
import y0.H;
import y0.I;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r²\u0006\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Loa/F;", "onDismissRequest", "Landroidx/compose/ui/window/j;", "properties", "content", "a", "(LBa/a;Landroidx/compose/ui/window/j;LBa/p;LO/l;II)V", "Lb0/i;", "modifier", "c", "(Lb0/i;LBa/p;LO/l;II)V", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ k f23620B;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/window/b$a$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.window.b$a$a, reason: collision with other inner class name */
        public static final class C0338a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f23621a;

            public C0338a(k kVar) {
                this.f23621a = kVar;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f23621a.dismiss();
                this.f23621a.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k kVar) {
            super(1);
            this.f23620B = kVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            this.f23620B.show();
            return new C0338a(this.f23620B);
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.window.b$b, reason: collision with other inner class name */
    static final class C0339b extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ k f23622B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f23623C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ j f23624D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ U0.t f23625E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0339b(k kVar, Ba.a<C4153F> aVar, j jVar, U0.t tVar) {
            super(0);
            this.f23622B = kVar;
            this.f23623C = aVar;
            this.f23624D = jVar;
            this.f23625E = tVar;
        }

        public final void a() {
            this.f23622B.o(this.f23623C, this.f23624D, this.f23625E);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f23626B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ j f23627C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.p<InterfaceC1554l, Integer, C4153F> f23628D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f23629E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f23630F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Ba.a<C4153F> aVar, j jVar, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10, int i11) {
            super(2);
            this.f23626B = aVar;
            this.f23627C = jVar;
            this.f23628D = pVar;
            this.f23629E = i10;
            this.f23630F = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            b.a(this.f23626B, this.f23627C, this.f23628D, interfaceC1554l, C1509K0.a(this.f23629E | 1), this.f23630F);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ x1<Ba.p<InterfaceC1554l, Integer, C4153F>> f23631B;

        /* compiled from: AndroidDialog.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF0/x;", "Loa/F;", "a", "(LF0/x;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.l<x, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final a f23632B = new a();

            a() {
                super(1);
            }

            public final void a(x xVar) {
                v.e(xVar);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(x xVar) {
                a(xVar);
                return C4153F.f46609a;
            }
        }

        /* compiled from: AndroidDialog.android.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.ui.window.b$d$b, reason: collision with other inner class name */
        static final class C0340b extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ x1<Ba.p<InterfaceC1554l, Integer, C4153F>> f23633B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0340b(x1<? extends Ba.p<? super InterfaceC1554l, ? super Integer, C4153F>> x1Var) {
                super(2);
                this.f23633B = x1Var;
            }

            public final void a(InterfaceC1554l interfaceC1554l, int i10) {
                if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                    interfaceC1554l.C();
                    return;
                }
                if (C1560o.J()) {
                    C1560o.S(-533674951, i10, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:188)");
                }
                b.b(this.f23633B).invoke(interfaceC1554l, 0);
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
        d(x1<? extends Ba.p<? super InterfaceC1554l, ? super Integer, C4153F>> x1Var) {
            super(2);
            this.f23631B = x1Var;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(488261145, i10, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:185)");
            }
            b.c(F0.o.d(b0.i.INSTANCE, false, a.f23632B, 1, null), W.c.d(-533674951, true, new C0340b(this.f23631B), interfaceC1554l, 54), interfaceC1554l, 48, 0);
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

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/UUID;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.a<UUID> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f23634B = new e();

        e() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;"}, k = 3, mv = {1, 8, 0})
    static final class f implements I {

        /* renamed from: a, reason: collision with root package name */
        public static final f f23635a = new f();

        /* compiled from: AndroidDialog.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ List<Z> f23636B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends Z> list) {
                super(1);
                this.f23636B = list;
            }

            public final void a(Z.a aVar) {
                List<Z> list = this.f23636B;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Z.a.l(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
                a(aVar);
                return C4153F.f46609a;
            }
        }

        f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r13v15 */
        /* JADX WARN: Type inference failed for: r13v17 */
        /* JADX WARN: Type inference failed for: r13v18 */
        /* JADX WARN: Type inference failed for: r13v23 */
        @Override // y0.I
        public final J e(K k10, List<? extends H> list, long j10) {
            Object obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).T(j10));
            }
            Z z10 = null;
            int i11 = 1;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int width = ((Z) obj).getWidth();
                int iO = kotlin.collections.r.o(arrayList);
                if (1 <= iO) {
                    int i12 = 1;
                    while (true) {
                        Object obj2 = arrayList.get(i12);
                        int width2 = ((Z) obj2).getWidth();
                        if (width < width2) {
                            obj = obj2;
                            width = width2;
                        }
                        if (i12 == iO) {
                            break;
                        }
                        i12++;
                    }
                }
            }
            Z z11 = (Z) obj;
            int width3 = z11 != null ? z11.getWidth() : U0.b.n(j10);
            if (!arrayList.isEmpty()) {
                ?? r13 = arrayList.get(0);
                int height = ((Z) r13).getHeight();
                int iO2 = kotlin.collections.r.o(arrayList);
                boolean z12 = r13;
                if (1 <= iO2) {
                    while (true) {
                        Object obj3 = arrayList.get(i11);
                        int height2 = ((Z) obj3).getHeight();
                        r13 = z12;
                        if (height < height2) {
                            r13 = obj3;
                            height = height2;
                        }
                        if (i11 == iO2) {
                            break;
                        }
                        i11++;
                        z12 = r13;
                    }
                }
                z10 = r13;
            }
            Z z13 = z10;
            return K.E1(k10, width3, z13 != null ? z13.getHeight() : U0.b.m(j10), null, new a(arrayList), 4, null);
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.i f23637B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.p<InterfaceC1554l, Integer, C4153F> f23638C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f23639D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f23640E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(b0.i iVar, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i10, int i11) {
            super(2);
            this.f23637B = iVar;
            this.f23638C = pVar;
            this.f23639D = i10;
            this.f23640E = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            b.c(this.f23637B, this.f23638C, interfaceC1554l, C1509K0.a(this.f23639D | 1), this.f23640E);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(Ba.a<oa.C4153F> r23, androidx.compose.ui.window.j r24, Ba.p<? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r25, kotlin.InterfaceC1554l r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.b.a(Ba.a, androidx.compose.ui.window.j, Ba.p, O.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ba.p<InterfaceC1554l, Integer, C4153F> b(x1<? extends Ba.p<? super InterfaceC1554l, ? super Integer, C4153F>> x1Var) {
        return (Ba.p) x1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b0.i iVar, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        int i12;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1177876616);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC1554lR.R(iVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC1554lR.l(pVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (i13 != 0) {
                iVar = b0.i.INSTANCE;
            }
            if (C1560o.J()) {
                C1560o.S(-1177876616, i12, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:464)");
            }
            f fVar = f.f23635a;
            int i14 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & 112);
            int iA = C1550j.a(interfaceC1554lR, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
            b0.i iVarE = b0.h.e(interfaceC1554lR, iVar);
            InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion.a();
            int i15 = ((i14 << 6) & 896) | 6;
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
            C1.b(interfaceC1554lA, fVar, companion.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
            Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
                interfaceC1554lA.J(Integer.valueOf(iA));
                interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion.d());
            pVar.invoke(interfaceC1554lR, Integer.valueOf((i15 >> 6) & 14));
            interfaceC1554lR.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new g(iVar, pVar, i10, i11));
        }
    }
}
