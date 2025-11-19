package androidx.media3.datasource;

import java.io.IOException;

/* loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* renamed from: B, reason: collision with root package name */
    public final int f26131B;

    public DataSourceException(int i10) {
        this.f26131B = i10;
    }

    public static boolean a(IOException iOException) {
        for (IOException cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f26131B == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(Throwable th, int i10) {
        super(th);
        this.f26131B = i10;
    }

    public DataSourceException(String str, int i10) {
        super(str);
        this.f26131B = i10;
    }

    public DataSourceException(String str, Throwable th, int i10) {
        super(str, th);
        this.f26131B = i10;
    }
}
