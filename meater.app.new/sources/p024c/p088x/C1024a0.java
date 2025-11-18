package p024c.p088x;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* compiled from: ViewOverlayApi18.java */
/* renamed from: c.x.a0 */
/* loaded from: classes.dex */
class C1024a0 implements InterfaceC1026b0 {

    /* renamed from: a */
    private final ViewOverlay f6770a;

    C1024a0(View view) {
        this.f6770a = view.getOverlay();
    }

    @Override // p024c.p088x.InterfaceC1026b0
    /* renamed from: a */
    public void mo6533a(Drawable drawable) {
        this.f6770a.add(drawable);
    }

    @Override // p024c.p088x.InterfaceC1026b0
    /* renamed from: b */
    public void mo6534b(Drawable drawable) {
        this.f6770a.remove(drawable);
    }
}
