package com.bumptech.glide.load.p131o.p132c;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C5425h;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5413e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: VideoDecoder.java */
/* renamed from: com.bumptech.glide.load.o.c.y */
/* loaded from: classes.dex */
public class C5504y<T> implements InterfaceC5427j<T, Bitmap> {

    /* renamed from: a */
    public static final C5425h<Long> f13781a = C5425h.m10440a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: b */
    public static final C5425h<Integer> f13782b = C5425h.m10440a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: c */
    private static final d f13783c = new d();

    /* renamed from: d */
    private final e<T> f13784d;

    /* renamed from: e */
    private final InterfaceC5413e f13785e;

    /* renamed from: f */
    private final d f13786f;

    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.c.y$a */
    class a implements C5425h.b<Long> {

        /* renamed from: a */
        private final ByteBuffer f13787a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // com.bumptech.glide.load.C5425h.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo10447a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f13787a) {
                this.f13787a.position(0);
                messageDigest.update(this.f13787a.putLong(l.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.c.y$b */
    class b implements C5425h.b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f13788a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // com.bumptech.glide.load.C5425h.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo10447a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f13788a) {
                this.f13788a.position(0);
                messageDigest.update(this.f13788a.putInt(num.intValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.c.y$c */
    private static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5504y.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo10697a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.c.y$d */
    static class d {
        d() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever m10699a() {
            return new MediaMetadataRetriever();
        }
    }

    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.c.y$e */
    interface e<T> {
        /* renamed from: a */
        void mo10697a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* compiled from: VideoDecoder.java */
    /* renamed from: com.bumptech.glide.load.o.c.y$f */
    static final class f implements e<ParcelFileDescriptor> {
        f() {
        }

        @Override // com.bumptech.glide.load.p131o.p132c.C5504y.e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo10697a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C5504y(InterfaceC5413e interfaceC5413e, e<T> eVar) {
        this(interfaceC5413e, eVar, f13783c);
    }

    /* renamed from: c */
    public static InterfaceC5427j<AssetFileDescriptor, Bitmap> m10690c(InterfaceC5413e interfaceC5413e) {
        return new C5504y(interfaceC5413e, new c(null));
    }

    /* renamed from: d */
    private static Bitmap m10691d(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, AbstractC5490k abstractC5490k) {
        Bitmap bitmapM10693f = (Build.VERSION.SDK_INT < 27 || i3 == Integer.MIN_VALUE || i4 == Integer.MIN_VALUE || abstractC5490k == AbstractC5490k.f13732f) ? null : m10693f(mediaMetadataRetriever, j2, i2, i3, i4, abstractC5490k);
        return bitmapM10693f == null ? m10692e(mediaMetadataRetriever, j2, i2) : bitmapM10693f;
    }

    /* renamed from: e */
    private static Bitmap m10692e(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2) {
        return mediaMetadataRetriever.getFrameAtTime(j2, i2);
    }

    @TargetApi(27)
    /* renamed from: f */
    private static Bitmap m10693f(MediaMetadataRetriever mediaMetadataRetriever, long j2, int i2, int i3, int i4, AbstractC5490k abstractC5490k) {
        try {
            int i5 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i6 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i7 == 90 || i7 == 270) {
                i6 = i5;
                i5 = i6;
            }
            float fMo10629b = abstractC5490k.mo10629b(i5, i6, i3, i4);
            return mediaMetadataRetriever.getScaledFrameAtTime(j2, i2, Math.round(i5 * fMo10629b), Math.round(fMo10629b * i6));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
            return null;
        }
    }

    /* renamed from: g */
    public static InterfaceC5427j<ParcelFileDescriptor, Bitmap> m10694g(InterfaceC5413e interfaceC5413e) {
        return new C5504y(interfaceC5413e, new f());
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: a */
    public boolean mo10452a(T t, C5426i c5426i) {
        return true;
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: b */
    public InterfaceC5404u<Bitmap> mo10453b(T t, int i2, int i3, C5426i c5426i) throws IOException {
        long jLongValue = ((Long) c5426i.m10449a(f13781a)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) c5426i.m10449a(f13782b);
        if (num == null) {
            num = 2;
        }
        AbstractC5490k abstractC5490k = (AbstractC5490k) c5426i.m10449a(AbstractC5490k.f13734h);
        if (abstractC5490k == null) {
            abstractC5490k = AbstractC5490k.f13733g;
        }
        AbstractC5490k abstractC5490k2 = abstractC5490k;
        MediaMetadataRetriever mediaMetadataRetrieverM10699a = this.f13786f.m10699a();
        try {
            try {
                this.f13784d.mo10697a(mediaMetadataRetrieverM10699a, t);
                Bitmap bitmapM10691d = m10691d(mediaMetadataRetrieverM10699a, jLongValue, num.intValue(), i2, i3, abstractC5490k2);
                mediaMetadataRetrieverM10699a.release();
                return C5483d.m10607f(bitmapM10691d, this.f13785e);
            } catch (RuntimeException e2) {
                throw new IOException(e2);
            }
        } catch (Throwable th) {
            mediaMetadataRetrieverM10699a.release();
            throw th;
        }
    }

    C5504y(InterfaceC5413e interfaceC5413e, e<T> eVar, d dVar) {
        this.f13785e = interfaceC5413e;
        this.f13784d = eVar;
        this.f13786f = dVar;
    }
}
