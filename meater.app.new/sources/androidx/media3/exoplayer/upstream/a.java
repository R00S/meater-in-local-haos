package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import com.apptionlabs.meater_app.data.Config;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: DefaultLoadErrorHandlingPolicy.java */
/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final int f27859a;

    public a() {
        this(-1);
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public long a(b.c cVar) {
        IOException iOException = cVar.f27868c;
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader.UnexpectedLoaderException) || DataSourceException.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f27869d - 1) * 1000, 5000);
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public int c(int i10) {
        int i11 = this.f27859a;
        return i11 == -1 ? i10 == 7 ? 6 : 3 : i11;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public b.C0381b d(b.a aVar, b.c cVar) {
        if (!e(cVar.f27868c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new b.C0381b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new b.C0381b(2, Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX);
        }
        return null;
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
            return false;
        }
        int i10 = ((HttpDataSource$InvalidResponseCodeException) iOException).f26140E;
        return i10 == 403 || i10 == 404 || i10 == 410 || i10 == 416 || i10 == 500 || i10 == 503;
    }

    public a(int i10) {
        this.f27859a = i10;
    }
}
