package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: AudioTimestampPoller.java */
/* loaded from: classes.dex */
final class f {

    /* renamed from: a, reason: collision with root package name */
    private final a f26771a;

    /* renamed from: b, reason: collision with root package name */
    private int f26772b;

    /* renamed from: c, reason: collision with root package name */
    private long f26773c;

    /* renamed from: d, reason: collision with root package name */
    private long f26774d;

    /* renamed from: e, reason: collision with root package name */
    private long f26775e;

    /* renamed from: f, reason: collision with root package name */
    private long f26776f;

    /* compiled from: AudioTimestampPoller.java */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f26777a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f26778b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f26779c;

        /* renamed from: d, reason: collision with root package name */
        private long f26780d;

        /* renamed from: e, reason: collision with root package name */
        private long f26781e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f26782f;

        /* renamed from: g, reason: collision with root package name */
        private long f26783g;

        public a(AudioTrack audioTrack) {
            this.f26777a = audioTrack;
        }

        public void a() {
            this.f26782f = true;
        }

        public long b() {
            return this.f26781e;
        }

        public long c() {
            return this.f26778b.nanoTime / 1000;
        }

        public boolean d() {
            boolean timestamp = this.f26777a.getTimestamp(this.f26778b);
            if (timestamp) {
                long j10 = this.f26778b.framePosition;
                long j11 = this.f26780d;
                if (j11 > j10) {
                    if (this.f26782f) {
                        this.f26783g += j11;
                        this.f26782f = false;
                    } else {
                        this.f26779c++;
                    }
                }
                this.f26780d = j10;
                this.f26781e = j10 + this.f26783g + (this.f26779c << 32);
            }
            return timestamp;
        }
    }

    public f(AudioTrack audioTrack) {
        this.f26771a = new a(audioTrack);
        h();
    }

    private void i(int i10) {
        this.f26772b = i10;
        if (i10 == 0) {
            this.f26775e = 0L;
            this.f26776f = -1L;
            this.f26773c = System.nanoTime() / 1000;
            this.f26774d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f26774d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f26774d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f26774d = 500000L;
        }
    }

    public void a() {
        if (this.f26772b == 4) {
            h();
        }
    }

    public void b() {
        a aVar = this.f26771a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public long c() {
        a aVar = this.f26771a;
        if (aVar != null) {
            return aVar.b();
        }
        return -1L;
    }

    public long d() {
        a aVar = this.f26771a;
        if (aVar != null) {
            return aVar.c();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f26772b == 2;
    }

    public boolean f(long j10) {
        a aVar = this.f26771a;
        if (aVar == null || j10 - this.f26775e < this.f26774d) {
            return false;
        }
        this.f26775e = j10;
        boolean zD = aVar.d();
        int i10 = this.f26772b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zD) {
                        h();
                    }
                } else if (!zD) {
                    h();
                }
            } else if (!zD) {
                h();
            } else if (this.f26771a.b() > this.f26776f) {
                i(2);
            }
        } else if (zD) {
            if (this.f26771a.c() < this.f26773c) {
                return false;
            }
            this.f26776f = this.f26771a.b();
            i(1);
        } else if (j10 - this.f26773c > 500000) {
            i(3);
        }
        return zD;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.f26771a != null) {
            i(0);
        }
    }
}
