package I9;

import Xb.C1841i;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: FirebaseSessions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LI9/k;", "", "Lcom/google/firebase/f;", "firebaseApp", "LK9/f;", "settings", "Lta/g;", "backgroundDispatcher", "LI9/F;", "lifecycleServiceBinder", "<init>", "(Lcom/google/firebase/f;LK9/f;Lta/g;LI9/F;)V", "a", "Lcom/google/firebase/f;", "b", "LK9/f;", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.google.firebase.f firebaseApp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final K9.f settings;

    /* compiled from: FirebaseSessions.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {45, 49}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6872B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ ta.g f6874D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ F f6875E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ta.g gVar, F f10, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6874D = gVar;
            this.f6875E = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return k.this.new a(this.f6874D, this.f6875E, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r5.f6872B
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                oa.C4173r.b(r6)
                goto L69
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                oa.C4173r.b(r6)
                goto L2e
            L20:
                oa.C4173r.b(r6)
                J9.a r6 = J9.a.f7640a
                r5.f6872B = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L9b
            L44:
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L9b
                java.lang.Object r1 = r6.next()
                J9.b r1 = (J9.b) r1
                boolean r1 = r1.b()
                if (r1 == 0) goto L48
                I9.k r6 = I9.k.this
                K9.f r6 = I9.k.b(r6)
                r5.f6872B = r3
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L69
                return r0
            L69:
                I9.k r6 = I9.k.this
                K9.f r6 = I9.k.b(r6)
                boolean r6 = r6.d()
                if (r6 != 0) goto L7b
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto La0
            L7b:
                I9.D r6 = new I9.D
                ta.g r0 = r5.f6874D
                r6.<init>(r0)
                I9.F r0 = r5.f6875E
                r6.i(r0)
                I9.H r0 = I9.H.f6799B
                r0.a(r6)
                I9.k r6 = I9.k.this
                com.google.firebase.f r6 = I9.k.a(r6)
                I9.j r0 = new I9.j
                r0.<init>()
                r6.h(r0)
                goto La0
            L9b:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
            La0:
                oa.F r6 = oa.C4153F.f46609a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: I9.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k(com.google.firebase.f firebaseApp, K9.f settings, ta.g backgroundDispatcher, F lifecycleServiceBinder) {
        C3862t.g(firebaseApp, "firebaseApp");
        C3862t.g(settings, "settings");
        C3862t.g(backgroundDispatcher, "backgroundDispatcher");
        C3862t.g(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.firebaseApp = firebaseApp;
        this.settings = settings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = firebaseApp.k().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(H.f6799B);
            C1841i.d(Xb.J.a(backgroundDispatcher), null, null, new a(backgroundDispatcher, lifecycleServiceBinder, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
