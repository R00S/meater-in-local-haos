package A;

import A.AbstractC0805m;
import A.AbstractC0812u;
import A.C0794b;
import A.r;
import b0.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.C1509K0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s.C4379A;
import s.C4380B;
import s.C4402l;
import s.C4406p;
import y0.InterfaceC5112q;
import y0.Z;

/* compiled from: FlowLayout.kt */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a_\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aU\u0010\u001e\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u008d\u0001\u0010\"\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a2\u001e\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#\u001a]\u0010)\u001a\u00020(2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b)\u0010*\u001a\u008d\u0001\u0010+\u001a\u00020(2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a2\u001e\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0002¢\u0006\u0004\b+\u0010,\u001a\\\u00109\u001a\u000208*\u00020-2\u0006\u0010/\u001a\u00020.2\f\u00102\u001a\b\u0012\u0004\u0012\u000201002\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u00107\u001a\u0002062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a%\u0010=\u001a\u0004\u0018\u000101*\b\u0012\u0004\u0012\u000201002\b\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b=\u0010>\u001a#\u0010A\u001a\u00020\u0006*\u00020\u00182\u0006\u0010@\u001a\u00020?2\u0006\u0010 \u001a\u00020\u0006H\u0000¢\u0006\u0004\bA\u0010B\u001a#\u0010C\u001a\u00020\u0006*\u00020\u00182\u0006\u0010@\u001a\u00020?2\u0006\u0010\u001b\u001a\u00020\u0006H\u0000¢\u0006\u0004\bC\u0010B\u001a<\u0010G\u001a\u00020(*\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00107\u001a\u00020D2\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010E\u0012\u0004\u0012\u00020\r0\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\bG\u0010H\u001aT\u0010O\u001a\u000208*\u00020-2\u0006\u00107\u001a\u0002062\u0006\u0010I\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u00062\u0006\u0010&\u001a\u00020$2\f\u0010L\u001a\b\u0012\u0004\u0012\u0002080K2\u0006\u0010M\u001a\u00020.2\u0006\u0010N\u001a\u00020$H\u0000ø\u0001\u0000¢\u0006\u0004\bO\u0010P\"\u001a\u0010U\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010R\u001a\u0004\bS\u0010T\"\u001a\u0010X\u001a\u00020Q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bV\u0010R\u001a\u0004\bW\u0010T\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Y"}, d2 = {"Lb0/i;", "modifier", "LA/b$d;", "horizontalArrangement", "LA/b$l;", "verticalArrangement", "", "maxItemsInEachRow", "maxLines", "LA/z;", "overflow", "Lkotlin/Function1;", "LA/A;", "Loa/F;", "content", "a", "(Lb0/i;LA/b$d;LA/b$l;IILA/z;LBa/q;LO/l;II)V", "maxItemsInMainAxis", "LA/v;", "overflowState", "Ly0/N;", "n", "(LA/b$d;LA/b$l;IILA/v;LO/l;I)Ly0/N;", "", "Ly0/q;", "children", "Lkotlin/Function3;", "mainAxisSize", "crossAxisAvailable", "mainAxisSpacing", "j", "(Ljava/util/List;LBa/q;III)I", "crossAxisSize", "crossAxisSpacing", "l", "(Ljava/util/List;LBa/q;LBa/q;IIIIILA/v;)I", "", "mainAxisSizes", "crossAxisSizes", "mainAxisAvailable", "Ls/l;", "h", "(Ljava/util/List;[I[IIIIIILA/v;)J", "g", "(Ljava/util/List;LBa/q;LBa/q;IIIIILA/v;)J", "Ly0/K;", "LA/x;", "measurePolicy", "", "Ly0/H;", "measurablesIterator", "LU0/h;", "mainAxisSpacingDp", "crossAxisSpacingDp", "LA/M;", "constraints", "Ly0/J;", "e", "(Ly0/K;LA/x;Ljava/util/Iterator;FFJIILA/v;)Ly0/J;", "LA/w;", "info", "o", "(Ljava/util/Iterator;LA/w;)Ly0/H;", "", "isHorizontal", "i", "(Ly0/q;ZI)I", "f", "LU0/b;", "Ly0/Z;", "storePlaceable", "k", "(Ly0/H;LA/x;JLBa/l;)J", "mainAxisTotalSize", "crossAxisTotalSize", "LQ/b;", "items", "measureHelper", "outPosition", "m", "(Ly0/K;JII[ILQ/b;LA/x;[I)Ly0/J;", "LA/m;", "LA/m;", "getCROSS_AXIS_ALIGNMENT_TOP", "()LA/m;", "CROSS_AXIS_ALIGNMENT_TOP", "b", "getCROSS_AXIS_ALIGNMENT_START", "CROSS_AXIS_ALIGNMENT_START", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0811t {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC0805m f192a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC0805m f193b;

    /* compiled from: FlowLayout.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A.t$a */
    static final class a extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.i f194B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C0794b.d f195C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C0794b.l f196D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f197E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f198F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ C0817z f199G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ Ba.q<A, InterfaceC1554l, Integer, C4153F> f200H;

        /* renamed from: I, reason: collision with root package name */
        final /* synthetic */ int f201I;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ int f202J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b0.i iVar, C0794b.d dVar, C0794b.l lVar, int i10, int i11, C0817z c0817z, Ba.q<? super A, ? super InterfaceC1554l, ? super Integer, C4153F> qVar, int i12, int i13) {
            super(2);
            this.f194B = iVar;
            this.f195C = dVar;
            this.f196D = lVar;
            this.f197E = i10;
            this.f198F = i11;
            this.f199G = c0817z;
            this.f200H = qVar;
            this.f201I = i12;
            this.f202J = i13;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            C0811t.a(this.f194B, this.f195C, this.f196D, this.f197E, this.f198F, this.f199G, this.f200H, interfaceC1554l, C1509K0.a(this.f201I | 1), this.f202J);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.t$b */
    static final class b extends AbstractC3864v implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.q<A, InterfaceC1554l, Integer, C4153F> f203B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Ba.q<? super A, ? super InterfaceC1554l, ? super Integer, C4153F> qVar) {
            super(2);
            this.f203B = qVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-139531073, i10, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
            }
            this.f203B.g(B.f0b, interfaceC1554l, 6);
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

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly0/Z;", "placeable", "Loa/F;", "a", "(Ly0/Z;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.t$c */
    static final class c extends AbstractC3864v implements Ba.l<y0.Z, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O<y0.Z> f204B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(kotlin.jvm.internal.O<y0.Z> o10) {
            super(1);
            this.f204B = o10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(y0.Z z10) {
            this.f204B.f43978B = z10;
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(y0.Z z10) {
            a(z10);
            return C4153F.f46609a;
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly0/Z;", "placeable", "Loa/F;", "a", "(Ly0/Z;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.t$d */
    static final class d extends AbstractC3864v implements Ba.l<y0.Z, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.O<y0.Z> f205B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.jvm.internal.O<y0.Z> o10) {
            super(1);
            this.f205B = o10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(y0.Z z10) {
            this.f205B.f43978B = z10;
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(y0.Z z10) {
            a(z10);
            return C4153F.f46609a;
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/q;", "", "index", "<anonymous parameter 1>", "a", "(Ly0/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.t$e */
    static final class e extends AbstractC3864v implements Ba.q<InterfaceC5112q, Integer, Integer, Integer> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int[] f206B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int[] iArr) {
            super(3);
            this.f206B = iArr;
        }

        public final Integer a(InterfaceC5112q interfaceC5112q, int i10, int i11) {
            return Integer.valueOf(this.f206B[i10]);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Integer g(InterfaceC5112q interfaceC5112q, Integer num, Integer num2) {
            return a(interfaceC5112q, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/q;", "", "index", "<anonymous parameter 1>", "a", "(Ly0/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.t$f */
    static final class f extends AbstractC3864v implements Ba.q<InterfaceC5112q, Integer, Integer, Integer> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int[] f207B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int[] iArr) {
            super(3);
            this.f207B = iArr;
        }

        public final Integer a(InterfaceC5112q interfaceC5112q, int i10, int i11) {
            return Integer.valueOf(this.f207B[i10]);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Integer g(InterfaceC5112q interfaceC5112q, Integer num, Integer num2) {
            return a(interfaceC5112q, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.t$g */
    static final class g extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Q.b<y0.J> f208B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Q.b<y0.J> bVar) {
            super(1);
            this.f208B = bVar;
        }

        public final void a(Z.a aVar) {
            Q.b<y0.J> bVar = this.f208B;
            int size = bVar.getSize();
            if (size > 0) {
                y0.J[] jArrT = bVar.t();
                int i10 = 0;
                do {
                    jArrT[i10].e();
                    i10++;
                } while (i10 < size);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    static {
        AbstractC0805m.Companion companion = AbstractC0805m.INSTANCE;
        c.Companion companion2 = b0.c.INSTANCE;
        f192a = companion.b(companion2.l());
        f193b = companion.a(companion2.k());
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(b0.i r18, A.C0794b.d r19, A.C0794b.l r20, int r21, int r22, A.C0817z r23, Ba.q<? super A.A, ? super kotlin.InterfaceC1554l, ? super java.lang.Integer, oa.C4153F> r24, kotlin.InterfaceC1554l r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.C0811t.a(b0.i, A.b$d, A.b$l, int, int, A.z, Ba.q, O.l, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final y0.J e(y0.K k10, InterfaceC0815x interfaceC0815x, Iterator<? extends y0.H> it, float f10, float f11, long j10, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
        y0.H h10;
        Integer numValueOf;
        y0.H h11;
        C0814w c0814w;
        kotlin.jvm.internal.O o10;
        boolean z10;
        int i12;
        ArrayList arrayList;
        long j11;
        C4379A c4379a;
        int i13;
        Q.b bVar;
        C4379A c4379a2;
        r.a aVarA;
        C4380B c4380b;
        ArrayList arrayList2;
        int i14;
        int i15;
        int f53017b;
        int f53016a;
        int i16;
        int i17;
        C4380B c4380b2;
        ArrayList arrayList3;
        long j12;
        C4402l c4402lA;
        C4402l c4402lA2;
        C4379A c4379a3;
        int i18;
        int i19;
        C4379A c4379a4;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        r.a aVar;
        int i27;
        int i28;
        int iD;
        int iD2;
        Iterator<? extends y0.H> it2 = it;
        Q.b bVar2 = new Q.b(new y0.J[16], 0);
        int iL = U0.b.l(j10);
        int iN = U0.b.n(j10);
        int iK = U0.b.k(j10);
        C4380B c4380bB = C4406p.b();
        ArrayList arrayList4 = new ArrayList();
        int iCeil = (int) Math.ceil(k10.X0(f10));
        int iCeil2 = (int) Math.ceil(k10.X0(f11));
        long jA = M.a(0, iL, 0, iK);
        long jF = M.f(M.e(jA, 0, 0, 0, 0, 14, null), interfaceC0815x.getIsHorizontal() ? J.Horizontal : J.Vertical);
        kotlin.jvm.internal.O o11 = new kotlin.jvm.internal.O();
        int i29 = 0;
        C0814w c0814w2 = it2 instanceof C0804l ? new C0814w(0, 0, k10.E0(iL), k10.E0(iK), null) : null;
        y0.H hO = !it.hasNext() ? null : o(it2, c0814w2);
        C4402l c4402lA3 = hO != null ? C4402l.a(k(hO, interfaceC0815x, jF, new d(o11))) : null;
        Integer numValueOf2 = c4402lA3 != null ? Integer.valueOf(C4402l.e(c4402lA3.getPackedValue())) : null;
        if (c4402lA3 != null) {
            h10 = hO;
            numValueOf = Integer.valueOf(C4402l.f(c4402lA3.getPackedValue()));
        } else {
            h10 = hO;
            numValueOf = null;
        }
        C4379A c4379a5 = new C4379A(0, 1, null);
        C4379A c4379a6 = new C4379A(0, 1, null);
        r rVar = new r(i10, flowLayoutOverflowState, j10, i11, iCeil, iCeil2, null);
        r.b bVarB = rVar.b(it.hasNext(), 0, C4402l.b(iL, iK), c4402lA3, 0, 0, 0, false, false);
        if (bVarB.getIsLastItemInContainer()) {
            boolean z11 = c4402lA3 != null;
            c0814w = c0814w2;
            o10 = o11;
            j11 = jF;
            z10 = true;
            i12 = iCeil2;
            i13 = iCeil;
            c4379a = c4379a5;
            h11 = h10;
            arrayList = arrayList4;
            bVar = bVar2;
            c4379a2 = c4379a6;
            aVarA = rVar.a(bVarB, z11, -1, 0, iL, 0);
        } else {
            h11 = h10;
            c0814w = c0814w2;
            o10 = o11;
            z10 = true;
            i12 = iCeil2;
            arrayList = arrayList4;
            j11 = jF;
            c4379a = c4379a5;
            i13 = iCeil;
            bVar = bVar2;
            c4379a2 = c4379a6;
            aVarA = null;
        }
        int i30 = iL;
        r.a aVar2 = aVarA;
        y0.H h12 = h11;
        int i31 = iN;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        while (!bVarB.getIsLastItemInContainer() && h12 != null) {
            C3862t.d(numValueOf2);
            int iIntValue = numValueOf2.intValue();
            C3862t.d(numValueOf);
            C4379A c4379a7 = c4379a2;
            int i37 = i35 + iIntValue;
            int iMax = Math.max(i36, numValueOf.intValue());
            int i38 = i30 - iIntValue;
            int i39 = iL;
            int i40 = i33 + 1;
            int i41 = i31;
            flowLayoutOverflowState.k(i40);
            arrayList.add(h12);
            kotlin.jvm.internal.O o12 = o10;
            c4380bB.t(i33, o12.f43978B);
            int i42 = i40 - i34;
            boolean z12 = i42 < i10 ? z10 : false;
            if (c0814w != null) {
                if (z12) {
                    i17 = i34;
                    i27 = i29;
                } else {
                    i17 = i34;
                    i27 = i29 + 1;
                }
                int i43 = z12 ? i42 : 0;
                if (z12) {
                    c4380b2 = c4380bB;
                    arrayList3 = arrayList;
                    i28 = 0;
                    iD = Ha.g.d(i38 - i13, 0);
                } else {
                    c4380b2 = c4380bB;
                    arrayList3 = arrayList;
                    i28 = 0;
                    iD = i39;
                }
                float fE0 = k10.E0(iD);
                if (z12) {
                    i16 = i40;
                    iD2 = iK;
                } else {
                    i16 = i40;
                    iD2 = Ha.g.d((iK - iMax) - i12, i28);
                }
                c0814w.a(i27, i43, fE0, k10.E0(iD2));
            } else {
                i16 = i40;
                i17 = i34;
                c4380b2 = c4380bB;
                arrayList3 = arrayList;
            }
            y0.H hO2 = !it.hasNext() ? null : o(it2, c0814w);
            o12.f43978B = null;
            if (hO2 != null) {
                j12 = j11;
                c4402lA = C4402l.a(k(hO2, interfaceC0815x, j12, new c(o12)));
            } else {
                j12 = j11;
                c4402lA = null;
            }
            Integer numValueOf3 = c4402lA != null ? Integer.valueOf(C4402l.e(c4402lA.getPackedValue()) + i13) : null;
            Integer numValueOf4 = c4402lA != null ? Integer.valueOf(C4402l.f(c4402lA.getPackedValue())) : null;
            boolean zHasNext = it.hasNext();
            long jB = C4402l.b(i38, iK);
            if (c4402lA == null) {
                c4402lA2 = null;
            } else {
                C3862t.d(numValueOf3);
                int iIntValue2 = numValueOf3.intValue();
                C3862t.d(numValueOf4);
                c4402lA2 = C4402l.a(C4402l.b(iIntValue2, numValueOf4.intValue()));
            }
            r.b bVarB2 = rVar.b(zHasNext, i42, jB, c4402lA2, i29, i32, iMax, false, false);
            if (bVarB2.getIsLastItemInLine()) {
                int iMin = Math.min(Math.max(i41, i37), i39);
                int i44 = i32 + iMax;
                r.a aVarA2 = rVar.a(bVarB2, c4402lA != null ? z10 : false, i29, i44, i38, i42);
                c4379a3 = c4379a7;
                c4379a3.i(iMax);
                int i45 = (iK - i44) - i12;
                C4379A c4379a8 = c4379a;
                i22 = i16;
                c4379a8.i(i22);
                i29++;
                i21 = i39;
                i20 = i45;
                i19 = i22;
                numValueOf2 = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - i13) : null;
                i23 = 0;
                bVarB = bVarB2;
                i25 = iMin;
                c4379a4 = c4379a8;
                i24 = 0;
                i26 = i44 + i12;
                aVar = aVarA2;
                i18 = i21;
            } else {
                c4379a3 = c4379a7;
                i18 = i39;
                i19 = i16;
                bVarB = bVarB2;
                c4379a4 = c4379a;
                i20 = iK;
                i21 = i38;
                numValueOf2 = numValueOf3;
                i22 = i17;
                i23 = iMax;
                i24 = i37;
                i25 = i41;
                i26 = i32;
                aVar = aVar2;
            }
            c4379a = c4379a4;
            aVar2 = aVar;
            i32 = i26;
            i34 = i22;
            numValueOf = numValueOf4;
            it2 = it;
            c4379a2 = c4379a3;
            i31 = i25;
            i35 = i24;
            i36 = i23;
            j11 = j12;
            iK = i20;
            c4380bB = c4380b2;
            arrayList = arrayList3;
            o10 = o12;
            h12 = hO2;
            iL = i18;
            i33 = i19;
            i30 = i21;
        }
        int i46 = i31;
        C4380B c4380b3 = c4380bB;
        ArrayList arrayList5 = arrayList;
        C4379A c4379a9 = c4379a2;
        C4379A c4379a10 = c4379a;
        if (aVar2 != null) {
            arrayList2 = arrayList5;
            arrayList2.add(aVar2.getEllipsis());
            c4380b = c4380b3;
            c4380b.t(arrayList2.size() - 1, aVar2.getPlaceable());
            int i47 = c4379a10._size - 1;
            if (aVar2.getPlaceEllipsisOnLastContentLine()) {
                int i48 = c4379a10.get_size() - 1;
                c4379a9.o(i47, Math.max(c4379a9.a(i47), C4402l.f(aVar2.getEllipsisSize())));
                c4379a10.o(i48, c4379a10.g() + 1);
            } else {
                c4379a9.i(C4402l.f(aVar2.getEllipsisSize()));
                c4379a10.i(c4379a10.g() + 1);
            }
        } else {
            c4380b = c4380b3;
            arrayList2 = arrayList5;
        }
        int size = arrayList2.size();
        y0.Z[] zArr = new y0.Z[size];
        for (int i49 = 0; i49 < size; i49++) {
            zArr[i49] = c4380b.c(i49);
        }
        int i50 = c4379a10.get_size();
        int[] iArr = new int[i50];
        for (int i51 = 0; i51 < i50; i51++) {
            iArr[i51] = 0;
        }
        int i52 = c4379a10.get_size();
        int[] iArr2 = new int[i52];
        for (int i53 = 0; i53 < i52; i53++) {
            iArr2[i53] = 0;
        }
        int[] iArr3 = c4379a10.content;
        int i54 = c4379a10._size;
        int iMax2 = i46;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        while (i55 < i54) {
            int i58 = iArr3[i55];
            C4379A c4379a11 = c4379a9;
            int i59 = iMax2;
            int i60 = i55;
            int i61 = i54;
            int[] iArr4 = iArr3;
            int i62 = i57;
            int[] iArr5 = iArr2;
            int[] iArr6 = iArr;
            ArrayList arrayList6 = arrayList2;
            y0.J jA2 = S.a(interfaceC0815x, iMax2, U0.b.m(jA), U0.b.l(jA), c4379a9.a(i55), i13, k10, arrayList2, zArr, i62, i58, iArr, i60);
            if (interfaceC0815x.getIsHorizontal()) {
                f53017b = jA2.getWidth();
                f53016a = jA2.getHeight();
            } else {
                f53017b = jA2.getHeight();
                f53016a = jA2.getWidth();
            }
            iArr5[i60] = f53016a;
            i56 += f53016a;
            iMax2 = Math.max(i59, f53017b);
            bVar.c(jA2);
            iArr2 = iArr5;
            i57 = i58;
            c4379a9 = c4379a11;
            i54 = i61;
            iArr3 = iArr4;
            iArr = iArr6;
            arrayList2 = arrayList6;
            i55 = i60 + 1;
        }
        int i63 = iMax2;
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr;
        Q.b bVar3 = bVar;
        if (bVar3.x()) {
            i14 = 0;
            i15 = 0;
        } else {
            i14 = i63;
            i15 = i56;
        }
        return m(k10, j10, i14, i15, iArr7, bVar3, interfaceC0815x, iArr8);
    }

    public static final int f(InterfaceC5112q interfaceC5112q, boolean z10, int i10) {
        return z10 ? interfaceC5112q.f0(i10) : interfaceC5112q.Q(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(List<? extends InterfaceC5112q> list, Ba.q<? super InterfaceC5112q, ? super Integer, ? super Integer, Integer> qVar, Ba.q<? super InterfaceC5112q, ? super Integer, ? super Integer, Integer> qVar2, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i15;
        int i16;
        int i17 = 0;
        if (list.isEmpty()) {
            return C4402l.b(0, 0);
        }
        r rVar = new r(i13, flowLayoutOverflowState, M.a(0, i10, 0, Integer.MAX_VALUE), i14, i11, i12, null);
        InterfaceC5112q interfaceC5112q = (InterfaceC5112q) kotlin.collections.r.m0(list, 0);
        int iIntValue = interfaceC5112q != null ? qVar2.g(interfaceC5112q, 0, Integer.valueOf(i10)).intValue() : 0;
        int iIntValue2 = interfaceC5112q != null ? qVar.g(interfaceC5112q, 0, Integer.valueOf(iIntValue)).intValue() : 0;
        int i18 = 0;
        int iF = 0;
        int i19 = 0;
        if (rVar.b(list.size() > 1, 0, C4402l.b(i10, Integer.MAX_VALUE), interfaceC5112q == null ? null : C4402l.a(C4402l.b(iIntValue2, iIntValue)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            C4402l c4402lF = flowLayoutOverflowState.f(interfaceC5112q != null, 0, 0);
            return C4402l.b(c4402lF != null ? C4402l.f(c4402lF.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i20 = i10;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (true) {
            if (i21 >= size) {
                i15 = i22;
                break;
            }
            int i24 = i20 - iIntValue2;
            i15 = i21 + 1;
            int iMax = Math.max(i19, iIntValue);
            InterfaceC5112q interfaceC5112q2 = (InterfaceC5112q) kotlin.collections.r.m0(list, i15);
            int iIntValue3 = interfaceC5112q2 != null ? qVar2.g(interfaceC5112q2, Integer.valueOf(i15), Integer.valueOf(i10)).intValue() : i17;
            int iIntValue4 = interfaceC5112q2 != null ? qVar.g(interfaceC5112q2, Integer.valueOf(i15), Integer.valueOf(iIntValue3)).intValue() + i11 : 0;
            boolean z10 = i21 + 2 < list.size();
            int i25 = i15 - i23;
            r.b bVarB = rVar.b(z10, i25, C4402l.b(i24, Integer.MAX_VALUE), interfaceC5112q2 == null ? null : C4402l.a(C4402l.b(iIntValue4, iIntValue3)), i18, iF, iMax, false, false);
            if (bVarB.getIsLastItemInLine()) {
                iF += iMax + i12;
                r.a aVarA = rVar.a(bVarB, interfaceC5112q2 != null, i18, iF, i24, i25);
                int i26 = iIntValue4 - i11;
                i18++;
                if (!bVarB.getIsLastItemInContainer()) {
                    i16 = i10;
                    iIntValue2 = i26;
                    i23 = i15;
                    i19 = 0;
                } else if (aVarA != null) {
                    long ellipsisSize = aVarA.getEllipsisSize();
                    if (!aVarA.getPlaceEllipsisOnLastContentLine()) {
                        iF += C4402l.f(ellipsisSize) + i12;
                    }
                }
            } else {
                i19 = iMax;
                i16 = i24;
                iIntValue2 = iIntValue4;
            }
            i21 = i15;
            i22 = i21;
            i17 = 0;
            i20 = i16;
            iIntValue = iIntValue3;
        }
        return C4402l.b(iF - i12, i15);
    }

    private static final long h(List<? extends InterfaceC5112q> list, int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        return g(list, new e(iArr), new f(iArr2), i10, i11, i12, i13, i14, flowLayoutOverflowState);
    }

    public static final int i(InterfaceC5112q interfaceC5112q, boolean z10, int i10) {
        return z10 ? interfaceC5112q.Q(i10) : interfaceC5112q.f0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(List<? extends InterfaceC5112q> list, Ba.q<? super InterfaceC5112q, ? super Integer, ? super Integer, Integer> qVar, int i10, int i11, int i12) {
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < size) {
            int iIntValue = qVar.g(list.get(i13), Integer.valueOf(i13), Integer.valueOf(i10)).intValue() + i11;
            int i16 = i13 + 1;
            if (i16 - i14 == i12 || i16 == list.size()) {
                iMax = Math.max(iMax, (i15 + iIntValue) - i11);
                i15 = 0;
                i14 = i13;
            } else {
                i15 += iIntValue;
            }
            i13 = i16;
        }
        return iMax;
    }

    public static final long k(y0.H h10, InterfaceC0815x interfaceC0815x, long j10, Ba.l<? super y0.Z, C4153F> lVar) {
        if (P.e(P.c(h10)) != 0.0f) {
            int i10 = i(h10, interfaceC0815x.getIsHorizontal(), Integer.MAX_VALUE);
            return C4402l.b(i10, f(h10, interfaceC0815x.getIsHorizontal(), i10));
        }
        RowColumnParentData rowColumnParentDataC = P.c(h10);
        if (rowColumnParentDataC != null) {
            rowColumnParentDataC.c();
        }
        y0.Z zT = h10.T(j10);
        lVar.invoke(zT);
        return C4402l.b(interfaceC0815x.f(zT), interfaceC0815x.k(zT));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(List<? extends InterfaceC5112q> list, Ba.q<? super InterfaceC5112q, ? super Integer, ? super Integer, Integer> qVar, Ba.q<? super InterfaceC5112q, ? super Integer, ? super Integer, Integer> qVar2, int i10, int i11, int i12, int i13, int i14, FlowLayoutOverflowState flowLayoutOverflowState) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i15 = 0; i15 < size; i15++) {
            iArr[i15] = 0;
        }
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        for (int i16 = 0; i16 < size2; i16++) {
            iArr2[i16] = 0;
        }
        int size3 = list.size();
        for (int i17 = 0; i17 < size3; i17++) {
            InterfaceC5112q interfaceC5112q = list.get(i17);
            int iIntValue = qVar.g(interfaceC5112q, Integer.valueOf(i17), Integer.valueOf(i10)).intValue();
            iArr[i17] = iIntValue;
            iArr2[i17] = qVar2.g(interfaceC5112q, Integer.valueOf(i17), Integer.valueOf(iIntValue)).intValue();
        }
        int i18 = Integer.MAX_VALUE;
        if (i14 != Integer.MAX_VALUE && i13 != Integer.MAX_VALUE) {
            i18 = i13 * i14;
        }
        int iMin = Math.min(i18 - (((i18 >= list.size() || !(flowLayoutOverflowState.getType() == AbstractC0812u.a.ExpandIndicator || flowLayoutOverflowState.getType() == AbstractC0812u.a.ExpandOrCollapseIndicator)) && (i18 < list.size() || i14 < flowLayoutOverflowState.getMinLinesToShowCollapse() || flowLayoutOverflowState.getType() != AbstractC0812u.a.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int iZ0 = C3831l.z0(iArr) + ((list.size() - 1) * i11);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int iE = iArr2[0];
        kotlin.collections.J it = new Ha.f(1, C3831l.a0(iArr2)).iterator();
        while (it.hasNext()) {
            int i19 = iArr2[it.b()];
            if (iE < i19) {
                iE = i19;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i20 = iArr[0];
        kotlin.collections.J it2 = new Ha.f(1, C3831l.a0(iArr)).iterator();
        while (it2.hasNext()) {
            int i21 = iArr[it2.b()];
            if (i20 < i21) {
                i20 = i21;
            }
        }
        int i22 = i20;
        int i23 = iZ0;
        while (i22 <= i23) {
            if (iE == i10) {
                return iZ0;
            }
            int i24 = (i22 + i23) / 2;
            int i25 = i23;
            int i26 = i22;
            long jH = h(list, iArr, iArr2, i24, i11, i12, i13, i14, flowLayoutOverflowState);
            iE = C4402l.e(jH);
            int iF = C4402l.f(jH);
            if (iE > i10 || iF < iMin) {
                i22 = i24 + 1;
                if (i22 > i25) {
                    return i22;
                }
                i23 = i25;
                iZ0 = i24;
            } else {
                if (iE >= i10) {
                    return i24;
                }
                i23 = i24 - 1;
                iZ0 = i24;
                i22 = i26;
            }
        }
        return iZ0;
    }

    public static final y0.J m(y0.K k10, long j10, int i10, int i11, int[] iArr, Q.b<y0.J> bVar, InterfaceC0815x interfaceC0815x, int[] iArr2) {
        int iK;
        boolean zJ = interfaceC0815x.getIsHorizontal();
        C0794b.l lVarP = interfaceC0815x.getVerticalArrangement();
        C0794b.d dVarO = interfaceC0815x.getHorizontalArrangement();
        if (zJ) {
            if (lVarP == null) {
                throw new IllegalArgumentException("null verticalArrangement");
            }
            iK = Ha.g.k((k10.i1(lVarP.getSpacing()) * (bVar.getSize() - 1)) + i11, U0.b.m(j10), U0.b.k(j10));
            lVarP.b(k10, iK, iArr, iArr2);
        } else {
            if (dVarO == null) {
                throw new IllegalArgumentException("null horizontalArrangement");
            }
            int iK2 = Ha.g.k((k10.i1(dVarO.getSpacing()) * (bVar.getSize() - 1)) + i11, U0.b.m(j10), U0.b.k(j10));
            dVarO.c(k10, iK2, iArr, k10.getLayoutDirection(), iArr2);
            iK = iK2;
        }
        int iK3 = Ha.g.k(i10, U0.b.n(j10), U0.b.l(j10));
        if (!zJ) {
            int i12 = iK;
            iK = iK3;
            iK3 = i12;
        }
        return y0.K.E1(k10, iK3, iK, null, new g(bVar), 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final y0.N n(A.C0794b.d r17, A.C0794b.l r18, int r19, int r20, A.FlowLayoutOverflowState r21, kotlin.InterfaceC1554l r22, int r23) {
        /*
            r0 = r22
            r1 = r23
            boolean r2 = kotlin.C1560o.J()
            if (r2 == 0) goto L13
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)"
            r4 = -2134502475(0xffffffff80c613b5, float:-1.8190498E-38)
            kotlin.C1560o.S(r4, r1, r2, r3)
        L13:
            r2 = r1 & 14
            r2 = r2 ^ 6
            r3 = 4
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L25
            r2 = r17
            boolean r6 = r0.R(r2)
            if (r6 != 0) goto L2b
            goto L27
        L25:
            r2 = r17
        L27:
            r6 = r1 & 6
            if (r6 != r3) goto L2d
        L2b:
            r3 = r5
            goto L2e
        L2d:
            r3 = r4
        L2e:
            r6 = r1 & 112(0x70, float:1.57E-43)
            r6 = r6 ^ 48
            r7 = 32
            r9 = r18
            if (r6 <= r7) goto L3e
            boolean r6 = r0.R(r9)
            if (r6 != 0) goto L42
        L3e:
            r6 = r1 & 48
            if (r6 != r7) goto L44
        L42:
            r6 = r5
            goto L45
        L44:
            r6 = r4
        L45:
            r3 = r3 | r6
            r6 = r1 & 896(0x380, float:1.256E-42)
            r6 = r6 ^ 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            r13 = r19
            if (r6 <= r7) goto L56
            boolean r6 = r0.h(r13)
            if (r6 != 0) goto L5a
        L56:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != r7) goto L5c
        L5a:
            r6 = r5
            goto L5d
        L5c:
            r6 = r4
        L5d:
            r3 = r3 | r6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 ^ 3072(0xc00, float:4.305E-42)
            r7 = 2048(0x800, float:2.87E-42)
            r14 = r20
            if (r6 <= r7) goto L6e
            boolean r6 = r0.h(r14)
            if (r6 != 0) goto L72
        L6e:
            r1 = r1 & 3072(0xc00, float:4.305E-42)
            if (r1 != r7) goto L73
        L72:
            r4 = r5
        L73:
            r1 = r3 | r4
            r3 = r21
            boolean r4 = r0.R(r3)
            r1 = r1 | r4
            java.lang.Object r4 = r22.f()
            if (r1 != 0) goto L8a
            O.l$a r1 = kotlin.InterfaceC1554l.INSTANCE
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto Laa
        L8a:
            float r10 = r17.getSpacing()
            A.m r11 = A.C0811t.f192a
            float r12 = r18.getSpacing()
            A.y r4 = new A.y
            r7 = 1
            r16 = 0
            r6 = r4
            r8 = r17
            r9 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.J(r4)
        Laa:
            A.y r4 = (A.FlowMeasurePolicy) r4
            boolean r0 = kotlin.C1560o.J()
            if (r0 == 0) goto Lb5
            kotlin.C1560o.R()
        Lb5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: A.C0811t.n(A.b$d, A.b$l, int, int, A.v, O.l, int):y0.N");
    }

    private static final y0.H o(Iterator<? extends y0.H> it, C0814w c0814w) {
        y0.H next;
        try {
            if (it instanceof C0804l) {
                C3862t.d(c0814w);
                next = ((C0804l) it).d(c0814w);
            } else {
                next = it.next();
            }
            return next;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }
}
