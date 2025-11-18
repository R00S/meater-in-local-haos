package kotlin;

import U0.t;
import kotlin.C0968g;
import kotlin.EnumC5037q;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.O;
import y0.C5104i;
import y0.InterfaceC5103h;
import z0.j;
import z0.l;

/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 12\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002:\u0001 B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\u00020\u0007*\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0007*\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0011J8\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u0014\u001a\u00020\u000f2\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, d2 = {"LC/h;", "Lz0/j;", "Ly0/h;", "LC/j;", "state", "LC/g;", "beyondBoundsInfo", "", "reverseLayout", "LU0/t;", "layoutDirection", "Lx/q;", "orientation", "<init>", "(LC/j;LC/g;ZLU0/t;Lx/q;)V", "Ly0/h$b;", "w", "(I)Z", "LC/g$a;", "currentInterval", "direction", "p", "(LC/g$a;I)LC/g$a;", "v", "(LC/g$a;I)Z", "x", "T", "Lkotlin/Function1;", "Ly0/h$a;", "block", "m", "(ILBa/l;)Ljava/lang/Object;", "b", "LC/j;", "c", "LC/g;", "d", "Z", "e", "LU0/t;", "f", "Lx/q;", "Lz0/l;", "getKey", "()Lz0/l;", "key", "s", "()Ly0/h;", "value", "g", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: C.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0969h implements j<InterfaceC5103h>, InterfaceC5103h {

    /* renamed from: h, reason: collision with root package name */
    private static final a f2042h = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC0971j state;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C0968g beyondBoundsInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean reverseLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t layoutDirection;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final EnumC5037q orientation;

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"C/h$a", "Ly0/h$a;", "", "a", "Z", "()Z", "hasMoreContent", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C.h$a */
    public static final class a implements InterfaceC5103h.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean hasMoreContent;

        a() {
        }

        @Override // y0.InterfaceC5103h.a
        /* renamed from: a, reason: from getter */
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C.h$c */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2049a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2049a = iArr;
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"C/h$d", "Ly0/h$a;", "", "a", "()Z", "hasMoreContent", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C.h$d */
    public static final class d implements InterfaceC5103h.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ O<C0968g.Interval> f2051b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f2052c;

        d(O<C0968g.Interval> o10, int i10) {
            this.f2051b = o10;
            this.f2052c = i10;
        }

        @Override // y0.InterfaceC5103h.a
        /* renamed from: a */
        public boolean getHasMoreContent() {
            return C0969h.this.v(this.f2051b.f43978B, this.f2052c);
        }
    }

    public C0969h(InterfaceC0971j interfaceC0971j, C0968g c0968g, boolean z10, t tVar, EnumC5037q enumC5037q) {
        this.state = interfaceC0971j;
        this.beyondBoundsInfo = c0968g;
        this.reverseLayout = z10;
        this.layoutDirection = tVar;
        this.orientation = enumC5037q;
    }

    private final C0968g.Interval p(C0968g.Interval currentInterval, int direction) {
        int start = currentInterval.getStart();
        int end = currentInterval.getEnd();
        if (w(direction)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.a(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v(C0968g.Interval interval, int i10) {
        if (x(i10)) {
            return false;
        }
        if (w(i10)) {
            if (interval.getEnd() >= this.state.a() - 1) {
                return false;
            }
        } else if (interval.getStart() <= 0) {
            return false;
        }
        return true;
    }

    private final boolean w(int i10) {
        InterfaceC5103h.b.Companion companion = InterfaceC5103h.b.INSTANCE;
        if (InterfaceC5103h.b.h(i10, companion.c())) {
            return false;
        }
        if (!InterfaceC5103h.b.h(i10, companion.b())) {
            if (InterfaceC5103h.b.h(i10, companion.a())) {
                return this.reverseLayout;
            }
            if (InterfaceC5103h.b.h(i10, companion.d())) {
                if (this.reverseLayout) {
                    return false;
                }
            } else if (InterfaceC5103h.b.h(i10, companion.e())) {
                int i11 = c.f2049a[this.layoutDirection.ordinal()];
                if (i11 == 1) {
                    return this.reverseLayout;
                }
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.reverseLayout) {
                    return false;
                }
            } else {
                if (!InterfaceC5103h.b.h(i10, companion.f())) {
                    C0970i.c();
                    throw new KotlinNothingValueException();
                }
                int i12 = c.f2049a[this.layoutDirection.ordinal()];
                if (i12 != 1) {
                    if (i12 == 2) {
                        return this.reverseLayout;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (this.reverseLayout) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean x(int i10) {
        InterfaceC5103h.b.Companion companion = InterfaceC5103h.b.INSTANCE;
        if (!(InterfaceC5103h.b.h(i10, companion.a()) ? true : InterfaceC5103h.b.h(i10, companion.d()))) {
            if (!(InterfaceC5103h.b.h(i10, companion.e()) ? true : InterfaceC5103h.b.h(i10, companion.f()))) {
                if (!(InterfaceC5103h.b.h(i10, companion.c()) ? true : InterfaceC5103h.b.h(i10, companion.b()))) {
                    C0970i.c();
                    throw new KotlinNothingValueException();
                }
            } else if (this.orientation == EnumC5037q.Vertical) {
                return true;
            }
        } else if (this.orientation == EnumC5037q.Horizontal) {
            return true;
        }
        return false;
    }

    @Override // z0.j
    public l<InterfaceC5103h> getKey() {
        return C5104i.a();
    }

    @Override // y0.InterfaceC5103h
    public <T> T m(int direction, Ba.l<? super InterfaceC5103h.a, ? extends T> block) {
        if (this.state.a() <= 0 || !this.state.d()) {
            return block.invoke(f2042h);
        }
        int iB = w(direction) ? this.state.b() : this.state.e();
        O o10 = new O();
        o10.f43978B = (T) this.beyondBoundsInfo.a(iB, iB);
        T tInvoke = null;
        while (tInvoke == null && v((C0968g.Interval) o10.f43978B, direction)) {
            T t10 = (T) p((C0968g.Interval) o10.f43978B, direction);
            this.beyondBoundsInfo.e((C0968g.Interval) o10.f43978B);
            o10.f43978B = t10;
            this.state.c();
            tInvoke = block.invoke(new d(o10, direction));
        }
        this.beyondBoundsInfo.e((C0968g.Interval) o10.f43978B);
        this.state.c();
        return tInvoke;
    }

    @Override // z0.j
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public InterfaceC5103h getValue() {
        return this;
    }
}
