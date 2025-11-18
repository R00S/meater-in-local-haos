package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.ConditionVariable;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzhq {

    /* renamed from: A */
    private boolean f26215A;

    /* renamed from: B */
    private int f26216B;

    /* renamed from: a */
    private final ConditionVariable f26217a = new ConditionVariable(true);

    /* renamed from: b */
    private final long[] f26218b;

    /* renamed from: c */
    private final C6987nz f26219c;

    /* renamed from: d */
    private AudioTrack f26220d;

    /* renamed from: e */
    private int f26221e;

    /* renamed from: f */
    private int f26222f;

    /* renamed from: g */
    private int f26223g;

    /* renamed from: h */
    private int f26224h;

    /* renamed from: i */
    private int f26225i;

    /* renamed from: j */
    private int f26226j;

    /* renamed from: k */
    private int f26227k;

    /* renamed from: l */
    private int f26228l;

    /* renamed from: m */
    private long f26229m;

    /* renamed from: n */
    private long f26230n;

    /* renamed from: o */
    private boolean f26231o;

    /* renamed from: p */
    private long f26232p;

    /* renamed from: q */
    private Method f26233q;

    /* renamed from: r */
    private long f26234r;

    /* renamed from: s */
    private int f26235s;

    /* renamed from: t */
    private long f26236t;

    /* renamed from: u */
    private long f26237u;

    /* renamed from: v */
    private long f26238v;

    /* renamed from: w */
    private float f26239w;

    /* renamed from: x */
    private byte[] f26240x;

    /* renamed from: y */
    private int f26241y;

    /* renamed from: z */
    private int f26242z;

    public zzhq() {
        C6950mz c6950mz = null;
        if (zzkq.f26428a >= 18) {
            try {
                this.f26233q = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzkq.f26428a >= 19) {
            this.f26219c = new C7024oz();
        } else {
            this.f26219c = new C6987nz(c6950mz);
        }
        this.f26218b = new long[10];
        this.f26239w = 1.0f;
        this.f26235s = 0;
    }

    /* renamed from: i */
    private final long m20038i(long j2) {
        if (!this.f26215A) {
            return j2 / this.f26224h;
        }
        if (this.f26216B == 0) {
            return 0L;
        }
        return ((j2 << 3) * this.f26221e) / (r0 * 1000);
    }

    /* renamed from: j */
    private final long m20039j(long j2) {
        return (j2 * 1000000) / this.f26221e;
    }

    /* renamed from: k */
    private final long m20040k(long j2) {
        return (j2 * this.f26221e) / 1000000;
    }

    /* renamed from: o */
    private final void m20041o() {
        this.f26229m = 0L;
        this.f26228l = 0;
        this.f26227k = 0;
        this.f26230n = 0L;
        this.f26231o = false;
        this.f26232p = 0L;
    }

    /* renamed from: a */
    public final boolean m20042a() {
        return this.f26220d != null;
    }

    /* renamed from: b */
    public final void m20043b() throws IllegalStateException {
        if (m20042a()) {
            m20041o();
            this.f26220d.pause();
        }
    }

    /* renamed from: c */
    public final void m20044c() throws IllegalStateException {
        if (m20042a()) {
            this.f26237u = System.nanoTime() / 1000;
            this.f26220d.play();
        }
    }

    /* renamed from: d */
    public final void m20045d() throws IllegalStateException {
        if (m20042a()) {
            this.f26234r = 0L;
            this.f26242z = 0;
            this.f26236t = 0L;
            this.f26238v = 0L;
            m20041o();
            if (this.f26220d.getPlayState() == 3) {
                this.f26220d.pause();
            }
            AudioTrack audioTrack = this.f26220d;
            this.f26220d = null;
            this.f26219c.mo15657a(null, false);
            this.f26217a.close();
            new C6950mz(this, audioTrack).start();
        }
    }

    /* renamed from: e */
    public final void m20046e(float f2) {
        this.f26239w = f2;
        if (m20042a()) {
            if (zzkq.f26428a >= 21) {
                this.f26220d.setVolume(f2);
            } else {
                this.f26220d.setStereoVolume(f2, f2);
            }
        }
    }

    /* renamed from: f */
    public final int m20047f(ByteBuffer byteBuffer, int i2, int i3, long j2) throws zzhv {
        int i4;
        if (i3 == 0) {
            return 2;
        }
        int i5 = zzkq.f26428a;
        int iWrite = 0;
        if (i5 <= 22 && this.f26215A) {
            if (this.f26220d.getPlayState() == 2) {
                return 0;
            }
            if (this.f26220d.getPlayState() == 1 && this.f26219c.m15659c() != 0) {
                return 0;
            }
        }
        if (this.f26242z != 0) {
            i4 = 0;
        } else {
            if (this.f26215A && this.f26216B == 0) {
                this.f26216B = zzkg.m20123a(i3, this.f26221e);
            }
            long jM20039j = j2 - m20039j(m20038i(i3));
            long j3 = this.f26236t;
            if (j3 == 0) {
                this.f26236t = Math.max(0L, jM20039j);
                this.f26235s = 1;
            } else {
                long jM20039j2 = j3 + m20039j(m20038i(this.f26234r));
                if (this.f26235s == 1 && Math.abs(jM20039j2 - jM20039j) > 200000) {
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Discontinuity detected [expected ");
                    sb.append(jM20039j2);
                    sb.append(", got ");
                    sb.append(jM20039j);
                    sb.append("]");
                    Log.e("AudioTrack", sb.toString());
                    this.f26235s = 2;
                }
                if (this.f26235s == 2) {
                    this.f26236t += jM20039j - jM20039j2;
                    this.f26235s = 1;
                    i4 = 1;
                }
            }
            i4 = 0;
        }
        if (this.f26242z == 0) {
            this.f26242z = i3;
            byteBuffer.position(i2);
            if (i5 < 21) {
                byte[] bArr = this.f26240x;
                if (bArr == null || bArr.length < i3) {
                    this.f26240x = new byte[i3];
                }
                byteBuffer.get(this.f26240x, 0, i3);
                this.f26241y = 0;
            }
        }
        if (i5 < 21) {
            int iM15659c = this.f26226j - ((int) (this.f26234r - (this.f26219c.m15659c() * this.f26224h)));
            if (iM15659c > 0) {
                iWrite = this.f26220d.write(this.f26240x, this.f26241y, Math.min(this.f26242z, iM15659c));
                if (iWrite >= 0) {
                    this.f26241y += iWrite;
                }
            }
        } else {
            iWrite = this.f26220d.write(byteBuffer, this.f26242z, 1);
        }
        if (iWrite < 0) {
            throw new zzhv(iWrite);
        }
        int i6 = this.f26242z - iWrite;
        this.f26242z = i6;
        this.f26234r += iWrite;
        return i6 == 0 ? i4 | 2 : i4;
    }

    /* renamed from: h */
    public final void m20048h(MediaFormat mediaFormat, int i2) throws IllegalStateException {
        int i3;
        int integer = mediaFormat.getInteger("channel-count");
        if (integer == 1) {
            i3 = 4;
        } else if (integer == 2) {
            i3 = 12;
        } else if (integer == 6) {
            i3 = 252;
        } else {
            if (integer != 8) {
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unsupported channel count: ");
                sb.append(integer);
                throw new IllegalArgumentException(sb.toString());
            }
            i3 = 1020;
        }
        int integer2 = mediaFormat.getInteger("sample-rate");
        String string = mediaFormat.getString("mime");
        int i4 = "audio/ac3".equals(string) ? 5 : "audio/eac3".equals(string) ? 6 : zzkl.m20137b(string) ? 2 : 0;
        boolean z = i4 == 5 || i4 == 6;
        if (m20042a() && this.f26221e == integer2 && this.f26222f == i3 && !this.f26215A && !z) {
            return;
        }
        m20045d();
        this.f26223g = i4;
        this.f26221e = integer2;
        this.f26222f = i3;
        this.f26215A = z;
        this.f26216B = 0;
        this.f26224h = integer * 2;
        int minBufferSize = AudioTrack.getMinBufferSize(integer2, i3, i4);
        this.f26225i = minBufferSize;
        zzkh.m20129d(minBufferSize != -2);
        int i5 = this.f26225i << 2;
        int iM20040k = ((int) m20040k(250000L)) * this.f26224h;
        int iMax = (int) Math.max(this.f26225i, m20040k(750000L) * this.f26224h);
        if (i5 < iM20040k) {
            i5 = iM20040k;
        } else if (i5 > iMax) {
            i5 = iMax;
        }
        this.f26226j = i5;
    }

    /* renamed from: l */
    public final void m20049l() {
        if (this.f26235s == 1) {
            this.f26235s = 2;
        }
    }

    /* renamed from: m */
    public final boolean m20050m() {
        if (m20042a()) {
            return m20038i(this.f26234r) > this.f26219c.m15659c() || this.f26219c.m15658b();
        }
        return false;
    }

    /* renamed from: n */
    public final boolean m20051n() {
        return this.f26234r > ((long) ((this.f26225i * 3) / 2));
    }

    /* renamed from: p */
    public final long m20052p(boolean z) {
        long jM15660d;
        long j2;
        if (!(m20042a() && this.f26236t != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f26220d.getPlayState() == 3) {
            long jM15660d2 = this.f26219c.m15660d();
            if (jM15660d2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.f26230n >= 30000) {
                    long[] jArr = this.f26218b;
                    int i2 = this.f26227k;
                    jArr[i2] = jM15660d2 - jNanoTime;
                    this.f26227k = (i2 + 1) % 10;
                    int i3 = this.f26228l;
                    if (i3 < 10) {
                        this.f26228l = i3 + 1;
                    }
                    this.f26230n = jNanoTime;
                    this.f26229m = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.f26228l;
                        if (i4 >= i5) {
                            break;
                        }
                        this.f26229m += this.f26218b[i4] / i5;
                        i4++;
                    }
                }
                if (!this.f26215A && jNanoTime - this.f26232p >= 500000) {
                    boolean zMo15661e = this.f26219c.mo15661e();
                    this.f26231o = zMo15661e;
                    if (zMo15661e) {
                        long jMo15662f = this.f26219c.mo15662f() / 1000;
                        long jMo15663g = this.f26219c.mo15663g();
                        if (jMo15662f < this.f26237u) {
                            this.f26231o = false;
                        } else if (Math.abs(jMo15662f - jNanoTime) > 5000000) {
                            this.f26231o = false;
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(jMo15663g);
                            sb.append(", ");
                            sb.append(jMo15662f);
                            sb.append(", ");
                            sb.append(jNanoTime);
                            sb.append(", ");
                            sb.append(jM15660d2);
                            Log.w("AudioTrack", sb.toString());
                        } else if (Math.abs(m20039j(jMo15663g) - jM15660d2) > 5000000) {
                            this.f26231o = false;
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(jMo15663g);
                            sb2.append(", ");
                            sb2.append(jMo15662f);
                            sb2.append(", ");
                            sb2.append(jNanoTime);
                            sb2.append(", ");
                            sb2.append(jM15660d2);
                            Log.w("AudioTrack", sb2.toString());
                        }
                    }
                    if (this.f26233q != null) {
                        try {
                            long jIntValue = (((Integer) r1.invoke(this.f26220d, null)).intValue() * 1000) - m20039j(m20038i(this.f26226j));
                            this.f26238v = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.f26238v = jMax;
                            if (jMax > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(jMax);
                                Log.w("AudioTrack", sb3.toString());
                                this.f26238v = 0L;
                            }
                        } catch (Exception unused) {
                            this.f26233q = null;
                        }
                    }
                    this.f26232p = jNanoTime;
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        if (this.f26231o) {
            return m20039j(this.f26219c.mo15663g() + m20040k(jNanoTime2 - (this.f26219c.mo15662f() / 1000))) + this.f26236t;
        }
        if (this.f26228l == 0) {
            jM15660d = this.f26219c.m15660d();
            j2 = this.f26236t;
        } else {
            jM15660d = jNanoTime2 + this.f26229m;
            j2 = this.f26236t;
        }
        long j3 = jM15660d + j2;
        return !z ? j3 - this.f26238v : j3;
    }

    /* renamed from: q */
    public final int m20053q(int i2) throws zzhu {
        this.f26217a.block();
        if (i2 == 0) {
            this.f26220d = new AudioTrack(3, this.f26221e, this.f26222f, this.f26223g, this.f26226j, 1);
        } else {
            this.f26220d = new AudioTrack(3, this.f26221e, this.f26222f, this.f26223g, this.f26226j, 1, i2);
        }
        int state = this.f26220d.getState();
        if (state == 1) {
            int audioSessionId = this.f26220d.getAudioSessionId();
            this.f26219c.mo15657a(this.f26220d, this.f26215A);
            m20046e(this.f26239w);
            return audioSessionId;
        }
        try {
            this.f26220d.release();
        } catch (Exception unused) {
        } finally {
            this.f26220d = null;
        }
        throw new zzhu(state, this.f26221e, this.f26222f, this.f26226j);
    }
}
