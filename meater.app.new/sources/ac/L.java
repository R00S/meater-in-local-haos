package ac;

import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0096A¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR6\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lac/L;", "T", "Lac/f;", "value", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "b", "(Lta/d;)Ljava/lang/Object;", "B", "Lac/f;", "collector", "Lkotlin/Function2;", "Lta/d;", "", "C", "LBa/p;", "action", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class L<T> implements InterfaceC1971f<T> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1971f<T> collector;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<InterfaceC1971f<? super T>, InterfaceC4588d<? super C4153F>, Object> action;

    /* compiled from: Share.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {415, 419}, m = "onSubscription")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f20333B;

        /* renamed from: C, reason: collision with root package name */
        Object f20334C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f20335D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ L<T> f20336E;

        /* renamed from: F, reason: collision with root package name */
        int f20337F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(L<T> l10, InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
            this.f20336E = l10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f20335D = obj;
            this.f20337F |= Integer.MIN_VALUE;
            return this.f20336E.b(this);
        }
    }

    @Override // ac.InterfaceC1971f
    public Object a(T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return this.collector.a(t10, interfaceC4588d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [bc.o] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ta.InterfaceC4588d<? super oa.C4153F> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ac.L.a
            if (r0 == 0) goto L13
            r0 = r7
            ac.L$a r0 = (ac.L.a) r0
            int r1 = r0.f20337F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20337F = r1
            goto L18
        L13:
            ac.L$a r0 = new ac.L$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f20335D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f20337F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            oa.C4173r.b(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f20334C
            bc.o r2 = (kotlin.C2299o) r2
            java.lang.Object r4 = r0.f20333B
            ac.L r4 = (ac.L) r4
            oa.C4173r.b(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            oa.C4173r.b(r7)
            bc.o r2 = new bc.o
            ac.f<T> r7 = r6.collector
            ta.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            Ba.p<ac.f<? super T>, ta.d<? super oa.F>, java.lang.Object> r7 = r6.action     // Catch: java.lang.Throwable -> L40
            r0.f20333B = r6     // Catch: java.lang.Throwable -> L40
            r0.f20334C = r2     // Catch: java.lang.Throwable -> L40
            r0.f20337F = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            ac.f<T> r7 = r4.collector
            boolean r2 = r7 instanceof ac.L
            if (r2 == 0) goto L7c
            ac.L r7 = (ac.L) r7
            r2 = 0
            r0.f20333B = r2
            r0.f20334C = r2
            r0.f20337F = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L79
            return r1
        L79:
            oa.F r7 = oa.C4153F.f46609a
            return r7
        L7c:
            oa.F r7 = oa.C4153F.f46609a
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.L.b(ta.d):java.lang.Object");
    }
}
