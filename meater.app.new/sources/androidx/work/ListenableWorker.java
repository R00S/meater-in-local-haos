package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.p017o.C0798c;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p241e.p254e.p288c.p289a.p290a.InterfaceFutureC8955a;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class AbstractC0698a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class a extends AbstractC0698a {

            /* renamed from: a */
            private final C0706e f4444a;

            public a() {
                this(C0706e.f4511b);
            }

            /* renamed from: e */
            public C0706e m4768e() {
                return this.f4444a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || a.class != obj.getClass()) {
                    return false;
                }
                return this.f4444a.equals(((a) obj).f4444a);
            }

            public int hashCode() {
                return (a.class.getName().hashCode() * 31) + this.f4444a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f4444a + '}';
            }

            public a(C0706e c0706e) {
                this.f4444a = c0706e;
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class b extends AbstractC0698a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class c extends AbstractC0698a {

            /* renamed from: a */
            private final C0706e f4445a;

            public c() {
                this(C0706e.f4511b);
            }

            /* renamed from: e */
            public C0706e m4769e() {
                return this.f4445a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f4445a.equals(((c) obj).f4445a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f4445a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f4445a + '}';
            }

            public c(C0706e c0706e) {
                this.f4445a = c0706e;
            }
        }

        AbstractC0698a() {
        }

        /* renamed from: a */
        public static AbstractC0698a m4764a() {
            return new a();
        }

        /* renamed from: b */
        public static AbstractC0698a m4765b() {
            return new b();
        }

        /* renamed from: c */
        public static AbstractC0698a m4766c() {
            return new c();
        }

        /* renamed from: d */
        public static AbstractC0698a m4767d(C0706e c0706e) {
            return new c(c0706e);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.m4770a();
    }

    public InterfaceFutureC8955a<C0709h> getForegroundInfoAsync() {
        C0798c c0798cM5203u = C0798c.m5203u();
        c0798cM5203u.mo5194r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c0798cM5203u;
    }

    public final UUID getId() {
        return this.mWorkerParams.m4772c();
    }

    public final C0706e getInputData() {
        return this.mWorkerParams.m4773d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.m4774e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.m4776g();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.m4777h();
    }

    public InterfaceC0799a getTaskExecutor() {
        return this.mWorkerParams.m4778i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.m4779j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.m4780k();
    }

    public AbstractC0702a0 getWorkerFactory() {
        return this.mWorkerParams.m4781l();
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final InterfaceFutureC8955a<Void> setForegroundAsync(C0709h c0709h) {
        this.mRunInForeground = true;
        return this.mWorkerParams.m4771b().mo4844a(getApplicationContext(), getId(), c0709h);
    }

    public InterfaceFutureC8955a<Void> setProgressAsync(C0706e c0706e) {
        return this.mWorkerParams.m4775f().mo5173a(getApplicationContext(), getId(), c0706e);
    }

    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract InterfaceFutureC8955a<AbstractC0698a> startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
