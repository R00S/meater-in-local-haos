package A;

import A.AbstractC0812u;
import A.C0794b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import s.C4402l;
import y0.InterfaceC5112q;
import y0.Z;

/* compiled from: FlowLayout.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u001c\u001a\u00020\u001b*\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010$\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\"J/\u0010%\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\"J/\u0010&\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\"JK\u0010)\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J+\u0010,\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e¢\u0006\u0004\b,\u0010-JK\u0010/\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b/\u0010*J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u00020\u00032\b\u00106\u001a\u0004\u0018\u000105HÖ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010DR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bH\u0010DR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010JR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010KR/\u0010P\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0L8\u0006¢\u0006\f\n\u0004\b;\u0010M\u001a\u0004\bN\u0010OR/\u0010S\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0L8\u0006¢\u0006\f\n\u0004\bQ\u0010M\u001a\u0004\bR\u0010OR/\u0010U\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0L8\u0006¢\u0006\f\n\u0004\bF\u0010M\u001a\u0004\bT\u0010OR/\u0010X\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0L8\u0006¢\u0006\f\n\u0004\bV\u0010M\u001a\u0004\bW\u0010O\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"LA/y;", "Ly0/N;", "LA/x;", "", "isHorizontal", "LA/b$d;", "horizontalArrangement", "LA/b$l;", "verticalArrangement", "LU0/h;", "mainAxisSpacing", "LA/m;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "maxItemsInMainAxis", "maxLines", "LA/v;", "overflow", "<init>", "(ZLA/b$d;LA/b$l;FLA/m;FIILA/v;Lkotlin/jvm/internal/k;)V", "Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;", "Ly0/r;", "Ly0/q;", "height", "c", "(Ly0/r;Ljava/util/List;I)I", "width", "h", "i", "d", "crossAxisAvailable", "crossAxisSpacing", "s", "(Ljava/util/List;IIIIILA/v;)I", "arrangementSpacing", "r", "(Ljava/util/List;II)I", "mainAxisAvailable", "q", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "j", "()Z", "b", "LA/b$d;", "o", "()LA/b$d;", "LA/b$l;", "p", "()LA/b$l;", "F", "LA/m;", "l", "()LA/m;", "f", "g", "I", "LA/v;", "Lkotlin/Function3;", "LBa/q;", "getMaxMainAxisIntrinsicItemSize", "()LBa/q;", "maxMainAxisIntrinsicItemSize", "k", "getMaxCrossAxisIntrinsicItemSize", "maxCrossAxisIntrinsicItemSize", "getMinCrossAxisIntrinsicItemSize", "minCrossAxisIntrinsicItemSize", "m", "getMinMainAxisIntrinsicItemSize", "minMainAxisIntrinsicItemSize", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.y, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
final /* data */ class FlowMeasurePolicy implements y0.N, InterfaceC0815x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isHorizontal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final C0794b.d horizontalArrangement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final C0794b.l verticalArrangement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float mainAxisSpacing;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC0805m crossAxisAlignment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float crossAxisArrangementSpacing;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxItemsInMainAxis;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final FlowLayoutOverflowState overflow;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Ba.q<InterfaceC5112q, Integer, Integer, Integer> maxMainAxisIntrinsicItemSize;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Ba.q<InterfaceC5112q, Integer, Integer, Integer> maxCrossAxisIntrinsicItemSize;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Ba.q<InterfaceC5112q, Integer, Integer, Integer> minCrossAxisIntrinsicItemSize;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Ba.q<InterfaceC5112q, Integer, Integer, Integer> minMainAxisIntrinsicItemSize;

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/q;", "", "<anonymous parameter 0>", "w", "a", "(Ly0/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.y$a */
    static final class a extends AbstractC3864v implements Ba.q<InterfaceC5112q, Integer, Integer, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f264B = new a();

        a() {
            super(3);
        }

        public final Integer a(InterfaceC5112q interfaceC5112q, int i10, int i11) {
            return Integer.valueOf(interfaceC5112q.q(i11));
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Integer g(InterfaceC5112q interfaceC5112q, Integer num, Integer num2) {
            return a(interfaceC5112q, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/q;", "", "<anonymous parameter 0>", "h", "a", "(Ly0/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.y$b */
    static final class b extends AbstractC3864v implements Ba.q<InterfaceC5112q, Integer, Integer, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f265B = new b();

        b() {
            super(3);
        }

        public final Integer a(InterfaceC5112q interfaceC5112q, int i10, int i11) {
            return Integer.valueOf(interfaceC5112q.S(i11));
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Integer g(InterfaceC5112q interfaceC5112q, Integer num, Integer num2) {
            return a(interfaceC5112q, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/q;", "", "<anonymous parameter 0>", "h", "a", "(Ly0/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.y$c */
    static final class c extends AbstractC3864v implements Ba.q<InterfaceC5112q, Integer, Integer, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f266B = new c();

        c() {
            super(3);
        }

        public final Integer a(InterfaceC5112q interfaceC5112q, int i10, int i11) {
            return Integer.valueOf(interfaceC5112q.S(i11));
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Integer g(InterfaceC5112q interfaceC5112q, Integer num, Integer num2) {
            return a(interfaceC5112q, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/q;", "", "<anonymous parameter 0>", "w", "a", "(Ly0/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.y$d */
    static final class d extends AbstractC3864v implements Ba.q<InterfaceC5112q, Integer, Integer, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f267B = new d();

        d() {
            super(3);
        }

        public final Integer a(InterfaceC5112q interfaceC5112q, int i10, int i11) {
            return Integer.valueOf(interfaceC5112q.q(i11));
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Integer g(InterfaceC5112q interfaceC5112q, Integer num, Integer num2) {
            return a(interfaceC5112q, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/q;", "", "<anonymous parameter 0>", "w", "a", "(Ly0/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.y$g */
    static final class g extends AbstractC3864v implements Ba.q<InterfaceC5112q, Integer, Integer, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final g f270B = new g();

        g() {
            super(3);
        }

        public final Integer a(InterfaceC5112q interfaceC5112q, int i10, int i11) {
            return Integer.valueOf(interfaceC5112q.f0(i11));
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Integer g(InterfaceC5112q interfaceC5112q, Integer num, Integer num2) {
            return a(interfaceC5112q, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/q;", "", "<anonymous parameter 0>", "h", "a", "(Ly0/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.y$h */
    static final class h extends AbstractC3864v implements Ba.q<InterfaceC5112q, Integer, Integer, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final h f271B = new h();

        h() {
            super(3);
        }

        public final Integer a(InterfaceC5112q interfaceC5112q, int i10, int i11) {
            return Integer.valueOf(interfaceC5112q.Q(i11));
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Integer g(InterfaceC5112q interfaceC5112q, Integer num, Integer num2) {
            return a(interfaceC5112q, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/q;", "", "<anonymous parameter 0>", "h", "a", "(Ly0/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.y$i */
    static final class i extends AbstractC3864v implements Ba.q<InterfaceC5112q, Integer, Integer, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final i f272B = new i();

        i() {
            super(3);
        }

        public final Integer a(InterfaceC5112q interfaceC5112q, int i10, int i11) {
            return Integer.valueOf(interfaceC5112q.Q(i11));
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Integer g(InterfaceC5112q interfaceC5112q, Integer num, Integer num2) {
            return a(interfaceC5112q, num.intValue(), num2.intValue());
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly0/q;", "", "<anonymous parameter 0>", "w", "a", "(Ly0/q;II)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.y$j */
    static final class j extends AbstractC3864v implements Ba.q<InterfaceC5112q, Integer, Integer, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final j f273B = new j();

        j() {
            super(3);
        }

        public final Integer a(InterfaceC5112q interfaceC5112q, int i10, int i11) {
            return Integer.valueOf(interfaceC5112q.f0(i11));
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Integer g(InterfaceC5112q interfaceC5112q, Integer num, Integer num2) {
            return a(interfaceC5112q, num.intValue(), num2.intValue());
        }
    }

    public /* synthetic */ FlowMeasurePolicy(boolean z10, C0794b.d dVar, C0794b.l lVar, float f10, AbstractC0805m abstractC0805m, float f11, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState, C3854k c3854k) {
        this(z10, dVar, lVar, f10, abstractC0805m, f11, i10, i11, flowLayoutOverflowState);
    }

    @Override // y0.N
    public int c(y0.r rVar, List<? extends List<? extends InterfaceC5112q>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) kotlin.collections.r.m0(list, 1);
        InterfaceC5112q interfaceC5112q = list2 != null ? (InterfaceC5112q) kotlin.collections.r.l0(list2) : null;
        List list3 = (List) kotlin.collections.r.m0(list, 2);
        flowLayoutOverflowState.m(interfaceC5112q, list3 != null ? (InterfaceC5112q) kotlin.collections.r.l0(list3) : null, getIsHorizontal(), U0.c.b(0, 0, 0, i10, 7, null));
        if (getIsHorizontal()) {
            List<? extends InterfaceC5112q> listM = (List) kotlin.collections.r.l0(list);
            if (listM == null) {
                listM = kotlin.collections.r.m();
            }
            return s(listM, i10, rVar.i1(this.mainAxisSpacing), rVar.i1(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends InterfaceC5112q> listM2 = (List) kotlin.collections.r.l0(list);
        if (listM2 == null) {
            listM2 = kotlin.collections.r.m();
        }
        return q(listM2, i10, rVar.i1(this.mainAxisSpacing), rVar.i1(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // y0.N
    public int d(y0.r rVar, List<? extends List<? extends InterfaceC5112q>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) kotlin.collections.r.m0(list, 1);
        InterfaceC5112q interfaceC5112q = list2 != null ? (InterfaceC5112q) kotlin.collections.r.l0(list2) : null;
        List list3 = (List) kotlin.collections.r.m0(list, 2);
        flowLayoutOverflowState.m(interfaceC5112q, list3 != null ? (InterfaceC5112q) kotlin.collections.r.l0(list3) : null, getIsHorizontal(), U0.c.b(0, 0, 0, i10, 7, null));
        if (getIsHorizontal()) {
            List<? extends InterfaceC5112q> listM = (List) kotlin.collections.r.l0(list);
            if (listM == null) {
                listM = kotlin.collections.r.m();
            }
            return r(listM, i10, rVar.i1(this.mainAxisSpacing));
        }
        List<? extends InterfaceC5112q> listM2 = (List) kotlin.collections.r.l0(list);
        if (listM2 == null) {
            listM2 = kotlin.collections.r.m();
        }
        return q(listM2, i10, rVar.i1(this.mainAxisSpacing), rVar.i1(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // y0.N
    public y0.J e(y0.K k10, List<? extends List<? extends y0.H>> list, long j10) {
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (U0.b.k(j10) == 0 && this.overflow.getType() != AbstractC0812u.a.Visible)) {
            return y0.K.E1(k10, 0, 0, null, e.f268B, 4, null);
        }
        List list2 = (List) kotlin.collections.r.j0(list);
        if (list2.isEmpty()) {
            return y0.K.E1(k10, 0, 0, null, f.f269B, 4, null);
        }
        List list3 = (List) kotlin.collections.r.m0(list, 1);
        y0.H h10 = list3 != null ? (y0.H) kotlin.collections.r.l0(list3) : null;
        List list4 = (List) kotlin.collections.r.m0(list, 2);
        y0.H h11 = list4 != null ? (y0.H) kotlin.collections.r.l0(list4) : null;
        this.overflow.j(list2.size());
        this.overflow.l(this, h10, h11, j10);
        return C0811t.e(k10, this, list2.iterator(), this.mainAxisSpacing, this.crossAxisArrangementSpacing, M.c(j10, getIsHorizontal() ? J.Horizontal : J.Vertical), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) other;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && C3862t.b(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && C3862t.b(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && U0.h.w(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && C3862t.b(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && U0.h.w(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && C3862t.b(this.overflow, flowMeasurePolicy.overflow);
    }

    @Override // y0.N
    public int h(y0.r rVar, List<? extends List<? extends InterfaceC5112q>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) kotlin.collections.r.m0(list, 1);
        InterfaceC5112q interfaceC5112q = list2 != null ? (InterfaceC5112q) kotlin.collections.r.l0(list2) : null;
        List list3 = (List) kotlin.collections.r.m0(list, 2);
        flowLayoutOverflowState.m(interfaceC5112q, list3 != null ? (InterfaceC5112q) kotlin.collections.r.l0(list3) : null, getIsHorizontal(), U0.c.b(0, i10, 0, 0, 13, null));
        if (getIsHorizontal()) {
            List<? extends InterfaceC5112q> listM = (List) kotlin.collections.r.l0(list);
            if (listM == null) {
                listM = kotlin.collections.r.m();
            }
            return q(listM, i10, rVar.i1(this.mainAxisSpacing), rVar.i1(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends InterfaceC5112q> listM2 = (List) kotlin.collections.r.l0(list);
        if (listM2 == null) {
            listM2 = kotlin.collections.r.m();
        }
        return s(listM2, i10, rVar.i1(this.mainAxisSpacing), rVar.i1(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + U0.h.x(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + U0.h.x(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.overflow.hashCode();
    }

    @Override // y0.N
    public int i(y0.r rVar, List<? extends List<? extends InterfaceC5112q>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) kotlin.collections.r.m0(list, 1);
        InterfaceC5112q interfaceC5112q = list2 != null ? (InterfaceC5112q) kotlin.collections.r.l0(list2) : null;
        List list3 = (List) kotlin.collections.r.m0(list, 2);
        flowLayoutOverflowState.m(interfaceC5112q, list3 != null ? (InterfaceC5112q) kotlin.collections.r.l0(list3) : null, getIsHorizontal(), U0.c.b(0, i10, 0, 0, 13, null));
        if (getIsHorizontal()) {
            List<? extends InterfaceC5112q> listM = (List) kotlin.collections.r.l0(list);
            if (listM == null) {
                listM = kotlin.collections.r.m();
            }
            return q(listM, i10, rVar.i1(this.mainAxisSpacing), rVar.i1(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends InterfaceC5112q> listM2 = (List) kotlin.collections.r.l0(list);
        if (listM2 == null) {
            listM2 = kotlin.collections.r.m();
        }
        return r(listM2, i10, rVar.i1(this.mainAxisSpacing));
    }

    @Override // A.InterfaceC0815x
    /* renamed from: j, reason: from getter */
    public boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    @Override // A.InterfaceC0815x
    /* renamed from: l, reason: from getter */
    public AbstractC0805m getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    @Override // A.InterfaceC0815x
    /* renamed from: o, reason: from getter */
    public C0794b.d getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // A.InterfaceC0815x
    /* renamed from: p, reason: from getter */
    public C0794b.l getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public final int q(List<? extends InterfaceC5112q> measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        return C4402l.e(C0811t.g(measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, mainAxisAvailable, mainAxisSpacing, crossAxisSpacing, maxItemsInMainAxis, maxLines, overflow));
    }

    public final int r(List<? extends InterfaceC5112q> measurables, int height, int arrangementSpacing) {
        return C0811t.j(measurables, this.maxMainAxisIntrinsicItemSize, height, arrangementSpacing, this.maxItemsInMainAxis);
    }

    public final int s(List<? extends InterfaceC5112q> measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        return C0811t.l(measurables, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, crossAxisAvailable, mainAxisSpacing, crossAxisSpacing, maxItemsInMainAxis, maxLines, overflow);
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) U0.h.y(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) U0.h.y(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
    }

    private FlowMeasurePolicy(boolean z10, C0794b.d dVar, C0794b.l lVar, float f10, AbstractC0805m abstractC0805m, float f11, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z10;
        this.horizontalArrangement = dVar;
        this.verticalArrangement = lVar;
        this.mainAxisSpacing = f10;
        this.crossAxisAlignment = abstractC0805m;
        this.crossAxisArrangementSpacing = f11;
        this.maxItemsInMainAxis = i10;
        this.maxLines = i11;
        this.overflow = flowLayoutOverflowState;
        this.maxMainAxisIntrinsicItemSize = getIsHorizontal() ? c.f266B : d.f267B;
        this.maxCrossAxisIntrinsicItemSize = getIsHorizontal() ? a.f264B : b.f265B;
        this.minCrossAxisIntrinsicItemSize = getIsHorizontal() ? g.f270B : h.f271B;
        this.minMainAxisIntrinsicItemSize = getIsHorizontal() ? i.f272B : j.f273B;
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.y$e */
    static final class e extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f268B = new e();

        e() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }

        public final void a(Z.a aVar) {
        }
    }

    /* compiled from: FlowLayout.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A.y$f */
    static final class f extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final f f269B = new f();

        f() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }

        public final void a(Z.a aVar) {
        }
    }
}
