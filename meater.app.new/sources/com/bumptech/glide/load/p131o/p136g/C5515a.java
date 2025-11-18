package com.bumptech.glide.load.p131o.p136g;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C5369e;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.EnumC5366b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import com.bumptech.glide.load.p131o.C5479b;
import com.bumptech.glide.p122l.C5362c;
import com.bumptech.glide.p122l.C5363d;
import com.bumptech.glide.p122l.C5364e;
import com.bumptech.glide.p122l.InterfaceC5360a;
import com.bumptech.glide.p145r.C5592f;
import com.bumptech.glide.p145r.C5597k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* compiled from: ByteBufferGifDecoder.java */
/* renamed from: com.bumptech.glide.load.o.g.a */
/* loaded from: classes.dex */
public class C5515a implements InterfaceC5427j<ByteBuffer, C5517c> {

    /* renamed from: a */
    private static final a f13794a = new a();

    /* renamed from: b */
    private static final b f13795b = new b();

    /* renamed from: c */
    private final Context f13796c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f13797d;

    /* renamed from: e */
    private final b f13798e;

    /* renamed from: f */
    private final a f13799f;

    /* renamed from: g */
    private final C5516b f13800g;

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.g.a$a */
    static class a {
        a() {
        }

        /* renamed from: a */
        InterfaceC5360a m10729a(InterfaceC5360a.a aVar, C5362c c5362c, ByteBuffer byteBuffer, int i2) {
            return new C5364e(aVar, c5362c, byteBuffer, i2);
        }
    }

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.g.a$b */
    static class b {

        /* renamed from: a */
        private final Queue<C5363d> f13801a = C5597k.m11049f(0);

        b() {
        }

        /* renamed from: a */
        synchronized C5363d m10730a(ByteBuffer byteBuffer) {
            C5363d c5363dPoll;
            c5363dPoll = this.f13801a.poll();
            if (c5363dPoll == null) {
                c5363dPoll = new C5363d();
            }
            return c5363dPoll.m10141p(byteBuffer);
        }

        /* renamed from: b */
        synchronized void m10731b(C5363d c5363d) {
            c5363d.m10139a();
            this.f13801a.offer(c5363d);
        }
    }

    public C5515a(Context context, List<ImageHeaderParser> list, InterfaceC5413e interfaceC5413e, InterfaceC5410b interfaceC5410b) {
        this(context, list, interfaceC5413e, interfaceC5410b, f13795b, f13794a);
    }

    /* renamed from: c */
    private C5519e m10725c(ByteBuffer byteBuffer, int i2, int i3, C5363d c5363d, C5426i c5426i) {
        long jM11028b = C5592f.m11028b();
        try {
            C5362c c5362cM10140c = c5363d.m10140c();
            if (c5362cM10140c.m10121b() > 0 && c5362cM10140c.m10122c() == 0) {
                Bitmap.Config config = c5426i.m10449a(C5523i.f13839a) == EnumC5366b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                InterfaceC5360a interfaceC5360aM10729a = this.f13799f.m10729a(this.f13800g, c5362cM10140c, byteBuffer, m10726e(c5362cM10140c, i2, i3));
                interfaceC5360aM10729a.mo10110f(config);
                interfaceC5360aM10729a.mo10107c();
                Bitmap bitmapMo10105a = interfaceC5360aM10729a.mo10105a();
                if (bitmapMo10105a == null) {
                    return null;
                }
                C5519e c5519e = new C5519e(new C5517c(this.f13796c, interfaceC5360aM10729a, C5479b.m10603a(), i2, i3, bitmapMo10105a));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C5592f.m11027a(jM11028b));
                }
                return c5519e;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C5592f.m11027a(jM11028b));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C5592f.m11027a(jM11028b));
            }
        }
    }

    /* renamed from: e */
    private static int m10726e(C5362c c5362c, int i2, int i3) {
        int iMin = Math.min(c5362c.m10120a() / i3, c5362c.m10123d() / i2);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i2 + "x" + i3 + "], actual dimens: [" + c5362c.m10123d() + "x" + c5362c.m10120a() + "]");
        }
        return iMax;
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public C5519e mo10453b(ByteBuffer byteBuffer, int i2, int i3, C5426i c5426i) {
        C5363d c5363dM10730a = this.f13798e.m10730a(byteBuffer);
        try {
            return m10725c(byteBuffer, i2, i3, c5363dM10730a, c5426i);
        } finally {
            this.f13798e.m10731b(c5363dM10730a);
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(ByteBuffer byteBuffer, C5426i c5426i) throws IOException {
        return !((Boolean) c5426i.m10449a(C5523i.f13840b)).booleanValue() && C5369e.m10158c(this.f13797d, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    C5515a(Context context, List<ImageHeaderParser> list, InterfaceC5413e interfaceC5413e, InterfaceC5410b interfaceC5410b, b bVar, a aVar) {
        this.f13796c = context.getApplicationContext();
        this.f13797d = list;
        this.f13799f = aVar;
        this.f13800g = new C5516b(interfaceC5413e, interfaceC5410b);
        this.f13798e = bVar;
    }
}
