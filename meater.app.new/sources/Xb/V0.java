package Xb;

import dc.C3103b;
import kotlin.Metadata;
import ta.InterfaceC4588d;

/* compiled from: Timeout.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t\u001aY\u0010\r\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\n\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"T", "", "timeMillis", "Lkotlin/Function2;", "LXb/I;", "Lta/d;", "", "block", "c", "(JLBa/p;Lta/d;)Ljava/lang/Object;", "U", "LXb/U0;", "coroutine", "b", "(LXb/U0;LBa/p;)Ljava/lang/Object;", "time", "LXb/S;", "delay", "LXb/v0;", "Lkotlinx/coroutines/TimeoutCancellationException;", "a", "(JLXb/S;LXb/v0;)Lkotlinx/coroutines/TimeoutCancellationException;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class V0 {

    /* compiled from: Timeout.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {101}, m = "withTimeoutOrNull")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        long f19049B;

        /* renamed from: C, reason: collision with root package name */
        Object f19050C;

        /* renamed from: D, reason: collision with root package name */
        Object f19051D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f19052E;

        /* renamed from: F, reason: collision with root package name */
        int f19053F;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19052E = obj;
            this.f19053F |= Integer.MIN_VALUE;
            return V0.c(0L, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlinx.coroutines.TimeoutCancellationException a(long r2, Xb.S r4, Xb.InterfaceC1867v0 r5) {
        /*
            boolean r0 = r4 instanceof Xb.U
            if (r0 == 0) goto L7
            Xb.U r4 = (Xb.U) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            Vb.a$a r0 = Vb.a.INSTANCE
            Vb.d r0 = Vb.d.f18245E
            long r0 = Vb.c.p(r2, r0)
            java.lang.String r4 = r4.e0(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Xb.V0.a(long, Xb.S, Xb.v0):kotlinx.coroutines.TimeoutCancellationException");
    }

    private static final <U, T extends U> Object b(U0<U, ? super T> u02, Ba.p<? super I, ? super InterfaceC4588d<? super T>, ? extends Object> pVar) {
        C1873y0.k(u02, T.b(u02.uCont.getContext()).h0(u02.time, u02, u02.getContext()));
        return C3103b.c(u02, u02, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, Xb.U0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(long r7, Ba.p<? super Xb.I, ? super ta.InterfaceC4588d<? super T>, ? extends java.lang.Object> r9, ta.InterfaceC4588d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof Xb.V0.a
            if (r0 == 0) goto L13
            r0 = r10
            Xb.V0$a r0 = (Xb.V0.a) r0
            int r1 = r0.f19053F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19053F = r1
            goto L18
        L13:
            Xb.V0$a r0 = new Xb.V0$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f19052E
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f19053F
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.f19051D
            kotlin.jvm.internal.O r7 = (kotlin.jvm.internal.O) r7
            java.lang.Object r8 = r0.f19050C
            Ba.p r8 = (Ba.p) r8
            oa.C4173r.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            goto L6f
        L32:
            r8 = move-exception
            goto L70
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            oa.C4173r.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.O r10 = new kotlin.jvm.internal.O
            r10.<init>()
            r0.f19050C = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f19051D = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f19049B = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.f19053F = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            Xb.U0 r2 = new Xb.U0     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r10.f43978B = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r8 = ua.C4696b.e()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            if (r7 != r8) goto L6b
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L70
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r10 = r7
        L6f:
            return r10
        L70:
            Xb.v0 r9 = r8.coroutine
            T r7 = r7.f43978B
            if (r9 != r7) goto L77
            return r3
        L77:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Xb.V0.c(long, Ba.p, ta.d):java.lang.Object");
    }
}
