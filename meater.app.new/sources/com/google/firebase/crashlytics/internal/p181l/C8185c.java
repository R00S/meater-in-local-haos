package com.google.firebase.crashlytics.internal.p181l;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.C8179h;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingAnalyticsEventLogger.java */
/* renamed from: com.google.firebase.crashlytics.h.l.c */
/* loaded from: classes2.dex */
public class C8185c implements InterfaceC8184b, InterfaceC8183a {

    /* renamed from: a */
    private final C8187e f30865a;

    /* renamed from: b */
    private final int f30866b;

    /* renamed from: c */
    private final TimeUnit f30867c;

    /* renamed from: e */
    private CountDownLatch f30869e;

    /* renamed from: d */
    private final Object f30868d = new Object();

    /* renamed from: f */
    private boolean f30870f = false;

    public C8185c(C8187e c8187e, int i2, TimeUnit timeUnit) {
        this.f30865a = c8187e;
        this.f30866b = i2;
        this.f30867c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.p181l.InterfaceC8184b
    /* renamed from: J0 */
    public void mo25195J0(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f30869e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p181l.InterfaceC8183a
    /* renamed from: a */
    public void mo25135a(String str, Bundle bundle) {
        synchronized (this.f30868d) {
            C8179h.m25176f().m25183i("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f30869e = new CountDownLatch(1);
            this.f30870f = false;
            this.f30865a.mo25135a(str, bundle);
            C8179h.m25176f().m25183i("Awaiting app exception callback from Analytics...");
            try {
                if (this.f30869e.await(this.f30866b, this.f30867c)) {
                    this.f30870f = true;
                    C8179h.m25176f().m25183i("App exception callback received from Analytics listener.");
                } else {
                    C8179h.m25176f().m25185k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                C8179h.m25176f().m25179d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f30869e = null;
        }
    }
}
