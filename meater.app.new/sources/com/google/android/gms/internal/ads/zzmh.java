package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import okhttp3.internal.p454ws.RealWebSocket;

/* loaded from: classes2.dex */
public final class zzmh {

    /* renamed from: A */
    private long f26525A;

    /* renamed from: B */
    private long f26526B;

    /* renamed from: C */
    private boolean f26527C;

    /* renamed from: D */
    private long f26528D;

    /* renamed from: E */
    private Method f26529E;

    /* renamed from: F */
    private int f26530F;

    /* renamed from: G */
    private long f26531G;

    /* renamed from: H */
    private long f26532H;

    /* renamed from: I */
    private int f26533I;

    /* renamed from: J */
    private long f26534J;

    /* renamed from: K */
    private long f26535K;

    /* renamed from: L */
    private int f26536L;

    /* renamed from: M */
    private int f26537M;

    /* renamed from: N */
    private long f26538N;

    /* renamed from: O */
    private long f26539O;

    /* renamed from: P */
    private long f26540P;

    /* renamed from: Q */
    private float f26541Q;

    /* renamed from: R */
    private zzlx[] f26542R;

    /* renamed from: S */
    private ByteBuffer[] f26543S;

    /* renamed from: T */
    private ByteBuffer f26544T;

    /* renamed from: U */
    private ByteBuffer f26545U;

    /* renamed from: V */
    private byte[] f26546V;

    /* renamed from: W */
    private int f26547W;

    /* renamed from: X */
    private int f26548X;

    /* renamed from: Y */
    private boolean f26549Y;

    /* renamed from: Z */
    private boolean f26550Z;

    /* renamed from: a0 */
    private int f26552a0;

    /* renamed from: b */
    private final e10 f26553b;

    /* renamed from: b0 */
    private boolean f26554b0;

    /* renamed from: c */
    private final zzmx f26555c;

    /* renamed from: c0 */
    private boolean f26556c0;

    /* renamed from: d */
    private final zzlx[] f26557d;

    /* renamed from: d0 */
    private long f26558d0;

    /* renamed from: e */
    private final zzmn f26559e;

    /* renamed from: g */
    private final long[] f26561g;

    /* renamed from: h */
    private final b10 f26562h;

    /* renamed from: i */
    private final LinkedList<d10> f26563i;

    /* renamed from: j */
    private AudioTrack f26564j;

    /* renamed from: k */
    private int f26565k;

    /* renamed from: l */
    private int f26566l;

    /* renamed from: m */
    private int f26567m;

    /* renamed from: n */
    private int f26568n;

    /* renamed from: o */
    private int f26569o;

    /* renamed from: p */
    private boolean f26570p;

    /* renamed from: q */
    private int f26571q;

    /* renamed from: r */
    private long f26572r;

    /* renamed from: s */
    private zzln f26573s;

    /* renamed from: t */
    private zzln f26574t;

    /* renamed from: u */
    private long f26575u;

    /* renamed from: v */
    private long f26576v;

    /* renamed from: w */
    private ByteBuffer f26577w;

    /* renamed from: x */
    private int f26578x;

    /* renamed from: y */
    private int f26579y;

    /* renamed from: z */
    private int f26580z;

    /* renamed from: a */
    private final zzlw f26551a = null;

    /* renamed from: f */
    private final ConditionVariable f26560f = new ConditionVariable(true);

    public zzmh(zzlw zzlwVar, zzlx[] zzlxVarArr, zzmn zzmnVar) {
        a10 a10Var = null;
        this.f26559e = zzmnVar;
        if (zzsy.f27024a >= 18) {
            try {
                this.f26529E = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzsy.f27024a >= 19) {
            this.f26562h = new c10();
        } else {
            this.f26562h = new b10(a10Var);
        }
        e10 e10Var = new e10();
        this.f26553b = e10Var;
        zzmx zzmxVar = new zzmx();
        this.f26555c = zzmxVar;
        zzlx[] zzlxVarArr2 = new zzlx[zzlxVarArr.length + 3];
        this.f26557d = zzlxVarArr2;
        zzlxVarArr2[0] = new h10();
        zzlxVarArr2[1] = e10Var;
        System.arraycopy(zzlxVarArr, 0, zzlxVarArr2, 2, zzlxVarArr.length);
        zzlxVarArr2[zzlxVarArr.length + 2] = zzmxVar;
        this.f26561g = new long[10];
        this.f26541Q = 1.0f;
        this.f26537M = 0;
        this.f26569o = 3;
        this.f26552a0 = 0;
        this.f26574t = zzln.f26490a;
        this.f26548X = -1;
        this.f26542R = new zzlx[0];
        this.f26543S = new ByteBuffer[0];
        this.f26563i = new LinkedList<>();
    }

    /* renamed from: C */
    private final void m20239C() {
        if (m20242a()) {
            if (zzsy.f27024a >= 21) {
                this.f26564j.setVolume(this.f26541Q);
                return;
            }
            AudioTrack audioTrack = this.f26564j;
            float f2 = this.f26541Q;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    /* renamed from: D */
    private final long m20240D() {
        return this.f26570p ? this.f26535K : this.f26534J / this.f26533I;
    }

    /* renamed from: E */
    private final boolean m20241E() {
        if (zzsy.f27024a >= 23) {
            return false;
        }
        int i2 = this.f26568n;
        return i2 == 5 || i2 == 6;
    }

    /* renamed from: a */
    private final boolean m20242a() {
        return this.f26564j != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m20244n(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.zzmp {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmh.m20244n(java.nio.ByteBuffer, long):boolean");
    }

    /* renamed from: o */
    private static int m20245o(String str) {
        str.hashCode();
        switch (str) {
            case "audio/vnd.dts":
                return 7;
            case "audio/ac3":
                return 5;
            case "audio/eac3":
                return 6;
            case "audio/vnd.dts.hd":
                return 8;
            default:
                return 0;
        }
    }

    /* renamed from: p */
    private final long m20246p(long j2) {
        return (j2 * 1000000) / this.f26565k;
    }

    /* renamed from: q */
    private final long m20247q(long j2) {
        return (j2 * this.f26565k) / 1000000;
    }

    /* renamed from: s */
    private final void m20248s(long j2) throws zzmp {
        ByteBuffer byteBuffer;
        int length = this.f26542R.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.f26543S[i2 - 1];
            } else {
                byteBuffer = this.f26544T;
                if (byteBuffer == null) {
                    byteBuffer = zzlx.f26522a;
                }
            }
            if (i2 == length) {
                m20244n(byteBuffer, j2);
            } else {
                zzlx zzlxVar = this.f26542R[i2];
                zzlxVar.mo15095h(byteBuffer);
                ByteBuffer byteBufferMo15091d = zzlxVar.mo15091d();
                this.f26543S[i2] = byteBufferMo15091d;
                if (byteBufferMo15091d.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    /* renamed from: v */
    private final void m20249v() {
        this.f26525A = 0L;
        this.f26580z = 0;
        this.f26579y = 0;
        this.f26526B = 0L;
        this.f26527C = false;
        this.f26528D = 0L;
    }

    /* renamed from: x */
    private final void m20250x() {
        ArrayList arrayList = new ArrayList();
        for (zzlx zzlxVar : this.f26557d) {
            if (zzlxVar.mo15089b()) {
                arrayList.add(zzlxVar);
            } else {
                zzlxVar.flush();
            }
        }
        int size = arrayList.size();
        this.f26542R = (zzlx[]) arrayList.toArray(new zzlx[size]);
        this.f26543S = new ByteBuffer[size];
        for (int i2 = 0; i2 < size; i2++) {
            zzlx zzlxVar2 = this.f26542R[i2];
            zzlxVar2.flush();
            this.f26543S[i2] = zzlxVar2.mo15091d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please report as a decompilation issue!!! */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m20251z() throws com.google.android.gms.internal.ads.zzmp {
        /*
            r9 = this;
            int r0 = r9.f26548X
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.f26570p
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzlx[] r0 = r9.f26542R
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.f26548X = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.f26548X
            com.google.android.gms.internal.ads.zzlx[] r5 = r9.f26542R
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.mo15090c()
        L28:
            r9.m20248s(r7)
            boolean r0 = r4.mo15087C()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.f26548X
            int r0 = r0 + r2
            r9.f26548X = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.f26545U
            if (r0 == 0) goto L44
            r9.m20244n(r0, r7)
            java.nio.ByteBuffer r0 = r9.f26545U
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.f26548X = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmh.m20251z():boolean");
    }

    /* renamed from: A */
    public final zzln m20252A() {
        return this.f26574t;
    }

    /* renamed from: B */
    public final void m20253B() throws IllegalStateException {
        if (this.f26554b0) {
            this.f26554b0 = false;
            this.f26552a0 = 0;
            m20257e();
        }
    }

    /* renamed from: b */
    public final void m20254b() {
        this.f26550Z = false;
        if (m20242a()) {
            m20249v();
            this.f26562h.m14837a();
        }
    }

    /* renamed from: c */
    public final void m20255c() throws IllegalStateException {
        this.f26550Z = true;
        if (m20242a()) {
            this.f26539O = System.nanoTime() / 1000;
            this.f26564j.play();
        }
    }

    /* renamed from: d */
    public final void m20256d() throws IllegalStateException {
        m20257e();
        for (zzlx zzlxVar : this.f26557d) {
            zzlxVar.mo15088a();
        }
        this.f26552a0 = 0;
        this.f26550Z = false;
    }

    /* renamed from: e */
    public final void m20257e() throws IllegalStateException {
        if (m20242a()) {
            this.f26531G = 0L;
            this.f26532H = 0L;
            this.f26534J = 0L;
            this.f26535K = 0L;
            this.f26536L = 0;
            zzln zzlnVar = this.f26573s;
            if (zzlnVar != null) {
                this.f26574t = zzlnVar;
                this.f26573s = null;
            } else if (!this.f26563i.isEmpty()) {
                this.f26574t = this.f26563i.getLast().f18480a;
            }
            this.f26563i.clear();
            this.f26575u = 0L;
            this.f26576v = 0L;
            this.f26544T = null;
            this.f26545U = null;
            int i2 = 0;
            while (true) {
                zzlx[] zzlxVarArr = this.f26542R;
                if (i2 >= zzlxVarArr.length) {
                    break;
                }
                zzlx zzlxVar = zzlxVarArr[i2];
                zzlxVar.flush();
                this.f26543S[i2] = zzlxVar.mo15091d();
                i2++;
            }
            this.f26549Y = false;
            this.f26548X = -1;
            this.f26577w = null;
            this.f26578x = 0;
            this.f26537M = 0;
            this.f26540P = 0L;
            m20249v();
            if (this.f26564j.getPlayState() == 3) {
                this.f26564j.pause();
            }
            AudioTrack audioTrack = this.f26564j;
            this.f26564j = null;
            this.f26562h.mo14838b(null, false);
            this.f26560f.close();
            new a10(this, audioTrack).start();
        }
    }

    /* renamed from: f */
    public final void m20258f(int i2) throws IllegalStateException {
        if (this.f26569o == i2) {
            return;
        }
        this.f26569o = i2;
        if (this.f26554b0) {
            return;
        }
        m20257e();
        this.f26552a0 = 0;
    }

    /* renamed from: g */
    public final void m20259g(float f2) {
        if (this.f26541Q != f2) {
            this.f26541Q = f2;
            m20239C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m20260i(java.lang.String r9, int r10, int r11, int r12, int r13, int[] r14) throws com.google.android.gms.internal.ads.zzml, java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmh.m20260i(java.lang.String, int, int, int, int, int[]):void");
    }

    /* renamed from: j */
    public final boolean m20261j(ByteBuffer byteBuffer, long j2) throws IllegalStateException, zzmm, zzmp {
        int i2;
        int iM20270a;
        ByteBuffer byteBuffer2 = this.f26544T;
        zzsk.m20477a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!m20242a()) {
            this.f26560f.block();
            if (this.f26554b0) {
                this.f26564j = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f26566l).setEncoding(this.f26568n).setSampleRate(this.f26565k).build(), this.f26571q, 1, this.f26552a0);
            } else if (this.f26552a0 == 0) {
                this.f26564j = new AudioTrack(this.f26569o, this.f26565k, this.f26566l, this.f26568n, this.f26571q, 1);
            } else {
                this.f26564j = new AudioTrack(this.f26569o, this.f26565k, this.f26566l, this.f26568n, this.f26571q, 1, this.f26552a0);
            }
            int state = this.f26564j.getState();
            if (state != 1) {
                try {
                    this.f26564j.release();
                } catch (Exception unused) {
                } finally {
                    this.f26564j = null;
                }
                throw new zzmm(state, this.f26565k, this.f26566l, this.f26571q);
            }
            int audioSessionId = this.f26564j.getAudioSessionId();
            if (this.f26552a0 != audioSessionId) {
                this.f26552a0 = audioSessionId;
                this.f26559e.mo15156a(audioSessionId);
            }
            this.f26562h.mo14838b(this.f26564j, m20241E());
            m20239C();
            this.f26556c0 = false;
            if (this.f26550Z) {
                m20255c();
            }
        }
        if (m20241E()) {
            if (this.f26564j.getPlayState() == 2) {
                this.f26556c0 = false;
                return false;
            }
            if (this.f26564j.getPlayState() == 1 && this.f26562h.m14841e() != 0) {
                return false;
            }
        }
        boolean z = this.f26556c0;
        boolean zM20267u = m20267u();
        this.f26556c0 = zM20267u;
        if (z && !zM20267u && this.f26564j.getPlayState() != 1) {
            this.f26559e.mo15157b(this.f26571q, zzkt.m20189a(this.f26572r), SystemClock.elapsedRealtime() - this.f26558d0);
        }
        if (this.f26544T == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f26570p && this.f26536L == 0) {
                int i3 = this.f26568n;
                if (i3 == 7 || i3 == 8) {
                    iM20270a = zzmr.m20270a(byteBuffer);
                } else if (i3 == 5) {
                    iM20270a = zzlv.m20224d();
                } else {
                    if (i3 != 6) {
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unexpected audio encoding: ");
                        sb.append(i3);
                        throw new IllegalStateException(sb.toString());
                    }
                    iM20270a = zzlv.m20223c(byteBuffer);
                }
                this.f26536L = iM20270a;
            }
            if (this.f26573s != null) {
                if (!m20251z()) {
                    return false;
                }
                this.f26563i.add(new d10(this.f26573s, Math.max(0L, j2), m20246p(m20240D()), null));
                this.f26573s = null;
                m20250x();
            }
            if (this.f26537M == 0) {
                this.f26538N = Math.max(0L, j2);
                this.f26537M = 1;
            } else {
                long jM20246p = this.f26538N + m20246p(this.f26570p ? this.f26532H : this.f26531G / this.f26530F);
                if (this.f26537M != 1 || Math.abs(jM20246p - j2) <= 200000) {
                    i2 = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(jM20246p);
                    sb2.append(", got ");
                    sb2.append(j2);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    i2 = 2;
                    this.f26537M = 2;
                }
                if (this.f26537M == i2) {
                    this.f26538N += j2 - jM20246p;
                    this.f26537M = 1;
                    this.f26559e.mo15158c();
                }
            }
            if (this.f26570p) {
                this.f26532H += this.f26536L;
            } else {
                this.f26531G += byteBuffer.remaining();
            }
            this.f26544T = byteBuffer;
        }
        if (this.f26570p) {
            m20244n(this.f26544T, j2);
        } else {
            m20248s(j2);
        }
        if (this.f26544T.hasRemaining()) {
            return false;
        }
        this.f26544T = null;
        return true;
    }

    /* renamed from: k */
    public final void m20262k(int i2) throws IllegalStateException {
        zzsk.m20481e(zzsy.f27024a >= 21);
        if (this.f26554b0 && this.f26552a0 == i2) {
            return;
        }
        this.f26554b0 = true;
        this.f26552a0 = i2;
        m20257e();
    }

    /* renamed from: l */
    public final boolean m20263l(String str) {
        zzlw zzlwVar = this.f26551a;
        return zzlwVar != null && zzlwVar.m20225a(m20245o(str));
    }

    /* renamed from: m */
    public final zzln m20264m(zzln zzlnVar) {
        if (this.f26570p) {
            zzln zzlnVar2 = zzln.f26490a;
            this.f26574t = zzlnVar2;
            return zzlnVar2;
        }
        zzln zzlnVar3 = new zzln(this.f26555c.m20288i(zzlnVar.f26491b), this.f26555c.m20289j(zzlnVar.f26492c));
        zzln zzlnVar4 = this.f26573s;
        if (zzlnVar4 == null) {
            zzlnVar4 = !this.f26563i.isEmpty() ? this.f26563i.getLast().f18480a : this.f26574t;
        }
        if (!zzlnVar3.equals(zzlnVar4)) {
            if (m20242a()) {
                this.f26573s = zzlnVar3;
            } else {
                this.f26574t = zzlnVar3;
            }
        }
        return this.f26574t;
    }

    /* renamed from: r */
    public final boolean m20265r() {
        if (m20242a()) {
            return this.f26549Y && !m20267u();
        }
        return true;
    }

    /* renamed from: t */
    public final void m20266t() {
        if (this.f26537M == 1) {
            this.f26537M = 2;
        }
    }

    /* renamed from: u */
    public final boolean m20267u() {
        if (m20242a()) {
            if (m20240D() <= this.f26562h.m14841e()) {
                if (m20241E() && this.f26564j.getPlayState() == 2 && this.f26564j.getPlaybackHeadPosition() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public final long m20268w(boolean z) {
        long jM14839c;
        long j2;
        long jM20539c;
        long j3;
        if (!(m20242a() && this.f26537M != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.f26564j.getPlayState() == 3) {
            long jM14839c2 = this.f26562h.m14839c();
            if (jM14839c2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.f26526B >= 30000) {
                    long[] jArr = this.f26561g;
                    int i2 = this.f26579y;
                    jArr[i2] = jM14839c2 - jNanoTime;
                    this.f26579y = (i2 + 1) % 10;
                    int i3 = this.f26580z;
                    if (i3 < 10) {
                        this.f26580z = i3 + 1;
                    }
                    this.f26526B = jNanoTime;
                    this.f26525A = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.f26580z;
                        if (i4 >= i5) {
                            break;
                        }
                        this.f26525A += this.f26561g[i4] / i5;
                        i4++;
                    }
                }
                if (!m20241E() && jNanoTime - this.f26528D >= 500000) {
                    boolean zMo14842f = this.f26562h.mo14842f();
                    this.f26527C = zMo14842f;
                    if (zMo14842f) {
                        long jMo14843g = this.f26562h.mo14843g() / 1000;
                        long jMo14844h = this.f26562h.mo14844h();
                        if (jMo14843g < this.f26539O) {
                            this.f26527C = false;
                        } else if (Math.abs(jMo14843g - jNanoTime) > 5000000) {
                            StringBuilder sb = new StringBuilder(136);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(jMo14844h);
                            sb.append(", ");
                            sb.append(jMo14843g);
                            sb.append(", ");
                            sb.append(jNanoTime);
                            sb.append(", ");
                            sb.append(jM14839c2);
                            Log.w("AudioTrack", sb.toString());
                            this.f26527C = false;
                        } else if (Math.abs(m20246p(jMo14844h) - jM14839c2) > 5000000) {
                            StringBuilder sb2 = new StringBuilder(138);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(jMo14844h);
                            sb2.append(", ");
                            sb2.append(jMo14843g);
                            sb2.append(", ");
                            sb2.append(jNanoTime);
                            sb2.append(", ");
                            sb2.append(jM14839c2);
                            Log.w("AudioTrack", sb2.toString());
                            this.f26527C = false;
                        }
                    }
                    if (this.f26529E != null && !this.f26570p) {
                        try {
                            long jIntValue = (((Integer) r1.invoke(this.f26564j, null)).intValue() * 1000) - this.f26572r;
                            this.f26540P = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.f26540P = jMax;
                            if (jMax > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(jMax);
                                Log.w("AudioTrack", sb3.toString());
                                this.f26540P = 0L;
                            }
                        } catch (Exception unused) {
                            this.f26529E = null;
                        }
                    }
                    this.f26528D = jNanoTime;
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        if (this.f26527C) {
            jM14839c = m20246p(this.f26562h.mo14844h() + m20247q(jNanoTime2 - (this.f26562h.mo14843g() / 1000)));
        } else {
            jM14839c = this.f26580z == 0 ? this.f26562h.m14839c() : jNanoTime2 + this.f26525A;
            if (!z) {
                jM14839c -= this.f26540P;
            }
        }
        long j4 = this.f26538N;
        while (!this.f26563i.isEmpty() && jM14839c >= this.f26563i.getFirst().f18482c) {
            d10 d10VarRemove = this.f26563i.remove();
            this.f26574t = d10VarRemove.f18480a;
            this.f26576v = d10VarRemove.f18482c;
            this.f26575u = d10VarRemove.f18481b - this.f26538N;
        }
        if (this.f26574t.f26491b == 1.0f) {
            j3 = (jM14839c + this.f26575u) - this.f26576v;
        } else {
            if (!this.f26563i.isEmpty() || this.f26555c.m20291l() < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                j2 = this.f26575u;
                double d2 = this.f26574t.f26491b;
                double d3 = jM14839c - this.f26576v;
                Double.isNaN(d2);
                Double.isNaN(d3);
                jM20539c = (long) (d2 * d3);
            } else {
                j2 = this.f26575u;
                jM20539c = zzsy.m20539c(jM14839c - this.f26576v, this.f26555c.m20290k(), this.f26555c.m20291l());
            }
            j3 = jM20539c + j2;
        }
        return j4 + j3;
    }

    /* renamed from: y */
    public final void m20269y() throws zzmp {
        if (!this.f26549Y && m20242a() && m20251z()) {
            this.f26562h.m14840d(m20240D());
            this.f26578x = 0;
            this.f26549Y = true;
        }
    }
}
