package j2;

import U1.s;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.ImageDecoderException;
import j2.C3731a;

/* compiled from: ImageDecoder.java */
/* renamed from: j2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3733c extends c2.d<DecoderInputBuffer, AbstractC3734d, ImageDecoderException> {

    /* compiled from: ImageDecoder.java */
    /* renamed from: j2.c$a */
    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f43479a = new C3731a.c();

        int a(s sVar);

        InterfaceC3733c b();
    }

    @Override // c2.d
    AbstractC3734d a();

    void f(DecoderInputBuffer decoderInputBuffer);
}
