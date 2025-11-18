package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zza;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p024c.p041e.C0873g;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
public class Rpc {

    /* renamed from: a */
    private static int f17139a;

    /* renamed from: b */
    private static PendingIntent f17140b;

    /* renamed from: c */
    private static final Executor f17141c = ExecutorC6347v.f17183f;

    /* renamed from: e */
    private final Context f17143e;

    /* renamed from: f */
    private final zzr f17144f;

    /* renamed from: g */
    private final ScheduledExecutorService f17145g;

    /* renamed from: i */
    private Messenger f17147i;

    /* renamed from: j */
    private zza f17148j;

    /* renamed from: d */
    private final C0873g<String, TaskCompletionSource<Bundle>> f17142d = new C0873g<>();

    /* renamed from: h */
    private Messenger f17146h = new Messenger(new HandlerC6346u(this, Looper.getMainLooper()));

    public Rpc(Context context) {
        this.f17143e = context;
        this.f17144f = new zzr(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f17145g = scheduledThreadPoolExecutor;
    }

    /* renamed from: b */
    static final /* synthetic */ Bundle m13752b(Task task) throws Exception {
        if (task.mo23651n()) {
            return (Bundle) task.mo23647j();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(task.mo23646i());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(strValueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.mo23646i());
    }

    /* renamed from: c */
    static final /* synthetic */ Task m13753c(Bundle bundle) throws Exception {
        return m13760l(bundle) ? Tasks.m23663e(null) : Tasks.m23663e(bundle);
    }

    /* renamed from: e */
    private static synchronized String m13754e() {
        int i2;
        i2 = f17139a;
        f17139a = i2 + 1;
        return Integer.toString(i2);
    }

    /* renamed from: f */
    private static synchronized void m13755f(Context context, Intent intent) {
        if (f17140b == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            f17140b = PendingIntent.getBroadcast(context, 0, intent2, 0);
        }
        intent.putExtra("app", f17140b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m13756g(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zza.C11476zza());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zza) {
                        this.f17148j = (zza) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f17147i = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String strValueOf = String.valueOf(action);
                        Log.d("Rpc", strValueOf.length() != 0 ? "Unexpected response action: ".concat(strValueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        m13759j(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String strValueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(strValueOf2.length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(strValueOf2);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (this.f17142d) {
                        for (int i2 = 0; i2 < this.f17142d.size(); i2++) {
                            m13759j(this.f17142d.m5473j(i2), intent2.getExtras());
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !"ID".equals(strArrSplit[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                m13759j(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* renamed from: i */
    static final /* synthetic */ void m13758i(TaskCompletionSource taskCompletionSource) {
        if (taskCompletionSource.m23657d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }

    /* renamed from: j */
    private final void m13759j(String str, Bundle bundle) {
        synchronized (this.f17142d) {
            TaskCompletionSource<Bundle> taskCompletionSourceRemove = this.f17142d.remove(str);
            if (taskCompletionSourceRemove != null) {
                taskCompletionSourceRemove.m23656c(bundle);
            } else {
                String strValueOf = String.valueOf(str);
                Log.w("Rpc", strValueOf.length() != 0 ? "Missing callback for ".concat(strValueOf) : new String("Missing callback for "));
            }
        }
    }

    /* renamed from: l */
    private static boolean m13760l(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    /* renamed from: m */
    private final Task<Bundle> m13761m(Bundle bundle) throws RemoteException {
        final String strM13754e = m13754e();
        final TaskCompletionSource<Bundle> taskCompletionSource = new TaskCompletionSource<>();
        synchronized (this.f17142d) {
            this.f17142d.put(strM13754e, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f17144f.m13789a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        m13755f(this.f17143e, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(strM13754e).length() + 5);
        sb.append("|ID|");
        sb.append(strM13754e);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String strValueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(strValueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f17146h);
        if (this.f17147i != null || this.f17148j != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f17147i;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f17148j.m13780b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.f17144f.m13789a() == 2) {
            this.f17143e.sendBroadcast(intent);
        } else {
            this.f17143e.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f17145g.schedule(new Runnable(taskCompletionSource) { // from class: com.google.android.gms.cloudmessaging.p

            /* renamed from: f */
            private final TaskCompletionSource f17175f;

            {
                this.f17175f = taskCompletionSource;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Rpc.m13758i(this.f17175f);
            }
        }, 30L, TimeUnit.SECONDS);
        taskCompletionSource.m23654a().mo23640c(f17141c, new OnCompleteListener(this, strM13754e, scheduledFutureSchedule) { // from class: com.google.android.gms.cloudmessaging.t

            /* renamed from: a */
            private final Rpc f17179a;

            /* renamed from: b */
            private final String f17180b;

            /* renamed from: c */
            private final ScheduledFuture f17181c;

            {
                this.f17179a = this;
                this.f17180b = strM13754e;
                this.f17181c = scheduledFutureSchedule;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            /* renamed from: a */
            public final void mo7019a(Task task) {
                this.f17179a.m13764k(this.f17180b, this.f17181c, task);
            }
        });
        return taskCompletionSource.m23654a();
    }

    /* renamed from: a */
    public Task<Bundle> m13762a(final Bundle bundle) {
        if (this.f17144f.m13790c() >= 12000000) {
            return zze.m13783c(this.f17143e).m13787f(1, bundle).mo23644g(f17141c, C6341o.f17174a);
        }
        return !(this.f17144f.m13789a() != 0) ? Tasks.m23662d(new IOException("MISSING_INSTANCEID_SERVICE")) : m13761m(bundle).mo23645h(f17141c, new Continuation(this, bundle) { // from class: com.google.android.gms.cloudmessaging.q

            /* renamed from: a */
            private final Rpc f17176a;

            /* renamed from: b */
            private final Bundle f17177b;

            {
                this.f17176a = this;
                this.f17177b = bundle;
            }

            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: a */
            public final Object mo13777a(Task task) {
                return this.f17176a.m13763d(this.f17177b, task);
            }
        });
    }

    /* renamed from: d */
    final /* synthetic */ Task m13763d(Bundle bundle, Task task) throws Exception {
        return (task.mo23651n() && m13760l((Bundle) task.mo23647j())) ? m13761m(bundle).mo23653p(f17141c, C6344s.f17178a) : task;
    }

    /* renamed from: k */
    final /* synthetic */ void m13764k(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f17142d) {
            this.f17142d.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
