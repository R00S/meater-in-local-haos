package com.google.android.gms.common.internal;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public abstract class zzc {

    /* renamed from: a */
    private Object f17847a;

    /* renamed from: b */
    private boolean f17848b = false;

    /* renamed from: c */
    final /* synthetic */ BaseGmsClient f17849c;

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        this.f17849c = baseGmsClient;
        this.f17847a = obj;
    }

    /* renamed from: a */
    protected abstract void mo14402a(Object obj);

    /* renamed from: b */
    protected abstract void mo14403b();

    /* renamed from: c */
    public final void m14503c() {
        Object obj;
        synchronized (this) {
            obj = this.f17847a;
            if (this.f17848b) {
                Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                mo14402a(obj);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        synchronized (this) {
            this.f17848b = true;
        }
        m14505e();
    }

    /* renamed from: d */
    public final void m14504d() {
        synchronized (this) {
            this.f17847a = null;
        }
    }

    /* renamed from: e */
    public final void m14505e() {
        m14504d();
        synchronized (this.f17849c.zzt) {
            this.f17849c.zzt.remove(this);
        }
    }
}
