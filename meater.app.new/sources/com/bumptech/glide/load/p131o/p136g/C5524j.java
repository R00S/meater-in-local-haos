package com.bumptech.glide.load.p131o.p136g;

import android.util.Log;
import com.bumptech.glide.load.C5369e;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* compiled from: StreamGifDecoder.java */
/* renamed from: com.bumptech.glide.load.o.g.j */
/* loaded from: classes.dex */
public class C5524j implements InterfaceC5427j<InputStream, C5517c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f13841a;

    /* renamed from: b */
    private final InterfaceC5427j<ByteBuffer, C5517c> f13842b;

    /* renamed from: c */
    private final InterfaceC5410b f13843c;

    public C5524j(List<ImageHeaderParser> list, InterfaceC5427j<ByteBuffer, C5517c> interfaceC5427j, InterfaceC5410b interfaceC5410b) {
        this.f13841a = list;
        this.f13842b = interfaceC5427j;
        this.f13843c = interfaceC5410b;
    }

    /* renamed from: e */
    private static byte[] m10773e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException e2) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5404u<C5517c> mo10453b(InputStream inputStream, int i2, int i3, C5426i c5426i) throws IOException {
        byte[] bArrM10773e = m10773e(inputStream);
        if (bArrM10773e == null) {
            return null;
        }
        return this.f13842b.mo10453b(ByteBuffer.wrap(bArrM10773e), i2, i3, c5426i);
    }

    @Override // com.bumptech.glide.load.InterfaceC5427j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10452a(InputStream inputStream, C5426i c5426i) throws IOException {
        return !((Boolean) c5426i.m10449a(C5523i.f13840b)).booleanValue() && C5369e.m10157b(this.f13841a, inputStream, this.f13843c) == ImageHeaderParser.ImageType.GIF;
    }
}
