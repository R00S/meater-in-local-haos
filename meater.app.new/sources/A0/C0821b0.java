package A0;

import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: NodeChain.kt */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u0012\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lb0/i$b;", "prev", "next", "", "d", "(Lb0/i$b;Lb0/i$b;)I", "Lb0/i$c;", "T", "LA0/V;", "node", "Loa/F;", "f", "(LA0/V;Lb0/i$c;)V", "Lb0/i;", "LQ/b;", "result", "e", "(Lb0/i;LQ/b;)LQ/b;", "A0/b0$a", "a", "LA0/b0$a;", "SentinelHead", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0821b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f522a;

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"A0/b0$a", "Lb0/i$c;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.b0$a */
    public static final class a extends i.c {
        a() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    /* compiled from: NodeChain.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb0/i$b;", "element", "", "a", "(Lb0/i$b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.b0$b */
    static final class b extends AbstractC3864v implements Ba.l<i.b, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Q.b<i.b> f523B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Q.b<i.b> bVar) {
            super(1);
            this.f523B = bVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i.b bVar) {
            this.f523B.c(bVar);
            return Boolean.TRUE;
        }
    }

    static {
        a aVar = new a();
        aVar.Z1(-1);
        f522a = aVar;
    }

    public static final int d(i.b bVar, i.b bVar2) {
        if (C3862t.b(bVar, bVar2)) {
            return 2;
        }
        return b0.b.a(bVar, bVar2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Q.b<i.b> e(b0.i iVar, Q.b<i.b> bVar) {
        Q.b bVar2 = new Q.b(new b0.i[Ha.g.d(bVar.getSize(), 16)], 0);
        bVar2.c(iVar);
        b bVar3 = null;
        while (bVar2.y()) {
            b0.i iVar2 = (b0.i) bVar2.E(bVar2.getSize() - 1);
            if (iVar2 instanceof b0.f) {
                b0.f fVar = (b0.f) iVar2;
                bVar2.c(fVar.getInner());
                bVar2.c(fVar.getOuter());
            } else if (iVar2 instanceof i.b) {
                bVar.c(iVar2);
            } else {
                if (bVar3 == null) {
                    bVar3 = new b(bVar);
                }
                iVar2.a(bVar3);
                bVar3 = bVar3;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends i.c> void f(V<T> v10, i.c cVar) {
        C3862t.e(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        v10.n(cVar);
    }
}
