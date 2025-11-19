package androidx.media3.datasource;

import a2.g;
import a2.n;
import android.net.Uri;
import androidx.media3.datasource.a;
import java.io.IOException;

/* compiled from: PlaceholderDataSource.java */
/* loaded from: classes.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f26289a = new f();

    /* renamed from: b, reason: collision with root package name */
    public static final a.InterfaceC0371a f26290b = new a.InterfaceC0371a() { // from class: a2.j
        @Override // androidx.media3.datasource.a.InterfaceC0371a
        public final androidx.media3.datasource.a a() {
            return androidx.media3.datasource.f.q();
        }
    };

    private f() {
    }

    public static /* synthetic */ f q() {
        return new f();
    }

    @Override // androidx.media3.datasource.a
    public long c(g gVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        return null;
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.datasource.a
    public void close() {
    }

    @Override // androidx.media3.datasource.a
    public void g(n nVar) {
    }
}
