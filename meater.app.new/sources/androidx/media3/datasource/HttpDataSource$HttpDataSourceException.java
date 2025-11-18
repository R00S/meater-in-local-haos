package androidx.media3.datasource;

import a2.g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import l8.C3910c;

/* loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* renamed from: C, reason: collision with root package name */
    public final g f26137C;

    /* renamed from: D, reason: collision with root package name */
    public final int f26138D;

    public HttpDataSource$HttpDataSourceException(g gVar, int i10, int i11) {
        super(b(i10, i11));
        this.f26137C = gVar;
        this.f26138D = i11;
    }

    private static int b(int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            return 2001;
        }
        return i10;
    }

    public static HttpDataSource$HttpDataSourceException c(final IOException iOException, final g gVar, int i10) {
        String message = iOException.getMessage();
        int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !C3910c.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i11 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException, gVar) { // from class: androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, gVar, i11, i10);
    }

    public HttpDataSource$HttpDataSourceException(String str, g gVar, int i10, int i11) {
        super(str, b(i10, i11));
        this.f26137C = gVar;
        this.f26138D = i11;
    }

    public HttpDataSource$HttpDataSourceException(IOException iOException, g gVar, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f26137C = gVar;
        this.f26138D = i11;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, g gVar, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f26137C = gVar;
        this.f26138D = i11;
    }
}
