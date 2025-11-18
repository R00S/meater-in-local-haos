package androidx.media3.exoplayer.source;

import X1.C1804a;
import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: IcyDataSource.java */
/* loaded from: classes.dex */
final class n implements androidx.media3.datasource.a {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f27785a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27786b;

    /* renamed from: c, reason: collision with root package name */
    private final a f27787c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f27788d;

    /* renamed from: e, reason: collision with root package name */
    private int f27789e;

    /* compiled from: IcyDataSource.java */
    public interface a {
        void c(X1.y yVar);
    }

    public n(androidx.media3.datasource.a aVar, int i10, a aVar2) {
        C1804a.a(i10 > 0);
        this.f27785a = aVar;
        this.f27786b = i10;
        this.f27787c = aVar2;
        this.f27788d = new byte[1];
        this.f27789e = i10;
    }

    private boolean q() {
        if (this.f27785a.e(this.f27788d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f27788d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int iE = this.f27785a.e(bArr, i12, i11);
            if (iE == -1) {
                return false;
            }
            i12 += iE;
            i11 -= iE;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f27787c.c(new X1.y(bArr, i10));
        }
        return true;
    }

    @Override // androidx.media3.datasource.a
    public long c(a2.g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        return this.f27785a.d();
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) {
        if (this.f27789e == 0) {
            if (!q()) {
                return -1;
            }
            this.f27789e = this.f27786b;
        }
        int iE = this.f27785a.e(bArr, i10, Math.min(this.f27789e, i11));
        if (iE != -1) {
            this.f27789e -= iE;
        }
        return iE;
    }

    @Override // androidx.media3.datasource.a
    public void g(a2.n nVar) {
        C1804a.e(nVar);
        this.f27785a.g(nVar);
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> l() {
        return this.f27785a.l();
    }
}
