package b7;

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
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q7.C4317a;
import s.X;
import z7.AbstractC5208j;
import z7.C5209k;
import z7.C5211m;
import z7.InterfaceC5201c;
import z7.InterfaceC5203e;
import z7.InterfaceC5207i;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* renamed from: b7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2253c {

    /* renamed from: h, reason: collision with root package name */
    private static int f30639h;

    /* renamed from: i, reason: collision with root package name */
    private static PendingIntent f30640i;

    /* renamed from: j, reason: collision with root package name */
    private static final Executor f30641j = new Executor() { // from class: b7.t
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f30642k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    private final Context f30644b;

    /* renamed from: c, reason: collision with root package name */
    private final C2268r f30645c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f30646d;

    /* renamed from: f, reason: collision with root package name */
    private Messenger f30648f;

    /* renamed from: g, reason: collision with root package name */
    private C2262l f30649g;

    /* renamed from: a, reason: collision with root package name */
    private final X f30643a = new X();

    /* renamed from: e, reason: collision with root package name */
    private final Messenger f30647e = new Messenger(new HandlerC2259i(this, Looper.getMainLooper()));

    public C2253c(Context context) {
        this.f30644b = context;
        this.f30645c = new C2268r(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f30646d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ AbstractC5208j e(Bundle bundle) {
        return m(bundle) ? C5211m.e(null) : C5211m.e(bundle);
    }

    static /* bridge */ /* synthetic */ void g(C2253c c2253c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C2261k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C2262l) {
                        c2253c.f30649g = (C2262l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c2253c.f30648f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f30642k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c2253c.l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c2253c.f30643a) {
                        for (int i10 = 0; i10 < c2253c.f30643a.getSize(); i10++) {
                            try {
                                c2253c.l((String) c2253c.f30643a.h(i10), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                c2253c.l(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final AbstractC5208j i(Bundle bundle) throws RemoteException {
        final String strJ = j();
        final C5209k c5209k = new C5209k();
        synchronized (this.f30643a) {
            this.f30643a.put(strJ, c5209k);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f30645c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f30644b, intent);
        intent.putExtra("kid", "|ID|" + strJ + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f30647e);
        if (this.f30648f != null || this.f30649g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f30648f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f30649g.b(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
        } else if (this.f30645c.b() == 2) {
            this.f30644b.sendBroadcast(intent);
        } else {
            this.f30644b.startService(intent);
        }
        final ScheduledFuture<?> scheduledFutureSchedule = this.f30646d.schedule(new Runnable() { // from class: b7.g
            @Override // java.lang.Runnable
            public final void run() {
                if (c5209k.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c5209k.a().b(f30641j, new InterfaceC5203e() { // from class: b7.h
            @Override // z7.InterfaceC5203e
            public final void a(AbstractC5208j abstractC5208j) {
                this.f30653a.h(strJ, scheduledFutureSchedule, abstractC5208j);
            }
        });
        return c5209k.a();
    }

    private static synchronized String j() {
        int i10;
        i10 = f30639h;
        f30639h = i10 + 1;
        return Integer.toString(i10);
    }

    private static synchronized void k(Context context, Intent intent) {
        try {
            if (f30640i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f30640i = PendingIntent.getBroadcast(context, 0, intent2, C4317a.f48115a);
            }
            intent.putExtra("app", f30640i);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f30643a) {
            try {
                C5209k c5209k = (C5209k) this.f30643a.remove(str);
                if (c5209k != null) {
                    c5209k.c(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public AbstractC5208j<C2251a> a() {
        return this.f30645c.a() >= 241100000 ? com.google.android.gms.cloudmessaging.l.b(this.f30644b).d(5, Bundle.EMPTY).h(f30641j, new InterfaceC5201c() { // from class: b7.f
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j) {
                Intent intent = (Intent) ((Bundle) abstractC5208j.k()).getParcelable("notification_data");
                if (intent != null) {
                    return new C2251a(intent);
                }
                return null;
            }
        }) : C5211m.d(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public AbstractC5208j<Void> b(C2251a c2251a) {
        if (this.f30645c.a() < 233700000) {
            return C5211m.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", c2251a.h0());
        Integer numR0 = c2251a.r0();
        if (numR0 != null) {
            bundle.putInt("google.product_id", numR0.intValue());
        }
        return com.google.android.gms.cloudmessaging.l.b(this.f30644b).c(3, bundle);
    }

    public AbstractC5208j<Bundle> c(final Bundle bundle) {
        return this.f30645c.a() < 12000000 ? this.f30645c.b() != 0 ? i(bundle).i(f30641j, new InterfaceC5201c() { // from class: b7.u
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j) {
                return this.f30673a.f(bundle, abstractC5208j);
            }
        }) : C5211m.d(new IOException("MISSING_INSTANCEID_SERVICE")) : com.google.android.gms.cloudmessaging.l.b(this.f30644b).d(1, bundle).h(f30641j, new InterfaceC5201c() { // from class: b7.e
            @Override // z7.InterfaceC5201c
            public final Object a(AbstractC5208j abstractC5208j) throws IOException {
                if (abstractC5208j.o()) {
                    return (Bundle) abstractC5208j.k();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(abstractC5208j.j())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", abstractC5208j.j());
            }
        });
    }

    public AbstractC5208j<Void> d(boolean z10) {
        if (this.f30645c.a() < 241100000) {
            return C5211m.d(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return com.google.android.gms.cloudmessaging.l.b(this.f30644b).c(4, bundle);
    }

    final /* synthetic */ AbstractC5208j f(Bundle bundle, AbstractC5208j abstractC5208j) {
        return (abstractC5208j.o() && m((Bundle) abstractC5208j.k())) ? i(bundle).p(f30641j, new InterfaceC5207i() { // from class: b7.s
            @Override // z7.InterfaceC5207i
            public final AbstractC5208j a(Object obj) {
                return C2253c.e((Bundle) obj);
            }
        }) : abstractC5208j;
    }

    final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, AbstractC5208j abstractC5208j) {
        synchronized (this.f30643a) {
            this.f30643a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
