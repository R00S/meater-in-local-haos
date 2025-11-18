package p241e.p307h.p308a.p311g0;

import java.net.ProtocolException;
import p241e.p307h.p308a.p309e0.InterfaceC9001b;
import p241e.p307h.p308a.p315k0.C9035e;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: ConnectionProfile.java */
/* renamed from: e.h.a.g0.b */
/* loaded from: classes2.dex */
public class C9012b {

    /* renamed from: a */
    final long f34674a;

    /* renamed from: b */
    final long f34675b;

    /* renamed from: c */
    final long f34676c;

    /* renamed from: d */
    final long f34677d;

    /* renamed from: e */
    private final boolean f34678e;

    /* renamed from: f */
    private final boolean f34679f;

    /* compiled from: ConnectionProfile.java */
    /* renamed from: e.h.a.g0.b$b */
    public static class b {
        /* renamed from: a */
        public static C9012b m28781a(long j2) {
            return new C9012b(0L, 0L, -1L, j2);
        }

        /* renamed from: b */
        public static C9012b m28782b(long j2, long j3, long j4, long j5) {
            return new C9012b(j2, j3, j4, j5);
        }

        /* renamed from: c */
        public static C9012b m28783c(long j2, long j3, long j4) {
            return new C9012b(j2, j3, -1L, j4);
        }

        /* renamed from: d */
        public static C9012b m28784d() {
            return new C9012b();
        }

        /* renamed from: e */
        public static C9012b m28785e() {
            return new C9012b(0L, 0L, 0L, 0L, true);
        }
    }

    /* renamed from: a */
    public void m28780a(InterfaceC9001b interfaceC9001b) throws ProtocolException {
        if (this.f34678e) {
            return;
        }
        if (this.f34679f && C9035e.m28971a().f34827h) {
            interfaceC9001b.mo27917h("HEAD");
        }
        interfaceC9001b.mo27915f("Range", this.f34676c == -1 ? C9036f.m29009o("bytes=%d-", Long.valueOf(this.f34675b)) : C9036f.m29009o("bytes=%d-%d", Long.valueOf(this.f34675b), Long.valueOf(this.f34676c)));
    }

    public String toString() {
        return C9036f.m29009o("range[%d, %d) current offset[%d]", Long.valueOf(this.f34674a), Long.valueOf(this.f34676c), Long.valueOf(this.f34675b));
    }

    private C9012b() {
        this.f34674a = 0L;
        this.f34675b = 0L;
        this.f34676c = 0L;
        this.f34677d = 0L;
        this.f34678e = false;
        this.f34679f = true;
    }

    private C9012b(long j2, long j3, long j4, long j5) {
        this(j2, j3, j4, j5, false);
    }

    private C9012b(long j2, long j3, long j4, long j5, boolean z) {
        if ((j2 == 0 && j4 == 0) || !z) {
            this.f34674a = j2;
            this.f34675b = j3;
            this.f34676c = j4;
            this.f34677d = j5;
            this.f34678e = z;
            this.f34679f = false;
            return;
        }
        throw new IllegalArgumentException();
    }
}
