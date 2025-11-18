package androidx.media3.common.audio;

import U1.s;
import X1.L;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import l8.C3918k;

/* loaded from: classes.dex */
public interface AudioProcessor {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f26038a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {

        /* renamed from: B, reason: collision with root package name */
        public final a f26039B;

        public UnhandledAudioFormatException(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public UnhandledAudioFormatException(String str, a aVar) {
            super(str + " " + aVar);
            this.f26039B = aVar;
        }
    }

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f26040e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f26041a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26042b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26043c;

        /* renamed from: d, reason: collision with root package name */
        public final int f26044d;

        public a(s sVar) {
            this(sVar.f17138E, sVar.f17137D, sVar.f17139F);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f26041a == aVar.f26041a && this.f26042b == aVar.f26042b && this.f26043c == aVar.f26043c;
        }

        public int hashCode() {
            return C3918k.b(Integer.valueOf(this.f26041a), Integer.valueOf(this.f26042b), Integer.valueOf(this.f26043c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f26041a + ", channelCount=" + this.f26042b + ", encoding=" + this.f26043c + ']';
        }

        public a(int i10, int i11, int i12) {
            this.f26041a = i10;
            this.f26042b = i11;
            this.f26043c = i12;
            this.f26044d = L.F0(i12) ? L.i0(i12, i11) : -1;
        }
    }

    boolean a();

    void b();

    boolean d();

    ByteBuffer e();

    void f(ByteBuffer byteBuffer);

    void flush();

    void g();

    a h(a aVar);
}
