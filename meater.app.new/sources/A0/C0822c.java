package A0;

import A0.m0;
import b0.i;
import f0.InterfaceC3301b;
import f0.InterfaceC3305f;
import f0.InterfaceC3306g;
import java.util.HashSet;
import k0.InterfaceC3783c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import u0.C4649o;
import u0.EnumC4651q;
import u0.InterfaceC4621G;
import x0.C5047a;
import y0.InterfaceC5091B;
import y0.InterfaceC5112q;
import y0.InterfaceC5116v;
import z0.C5164a;

/* compiled from: BackwardsCompatNode.kt */
@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u001b\u0010\u001d\u001a\u00020\u00142\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\"\u0010\u0016J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0016J&\u0010*\u001a\u00020)*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J#\u00100\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J#\u00103\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00101J#\u00104\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b4\u00101J#\u00105\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b5\u00101J\u0013\u00107\u001a\u00020\u0014*\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\u00020\u0014*\u000209H\u0016¢\u0006\u0004\b:\u0010;J*\u0010B\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0014H\u0016¢\u0006\u0004\bD\u0010\u0016J\u000f\u0010E\u001a\u00020\u0017H\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u0017H\u0016¢\u0006\u0004\bG\u0010FJ\u001f\u0010K\u001a\u0004\u0018\u00010I*\u00020H2\b\u0010J\u001a\u0004\u0018\u00010IH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u00142\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u001a\u0010R\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020@H\u0016ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00142\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bT\u0010PJ\u0017\u0010W\u001a\u00020\u00142\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u0017\u0010[\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u000f\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b^\u0010_R*\u0010\u0011\u001a\u00020\u00102\u0006\u0010`\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010\u0013R\u0016\u0010h\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR:\u0010v\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030n0mj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030n`o8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u0018\u0010y\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010}\u001a\u00020z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R&\u0010\u0081\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010~*\b\u0012\u0004\u0012\u00028\u00000n8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0083\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0084\u0001"}, d2 = {"LA0/c;", "LA0/B;", "LA0/r;", "LA0/v0;", "LA0/s0;", "Lz0/h;", "Lz0/k;", "LA0/p0;", "LA0/A;", "LA0/t;", "Lg0/c;", "Lg0/j;", "Lg0/n;", "LA0/n0;", "Lf0/b;", "Lb0/i$c;", "Lb0/i$b;", "element", "<init>", "(Lb0/i$b;)V", "Loa/F;", "p2", "()V", "", "duringAttach", "m2", "(Z)V", "q2", "Lz0/j;", "s2", "(Lz0/j;)V", "T1", "U1", "A0", "n2", "r2", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "Ly0/r;", "Ly0/q;", "", "height", "t", "(Ly0/r;Ly0/q;I)I", "width", "L", "z", "o", "Lk0/c;", "d", "(Lk0/c;)V", "LF0/x;", "m1", "(LF0/x;)V", "Lu0/o;", "pointerEvent", "Lu0/q;", "pass", "LU0/r;", "bounds", "t0", "(Lu0/o;Lu0/q;J)V", "w0", "q1", "()Z", "B0", "LU0/d;", "", "parentData", "r", "(LU0/d;Ljava/lang/Object;)Ljava/lang/Object;", "Ly0/v;", "coordinates", "F", "(Ly0/v;)V", "size", "q", "(J)V", "M", "Lg0/o;", "focusState", "u", "(Lg0/o;)V", "Landroidx/compose/ui/focus/g;", "focusProperties", "j0", "(Landroidx/compose/ui/focus/g;)V", "", "toString", "()Ljava/lang/String;", "value", "O", "Lb0/i$b;", "k2", "()Lb0/i$b;", "o2", "P", "Z", "invalidateCache", "Lz0/a;", "Q", "Lz0/a;", "_providedValues", "Ljava/util/HashSet;", "Lz0/c;", "Lkotlin/collections/HashSet;", "R", "Ljava/util/HashSet;", "l2", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "readValues", "S", "Ly0/v;", "lastOnPlacedCoordinates", "Lz0/g;", "M0", "()Lz0/g;", "providedValues", "T", "J", "(Lz0/c;)Ljava/lang/Object;", "current", "b0", "isValidOwnerScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0822c extends i.c implements B, r, v0, s0, z0.h, z0.k, p0, A, InterfaceC0840t, g0.c, g0.j, g0.n, n0, InterfaceC3301b {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private i.b element;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private boolean invalidateCache;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private C5164a _providedValues;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private HashSet<z0.c<?>> readValues;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5116v lastOnPlacedCoordinates;

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.c$a */
    static final class a extends AbstractC3864v implements Ba.a<C4153F> {
        a() {
            super(0);
        }

        public final void a() {
            C0822c.this.r2();
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"A0/c$b", "LA0/m0$b;", "Loa/F;", "d", "()V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.c$b */
    public static final class b implements m0.b {
        b() {
        }

        @Override // A0.m0.b
        public void d() {
            if (C0822c.this.lastOnPlacedCoordinates == null) {
                C0822c c0822c = C0822c.this;
                c0822c.M(C0832k.h(c0822c, e0.a(128)));
            }
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.c$c, reason: collision with other inner class name */
    static final class C0010c extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ i.b f531B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C0822c f532C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0010c(i.b bVar, C0822c c0822c) {
            super(0);
            this.f531B = bVar;
            this.f532C = c0822c;
        }

        public final void a() {
            ((InterfaceC3305f) this.f531B).k(this.f532C);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    /* compiled from: BackwardsCompatNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.c$d */
    static final class d extends AbstractC3864v implements Ba.a<C4153F> {
        d() {
            super(0);
        }

        public final void a() {
            i.b element = C0822c.this.getElement();
            C3862t.e(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((z0.d) element).g(C0822c.this);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }
    }

    public C0822c(i.b bVar) {
        d2(f0.f(bVar));
        this.element = bVar;
        this.invalidateCache = true;
        this.readValues = new HashSet<>();
    }

    private final void m2(boolean duringAttach) {
        if (!getIsAttached()) {
            C5047a.b("initializeModifier called on unattached node");
        }
        i.b bVar = this.element;
        if ((e0.a(32) & getKindSet()) != 0) {
            if (bVar instanceof z0.d) {
                h2(new a());
            }
            if (bVar instanceof z0.j) {
                s2((z0.j) bVar);
            }
        }
        if ((e0.a(4) & getKindSet()) != 0) {
            if (bVar instanceof InterfaceC3305f) {
                this.invalidateCache = true;
            }
            if (!duringAttach) {
                E.a(this);
            }
        }
        if ((e0.a(2) & getKindSet()) != 0) {
            if (C0824d.e(this)) {
                AbstractC0823c0 coordinator = getCoordinator();
                C3862t.d(coordinator);
                ((C) coordinator).p3(this);
                coordinator.H2();
            }
            if (!duringAttach) {
                E.a(this);
                C0832k.k(this).F0();
            }
        }
        if (bVar instanceof y0.c0) {
            ((y0.c0) bVar).f(C0832k.k(this));
        }
        if ((e0.a(128) & getKindSet()) != 0) {
            if ((bVar instanceof y0.U) && C0824d.e(this)) {
                C0832k.k(this).F0();
            }
            if (bVar instanceof y0.T) {
                this.lastOnPlacedCoordinates = null;
                if (C0824d.e(this)) {
                    C0832k.l(this).p(new b());
                }
            }
        }
        if ((e0.a(256) & getKindSet()) != 0 && (bVar instanceof y0.S) && C0824d.e(this)) {
            C0832k.k(this).F0();
        }
        if (bVar instanceof g0.m) {
            ((g0.m) bVar).h().e().c(this);
        }
        if ((e0.a(16) & getKindSet()) != 0 && (bVar instanceof InterfaceC4621G)) {
            ((InterfaceC4621G) bVar).getPointerInputFilter().f(getCoordinator());
        }
        if ((e0.a(8) & getKindSet()) != 0) {
            C0832k.l(this).w();
        }
    }

    private final void p2() {
        if (!getIsAttached()) {
            C5047a.b("unInitializeModifier called on unattached node");
        }
        i.b bVar = this.element;
        if ((e0.a(32) & getKindSet()) != 0) {
            if (bVar instanceof z0.j) {
                C0832k.l(this).getModifierLocalManager().d(this, ((z0.j) bVar).getKey());
            }
            if (bVar instanceof z0.d) {
                ((z0.d) bVar).g(C0824d.f595a);
            }
        }
        if ((e0.a(8) & getKindSet()) != 0) {
            C0832k.l(this).w();
        }
        if (bVar instanceof g0.m) {
            ((g0.m) bVar).h().e().B(this);
        }
    }

    private final void q2() {
        i.b bVar = this.element;
        if (bVar instanceof InterfaceC3305f) {
            C0832k.l(this).getSnapshotObserver().i(this, C0824d.f596b, new C0010c(bVar, this));
        }
        this.invalidateCache = false;
    }

    private final void s2(z0.j<?> element) {
        C5164a c5164a = this._providedValues;
        if (c5164a != null && c5164a.a(element.getKey())) {
            c5164a.c(element);
            C0832k.l(this).getModifierLocalManager().f(this, element.getKey());
        } else {
            this._providedValues = new C5164a(element);
            if (C0824d.e(this)) {
                C0832k.l(this).getModifierLocalManager().a(this, element.getKey());
            }
        }
    }

    @Override // A0.r
    public void A0() {
        this.invalidateCache = true;
        C0839s.a(this);
    }

    @Override // A0.s0
    public boolean B0() {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((InterfaceC4621G) bVar).getPointerInputFilter().a();
    }

    @Override // A0.InterfaceC0840t
    public void F(InterfaceC5116v coordinates) {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((y0.S) bVar).F(coordinates);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [Q.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [Q.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // z0.h, z0.k
    public <T> T J(z0.c<T> cVar) {
        C0819a0 nodes;
        this.readValues.add(cVar);
        int iA = e0.a(32);
        if (!getNode().getIsAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        i.c parent = getNode().getParent();
        G gK = C0832k.k(this);
        while (gK != null) {
            if ((gK.getNodes().getHead().getAggregateChildKindSet() & iA) != 0) {
                while (parent != null) {
                    if ((parent.getKindSet() & iA) != 0) {
                        AbstractC0834m abstractC0834mG = parent;
                        ?? bVar = 0;
                        while (abstractC0834mG != 0) {
                            if (abstractC0834mG instanceof z0.h) {
                                z0.h hVar = (z0.h) abstractC0834mG;
                                if (hVar.M0().a(cVar)) {
                                    return (T) hVar.M0().b(cVar);
                                }
                            } else if ((abstractC0834mG.getKindSet() & iA) != 0 && (abstractC0834mG instanceof AbstractC0834m)) {
                                i.c delegate = abstractC0834mG.getDelegate();
                                int i10 = 0;
                                abstractC0834mG = abstractC0834mG;
                                bVar = bVar;
                                while (delegate != null) {
                                    if ((delegate.getKindSet() & iA) != 0) {
                                        i10++;
                                        bVar = bVar;
                                        if (i10 == 1) {
                                            abstractC0834mG = delegate;
                                        } else {
                                            if (bVar == 0) {
                                                bVar = new Q.b(new i.c[16], 0);
                                            }
                                            if (abstractC0834mG != 0) {
                                                bVar.c(abstractC0834mG);
                                                abstractC0834mG = 0;
                                            }
                                            bVar.c(delegate);
                                        }
                                    }
                                    delegate = delegate.getChild();
                                    abstractC0834mG = abstractC0834mG;
                                    bVar = bVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            abstractC0834mG = C0832k.g(bVar);
                        }
                    }
                    parent = parent.getParent();
                }
            }
            gK = gK.o0();
            parent = (gK == null || (nodes = gK.getNodes()) == null) ? null : nodes.getTail();
        }
        return cVar.a().invoke();
    }

    @Override // A0.B
    public int L(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC5091B) bVar).L(rVar, interfaceC5112q, i10);
    }

    @Override // A0.A
    public void M(InterfaceC5116v coordinates) {
        this.lastOnPlacedCoordinates = coordinates;
        i.b bVar = this.element;
        if (bVar instanceof y0.T) {
            ((y0.T) bVar).M(coordinates);
        }
    }

    @Override // z0.h
    public z0.g M0() {
        C5164a c5164a = this._providedValues;
        return c5164a != null ? c5164a : z0.i.a();
    }

    @Override // b0.i.c
    public void T1() {
        m2(true);
    }

    @Override // b0.i.c
    public void U1() {
        p2();
    }

    @Override // A0.B
    public y0.J b(y0.K k10, y0.H h10, long j10) {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC5091B) bVar).b(k10, h10, j10);
    }

    @Override // A0.n0
    public boolean b0() {
        return getIsAttached();
    }

    @Override // A0.r
    public void d(InterfaceC3783c interfaceC3783c) {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        InterfaceC3306g interfaceC3306g = (InterfaceC3306g) bVar;
        if (this.invalidateCache && (bVar instanceof InterfaceC3305f)) {
            q2();
        }
        interfaceC3306g.d(interfaceC3783c);
    }

    @Override // g0.j
    public void j0(androidx.compose.ui.focus.g focusProperties) {
        i.b bVar = this.element;
        if (!(bVar instanceof g0.h)) {
            C5047a.b("applyFocusProperties called on wrong node");
        }
        ((g0.h) bVar).j(new g0.g(focusProperties));
    }

    /* renamed from: k2, reason: from getter */
    public final i.b getElement() {
        return this.element;
    }

    public final HashSet<z0.c<?>> l2() {
        return this.readValues;
    }

    @Override // A0.v0
    public void m1(F0.x xVar) {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        F0.l lVarL = ((F0.n) bVar).l();
        C3862t.e(xVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((F0.l) xVar).h(lVarL);
    }

    public final void n2() {
        this.invalidateCache = true;
        C0839s.a(this);
    }

    @Override // A0.B
    public int o(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC5091B) bVar).o(rVar, interfaceC5112q, i10);
    }

    public final void o2(i.b bVar) {
        if (getIsAttached()) {
            p2();
        }
        this.element = bVar;
        d2(f0.f(bVar));
        if (getIsAttached()) {
            m2(false);
        }
    }

    @Override // A0.A
    public void q(long size) {
        i.b bVar = this.element;
        if (bVar instanceof y0.U) {
            ((y0.U) bVar).q(size);
        }
    }

    @Override // A0.s0
    public boolean q1() {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((InterfaceC4621G) bVar).getPointerInputFilter().c();
    }

    @Override // A0.p0
    public Object r(U0.d dVar, Object obj) {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((y0.W) bVar).r(dVar, obj);
    }

    public final void r2() {
        if (getIsAttached()) {
            this.readValues.clear();
            C0832k.l(this).getSnapshotObserver().i(this, C0824d.f597c, new d());
        }
    }

    @Override // A0.B
    public int t(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC5091B) bVar).t(rVar, interfaceC5112q, i10);
    }

    @Override // A0.s0
    public void t0(C4649o pointerEvent, EnumC4651q pass, long bounds) {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC4621G) bVar).getPointerInputFilter().e(pointerEvent, pass, bounds);
    }

    public String toString() {
        return this.element.toString();
    }

    @Override // g0.c
    public void u(g0.o focusState) {
        i.b bVar = this.element;
        if (!(bVar instanceof g0.b)) {
            C5047a.b("onFocusEvent called on wrong node");
        }
        ((g0.b) bVar).u(focusState);
    }

    @Override // A0.s0
    public void w0() {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((InterfaceC4621G) bVar).getPointerInputFilter().d();
    }

    @Override // A0.B
    public int z(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        i.b bVar = this.element;
        C3862t.e(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC5091B) bVar).z(rVar, interfaceC5112q, i10);
    }
}
