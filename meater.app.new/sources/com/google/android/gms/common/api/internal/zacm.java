package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class zacm<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {

    /* renamed from: a */
    private ResultTransform<? super R, ? extends Result> f17567a;

    /* renamed from: b */
    private zacm<? extends Result> f17568b;

    /* renamed from: c */
    private volatile ResultCallbacks<? super R> f17569c;

    /* renamed from: d */
    private final Object f17570d;

    /* renamed from: e */
    private Status f17571e;

    /* renamed from: f */
    private final WeakReference<GoogleApiClient> f17572f;

    /* renamed from: g */
    private final HandlerC6373i0 f17573g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m14195c(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).mo13849c();
            } catch (RuntimeException e2) {
                String strValueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                Log.w("TransformedResultImpl", sb.toString(), e2);
            }
        }
    }

    /* renamed from: e */
    private final boolean m14196e() {
        return (this.f17569c == null || this.f17572f.get() == null) ? false : true;
    }

    /* renamed from: h */
    private final void m14199h(Status status) {
        synchronized (this.f17570d) {
            this.f17571e = status;
            m14201j(status);
        }
    }

    /* renamed from: j */
    private final void m14201j(Status status) {
        synchronized (this.f17570d) {
            ResultTransform<? super R, ? extends Result> resultTransform = this.f17567a;
            if (resultTransform != null) {
                Status statusM13910a = resultTransform.m13910a(status);
                Preconditions.m14373l(statusM13910a, "onFailure must not return null");
                this.f17568b.m14199h(statusM13910a);
            } else if (m14196e()) {
                this.f17569c.mo13904b(status);
            }
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    /* renamed from: a */
    public final void mo13908a(R r) {
        synchronized (this.f17570d) {
            if (!r.getStatus().m13915e0()) {
                m14199h(r.getStatus());
                m14195c(r);
            } else if (this.f17567a != null) {
                zacc.m14187a().submit(new RunnableC6371h0(this, r));
            } else if (m14196e()) {
                this.f17569c.m13909c(r);
            }
        }
    }

    /* renamed from: d */
    final void m14202d() {
        this.f17569c = null;
    }
}
