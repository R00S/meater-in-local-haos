package androidx.compose.foundation.layout;

import A.EnumC0806n;
import A0.V;
import b0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "LA0/V;", "Landroidx/compose/foundation/layout/u;", "LA/n;", "direction", "", "unbounded", "Lkotlin/Function2;", "LU0/r;", "LU0/t;", "LU0/n;", "alignmentCallback", "", "align", "", "inspectorName", "<init>", "(LA/n;ZLBa/p;Ljava/lang/Object;Ljava/lang/String;)V", "p", "()Landroidx/compose/foundation/layout/u;", "node", "Loa/F;", "s", "(Landroidx/compose/foundation/layout/u;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "LA/n;", "c", "Z", "d", "LBa/p;", "e", "Ljava/lang/Object;", "f", "Ljava/lang/String;", "g", "a", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrapContentElement extends V<u> {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final EnumC0806n direction;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean unbounded;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<U0.r, U0.t, U0.n> alignmentCallback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object align;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement$a;", "", "<init>", "()V", "Lb0/c$b;", "align", "", "unbounded", "Landroidx/compose/foundation/layout/WrapContentElement;", "c", "(Lb0/c$b;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "Lb0/c$c;", "a", "(Lb0/c$c;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "Lb0/c;", "b", "(Lb0/c;Z)Landroidx/compose/foundation/layout/WrapContentElement;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: Size.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LU0/r;", "size", "LU0/t;", "<anonymous parameter 1>", "LU0/n;", "a", "(JLU0/t;)J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$a, reason: collision with other inner class name */
        static final class C0316a extends AbstractC3864v implements Ba.p<U0.r, U0.t, U0.n> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ c.InterfaceC0420c f22214B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0316a(c.InterfaceC0420c interfaceC0420c) {
                super(2);
                this.f22214B = interfaceC0420c;
            }

            public final long a(long j10, U0.t tVar) {
                return U0.o.a(0, this.f22214B.a(0, U0.r.f(j10)));
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ U0.n invoke(U0.r rVar, U0.t tVar) {
                return U0.n.b(a(rVar.getPackedValue(), tVar));
            }
        }

        /* compiled from: Size.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LU0/r;", "size", "LU0/t;", "layoutDirection", "LU0/n;", "a", "(JLU0/t;)J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$b */
        static final class b extends AbstractC3864v implements Ba.p<U0.r, U0.t, U0.n> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ b0.c f22215B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(b0.c cVar) {
                super(2);
                this.f22215B = cVar;
            }

            public final long a(long j10, U0.t tVar) {
                return this.f22215B.a(U0.r.INSTANCE.a(), j10, tVar);
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ U0.n invoke(U0.r rVar, U0.t tVar) {
                return U0.n.b(a(rVar.getPackedValue(), tVar));
            }
        }

        /* compiled from: Size.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LU0/r;", "size", "LU0/t;", "layoutDirection", "LU0/n;", "a", "(JLU0/t;)J"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.layout.WrapContentElement$a$c */
        static final class c extends AbstractC3864v implements Ba.p<U0.r, U0.t, U0.n> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ c.b f22216B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(c.b bVar) {
                super(2);
                this.f22216B = bVar;
            }

            public final long a(long j10, U0.t tVar) {
                return U0.o.a(this.f22216B.a(0, U0.r.g(j10), tVar), 0);
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ U0.n invoke(U0.r rVar, U0.t tVar) {
                return U0.n.b(a(rVar.getPackedValue(), tVar));
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final WrapContentElement a(c.InterfaceC0420c align, boolean unbounded) {
            return new WrapContentElement(EnumC0806n.Vertical, unbounded, new C0316a(align), align, "wrapContentHeight");
        }

        public final WrapContentElement b(b0.c align, boolean unbounded) {
            return new WrapContentElement(EnumC0806n.Both, unbounded, new b(align), align, "wrapContentSize");
        }

        public final WrapContentElement c(c.b align, boolean unbounded) {
            return new WrapContentElement(EnumC0806n.Horizontal, unbounded, new c(align), align, "wrapContentWidth");
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(EnumC0806n enumC0806n, boolean z10, Ba.p<? super U0.r, ? super U0.t, U0.n> pVar, Object obj, String str) {
        this.direction = enumC0806n;
        this.unbounded = z10;
        this.alignmentCallback = pVar;
        this.align = obj;
        this.inspectorName = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || WrapContentElement.class != other.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) other;
        return this.direction == wrapContentElement.direction && this.unbounded == wrapContentElement.unbounded && C3862t.b(this.align, wrapContentElement.align);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public u m() {
        return new u(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(u node) {
        node.l2(this.direction);
        node.m2(this.unbounded);
        node.k2(this.alignmentCallback);
    }
}
