package androidx.media3.datasource;

import X1.C1804a;
import X1.L;
import a2.AbstractC1884a;
import a2.g;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class AssetDataSource extends AbstractC1884a {

    /* renamed from: e, reason: collision with root package name */
    private final AssetManager f26120e;

    /* renamed from: f, reason: collision with root package name */
    private Uri f26121f;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f26122g;

    /* renamed from: h, reason: collision with root package name */
    private long f26123h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f26124i;

    public static final class AssetDataSourceException extends DataSourceException {
        public AssetDataSourceException(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f26120e = context.getAssets();
    }

    @Override // androidx.media3.datasource.a
    public long c(g gVar) throws IOException {
        try {
            Uri uri = gVar.f19983a;
            this.f26121f = uri;
            String strSubstring = (String) C1804a.e(uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            s(gVar);
            InputStream inputStreamOpen = this.f26120e.open(strSubstring, 1);
            this.f26122g = inputStreamOpen;
            if (inputStreamOpen.skip(gVar.f19989g) < gVar.f19989g) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j10 = gVar.f19990h;
            if (j10 != -1) {
                this.f26123h = j10;
            } else {
                long jAvailable = this.f26122g.available();
                this.f26123h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f26123h = -1L;
                }
            }
            this.f26124i = true;
            t(gVar);
            return this.f26123h;
        } catch (AssetDataSourceException e10) {
            throw e10;
        } catch (IOException e11) {
            throw new AssetDataSourceException(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f26121f = null;
        try {
            try {
                InputStream inputStream = this.f26122g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        } finally {
            this.f26122g = null;
            if (this.f26124i) {
                this.f26124i = false;
                r();
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        return this.f26121f;
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f26123h;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new AssetDataSourceException(e10, 2000);
            }
        }
        int i12 = ((InputStream) L.i(this.f26122g)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f26123h;
        if (j11 != -1) {
            this.f26123h = j11 - i12;
        }
        q(i12);
        return i12;
    }
}
