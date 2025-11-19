package a2;

import X1.C1804a;
import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: TeeDataSource.java */
/* loaded from: classes.dex */
public final class m implements androidx.media3.datasource.a {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f20015a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1887d f20016b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20017c;

    /* renamed from: d, reason: collision with root package name */
    private long f20018d;

    public m(androidx.media3.datasource.a aVar, InterfaceC1887d interfaceC1887d) {
        this.f20015a = (androidx.media3.datasource.a) C1804a.e(aVar);
        this.f20016b = (InterfaceC1887d) C1804a.e(interfaceC1887d);
    }

    @Override // androidx.media3.datasource.a
    public long c(g gVar) {
        long jC = this.f20015a.c(gVar);
        this.f20018d = jC;
        if (jC == 0) {
            return 0L;
        }
        if (gVar.f19990h == -1 && jC != -1) {
            gVar = gVar.f(0L, jC);
        }
        this.f20017c = true;
        this.f20016b.c(gVar);
        return this.f20018d;
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        try {
            this.f20015a.close();
        } finally {
            if (this.f20017c) {
                this.f20017c = false;
                this.f20016b.close();
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        return this.f20015a.d();
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) {
        if (this.f20018d == 0) {
            return -1;
        }
        int iE = this.f20015a.e(bArr, i10, i11);
        if (iE > 0) {
            this.f20016b.v(bArr, i10, iE);
            long j10 = this.f20018d;
            if (j10 != -1) {
                this.f20018d = j10 - iE;
            }
        }
        return iE;
    }

    @Override // androidx.media3.datasource.a
    public void g(n nVar) {
        C1804a.e(nVar);
        this.f20015a.g(nVar);
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> l() {
        return this.f20015a.l();
    }
}
