package o0;

import U0.s;
import h0.C3476g;
import h0.C3482m;
import i0.C3604u0;
import i0.H0;
import i0.I0;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.r1;
import oa.C4153F;

/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0006*\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001e\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R(\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R/\u00106\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u00010\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0018\u00108\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00107R1\u0010>\u001a\u0002092\u0006\u0010/\u001a\u0002098@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u000e\u00101\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010A\u001a\u0002098\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010BR\u0016\u0010D\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010BR \u0010G\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010FR\u001a\u0010J\u001a\u00020H8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b?\u0010I\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Lo0/l;", "Lo0/k;", "Lo0/c;", "root", "<init>", "(Lo0/c;)V", "Loa/F;", "h", "()V", "Lk0/f;", "", "alpha", "Li0/u0;", "colorFilter", "i", "(Lk0/f;FLi0/u0;)V", "a", "(Lk0/f;)V", "", "toString", "()Ljava/lang/String;", "b", "Lo0/c;", "l", "()Lo0/c;", "c", "Ljava/lang/String;", "getName", "p", "(Ljava/lang/String;)V", "name", "", "d", "Z", "isDirty", "Lo0/a;", "e", "Lo0/a;", "cacheDrawScope", "Lkotlin/Function0;", "f", "LBa/a;", "getInvalidateCallback$ui_release", "()LBa/a;", "o", "(LBa/a;)V", "invalidateCallback", "<set-?>", "g", "LO/p0;", "k", "()Li0/u0;", "n", "(Li0/u0;)V", "intrinsicColorFilter", "Li0/u0;", "tintFilter", "Lh0/m;", "m", "()J", "q", "(J)V", "viewportSize", "j", "J", "previousDrawSize", "F", "rootScaleX", "rootScaleY", "Lkotlin/Function1;", "LBa/l;", "drawVectorBlock", "Li0/I0;", "()I", "cacheBitmapConfig", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4091l extends AbstractC4090k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C4082c root;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C4080a cacheDrawScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> invalidateCallback;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 intrinsicColorFilter;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private C3604u0 tintFilter;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 viewportSize;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long previousDrawSize;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float rootScaleX;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float rootScaleY;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<k0.f, C4153F> drawVectorBlock;

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0/k;", "it", "Loa/F;", "a", "(Lo0/k;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: o0.l$a */
    static final class a extends AbstractC3864v implements Ba.l<AbstractC4090k, C4153F> {
        a() {
            super(1);
        }

        public final void a(AbstractC4090k abstractC4090k) {
            C4091l.this.h();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(AbstractC4090k abstractC4090k) {
            a(abstractC4090k);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk0/f;", "Loa/F;", "a", "(Lk0/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: o0.l$b */
    static final class b extends AbstractC3864v implements Ba.l<k0.f, C4153F> {
        b() {
            super(1);
        }

        public final void a(k0.f fVar) {
            C4082c root = C4091l.this.getRoot();
            C4091l c4091l = C4091l.this;
            float f10 = c4091l.rootScaleX;
            float f11 = c4091l.rootScaleY;
            long jC = C3476g.INSTANCE.c();
            k0.d drawContext = fVar.getDrawContext();
            long jC2 = drawContext.C();
            drawContext.G().h();
            try {
                drawContext.getTransform().e(f10, f11, jC);
                root.a(fVar);
            } finally {
                drawContext.G().t();
                drawContext.E(jC2);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(k0.f fVar) {
            a(fVar);
            return C4153F.f46609a;
        }
    }

    public C4091l(C4082c c4082c) {
        super(null);
        this.root = c4082c;
        c4082c.d(new a());
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new C4080a();
        this.invalidateCallback = c.f46222B;
        this.intrinsicColorFilter = r1.c(null, null, 2, null);
        C3482m.Companion companion = C3482m.INSTANCE;
        this.viewportSize = r1.c(C3482m.c(companion.b()), null, 2, null);
        this.previousDrawSize = companion.a();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    @Override // o0.AbstractC4090k
    public void a(k0.f fVar) {
        i(fVar, 1.0f, null);
    }

    public final void i(k0.f fVar, float f10, C3604u0 c3604u0) {
        int iA = (this.root.getIsTintable() && this.root.getTintColor() != 16 && C4093n.f(k()) && C4093n.f(c3604u0)) ? I0.INSTANCE.a() : I0.INSTANCE.b();
        if (this.isDirty || !C3482m.f(this.previousDrawSize, fVar.C()) || !I0.g(iA, j())) {
            this.tintFilter = I0.g(iA, I0.INSTANCE.a()) ? C3604u0.Companion.b(C3604u0.INSTANCE, this.root.getTintColor(), 0, 2, null) : null;
            this.rootScaleX = C3482m.i(fVar.C()) / C3482m.i(m());
            this.rootScaleY = C3482m.g(fVar.C()) / C3482m.g(m());
            this.cacheDrawScope.b(iA, s.a((int) Math.ceil(C3482m.i(fVar.C())), (int) Math.ceil(C3482m.g(fVar.C()))), fVar, fVar.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = fVar.C();
        }
        if (c3604u0 == null) {
            c3604u0 = k() != null ? k() : this.tintFilter;
        }
        this.cacheDrawScope.c(fVar, f10, c3604u0);
    }

    public final int j() {
        H0 mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.d() : I0.INSTANCE.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C3604u0 k() {
        return (C3604u0) this.intrinsicColorFilter.getValue();
    }

    /* renamed from: l, reason: from getter */
    public final C4082c getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long m() {
        return ((C3482m) this.viewportSize.getValue()).getPackedValue();
    }

    public final void n(C3604u0 c3604u0) {
        this.intrinsicColorFilter.setValue(c3604u0);
    }

    public final void o(Ba.a<C4153F> aVar) {
        this.invalidateCallback = aVar;
    }

    public final void p(String str) {
        this.name = str;
    }

    public final void q(long j10) {
        this.viewportSize.setValue(C3482m.c(j10));
    }

    public String toString() {
        String str = "Params: \tname: " + this.name + "\n\tviewportWidth: " + C3482m.i(m()) + "\n\tviewportHeight: " + C3482m.g(m()) + "\n";
        C3862t.f(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: o0.l$c */
    static final class c extends AbstractC3864v implements Ba.a<C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f46222B = new c();

        c() {
            super(0);
        }

        @Override // Ba.a
        public /* bridge */ /* synthetic */ C4153F invoke() {
            a();
            return C4153F.f46609a;
        }

        public final void a() {
        }
    }
}
