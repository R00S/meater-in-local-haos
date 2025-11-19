package androidx.media3.database;

import android.database.SQLException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class DatabaseIOException extends IOException {
    public DatabaseIOException(SQLException sQLException) {
        super(sQLException);
    }
}
