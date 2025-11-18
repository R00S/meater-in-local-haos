package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class zal extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: g */
    protected volatile boolean f17600g;

    /* renamed from: h */
    protected final AtomicReference<C6383n0> f17601h;

    /* renamed from: i */
    private final Handler f17602i;

    /* renamed from: j */
    protected final GoogleApiAvailability f17603j;

    protected zal(LifecycleFragment lifecycleFragment) {
        this(lifecycleFragment, GoogleApiAvailability.m13803q());
    }

    /* renamed from: k */
    private static int m14216k(C6383n0 c6383n0) {
        if (c6383n0 == null) {
            return -1;
        }
        return c6383n0.m14071b();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: d */
    public void mo14033d(int i2, int i3, Intent intent) {
        C6383n0 c6383n0 = this.f17601h.get();
        if (i2 != 1) {
            if (i2 != 2) {
                z = false;
            } else {
                int iMo13812i = this.f17603j.mo13812i(m14032b());
                z = iMo13812i == 0;
                if (c6383n0 == null) {
                    return;
                }
                if (c6383n0.m14070a().m13797y() == 18 && iMo13812i == 18) {
                    return;
                }
            }
        } else if (i3 != -1) {
            if (i3 == 0) {
                C6383n0 c6383n02 = new C6383n0(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null), m14216k(c6383n0));
                this.f17601h.set(c6383n02);
                c6383n0 = c6383n02;
            }
            z = false;
        }
        if (z) {
            m14218o();
        } else if (c6383n0 != null) {
            mo14115l(c6383n0.m14070a(), c6383n0.m14071b());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: e */
    public void mo14034e(Bundle bundle) {
        super.mo14034e(bundle);
        if (bundle != null) {
            this.f17601h.set(bundle.getBoolean("resolving_error", false) ? new C6383n0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: h */
    public void mo14037h(Bundle bundle) {
        super.mo14037h(bundle);
        C6383n0 c6383n0 = this.f17601h.get();
        if (c6383n0 != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", c6383n0.m14071b());
            bundle.putInt("failed_status", c6383n0.m14070a().m13797y());
            bundle.putParcelable("failed_resolution", c6383n0.m14070a().m13793W());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: i */
    public void mo14038i() {
        super.mo14038i();
        this.f17600g = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* renamed from: j */
    public void mo14039j() {
        super.mo14039j();
        this.f17600g = false;
    }

    /* renamed from: l */
    protected abstract void mo14115l(ConnectionResult connectionResult, int i2);

    /* renamed from: m */
    public final void m14217m(ConnectionResult connectionResult, int i2) {
        C6383n0 c6383n0 = new C6383n0(connectionResult, i2);
        if (this.f17601h.compareAndSet(null, c6383n0)) {
            this.f17602i.post(new RunnableC6385o0(this, c6383n0));
        }
    }

    /* renamed from: n */
    protected abstract void mo14116n();

    /* renamed from: o */
    protected final void m14218o() {
        this.f17601h.set(null);
        mo14116n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        mo14115l(new ConnectionResult(13, null), m14216k(this.f17601h.get()));
        m14218o();
    }

    @VisibleForTesting
    private zal(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.f17601h = new AtomicReference<>(null);
        this.f17602i = new zap(Looper.getMainLooper());
        this.f17603j = googleApiAvailability;
    }
}
