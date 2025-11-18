package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p024c.p073p.p075b.AbstractC0994a;

/* loaded from: classes2.dex */
public final class zze extends AbstractC0994a<Void> implements SignInConnectionListener {

    /* renamed from: p */
    private Semaphore f17095p;

    /* renamed from: q */
    private Set<GoogleApiClient> f17096q;

    public zze(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.f17095p = new Semaphore(0);
        this.f17096q = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // p024c.p073p.p075b.AbstractC0994a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final Void mo6298B() throws InterruptedException {
        Iterator<GoogleApiClient> it = this.f17096q.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (it.next().mo13880q(this)) {
                i2++;
            }
        }
        try {
            this.f17095p.tryAcquire(i2, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e2) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e2);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    /* renamed from: a */
    public final void mo13725a() {
        this.f17095p.release();
    }

    @Override // p024c.p073p.p075b.C0995b
    /* renamed from: p */
    protected final void mo6322p() {
        this.f17095p.drainPermits();
        m6317i();
    }
}
