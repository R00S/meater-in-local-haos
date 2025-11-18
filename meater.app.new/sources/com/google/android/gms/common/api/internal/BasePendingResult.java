package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
@KeepName
/* loaded from: classes2.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {

    /* renamed from: a */
    static final ThreadLocal<Boolean> f17311a = new C6389q0();

    /* renamed from: b */
    private final Object f17312b;

    /* renamed from: c */
    private final CallbackHandler<R> f17313c;

    /* renamed from: d */
    private final WeakReference<GoogleApiClient> f17314d;

    /* renamed from: e */
    private final CountDownLatch f17315e;

    /* renamed from: f */
    private final ArrayList<PendingResult.StatusListener> f17316f;

    /* renamed from: g */
    private ResultCallback<? super R> f17317g;

    /* renamed from: h */
    private final AtomicReference<InterfaceC6379l0> f17318h;

    /* renamed from: i */
    private R f17319i;

    /* renamed from: j */
    private Status f17320j;

    /* renamed from: k */
    private volatile boolean f17321k;

    /* renamed from: l */
    private boolean f17322l;

    /* renamed from: m */
    private boolean f17323m;

    @KeepName
    private C6353a mResultGuardian;

    /* renamed from: n */
    private ICancelToken f17324n;

    /* renamed from: o */
    private volatile zacm<R> f17325o;

    /* renamed from: p */
    private boolean f17326p;

    @VisibleForTesting
    public static class CallbackHandler<R extends Result> extends zap {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        /* renamed from: a */
        public final void m13945a(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 == 2) {
                    ((BasePendingResult) message.obj).m13942p(Status.f17294j);
                    return;
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            ResultCallback resultCallback = (ResultCallback) pair.first;
            Result result = (Result) pair.second;
            try {
                resultCallback.mo13908a(result);
            } catch (RuntimeException e2) {
                BasePendingResult.m13938o(result);
                throw e2;
            }
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    private final class C6353a {
        private C6353a() {
        }

        protected final void finalize() throws Throwable {
            BasePendingResult.m13938o(BasePendingResult.this.f17319i);
            super.finalize();
        }

        /* synthetic */ C6353a(BasePendingResult basePendingResult, C6389q0 c6389q0) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f17312b = new Object();
        this.f17315e = new CountDownLatch(1);
        this.f17316f = new ArrayList<>();
        this.f17318h = new AtomicReference<>();
        this.f17326p = false;
        this.f17313c = new CallbackHandler<>(Looper.getMainLooper());
        this.f17314d = new WeakReference<>(null);
    }

    /* renamed from: i */
    private final R m13935i() {
        R r;
        synchronized (this.f17312b) {
            Preconditions.m14376o(!this.f17321k, "Result has already been consumed.");
            Preconditions.m14376o(m13939j(), "Result is not ready.");
            r = this.f17319i;
            this.f17319i = null;
            this.f17317g = null;
            this.f17321k = true;
        }
        InterfaceC6379l0 andSet = this.f17318h.getAndSet(null);
        if (andSet != null) {
            andSet.mo14063a(this);
        }
        return r;
    }

    /* renamed from: m */
    private final void m13937m(R r) {
        this.f17319i = r;
        C6389q0 c6389q0 = null;
        this.f17324n = null;
        this.f17315e.countDown();
        this.f17320j = this.f17319i.getStatus();
        if (this.f17322l) {
            this.f17317g = null;
        } else if (this.f17317g != null) {
            this.f17313c.removeMessages(2);
            this.f17313c.m13945a(this.f17317g, m13935i());
        } else if (this.f17319i instanceof Releasable) {
            this.mResultGuardian = new C6353a(this, c6389q0);
        }
        ArrayList<PendingResult.StatusListener> arrayList = this.f17316f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            PendingResult.StatusListener statusListener = arrayList.get(i2);
            i2++;
            statusListener.mo13901a(this.f17320j);
        }
        this.f17316f.clear();
    }

    /* renamed from: o */
    public static void m13938o(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).mo13849c();
            } catch (RuntimeException e2) {
                String strValueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    /* renamed from: b */
    public final void mo13896b(PendingResult.StatusListener statusListener) {
        Preconditions.m14363b(statusListener != null, "Callback cannot be null.");
        synchronized (this.f17312b) {
            if (m13939j()) {
                statusListener.mo13901a(this.f17320j);
            } else {
                this.f17316f.add(statusListener);
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    /* renamed from: c */
    public final R mo13897c(long j2, TimeUnit timeUnit) {
        if (j2 > 0) {
            Preconditions.m14371j("await must not be called on the UI thread when time is greater than zero.");
        }
        Preconditions.m14376o(!this.f17321k, "Result has already been consumed.");
        Preconditions.m14376o(this.f17325o == null, "Cannot await if then() has been called.");
        try {
            if (!this.f17315e.await(j2, timeUnit)) {
                m13942p(Status.f17294j);
            }
        } catch (InterruptedException unused) {
            m13942p(Status.f17292h);
        }
        Preconditions.m14376o(m13939j(), "Result is not ready.");
        return (R) m13935i();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    /* renamed from: d */
    public void mo13846d() {
        synchronized (this.f17312b) {
            if (!this.f17322l && !this.f17321k) {
                ICancelToken iCancelToken = this.f17324n;
                if (iCancelToken != null) {
                    try {
                        iCancelToken.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                m13938o(this.f17319i);
                this.f17322l = true;
                m13937m(mo13718h(Status.f17295k));
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    /* renamed from: e */
    public boolean mo13898e() {
        boolean z;
        synchronized (this.f17312b) {
            z = this.f17322l;
        }
        return z;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    /* renamed from: f */
    public final void mo13899f(ResultCallback<? super R> resultCallback) {
        synchronized (this.f17312b) {
            if (resultCallback == null) {
                this.f17317g = null;
                return;
            }
            boolean z = true;
            Preconditions.m14376o(!this.f17321k, "Result has already been consumed.");
            if (this.f17325o != null) {
                z = false;
            }
            Preconditions.m14376o(z, "Cannot set callbacks if then() has been called.");
            if (mo13898e()) {
                return;
            }
            if (m13939j()) {
                this.f17313c.m13945a(resultCallback, m13935i());
            } else {
                this.f17317g = resultCallback;
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    /* renamed from: g */
    public final Integer mo13900g() {
        return null;
    }

    @KeepForSdk
    /* renamed from: h */
    protected abstract R mo13718h(Status status);

    @KeepForSdk
    /* renamed from: j */
    public final boolean m13939j() {
        return this.f17315e.getCount() == 0;
    }

    @KeepForSdk
    /* renamed from: k */
    public final void m13940k(R r) {
        synchronized (this.f17312b) {
            if (this.f17323m || this.f17322l) {
                m13938o(r);
                return;
            }
            m13939j();
            boolean z = true;
            Preconditions.m14376o(!m13939j(), "Results have already been set");
            if (this.f17321k) {
                z = false;
            }
            Preconditions.m14376o(z, "Result has already been consumed");
            m13937m(r);
        }
    }

    /* renamed from: n */
    public final void m13941n(InterfaceC6379l0 interfaceC6379l0) {
        this.f17318h.set(interfaceC6379l0);
    }

    /* renamed from: p */
    public final void m13942p(Status status) {
        synchronized (this.f17312b) {
            if (!m13939j()) {
                m13940k(mo13718h(status));
                this.f17323m = true;
            }
        }
    }

    /* renamed from: q */
    public final boolean m13943q() {
        boolean zMo13898e;
        synchronized (this.f17312b) {
            if (this.f17314d.get() == null || !this.f17326p) {
                mo13846d();
            }
            zMo13898e = mo13898e();
        }
        return zMo13898e;
    }

    /* renamed from: r */
    public final void m13944r() {
        this.f17326p = this.f17326p || f17311a.get().booleanValue();
    }

    @KeepForSdk
    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.f17312b = new Object();
        this.f17315e = new CountDownLatch(1);
        this.f17316f = new ArrayList<>();
        this.f17318h = new AtomicReference<>();
        this.f17326p = false;
        this.f17313c = new CallbackHandler<>(googleApiClient != null ? googleApiClient.mo13878o() : Looper.getMainLooper());
        this.f17314d = new WeakReference<>(googleApiClient);
    }
}
