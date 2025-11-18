package S8;

import java.io.File;

/* compiled from: LogFileManager.java */
/* loaded from: classes2.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    private static final b f15538c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final W8.g f15539a;

    /* renamed from: b, reason: collision with root package name */
    private d f15540b;

    public f(W8.g gVar) {
        this.f15539a = gVar;
        this.f15540b = f15538c;
    }

    private File d(String str) {
        return this.f15539a.q(str, "userlog");
    }

    public void a() {
        this.f15540b.d();
    }

    public byte[] b() {
        return this.f15540b.c();
    }

    public String c() {
        return this.f15540b.b();
    }

    public final void e(String str) {
        this.f15540b.a();
        this.f15540b = f15538c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i10) {
        this.f15540b = new i(file, i10);
    }

    public void g(long j10, String str) {
        this.f15540b.e(j10, str);
    }

    public f(W8.g gVar, String str) {
        this(gVar);
        e(str);
    }

    /* compiled from: LogFileManager.java */
    private static final class b implements d {
        private b() {
        }

        @Override // S8.d
        public String b() {
            return null;
        }

        @Override // S8.d
        public byte[] c() {
            return null;
        }

        @Override // S8.d
        public void a() {
        }

        @Override // S8.d
        public void d() {
        }

        @Override // S8.d
        public void e(long j10, String str) {
        }
    }
}
