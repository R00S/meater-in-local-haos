package androidx.media3.datasource;

import U1.InterfaceC1734j;
import a2.g;
import a2.n;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: DataSource.java */
/* loaded from: classes.dex */
public interface a extends InterfaceC1734j {

    /* compiled from: DataSource.java */
    /* renamed from: androidx.media3.datasource.a$a, reason: collision with other inner class name */
    public interface InterfaceC0371a {
        a a();
    }

    long c(g gVar);

    void close();

    Uri d();

    void g(n nVar);

    default Map<String, List<String>> l() {
        return Collections.emptyMap();
    }
}
