package w;

import A0.AbstractC0834m;
import A0.InterfaceC0840t;
import A0.v0;
import A0.w0;
import Xb.C1841i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import y0.InterfaceC5116v;
import z.InterfaceC5162k;

/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\n*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096D¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lw/t;", "LA0/m;", "Lg0/c;", "LA0/v0;", "LA0/t;", "Lg0/n;", "Lz/k;", "interactionSource", "<init>", "(Lz/k;)V", "Loa/F;", "p2", "Lg0/o;", "focusState", "u", "(Lg0/o;)V", "LF0/x;", "m1", "(LF0/x;)V", "Ly0/v;", "coordinates", "F", "(Ly0/v;)V", "", "Q", "Z", "O1", "()Z", "shouldAutoInvalidate", "R", "Lg0/o;", "Lw/s;", "S", "Lw/s;", "focusableInteractionNode", "Lw/u;", "T", "Lw/u;", "focusablePinnableContainer", "Lw/v;", "U", "Lw/v;", "focusedBoundsNode", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t extends AbstractC0834m implements g0.c, v0, InterfaceC0840t, g0.n {

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private g0.o focusState;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final s focusableInteractionNode;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final u focusablePinnableContainer = (u) j2(new u());

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final v focusedBoundsNode = (v) j2(new v());

    /* compiled from: Focusable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<Boolean> {
        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(androidx.compose.ui.focus.l.a(t.this));
        }
    }

    /* compiled from: Focusable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.FocusableNode$onFocusEvent$1", f = "Focusable.kt", l = {224}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f51751B;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return t.this.new b(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f51751B;
            if (i10 == 0) {
                C4173r.b(obj);
                t tVar = t.this;
                this.f51751B = 1;
                if (D.h.b(tVar, null, this, 1, null) == objE) {
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

    public t(InterfaceC5162k interfaceC5162k) {
        this.focusableInteractionNode = (s) j2(new s(interfaceC5162k));
        j2(g0.r.a());
    }

    @Override // A0.InterfaceC0840t
    public void F(InterfaceC5116v coordinates) {
        this.focusedBoundsNode.F(coordinates);
    }

    @Override // b0.i.c
    /* renamed from: O1, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // A0.v0
    public void m1(F0.x xVar) {
        g0.o oVar = this.focusState;
        boolean z10 = false;
        if (oVar != null && oVar.j()) {
            z10 = true;
        }
        F0.v.C(xVar, z10);
        F0.v.t(xVar, null, new a(), 1, null);
    }

    public final void p2(InterfaceC5162k interactionSource) {
        this.focusableInteractionNode.m2(interactionSource);
    }

    @Override // g0.c
    public void u(g0.o focusState) {
        if (C3862t.b(this.focusState, focusState)) {
            return;
        }
        boolean zJ = focusState.j();
        if (zJ) {
            C1841i.d(J1(), null, null, new b(null), 3, null);
        }
        if (getIsAttached()) {
            w0.b(this);
        }
        this.focusableInteractionNode.l2(zJ);
        this.focusedBoundsNode.l2(zJ);
        this.focusablePinnableContainer.k2(zJ);
        this.focusState = focusState;
    }
}
