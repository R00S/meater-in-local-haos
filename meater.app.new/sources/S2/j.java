package S2;

import X1.C1804a;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes.dex */
public abstract class j extends c2.f<o, p, SubtitleDecoderException> implements l {

    /* renamed from: o, reason: collision with root package name */
    private final String f15272o;

    /* compiled from: SimpleSubtitleDecoder.java */
    class a extends p {
        a() {
        }

        @Override // c2.e
        public void C() {
            j.this.u(this);
        }
    }

    protected j(String str) {
        super(new o[2], new p[2]);
        this.f15272o = str;
        x(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c2.f
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final p k() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c2.f
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException l(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    protected abstract k C(byte[] bArr, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c2.f
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException m(o oVar, p pVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C1804a.e(oVar.f26293E);
            pVar.D(oVar.f26295G, C(byteBuffer.array(), byteBuffer.limit(), z10), oVar.f15288K);
            pVar.f30931E = false;
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c2.f
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final o j() {
        return new o();
    }

    @Override // S2.l
    public void d(long j10) {
    }
}
