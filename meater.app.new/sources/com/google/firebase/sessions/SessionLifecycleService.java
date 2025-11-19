package com.google.firebase.sessions;

import K9.f;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.sessions.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SessionLifecycleService.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0007\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0003R\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/Messenger;", "a", "(Landroid/content/Intent;)Landroid/os/Messenger;", "Loa/F;", "onCreate", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onDestroy", "Landroid/os/HandlerThread;", "B", "Landroid/os/HandlerThread;", "getHandlerThread$com_google_firebase_firebase_sessions", "()Landroid/os/HandlerThread;", "handlerThread", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "C", "Lcom/google/firebase/sessions/SessionLifecycleService$b;", "messageHandler", "D", "Landroid/os/Messenger;", "messenger", "E", "b", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final HandlerThread handlerThread = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private b messageHandler;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private Messenger messenger;

    /* compiled from: SessionLifecycleService.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\nR\u0016\u0010\u001f\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0016\u0010!\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R$\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00100\"j\b\u0012\u0004\u0012\u00020\u0010`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$¨\u0006&"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService$b;", "Landroid/os/Handler;", "Landroid/os/Looper;", "looper", "<init>", "(Landroid/os/Looper;)V", "Landroid/os/Message;", "msg", "Loa/F;", "d", "(Landroid/os/Message;)V", "b", "c", "g", "()V", "a", "Landroid/os/Messenger;", "client", "f", "(Landroid/os/Messenger;)V", "", "sessionId", "h", "(Landroid/os/Messenger;Ljava/lang/String;)V", "", "foregroundTimeMs", "", "e", "(J)Z", "handleMessage", "Z", "hasForegrounded", "J", "lastMsgTimeMs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "boundClients", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean hasForegrounded;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private long lastMsgTimeMs;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ArrayList<Messenger> boundClients;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper) {
            super(looper);
            C3862t.g(looper, "looper");
            this.boundClients = new ArrayList<>();
        }

        private final void a() throws RemoteException {
            Log.d("SessionLifecycleService", "Broadcasting new session");
            com.google.firebase.sessions.b.INSTANCE.a().a(c.INSTANCE.a().c());
            for (Messenger it : new ArrayList(this.boundClients)) {
                C3862t.f(it, "it");
                f(it);
            }
        }

        private final void b(Message msg) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + msg.getWhen());
            this.lastMsgTimeMs = msg.getWhen();
        }

        private final void c(Message msg) throws RemoteException {
            this.boundClients.add(msg.replyTo);
            Messenger messenger = msg.replyTo;
            C3862t.f(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + msg.replyTo + " bound at " + msg.getWhen() + ". Clients: " + this.boundClients.size());
        }

        private final void d(Message msg) throws RemoteException {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + msg.getWhen() + '.');
            if (!this.hasForegrounded) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.hasForegrounded = true;
                g();
            } else if (e(msg.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                g();
            }
            this.lastMsgTimeMs = msg.getWhen();
        }

        private final boolean e(long foregroundTimeMs) {
            return foregroundTimeMs - this.lastMsgTimeMs > Vb.a.D(f.INSTANCE.c().c());
        }

        private final void f(Messenger client) throws RemoteException {
            if (this.hasForegrounded) {
                h(client, c.INSTANCE.a().c().getSessionId());
                return;
            }
            String strA = a.INSTANCE.a().a();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session.");
            if (strA != null) {
                h(client, strA);
            }
        }

        private final void g() throws RemoteException {
            c.Companion companion = c.INSTANCE;
            companion.a().a();
            Log.d("SessionLifecycleService", "Generated new session.");
            a();
            a.INSTANCE.a().b(companion.a().c().getSessionId());
        }

        private final void h(Messenger client, String sessionId) throws RemoteException {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", sessionId);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                client.send(messageObtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + client);
                this.boundClients.remove(client);
            } catch (Exception e10) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + client + '.', e10);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) throws RemoteException {
            C3862t.g(msg, "msg");
            if (this.lastMsgTimeMs > msg.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.lastMsgTimeMs + '.');
                return;
            }
            int i10 = msg.what;
            if (i10 == 1) {
                d(msg);
                return;
            }
            if (i10 == 2) {
                b(msg);
                return;
            }
            if (i10 == 4) {
                c(msg);
                return;
            }
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
            super.handleMessage(msg);
        }
    }

    private final Messenger a(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messengerA = a(intent);
        if (messengerA != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messengerA;
            b bVar = this.messageHandler;
            if (bVar != null) {
                bVar.sendMessage(messageObtain);
            }
        }
        Messenger messenger = this.messenger;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.handlerThread.start();
        Looper looper = this.handlerThread.getLooper();
        C3862t.f(looper, "handlerThread.looper");
        this.messageHandler = new b(looper);
        this.messenger = new Messenger(this.messageHandler);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }
}
