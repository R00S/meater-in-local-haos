package a2;

import X1.C1804a;
import X1.L;
import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: DataSchemeDataSource.java */
/* renamed from: a2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1886c extends AbstractC1884a {

    /* renamed from: e, reason: collision with root package name */
    private g f19973e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f19974f;

    /* renamed from: g, reason: collision with root package name */
    private int f19975g;

    /* renamed from: h, reason: collision with root package name */
    private int f19976h;

    public C1886c() {
        super(false);
    }

    @Override // androidx.media3.datasource.a
    public long c(g gVar) throws ParserException, DataSourceException {
        s(gVar);
        this.f19973e = gVar;
        Uri uriNormalizeScheme = gVar.f19983a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        C1804a.b("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrL1 = L.l1(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrL1.length != 2) {
            throw ParserException.b("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrL1[1];
        if (strArrL1[0].contains(";base64")) {
            try {
                this.f19974f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw ParserException.b("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f19974f = L.t0(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j10 = gVar.f19989g;
        byte[] bArr = this.f19974f;
        if (j10 > bArr.length) {
            this.f19974f = null;
            throw new DataSourceException(2008);
        }
        int i10 = (int) j10;
        this.f19975g = i10;
        int length = bArr.length - i10;
        this.f19976h = length;
        long j11 = gVar.f19990h;
        if (j11 != -1) {
            this.f19976h = (int) Math.min(length, j11);
        }
        t(gVar);
        long j12 = gVar.f19990h;
        return j12 != -1 ? j12 : this.f19976h;
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        if (this.f19974f != null) {
            this.f19974f = null;
            r();
        }
        this.f19973e = null;
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        g gVar = this.f19973e;
        if (gVar != null) {
            return gVar.f19983a;
        }
        return null;
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f19976h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(L.i(this.f19974f), this.f19975g, bArr, i10, iMin);
        this.f19975g += iMin;
        this.f19976h -= iMin;
        q(iMin);
        return iMin;
    }
}
