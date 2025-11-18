package com.google.firebase.sessions;

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
import com.google.firebase.sessions.SessionGenerator;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.time.Duration;
import okhttp3.HttpUrl;

/* compiled from: SessionLifecycleService.kt */
@Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "()V", "handlerThread", "Landroid/os/HandlerThread;", "getHandlerThread$com_google_firebase_firebase_sessions", "()Landroid/os/HandlerThread;", "messageHandler", "Lcom/google/firebase/sessions/SessionLifecycleService$MessageHandler;", "messenger", "Landroid/os/Messenger;", "getClientCallback", "intent", "Landroid/content/Intent;", "onBind", "Landroid/os/IBinder;", "onCreate", HttpUrl.FRAGMENT_ENCODE_SET, "onDestroy", "Companion", "MessageHandler", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* loaded from: classes2.dex */
public final class SessionLifecycleService extends Service {

    /* renamed from: f */
    public static final C8498a f32116f = new C8498a(null);

    /* renamed from: g */
    private final HandlerThread f32117g = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: h */
    private HandlerC8499b f32118h;

    /* renamed from: i */
    private Messenger f32119i;

    /* compiled from: SessionLifecycleService.kt */
    @Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "BACKGROUNDED", HttpUrl.FRAGMENT_ENCODE_SET, "CLIENT_BOUND", "CLIENT_CALLBACK_MESSENGER", HttpUrl.FRAGMENT_ENCODE_SET, "FOREGROUNDED", "SESSION_UPDATED", "SESSION_UPDATE_EXTRA", "TAG", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.SessionLifecycleService$a */
    public static final class C8498a {
        private C8498a() {
        }

        public /* synthetic */ C8498a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: SessionLifecycleService.kt */
    @Metadata(m32266d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService$MessageHandler;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "(Landroid/os/Looper;)V", "boundClients", "Ljava/util/ArrayList;", "Landroid/os/Messenger;", "Lkotlin/collections/ArrayList;", "hasForegrounded", HttpUrl.FRAGMENT_ENCODE_SET, "lastMsgTimeMs", HttpUrl.FRAGMENT_ENCODE_SET, "broadcastSession", HttpUrl.FRAGMENT_ENCODE_SET, "handleBackgrounding", "msg", "Landroid/os/Message;", "handleClientBound", "handleForegrounding", "handleMessage", "isSessionRestart", "foregroundTimeMs", "maybeSendSessionToClient", "client", "newSession", "sendSessionToClient", "sessionId", HttpUrl.FRAGMENT_ENCODE_SET, "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.SessionLifecycleService$b */
    public static final class HandlerC8499b extends Handler {

        /* renamed from: a */
        private boolean f32120a;

        /* renamed from: b */
        private long f32121b;

        /* renamed from: c */
        private final ArrayList<Messenger> f32122c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC8499b(Looper looper) {
            super(looper);
            C9801m.m32346f(looper, "looper");
            this.f32122c = new ArrayList<>();
        }

        /* renamed from: a */
        private final void m26715a() throws RemoteException {
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcasting new session: ");
            SessionGenerator.b bVar = SessionGenerator.f32154a;
            sb.append(bVar.m26742a().m26740c());
            Log.d("SessionLifecycleService", sb.toString());
            SessionFirelogPublisher.f32127a.m26728a().mo26727a(bVar.m26742a().m26740c());
            for (Messenger messenger : new ArrayList(this.f32122c)) {
                C9801m.m32345e(messenger, "it");
                m26720f(messenger);
            }
        }

        /* renamed from: b */
        private final void m26716b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f32121b = message.getWhen();
        }

        /* renamed from: c */
        private final void m26717c(Message message) throws RemoteException {
            this.f32122c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            C9801m.m32345e(messenger, "msg.replyTo");
            m26720f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f32122c.size());
        }

        /* renamed from: d */
        private final void m26718d(Message message) throws RemoteException {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.f32120a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f32120a = true;
                m26721g();
            } else if (m26719e(message.getWhen())) {
                Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                m26721g();
            }
            this.f32121b = message.getWhen();
        }

        /* renamed from: e */
        private final boolean m26719e(long j2) {
            return j2 - this.f32121b > Duration.m37598F(SessionsSettings.f32303a.m26828c().m26822c());
        }

        /* renamed from: f */
        private final void m26720f(Messenger messenger) throws RemoteException {
            if (this.f32120a) {
                m26722h(messenger, SessionGenerator.f32154a.m26742a().m26740c().getSessionId());
                return;
            }
            String strMo26864a = SessionDatastore.f32360a.m26866a().mo26864a();
            Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + strMo26864a);
            if (strMo26864a != null) {
                m26722h(messenger, strMo26864a);
            }
        }

        /* renamed from: g */
        private final void m26721g() throws RemoteException {
            SessionGenerator.b bVar = SessionGenerator.f32154a;
            bVar.m26742a().m26739a();
            Log.d("SessionLifecycleService", "Generated new session " + bVar.m26742a().m26740c().getSessionId());
            m26715a();
            SessionDatastore.f32360a.m26866a().mo26865b(bVar.m26742a().m26740c().getSessionId());
        }

        /* renamed from: h */
        private final void m26722h(Messenger messenger, String str) throws RemoteException {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message messageObtain = Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                messenger.send(messageObtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f32122c.remove(messenger);
            } catch (Exception e2) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e2);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) throws RemoteException {
            C9801m.m32346f(msg, "msg");
            if (this.f32121b > msg.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + msg.getWhen() + " which is older than " + this.f32121b + '.');
                return;
            }
            int i2 = msg.what;
            if (i2 == 1) {
                m26718d(msg);
                return;
            }
            if (i2 == 2) {
                m26716b(msg);
                return;
            }
            if (i2 == 4) {
                m26717c(msg);
                return;
            }
            Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + msg);
            super.handleMessage(msg);
        }
    }

    /* renamed from: a */
    private final Messenger m26714a(Intent intent) {
        return Build.VERSION.SDK_INT >= 33 ? (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger messengerM26714a = m26714a(intent);
        if (messengerM26714a != null) {
            Message messageObtain = Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = messengerM26714a;
            HandlerC8499b handlerC8499b = this.f32118h;
            if (handlerC8499b != null) {
                handlerC8499b.sendMessage(messageObtain);
            }
        }
        Messenger messenger = this.f32119i;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f32117g.start();
        Looper looper = this.f32117g.getLooper();
        C9801m.m32345e(looper, "handlerThread.looper");
        this.f32118h = new HandlerC8499b(looper);
        this.f32119i = new Messenger(this.f32118h);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f32117g.quit();
    }
}
