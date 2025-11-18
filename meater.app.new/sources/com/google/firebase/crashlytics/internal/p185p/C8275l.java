package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* renamed from: com.google.firebase.crashlytics.h.p.l */
/* loaded from: classes2.dex */
final class C8275l extends AbstractC8258f0.e.d {

    /* renamed from: a */
    private final long f31419a;

    /* renamed from: b */
    private final String f31420b;

    /* renamed from: c */
    private final AbstractC8258f0.e.d.a f31421c;

    /* renamed from: d */
    private final AbstractC8258f0.e.d.c f31422d;

    /* renamed from: e */
    private final AbstractC8258f0.e.d.AbstractC11513d f31423e;

    /* renamed from: f */
    private final AbstractC8258f0.e.d.f f31424f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.l$b */
    static final class b extends AbstractC8258f0.e.d.b {

        /* renamed from: a */
        private Long f31425a;

        /* renamed from: b */
        private String f31426b;

        /* renamed from: c */
        private AbstractC8258f0.e.d.a f31427c;

        /* renamed from: d */
        private AbstractC8258f0.e.d.c f31428d;

        /* renamed from: e */
        private AbstractC8258f0.e.d.AbstractC11513d f31429e;

        /* renamed from: f */
        private AbstractC8258f0.e.d.f f31430f;

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.b
        /* renamed from: a */
        public AbstractC8258f0.e.d mo25848a() {
            Long l = this.f31425a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (l == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " timestamp";
            }
            if (this.f31426b == null) {
                str = str + " type";
            }
            if (this.f31427c == null) {
                str = str + " app";
            }
            if (this.f31428d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C8275l(this.f31425a.longValue(), this.f31426b, this.f31427c, this.f31428d, this.f31429e, this.f31430f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.b
        /* renamed from: b */
        public AbstractC8258f0.e.d.b mo25849b(AbstractC8258f0.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f31427c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.b
        /* renamed from: c */
        public AbstractC8258f0.e.d.b mo25850c(AbstractC8258f0.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f31428d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.b
        /* renamed from: d */
        public AbstractC8258f0.e.d.b mo25851d(AbstractC8258f0.e.d.AbstractC11513d abstractC11513d) {
            this.f31429e = abstractC11513d;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.b
        /* renamed from: e */
        public AbstractC8258f0.e.d.b mo25852e(AbstractC8258f0.e.d.f fVar) {
            this.f31430f = fVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.b
        /* renamed from: f */
        public AbstractC8258f0.e.d.b mo25853f(long j2) {
            this.f31425a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.b
        /* renamed from: g */
        public AbstractC8258f0.e.d.b mo25854g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f31426b = str;
            return this;
        }

        b() {
        }

        private b(AbstractC8258f0.e.d dVar) {
            this.f31425a = Long.valueOf(dVar.mo25754f());
            this.f31426b = dVar.mo25755g();
            this.f31427c = dVar.mo25750b();
            this.f31428d = dVar.mo25751c();
            this.f31429e = dVar.mo25752d();
            this.f31430f = dVar.mo25753e();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d
    /* renamed from: b */
    public AbstractC8258f0.e.d.a mo25750b() {
        return this.f31421c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d
    /* renamed from: c */
    public AbstractC8258f0.e.d.c mo25751c() {
        return this.f31422d;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d
    /* renamed from: d */
    public AbstractC8258f0.e.d.AbstractC11513d mo25752d() {
        return this.f31423e;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d
    /* renamed from: e */
    public AbstractC8258f0.e.d.f mo25753e() {
        return this.f31424f;
    }

    public boolean equals(Object obj) {
        AbstractC8258f0.e.d.AbstractC11513d abstractC11513d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.d)) {
            return false;
        }
        AbstractC8258f0.e.d dVar = (AbstractC8258f0.e.d) obj;
        if (this.f31419a == dVar.mo25754f() && this.f31420b.equals(dVar.mo25755g()) && this.f31421c.equals(dVar.mo25750b()) && this.f31422d.equals(dVar.mo25751c()) && ((abstractC11513d = this.f31423e) != null ? abstractC11513d.equals(dVar.mo25752d()) : dVar.mo25752d() == null)) {
            AbstractC8258f0.e.d.f fVar = this.f31424f;
            if (fVar == null) {
                if (dVar.mo25753e() == null) {
                    return true;
                }
            } else if (fVar.equals(dVar.mo25753e())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d
    /* renamed from: f */
    public long mo25754f() {
        return this.f31419a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d
    /* renamed from: g */
    public String mo25755g() {
        return this.f31420b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d
    /* renamed from: h */
    public AbstractC8258f0.e.d.b mo25756h() {
        return new b(this);
    }

    public int hashCode() {
        long j2 = this.f31419a;
        int iHashCode = (((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.f31420b.hashCode()) * 1000003) ^ this.f31421c.hashCode()) * 1000003) ^ this.f31422d.hashCode()) * 1000003;
        AbstractC8258f0.e.d.AbstractC11513d abstractC11513d = this.f31423e;
        int iHashCode2 = (iHashCode ^ (abstractC11513d == null ? 0 : abstractC11513d.hashCode())) * 1000003;
        AbstractC8258f0.e.d.f fVar = this.f31424f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f31419a + ", type=" + this.f31420b + ", app=" + this.f31421c + ", device=" + this.f31422d + ", log=" + this.f31423e + ", rollouts=" + this.f31424f + "}";
    }

    private C8275l(long j2, String str, AbstractC8258f0.e.d.a aVar, AbstractC8258f0.e.d.c cVar, AbstractC8258f0.e.d.AbstractC11513d abstractC11513d, AbstractC8258f0.e.d.f fVar) {
        this.f31419a = j2;
        this.f31420b = str;
        this.f31421c = aVar;
        this.f31422d = cVar;
        this.f31423e = abstractC11513d;
        this.f31424f = fVar;
    }
}
