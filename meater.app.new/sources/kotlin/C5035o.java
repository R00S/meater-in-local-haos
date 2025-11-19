package kotlin;

import Ba.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import oa.C4153F;
import ta.InterfaceC4588d;
import ta.g;
import u0.InterfaceC4622H;
import u0.InterfaceC4637c;
import u0.PointerInputChange;
import ua.C4696b;

/* compiled from: ForEachGesture.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a8\u0010\f\u001a\u00020\u0004*\u00020\u00072\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0086@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu0/c;", "", "a", "(Lu0/c;)Z", "Loa/F;", "b", "(Lu0/c;Lta/d;)Ljava/lang/Object;", "Lu0/H;", "Lkotlin/Function2;", "Lta/d;", "", "block", "c", "(Lu0/H;LBa/p;Lta/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5035o {

    /* compiled from: ForEachGesture.kt */
    @f(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {86}, m = "awaitAllPointersUp")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: x.o$a */
    static final class a extends d {

        /* renamed from: B, reason: collision with root package name */
        Object f52483B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f52484C;

        /* renamed from: D, reason: collision with root package name */
        int f52485D;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f52484C = obj;
            this.f52485D |= Integer.MIN_VALUE;
            return C5035o.b(null, this);
        }
    }

    /* compiled from: ForEachGesture.kt */
    @f(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {104, 107, 112}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "Loa/F;", "<anonymous>", "(Lu0/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.o$b */
    static final class b extends k implements p<InterfaceC4637c, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: C, reason: collision with root package name */
        int f52486C;

        /* renamed from: D, reason: collision with root package name */
        private /* synthetic */ Object f52487D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ g f52488E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC4637c, InterfaceC4588d<? super C4153F>, Object> f52489F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(g gVar, p<? super InterfaceC4637c, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f52488E = gVar;
            this.f52489F = pVar;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4637c interfaceC4637c, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(interfaceC4637c, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(this.f52488E, this.f52489F, interfaceC4588d);
            bVar.f52487D = obj;
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, u0.c] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, u0.c] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0059 -> B:12:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0070 -> B:12:0x0028). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r7.f52486C
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r7.f52487D
                u0.c r1 = (u0.InterfaceC4637c) r1
                oa.C4173r.b(r8)
                goto L28
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f52487D
                u0.c r1 = (u0.InterfaceC4637c) r1
                oa.C4173r.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            L28:
                r8 = r1
                goto L3b
            L2a:
                r8 = move-exception
                goto L60
            L2c:
                java.lang.Object r1 = r7.f52487D
                u0.c r1 = (u0.InterfaceC4637c) r1
                oa.C4173r.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
                goto L51
            L34:
                oa.C4173r.b(r8)
                java.lang.Object r8 = r7.f52487D
                u0.c r8 = (u0.InterfaceC4637c) r8
            L3b:
                ta.g r1 = r7.f52488E
                boolean r1 = Xb.C1873y0.q(r1)
                if (r1 == 0) goto L74
                Ba.p<u0.c, ta.d<? super oa.F>, java.lang.Object> r1 = r7.f52489F     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.f52487D = r8     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.f52486C = r4     // Catch: java.util.concurrent.CancellationException -> L5c
                java.lang.Object r1 = r1.invoke(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L5c
                if (r1 != r0) goto L50
                return r0
            L50:
                r1 = r8
            L51:
                r7.f52487D = r1     // Catch: java.util.concurrent.CancellationException -> L2a
                r7.f52486C = r3     // Catch: java.util.concurrent.CancellationException -> L2a
                java.lang.Object r8 = kotlin.C5035o.b(r1, r7)     // Catch: java.util.concurrent.CancellationException -> L2a
                if (r8 != r0) goto L28
                return r0
            L5c:
                r1 = move-exception
                r6 = r1
                r1 = r8
                r8 = r6
            L60:
                ta.g r5 = r7.f52488E
                boolean r5 = Xb.C1873y0.q(r5)
                if (r5 == 0) goto L73
                r7.f52487D = r1
                r7.f52486C = r2
                java.lang.Object r8 = kotlin.C5035o.b(r1, r7)
                if (r8 != r0) goto L28
                return r0
            L73:
                throw r8
            L74:
                oa.F r8 = oa.C4153F.f46609a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C5035o.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final boolean a(InterfaceC4637c interfaceC4637c) {
        List<PointerInputChange> listC = interfaceC4637c.V().c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (listC.get(i10).getPressed()) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (a(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:19:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(u0.InterfaceC4637c r6, ta.InterfaceC4588d<? super oa.C4153F> r7) {
        /*
            boolean r0 = r7 instanceof kotlin.C5035o.a
            if (r0 == 0) goto L13
            r0 = r7
            x.o$a r0 = (kotlin.C5035o.a) r0
            int r1 = r0.f52485D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52485D = r1
            goto L18
        L13:
            x.o$a r0 = new x.o$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f52484C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f52485D
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f52483B
            u0.c r6 = (u0.InterfaceC4637c) r6
            oa.C4173r.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            oa.C4173r.b(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L68
        L3e:
            u0.q r7 = u0.EnumC4651q.Final
            r0.f52483B = r6
            r0.f52485D = r3
            java.lang.Object r7 = r6.l0(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            u0.o r7 = (u0.C4649o) r7
            java.util.List r7 = r7.c()
            int r2 = r7.size()
            r4 = 0
        L56:
            if (r4 >= r2) goto L68
            java.lang.Object r5 = r7.get(r4)
            u0.z r5 = (u0.PointerInputChange) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L65
            goto L3e
        L65:
            int r4 = r4 + 1
            goto L56
        L68:
            oa.F r6 = oa.C4153F.f46609a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C5035o.b(u0.c, ta.d):java.lang.Object");
    }

    public static final Object c(InterfaceC4622H interfaceC4622H, p<? super InterfaceC4637c, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objR0 = interfaceC4622H.r0(new b(interfaceC4588d.getContext(), pVar, null), interfaceC4588d);
        return objR0 == C4696b.e() ? objR0 : C4153F.f46609a;
    }
}
