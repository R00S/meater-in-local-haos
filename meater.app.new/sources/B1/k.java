package B1;

import Ba.p;
import Xb.C1841i;
import Xb.I;
import Xb.InterfaceC1867v0;
import Zb.k;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: SimpleActor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bh\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R3\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"LB1/k;", "T", "", "LXb/I;", "scope", "Lkotlin/Function1;", "", "Loa/F;", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lta/d;", "consumeMessage", "<init>", "(LXb/I;LBa/l;LBa/p;LBa/p;)V", "msg", "e", "(Ljava/lang/Object;)V", "a", "LXb/I;", "b", "LBa/p;", "LZb/g;", "c", "LZb/g;", "messageQueue", "Ljava/util/concurrent/atomic/AtomicInteger;", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "remainingMessages", "datastore-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class k<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final I scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p<T, InterfaceC4588d<? super C4153F>, Object> consumeMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Zb.g<T> messageQueue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger remainingMessages;

    /* compiled from: SimpleActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "ex", "Loa/F;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1})
    static final class a extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l<Throwable, C4153F> f1426B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ k<T> f1427C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<T, Throwable, C4153F> f1428D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Ba.l<? super Throwable, C4153F> lVar, k<T> kVar, p<? super T, ? super Throwable, C4153F> pVar) {
            super(1);
            this.f1426B = lVar;
            this.f1427C = kVar;
            this.f1428D = pVar;
        }

        public final void a(Throwable th) {
            C4153F c4153f;
            this.f1426B.invoke(th);
            ((k) this.f1427C).messageQueue.j(th);
            do {
                Object objF = Zb.k.f(((k) this.f1427C).messageQueue.i());
                if (objF == null) {
                    c4153f = null;
                } else {
                    this.f1428D.invoke(objF, th);
                    c4153f = C4153F.f46609a;
                }
            } while (c4153f != null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    /* compiled from: SimpleActor.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 5, 1})
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f1429B;

        /* renamed from: C, reason: collision with root package name */
        int f1430C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ k<T> f1431D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k<T> kVar, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f1431D = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new b(this.f1431D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:21:0x0062). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r5.f1430C
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oa.C4173r.b(r6)
                goto L62
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f1429B
                Ba.p r1 = (Ba.p) r1
                oa.C4173r.b(r6)
                goto L56
            L22:
                oa.C4173r.b(r6)
                B1.k<T> r6 = r5.f1431D
                java.util.concurrent.atomic.AtomicInteger r6 = B1.k.c(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L33
                r6 = r3
                goto L34
            L33:
                r6 = 0
            L34:
                if (r6 == 0) goto L71
            L36:
                B1.k<T> r6 = r5.f1431D
                Xb.I r6 = B1.k.d(r6)
                Xb.J.e(r6)
                B1.k<T> r6 = r5.f1431D
                Ba.p r1 = B1.k.a(r6)
                B1.k<T> r6 = r5.f1431D
                Zb.g r6 = B1.k.b(r6)
                r5.f1429B = r1
                r5.f1430C = r3
                java.lang.Object r6 = r6.r(r5)
                if (r6 != r0) goto L56
                return r0
            L56:
                r4 = 0
                r5.f1429B = r4
                r5.f1430C = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L62
                return r0
            L62:
                B1.k<T> r6 = r5.f1431D
                java.util.concurrent.atomic.AtomicInteger r6 = B1.k.c(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L36
                oa.F r6 = oa.C4153F.f46609a
                return r6
            L71:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: B1.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(I scope, Ba.l<? super Throwable, C4153F> onComplete, p<? super T, ? super Throwable, C4153F> onUndeliveredElement, p<? super T, ? super InterfaceC4588d<? super C4153F>, ? extends Object> consumeMessage) {
        C3862t.g(scope, "scope");
        C3862t.g(onComplete, "onComplete");
        C3862t.g(onUndeliveredElement, "onUndeliveredElement");
        C3862t.g(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = Zb.j.b(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInteger(0);
        InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) scope.getCoroutineContext().b(InterfaceC1867v0.INSTANCE);
        if (interfaceC1867v0 == null) {
            return;
        }
        interfaceC1867v0.q(new a(onComplete, this, onUndeliveredElement));
    }

    public final void e(T msg) throws Throwable {
        Object objW = this.messageQueue.w(msg);
        if (objW instanceof k.Closed) {
            Throwable thE = Zb.k.e(objW);
            if (thE != null) {
                throw thE;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!Zb.k.i(objW)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            C1841i.d(this.scope, null, null, new b(this, null), 3, null);
        }
    }
}
