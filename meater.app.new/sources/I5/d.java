package I5;

import Ba.p;
import Xb.C1841i;
import Xb.C1854o0;
import Xb.F;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.Z;
import android.view.E;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.apptionlabs.meater_app.model.PendingRequest;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.InterfaceC3857n;
import l4.AbstractC3900b;
import o4.AnalyticsResponse;
import oa.C4153F;
import oa.C4173r;
import oa.InterfaceC4160e;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: PendingRequestManager.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*¨\u0006,"}, d2 = {"LI5/d;", "", "Lcom/apptionlabs/meater_app/data/NetworkConstant;", "networkConstant", "Ls4/c;", "analyticsUseCase", "LG5/a;", "preferences", "<init>", "(Lcom/apptionlabs/meater_app/data/NetworkConstant;Ls4/c;LG5/a;)V", "Loa/F;", "i", "()V", "", "Lcom/apptionlabs/meater_app/model/PendingRequest;", "it", "h", "(Ljava/util/List;)V", "g", "a", "Lcom/apptionlabs/meater_app/data/NetworkConstant;", "b", "Ls4/c;", "c", "LG5/a;", "LXb/v0;", "d", "LXb/v0;", "analyticsJob", "", "e", "Z", "isPendingRequestExecuting", "f", "shouldStopExecution", "Ljava/util/LinkedList;", "Ljava/util/LinkedList;", "recipeAnalyticsPendingRequestQueue", "", "I", "recipeAnalyticsBulkSize", "LXb/F;", "LXb/F;", "coroutineExceptionHandler", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NetworkConstant networkConstant;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s4.c analyticsUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final G5.a preferences;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 analyticsJob;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isPendingRequestExecuting;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean shouldStopExecution;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private LinkedList<PendingRequest> recipeAnalyticsPendingRequestQueue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int recipeAnalyticsBulkSize;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final F coroutineExceptionHandler;

    /* compiled from: PendingRequestManager.kt */
    @f(c = "com.apptionlabs.meater_app.singletons.PendingRequestManager$callRecursiveRecipeAnalyticsAPI$1", f = "PendingRequestManager.kt", l = {100, 102}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6694B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f6695C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ List<PendingRequest> f6696D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ d f6697E;

        /* compiled from: PendingRequestManager.kt */
        @f(c = "com.apptionlabs.meater_app.singletons.PendingRequestManager$callRecursiveRecipeAnalyticsAPI$1$2$1", f = "PendingRequestManager.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: I5.d$a$a, reason: collision with other inner class name */
        static final class C0132a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f6698B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ AbstractC3900b<AnalyticsResponse> f6699C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ d f6700D;

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ List<PendingRequest> f6701E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0132a(AbstractC3900b<AnalyticsResponse> abstractC3900b, d dVar, List<? extends PendingRequest> list, InterfaceC4588d<? super C0132a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f6699C = abstractC3900b;
                this.f6700D = dVar;
                this.f6701E = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0132a(this.f6699C, this.f6700D, this.f6701E, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0132a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f6698B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                AbstractC3900b<AnalyticsResponse> abstractC3900b = this.f6699C;
                if (abstractC3900b instanceof AbstractC3900b.a) {
                    this.f6700D.isPendingRequestExecuting = false;
                    U4.b.t("(PendingRequestManager) Request Error", new Object[0]);
                } else {
                    if (!(abstractC3900b instanceof AbstractC3900b.C0590b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    U4.b.t("(PendingRequestManager) Request Successful", new Object[0]);
                    List<PendingRequest> list = this.f6701E;
                    d dVar = this.f6700D;
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        LocalStorage.sharedStorage().pendingRequestDAO().c((PendingRequest) it.next());
                        dVar.recipeAnalyticsPendingRequestQueue.removeFirst();
                    }
                    U4.b.t("(PendingRequestManager) Pending List Size after Remove : " + this.f6700D.recipeAnalyticsPendingRequestQueue.size(), new Object[0]);
                    if (!this.f6700D.shouldStopExecution) {
                        this.f6700D.g();
                    }
                }
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends PendingRequest> list, d dVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6696D = list;
            this.f6697E = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f6696D, this.f6697E, interfaceC4588d);
            aVar.f6695C = obj;
            return aVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r8.f6694B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r8.f6695C
                oa.C4173r.b(r9)
                goto La1
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                oa.C4173r.b(r9)     // Catch: java.lang.Throwable -> L21
                goto L6d
            L21:
                r9 = move-exception
                goto L74
            L23:
                oa.C4173r.b(r9)
                java.lang.Object r9 = r8.f6695C
                Xb.I r9 = (Xb.I) r9
                java.util.List<com.apptionlabs.meater_app.model.PendingRequest> r9 = r8.f6696D
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r1 = new java.util.ArrayList
                r4 = 10
                int r4 = kotlin.collections.r.x(r9, r4)
                r1.<init>(r4)
                java.util.Iterator r9 = r9.iterator()
            L3d:
                boolean r4 = r9.hasNext()
                if (r4 == 0) goto L5c
                java.lang.Object r4 = r9.next()
                com.apptionlabs.meater_app.model.PendingRequest r4 = (com.apptionlabs.meater_app.model.PendingRequest) r4
                com.google.gson.Gson r5 = new com.google.gson.Gson
                r5.<init>()
                java.lang.String r4 = r4.requestBody
                java.lang.Class<o4.q> r6 = o4.RecipeAnalyticsRequestInput.class
                java.lang.Object r4 = r5.k(r4, r6)
                o4.q r4 = (o4.RecipeAnalyticsRequestInput) r4
                r1.add(r4)
                goto L3d
            L5c:
                I5.d r9 = r8.f6697E
                oa.q$a r4 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L21
                s4.c r9 = I5.d.c(r9)     // Catch: java.lang.Throwable -> L21
                r8.f6694B = r3     // Catch: java.lang.Throwable -> L21
                java.lang.Object r9 = r9.a(r1, r8)     // Catch: java.lang.Throwable -> L21
                if (r9 != r0) goto L6d
                return r0
            L6d:
                l4.b r9 = (l4.AbstractC3900b) r9     // Catch: java.lang.Throwable -> L21
                java.lang.Object r9 = oa.C4172q.a(r9)     // Catch: java.lang.Throwable -> L21
                goto L7e
            L74:
                oa.q$a r1 = oa.C4172q.INSTANCE
                java.lang.Object r9 = oa.C4173r.a(r9)
                java.lang.Object r9 = oa.C4172q.a(r9)
            L7e:
                I5.d r1 = r8.f6697E
                java.util.List<com.apptionlabs.meater_app.model.PendingRequest> r3 = r8.f6696D
                boolean r4 = oa.C4172q.d(r9)
                if (r4 == 0) goto La2
                r4 = r9
                l4.b r4 = (l4.AbstractC3900b) r4
                Xb.G0 r5 = Xb.Z.c()
                I5.d$a$a r6 = new I5.d$a$a
                r7 = 0
                r6.<init>(r4, r1, r3, r7)
                r8.f6695C = r9
                r8.f6694B = r2
                java.lang.Object r1 = Xb.C1837g.g(r5, r6, r8)
                if (r1 != r0) goto La0
                return r0
            La0:
                r0 = r9
            La1:
                r9 = r0
            La2:
                java.lang.Throwable r9 = oa.C4172q.b(r9)
                if (r9 == 0) goto Lb1
                java.lang.String r0 = "Exception"
                java.lang.Object[] r9 = new java.lang.Object[]{r9}
                U4.b.e(r0, r9)
            Lb1:
                oa.F r9 = oa.C4153F.f46609a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: I5.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PendingRequestManager.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements E, InterfaceC3857n {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Ba.l f6702a;

        b(Ba.l function) {
            C3862t.g(function, "function");
            this.f6702a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC3857n
        public final InterfaceC4160e<?> a() {
            return this.f6702a;
        }

        @Override // android.view.E
        public final /* synthetic */ void b(Object obj) {
            this.f6702a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof E) && (obj instanceof InterfaceC3857n)) {
                return C3862t.b(a(), ((InterfaceC3857n) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"I5/d$c", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends AbstractC4585a implements F {
        public c(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(g context, Throwable exception) {
            U4.b.e("Exception", exception);
        }
    }

    public d(NetworkConstant networkConstant, s4.c analyticsUseCase, G5.a preferences) {
        C3862t.g(networkConstant, "networkConstant");
        C3862t.g(analyticsUseCase, "analyticsUseCase");
        C3862t.g(preferences, "preferences");
        this.networkConstant = networkConstant;
        this.analyticsUseCase = analyticsUseCase;
        this.preferences = preferences;
        this.recipeAnalyticsPendingRequestQueue = new LinkedList<>();
        this.recipeAnalyticsBulkSize = 50;
        this.coroutineExceptionHandler = new c(F.INSTANCE);
        U4.b.t("(PendingRequestManager) Initialized", new Object[0]);
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        List listP0;
        int size = this.recipeAnalyticsPendingRequestQueue.size();
        int i10 = this.recipeAnalyticsBulkSize;
        if (size > i10) {
            listP0 = r.P0(this.recipeAnalyticsPendingRequestQueue, i10);
        } else {
            LinkedList<PendingRequest> linkedList = this.recipeAnalyticsPendingRequestQueue;
            listP0 = r.P0(linkedList, linkedList.size());
        }
        U4.b.t("(PendingRequestManager) Request Generated for : " + listP0.size(), new Object[0]);
        if (!listP0.isEmpty()) {
            this.analyticsJob = C1841i.d(C1854o0.f19099B, Z.b().s(this.coroutineExceptionHandler), null, new a(listP0, this, null), 2, null);
            return;
        }
        this.isPendingRequestExecuting = false;
        U4.b.t("(PendingRequestManager) isPendingRequestExecuting : false", new Object[0]);
    }

    private final void h(List<? extends PendingRequest> it) {
        if (it.isEmpty() || this.preferences.l() == null) {
            return;
        }
        U4.b.t("(PendingRequestManager) Pending Entry : " + it.size(), new Object[0]);
        for (PendingRequest pendingRequest : it) {
            if (C3862t.b(pendingRequest.requestMethod, this.networkConstant.getNetworkConstant().e())) {
                LinkedList<PendingRequest> linkedList = this.recipeAnalyticsPendingRequestQueue;
                if (linkedList == null || !linkedList.isEmpty()) {
                    Iterator<T> it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        if (((PendingRequest) it2.next()).getRequestID() == pendingRequest.requestID) {
                            break;
                        }
                    }
                }
                this.recipeAnalyticsPendingRequestQueue.addLast(pendingRequest);
            }
        }
        if (this.isPendingRequestExecuting) {
            return;
        }
        this.isPendingRequestExecuting = true;
        U4.b.t("(PendingRequestManager) isPendingRequestExecuting : true", new Object[0]);
        g();
    }

    private final void i() {
        LocalStorage.sharedStorage().pendingRequestDAO().d().i(new b(new Ba.l() { // from class: I5.c
            @Override // Ba.l
            public final Object invoke(Object obj) {
                return d.j(this.f6684B, (List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F j(d dVar, List list) {
        C3862t.d(list);
        dVar.h(list);
        return C4153F.f46609a;
    }
}
