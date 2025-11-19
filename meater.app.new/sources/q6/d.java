package q6;

import java.io.File;
import q6.InterfaceC4316a;

/* compiled from: DiskLruCacheFactory.java */
/* loaded from: classes2.dex */
public class d implements InterfaceC4316a.InterfaceC0669a {

    /* renamed from: a, reason: collision with root package name */
    private final long f48086a;

    /* renamed from: b, reason: collision with root package name */
    private final a f48087b;

    /* compiled from: DiskLruCacheFactory.java */
    public interface a {
        File a();
    }

    public d(a aVar, long j10) {
        this.f48086a = j10;
        this.f48087b = aVar;
    }

    @Override // q6.InterfaceC4316a.InterfaceC0669a
    public InterfaceC4316a e() {
        File fileA = this.f48087b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.isDirectory() || fileA.mkdirs()) {
            return e.c(fileA, this.f48086a);
        }
        return null;
    }
}
