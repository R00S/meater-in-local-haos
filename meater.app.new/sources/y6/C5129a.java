package y6;

import H6.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import l6.C3904c;
import l6.C3905d;
import l6.C3906e;
import l6.InterfaceC3902a;
import m6.C3972g;
import m6.EnumC3967b;
import m6.InterfaceC3974i;
import p6.InterfaceC4237b;
import p6.InterfaceC4239d;
import u6.C4684j;

/* compiled from: ByteBufferGifDecoder.java */
/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5129a implements InterfaceC3974i<ByteBuffer, C5131c> {

    /* renamed from: f, reason: collision with root package name */
    private static final C0780a f53142f = new C0780a();

    /* renamed from: g, reason: collision with root package name */
    private static final b f53143g = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Context f53144a;

    /* renamed from: b, reason: collision with root package name */
    private final List<ImageHeaderParser> f53145b;

    /* renamed from: c, reason: collision with root package name */
    private final b f53146c;

    /* renamed from: d, reason: collision with root package name */
    private final C0780a f53147d;

    /* renamed from: e, reason: collision with root package name */
    private final C5130b f53148e;

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: y6.a$a, reason: collision with other inner class name */
    static class C0780a {
        C0780a() {
        }

        InterfaceC3902a a(InterfaceC3902a.InterfaceC0591a interfaceC0591a, C3904c c3904c, ByteBuffer byteBuffer, int i10) {
            return new C3906e(interfaceC0591a, c3904c, byteBuffer, i10);
        }
    }

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: y6.a$b */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue<C3905d> f53149a = l.f(0);

        b() {
        }

        synchronized C3905d a(ByteBuffer byteBuffer) {
            C3905d c3905dPoll;
            try {
                c3905dPoll = this.f53149a.poll();
                if (c3905dPoll == null) {
                    c3905dPoll = new C3905d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return c3905dPoll.p(byteBuffer);
        }

        synchronized void b(C3905d c3905d) {
            c3905d.a();
            this.f53149a.offer(c3905d);
        }
    }

    public C5129a(Context context, List<ImageHeaderParser> list, InterfaceC4239d interfaceC4239d, InterfaceC4237b interfaceC4237b) {
        this(context, list, interfaceC4239d, interfaceC4237b, f53143g, f53142f);
    }

    private e c(ByteBuffer byteBuffer, int i10, int i11, C3905d c3905d, C3972g c3972g) {
        long jB = H6.g.b();
        try {
            C3904c c3904cC = c3905d.c();
            if (c3904cC.b() > 0 && c3904cC.c() == 0) {
                Bitmap.Config config = c3972g.c(i.f53189a) == EnumC3967b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC3902a interfaceC3902aA = this.f53147d.a(this.f53148e, c3904cC, byteBuffer, e(c3904cC, i10, i11));
                interfaceC3902aA.e(config);
                interfaceC3902aA.b();
                Bitmap bitmapA = interfaceC3902aA.a();
                if (bitmapA == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + H6.g.a(jB));
                    }
                    return null;
                }
                e eVar = new e(new C5131c(this.f53144a, interfaceC3902aA, C4684j.c(), i10, i11, bitmapA));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + H6.g.a(jB));
                }
                return eVar;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + H6.g.a(jB));
            }
        }
    }

    private static int e(C3904c c3904c, int i10, int i11) {
        int iMin = Math.min(c3904c.a() / i11, c3904c.d() / i10);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i10 + "x" + i11 + "], actual dimens: [" + c3904c.d() + "x" + c3904c.a() + "]");
        }
        return iMax;
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a(ByteBuffer byteBuffer, int i10, int i11, C3972g c3972g) {
        C3905d c3905dA = this.f53146c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, c3905dA, c3972g);
        } finally {
            this.f53146c.b(c3905dA);
        }
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, C3972g c3972g) {
        return !((Boolean) c3972g.c(i.f53190b)).booleanValue() && com.bumptech.glide.load.a.g(this.f53145b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    C5129a(Context context, List<ImageHeaderParser> list, InterfaceC4239d interfaceC4239d, InterfaceC4237b interfaceC4237b, b bVar, C0780a c0780a) {
        this.f53144a = context.getApplicationContext();
        this.f53145b = list;
        this.f53147d = c0780a;
        this.f53148e = new C5130b(interfaceC4239d, interfaceC4237b);
        this.f53146c = bVar;
    }
}
