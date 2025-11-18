package j2;

import U1.s;
import U1.z;
import X1.C1804a;
import X1.L;
import a2.C1885b;
import android.graphics.Bitmap;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.u0;
import c2.f;
import j2.InterfaceC3733c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: BitmapFactoryImageDecoder.java */
/* renamed from: j2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3731a extends f<DecoderInputBuffer, AbstractC3734d, ImageDecoderException> implements InterfaceC3733c {

    /* renamed from: o, reason: collision with root package name */
    private final b f43476o;

    /* compiled from: BitmapFactoryImageDecoder.java */
    /* renamed from: j2.a$a, reason: collision with other inner class name */
    class C0556a extends AbstractC3734d {
        C0556a() {
        }

        @Override // c2.e
        public void C() {
            C3731a.this.u(this);
        }
    }

    /* compiled from: BitmapFactoryImageDecoder.java */
    /* renamed from: j2.a$b */
    public interface b {
        Bitmap a(byte[] bArr, int i10);
    }

    /* compiled from: BitmapFactoryImageDecoder.java */
    /* renamed from: j2.a$c */
    public static final class c implements InterfaceC3733c.a {

        /* renamed from: b, reason: collision with root package name */
        private final b f43478b = new b() { // from class: j2.b
            @Override // j2.C3731a.b
            public final Bitmap a(byte[] bArr, int i10) {
                return C3731a.y(bArr, i10);
            }
        };

        @Override // j2.InterfaceC3733c.a
        public int a(s sVar) {
            String str = sVar.f17162o;
            return (str == null || !z.p(str)) ? u0.G(0) : L.D0(sVar.f17162o) ? u0.G(4) : u0.G(1);
        }

        @Override // j2.InterfaceC3733c.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C3731a b() {
            return new C3731a(this.f43478b, null);
        }
    }

    /* synthetic */ C3731a(b bVar, C0556a c0556a) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap C(byte[] bArr, int i10) throws ImageDecoderException {
        try {
            return C1885b.a(bArr, i10, null, -1);
        } catch (ParserException e10) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new ImageDecoderException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bitmap y(byte[] bArr, int i10) {
        return C(bArr, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c2.f
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public AbstractC3734d k() {
        return new C0556a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c2.f
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException l(Throwable th) {
        return new ImageDecoderException("Unexpected decode error", th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c2.f
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public ImageDecoderException m(DecoderInputBuffer decoderInputBuffer, AbstractC3734d abstractC3734d, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C1804a.e(decoderInputBuffer.f26293E);
            C1804a.g(byteBuffer.hasArray());
            C1804a.a(byteBuffer.arrayOffset() == 0);
            abstractC3734d.f43480F = this.f43476o.a(byteBuffer.array(), byteBuffer.remaining());
            abstractC3734d.f30929C = decoderInputBuffer.f26295G;
            return null;
        } catch (ImageDecoderException e10) {
            return e10;
        }
    }

    @Override // c2.f, c2.d
    public /* bridge */ /* synthetic */ AbstractC3734d a() {
        return (AbstractC3734d) super.a();
    }

    @Override // c2.f
    protected DecoderInputBuffer j() {
        return new DecoderInputBuffer(1);
    }

    private C3731a(b bVar) {
        super(new DecoderInputBuffer[1], new AbstractC3734d[1]);
        this.f43476o = bVar;
    }
}
