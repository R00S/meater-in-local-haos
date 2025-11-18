package a2;

import X1.C1804a;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: StatsDataSource.java */
/* loaded from: classes.dex */
public final class l implements androidx.media3.datasource.a {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f20011a;

    /* renamed from: b, reason: collision with root package name */
    private long f20012b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f20013c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f20014d = Collections.emptyMap();

    public l(androidx.media3.datasource.a aVar) {
        this.f20011a = (androidx.media3.datasource.a) C1804a.e(aVar);
    }

    @Override // androidx.media3.datasource.a
    public long c(g gVar) {
        this.f20013c = gVar.f19983a;
        this.f20014d = Collections.emptyMap();
        try {
            return this.f20011a.c(gVar);
        } finally {
            Uri uriD = d();
            if (uriD != null) {
                this.f20013c = uriD;
            }
            this.f20014d = l();
        }
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f20011a.close();
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        return this.f20011a.d();
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) {
        int iE = this.f20011a.e(bArr, i10, i11);
        if (iE != -1) {
            this.f20012b += iE;
        }
        return iE;
    }

    @Override // androidx.media3.datasource.a
    public void g(n nVar) {
        C1804a.e(nVar);
        this.f20011a.g(nVar);
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> l() {
        return this.f20011a.l();
    }

    public long q() {
        return this.f20012b;
    }

    public Uri r() {
        return this.f20013c;
    }

    public Map<String, List<String>> s() {
        return this.f20014d;
    }

    public void t() {
        this.f20012b = 0L;
    }
}
