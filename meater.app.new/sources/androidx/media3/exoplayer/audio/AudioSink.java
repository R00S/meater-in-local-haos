package androidx.media3.exoplayer.audio;

import U1.A;
import U1.C1727c;
import U1.C1730f;
import U1.s;
import X1.InterfaceC1807d;
import android.media.AudioDeviceInfo;
import e2.v1;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface AudioSink {

    public static final class UnexpectedDiscontinuityException extends Exception {

        /* renamed from: B, reason: collision with root package name */
        public final long f26616B;

        /* renamed from: C, reason: collision with root package name */
        public final long f26617C;

        public UnexpectedDiscontinuityException(long j10, long j11) {
            super("Unexpected audio track timestamp discontinuity: expected " + j11 + ", got " + j10);
            this.f26616B = j10;
            this.f26617C = j11;
        }
    }

    public static final class WriteException extends Exception {

        /* renamed from: B, reason: collision with root package name */
        public final int f26618B;

        /* renamed from: C, reason: collision with root package name */
        public final boolean f26619C;

        /* renamed from: D, reason: collision with root package name */
        public final s f26620D;

        public WriteException(int i10, s sVar, boolean z10) {
            super("AudioTrack write failed: " + i10);
            this.f26619C = z10;
            this.f26618B = i10;
            this.f26620D = sVar;
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f26621a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26622b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26623c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f26624d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f26625e;

        /* renamed from: f, reason: collision with root package name */
        public final int f26626f;

        public a(int i10, int i11, int i12, boolean z10, boolean z11, int i13) {
            this.f26621a = i10;
            this.f26622b = i11;
            this.f26623c = i12;
            this.f26624d = z10;
            this.f26625e = z11;
            this.f26626f = i13;
        }
    }

    void A();

    default d B(s sVar) {
        return d.f26762d;
    }

    boolean C(ByteBuffer byteBuffer, long j10, int i10);

    void D(boolean z10);

    boolean a(s sVar);

    void b();

    boolean d();

    void e(A a10);

    void f();

    void flush();

    A h();

    void j();

    void k();

    boolean l();

    void m(C1727c c1727c);

    void o(int i10);

    int p(s sVar);

    void r(b bVar);

    long t(boolean z10);

    void u();

    void v(s sVar, int i10, int[] iArr);

    void x();

    void y(float f10);

    void z(C1730f c1730f);

    public static final class ConfigurationException extends Exception {

        /* renamed from: B, reason: collision with root package name */
        public final s f26612B;

        public ConfigurationException(Throwable th, s sVar) {
            super(th);
            this.f26612B = sVar;
        }

        public ConfigurationException(String str, s sVar) {
            super(str);
            this.f26612B = sVar;
        }
    }

    public static final class InitializationException extends Exception {

        /* renamed from: B, reason: collision with root package name */
        public final int f26613B;

        /* renamed from: C, reason: collision with root package name */
        public final boolean f26614C;

        /* renamed from: D, reason: collision with root package name */
        public final s f26615D;

        public InitializationException(String str, int i10, s sVar, boolean z10, Throwable th) {
            super(str, th);
            this.f26613B = i10;
            this.f26614C = z10;
            this.f26615D = sVar;
        }

        public InitializationException(int i10, int i11, int i12, int i13, s sVar, boolean z10, Exception exc) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(")");
            sb2.append(" ");
            sb2.append(sVar);
            sb2.append(z10 ? " (recoverable)" : "");
            this(sb2.toString(), i10, sVar, z10, exc);
        }
    }

    public interface b {
        void e(boolean z10);

        void h(int i10, long j10, long j11);

        void j();

        default void d() {
        }

        default void g() {
        }

        default void i() {
        }

        default void k() {
        }

        default void a(a aVar) {
        }

        default void b(a aVar) {
        }

        default void c(long j10) {
        }

        default void f(Exception exc) {
        }
    }

    default void c() {
    }

    default void g(InterfaceC1807d interfaceC1807d) {
    }

    default void i(AudioDeviceInfo audioDeviceInfo) {
    }

    default void n(v1 v1Var) {
    }

    default void s(int i10) {
    }

    default void w(long j10) {
    }

    default void q(int i10, int i11) {
    }
}
