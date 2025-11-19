package androidx.compose.foundation;

import A0.s0;
import Ba.p;
import Xb.C1841i;
import Xb.I;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import u0.C4649o;
import u0.C4652r;
import u0.EnumC4651q;
import ua.C4696b;
import z.C5157f;
import z.C5158g;
import z.InterfaceC5162k;

/* compiled from: Hoverable.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0006J*\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/i;", "LA0/s0;", "Lb0/i$c;", "Lz/k;", "interactionSource", "<init>", "(Lz/k;)V", "Loa/F;", "l2", "(Lta/d;)Ljava/lang/Object;", "m2", "n2", "()V", "o2", "Lu0/o;", "pointerEvent", "Lu0/q;", "pass", "LU0/r;", "bounds", "t0", "(Lu0/o;Lu0/q;J)V", "w0", "U1", "O", "Lz/k;", "Lz/f;", "P", "Lz/f;", "hoverInteraction", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class i extends i.c implements s0 {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5162k interactionSource;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private C5157f hoverInteraction;

    /* compiled from: Hoverable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {111}, m = "emitEnter")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f22143B;

        /* renamed from: C, reason: collision with root package name */
        Object f22144C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f22145D;

        /* renamed from: F, reason: collision with root package name */
        int f22147F;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22145D = obj;
            this.f22147F |= Integer.MIN_VALUE;
            return i.this.l2(this);
        }
    }

    /* compiled from: Hoverable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {119}, m = "emitExit")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f22148B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f22149C;

        /* renamed from: E, reason: collision with root package name */
        int f22151E;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22149C = obj;
            this.f22151E |= Integer.MIN_VALUE;
            return i.this.m2(this);
        }
    }

    /* compiled from: Hoverable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {94}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22152B;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return i.this.new c(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22152B;
            if (i10 == 0) {
                C4173r.b(obj);
                i iVar = i.this;
                this.f22152B = 1;
                if (iVar.l2(this) == objE) {
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

    /* compiled from: Hoverable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {95}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f22154B;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return i.this.new d(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f22154B;
            if (i10 == 0) {
                C4173r.b(obj);
                i iVar = i.this;
                this.f22154B = 1;
                if (iVar.m2(this) == objE) {
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

    public i(InterfaceC5162k interfaceC5162k) {
        this.interactionSource = interfaceC5162k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l2(ta.InterfaceC4588d<? super oa.C4153F> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.i.a
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.i$a r0 = (androidx.compose.foundation.i.a) r0
            int r1 = r0.f22147F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22147F = r1
            goto L18
        L13:
            androidx.compose.foundation.i$a r0 = new androidx.compose.foundation.i$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f22145D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f22147F
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f22144C
            z.f r1 = (z.C5157f) r1
            java.lang.Object r0 = r0.f22143B
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.i) r0
            oa.C4173r.b(r5)
            goto L56
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            oa.C4173r.b(r5)
            z.f r5 = r4.hoverInteraction
            if (r5 != 0) goto L58
            z.f r5 = new z.f
            r5.<init>()
            z.k r2 = r4.interactionSource
            r0.f22143B = r4
            r0.f22144C = r5
            r0.f22147F = r3
            java.lang.Object r0 = r2.c(r5, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r4
            r1 = r5
        L56:
            r0.hoverInteraction = r1
        L58:
            oa.F r5 = oa.C4153F.f46609a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.l2(ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m2(ta.InterfaceC4588d<? super oa.C4153F> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.i.b
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.i$b r0 = (androidx.compose.foundation.i.b) r0
            int r1 = r0.f22151E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22151E = r1
            goto L18
        L13:
            androidx.compose.foundation.i$b r0 = new androidx.compose.foundation.i$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f22149C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f22151E
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f22148B
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.i) r0
            oa.C4173r.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            oa.C4173r.b(r5)
            z.f r5 = r4.hoverInteraction
            if (r5 == 0) goto L52
            z.g r2 = new z.g
            r2.<init>(r5)
            z.k r5 = r4.interactionSource
            r0.f22148B = r4
            r0.f22151E = r3
            java.lang.Object r5 = r5.c(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            r5 = 0
            r0.hoverInteraction = r5
        L52:
            oa.F r5 = oa.C4153F.f46609a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.m2(ta.d):java.lang.Object");
    }

    private final void n2() {
        C5157f c5157f = this.hoverInteraction;
        if (c5157f != null) {
            this.interactionSource.a(new C5158g(c5157f));
            this.hoverInteraction = null;
        }
    }

    @Override // b0.i.c
    public void U1() {
        n2();
    }

    public final void o2(InterfaceC5162k interactionSource) {
        if (C3862t.b(this.interactionSource, interactionSource)) {
            return;
        }
        n2();
        this.interactionSource = interactionSource;
    }

    @Override // A0.s0
    public void t0(C4649o pointerEvent, EnumC4651q pass, long bounds) {
        if (pass == EnumC4651q.Main) {
            int type = pointerEvent.getType();
            C4652r.Companion companion = C4652r.INSTANCE;
            if (C4652r.i(type, companion.a())) {
                C1841i.d(J1(), null, null, new c(null), 3, null);
            } else if (C4652r.i(type, companion.b())) {
                C1841i.d(J1(), null, null, new d(null), 3, null);
            }
        }
    }

    @Override // A0.s0
    public void w0() {
        n2();
    }
}
