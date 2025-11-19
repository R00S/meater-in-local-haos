package kotlin;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import oa.C4153F;
import oa.C4172q;
import ta.InterfaceC4588d;
import y0.InterfaceC5116v;
import y0.S;

/* compiled from: AwaitFirstLayoutModifier.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LC/b;", "Ly0/S;", "<init>", "()V", "Loa/F;", "m", "(Lta/d;)Ljava/lang/Object;", "Ly0/v;", "coordinates", "F", "(Ly0/v;)V", "", "b", "Z", "wasPositioned", "Lta/d;", "c", "Lta/d;", "continuation", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: C.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0964b implements S {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean wasPositioned;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4588d<? super C4153F> continuation;

    /* compiled from: AwaitFirstLayoutModifier.kt */
    @f(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", l = {35}, m = "waitForFirstLayout")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: C.b$a */
    static final class a extends d {

        /* renamed from: B, reason: collision with root package name */
        Object f2024B;

        /* renamed from: C, reason: collision with root package name */
        Object f2025C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f2026D;

        /* renamed from: F, reason: collision with root package name */
        int f2028F;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2026D = obj;
            this.f2028F |= Integer.MIN_VALUE;
            return C0964b.this.m(this);
        }
    }

    @Override // y0.S
    public void F(InterfaceC5116v coordinates) {
        if (this.wasPositioned) {
            return;
        }
        this.wasPositioned = true;
        InterfaceC4588d<? super C4153F> interfaceC4588d = this.continuation;
        if (interfaceC4588d != null) {
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC4588d.resumeWith(C4172q.a(C4153F.f46609a));
        }
        this.continuation = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(ta.InterfaceC4588d<? super oa.C4153F> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlin.C0964b.a
            if (r0 == 0) goto L13
            r0 = r5
            C.b$a r0 = (kotlin.C0964b.a) r0
            int r1 = r0.f2028F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2028F = r1
            goto L18
        L13:
            C.b$a r0 = new C.b$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f2026D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f2028F
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f2025C
            ta.d r1 = (ta.InterfaceC4588d) r1
            java.lang.Object r0 = r0.f2024B
            C.b r0 = (kotlin.C0964b) r0
            oa.C4173r.b(r5)
            goto L64
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            oa.C4173r.b(r5)
            boolean r5 = r4.wasPositioned
            if (r5 != 0) goto L71
            ta.d<? super oa.F> r5 = r4.continuation
            r0.f2024B = r4
            r0.f2025C = r5
            r0.f2028F = r3
            ta.i r2 = new ta.i
            ta.d r3 = ua.C4696b.c(r0)
            r2.<init>(r3)
            r4.continuation = r2
            java.lang.Object r2 = r2.a()
            java.lang.Object r3 = ua.C4696b.e()
            if (r2 != r3) goto L60
            kotlin.coroutines.jvm.internal.h.c(r0)
        L60:
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
        L64:
            if (r1 == 0) goto L71
            oa.q$a r5 = oa.C4172q.INSTANCE
            oa.F r5 = oa.C4153F.f46609a
            java.lang.Object r5 = oa.C4172q.a(r5)
            r1.resumeWith(r5)
        L71:
            oa.F r5 = oa.C4153F.f46609a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C0964b.m(ta.d):java.lang.Object");
    }
}
