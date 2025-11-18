package p241e.p254e.p256b.p257a.p258i.p266y.p267a;

import com.google.firebase.encoders.p194i.InterfaceC8343e;
import com.google.firebase.encoders.p194i.InterfaceC8344f;

/* compiled from: LogEventDropped.java */
/* renamed from: e.e.b.a.i.y.a.c */
/* loaded from: classes2.dex */
public final class C8887c {

    /* renamed from: a */
    private static final C8887c f33644a = new a().m28208a();

    /* renamed from: b */
    private final long f33645b;

    /* renamed from: c */
    private final b f33646c;

    /* compiled from: LogEventDropped.java */
    /* renamed from: e.e.b.a.i.y.a.c$a */
    public static final class a {

        /* renamed from: a */
        private long f33647a = 0;

        /* renamed from: b */
        private b f33648b = b.REASON_UNKNOWN;

        a() {
        }

        /* renamed from: a */
        public C8887c m28208a() {
            return new C8887c(this.f33647a, this.f33648b);
        }

        /* renamed from: b */
        public a m28209b(long j2) {
            this.f33647a = j2;
            return this;
        }

        /* renamed from: c */
        public a m28210c(b bVar) {
            this.f33648b = bVar;
            return this;
        }
    }

    /* compiled from: LogEventDropped.java */
    /* renamed from: e.e.b.a.i.y.a.c$b */
    public enum b implements InterfaceC8343e {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: n */
        private final int f33657n;

        b(int i2) {
            this.f33657n = i2;
        }

        @Override // com.google.firebase.encoders.p194i.InterfaceC8343e
        /* renamed from: f */
        public int mo26129f() {
            return this.f33657n;
        }
    }

    C8887c(long j2, b bVar) {
        this.f33645b = j2;
        this.f33646c = bVar;
    }

    /* renamed from: c */
    public static a m28205c() {
        return new a();
    }

    @InterfaceC8344f(tag = 1)
    /* renamed from: a */
    public long m28206a() {
        return this.f33645b;
    }

    @InterfaceC8344f(tag = 3)
    /* renamed from: b */
    public b m28207b() {
        return this.f33646c;
    }
}
