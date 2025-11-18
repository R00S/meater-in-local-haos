package com.google.firebase.sessions;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.InterfaceC0340e;
import androidx.datastore.core.p006o.C0351b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9778a0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.C11008j;
import kotlinx.coroutines.C11033p0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C11078d;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.HttpUrl;
import p024c.p064l.p065b.C0968a;
import p024c.p064l.p065b.p066i.AbstractC0979d;
import p024c.p064l.p065b.p066i.C0976a;
import p024c.p064l.p065b.p066i.C0980e;
import p024c.p064l.p065b.p066i.C0981f;
import p024c.p064l.p065b.p066i.C0982g;

/* compiled from: SessionDatastore.kt */
@Metadata(m32266d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl;", "Lcom/google/firebase/sessions/SessionDatastore;", "context", "Landroid/content/Context;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "currentSessionFromDatastore", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/google/firebase/sessions/FirebaseSessionsData;", "firebaseSessionDataFlow", "Lkotlinx/coroutines/flow/Flow;", "getCurrentSessionId", HttpUrl.FRAGMENT_ENCODE_SET, "mapSessionsData", "preferences", "Landroidx/datastore/preferences/core/Preferences;", "updateSessionId", HttpUrl.FRAGMENT_ENCODE_SET, "sessionId", "Companion", "FirebaseSessionDataKeys", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.x, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class SessionDatastoreImpl implements SessionDatastore {

    /* renamed from: b */
    private static final c f32362b = new c(null);

    /* renamed from: c */
    @Deprecated
    private static final ReadOnlyProperty<Context, InterfaceC0340e<AbstractC0979d>> f32363c = C0968a.m6179b(SessionDataStoreConfigs.f32356a.m26862a(), new C0351b(b.f32371f), null, null, 12, null);

    /* renamed from: d */
    private final Context f32364d;

    /* renamed from: e */
    private final CoroutineContext f32365e;

    /* renamed from: f */
    private final AtomicReference<FirebaseSessionsData> f32366f;

    /* renamed from: g */
    private final Flow<FirebaseSessionsData> f32367g;

    /* compiled from: SessionDatastore.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.SessionDatastoreImpl$1", m39050f = "SessionDatastore.kt", m39051l = {81}, m39052m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.x$a */
    static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        int f32368f;

        /* compiled from: SessionDatastore.kt */
        @Metadata(m32266d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lcom/google/firebase/sessions/FirebaseSessionsData;", "emit", "(Lcom/google/firebase/sessions/FirebaseSessionsData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: com.google.firebase.sessions.x$a$a, reason: collision with other inner class name */
        static final class C11517a<T> implements FlowCollector {

            /* renamed from: f */
            final /* synthetic */ SessionDatastoreImpl f32370f;

            C11517a(SessionDatastoreImpl sessionDatastoreImpl) {
                this.f32370f = sessionDatastoreImpl;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2409c(FirebaseSessionsData firebaseSessionsData, Continuation<? super C10775u> continuation) {
                this.f32370f.f32366f.set(firebaseSessionsData);
                return C10775u.f41439a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return SessionDatastoreImpl.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.f32368f;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                Flow flow = SessionDatastoreImpl.this.f32367g;
                C11517a c11517a = new C11517a(SessionDatastoreImpl.this);
                this.f32368f = 1;
                if (flow.mo2408a(c11517a, this) == objM39045c) {
                    return objM39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            return C10775u.f41439a;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "ex", "Landroidx/datastore/core/CorruptionException;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.x$b */
    static final class b extends Lambda implements Function1<CorruptionException, AbstractC0979d> {

        /* renamed from: f */
        public static final b f32371f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC0979d invoke(CorruptionException corruptionException) {
            C9801m.m32346f(corruptionException, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + ProcessDetailsProvider.f32355a.m26861e() + '.', corruptionException);
            return C0980e.m6254a();
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(m32266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R%\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "TAG", HttpUrl.FRAGMENT_ENCODE_SET, "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.x$c */
    private static final class c {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f32372a = {C9790g0.m32305i(new C9778a0(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private c() {
        }

        public /* synthetic */ c(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final InterfaceC0340e<AbstractC0979d> m26877b(Context context) {
            return (InterfaceC0340e) SessionDatastoreImpl.f32363c.mo6183a(context, f32372a[0]);
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl$FirebaseSessionDataKeys;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "SESSION_ID", "Landroidx/datastore/preferences/core/Preferences$Key;", HttpUrl.FRAGMENT_ENCODE_SET, "getSESSION_ID", "()Landroidx/datastore/preferences/core/Preferences$Key;", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.x$d */
    private static final class d {

        /* renamed from: a */
        public static final d f32373a = new d();

        /* renamed from: b */
        private static final AbstractC0979d.a<String> f32374b = C0981f.m6261f("session_id");

        private d() {
        }

        /* renamed from: a */
        public final AbstractC0979d.a<String> m26878a() {
            return f32374b;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/flow/FlowCollector;", "Landroidx/datastore/preferences/core/Preferences;", "exception", HttpUrl.FRAGMENT_ENCODE_SET}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", m39050f = "SessionDatastore.kt", m39051l = {75}, m39052m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.x$e */
    static final class e extends SuspendLambda implements Function3<FlowCollector<? super AbstractC0979d>, Throwable, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        int f32375f;

        /* renamed from: g */
        private /* synthetic */ Object f32376g;

        /* renamed from: h */
        /* synthetic */ Object f32377h;

        e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object mo26879d(FlowCollector<? super AbstractC0979d> flowCollector, Throwable th, Continuation<? super C10775u> continuation) {
            e eVar = new e(continuation);
            eVar.f32376g = flowCollector;
            eVar.f32377h = th;
            return eVar.invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.f32375f;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f32376g;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f32377h);
                AbstractC0979d abstractC0979dM6254a = C0980e.m6254a();
                this.f32376g = null;
                this.f32375f = 1;
                if (flowCollector.mo2409c(abstractC0979dM6254a, this) == objM39045c) {
                    return objM39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            return C10775u.f41439a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(m32266d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\t"}, m32267d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", HttpUrl.FRAGMENT_ENCODE_SET, "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.x$f */
    public static final class f implements Flow<FirebaseSessionsData> {

        /* renamed from: f */
        final /* synthetic */ Flow f32378f;

        /* renamed from: g */
        final /* synthetic */ SessionDatastoreImpl f32379g;

        /* compiled from: Emitters.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: com.google.firebase.sessions.x$f$a */
        public static final class a<T> implements FlowCollector {

            /* renamed from: f */
            final /* synthetic */ FlowCollector f32380f;

            /* renamed from: g */
            final /* synthetic */ SessionDatastoreImpl f32381g;

            /* compiled from: Emitters.kt */
            @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
            @DebugMetadata(m39049c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", m39050f = "SessionDatastore.kt", m39051l = {224}, m39052m = "emit")
            /* renamed from: com.google.firebase.sessions.x$f$a$a, reason: collision with other inner class name */
            public static final class C11518a extends ContinuationImpl {

                /* renamed from: f */
                /* synthetic */ Object f32382f;

                /* renamed from: g */
                int f32383g;

                public C11518a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f32382f = obj;
                    this.f32383g |= Integer.MIN_VALUE;
                    return a.this.mo2409c(null, this);
                }
            }

            public a(FlowCollector flowCollector, SessionDatastoreImpl sessionDatastoreImpl) {
                this.f32380f = flowCollector;
                this.f32381g = sessionDatastoreImpl;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo2409c(java.lang.Object r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.google.firebase.sessions.SessionDatastoreImpl.f.a.C11518a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.google.firebase.sessions.x$f$a$a r0 = (com.google.firebase.sessions.SessionDatastoreImpl.f.a.C11518a) r0
                    int r1 = r0.f32383g
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f32383g = r1
                    goto L18
                L13:
                    com.google.firebase.sessions.x$f$a$a r0 = new com.google.firebase.sessions.x$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f32382f
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
                    int r2 = r0.f32383g
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C10568o.m37655b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C10568o.m37655b(r6)
                    kotlinx.coroutines.z2.c r6 = r4.f32380f
                    c.l.b.i.d r5 = (p024c.p064l.p065b.p066i.AbstractC0979d) r5
                    com.google.firebase.sessions.x r2 = r4.f32381g
                    com.google.firebase.sessions.r r5 = com.google.firebase.sessions.SessionDatastoreImpl.m26872h(r2, r5)
                    r0.f32383g = r3
                    java.lang.Object r5 = r6.mo2409c(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.u r5 = kotlin.C10775u.f41439a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionDatastoreImpl.f.a.mo2409c(java.lang.Object, kotlin.y.d):java.lang.Object");
            }
        }

        public f(Flow flow, SessionDatastoreImpl sessionDatastoreImpl) {
            this.f32378f = flow;
            this.f32379g = sessionDatastoreImpl;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo2408a(FlowCollector<? super FirebaseSessionsData> flowCollector, Continuation continuation) {
            Object objMo2408a = this.f32378f.mo2408a(new a(flowCollector, this.f32379g), continuation);
            return objMo2408a == C10855d.m39045c() ? objMo2408a : C10775u.f41439a;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", m39050f = "SessionDatastore.kt", m39051l = {87}, m39052m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.x$g */
    static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        int f32385f;

        /* renamed from: h */
        final /* synthetic */ String f32387h;

        /* compiled from: SessionDatastore.kt */
        @Metadata(m32266d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        @DebugMetadata(m39049c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", m39050f = "SessionDatastore.kt", m39051l = {}, m39052m = "invokeSuspend")
        /* renamed from: com.google.firebase.sessions.x$g$a */
        static final class a extends SuspendLambda implements Function2<C0976a, Continuation<? super C10775u>, Object> {

            /* renamed from: f */
            int f32388f;

            /* renamed from: g */
            /* synthetic */ Object f32389g;

            /* renamed from: h */
            final /* synthetic */ String f32390h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f32390h = str;
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f32390h, continuation);
                aVar.f32389g = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C0976a c0976a, Continuation<? super C10775u> continuation) {
                return ((a) create(c0976a, continuation)).invokeSuspend(C10775u.f41439a);
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C10855d.m39045c();
                if (this.f32388f != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
                ((C0976a) this.f32389g).m6243i(d.f32373a.m26878a(), this.f32390h);
                return C10775u.f41439a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f32387h = str;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return SessionDatastoreImpl.this.new g(this.f32387h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM39045c = C10855d.m39045c();
            int i2 = this.f32385f;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                InterfaceC0340e interfaceC0340eM26877b = SessionDatastoreImpl.f32362b.m26877b(SessionDatastoreImpl.this.f32364d);
                a aVar = new a(this.f32387h, null);
                this.f32385f = 1;
                if (C0982g.m6263a(interfaceC0340eM26877b, aVar, this) == objM39045c) {
                    return objM39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10568o.m37655b(obj);
            }
            return C10775u.f41439a;
        }
    }

    public SessionDatastoreImpl(Context context, CoroutineContext coroutineContext) {
        C9801m.m32346f(context, "context");
        C9801m.m32346f(coroutineContext, "backgroundDispatcher");
        this.f32364d = context;
        this.f32365e = coroutineContext;
        this.f32366f = new AtomicReference<>();
        this.f32367g = new f(C11078d.m39719a(f32362b.m26877b(context).mo2359b(), new e(null)), this);
        C11008j.m39597b(C11033p0.m39668a(coroutineContext), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public final FirebaseSessionsData m26873i(AbstractC0979d abstractC0979d) {
        return new FirebaseSessionsData((String) abstractC0979d.mo6238b(d.f32373a.m26878a()));
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    /* renamed from: a */
    public String mo26864a() {
        FirebaseSessionsData firebaseSessionsData = this.f32366f.get();
        if (firebaseSessionsData != null) {
            return firebaseSessionsData.getSessionId();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    /* renamed from: b */
    public void mo26865b(String str) {
        C9801m.m32346f(str, "sessionId");
        C11008j.m39597b(C11033p0.m39668a(this.f32365e), null, null, new g(str, null), 3, null);
    }
}
