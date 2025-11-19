package a2;

import X1.C1804a;
import android.net.Uri;
import androidx.media3.common.PriorityTaskManager;
import java.util.List;
import java.util.Map;

/* compiled from: PriorityDataSource.java */
/* loaded from: classes.dex */
public final class k implements androidx.media3.datasource.a {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a f20008a;

    /* renamed from: b, reason: collision with root package name */
    private final PriorityTaskManager f20009b;

    /* renamed from: c, reason: collision with root package name */
    private final int f20010c;

    public k(androidx.media3.datasource.a aVar, PriorityTaskManager priorityTaskManager, int i10) {
        this.f20008a = (androidx.media3.datasource.a) C1804a.e(aVar);
        this.f20009b = (PriorityTaskManager) C1804a.e(priorityTaskManager);
        this.f20010c = i10;
    }

    @Override // androidx.media3.datasource.a
    public long c(g gVar) {
        this.f20009b.b(this.f20010c);
        return this.f20008a.c(gVar);
    }

    @Override // androidx.media3.datasource.a
    public void close() {
        this.f20008a.close();
    }

    @Override // androidx.media3.datasource.a
    public Uri d() {
        return this.f20008a.d();
    }

    @Override // U1.InterfaceC1734j
    public int e(byte[] bArr, int i10, int i11) {
        this.f20009b.b(this.f20010c);
        return this.f20008a.e(bArr, i10, i11);
    }

    @Override // androidx.media3.datasource.a
    public void g(n nVar) {
        C1804a.e(nVar);
        this.f20008a.g(nVar);
    }

    @Override // androidx.media3.datasource.a
    public Map<String, List<String>> l() {
        return this.f20008a.l();
    }
}
