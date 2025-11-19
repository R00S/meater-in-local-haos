package ac;

import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Channels.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\t\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Lac/f;", "LZb/v;", "channel", "Loa/F;", "b", "(Lac/f;LZb/v;Lta/d;)Ljava/lang/Object;", "", "consume", "c", "(Lac/f;LZb/v;ZLta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: ac.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final /* synthetic */ class C1974i {

    /* compiled from: Channels.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt")
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ac.i$a */
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f20359B;

        /* renamed from: C, reason: collision with root package name */
        Object f20360C;

        /* renamed from: D, reason: collision with root package name */
        Object f20361D;

        /* renamed from: E, reason: collision with root package name */
        boolean f20362E;

        /* renamed from: F, reason: collision with root package name */
        /* synthetic */ Object f20363F;

        /* renamed from: G, reason: collision with root package name */
        int f20364G;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f20363F = obj;
            this.f20364G |= Integer.MIN_VALUE;
            return C1974i.c(null, null, false, this);
        }
    }

    public static final <T> Object b(InterfaceC1971f<? super T> interfaceC1971f, Zb.v<? extends T> vVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objC = c(interfaceC1971f, vVar, true, interfaceC4588d);
        return objC == C4696b.e() ? objC : C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [ac.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object c(ac.InterfaceC1971f<? super T> r6, Zb.v<? extends T> r7, boolean r8, ta.InterfaceC4588d<? super oa.C4153F> r9) {
        /*
            boolean r0 = r9 instanceof ac.C1974i.a
            if (r0 == 0) goto L13
            r0 = r9
            ac.i$a r0 = (ac.C1974i.a) r0
            int r1 = r0.f20364G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20364G = r1
            goto L18
        L13:
            ac.i$a r0 = new ac.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f20363F
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f20364G
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f20362E
            java.lang.Object r6 = r0.f20361D
            Zb.i r6 = (Zb.i) r6
            java.lang.Object r7 = r0.f20360C
            Zb.v r7 = (Zb.v) r7
            java.lang.Object r2 = r0.f20359B
            ac.f r2 = (ac.InterfaceC1971f) r2
            oa.C4173r.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f20362E
            java.lang.Object r6 = r0.f20361D
            Zb.i r6 = (Zb.i) r6
            java.lang.Object r7 = r0.f20360C
            Zb.v r7 = (Zb.v) r7
            java.lang.Object r2 = r0.f20359B
            ac.f r2 = (ac.InterfaceC1971f) r2
            oa.C4173r.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            oa.C4173r.b(r9)
            ac.C1972g.o(r6)
            Zb.i r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f20359B = r6     // Catch: java.lang.Throwable -> L3c
            r0.f20360C = r7     // Catch: java.lang.Throwable -> L3c
            r0.f20361D = r9     // Catch: java.lang.Throwable -> L3c
            r0.f20362E = r8     // Catch: java.lang.Throwable -> L3c
            r0.f20364G = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f20359B = r2     // Catch: java.lang.Throwable -> L3c
            r0.f20360C = r7     // Catch: java.lang.Throwable -> L3c
            r0.f20361D = r6     // Catch: java.lang.Throwable -> L3c
            r0.f20362E = r8     // Catch: java.lang.Throwable -> L3c
            r0.f20364G = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.a(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            Zb.n.a(r7, r6)
        L9a:
            oa.F r6 = oa.C4153F.f46609a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            Zb.n.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ac.C1974i.c(ac.f, Zb.v, boolean, ta.d):java.lang.Object");
    }
}
