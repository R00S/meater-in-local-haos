package kotlin;

import Ba.p;
import Xb.I;
import Xb.J;
import Xb.K;
import Xb.M;
import Zb.d;
import Zb.r;
import Zb.t;
import Zb.v;
import ac.C1972g;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ta.g;
import ta.h;
import ua.C4696b;

/* compiled from: ChannelFlow.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H$¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H¤@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010(R6\u0010.\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140*\u0012\u0006\u0012\u0004\u0018\u00010+0)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lbc/d;", "T", "Lbc/k;", "Lta/g;", "context", "", "capacity", "LZb/d;", "onBufferOverflow", "<init>", "(Lta/g;ILZb/d;)V", "Lac/e;", "l", "()Lac/e;", "e", "(Lta/g;ILZb/d;)Lac/e;", "k", "(Lta/g;ILZb/d;)Lbc/d;", "LZb/t;", "scope", "Loa/F;", "h", "(LZb/t;Lta/d;)Ljava/lang/Object;", "LXb/I;", "LZb/v;", "o", "(LXb/I;)LZb/v;", "Lac/f;", "collector", "b", "(Lac/f;Lta/d;)Ljava/lang/Object;", "", "f", "()Ljava/lang/String;", "toString", "B", "Lta/g;", "C", "I", "D", "LZb/d;", "Lkotlin/Function2;", "Lta/d;", "", "m", "()LBa/p;", "collectToFun", "n", "()I", "produceCapacity", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2288d<T> implements InterfaceC2295k<T> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final g context;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final int capacity;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final d onBufferOverflow;

    /* compiled from: ChannelFlow.kt */
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bc.d$a */
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f30748B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f30749C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1971f<T> f30750D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ AbstractC2288d<T> f30751E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC1971f<? super T> interfaceC1971f, AbstractC2288d<T> abstractC2288d, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f30750D = interfaceC1971f;
            this.f30751E = abstractC2288d;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f30750D, this.f30751E, interfaceC4588d);
            aVar.f30749C = obj;
            return aVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f30748B;
            if (i10 == 0) {
                C4173r.b(obj);
                I i11 = (I) this.f30749C;
                InterfaceC1971f<T> interfaceC1971f = this.f30750D;
                v<T> vVarO = this.f30751E.o(i11);
                this.f30748B = 1;
                if (C1972g.m(interfaceC1971f, vVarO, this) == objE) {
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

    /* compiled from: ChannelFlow.kt */
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LZb/t;", "it", "Loa/F;", "<anonymous>", "(LZb/t;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bc.d$b */
    static final class b extends l implements p<t<? super T>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f30752B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f30753C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ AbstractC2288d<T> f30754D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC2288d<T> abstractC2288d, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f30754D = abstractC2288d;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t<? super T> tVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(tVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(this.f30754D, interfaceC4588d);
            bVar.f30753C = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f30752B;
            if (i10 == 0) {
                C4173r.b(obj);
                t<? super T> tVar = (t) this.f30753C;
                AbstractC2288d<T> abstractC2288d = this.f30754D;
                this.f30752B = 1;
                if (abstractC2288d.h(tVar, this) == objE) {
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

    public AbstractC2288d(g gVar, int i10, d dVar) {
        this.context = gVar;
        this.capacity = i10;
        this.onBufferOverflow = dVar;
    }

    static /* synthetic */ <T> Object g(AbstractC2288d<T> abstractC2288d, InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objD = J.d(new a(interfaceC1971f, abstractC2288d, null), interfaceC4588d);
        return objD == C4696b.e() ? objD : C4153F.f46609a;
    }

    @Override // ac.InterfaceC1970e
    public Object b(InterfaceC1971f<? super T> interfaceC1971f, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        return g(this, interfaceC1971f, interfaceC4588d);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // kotlin.InterfaceC2295k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ac.InterfaceC1970e<T> e(ta.g r2, int r3, Zb.d r4) {
        /*
            r1 = this;
            ta.g r0 = r1.context
            ta.g r2 = r2.s(r0)
            Zb.d r0 = Zb.d.f19650B
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.capacity
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            Zb.d r4 = r1.onBufferOverflow
        L25:
            ta.g r0 = r1.context
            boolean r0 = kotlin.jvm.internal.C3862t.b(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.capacity
            if (r3 != r0) goto L36
            Zb.d r0 = r1.onBufferOverflow
            if (r4 != r0) goto L36
            return r1
        L36:
            bc.d r2 = r1.k(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AbstractC2288d.e(ta.g, int, Zb.d):ac.e");
    }

    protected String f() {
        return null;
    }

    protected abstract Object h(t<? super T> tVar, InterfaceC4588d<? super C4153F> interfaceC4588d);

    protected abstract AbstractC2288d<T> k(g context, int capacity, d onBufferOverflow);

    public InterfaceC1970e<T> l() {
        return null;
    }

    public final p<t<? super T>, InterfaceC4588d<? super C4153F>, Object> m() {
        return new b(this, null);
    }

    public final int n() {
        int i10 = this.capacity;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    public v<T> o(I scope) {
        return r.c(scope, this.context, n(), this.onBufferOverflow, K.f19032D, null, m(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strF = f();
        if (strF != null) {
            arrayList.add(strF);
        }
        if (this.context != h.f50000B) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != d.f19650B) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        return M.a(this) + '[' + kotlin.collections.r.s0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
