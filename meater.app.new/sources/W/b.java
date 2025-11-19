package W;

import Ba.p;
import Ba.q;
import Ba.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.C1509K0;
import kotlin.InterfaceC1505I0;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;
import oa.C4153F;

/* compiled from: ComposableLambda.jvm.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"LW/b;", "LW/a;", "", "key", "", "tracked", "", "block", "<init>", "(IZLjava/lang/Object;)V", "Loa/F;", "i", "()V", "LO/l;", "composer", "d", "(LO/l;)V", "j", "(Ljava/lang/Object;)V", "c", "changed", "a", "(LO/l;I)Ljava/lang/Object;", "p1", "b", "(Ljava/lang/Object;LO/l;I)Ljava/lang/Object;", "p2", "(Ljava/lang/Object;Ljava/lang/Object;LO/l;I)Ljava/lang/Object;", "B", "I", "getKey", "()I", "C", "Z", "D", "Ljava/lang/Object;", "_block", "LO/I0;", "E", "LO/I0;", "scope", "", "F", "Ljava/util/List;", "scopes", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements W.a {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final boolean tracked;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Object _block;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1505I0 scope;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private List<InterfaceC1505I0> scopes;

    /* compiled from: ComposableLambda.jvm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LO/l;", "nc", "", "<anonymous parameter 1>", "Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Object f18264C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f18265D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, int i10) {
            super(2);
            this.f18264C = obj;
            this.f18265D = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            b.this.b(this.f18264C, interfaceC1554l, C1509K0.a(this.f18265D) | 1);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: ComposableLambda.jvm.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LO/l;", "nc", "", "<anonymous parameter 1>", "Loa/F;", "a", "(LO/l;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: W.b$b, reason: collision with other inner class name */
    static final class C0269b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Object f18267C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Object f18268D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f18269E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0269b(Object obj, Object obj2, int i10) {
            super(2);
            this.f18267C = obj;
            this.f18268D = obj2;
            this.f18269E = i10;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            b.this.c(this.f18267C, this.f18268D, interfaceC1554l, C1509K0.a(this.f18269E) | 1);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public b(int i10, boolean z10, Object obj) {
        this.key = i10;
        this.tracked = z10;
        this._block = obj;
    }

    private final void d(InterfaceC1554l composer) {
        InterfaceC1505I0 interfaceC1505I0B;
        if (!this.tracked || (interfaceC1505I0B = composer.b()) == null) {
            return;
        }
        composer.B(interfaceC1505I0B);
        if (c.e(this.scope, interfaceC1505I0B)) {
            this.scope = interfaceC1505I0B;
            return;
        }
        List<InterfaceC1505I0> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(interfaceC1505I0B);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (c.e(list.get(i10), interfaceC1505I0B)) {
                list.set(i10, interfaceC1505I0B);
                return;
            }
        }
        list.add(interfaceC1505I0B);
    }

    private final void i() {
        if (this.tracked) {
            InterfaceC1505I0 interfaceC1505I0 = this.scope;
            if (interfaceC1505I0 != null) {
                interfaceC1505I0.invalidate();
                this.scope = null;
            }
            List<InterfaceC1505I0> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    public Object a(InterfaceC1554l c10, int changed) {
        InterfaceC1554l interfaceC1554lR = c10.r(this.key);
        d(interfaceC1554lR);
        int iC = changed | (interfaceC1554lR.R(this) ? c.c(0) : c.f(0));
        Object obj = this._block;
        C3862t.e(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((p) W.f(obj, 2)).invoke(interfaceC1554lR, Integer.valueOf(iC));
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            C3862t.e(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            w0Y.a((p) W.f(this, 2));
        }
        return objInvoke;
    }

    public Object b(Object p12, InterfaceC1554l c10, int changed) {
        InterfaceC1554l interfaceC1554lR = c10.r(this.key);
        d(interfaceC1554lR);
        int iC = interfaceC1554lR.R(this) ? c.c(1) : c.f(1);
        Object obj = this._block;
        C3862t.e(obj, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objG = ((q) W.f(obj, 3)).g(p12, interfaceC1554lR, Integer.valueOf(iC | changed));
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new a(p12, changed));
        }
        return objG;
    }

    public Object c(Object p12, Object p22, InterfaceC1554l c10, int changed) {
        InterfaceC1554l interfaceC1554lR = c10.r(this.key);
        d(interfaceC1554lR);
        int iC = interfaceC1554lR.R(this) ? c.c(2) : c.f(2);
        Object obj = this._block;
        C3862t.e(obj, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objK = ((r) W.f(obj, 4)).k(p12, p22, interfaceC1554lR, Integer.valueOf(iC | changed));
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new C0269b(p12, p22, changed));
        }
        return objK;
    }

    @Override // Ba.q
    public /* bridge */ /* synthetic */ Object g(Object obj, InterfaceC1554l interfaceC1554l, Integer num) {
        return b(obj, interfaceC1554l, num.intValue());
    }

    @Override // Ba.p
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC1554l interfaceC1554l, Integer num) {
        return a(interfaceC1554l, num.intValue());
    }

    public final void j(Object block) {
        if (C3862t.b(this._block, block)) {
            return;
        }
        boolean z10 = this._block == null;
        this._block = block;
        if (z10) {
            return;
        }
        i();
    }

    @Override // Ba.r
    public /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, InterfaceC1554l interfaceC1554l, Integer num) {
        return c(obj, obj2, interfaceC1554l, num.intValue());
    }
}
