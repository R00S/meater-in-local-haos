package ac;

import java.util.List;
import kotlin.Metadata;
import oa.C4153F;
import oa.C4173r;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SharingStarted.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lac/G;", "Lac/D;", "", "stopTimeout", "replayExpiration", "<init>", "(JJ)V", "Lac/H;", "", "subscriptionCount", "Lac/e;", "Lac/B;", "a", "(Lac/H;)Lac/e;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "J", "c", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class G implements D {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long stopTimeout;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long replayExpiration;

    /* compiled from: SharingStarted.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lac/f;", "Lac/B;", "", "count", "Loa/F;", "<anonymous>", "(Lac/f;I)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.q<InterfaceC1971f<? super B>, Integer, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f20312B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f20313C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ int f20314D;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(3, interfaceC4588d);
        }

        public final Object b(InterfaceC1971f<? super B> interfaceC1971f, int i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            a aVar = G.this.new a(interfaceC4588d);
            aVar.f20313C = interfaceC1971f;
            aVar.f20314D = i10;
            return aVar.invokeSuspend(C4153F.f46609a);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Object g(InterfaceC1971f<? super B> interfaceC1971f, Integer num, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return b(interfaceC1971f, num.intValue(), interfaceC4588d);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r9.f20312B
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f20313C
                ac.f r1 = (ac.InterfaceC1971f) r1
                oa.C4173r.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f20313C
                ac.f r1 = (ac.InterfaceC1971f) r1
                oa.C4173r.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f20313C
                ac.f r1 = (ac.InterfaceC1971f) r1
                oa.C4173r.b(r10)
                goto L64
            L38:
                oa.C4173r.b(r10)
                goto L9c
            L3c:
                oa.C4173r.b(r10)
                java.lang.Object r10 = r9.f20313C
                r1 = r10
                ac.f r1 = (ac.InterfaceC1971f) r1
                int r10 = r9.f20314D
                if (r10 <= 0) goto L53
                ac.B r10 = ac.B.f20289B
                r9.f20312B = r6
                java.lang.Object r10 = r1.a(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                ac.G r10 = ac.G.this
                long r6 = ac.G.c(r10)
                r9.f20313C = r1
                r9.f20312B = r5
                java.lang.Object r10 = Xb.T.a(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                ac.G r10 = ac.G.this
                long r5 = ac.G.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                ac.B r10 = ac.B.f20290C
                r9.f20313C = r1
                r9.f20312B = r4
                java.lang.Object r10 = r1.a(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                ac.G r10 = ac.G.this
                long r4 = ac.G.b(r10)
                r9.f20313C = r1
                r9.f20312B = r3
                java.lang.Object r10 = Xb.T.a(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                ac.B r10 = ac.B.f20291D
                r3 = 0
                r9.f20313C = r3
                r9.f20312B = r2
                java.lang.Object r10 = r1.a(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                oa.F r10 = oa.C4153F.f46609a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ac.G.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SharingStarted.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lac/B;", "it", "", "<anonymous>", "(Lac/B;)Z"}, k = 3, mv = {1, 9, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<B, InterfaceC4588d<? super Boolean>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f20316B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f20317C;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(B b10, InterfaceC4588d<? super Boolean> interfaceC4588d) {
            return ((b) create(b10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(interfaceC4588d);
            bVar.f20317C = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f20316B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((B) this.f20317C) != B.f20289B);
        }
    }

    public G(long j10, long j11) {
        this.stopTimeout = j10;
        this.replayExpiration = j11;
        if (j10 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // ac.D
    public InterfaceC1970e<B> a(H<Integer> subscriptionCount) {
        return C1972g.k(C1972g.l(C1972g.w(subscriptionCount, new a(null)), new b(null)));
    }

    public boolean equals(Object other) {
        if (other instanceof G) {
            G g10 = (G) other;
            if (this.stopTimeout == g10.stopTimeout && this.replayExpiration == g10.replayExpiration) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.stopTimeout) * 31) + Long.hashCode(this.replayExpiration);
    }

    public String toString() {
        List listD = kotlin.collections.r.d(2);
        if (this.stopTimeout > 0) {
            listD.add("stopTimeout=" + this.stopTimeout + "ms");
        }
        if (this.replayExpiration < Long.MAX_VALUE) {
            listD.add("replayExpiration=" + this.replayExpiration + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + kotlin.collections.r.s0(kotlin.collections.r.a(listD), null, null, null, 0, null, null, 63, null) + ')';
    }
}
