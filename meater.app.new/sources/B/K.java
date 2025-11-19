package B;

import kotlin.C1560o;
import kotlin.EnumC5037q;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: LazySemantics.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LB/I;", "state", "", "reverseScrolling", "LC/C;", "a", "(LB/I;ZLO/l;I)LC/C;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K {

    /* compiled from: LazySemantics.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"B/K$a", "LC/C;", "", "index", "Loa/F;", "d", "(ILta/d;)Ljava/lang/Object;", "LF0/b;", "f", "()LF0/b;", "", "b", "()F", "scrollOffset", "e", "maxScrollOffset", "a", "()I", "viewport", "c", "contentPadding", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements kotlin.C {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I f1243a;

        a(I i10) {
            this.f1243a = i10;
        }

        @Override // kotlin.C
        public int a() {
            return this.f1243a.s().getOrientation() == EnumC5037q.Vertical ? U0.r.f(this.f1243a.s().f()) : U0.r.g(this.f1243a.s().f());
        }

        @Override // kotlin.C
        public float b() {
            return androidx.compose.foundation.lazy.layout.f.b(this.f1243a.o(), this.f1243a.p());
        }

        @Override // kotlin.C
        public int c() {
            return this.f1243a.s().k() + this.f1243a.s().getAfterContentPadding();
        }

        @Override // kotlin.C
        public Object d(int i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            Object objE = I.E(this.f1243a, i10, 0, interfaceC4588d, 2, null);
            return objE == C4696b.e() ? objE : C4153F.f46609a;
        }

        @Override // kotlin.C
        public float e() {
            return androidx.compose.foundation.lazy.layout.f.a(this.f1243a.o(), this.f1243a.p(), this.f1243a.e());
        }

        @Override // kotlin.C
        public F0.b f() {
            return new F0.b(-1, -1);
        }
    }

    public static final kotlin.C a(I i10, boolean z10, InterfaceC1554l interfaceC1554l, int i11) {
        if (C1560o.J()) {
            C1560o.S(-1247008005, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:33)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && interfaceC1554l.R(i10)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC1554l.c(z10)) || (i11 & 48) == 32);
        Object objF = interfaceC1554l.f();
        if (z11 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new a(i10);
            interfaceC1554l.J(objF);
        }
        a aVar = (a) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return aVar;
    }
}
