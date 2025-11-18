package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* renamed from: com.google.firebase.crashlytics.h.p.u */
/* loaded from: classes2.dex */
final class C8284u extends AbstractC8258f0.e.d.c {

    /* renamed from: a */
    private final Double f31503a;

    /* renamed from: b */
    private final int f31504b;

    /* renamed from: c */
    private final boolean f31505c;

    /* renamed from: d */
    private final int f31506d;

    /* renamed from: e */
    private final long f31507e;

    /* renamed from: f */
    private final long f31508f;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.u$b */
    static final class b extends AbstractC8258f0.e.d.c.a {

        /* renamed from: a */
        private Double f31509a;

        /* renamed from: b */
        private Integer f31510b;

        /* renamed from: c */
        private Boolean f31511c;

        /* renamed from: d */
        private Integer f31512d;

        /* renamed from: e */
        private Long f31513e;

        /* renamed from: f */
        private Long f31514f;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c.a
        /* renamed from: a */
        public AbstractC8258f0.e.d.c mo25862a() {
            Integer num = this.f31510b;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (num == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " batteryVelocity";
            }
            if (this.f31511c == null) {
                str = str + " proximityOn";
            }
            if (this.f31512d == null) {
                str = str + " orientation";
            }
            if (this.f31513e == null) {
                str = str + " ramUsed";
            }
            if (this.f31514f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C8284u(this.f31509a, this.f31510b.intValue(), this.f31511c.booleanValue(), this.f31512d.intValue(), this.f31513e.longValue(), this.f31514f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c.a
        /* renamed from: b */
        public AbstractC8258f0.e.d.c.a mo25863b(Double d2) {
            this.f31509a = d2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c.a
        /* renamed from: c */
        public AbstractC8258f0.e.d.c.a mo25864c(int i2) {
            this.f31510b = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c.a
        /* renamed from: d */
        public AbstractC8258f0.e.d.c.a mo25865d(long j2) {
            this.f31514f = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c.a
        /* renamed from: e */
        public AbstractC8258f0.e.d.c.a mo25866e(int i2) {
            this.f31512d = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c.a
        /* renamed from: f */
        public AbstractC8258f0.e.d.c.a mo25867f(boolean z) {
            this.f31511c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c.a
        /* renamed from: g */
        public AbstractC8258f0.e.d.c.a mo25868g(long j2) {
            this.f31513e = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c
    /* renamed from: b */
    public Double mo25856b() {
        return this.f31503a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c
    /* renamed from: c */
    public int mo25857c() {
        return this.f31504b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c
    /* renamed from: d */
    public long mo25858d() {
        return this.f31508f;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c
    /* renamed from: e */
    public int mo25859e() {
        return this.f31506d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8258f0.e.d.c)) {
            return false;
        }
        AbstractC8258f0.e.d.c cVar = (AbstractC8258f0.e.d.c) obj;
        Double d2 = this.f31503a;
        if (d2 != null ? d2.equals(cVar.mo25856b()) : cVar.mo25856b() == null) {
            if (this.f31504b == cVar.mo25857c() && this.f31505c == cVar.mo25861g() && this.f31506d == cVar.mo25859e() && this.f31507e == cVar.mo25860f() && this.f31508f == cVar.mo25858d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c
    /* renamed from: f */
    public long mo25860f() {
        return this.f31507e;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0.e.d.c
    /* renamed from: g */
    public boolean mo25861g() {
        return this.f31505c;
    }

    public int hashCode() {
        Double d2 = this.f31503a;
        int iHashCode = ((((((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.f31504b) * 1000003) ^ (this.f31505c ? 1231 : 1237)) * 1000003) ^ this.f31506d) * 1000003;
        long j2 = this.f31507e;
        long j3 = this.f31508f;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f31503a + ", batteryVelocity=" + this.f31504b + ", proximityOn=" + this.f31505c + ", orientation=" + this.f31506d + ", ramUsed=" + this.f31507e + ", diskUsed=" + this.f31508f + "}";
    }

    private C8284u(Double d2, int i2, boolean z, int i3, long j2, long j3) {
        this.f31503a = d2;
        this.f31504b = i2;
        this.f31505c = z;
        this.f31506d = i3;
        this.f31507e = j2;
        this.f31508f = j3;
    }
}
