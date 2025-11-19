package I9;

import J9.b;
import Xb.C1841i;
import Xb.InterfaceC1867v0;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ra.C4370a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SessionLifecycleClient.kt */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u00010\b\u0000\u0018\u0000 42\u00020\u0001:\u0002\"%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\b¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"LI9/D;", "", "Lta/g;", "backgroundDispatcher", "<init>", "(Lta/g;)V", "", "messageCode", "Loa/F;", "n", "(I)V", "", "Landroid/os/Message;", "messages", "LXb/v0;", "o", "(Ljava/util/List;)LXb/v0;", "msg", "p", "(Landroid/os/Message;)V", "m", "", "j", "()Ljava/util/List;", "msgCode", "l", "(Ljava/util/List;I)Landroid/os/Message;", "LI9/F;", "sessionLifecycleServiceBinder", "i", "(LI9/F;)V", "k", "()V", "h", "a", "Lta/g;", "Landroid/os/Messenger;", "b", "Landroid/os/Messenger;", "service", "", "c", "Z", "serviceBound", "Ljava/util/concurrent/LinkedBlockingDeque;", "d", "Ljava/util/concurrent/LinkedBlockingDeque;", "queuedMessages", "I9/D$d", "e", "LI9/D$d;", "serviceConnection", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ta.g backgroundDispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Messenger service;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean serviceBound;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LinkedBlockingDeque<Message> queuedMessages;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d serviceConnection;

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"LI9/D$a;", "Landroid/os/Handler;", "Lta/g;", "backgroundDispatcher", "<init>", "(Lta/g;)V", "", "sessionId", "Loa/F;", "a", "(Ljava/lang/String;)V", "Landroid/os/Message;", "msg", "handleMessage", "(Landroid/os/Message;)V", "Lta/g;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Handler {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ta.g backgroundDispatcher;

        /* compiled from: SessionLifecycleClient.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f = "SessionLifecycleClient.kt", l = {74}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I9.D$a$a, reason: collision with other inner class name */
        static final class C0137a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f6791B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ String f6792C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0137a(String str, InterfaceC4588d<? super C0137a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f6792C = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0137a(this.f6792C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0137a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f6791B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    J9.a aVar = J9.a.f7640a;
                    this.f6791B = 1;
                    obj = aVar.c(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                Collection<J9.b> collectionValues = ((Map) obj).values();
                String str = this.f6792C;
                for (J9.b bVar : collectionValues) {
                    bVar.a(new b.SessionDetails(str));
                    Log.d("SessionLifecycleClient", "Notified " + bVar.c() + " of new session " + str);
                }
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ta.g backgroundDispatcher) {
            super(Looper.getMainLooper());
            C3862t.g(backgroundDispatcher, "backgroundDispatcher");
            this.backgroundDispatcher = backgroundDispatcher;
        }

        private final void a(String sessionId) {
            Log.d("SessionLifecycleClient", "Session update received.");
            C1841i.d(Xb.J.a(this.backgroundDispatcher), null, null, new C0137a(sessionId, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String string;
            C3862t.g(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                if (data == null || (string = data.getString("SessionUpdateExtra")) == null) {
                    string = "";
                }
                a(string);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", l = {151}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6793B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ List<Message> f6795D;

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return C4370a.d(Long.valueOf(((Message) t10).getWhen()), Long.valueOf(((Message) t11).getWhen()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<Message> list, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6795D = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return D.this.new c(this.f6795D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws RemoteException {
            Object objE = C4696b.e();
            int i10 = this.f6793B;
            if (i10 == 0) {
                C4173r.b(obj);
                J9.a aVar = J9.a.f7640a;
                this.f6793B = 1;
                obj = aVar.c(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Collection collectionValues = map.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                } else {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((J9.b) it.next()).b()) {
                            List listO0 = kotlin.collections.r.O0(kotlin.collections.r.g0(kotlin.collections.r.s(D.this.l(this.f6795D, 2), D.this.l(this.f6795D, 1))), new a());
                            D d10 = D.this;
                            Iterator it2 = listO0.iterator();
                            while (it2.hasNext()) {
                                d10.p((Message) it2.next());
                            }
                        }
                    }
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                }
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"I9/D$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "className", "Landroid/os/IBinder;", "serviceBinder", "Loa/F;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName className, IBinder serviceBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + D.this.queuedMessages.size());
            D.this.service = new Messenger(serviceBinder);
            D.this.serviceBound = true;
            D d10 = D.this;
            d10.o(d10.j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName className) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            D.this.service = null;
            D.this.serviceBound = false;
        }
    }

    public D(ta.g backgroundDispatcher) {
        C3862t.g(backgroundDispatcher, "backgroundDispatcher");
        this.backgroundDispatcher = backgroundDispatcher;
        this.queuedMessages = new LinkedBlockingDeque<>(20);
        this.serviceConnection = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Message> j() {
        ArrayList arrayList = new ArrayList();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Message l(List<Message> messages, int msgCode) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : messages) {
            if (((Message) obj2).what == msgCode) {
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

    private final void m(Message msg) {
        if (!this.queuedMessages.offer(msg)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + msg.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + msg.what + ". Queue size " + this.queuedMessages.size());
    }

    private final void n(int messageCode) {
        List<Message> listJ = j();
        Message messageObtain = Message.obtain(null, messageCode, 0, 0);
        C3862t.f(messageObtain, "obtain(null, messageCode, 0, 0)");
        listJ.add(messageObtain);
        o(listJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1867v0 o(List<Message> messages) {
        return C1841i.d(Xb.J.a(this.backgroundDispatcher), null, null, new c(messages, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Message msg) throws RemoteException {
        if (this.service == null) {
            m(msg);
            return;
        }
        try {
            Log.d("SessionLifecycleClient", "Sending lifecycle " + msg.what + " to service");
            Messenger messenger = this.service;
            if (messenger != null) {
                messenger.send(msg);
            }
        } catch (RemoteException e10) {
            Log.w("SessionLifecycleClient", "Unable to deliver message: " + msg.what, e10);
            m(msg);
        }
    }

    public final void h() {
        n(2);
    }

    public final void i(F sessionLifecycleServiceBinder) {
        C3862t.g(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.a(new Messenger(new a(this.backgroundDispatcher)), this.serviceConnection);
    }

    public final void k() {
        n(1);
    }
}
