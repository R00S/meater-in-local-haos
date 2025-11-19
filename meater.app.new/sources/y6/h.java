package y6;

import android.graphics.Bitmap;
import l6.InterfaceC3902a;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;
import p6.InterfaceC4239d;

/* compiled from: GifFrameResourceDecoder.java */
/* loaded from: classes2.dex */
public final class h implements InterfaceC3974i<InterfaceC3902a, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4239d f53188a;

    public h(InterfaceC4239d interfaceC4239d) {
        this.f53188a = interfaceC4239d;
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4139c<Bitmap> a(InterfaceC3902a interfaceC3902a, int i10, int i11, C3972g c3972g) {
        return com.bumptech.glide.load.resource.bitmap.g.f(interfaceC3902a.a(), this.f53188a);
    }

    @Override // m6.InterfaceC3974i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InterfaceC3902a interfaceC3902a, C3972g c3972g) {
        return true;
    }
}
