package F0;

import A0.G;
import kotlin.Metadata;

/* compiled from: SemanticsNode.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\t\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u0013\u0010\u000e\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\r\"\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LA0/G;", "layoutNode", "", "mergingEnabled", "LF0/p;", "a", "(LA0/G;Z)LF0/p;", "Lkotlin/Function1;", "selector", "f", "(LA0/G;LBa/l;)LA0/G;", "", "e", "(LF0/p;)I", "i", "LA0/v0;", "g", "(LA0/G;)LA0/v0;", "outerMergingSemantics", "LF0/i;", "h", "(LF0/p;)LF0/i;", "role", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[LOOP:0: B:5:0x0016->B:36:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a A[EDGE_INSN: B:41:0x007a->B:37:0x007a BREAK  A[LOOP:0: B:5:0x0016->B:36:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final F0.p a(A0.G r10, boolean r11) {
        /*
            A0.a0 r0 = r10.getNodes()
            r1 = 8
            int r1 = A0.e0.a(r1)
            int r2 = A0.C0819a0.c(r0)
            r2 = r2 & r1
            r3 = 0
            if (r2 == 0) goto L7a
            b0.i$c r0 = r0.getHead()
        L16:
            if (r0 == 0) goto L7a
            int r2 = r0.getKindSet()
            r2 = r2 & r1
            if (r2 == 0) goto L6e
            r2 = r0
            r4 = r3
        L21:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof A0.v0
            if (r5 == 0) goto L29
            r3 = r2
            goto L7a
        L29:
            int r5 = r2.getKindSet()
            r5 = r5 & r1
            if (r5 == 0) goto L69
            boolean r5 = r2 instanceof A0.AbstractC0834m
            if (r5 == 0) goto L69
            r5 = r2
            A0.m r5 = (A0.AbstractC0834m) r5
            b0.i$c r5 = r5.getDelegate()
            r6 = 0
            r7 = r6
        L3d:
            r8 = 1
            if (r5 == 0) goto L66
            int r9 = r5.getKindSet()
            r9 = r9 & r1
            if (r9 == 0) goto L61
            int r7 = r7 + 1
            if (r7 != r8) goto L4d
            r2 = r5
            goto L61
        L4d:
            if (r4 != 0) goto L58
            Q.b r4 = new Q.b
            r8 = 16
            b0.i$c[] r8 = new b0.i.c[r8]
            r4.<init>(r8, r6)
        L58:
            if (r2 == 0) goto L5e
            r4.c(r2)
            r2 = r3
        L5e:
            r4.c(r5)
        L61:
            b0.i$c r5 = r5.getChild()
            goto L3d
        L66:
            if (r7 != r8) goto L69
            goto L21
        L69:
            b0.i$c r2 = A0.C0832k.b(r4)
            goto L21
        L6e:
            int r2 = r0.getAggregateChildKindSet()
            r2 = r2 & r1
            if (r2 == 0) goto L7a
            b0.i$c r0 = r0.getChild()
            goto L16
        L7a:
            kotlin.jvm.internal.C3862t.d(r3)
            A0.v0 r3 = (A0.v0) r3
            b0.i$c r0 = r3.getNode()
            F0.l r1 = r10.I()
            kotlin.jvm.internal.C3862t.d(r1)
            F0.p r2 = new F0.p
            r2.<init>(r0, r11, r10, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.q.a(A0.G, boolean):F0.p");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(p pVar) {
        return pVar.getId() + 2000000000;
    }

    public static final G f(G g10, Ba.l<? super G, Boolean> lVar) {
        for (G gO0 = g10.o0(); gO0 != null; gO0 = gO0.o0()) {
            if (lVar.invoke(gO0).booleanValue()) {
                return gO0;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007e A[LOOP:0: B:5:0x0016->B:38:0x007e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083 A[EDGE_INSN: B:43:0x0083->B:39:0x0083 BREAK  A[LOOP:0: B:5:0x0016->B:38:0x007e], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final A0.v0 g(A0.G r9) {
        /*
            A0.a0 r9 = r9.getNodes()
            r0 = 8
            int r0 = A0.e0.a(r0)
            int r1 = A0.C0819a0.c(r9)
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L83
            b0.i$c r9 = r9.getHead()
        L16:
            if (r9 == 0) goto L83
            int r1 = r9.getKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto L77
            r1 = r9
            r3 = r2
        L21:
            if (r1 == 0) goto L77
            boolean r4 = r1 instanceof A0.v0
            if (r4 == 0) goto L32
            r4 = r1
            A0.v0 r4 = (A0.v0) r4
            boolean r4 = r4.getMergeDescendants()
            if (r4 == 0) goto L72
            r2 = r1
            goto L83
        L32:
            int r4 = r1.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto L72
            boolean r4 = r1 instanceof A0.AbstractC0834m
            if (r4 == 0) goto L72
            r4 = r1
            A0.m r4 = (A0.AbstractC0834m) r4
            b0.i$c r4 = r4.getDelegate()
            r5 = 0
            r6 = r5
        L46:
            r7 = 1
            if (r4 == 0) goto L6f
            int r8 = r4.getKindSet()
            r8 = r8 & r0
            if (r8 == 0) goto L6a
            int r6 = r6 + 1
            if (r6 != r7) goto L56
            r1 = r4
            goto L6a
        L56:
            if (r3 != 0) goto L61
            Q.b r3 = new Q.b
            r7 = 16
            b0.i$c[] r7 = new b0.i.c[r7]
            r3.<init>(r7, r5)
        L61:
            if (r1 == 0) goto L67
            r3.c(r1)
            r1 = r2
        L67:
            r3.c(r4)
        L6a:
            b0.i$c r4 = r4.getChild()
            goto L46
        L6f:
            if (r6 != r7) goto L72
            goto L21
        L72:
            b0.i$c r1 = A0.C0832k.b(r3)
            goto L21
        L77:
            int r1 = r9.getAggregateChildKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto L83
            b0.i$c r9 = r9.getChild()
            goto L16
        L83:
            A0.v0 r2 = (A0.v0) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.q.g(A0.G):A0.v0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i h(p pVar) {
        return (i) m.a(pVar.getUnmergedConfig(), s.f4372a.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(p pVar) {
        return pVar.getId() + 1000000000;
    }
}
