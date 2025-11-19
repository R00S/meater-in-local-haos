package cc;

import Xb.AbstractC1836f0;
import Xb.T0;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: DispatchedContinuation.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00060\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u000e8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0013"}, d2 = {"T", "Lta/d;", "Loa/q;", "result", "Lkotlin/Function1;", "", "Loa/F;", "onCancellation", "b", "(Lta/d;Ljava/lang/Object;LBa/l;)V", "Lcc/j;", "", "d", "(Lcc/j;)Z", "Lcc/F;", "a", "Lcc/F;", "UNDEFINED", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2380k {

    /* renamed from: a, reason: collision with root package name */
    private static final C2361F f31178a = new C2361F("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final C2361F f31179b = new C2361F("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: all -> 0x0068, DONT_GENERATE, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x003f, B:13:0x004d, B:15:0x0053, B:28:0x0092, B:18:0x006a, B:20:0x007a, B:25:0x0089, B:27:0x008f, B:33:0x009f, B:36:0x00a8, B:35:0x00a5, B:23:0x0080), top: B:44:0x003f, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void b(ta.InterfaceC4588d<? super T> r6, java.lang.Object r7, Ba.l<? super java.lang.Throwable, oa.C4153F> r8) {
        /*
            boolean r0 = r6 instanceof cc.C2379j
            if (r0 == 0) goto Lb2
            cc.j r6 = (cc.C2379j) r6
            java.lang.Object r8 = Xb.B.b(r7, r8)
            Xb.E r0 = r6.dispatcher
            ta.g r1 = r6.getContext()
            boolean r0 = r0.v0(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6._state = r8
            r6.resumeMode = r1
            Xb.E r7 = r6.dispatcher
            ta.g r8 = r6.getContext()
            r7.p0(r8, r6)
            goto Lb5
        L26:
            Xb.T0 r0 = Xb.T0.f19045a
            Xb.f0 r0 = r0.b()
            boolean r2 = r0.X0()
            if (r2 == 0) goto L3b
            r6._state = r8
            r6.resumeMode = r1
            r0.O0(r6)
            goto Lb5
        L3b:
            r0.S0(r1)
            r2 = 0
            ta.g r3 = r6.getContext()     // Catch: java.lang.Throwable -> L68
            Xb.v0$b r4 = Xb.InterfaceC1867v0.INSTANCE     // Catch: java.lang.Throwable -> L68
            ta.g$b r3 = r3.b(r4)     // Catch: java.lang.Throwable -> L68
            Xb.v0 r3 = (Xb.InterfaceC1867v0) r3     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L6a
            boolean r4 = r3.a()     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L6a
            java.util.concurrent.CancellationException r7 = r3.u()     // Catch: java.lang.Throwable -> L68
            r6.a(r8, r7)     // Catch: java.lang.Throwable -> L68
            oa.q$a r8 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = oa.C4173r.a(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = oa.C4172q.a(r7)     // Catch: java.lang.Throwable -> L68
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L68
            goto L92
        L68:
            r7 = move-exception
            goto La9
        L6a:
            ta.d<T> r8 = r6.continuation     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> L68
            ta.g r4 = r8.getContext()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = cc.C2365J.c(r4, r3)     // Catch: java.lang.Throwable -> L68
            cc.F r5 = cc.C2365J.f31152a     // Catch: java.lang.Throwable -> L68
            if (r3 == r5) goto L7f
            Xb.X0 r8 = Xb.D.g(r8, r4, r3)     // Catch: java.lang.Throwable -> L68
            goto L80
        L7f:
            r8 = r2
        L80:
            ta.d<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L9c
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9c
            oa.F r7 = oa.C4153F.f46609a     // Catch: java.lang.Throwable -> L9c
            if (r8 == 0) goto L8f
            boolean r7 = r8.f1()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L92
        L8f:
            cc.C2365J.a(r4, r3)     // Catch: java.lang.Throwable -> L68
        L92:
            boolean r7 = r0.h1()     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L92
        L98:
            r0.G0(r1)
            goto Lb5
        L9c:
            r7 = move-exception
            if (r8 == 0) goto La5
            boolean r8 = r8.f1()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto La8
        La5:
            cc.C2365J.a(r4, r3)     // Catch: java.lang.Throwable -> L68
        La8:
            throw r7     // Catch: java.lang.Throwable -> L68
        La9:
            r6.f(r7, r2)     // Catch: java.lang.Throwable -> Lad
            goto L98
        Lad:
            r6 = move-exception
            r0.G0(r1)
            throw r6
        Lb2:
            r6.resumeWith(r7)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.C2380k.b(ta.d, java.lang.Object, Ba.l):void");
    }

    public static /* synthetic */ void c(InterfaceC4588d interfaceC4588d, Object obj, Ba.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(interfaceC4588d, obj, lVar);
    }

    public static final boolean d(C2379j<? super C4153F> c2379j) {
        C4153F c4153f = C4153F.f46609a;
        AbstractC1836f0 abstractC1836f0B = T0.f19045a.b();
        if (abstractC1836f0B.a1()) {
            return false;
        }
        if (abstractC1836f0B.X0()) {
            c2379j._state = c4153f;
            c2379j.resumeMode = 1;
            abstractC1836f0B.O0(c2379j);
            return true;
        }
        abstractC1836f0B.S0(true);
        try {
            c2379j.run();
            do {
            } while (abstractC1836f0B.h1());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
