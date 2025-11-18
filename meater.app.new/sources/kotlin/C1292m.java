package kotlin;

import Ba.p;
import U0.h;
import Xb.I;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import h0.C3476g;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.C4737a;
import kotlin.C4761m;
import kotlin.C4774s0;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3854k;
import kotlin.m1;
import kotlin.r1;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import z.C5152a;
import z.C5153b;
import z.C5154c;
import z.C5155d;
import z.C5156e;
import z.C5157f;
import z.C5158g;
import z.InterfaceC5159h;
import z.InterfaceC5160i;
import z.m;

/* compiled from: Card.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"LK/m;", "", "LU0/h;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "draggedElevation", "disabledElevation", "<init>", "(FFFFFFLkotlin/jvm/internal/k;)V", "", "enabled", "Lz/i;", "interactionSource", "LO/x1;", "e", "(ZLz/i;LO/l;I)LO/x1;", "f", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "F", "b", "c", "d", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1292m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float draggedElevation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float disabledElevation;

    /* compiled from: Card.kt */
    @f(c = "androidx.compose.material3.CardElevation$animateElevation$1$1", f = "Card.kt", l = {674}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.m$a */
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f8480B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC5160i f8481C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<InterfaceC5159h> f8482D;

        /* compiled from: Card.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz/h;", "interaction", "Loa/F;", "b", "(Lz/h;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: K.m$a$a, reason: collision with other inner class name */
        static final class C0165a<T> implements InterfaceC1971f {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<InterfaceC5159h> f8483B;

            C0165a(SnapshotStateList<InterfaceC5159h> snapshotStateList) {
                this.f8483B = snapshotStateList;
            }

            @Override // ac.InterfaceC1971f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(InterfaceC5159h interfaceC5159h, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                if (interfaceC5159h instanceof C5157f) {
                    this.f8483B.add(interfaceC5159h);
                } else if (interfaceC5159h instanceof C5158g) {
                    this.f8483B.remove(((C5158g) interfaceC5159h).getEnter());
                } else if (interfaceC5159h instanceof C5155d) {
                    this.f8483B.add(interfaceC5159h);
                } else if (interfaceC5159h instanceof C5156e) {
                    this.f8483B.remove(((C5156e) interfaceC5159h).getFocus());
                } else if (interfaceC5159h instanceof m.b) {
                    this.f8483B.add(interfaceC5159h);
                } else if (interfaceC5159h instanceof m.c) {
                    this.f8483B.remove(((m.c) interfaceC5159h).getPress());
                } else if (interfaceC5159h instanceof m.a) {
                    this.f8483B.remove(((m.a) interfaceC5159h).getPress());
                } else if (interfaceC5159h instanceof C5153b) {
                    this.f8483B.add(interfaceC5159h);
                } else if (interfaceC5159h instanceof C5154c) {
                    this.f8483B.remove(((C5154c) interfaceC5159h).getStart());
                } else if (interfaceC5159h instanceof C5152a) {
                    this.f8483B.remove(((C5152a) interfaceC5159h).getStart());
                }
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5160i interfaceC5160i, SnapshotStateList<InterfaceC5159h> snapshotStateList, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f8481C = interfaceC5160i;
            this.f8482D = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(this.f8481C, this.f8482D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f8480B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1970e<InterfaceC5159h> interfaceC1970eB = this.f8481C.b();
                C0165a c0165a = new C0165a(this.f8482D);
                this.f8480B = 1;
                if (interfaceC1970eB.b(c0165a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: Card.kt */
    @f(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", l = {731, 741}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: K.m$b */
    static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f8484B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4737a<h, C4761m> f8485C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f8486D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f8487E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C1292m f8488F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ InterfaceC5159h f8489G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C4737a<h, C4761m> c4737a, float f10, boolean z10, C1292m c1292m, InterfaceC5159h interfaceC5159h, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f8485C = c4737a;
            this.f8486D = f10;
            this.f8487E = z10;
            this.f8488F = c1292m;
            this.f8489G = interfaceC5159h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new b(this.f8485C, this.f8486D, this.f8487E, this.f8488F, this.f8489G, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f8484B;
            if (i10 == 0) {
                C4173r.b(obj);
                if (!h.w(this.f8485C.k().getValue(), this.f8486D)) {
                    if (this.f8487E) {
                        float value = this.f8485C.k().getValue();
                        InterfaceC5159h c5153b = null;
                        if (h.w(value, this.f8488F.pressedElevation)) {
                            c5153b = new m.b(C3476g.INSTANCE.c(), null);
                        } else if (h.w(value, this.f8488F.hoveredElevation)) {
                            c5153b = new C5157f();
                        } else if (h.w(value, this.f8488F.focusedElevation)) {
                            c5153b = new C5155d();
                        } else if (h.w(value, this.f8488F.draggedElevation)) {
                            c5153b = new C5153b();
                        }
                        C4737a<h, C4761m> c4737a = this.f8485C;
                        float f10 = this.f8486D;
                        InterfaceC5159h interfaceC5159h = this.f8489G;
                        this.f8484B = 2;
                        if (L.f.d(c4737a, f10, c5153b, interfaceC5159h, this) == objE) {
                            return objE;
                        }
                    } else {
                        C4737a<h, C4761m> c4737a2 = this.f8485C;
                        h hVarP = h.p(this.f8486D);
                        this.f8484B = 1;
                        if (c4737a2.t(hVarP, this) == objE) {
                            return objE;
                        }
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ C1292m(float f10, float f11, float f12, float f13, float f14, float f15, C3854k c3854k) {
        this(f10, f11, f12, f13, f14, f15);
    }

    private final x1<h> e(boolean z10, InterfaceC5160i interfaceC5160i, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1421890746, i10, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:670)");
        }
        Object objF = interfaceC1554l.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = m1.f();
            interfaceC1554l.J(objF);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objF;
        boolean z11 = true;
        boolean z12 = (((i10 & 112) ^ 48) > 32 && interfaceC1554l.R(interfaceC5160i)) || (i10 & 48) == 32;
        Object objF2 = interfaceC1554l.f();
        if (z12 || objF2 == companion.a()) {
            objF2 = new a(interfaceC5160i, snapshotStateList, null);
            interfaceC1554l.J(objF2);
        }
        C1516O.e(interfaceC5160i, (p) objF2, interfaceC1554l, (i10 >> 3) & 14);
        InterfaceC5159h interfaceC5159h = (InterfaceC5159h) r.w0(snapshotStateList);
        float f10 = !z10 ? this.disabledElevation : interfaceC5159h instanceof m.b ? this.pressedElevation : interfaceC5159h instanceof C5157f ? this.hoveredElevation : interfaceC5159h instanceof C5155d ? this.focusedElevation : interfaceC5159h instanceof C5153b ? this.draggedElevation : this.defaultElevation;
        Object objF3 = interfaceC1554l.f();
        if (objF3 == companion.a()) {
            objF3 = new C4737a(h.p(f10), C4774s0.b(h.INSTANCE), null, null, 12, null);
            interfaceC1554l.J(objF3);
        }
        C4737a c4737a = (C4737a) objF3;
        h hVarP = h.p(f10);
        boolean zL = interfaceC1554l.l(c4737a) | interfaceC1554l.g(f10) | ((((i10 & 14) ^ 6) > 4 && interfaceC1554l.c(z10)) || (i10 & 6) == 4);
        if ((((i10 & 896) ^ 384) <= 256 || !interfaceC1554l.R(this)) && (i10 & 384) != 256) {
            z11 = false;
        }
        boolean zL2 = zL | z11 | interfaceC1554l.l(interfaceC5159h);
        Object objF4 = interfaceC1554l.f();
        if (zL2 || objF4 == companion.a()) {
            Object bVar = new b(c4737a, f10, z10, this, interfaceC5159h, null);
            interfaceC1554l.J(bVar);
            objF4 = bVar;
        }
        C1516O.e(hVarP, (p) objF4, interfaceC1554l, 0);
        x1<h> x1VarG = c4737a.g();
        if (C1560o.J()) {
            C1560o.R();
        }
        return x1VarG;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof C1292m)) {
            return false;
        }
        C1292m c1292m = (C1292m) other;
        return h.w(this.defaultElevation, c1292m.defaultElevation) && h.w(this.pressedElevation, c1292m.pressedElevation) && h.w(this.focusedElevation, c1292m.focusedElevation) && h.w(this.hoveredElevation, c1292m.hoveredElevation) && h.w(this.disabledElevation, c1292m.disabledElevation);
    }

    public final x1<h> f(boolean z10, InterfaceC5160i interfaceC5160i, InterfaceC1554l interfaceC1554l, int i10) {
        interfaceC1554l.S(-1763481333);
        if (C1560o.J()) {
            C1560o.S(-1763481333, i10, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:659)");
        }
        interfaceC1554l.S(-734838460);
        if (interfaceC5160i != null) {
            interfaceC1554l.I();
            x1<h> x1VarE = e(z10, interfaceC5160i, interfaceC1554l, i10 & 1022);
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return x1VarE;
        }
        Object objF = interfaceC1554l.f();
        if (objF == InterfaceC1554l.INSTANCE.a()) {
            objF = r1.c(h.p(this.defaultElevation), null, 2, null);
            interfaceC1554l.J(objF);
        }
        InterfaceC1563p0 interfaceC1563p0 = (InterfaceC1563p0) objF;
        interfaceC1554l.I();
        if (C1560o.J()) {
            C1560o.R();
        }
        interfaceC1554l.I();
        return interfaceC1563p0;
    }

    public int hashCode() {
        return (((((((h.x(this.defaultElevation) * 31) + h.x(this.pressedElevation)) * 31) + h.x(this.focusedElevation)) * 31) + h.x(this.hoveredElevation)) * 31) + h.x(this.disabledElevation);
    }

    private C1292m(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.focusedElevation = f12;
        this.hoveredElevation = f13;
        this.draggedElevation = f14;
        this.disabledElevation = f15;
    }
}
