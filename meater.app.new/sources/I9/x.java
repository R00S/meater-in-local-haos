package I9;

import E1.d;
import Xb.C1841i;
import ac.C1972g;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.P;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SessionDatastore.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0015\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"LI9/x;", "Lcom/google/firebase/sessions/a;", "Landroid/content/Context;", "context", "Lta/g;", "backgroundDispatcher", "<init>", "(Landroid/content/Context;Lta/g;)V", "LE1/d;", "preferences", "LI9/l;", "i", "(LE1/d;)LI9/l;", "", "sessionId", "Loa/F;", "b", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "Landroid/content/Context;", "c", "Lta/g;", "Ljava/util/concurrent/atomic/AtomicReference;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "currentSessionFromDatastore", "Lac/e;", "e", "Lac/e;", "firebaseSessionDataFlow", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class x implements com.google.firebase.sessions.a {

    /* renamed from: f, reason: collision with root package name */
    private static final c f6899f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Ea.d<Context, B1.e<E1.d>> f6900g = D1.a.b(w.f6895a.a(), new C1.b(b.f6908B), null, null, 12, null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ta.g backgroundDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<FirebaseSessionsData> currentSessionFromDatastore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1970e<FirebaseSessionsData> firebaseSessionDataFlow;

    /* compiled from: SessionDatastore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {82}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6905B;

        /* compiled from: SessionDatastore.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI9/l;", "it", "Loa/F;", "b", "(LI9/l;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I9.x$a$a, reason: collision with other inner class name */
        static final class C0140a<T> implements InterfaceC1971f {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ x f6907B;

            C0140a(x xVar) {
                this.f6907B = xVar;
            }

            @Override // ac.InterfaceC1971f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(FirebaseSessionsData firebaseSessionsData, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                this.f6907B.currentSessionFromDatastore.set(firebaseSessionsData);
                return C4153F.f46609a;
            }
        }

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return x.this.new a(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6905B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1970e interfaceC1970e = x.this.firebaseSessionDataFlow;
                C0140a c0140a = new C0140a(x.this);
                this.f6905B = 1;
                if (interfaceC1970e.b(c0140a, this) == objE) {
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

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/core/CorruptionException;", "ex", "LE1/d;", "a", "(Landroidx/datastore/core/CorruptionException;)LE1/d;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<CorruptionException, E1.d> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f6908B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E1.d invoke(CorruptionException ex) {
            C3862t.g(ex, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + v.f6894a.e() + '.', ex);
            return E1.e.a();
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LI9/x$c;", "", "<init>", "()V", "Landroid/content/Context;", "LB1/e;", "LE1/d;", "dataStore$delegate", "LEa/d;", "b", "(Landroid/content/Context;)LB1/e;", "dataStore", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Ia.m<Object>[] f6909a = {P.i(new kotlin.jvm.internal.I(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ c(C3854k c3854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final B1.e<E1.d> b(Context context) {
            return (B1.e) x.f6900g.a(context, f6909a[0]);
        }

        private c() {
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LI9/x$d;", "", "<init>", "()V", "LE1/d$a;", "", "b", "LE1/d$a;", "a", "()LE1/d$a;", "SESSION_ID", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f6910a = new d();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final d.a<String> SESSION_ID = E1.f.f("session_id");

        private d() {
        }

        public final d.a<String> a() {
            return SESSION_ID;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {76}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lac/f;", "LE1/d;", "", "exception", "Loa/F;", "<anonymous>", "(Lac/f;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.l implements Ba.q<InterfaceC1971f<? super E1.d>, Throwable, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6912B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f6913C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f6914D;

        e(InterfaceC4588d<? super e> interfaceC4588d) {
            super(3, interfaceC4588d);
        }

        @Override // Ba.q
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object g(InterfaceC1971f<? super E1.d> interfaceC1971f, Throwable th, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            e eVar = new e(interfaceC4588d);
            eVar.f6913C = interfaceC1971f;
            eVar.f6914D = th;
            return eVar.invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6912B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1971f interfaceC1971f = (InterfaceC1971f) this.f6913C;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f6914D);
                E1.d dVarA = E1.e.a();
                this.f6913C = null;
                this.f6912B = 1;
                if (interfaceC1971f.a(dVarA, this) == objE) {
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

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lac/e;", "Lac/f;", "collector", "Loa/F;", "b", "(Lac/f;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements InterfaceC1970e<FirebaseSessionsData> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1970e f6915B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ x f6916C;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements InterfaceC1971f {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ InterfaceC1971f f6917B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ x f6918C;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {223}, m = "emit")
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: I9.x$f$a$a, reason: collision with other inner class name */
            public static final class C0141a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: B, reason: collision with root package name */
                /* synthetic */ Object f6919B;

                /* renamed from: C, reason: collision with root package name */
                int f6920C;

                public C0141a(InterfaceC4588d interfaceC4588d) {
                    super(interfaceC4588d);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f6919B = obj;
                    this.f6920C |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC1971f interfaceC1971f, x xVar) {
                this.f6917B = interfaceC1971f;
                this.f6918C = xVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // ac.InterfaceC1971f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r5, ta.InterfaceC4588d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof I9.x.f.a.C0141a
                    if (r0 == 0) goto L13
                    r0 = r6
                    I9.x$f$a$a r0 = (I9.x.f.a.C0141a) r0
                    int r1 = r0.f6920C
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f6920C = r1
                    goto L18
                L13:
                    I9.x$f$a$a r0 = new I9.x$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f6919B
                    java.lang.Object r1 = ua.C4696b.e()
                    int r2 = r0.f6920C
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    oa.C4173r.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    oa.C4173r.b(r6)
                    ac.f r6 = r4.f6917B
                    E1.d r5 = (E1.d) r5
                    I9.x r2 = r4.f6918C
                    I9.l r5 = I9.x.h(r2, r5)
                    r0.f6920C = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    oa.F r5 = oa.C4153F.f46609a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: I9.x.f.a.a(java.lang.Object, ta.d):java.lang.Object");
            }
        }

        public f(InterfaceC1970e interfaceC1970e, x xVar) {
            this.f6915B = interfaceC1970e;
            this.f6916C = xVar;
        }

        @Override // ac.InterfaceC1970e
        public Object b(InterfaceC1971f<? super FirebaseSessionsData> interfaceC1971f, InterfaceC4588d interfaceC4588d) {
            Object objB = this.f6915B.b(new a(interfaceC1971f, this.f6916C), interfaceC4588d);
            return objB == C4696b.e() ? objB : C4153F.f46609a;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {89}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6922B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f6924D;

        /* compiled from: SessionDatastore.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE1/a;", "preferences", "Loa/F;", "<anonymous>", "(LE1/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<E1.a, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f6925B;

            /* renamed from: C, reason: collision with root package name */
            /* synthetic */ Object f6926C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ String f6927D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f6927D = str;
            }

            @Override // Ba.p
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(E1.a aVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(aVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                a aVar = new a(this.f6927D, interfaceC4588d);
                aVar.f6926C = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f6925B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                ((E1.a) this.f6926C).i(d.f6910a.a(), this.f6927D);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, InterfaceC4588d<? super g> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6924D = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return x.this.new g(this.f6924D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((g) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6922B;
            try {
                if (i10 == 0) {
                    C4173r.b(obj);
                    B1.e eVarB = x.f6899f.b(x.this.context);
                    a aVar = new a(this.f6924D, null);
                    this.f6922B = 1;
                    if (E1.g.a(eVarB, aVar, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
            } catch (IOException e10) {
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e10);
            }
            return C4153F.f46609a;
        }
    }

    public x(Context context, ta.g backgroundDispatcher) {
        C3862t.g(context, "context");
        C3862t.g(backgroundDispatcher, "backgroundDispatcher");
        this.context = context;
        this.backgroundDispatcher = backgroundDispatcher;
        this.currentSessionFromDatastore = new AtomicReference<>();
        this.firebaseSessionDataFlow = new f(C1972g.f(f6899f.b(context).f(), new e(null)), this);
        C1841i.d(Xb.J.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FirebaseSessionsData i(E1.d preferences) {
        return new FirebaseSessionsData((String) preferences.b(d.f6910a.a()));
    }

    @Override // com.google.firebase.sessions.a
    public String a() {
        FirebaseSessionsData firebaseSessionsData = this.currentSessionFromDatastore.get();
        if (firebaseSessionsData != null) {
            return firebaseSessionsData.getSessionId();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.a
    public void b(String sessionId) {
        C3862t.g(sessionId, "sessionId");
        C1841i.d(Xb.J.a(this.backgroundDispatcher), null, null, new g(sessionId, null), 3, null);
    }
}
