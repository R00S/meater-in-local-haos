package androidx.media3.exoplayer;

import X1.C1804a;
import l8.C3918k;

/* compiled from: LoadingInfo.java */
/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final long f26554a;

    /* renamed from: b, reason: collision with root package name */
    public final float f26555b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26556c;

    /* compiled from: LoadingInfo.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private long f26557a;

        /* renamed from: b, reason: collision with root package name */
        private float f26558b;

        /* renamed from: c, reason: collision with root package name */
        private long f26559c;

        public W d() {
            return new W(this);
        }

        public b e(long j10) {
            C1804a.a(j10 >= 0 || j10 == -9223372036854775807L);
            this.f26559c = j10;
            return this;
        }

        public b f(long j10) {
            this.f26557a = j10;
            return this;
        }

        public b g(float f10) {
            C1804a.a(f10 > 0.0f || f10 == -3.4028235E38f);
            this.f26558b = f10;
            return this;
        }

        public b() {
            this.f26557a = -9223372036854775807L;
            this.f26558b = -3.4028235E38f;
            this.f26559c = -9223372036854775807L;
        }

        private b(W w10) {
            this.f26557a = w10.f26554a;
            this.f26558b = w10.f26555b;
            this.f26559c = w10.f26556c;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w10 = (W) obj;
        return this.f26554a == w10.f26554a && this.f26555b == w10.f26555b && this.f26556c == w10.f26556c;
    }

    public int hashCode() {
        return C3918k.b(Long.valueOf(this.f26554a), Float.valueOf(this.f26555b), Long.valueOf(this.f26556c));
    }

    private W(b bVar) {
        this.f26554a = bVar.f26557a;
        this.f26555b = bVar.f26558b;
        this.f26556c = bVar.f26559c;
    }
}
