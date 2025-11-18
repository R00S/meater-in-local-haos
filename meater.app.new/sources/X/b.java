package X;

import Ba.l;
import X.b;
import android.view.B;
import android.view.E;
import android.view.InterfaceC2114v;
import kotlin.C1510L;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.r1;
import kotlin.x1;

/* compiled from: LiveDataAdapter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0000*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"T", "Landroidx/lifecycle/B;", "LO/x1;", "a", "(Landroidx/lifecycle/B;LO/l;I)LO/x1;", "R", "initial", "b", "(Landroidx/lifecycle/B;Ljava/lang/Object;LO/l;I)LO/x1;", "runtime-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* compiled from: LiveDataAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "T", "LO/L;", "LO/K;", "b", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ B<T> f18506B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC2114v f18507C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1563p0<R> f18508D;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"X/b$a$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: X.b$a$a, reason: collision with other inner class name */
        public static final class C0271a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ B f18509a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ E f18510b;

            public C0271a(B b10, E e10) {
                this.f18509a = b10;
                this.f18510b = e10;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f18509a.m(this.f18510b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(B<T> b10, InterfaceC2114v interfaceC2114v, InterfaceC1563p0<R> interfaceC1563p0) {
            super(1);
            this.f18506B = b10;
            this.f18507C = interfaceC2114v;
            this.f18508D = interfaceC1563p0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(InterfaceC1563p0 interfaceC1563p0, Object obj) {
            interfaceC1563p0.setValue(obj);
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            final InterfaceC1563p0<R> interfaceC1563p0 = this.f18508D;
            E e10 = new E() { // from class: X.a
                @Override // android.view.E
                public final void b(Object obj) {
                    b.a.c(interfaceC1563p0, obj);
                }
            };
            this.f18506B.h(this.f18507C, e10);
            return new C0271a(this.f18506B, e10);
        }
    }

    public static final <T> x1<T> a(B<T> b10, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-2027206144, i10, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:40)");
        }
        x1<T> x1VarB = b(b10, b10.e(), interfaceC1554l, i10 & 14);
        if (C1560o.J()) {
            C1560o.R();
        }
        return x1VarB;
    }

    public static final <R, T extends R> x1<R> b(B<T> b10, R r10, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(411178300, i10, -1, "androidx.compose.runtime.livedata.observeAsState (LiveDataAdapter.kt:57)");
        }
        InterfaceC2114v interfaceC2114v = (InterfaceC2114v) interfaceC1554l.o(O1.a.a());
        Object objF = interfaceC1554l.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            if (b10.g()) {
                r10 = b10.e();
            }
            objF = r1.c(r10, null, 2, null);
            interfaceC1554l.J(objF);
        }
        InterfaceC1563p0 interfaceC1563p0 = (InterfaceC1563p0) objF;
        boolean zL = interfaceC1554l.l(b10) | interfaceC1554l.l(interfaceC2114v);
        Object objF2 = interfaceC1554l.f();
        if (zL || objF2 == companion.a()) {
            objF2 = new a(b10, interfaceC2114v, interfaceC1563p0);
            interfaceC1554l.J(objF2);
        }
        C1516O.b(b10, interfaceC2114v, (l) objF2, interfaceC1554l, i10 & 14);
        if (C1560o.J()) {
            C1560o.R();
        }
        return interfaceC1563p0;
    }
}
