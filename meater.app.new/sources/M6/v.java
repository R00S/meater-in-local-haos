package M6;

import U6.InterfaceC1742d;
import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: TransportRuntimeComponent.java */
/* loaded from: classes2.dex */
abstract class v implements Closeable {

    /* compiled from: TransportRuntimeComponent.java */
    interface a {
        v e();

        a f(Context context);
    }

    v() {
    }

    abstract InterfaceC1742d a();

    abstract u b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
