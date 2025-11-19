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
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3854k;
import kotlin.m1;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import z.C5155d;
import z.C5156e;
import z.C5157f;
import z.C5158g;
import z.InterfaceC5159h;
import z.InterfaceC5160i;
import z.m;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"LI/p;", "LI/f;", "LU0/h;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFFLkotlin/jvm/internal/k;)V", "", "enabled", "Lz/i;", "interactionSource", "LO/x1;", "a", "(ZLz/i;LO/l;I)LO/x1;", "F", "b", "c", "d", "e", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1153p implements InterfaceC1143f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float disabledElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* compiled from: Button.kt */
    @f(c = "androidx.compose.material.DefaultButtonElevation$elevation$1$1", f = "Button.kt", l = {510}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.p$a */
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6436B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC5160i f6437C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<InterfaceC5159h> f6438D;

        /* compiled from: Button.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz/h;", "interaction", "Loa/F;", "b", "(Lz/h;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.p$a$a, reason: collision with other inner class name */
        static final class C0123a<T> implements InterfaceC1971f {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<InterfaceC5159h> f6439B;

            C0123a(SnapshotStateList<InterfaceC5159h> snapshotStateList) {
                this.f6439B = snapshotStateList;
            }

            @Override // ac.InterfaceC1971f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(InterfaceC5159h interfaceC5159h, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                if (interfaceC5159h instanceof C5157f) {
                    this.f6439B.add(interfaceC5159h);
                } else if (interfaceC5159h instanceof C5158g) {
                    this.f6439B.remove(((C5158g) interfaceC5159h).getEnter());
                } else if (interfaceC5159h instanceof C5155d) {
                    this.f6439B.add(interfaceC5159h);
                } else if (interfaceC5159h instanceof C5156e) {
                    this.f6439B.remove(((C5156e) interfaceC5159h).getFocus());
                } else if (interfaceC5159h instanceof m.b) {
                    this.f6439B.add(interfaceC5159h);
                } else if (interfaceC5159h instanceof m.c) {
                    this.f6439B.remove(((m.c) interfaceC5159h).getPress());
                } else if (interfaceC5159h instanceof m.a) {
                    this.f6439B.remove(((m.a) interfaceC5159h).getPress());
                }
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5160i interfaceC5160i, SnapshotStateList<InterfaceC5159h> snapshotStateList, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6437C = interfaceC5160i;
            this.f6438D = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(this.f6437C, this.f6438D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6436B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1970e<InterfaceC5159h> interfaceC1970eB = this.f6437C.b();
                C0123a c0123a = new C0123a(this.f6438D);
                this.f6436B = 1;
                if (interfaceC1970eB.b(c0123a, this) == objE) {
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

    /* compiled from: Button.kt */
    @f(c = "androidx.compose.material.DefaultButtonElevation$elevation$2$1", f = "Button.kt", l = {556, 564}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.p$b */
    static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6440B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C4737a<h, C4761m> f6441C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f6442D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ boolean f6443E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C1153p f6444F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ InterfaceC5159h f6445G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C4737a<h, C4761m> c4737a, float f10, boolean z10, C1153p c1153p, InterfaceC5159h interfaceC5159h, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6441C = c4737a;
            this.f6442D = f10;
            this.f6443E = z10;
            this.f6444F = c1153p;
            this.f6445G = interfaceC5159h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new b(this.f6441C, this.f6442D, this.f6443E, this.f6444F, this.f6445G, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6440B;
            if (i10 == 0) {
                C4173r.b(obj);
                if (!h.w(this.f6441C.k().getValue(), this.f6442D)) {
                    if (this.f6443E) {
                        float value = this.f6441C.k().getValue();
                        InterfaceC5159h c5155d = null;
                        if (h.w(value, this.f6444F.pressedElevation)) {
                            c5155d = new m.b(C3476g.INSTANCE.c(), null);
                        } else if (h.w(value, this.f6444F.hoveredElevation)) {
                            c5155d = new C5157f();
                        } else if (h.w(value, this.f6444F.focusedElevation)) {
                            c5155d = new C5155d();
                        }
                        C4737a<h, C4761m> c4737a = this.f6441C;
                        float f10 = this.f6442D;
                        InterfaceC5159h interfaceC5159h = this.f6445G;
                        this.f6440B = 2;
                        if (C1115B.d(c4737a, f10, c5155d, interfaceC5159h, this) == objE) {
                            return objE;
                        }
                    } else {
                        C4737a<h, C4761m> c4737a2 = this.f6441C;
                        h hVarP = h.p(this.f6442D);
                        this.f6440B = 1;
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

    public /* synthetic */ C1153p(float f10, float f11, float f12, float f13, float f14, C3854k c3854k) {
        this(f10, f11, f12, f13, f14);
    }

    @Override // kotlin.InterfaceC1143f
    public x1<h> a(boolean z10, InterfaceC5160i interfaceC5160i, InterfaceC1554l interfaceC1554l, int i10) {
        interfaceC1554l.S(-1588756907);
        if (C1560o.J()) {
            C1560o.S(-1588756907, i10, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:506)");
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
        float f10 = !z10 ? this.disabledElevation : interfaceC5159h instanceof m.b ? this.pressedElevation : interfaceC5159h instanceof C5157f ? this.hoveredElevation : interfaceC5159h instanceof C5155d ? this.focusedElevation : this.defaultElevation;
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
        interfaceC1554l.I();
        return x1VarG;
    }

    private C1153p(float f10, float f11, float f12, float f13, float f14) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.disabledElevation = f12;
        this.hoveredElevation = f13;
        this.focusedElevation = f14;
    }
}
