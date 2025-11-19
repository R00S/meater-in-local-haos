package u6;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.ImageDecoder$OnPartialImageListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.t;
import m6.C3971f;
import m6.C3972g;
import m6.EnumC3967b;
import m6.EnumC3973h;

/* compiled from: DefaultOnHeaderDecodedListener.java */
/* renamed from: u6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4682h implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    private final t f50487a = t.b();

    /* renamed from: b, reason: collision with root package name */
    private final int f50488b;

    /* renamed from: c, reason: collision with root package name */
    private final int f50489c;

    /* renamed from: d, reason: collision with root package name */
    private final EnumC3967b f50490d;

    /* renamed from: e, reason: collision with root package name */
    private final n f50491e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f50492f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC3973h f50493g;

    /* compiled from: DefaultOnHeaderDecodedListener.java */
    /* renamed from: u6.h$a */
    class a implements ImageDecoder$OnPartialImageListener {
        a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C4682h(int i10, int i11, C3972g c3972g) {
        this.f50488b = i10;
        this.f50489c = i11;
        this.f50490d = (EnumC3967b) c3972g.c(o.f33340f);
        this.f50491e = (n) c3972g.c(n.f33335h);
        C3971f<Boolean> c3971f = o.f33344j;
        this.f50492f = c3972g.c(c3971f) != null && ((Boolean) c3972g.c(c3971f)).booleanValue();
        this.f50493g = (EnumC3973h) c3972g.c(o.f33341g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f50487a.f(this.f50488b, this.f50489c, this.f50492f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f50490d == EnumC3967b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size size = imageInfo.getSize();
        int width = this.f50488b;
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        int height = this.f50489c;
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fB = this.f50491e.b(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fB);
        int iRound2 = Math.round(size.getHeight() * fB);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        EnumC3973h enumC3973h = this.f50493g;
        if (enumC3973h != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((enumC3973h == EnumC3973h.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
