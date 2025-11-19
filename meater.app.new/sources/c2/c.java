package c2;

import X1.C1804a;
import X1.L;
import android.media.MediaCodec;

/* compiled from: CryptoInfo.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f30917a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f30918b;

    /* renamed from: c, reason: collision with root package name */
    public int f30919c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f30920d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f30921e;

    /* renamed from: f, reason: collision with root package name */
    public int f30922f;

    /* renamed from: g, reason: collision with root package name */
    public int f30923g;

    /* renamed from: h, reason: collision with root package name */
    public int f30924h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f30925i;

    /* renamed from: j, reason: collision with root package name */
    private final b f30926j;

    /* compiled from: CryptoInfo.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f30927a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f30928b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f30928b.set(i10, i11);
            this.f30927a.setPattern(this.f30928b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f30927a = cryptoInfo;
            this.f30928b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f30925i = cryptoInfo;
        this.f30926j = L.f18626a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f30925i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f30920d == null) {
            int[] iArr = new int[1];
            this.f30920d = iArr;
            this.f30925i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f30920d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f30922f = i10;
        this.f30920d = iArr;
        this.f30921e = iArr2;
        this.f30918b = bArr;
        this.f30917a = bArr2;
        this.f30919c = i11;
        this.f30923g = i12;
        this.f30924h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f30925i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (L.f18626a >= 24) {
            ((b) C1804a.e(this.f30926j)).b(i12, i13);
        }
    }
}
