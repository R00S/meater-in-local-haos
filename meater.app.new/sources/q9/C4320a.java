package q9;

import C9.h;
import f9.InterfaceC3349c;
import f9.InterfaceC3350d;

/* compiled from: MessagingClientEvent.java */
/* renamed from: q9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4320a {

    /* renamed from: p, reason: collision with root package name */
    private static final C4320a f48119p = new C0670a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f48120a;

    /* renamed from: b, reason: collision with root package name */
    private final String f48121b;

    /* renamed from: c, reason: collision with root package name */
    private final String f48122c;

    /* renamed from: d, reason: collision with root package name */
    private final c f48123d;

    /* renamed from: e, reason: collision with root package name */
    private final d f48124e;

    /* renamed from: f, reason: collision with root package name */
    private final String f48125f;

    /* renamed from: g, reason: collision with root package name */
    private final String f48126g;

    /* renamed from: h, reason: collision with root package name */
    private final int f48127h;

    /* renamed from: i, reason: collision with root package name */
    private final int f48128i;

    /* renamed from: j, reason: collision with root package name */
    private final String f48129j;

    /* renamed from: k, reason: collision with root package name */
    private final long f48130k;

    /* renamed from: l, reason: collision with root package name */
    private final b f48131l;

    /* renamed from: m, reason: collision with root package name */
    private final String f48132m;

    /* renamed from: n, reason: collision with root package name */
    private final long f48133n;

    /* renamed from: o, reason: collision with root package name */
    private final String f48134o;

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: q9.a$a, reason: collision with other inner class name */
    public static final class C0670a {

        /* renamed from: a, reason: collision with root package name */
        private long f48135a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f48136b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f48137c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f48138d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f48139e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f48140f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f48141g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f48142h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f48143i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f48144j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f48145k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f48146l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f48147m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f48148n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f48149o = "";

        C0670a() {
        }

        public C4320a a() {
            return new C4320a(this.f48135a, this.f48136b, this.f48137c, this.f48138d, this.f48139e, this.f48140f, this.f48141g, this.f48142h, this.f48143i, this.f48144j, this.f48145k, this.f48146l, this.f48147m, this.f48148n, this.f48149o);
        }

        public C0670a b(String str) {
            this.f48147m = str;
            return this;
        }

        public C0670a c(String str) {
            this.f48141g = str;
            return this;
        }

        public C0670a d(String str) {
            this.f48149o = str;
            return this;
        }

        public C0670a e(b bVar) {
            this.f48146l = bVar;
            return this;
        }

        public C0670a f(String str) {
            this.f48137c = str;
            return this;
        }

        public C0670a g(String str) {
            this.f48136b = str;
            return this;
        }

        public C0670a h(c cVar) {
            this.f48138d = cVar;
            return this;
        }

        public C0670a i(String str) {
            this.f48140f = str;
            return this;
        }

        public C0670a j(int i10) {
            this.f48142h = i10;
            return this;
        }

        public C0670a k(long j10) {
            this.f48135a = j10;
            return this;
        }

        public C0670a l(d dVar) {
            this.f48139e = dVar;
            return this;
        }

        public C0670a m(String str) {
            this.f48144j = str;
            return this;
        }

        public C0670a n(int i10) {
            this.f48143i = i10;
            return this;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: q9.a$b */
    public enum b implements InterfaceC3349c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* renamed from: B, reason: collision with root package name */
        private final int f48154B;

        b(int i10) {
            this.f48154B = i10;
        }

        @Override // f9.InterfaceC3349c
        public int e() {
            return this.f48154B;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: q9.a$c */
    public enum c implements InterfaceC3349c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* renamed from: B, reason: collision with root package name */
        private final int f48160B;

        c(int i10) {
            this.f48160B = i10;
        }

        @Override // f9.InterfaceC3349c
        public int e() {
            return this.f48160B;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: q9.a$d */
    public enum d implements InterfaceC3349c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* renamed from: B, reason: collision with root package name */
        private final int f48166B;

        d(int i10) {
            this.f48166B = i10;
        }

        @Override // f9.InterfaceC3349c
        public int e() {
            return this.f48166B;
        }
    }

    C4320a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f48120a = j10;
        this.f48121b = str;
        this.f48122c = str2;
        this.f48123d = cVar;
        this.f48124e = dVar;
        this.f48125f = str3;
        this.f48126g = str4;
        this.f48127h = i10;
        this.f48128i = i11;
        this.f48129j = str5;
        this.f48130k = j11;
        this.f48131l = bVar;
        this.f48132m = str6;
        this.f48133n = j12;
        this.f48134o = str7;
    }

    public static C0670a p() {
        return new C0670a();
    }

    @InterfaceC3350d(tag = h.PERF_SESSIONS_FIELD_NUMBER)
    public String a() {
        return this.f48132m;
    }

    @InterfaceC3350d(tag = h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER)
    public long b() {
        return this.f48130k;
    }

    @InterfaceC3350d(tag = 14)
    public long c() {
        return this.f48133n;
    }

    @InterfaceC3350d(tag = 7)
    public String d() {
        return this.f48126g;
    }

    @InterfaceC3350d(tag = 15)
    public String e() {
        return this.f48134o;
    }

    @InterfaceC3350d(tag = h.CUSTOM_ATTRIBUTES_FIELD_NUMBER)
    public b f() {
        return this.f48131l;
    }

    @InterfaceC3350d(tag = 3)
    public String g() {
        return this.f48122c;
    }

    @InterfaceC3350d(tag = 2)
    public String h() {
        return this.f48121b;
    }

    @InterfaceC3350d(tag = 4)
    public c i() {
        return this.f48123d;
    }

    @InterfaceC3350d(tag = 6)
    public String j() {
        return this.f48125f;
    }

    @InterfaceC3350d(tag = 8)
    public int k() {
        return this.f48127h;
    }

    @InterfaceC3350d(tag = 1)
    public long l() {
        return this.f48120a;
    }

    @InterfaceC3350d(tag = 5)
    public d m() {
        return this.f48124e;
    }

    @InterfaceC3350d(tag = h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER)
    public String n() {
        return this.f48129j;
    }

    @InterfaceC3350d(tag = 9)
    public int o() {
        return this.f48128i;
    }
}
