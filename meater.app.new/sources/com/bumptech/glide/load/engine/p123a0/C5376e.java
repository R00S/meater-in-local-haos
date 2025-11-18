package com.bumptech.glide.load.engine.p123a0;

import android.util.Log;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5372a;
import com.bumptech.glide.p121k.C5357a;
import java.io.File;
import java.io.IOException;

/* compiled from: DiskLruCacheWrapper.java */
/* renamed from: com.bumptech.glide.load.engine.a0.e */
/* loaded from: classes.dex */
public class C5376e implements InterfaceC5372a {

    /* renamed from: b */
    private final File f13261b;

    /* renamed from: c */
    private final long f13262c;

    /* renamed from: e */
    private C5357a f13264e;

    /* renamed from: d */
    private final C5374c f13263d = new C5374c();

    /* renamed from: a */
    private final C5381j f13260a = new C5381j();

    @Deprecated
    protected C5376e(File file, long j2) {
        this.f13261b = file;
        this.f13262c = j2;
    }

    /* renamed from: c */
    public static InterfaceC5372a m10188c(File file, long j2) {
        return new C5376e(file, j2);
    }

    /* renamed from: d */
    private synchronized C5357a m10189d() throws IOException {
        if (this.f13264e == null) {
            this.f13264e = C5357a.m10054D(this.f13261b, 1, 1, this.f13262c);
        }
        return this.f13264e;
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5372a
    /* renamed from: a */
    public void mo10179a(InterfaceC5423f interfaceC5423f, InterfaceC5372a.b bVar) {
        C5357a c5357aM10189d;
        String strM10210b = this.f13260a.m10210b(interfaceC5423f);
        this.f13263d.m10183a(strM10210b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM10210b + " for for Key: " + interfaceC5423f);
            }
            try {
                c5357aM10189d = m10189d();
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
            if (c5357aM10189d.m10073A(strM10210b) != null) {
                return;
            }
            C5357a.c cVarM10076y = c5357aM10189d.m10076y(strM10210b);
            if (cVarM10076y == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + strM10210b);
            }
            try {
                if (bVar.mo10182a(cVarM10076y.m10083f(0))) {
                    cVarM10076y.m10082e();
                }
                cVarM10076y.m10081b();
            } catch (Throwable th) {
                cVarM10076y.m10081b();
                throw th;
            }
        } finally {
            this.f13263d.m10184b(strM10210b);
        }
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5372a
    /* renamed from: b */
    public File mo10180b(InterfaceC5423f interfaceC5423f) {
        String strM10210b = this.f13260a.m10210b(interfaceC5423f);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM10210b + " for for Key: " + interfaceC5423f);
        }
        try {
            C5357a.e eVarM10073A = m10189d().m10073A(strM10210b);
            if (eVarM10073A != null) {
                return eVarM10073A.m10098a(0);
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }
}
