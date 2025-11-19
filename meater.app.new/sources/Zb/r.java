package Zb;

import Xb.D;
import Xb.I;
import Xb.InterfaceC1847l;
import Xb.K;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import oa.C4172q;
import ta.InterfaceC4588d;

/* compiled from: Produce.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0093\u0001\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001e\b\u0002\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010j\u0004\u0018\u0001`\u00122*\b\u0001\u0010\u0003\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0000¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LZb/t;", "Lkotlin/Function0;", "Loa/F;", "block", "a", "(LZb/t;LBa/a;Lta/d;)Ljava/lang/Object;", "E", "LXb/I;", "Lta/g;", "context", "", "capacity", "LZb/d;", "onBufferOverflow", "LXb/K;", "start", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lta/d;", "", "LZb/v;", "b", "(LXb/I;Lta/g;ILZb/d;LXb/K;LBa/l;LBa/p;)LZb/v;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r {

    /* compiled from: Produce.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {150}, m = "awaitClose")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f19709B;

        /* renamed from: C, reason: collision with root package name */
        Object f19710C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f19711D;

        /* renamed from: E, reason: collision with root package name */
        int f19712E;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19711D = obj;
            this.f19712E |= Integer.MIN_VALUE;
            return r.a(null, null, this);
        }
    }

    /* compiled from: Produce.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847l<C4153F> f19713B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC1847l<? super C4153F> interfaceC1847l) {
            super(1);
            this.f19713B = interfaceC1847l;
        }

        public final void a(Throwable th) {
            InterfaceC1847l<C4153F> interfaceC1847l = this.f19713B;
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC1847l.resumeWith(C4172q.a(C4153F.f46609a));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(Zb.t<?> r4, Ba.a<oa.C4153F> r5, ta.InterfaceC4588d<? super oa.C4153F> r6) {
        /*
            boolean r0 = r6 instanceof Zb.r.a
            if (r0 == 0) goto L13
            r0 = r6
            Zb.r$a r0 = (Zb.r.a) r0
            int r1 = r0.f19712E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19712E = r1
            goto L18
        L13:
            Zb.r$a r0 = new Zb.r$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19711D
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f19712E
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f19710C
            r5 = r4
            Ba.a r5 = (Ba.a) r5
            java.lang.Object r4 = r0.f19709B
            Zb.t r4 = (Zb.t) r4
            oa.C4173r.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            oa.C4173r.b(r6)
            ta.g r6 = r0.getContext()
            Xb.v0$b r2 = Xb.InterfaceC1867v0.INSTANCE
            ta.g$b r6 = r6.b(r2)
            if (r6 != r4) goto L7f
            r0.f19709B = r4     // Catch: java.lang.Throwable -> L32
            r0.f19710C = r5     // Catch: java.lang.Throwable -> L32
            r0.f19712E = r3     // Catch: java.lang.Throwable -> L32
            Xb.m r6 = new Xb.m     // Catch: java.lang.Throwable -> L32
            ta.d r2 = ua.C4696b.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.x()     // Catch: java.lang.Throwable -> L32
            Zb.r$b r2 = new Zb.r$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.c(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = ua.C4696b.e()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            oa.F r4 = oa.C4153F.f46609a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Zb.r.a(Zb.t, Ba.a, ta.d):java.lang.Object");
    }

    public static final <E> v<E> b(I i10, ta.g gVar, int i11, d dVar, K k10, Ba.l<? super Throwable, C4153F> lVar, Ba.p<? super t<? super E>, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar) {
        s sVar = new s(D.d(i10, gVar), j.b(i11, dVar, null, 4, null));
        if (lVar != null) {
            sVar.q(lVar);
        }
        sVar.e1(k10, sVar, pVar);
        return sVar;
    }

    public static /* synthetic */ v c(I i10, ta.g gVar, int i11, d dVar, K k10, Ba.l lVar, Ba.p pVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            gVar = ta.h.f50000B;
        }
        ta.g gVar2 = gVar;
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            dVar = d.f19650B;
        }
        d dVar2 = dVar;
        if ((i12 & 8) != 0) {
            k10 = K.f19030B;
        }
        K k11 = k10;
        if ((i12 & 16) != 0) {
            lVar = null;
        }
        return b(i10, gVar2, i13, dVar2, k11, lVar, pVar);
    }
}
