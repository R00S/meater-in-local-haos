package q6;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import k6.C3800a;
import m6.InterfaceC3970e;
import q6.InterfaceC4316a;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes2.dex */
public class e implements InterfaceC4316a {

    /* renamed from: b, reason: collision with root package name */
    private final File f48089b;

    /* renamed from: c, reason: collision with root package name */
    private final long f48090c;

    /* renamed from: e, reason: collision with root package name */
    private C3800a f48092e;

    /* renamed from: d, reason: collision with root package name */
    private final c f48091d = new c();

    /* renamed from: a, reason: collision with root package name */
    private final j f48088a = new j();

    @Deprecated
    protected e(File file, long j10) {
        this.f48089b = file;
        this.f48090c = j10;
    }

    public static InterfaceC4316a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized C3800a d() {
        try {
            if (this.f48092e == null) {
                this.f48092e = C3800a.x(this.f48089b, 1, 1, this.f48090c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f48092e;
    }

    @Override // q6.InterfaceC4316a
    public void a(InterfaceC3970e interfaceC3970e, InterfaceC4316a.b bVar) {
        C3800a c3800aD;
        String strB = this.f48088a.b(interfaceC3970e);
        this.f48091d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + interfaceC3970e);
            }
            try {
                c3800aD = d();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            if (c3800aD.t(strB) != null) {
                return;
            }
            C3800a.c cVarP = c3800aD.p(strB);
            if (cVarP == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + strB);
            }
            try {
                if (bVar.a(cVarP.f(0))) {
                    cVarP.e();
                }
                cVarP.b();
            } catch (Throwable th) {
                cVarP.b();
                throw th;
            }
        } finally {
            this.f48091d.b(strB);
        }
    }

    @Override // q6.InterfaceC4316a
    public File b(InterfaceC3970e interfaceC3970e) {
        String strB = this.f48088a.b(interfaceC3970e);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + interfaceC3970e);
        }
        try {
            C3800a.e eVarT = d().t(strB);
            if (eVarT != null) {
                return eVarT.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }
}
