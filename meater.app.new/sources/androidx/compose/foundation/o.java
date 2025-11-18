package androidx.compose.foundation;

import Ba.p;
import androidx.compose.runtime.snapshots.g;
import kotlin.C1538d1;
import kotlin.C5045y;
import kotlin.InterfaceC1557m0;
import kotlin.InterfaceC5041u;
import kotlin.InterfaceC5044x;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.m1;
import kotlin.x1;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;
import w.EnumC4950C;
import z.C5161j;
import z.InterfaceC5162k;

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 82\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R+\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0005R+\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00028F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u0005R\u001a\u0010#\u001a\u00020\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0016R\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u001b\u00100\u001a\u00020,8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b'\u0010/R\u001b\u00102\u001a\u00020,8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b\u001f\u0010/R$\u00106\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00028F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u0005R\u0014\u00107\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010/¨\u00069"}, d2 = {"Landroidx/compose/foundation/o;", "Lx/x;", "", "initial", "<init>", "(I)V", "Lw/C;", "scrollPriority", "Lkotlin/Function2;", "Lx/u;", "Lta/d;", "Loa/F;", "", "block", "b", "(Lw/C;LBa/p;Lta/d;)Ljava/lang/Object;", "", "delta", "f", "(F)F", "<set-?>", "a", "LO/m0;", "m", "()I", "o", "value", "getViewportSize", "p", "viewportSize", "Lz/k;", "c", "Lz/k;", "k", "()Lz/k;", "internalInteractionSource", "LO/m0;", "d", "_maxValueState", "e", "F", "accumulator", "Lx/x;", "scrollableState", "", "g", "LO/x1;", "()Z", "canScrollForward", "h", "canScrollBackward", "newMax", "l", "n", "maxValue", "isScrollInProgress", "i", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o implements InterfaceC5044x {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    private static final Y.j<o, ?> f22488j = Y.k.a(a.f22497B, b.f22498B);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1557m0 value;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float accumulator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1557m0 viewportSize = C1538d1.a(0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5162k internalInteractionSource = C5161j.a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1557m0 _maxValueState = C1538d1.a(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5044x scrollableState = C5045y.a(new f());

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final x1 canScrollForward = m1.d(new e());

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final x1 canScrollBackward = m1.d(new d());

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "Landroidx/compose/foundation/o;", "it", "", "a", "(LY/l;Landroidx/compose/foundation/o;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements p<Y.l, o, Integer> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f22497B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Y.l lVar, o oVar) {
            return Integer.valueOf(oVar.m());
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Landroidx/compose/foundation/o;", "a", "(I)Landroidx/compose/foundation/o;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<Integer, o> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f22498B = new b();

        b() {
            super(1);
        }

        public final o a(int i10) {
            return new o(i10);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ o invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/o$c;", "", "<init>", "()V", "LY/j;", "Landroidx/compose/foundation/o;", "Saver", "LY/j;", "a", "()LY/j;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.o$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final Y.j<o, ?> a() {
            return o.f22488j;
        }

        private Companion() {
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.a<Boolean> {
        d() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(o.this.m() > 0);
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements Ba.a<Boolean> {
        e() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(o.this.m() < o.this.l());
        }
    }

    /* compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class f extends AbstractC3864v implements Ba.l<Float, Float> {
        f() {
            super(1);
        }

        public final Float a(float f10) {
            float fM = o.this.m() + f10 + o.this.accumulator;
            float fJ = Ha.g.j(fM, 0.0f, o.this.l());
            boolean z10 = fM == fJ;
            float fM2 = fJ - o.this.m();
            int iRound = Math.round(fM2);
            o oVar = o.this;
            oVar.o(oVar.m() + iRound);
            o.this.accumulator = fM2 - iRound;
            if (!z10) {
                f10 = fM2;
            }
            return Float.valueOf(f10);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return a(f10.floatValue());
        }
    }

    public o(int i10) {
        this.value = C1538d1.a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(int i10) {
        this.value.g(i10);
    }

    @Override // kotlin.InterfaceC5044x
    public boolean a() {
        return this.scrollableState.a();
    }

    @Override // kotlin.InterfaceC5044x
    public Object b(EnumC4950C enumC4950C, p<? super InterfaceC5041u, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objB = this.scrollableState.b(enumC4950C, pVar, interfaceC4588d);
        return objB == C4696b.e() ? objB : C4153F.f46609a;
    }

    @Override // kotlin.InterfaceC5044x
    public boolean c() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    @Override // kotlin.InterfaceC5044x
    public boolean e() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // kotlin.InterfaceC5044x
    public float f(float delta) {
        return this.scrollableState.f(delta);
    }

    /* renamed from: k, reason: from getter */
    public final InterfaceC5162k getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int l() {
        return this._maxValueState.d();
    }

    public final int m() {
        return this.value.d();
    }

    public final void n(int i10) {
        this._maxValueState.g(i10);
        g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
        androidx.compose.runtime.snapshots.g gVarD = companion.d();
        Ba.l<Object, C4153F> lVarH = gVarD != null ? gVarD.h() : null;
        androidx.compose.runtime.snapshots.g gVarF = companion.f(gVarD);
        try {
            if (m() > i10) {
                o(i10);
            }
            C4153F c4153f = C4153F.f46609a;
            companion.m(gVarD, gVarF, lVarH);
        } catch (Throwable th) {
            companion.m(gVarD, gVarF, lVarH);
            throw th;
        }
    }

    public final void p(int i10) {
        this.viewportSize.g(i10);
    }
}
