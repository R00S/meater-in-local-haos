package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.comparisons.C10839b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C11008j;
import kotlinx.coroutines.C11033p0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import okhttp3.HttpUrl;

/* compiled from: SessionLifecycleClient.kt */
@Metadata(m32266d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0010J \u0010\u0015\u001a\u0004\u0018\u00010\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0003J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006#"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient;", HttpUrl.FRAGMENT_ENCODE_SET, "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "queuedMessages", "Ljava/util/concurrent/LinkedBlockingDeque;", "Landroid/os/Message;", "service", "Landroid/os/Messenger;", "serviceBound", HttpUrl.FRAGMENT_ENCODE_SET, "serviceConnection", "com/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1", "Lcom/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1;", "backgrounded", HttpUrl.FRAGMENT_ENCODE_SET, "bindToService", "drainQueue", HttpUrl.FRAGMENT_ENCODE_SET, "foregrounded", "getLatestByCode", "messages", HttpUrl.FRAGMENT_ENCODE_SET, "msgCode", HttpUrl.FRAGMENT_ENCODE_SET, "queueMessage", "msg", "sendLifecycleEvent", "messageCode", "sendLifecycleEvents", "Lkotlinx/coroutines/Job;", "sendMessageToServer", "ClientUpdateHandler", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.f0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class SessionLifecycleClient {

    /* renamed from: a */
    public static final b f32169a = new b(null);

    /* renamed from: b */
    private final CoroutineContext f32170b;

    /* renamed from: c */
    private Messenger f32171c;

    /* renamed from: d */
    private boolean f32172d;

    /* renamed from: e */
    private final LinkedBlockingDeque<Message> f32173e;

    /* renamed from: f */
    private final d f32174f;

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient$ClientUpdateHandler;", "Landroid/os/Handler;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "handleMessage", HttpUrl.FRAGMENT_ENCODE_SET, "msg", "Landroid/os/Message;", "handleSessionUpdate", "sessionId", HttpUrl.FRAGMENT_ENCODE_SET, "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.f0$a */
    public static final class a extends Handler {

        /* renamed from: a */
        private final CoroutineContext f32175a;

        /* compiled from: SessionLifecycleClient.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        @DebugMetadata(m39049c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", m39050f = "SessionLifecycleClient.kt", m39051l = {74}, m39052m = "invokeSuspend")
        /* renamed from: com.google.firebase.sessions.f0$a$a, reason: collision with other inner class name */
        static final class C11516a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {

            /* renamed from: f */
            int f32176f;

            /* renamed from: g */
            final /* synthetic */ String f32177g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11516a(String str, Continuation<? super C11516a> continuation) {
                super(2, continuation);
                this.f32177g = str;
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
                return new C11516a(this.f32177g, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
                return ((C11516a) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM39045c = C10855d.m39045c();
                int i2 = this.f32176f;
                if (i2 == 0) {
                    C10568o.m37655b(obj);
                    FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.f32247a;
                    this.f32176f = 1;
                    obj = firebaseSessionsDependencies.m26792c(this);
                    if (obj == objM39045c) {
                        return objM39045c;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C10568o.m37655b(obj);
                }
                Collection<SessionSubscriber> collectionValues = ((Map) obj).values();
                String str = this.f32177g;
                for (SessionSubscriber sessionSubscriber : collectionValues) {
                    sessionSubscriber.mo25366c(new SessionSubscriber.SessionDetails(str));
                    Log.d("SessionLifecycleClient", "Notified " + sessionSubscriber.mo25365b() + " of new session " + str);
                }
                return C10775u.f41439a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineContext coroutineContext) {
            super(Looper.getMainLooper());
            C9801m.m32346f(coroutineContext, "backgroundDispatcher");
            this.f32175a = coroutineContext;
        }

        /* renamed from: a */
        private final void m26765a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            C11008j.m39597b(C11033p0.m39668a(this.f32175a), null, null, new C11516a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String string;
            C9801m.m32346f(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                m26765a(string);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "MAX_QUEUED_MESSAGES", HttpUrl.FRAGMENT_ENCODE_SET, "TAG", HttpUrl.FRAGMENT_ENCODE_SET, "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.f0$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", m39050f = "SessionLifecycleClient.kt", m39051l = {151}, m39052m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.f0$c */
    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        int f32178f;

        /* renamed from: h */
        final /* synthetic */ List<Message> f32180h;

        /* compiled from: Comparisons.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: com.google.firebase.sessions.f0$c$a */
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C10839b.m39017a(Long.valueOf(((Message) t).getWhen()), Long.valueOf(((Message) t2).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<Message> list, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f32180h = list;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return SessionLifecycleClient.this.new c(this.f32180h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C10853b.m39042c()
                int r1 = r5.f32178f
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.C10568o.m37655b(r6)
                goto L25
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                kotlin.C10568o.m37655b(r6)
                com.google.firebase.sessions.l0.a r6 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f32247a
                r5.f32178f = r2
                java.lang.Object r6 = r6.m26792c(r5)
                if (r6 != r0) goto L25
                return r0
            L25:
                java.util.Map r6 = (java.util.Map) r6
                boolean r0 = r6.isEmpty()
                java.lang.String r1 = "SessionLifecycleClient"
                if (r0 == 0) goto L35
                java.lang.String r6 = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent."
                android.util.Log.d(r1, r6)
                goto La3
            L35:
                java.util.Collection r6 = r6.values()
                boolean r0 = r6 instanceof java.util.Collection
                r3 = 0
                if (r0 == 0) goto L46
                boolean r0 = r6.isEmpty()
                if (r0 == 0) goto L46
            L44:
                r6 = 1
                goto L5d
            L46:
                java.util.Iterator r6 = r6.iterator()
            L4a:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L44
                java.lang.Object r0 = r6.next()
                com.google.firebase.sessions.l0.b r0 = (com.google.firebase.sessions.api.SessionSubscriber) r0
                boolean r0 = r0.mo25364a()
                if (r0 == 0) goto L4a
                r6 = 0
            L5d:
                if (r6 == 0) goto L65
                java.lang.String r6 = "Data Collection is disabled for all subscribers. Skipping this Event"
                android.util.Log.d(r1, r6)
                goto La3
            L65:
                r6 = 2
                android.os.Message[] r0 = new android.os.Message[r6]
                com.google.firebase.sessions.f0 r1 = com.google.firebase.sessions.SessionLifecycleClient.this
                java.util.List<android.os.Message> r4 = r5.f32180h
                android.os.Message r6 = com.google.firebase.sessions.SessionLifecycleClient.m26750b(r1, r4, r6)
                r0[r3] = r6
                com.google.firebase.sessions.f0 r6 = com.google.firebase.sessions.SessionLifecycleClient.this
                java.util.List<android.os.Message> r1 = r5.f32180h
                android.os.Message r6 = com.google.firebase.sessions.SessionLifecycleClient.m26750b(r6, r1, r2)
                r0[r2] = r6
                java.util.List r6 = kotlin.collections.C10813s.m38860p(r0)
                java.util.List r6 = kotlin.collections.C10813s.m38828R(r6)
                com.google.firebase.sessions.f0$c$a r0 = new com.google.firebase.sessions.f0$c$a
                r0.<init>()
                java.util.List r6 = kotlin.collections.C10813s.m38875x0(r6, r0)
                com.google.firebase.sessions.f0 r0 = com.google.firebase.sessions.SessionLifecycleClient.this
                java.util.Iterator r6 = r6.iterator()
            L93:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto La3
                java.lang.Object r1 = r6.next()
                android.os.Message r1 = (android.os.Message) r1
                com.google.firebase.sessions.SessionLifecycleClient.m26753e(r0, r1)
                goto L93
            La3:
                kotlin.u r6 = kotlin.C10775u.f41439a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionLifecycleClient.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(m32266d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, m32267d2 = {"com/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1", "Landroid/content/ServiceConnection;", "onServiceConnected", HttpUrl.FRAGMENT_ENCODE_SET, "className", "Landroid/content/ComponentName;", "serviceBinder", "Landroid/os/IBinder;", "onServiceDisconnected", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.f0$d */
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName className, IBinder serviceBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + SessionLifecycleClient.this.f32173e.size());
            SessionLifecycleClient.this.f32171c = new Messenger(serviceBinder);
            SessionLifecycleClient.this.f32172d = true;
            SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
            sessionLifecycleClient.m26760o(sessionLifecycleClient.m26756j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName className) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            SessionLifecycleClient.this.f32171c = null;
            SessionLifecycleClient.this.f32172d = false;
        }
    }

    public SessionLifecycleClient(CoroutineContext coroutineContext) {
        C9801m.m32346f(coroutineContext, "backgroundDispatcher");
        this.f32170b = coroutineContext;
        this.f32173e = new LinkedBlockingDeque<>(20);
        this.f32174f = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final List<Message> m26756j() {
        ArrayList arrayList = new ArrayList();
        this.f32173e.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final Message m26757l(List<Message> list, int i2) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i2) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    /* renamed from: m */
    private final void m26758m(Message message) {
        if (!this.f32173e.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.f32173e.size());
    }

    /* renamed from: n */
    private final void m26759n(int i2) {
        List<Message> listM26756j = m26756j();
        Message messageObtain = Message.obtain(null, i2, 0, 0);
        C9801m.m32345e(messageObtain, "obtain(null, messageCode, 0, 0)");
        listM26756j.add(messageObtain);
        m26760o(listM26756j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final Job m26760o(List<Message> list) {
        return C11008j.m39597b(C11033p0.m39668a(this.f32170b), null, null, new c(list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m26761p(Message message) throws RemoteException {
        if (this.f32171c == null) {
            m26758m(message);
            return;
        }
        try {
            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
            Messenger messenger = this.f32171c;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException e2) {
            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e2);
            m26758m(message);
        }
    }

    /* renamed from: h */
    public final void m26762h() {
        m26759n(2);
    }

    /* renamed from: i */
    public final void m26763i() {
        SessionLifecycleServiceBinder.f32183a.m26767a().mo26766a(new Messenger(new a(this.f32170b)), this.f32174f);
    }

    /* renamed from: k */
    public final void m26764k() {
        m26759n(1);
    }
}
