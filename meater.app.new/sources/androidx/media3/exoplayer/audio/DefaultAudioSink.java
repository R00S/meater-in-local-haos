package androidx.media3.exoplayer.audio;

import U1.A;
import U1.C1727c;
import U1.C1730f;
import U1.s;
import U1.z;
import X1.C1804a;
import X1.InterfaceC1807d;
import X1.L;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.audio.g;
import androidx.media3.exoplayer.audio.k;
import e2.v1;
import f2.G;
import f2.J;
import f2.K;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m8.AbstractC4009y;
import m8.j0;
import v2.C4796b;
import v2.C4797c;
import v2.C4809o;
import v2.F;
import v2.H;

/* loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {

    /* renamed from: l0, reason: collision with root package name */
    public static boolean f26627l0 = false;

    /* renamed from: m0, reason: collision with root package name */
    private static final Object f26628m0 = new Object();

    /* renamed from: n0, reason: collision with root package name */
    private static ScheduledExecutorService f26629n0;

    /* renamed from: o0, reason: collision with root package name */
    private static int f26630o0;

    /* renamed from: A, reason: collision with root package name */
    private k f26631A;

    /* renamed from: B, reason: collision with root package name */
    private C1727c f26632B;

    /* renamed from: C, reason: collision with root package name */
    private j f26633C;

    /* renamed from: D, reason: collision with root package name */
    private j f26634D;

    /* renamed from: E, reason: collision with root package name */
    private A f26635E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f26636F;

    /* renamed from: G, reason: collision with root package name */
    private ByteBuffer f26637G;

    /* renamed from: H, reason: collision with root package name */
    private int f26638H;

    /* renamed from: I, reason: collision with root package name */
    private long f26639I;

    /* renamed from: J, reason: collision with root package name */
    private long f26640J;

    /* renamed from: K, reason: collision with root package name */
    private long f26641K;

    /* renamed from: L, reason: collision with root package name */
    private long f26642L;

    /* renamed from: M, reason: collision with root package name */
    private int f26643M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f26644N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f26645O;

    /* renamed from: P, reason: collision with root package name */
    private long f26646P;

    /* renamed from: Q, reason: collision with root package name */
    private float f26647Q;

    /* renamed from: R, reason: collision with root package name */
    private ByteBuffer f26648R;

    /* renamed from: S, reason: collision with root package name */
    private int f26649S;

    /* renamed from: T, reason: collision with root package name */
    private ByteBuffer f26650T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f26651U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f26652V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f26653W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f26654X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f26655Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f26656Z;

    /* renamed from: a, reason: collision with root package name */
    private final Context f26657a;

    /* renamed from: a0, reason: collision with root package name */
    private C1730f f26658a0;

    /* renamed from: b, reason: collision with root package name */
    private final V1.a f26659b;

    /* renamed from: b0, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.c f26660b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26661c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f26662c0;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.audio.h f26663d;

    /* renamed from: d0, reason: collision with root package name */
    private long f26664d0;

    /* renamed from: e, reason: collision with root package name */
    private final o f26665e;

    /* renamed from: e0, reason: collision with root package name */
    private long f26666e0;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC4009y<AudioProcessor> f26667f;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f26668f0;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC4009y<AudioProcessor> f26669g;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f26670g0;

    /* renamed from: h, reason: collision with root package name */
    private final androidx.media3.exoplayer.audio.g f26671h;

    /* renamed from: h0, reason: collision with root package name */
    private Looper f26672h0;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayDeque<j> f26673i;

    /* renamed from: i0, reason: collision with root package name */
    private long f26674i0;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f26675j;

    /* renamed from: j0, reason: collision with root package name */
    private long f26676j0;

    /* renamed from: k, reason: collision with root package name */
    private int f26677k;

    /* renamed from: k0, reason: collision with root package name */
    private Handler f26678k0;

    /* renamed from: l, reason: collision with root package name */
    private n f26679l;

    /* renamed from: m, reason: collision with root package name */
    private final l<AudioSink.InitializationException> f26680m;

    /* renamed from: n, reason: collision with root package name */
    private final l<AudioSink.WriteException> f26681n;

    /* renamed from: o, reason: collision with root package name */
    private final e f26682o;

    /* renamed from: p, reason: collision with root package name */
    private final d f26683p;

    /* renamed from: q, reason: collision with root package name */
    private final ExoPlayer.a f26684q;

    /* renamed from: r, reason: collision with root package name */
    private final f f26685r;

    /* renamed from: s, reason: collision with root package name */
    private v1 f26686s;

    /* renamed from: t, reason: collision with root package name */
    private AudioSink.b f26687t;

    /* renamed from: u, reason: collision with root package name */
    private h f26688u;

    /* renamed from: v, reason: collision with root package name */
    private h f26689v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.media3.common.audio.a f26690w;

    /* renamed from: x, reason: collision with root package name */
    private AudioTrack f26691x;

    /* renamed from: y, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.a f26692y;

    /* renamed from: z, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.b f26693z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    private static final class b {
        public static void a(AudioTrack audioTrack, androidx.media3.exoplayer.audio.c cVar) {
            audioTrack.setPreferredDevice(cVar == null ? null : cVar.f26761a);
        }
    }

    private static final class c {
        public static void a(AudioTrack audioTrack, v1 v1Var) {
            LogSessionId logSessionIdA = v1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(logSessionIdA);
        }
    }

    public interface d {
        androidx.media3.exoplayer.audio.d a(s sVar, C1727c c1727c);
    }

    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f26694a = new k.a().h();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    public interface f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f26695a = new androidx.media3.exoplayer.audio.l();

        AudioTrack a(AudioSink.a aVar, C1727c c1727c, int i10);
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final Context f26696a;

        /* renamed from: c, reason: collision with root package name */
        private V1.a f26698c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f26699d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f26700e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f26701f;

        /* renamed from: i, reason: collision with root package name */
        private d f26704i;

        /* renamed from: j, reason: collision with root package name */
        private ExoPlayer.a f26705j;

        /* renamed from: b, reason: collision with root package name */
        private androidx.media3.exoplayer.audio.a f26697b = androidx.media3.exoplayer.audio.a.f26737c;

        /* renamed from: g, reason: collision with root package name */
        private e f26702g = e.f26694a;

        /* renamed from: h, reason: collision with root package name */
        private f f26703h = f.f26695a;

        public g(Context context) {
            this.f26696a = context;
        }

        public DefaultAudioSink j() {
            C1804a.g(!this.f26701f);
            this.f26701f = true;
            if (this.f26698c == null) {
                this.f26698c = new i(new AudioProcessor[0]);
            }
            if (this.f26704i == null) {
                this.f26704i = new androidx.media3.exoplayer.audio.i(this.f26696a);
            }
            return new DefaultAudioSink(this);
        }

        public g k(boolean z10) {
            this.f26700e = z10;
            return this;
        }

        public g l(boolean z10) {
            this.f26699d = z10;
            return this;
        }
    }

    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final s f26706a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26707b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26708c;

        /* renamed from: d, reason: collision with root package name */
        public final int f26709d;

        /* renamed from: e, reason: collision with root package name */
        public final int f26710e;

        /* renamed from: f, reason: collision with root package name */
        public final int f26711f;

        /* renamed from: g, reason: collision with root package name */
        public final int f26712g;

        /* renamed from: h, reason: collision with root package name */
        public final int f26713h;

        /* renamed from: i, reason: collision with root package name */
        public final androidx.media3.common.audio.a f26714i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f26715j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f26716k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f26717l;

        public h(s sVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, androidx.media3.common.audio.a aVar, boolean z10, boolean z11, boolean z12) {
            this.f26706a = sVar;
            this.f26707b = i10;
            this.f26708c = i11;
            this.f26709d = i12;
            this.f26710e = i13;
            this.f26711f = i14;
            this.f26712g = i15;
            this.f26713h = i16;
            this.f26714i = aVar;
            this.f26715j = z10;
            this.f26716k = z11;
            this.f26717l = z12;
        }

        public AudioSink.a a() {
            return new AudioSink.a(this.f26712g, this.f26710e, this.f26711f, this.f26717l, this.f26708c == 1, this.f26713h);
        }

        public boolean b(h hVar) {
            return hVar.f26708c == this.f26708c && hVar.f26712g == this.f26712g && hVar.f26710e == this.f26710e && hVar.f26711f == this.f26711f && hVar.f26709d == this.f26709d && hVar.f26715j == this.f26715j && hVar.f26716k == this.f26716k;
        }

        public h c(int i10) {
            return new h(this.f26706a, this.f26707b, this.f26708c, this.f26709d, this.f26710e, this.f26711f, this.f26712g, i10, this.f26714i, this.f26715j, this.f26716k, this.f26717l);
        }

        public long d(long j10) {
            return L.c1(j10, this.f26710e);
        }

        public long e(long j10) {
            return L.c1(j10, this.f26706a.f17138E);
        }

        public boolean f() {
            return this.f26708c == 1;
        }
    }

    public static class i implements V1.a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioProcessor[] f26718a;

        /* renamed from: b, reason: collision with root package name */
        private final K f26719b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.media3.common.audio.d f26720c;

        public i(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new K(), new androidx.media3.common.audio.d());
        }

        @Override // V1.a
        public A a(A a10) {
            this.f26720c.j(a10.f16775a);
            this.f26720c.i(a10.f16776b);
            return a10;
        }

        @Override // V1.a
        public long b(long j10) {
            return this.f26720c.a() ? this.f26720c.c(j10) : j10;
        }

        @Override // V1.a
        public long c() {
            return this.f26719b.v();
        }

        @Override // V1.a
        public boolean d(boolean z10) {
            this.f26719b.E(z10);
            return z10;
        }

        @Override // V1.a
        public AudioProcessor[] e() {
            return this.f26718a;
        }

        public i(AudioProcessor[] audioProcessorArr, K k10, androidx.media3.common.audio.d dVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f26718a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f26719b = k10;
            this.f26720c = dVar;
            audioProcessorArr2[audioProcessorArr.length] = k10;
            audioProcessorArr2[audioProcessorArr.length + 1] = dVar;
        }
    }

    private static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final A f26721a;

        /* renamed from: b, reason: collision with root package name */
        public final long f26722b;

        /* renamed from: c, reason: collision with root package name */
        public final long f26723c;

        /* renamed from: d, reason: collision with root package name */
        public long f26724d;

        private j(A a10, long j10, long j11) {
            this.f26721a = a10;
            this.f26722b = j10;
            this.f26723c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f26725a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.audio.b f26726b;

        /* renamed from: c, reason: collision with root package name */
        private AudioRouting.OnRoutingChangedListener f26727c = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.j
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f26824a.b(audioRouting);
            }
        };

        public k(AudioTrack audioTrack, androidx.media3.exoplayer.audio.b bVar) {
            this.f26725a = audioTrack;
            this.f26726b = bVar;
            audioTrack.addOnRoutingChangedListener(this.f26727c, new Handler(Looper.myLooper()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            if (this.f26727c == null || audioRouting.getRoutedDevice() == null) {
                return;
            }
            this.f26726b.i(audioRouting.getRoutedDevice());
        }

        public void c() {
            this.f26725a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) C1804a.e(this.f26727c));
            this.f26727c = null;
        }
    }

    private static final class l<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        private T f26728a;

        /* renamed from: b, reason: collision with root package name */
        private long f26729b = -9223372036854775807L;

        /* renamed from: c, reason: collision with root package name */
        private long f26730c = -9223372036854775807L;

        public void a() {
            this.f26728a = null;
            this.f26729b = -9223372036854775807L;
            this.f26730c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.f26728a == null) {
                return false;
            }
            return DefaultAudioSink.c0() || SystemClock.elapsedRealtime() < this.f26730c;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void c(T t10) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f26728a == null) {
                this.f26728a = t10;
            }
            if (this.f26729b == -9223372036854775807L && !DefaultAudioSink.c0()) {
                this.f26729b = 200 + jElapsedRealtime;
            }
            long j10 = this.f26729b;
            if (j10 == -9223372036854775807L || jElapsedRealtime < j10) {
                this.f26730c = jElapsedRealtime + 50;
                return;
            }
            T t11 = this.f26728a;
            if (t11 != t10) {
                t11.addSuppressed(t10);
            }
            T t12 = this.f26728a;
            a();
            throw t12;
        }
    }

    private final class m implements g.a {
        private m() {
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void a(int i10, long j10) {
            if (DefaultAudioSink.this.f26687t != null) {
                DefaultAudioSink.this.f26687t.h(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f26666e0);
            }
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void b(long j10) {
            X1.n.h("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void c(long j10) {
            if (DefaultAudioSink.this.f26687t != null) {
                DefaultAudioSink.this.f26687t.c(j10);
            }
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.Z() + ", " + DefaultAudioSink.this.a0();
            if (DefaultAudioSink.f26627l0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            X1.n.h("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.Z() + ", " + DefaultAudioSink.this.a0();
            if (DefaultAudioSink.f26627l0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            X1.n.h("DefaultAudioSink", str);
        }
    }

    private final class n {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f26732a = new Handler(Looper.myLooper());

        /* renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f26733b;

        class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ DefaultAudioSink f26735a;

            a(DefaultAudioSink defaultAudioSink) {
                this.f26735a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(DefaultAudioSink.this.f26691x) && DefaultAudioSink.this.f26687t != null && DefaultAudioSink.this.f26654X) {
                    DefaultAudioSink.this.f26687t.k();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f26691x)) {
                    DefaultAudioSink.this.f26653W = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f26691x) && DefaultAudioSink.this.f26687t != null && DefaultAudioSink.this.f26654X) {
                    DefaultAudioSink.this.f26687t.k();
                }
            }
        }

        public n() {
            this.f26733b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f26732a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new G(handler), this.f26733b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f26733b);
            this.f26732a.removeCallbacksAndMessages(null);
        }
    }

    private boolean A0() {
        h hVar = this.f26689v;
        return hVar != null && hVar.f26715j && L.f18626a >= 23;
    }

    private static int B0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int C0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (L.f18626a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f26637G == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f26637G = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f26637G.putInt(1431633921);
        }
        if (this.f26638H == 0) {
            this.f26637G.putInt(4, i10);
            this.f26637G.putLong(8, j10 * 1000);
            this.f26637G.position(0);
            this.f26638H = i10;
        }
        int iRemaining = this.f26637G.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f26637G, iRemaining, 1);
            if (iWrite < 0) {
                this.f26638H = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iB0 = B0(audioTrack, byteBuffer, i10);
        if (iB0 < 0) {
            this.f26638H = 0;
            return iB0;
        }
        this.f26638H -= iB0;
        return iB0;
    }

    private void P(long j10) {
        A a10;
        if (A0()) {
            a10 = A.f16772d;
        } else {
            a10 = y0() ? this.f26659b.a(this.f26635E) : A.f16772d;
            this.f26635E = a10;
        }
        A a11 = a10;
        this.f26636F = y0() ? this.f26659b.d(this.f26636F) : false;
        this.f26673i.add(new j(a11, Math.max(0L, j10), this.f26689v.d(a0())));
        x0();
        AudioSink.b bVar = this.f26687t;
        if (bVar != null) {
            bVar.e(this.f26636F);
        }
    }

    private long Q(long j10) {
        while (!this.f26673i.isEmpty() && j10 >= this.f26673i.getFirst().f26723c) {
            this.f26634D = this.f26673i.remove();
        }
        j jVar = this.f26634D;
        long j11 = j10 - jVar.f26723c;
        long jE0 = L.e0(j11, jVar.f26721a.f16775a);
        if (!this.f26673i.isEmpty()) {
            j jVar2 = this.f26634D;
            return jVar2.f26722b + jE0 + jVar2.f26724d;
        }
        long jB = this.f26659b.b(j11);
        j jVar3 = this.f26634D;
        long j12 = jVar3.f26722b + jB;
        jVar3.f26724d = jB - jE0;
        return j12;
    }

    private long R(long j10) {
        long jC = this.f26659b.c();
        long jD = j10 + this.f26689v.d(jC);
        long j11 = this.f26674i0;
        if (jC > j11) {
            long jD2 = this.f26689v.d(jC - j11);
            this.f26674i0 = jC;
            b0(jD2);
        }
        return jD;
    }

    private AudioTrack S(AudioSink.a aVar, C1727c c1727c, int i10, s sVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackA = this.f26685r.a(aVar, c1727c, i10);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new AudioSink.InitializationException(state, aVar.f26622b, aVar.f26623c, aVar.f26621a, sVar, aVar.f26625e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new AudioSink.InitializationException(0, aVar.f26622b, aVar.f26623c, aVar.f26621a, sVar, aVar.f26625e, e10);
        }
    }

    private AudioTrack T(h hVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackS = S(hVar.a(), this.f26632B, this.f26656Z, hVar.f26706a);
            ExoPlayer.a aVar = this.f26684q;
            if (aVar != null) {
                aVar.D(g0(audioTrackS));
            }
            return audioTrackS;
        } catch (AudioSink.InitializationException e10) {
            AudioSink.b bVar = this.f26687t;
            if (bVar != null) {
                bVar.f(e10);
            }
            throw e10;
        }
    }

    private AudioTrack U() throws AudioSink.InitializationException {
        try {
            return T((h) C1804a.e(this.f26689v));
        } catch (AudioSink.InitializationException e10) {
            h hVar = this.f26689v;
            if (hVar.f26713h > 1000000) {
                h hVarC = hVar.c(1000000);
                try {
                    AudioTrack audioTrackT = T(hVarC);
                    this.f26689v = hVarC;
                    return audioTrackT;
                } catch (AudioSink.InitializationException e11) {
                    e10.addSuppressed(e11);
                    j0();
                    throw e10;
                }
            }
            j0();
            throw e10;
        }
    }

    private void V(long j10) throws T, AudioSink.WriteException {
        int iB0;
        AudioSink.b bVar;
        if (this.f26650T == null || this.f26681n.b()) {
            return;
        }
        int iRemaining = this.f26650T.remaining();
        if (this.f26662c0) {
            C1804a.g(j10 != -9223372036854775807L);
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f26664d0;
            } else {
                this.f26664d0 = j10;
            }
            iB0 = C0(this.f26691x, this.f26650T, iRemaining, j10);
        } else {
            iB0 = B0(this.f26691x, this.f26650T, iRemaining);
        }
        this.f26666e0 = SystemClock.elapsedRealtime();
        if (iB0 < 0) {
            if (e0(iB0)) {
                if (a0() > 0) {
                    z = true;
                } else if (g0(this.f26691x)) {
                    j0();
                    z = true;
                }
            }
            AudioSink.WriteException writeException = new AudioSink.WriteException(iB0, this.f26689v.f26706a, z);
            AudioSink.b bVar2 = this.f26687t;
            if (bVar2 != null) {
                bVar2.f(writeException);
            }
            if (writeException.f26619C) {
                this.f26692y = androidx.media3.exoplayer.audio.a.f26737c;
                throw writeException;
            }
            this.f26681n.c(writeException);
            return;
        }
        this.f26681n.a();
        if (g0(this.f26691x)) {
            if (this.f26642L > 0) {
                this.f26670g0 = false;
            }
            if (this.f26654X && (bVar = this.f26687t) != null && iB0 < iRemaining && !this.f26670g0) {
                bVar.g();
            }
        }
        int i10 = this.f26689v.f26708c;
        if (i10 == 0) {
            this.f26641K += iB0;
        }
        if (iB0 == iRemaining) {
            if (i10 != 0) {
                C1804a.g(this.f26650T == this.f26648R);
                this.f26642L += this.f26643M * this.f26649S;
            }
            this.f26650T = null;
        }
    }

    private boolean W() throws T, AudioSink.WriteException {
        if (!this.f26690w.f()) {
            V(Long.MIN_VALUE);
            return this.f26650T == null;
        }
        this.f26690w.h();
        p0(Long.MIN_VALUE);
        if (!this.f26690w.e()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f26650T;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private static int X(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        C1804a.g(minBufferSize != -2);
        return minBufferSize;
    }

    private static int Y(int i10, ByteBuffer byteBuffer) {
        if (i10 == 20) {
            return H.h(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iM = F.m(L.P(byteBuffer, byteBuffer.position()));
                    if (iM != -1) {
                        return iM;
                    }
                    throw new IllegalArgumentException();
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    return 1024;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int iB = C4796b.b(byteBuffer);
                            if (iB == -1) {
                                return 0;
                            }
                            return C4796b.i(byteBuffer, iB) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return C4797c.e(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i10);
                    }
            }
            return C4796b.e(byteBuffer);
        }
        return C4809o.f(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long Z() {
        return this.f26689v.f26708c == 0 ? this.f26639I / r0.f26707b : this.f26640J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a0() {
        return this.f26689v.f26708c == 0 ? L.l(this.f26641K, r0.f26709d) : this.f26642L;
    }

    private void b0(long j10) {
        this.f26676j0 += j10;
        if (this.f26678k0 == null) {
            this.f26678k0 = new Handler(Looper.myLooper());
        }
        this.f26678k0.removeCallbacksAndMessages(null);
        this.f26678k0.postDelayed(new Runnable() { // from class: f2.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f41266B.l0();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c0() {
        boolean z10;
        synchronized (f26628m0) {
            z10 = f26630o0 > 0;
        }
        return z10;
    }

    private boolean d0() throws AudioSink.InitializationException {
        androidx.media3.exoplayer.audio.b bVar;
        v1 v1Var;
        if (this.f26680m.b()) {
            return false;
        }
        AudioTrack audioTrackU = U();
        this.f26691x = audioTrackU;
        if (g0(audioTrackU)) {
            q0(this.f26691x);
            h hVar = this.f26689v;
            if (hVar.f26716k) {
                AudioTrack audioTrack = this.f26691x;
                s sVar = hVar.f26706a;
                audioTrack.setOffloadDelayPadding(sVar.f17140G, sVar.f17141H);
            }
        }
        int i10 = L.f18626a;
        if (i10 >= 31 && (v1Var = this.f26686s) != null) {
            c.a(this.f26691x, v1Var);
        }
        this.f26656Z = this.f26691x.getAudioSessionId();
        androidx.media3.exoplayer.audio.g gVar = this.f26671h;
        AudioTrack audioTrack2 = this.f26691x;
        h hVar2 = this.f26689v;
        gVar.r(audioTrack2, hVar2.f26708c == 2, hVar2.f26712g, hVar2.f26709d, hVar2.f26713h);
        w0();
        int i11 = this.f26658a0.f17044a;
        if (i11 != 0) {
            this.f26691x.attachAuxEffect(i11);
            this.f26691x.setAuxEffectSendLevel(this.f26658a0.f17045b);
        }
        androidx.media3.exoplayer.audio.c cVar = this.f26660b0;
        if (cVar != null && i10 >= 23) {
            b.a(this.f26691x, cVar);
            androidx.media3.exoplayer.audio.b bVar2 = this.f26693z;
            if (bVar2 != null) {
                bVar2.i(this.f26660b0.f26761a);
            }
        }
        if (i10 >= 24 && (bVar = this.f26693z) != null) {
            this.f26631A = new k(this.f26691x, bVar);
        }
        this.f26645O = true;
        AudioSink.b bVar3 = this.f26687t;
        if (bVar3 != null) {
            bVar3.a(this.f26689v.a());
        }
        return true;
    }

    private static boolean e0(int i10) {
        return (L.f18626a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean f0() {
        return this.f26691x != null;
    }

    private static boolean g0(AudioTrack audioTrack) {
        return L.f18626a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i0(AudioTrack audioTrack, final AudioSink.b bVar, Handler handler, final AudioSink.a aVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (bVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: f2.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.b(aVar);
                    }
                });
            }
            synchronized (f26628m0) {
                try {
                    int i10 = f26630o0 - 1;
                    f26630o0 = i10;
                    if (i10 == 0) {
                        f26629n0.shutdown();
                        f26629n0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (bVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: f2.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.b(aVar);
                    }
                });
            }
            synchronized (f26628m0) {
                try {
                    int i11 = f26630o0 - 1;
                    f26630o0 = i11;
                    if (i11 == 0) {
                        f26629n0.shutdown();
                        f26629n0 = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    private void j0() {
        if (this.f26689v.f()) {
            this.f26668f0 = true;
        }
    }

    private ByteBuffer k0(ByteBuffer byteBuffer) {
        if (this.f26689v.f26708c != 0) {
            return byteBuffer;
        }
        int iF = (int) L.F(L.Q0(20L), this.f26689v.f26710e);
        long jA0 = a0();
        if (jA0 >= iF) {
            return byteBuffer;
        }
        h hVar = this.f26689v;
        return J.a(byteBuffer, hVar.f26712g, hVar.f26709d, (int) jA0, iF);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        if (this.f26676j0 >= 300000) {
            this.f26687t.d();
            this.f26676j0 = 0L;
        }
    }

    private void m0() {
        if (this.f26693z != null || this.f26657a == null) {
            return;
        }
        this.f26672h0 = Looper.myLooper();
        androidx.media3.exoplayer.audio.b bVar = new androidx.media3.exoplayer.audio.b(this.f26657a, new b.f() { // from class: f2.A
            @Override // androidx.media3.exoplayer.audio.b.f
            public final void a(androidx.media3.exoplayer.audio.a aVar) {
                this.f41210a.n0(aVar);
            }
        }, this.f26632B, this.f26660b0);
        this.f26693z = bVar;
        this.f26692y = bVar.g();
    }

    private void o0() throws IllegalStateException {
        if (this.f26652V) {
            return;
        }
        this.f26652V = true;
        this.f26671h.f(a0());
        if (g0(this.f26691x)) {
            this.f26653W = false;
        }
        this.f26691x.stop();
        this.f26638H = 0;
    }

    private void p0(long j10) throws T, AudioSink.WriteException {
        V(j10);
        if (this.f26650T != null) {
            return;
        }
        if (!this.f26690w.f()) {
            ByteBuffer byteBuffer = this.f26648R;
            if (byteBuffer != null) {
                v0(byteBuffer);
                V(j10);
                return;
            }
            return;
        }
        while (!this.f26690w.e()) {
            do {
                ByteBuffer byteBufferD = this.f26690w.d();
                if (byteBufferD.hasRemaining()) {
                    v0(byteBufferD);
                    V(j10);
                } else {
                    ByteBuffer byteBuffer2 = this.f26648R;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f26690w.i(this.f26648R);
                    }
                }
            } while (this.f26650T == null);
            return;
        }
    }

    private void q0(AudioTrack audioTrack) {
        if (this.f26679l == null) {
            this.f26679l = new n();
        }
        this.f26679l.a(audioTrack);
    }

    private static void r0(final AudioTrack audioTrack, final AudioSink.b bVar, final AudioSink.a aVar) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f26628m0) {
            try {
                if (f26629n0 == null) {
                    f26629n0 = L.S0("ExoPlayer:AudioTrackReleaseThread");
                }
                f26630o0++;
                f26629n0.schedule(new Runnable() { // from class: f2.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink.i0(audioTrack, bVar, handler, aVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void s0() {
        this.f26639I = 0L;
        this.f26640J = 0L;
        this.f26641K = 0L;
        this.f26642L = 0L;
        this.f26670g0 = false;
        this.f26643M = 0;
        this.f26634D = new j(this.f26635E, 0L, 0L);
        this.f26646P = 0L;
        this.f26633C = null;
        this.f26673i.clear();
        this.f26648R = null;
        this.f26649S = 0;
        this.f26650T = null;
        this.f26652V = false;
        this.f26651U = false;
        this.f26653W = false;
        this.f26637G = null;
        this.f26638H = 0;
        this.f26665e.o();
        x0();
    }

    private void t0(A a10) {
        j jVar = new j(a10, -9223372036854775807L, -9223372036854775807L);
        if (f0()) {
            this.f26633C = jVar;
        } else {
            this.f26634D = jVar;
        }
    }

    private void u0() {
        if (f0()) {
            try {
                this.f26691x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f26635E.f16775a).setPitch(this.f26635E.f16776b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                X1.n.i("DefaultAudioSink", "Failed to set playback params", e10);
            }
            A a10 = new A(this.f26691x.getPlaybackParams().getSpeed(), this.f26691x.getPlaybackParams().getPitch());
            this.f26635E = a10;
            this.f26671h.s(a10.f16775a);
        }
    }

    private void v0(ByteBuffer byteBuffer) {
        C1804a.g(this.f26650T == null);
        if (byteBuffer.hasRemaining()) {
            this.f26650T = k0(byteBuffer);
        }
    }

    private void w0() {
        if (f0()) {
            this.f26691x.setVolume(this.f26647Q);
        }
    }

    private void x0() {
        androidx.media3.common.audio.a aVar = this.f26689v.f26714i;
        this.f26690w = aVar;
        aVar.b();
    }

    private boolean y0() {
        if (!this.f26662c0) {
            h hVar = this.f26689v;
            if (hVar.f26708c == 0 && !z0(hVar.f26706a.f17139F)) {
                return true;
            }
        }
        return false;
    }

    private boolean z0(int i10) {
        return this.f26661c && L.E0(i10);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void A() throws IllegalStateException {
        C1804a.g(this.f26655Y);
        if (this.f26662c0) {
            return;
        }
        this.f26662c0 = true;
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.exoplayer.audio.d B(s sVar) {
        return this.f26668f0 ? androidx.media3.exoplayer.audio.d.f26762d : this.f26683p.a(sVar, this.f26632B);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean C(ByteBuffer byteBuffer, long j10, int i10) throws IllegalStateException, T, AudioSink.WriteException, AudioSink.InitializationException {
        ByteBuffer byteBuffer2 = this.f26648R;
        C1804a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f26688u != null) {
            if (!W()) {
                return false;
            }
            if (this.f26688u.b(this.f26689v)) {
                this.f26689v = this.f26688u;
                this.f26688u = null;
                AudioTrack audioTrack = this.f26691x;
                if (audioTrack != null && g0(audioTrack) && this.f26689v.f26716k) {
                    if (this.f26691x.getPlayState() == 3) {
                        this.f26691x.setOffloadEndOfStream();
                        this.f26671h.a();
                    }
                    AudioTrack audioTrack2 = this.f26691x;
                    s sVar = this.f26689v.f26706a;
                    audioTrack2.setOffloadDelayPadding(sVar.f17140G, sVar.f17141H);
                    this.f26670g0 = true;
                }
            } else {
                o0();
                if (l()) {
                    return false;
                }
                flush();
            }
            P(j10);
        }
        if (!f0()) {
            try {
                if (!d0()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e10) {
                if (e10.f26614C) {
                    throw e10;
                }
                this.f26680m.c(e10);
                return false;
            }
        }
        this.f26680m.a();
        if (this.f26645O) {
            this.f26646P = Math.max(0L, j10);
            this.f26644N = false;
            this.f26645O = false;
            if (A0()) {
                u0();
            }
            P(j10);
            if (this.f26654X) {
                j();
            }
        }
        if (!this.f26671h.j(a0())) {
            return false;
        }
        if (this.f26648R == null) {
            C1804a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            h hVar = this.f26689v;
            if (hVar.f26708c != 0 && this.f26643M == 0) {
                int iY = Y(hVar.f26712g, byteBuffer);
                this.f26643M = iY;
                if (iY == 0) {
                    return true;
                }
            }
            if (this.f26633C != null) {
                if (!W()) {
                    return false;
                }
                P(j10);
                this.f26633C = null;
            }
            long jE = this.f26646P + this.f26689v.e(Z() - this.f26665e.n());
            if (!this.f26644N && Math.abs(jE - j10) > 200000) {
                AudioSink.b bVar = this.f26687t;
                if (bVar != null) {
                    bVar.f(new AudioSink.UnexpectedDiscontinuityException(j10, jE));
                }
                this.f26644N = true;
            }
            if (this.f26644N) {
                if (!W()) {
                    return false;
                }
                long j11 = j10 - jE;
                this.f26646P += j11;
                this.f26644N = false;
                P(j10);
                AudioSink.b bVar2 = this.f26687t;
                if (bVar2 != null && j11 != 0) {
                    bVar2.j();
                }
            }
            if (this.f26689v.f26708c == 0) {
                this.f26639I += byteBuffer.remaining();
            } else {
                this.f26640J += this.f26643M * i10;
            }
            this.f26648R = byteBuffer;
            this.f26649S = i10;
        }
        p0(j10);
        if (!this.f26648R.hasRemaining()) {
            this.f26648R = null;
            this.f26649S = 0;
            return true;
        }
        if (!this.f26671h.i(a0())) {
            return false;
        }
        X1.n.h("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void D(boolean z10) {
        this.f26636F = z10;
        t0(A0() ? A.f16772d : this.f26635E);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean a(s sVar) {
        return p(sVar) != 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void b() throws IllegalStateException {
        flush();
        j0<AudioProcessor> it = this.f26667f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        j0<AudioProcessor> it2 = this.f26669g.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
        androidx.media3.common.audio.a aVar = this.f26690w;
        if (aVar != null) {
            aVar.j();
        }
        this.f26654X = false;
        this.f26668f0 = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void c() {
        androidx.media3.exoplayer.audio.b bVar = this.f26693z;
        if (bVar != null) {
            bVar.j();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean d() {
        return !f0() || (this.f26651U && !l());
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void e(A a10) {
        this.f26635E = new A(L.o(a10.f16775a, 0.1f, 8.0f), L.o(a10.f16776b, 0.1f, 8.0f));
        if (A0()) {
            u0();
        } else {
            t0(a10);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void f() throws IllegalStateException {
        this.f26654X = false;
        if (f0()) {
            if (this.f26671h.o() || g0(this.f26691x)) {
                this.f26691x.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() throws IllegalStateException {
        k kVar;
        if (f0()) {
            s0();
            if (this.f26671h.h()) {
                this.f26691x.pause();
            }
            if (g0(this.f26691x)) {
                ((n) C1804a.e(this.f26679l)).b(this.f26691x);
            }
            AudioSink.a aVarA = this.f26689v.a();
            h hVar = this.f26688u;
            if (hVar != null) {
                this.f26689v = hVar;
                this.f26688u = null;
            }
            this.f26671h.p();
            if (L.f18626a >= 24 && (kVar = this.f26631A) != null) {
                kVar.c();
                this.f26631A = null;
            }
            r0(this.f26691x, this.f26687t, aVarA);
            this.f26691x = null;
        }
        this.f26681n.a();
        this.f26680m.a();
        this.f26674i0 = 0L;
        this.f26676j0 = 0L;
        Handler handler = this.f26678k0;
        if (handler != null) {
            ((Handler) C1804a.e(handler)).removeCallbacksAndMessages(null);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void g(InterfaceC1807d interfaceC1807d) {
        this.f26671h.t(interfaceC1807d);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public A h() {
        return this.f26635E;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void i(AudioDeviceInfo audioDeviceInfo) {
        this.f26660b0 = audioDeviceInfo == null ? null : new androidx.media3.exoplayer.audio.c(audioDeviceInfo);
        androidx.media3.exoplayer.audio.b bVar = this.f26693z;
        if (bVar != null) {
            bVar.i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f26691x;
        if (audioTrack != null) {
            b.a(audioTrack, this.f26660b0);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void j() throws IllegalStateException {
        this.f26654X = true;
        if (f0()) {
            this.f26671h.u();
            this.f26691x.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void k() throws IllegalStateException {
        if (!this.f26651U && f0() && W()) {
            o0();
            this.f26651U = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean l() {
        return f0() && !(L.f18626a >= 29 && this.f26691x.isOffloadedPlayback() && this.f26653W) && this.f26671h.g(a0());
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void m(C1727c c1727c) throws IllegalStateException {
        if (this.f26632B.equals(c1727c)) {
            return;
        }
        this.f26632B = c1727c;
        if (this.f26662c0) {
            return;
        }
        androidx.media3.exoplayer.audio.b bVar = this.f26693z;
        if (bVar != null) {
            bVar.h(c1727c);
        }
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void n(v1 v1Var) {
        this.f26686s = v1Var;
    }

    public void n0(androidx.media3.exoplayer.audio.a aVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f26672h0;
        if (looper == looperMyLooper) {
            if (aVar.equals(this.f26692y)) {
                return;
            }
            this.f26692y = aVar;
            AudioSink.b bVar = this.f26687t;
            if (bVar != null) {
                bVar.i();
                return;
            }
            return;
        }
        String name = looper == null ? "null" : looper.getThread().getName();
        throw new IllegalStateException("Current looper (" + (looperMyLooper != null ? looperMyLooper.getThread().getName() : "null") + ") is not the playback looper (" + name + ")");
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void o(int i10) throws IllegalStateException {
        if (this.f26656Z != i10) {
            this.f26656Z = i10;
            this.f26655Y = i10 != 0;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int p(s sVar) {
        m0();
        if (!"audio/raw".equals(sVar.f17162o)) {
            return this.f26692y.k(sVar, this.f26632B) ? 2 : 0;
        }
        if (L.F0(sVar.f17139F)) {
            int i10 = sVar.f17139F;
            return (i10 == 2 || (this.f26661c && i10 == 4)) ? 2 : 1;
        }
        X1.n.h("DefaultAudioSink", "Invalid PCM encoding: " + sVar.f17139F);
        return 0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void q(int i10, int i11) {
        h hVar;
        AudioTrack audioTrack = this.f26691x;
        if (audioTrack == null || !g0(audioTrack) || (hVar = this.f26689v) == null || !hVar.f26716k) {
            return;
        }
        this.f26691x.setOffloadDelayPadding(i10, i11);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void r(AudioSink.b bVar) {
        this.f26687t = bVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void s(int i10) {
        C1804a.g(L.f18626a >= 29);
        this.f26677k = i10;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long t(boolean z10) {
        if (!f0() || this.f26645O) {
            return Long.MIN_VALUE;
        }
        return R(Q(Math.min(this.f26671h.c(z10), this.f26689v.d(a0()))));
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void u() throws IllegalStateException {
        if (this.f26662c0) {
            this.f26662c0 = false;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void v(s sVar, int i10, int[] iArr) throws AudioSink.ConfigurationException {
        androidx.media3.common.audio.a aVar;
        int iI0;
        int iI02;
        boolean z10;
        int i11;
        int iIntValue;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int iA;
        m0();
        if ("audio/raw".equals(sVar.f17162o)) {
            C1804a.a(L.F0(sVar.f17139F));
            iI0 = L.i0(sVar.f17139F, sVar.f17137D);
            AbstractC4009y.a aVar2 = new AbstractC4009y.a();
            if (z0(sVar.f17139F)) {
                aVar2.j(this.f26669g);
            } else {
                aVar2.j(this.f26667f);
                aVar2.i(this.f26659b.e());
            }
            androidx.media3.common.audio.a aVar3 = new androidx.media3.common.audio.a(aVar2.k());
            if (aVar3.equals(this.f26690w)) {
                aVar3 = this.f26690w;
            }
            this.f26665e.p(sVar.f17140G, sVar.f17141H);
            this.f26663d.n(iArr);
            try {
                AudioProcessor.a aVarA = aVar3.a(new AudioProcessor.a(sVar));
                int i18 = aVarA.f26043c;
                int i19 = aVarA.f26041a;
                int iM = L.M(aVarA.f26042b);
                i13 = 0;
                z10 = false;
                iI02 = L.i0(i18, aVarA.f26042b);
                aVar = aVar3;
                i11 = i19;
                iIntValue = iM;
                z11 = this.f26675j;
                i12 = i18;
            } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                throw new AudioSink.ConfigurationException(e10, sVar);
            }
        } else {
            androidx.media3.common.audio.a aVar4 = new androidx.media3.common.audio.a(AbstractC4009y.G());
            int i20 = sVar.f17138E;
            androidx.media3.exoplayer.audio.d dVarB = this.f26677k != 0 ? B(sVar) : androidx.media3.exoplayer.audio.d.f26762d;
            if (this.f26677k == 0 || !dVarB.f26763a) {
                Pair<Integer, Integer> pairI = this.f26692y.i(sVar, this.f26632B);
                if (pairI == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + sVar, sVar);
                }
                int iIntValue2 = ((Integer) pairI.first).intValue();
                aVar = aVar4;
                iI0 = -1;
                iI02 = -1;
                z10 = false;
                i11 = i20;
                iIntValue = ((Integer) pairI.second).intValue();
                i12 = iIntValue2;
                z11 = this.f26675j;
                i13 = 2;
            } else {
                int iF = z.f((String) C1804a.e(sVar.f17162o), sVar.f17158k);
                int iM2 = L.M(sVar.f17137D);
                aVar = aVar4;
                i13 = 1;
                z11 = true;
                iI0 = -1;
                iI02 = -1;
                i11 = i20;
                z10 = dVarB.f26764b;
                i12 = iF;
                iIntValue = iM2;
            }
        }
        if (i12 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i13 + ") for: " + sVar, sVar);
        }
        if (iIntValue == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i13 + ") for: " + sVar, sVar);
        }
        int i21 = sVar.f17157j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(sVar.f17162o) && i21 == -1) {
            i21 = 768000;
        }
        int i22 = i21;
        if (i10 != 0) {
            iA = i10;
            i14 = i12;
            i15 = iIntValue;
            i16 = iI02;
            i17 = i11;
        } else {
            i14 = i12;
            i15 = iIntValue;
            i16 = iI02;
            i17 = i11;
            iA = this.f26682o.a(X(i11, iIntValue, i12), i12, i13, iI02 != -1 ? iI02 : 1, i11, i22, z11 ? 8.0d : 1.0d);
        }
        this.f26668f0 = false;
        h hVar = new h(sVar, iI0, i13, i16, i17, i15, i14, iA, aVar, z11, z10, this.f26662c0);
        if (f0()) {
            this.f26688u = hVar;
        } else {
            this.f26689v = hVar;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void x() {
        this.f26644N = true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void y(float f10) {
        if (this.f26647Q != f10) {
            this.f26647Q = f10;
            w0();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void z(C1730f c1730f) {
        if (this.f26658a0.equals(c1730f)) {
            return;
        }
        int i10 = c1730f.f17044a;
        float f10 = c1730f.f17045b;
        AudioTrack audioTrack = this.f26691x;
        if (audioTrack != null) {
            if (this.f26658a0.f17044a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f26691x.setAuxEffectSendLevel(f10);
            }
        }
        this.f26658a0 = c1730f;
    }

    private DefaultAudioSink(g gVar) {
        Context context = gVar.f26696a;
        this.f26657a = context;
        C1727c c1727c = C1727c.f17026g;
        this.f26632B = c1727c;
        this.f26692y = context != null ? androidx.media3.exoplayer.audio.a.e(context, c1727c, null) : gVar.f26697b;
        this.f26659b = gVar.f26698c;
        this.f26661c = gVar.f26699d;
        this.f26675j = L.f18626a >= 23 && gVar.f26700e;
        this.f26677k = 0;
        this.f26682o = gVar.f26702g;
        this.f26683p = (d) C1804a.e(gVar.f26704i);
        this.f26671h = new androidx.media3.exoplayer.audio.g(new m());
        androidx.media3.exoplayer.audio.h hVar = new androidx.media3.exoplayer.audio.h();
        this.f26663d = hVar;
        o oVar = new o();
        this.f26665e = oVar;
        this.f26667f = AbstractC4009y.J(new androidx.media3.common.audio.e(), hVar, oVar);
        this.f26669g = AbstractC4009y.H(new androidx.media3.exoplayer.audio.n());
        this.f26647Q = 1.0f;
        this.f26656Z = 0;
        this.f26658a0 = new C1730f(0, 0.0f);
        A a10 = A.f16772d;
        this.f26634D = new j(a10, 0L, 0L);
        this.f26635E = a10;
        this.f26636F = false;
        this.f26673i = new ArrayDeque<>();
        this.f26680m = new l<>();
        this.f26681n = new l<>();
        this.f26684q = gVar.f26705j;
        this.f26685r = gVar.f26703h;
    }
}
