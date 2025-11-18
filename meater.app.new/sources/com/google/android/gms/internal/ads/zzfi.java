package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class zzfi {

    /* renamed from: a */
    private final zzdy f26081a;

    /* renamed from: b */
    private final String f26082b;

    /* renamed from: c */
    private final String f26083c;

    /* renamed from: f */
    private final Class<?>[] f26086f;

    /* renamed from: d */
    private final int f26084d = 2;

    /* renamed from: e */
    private volatile Method f26085e = null;

    /* renamed from: g */
    private CountDownLatch f26087g = new CountDownLatch(1);

    public zzfi(zzdy zzdyVar, String str, String str2, Class<?>... clsArr) {
        this.f26081a = zzdyVar;
        this.f26082b = str;
        this.f26083c = str2;
        this.f26086f = clsArr;
        zzdyVar.m19908r().submit(new RunnableC7282vy(this));
    }

    /* renamed from: b */
    private final String m19939b(byte[] bArr, String str) throws zzdk, UnsupportedEncodingException {
        return new String(this.f26081a.m19910t().m19543b(bArr, str), "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final void m19940c() {
        try {
            Class clsLoadClass = this.f26081a.m19909s().loadClass(m19939b(this.f26081a.m19911u(), this.f26082b));
            if (clsLoadClass == null) {
                return;
            }
            this.f26085e = clsLoadClass.getMethod(m19939b(this.f26081a.m19911u(), this.f26083c), this.f26086f);
            if (this.f26085e == null) {
            }
        } catch (zzdk unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            this.f26087g.countDown();
        }
    }

    /* renamed from: d */
    public final Method m19941d() {
        if (this.f26085e != null) {
            return this.f26085e;
        }
        try {
            if (this.f26087g.await(2L, TimeUnit.SECONDS)) {
                return this.f26085e;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
