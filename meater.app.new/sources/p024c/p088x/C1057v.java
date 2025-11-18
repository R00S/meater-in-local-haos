package p024c.p088x;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* compiled from: ViewGroupOverlayApi18.java */
/* renamed from: c.x.v */
/* loaded from: classes.dex */
class C1057v implements InterfaceC1058w {

    /* renamed from: a */
    private final ViewGroupOverlay f6940a;

    C1057v(ViewGroup viewGroup) {
        this.f6940a = viewGroup.getOverlay();
    }

    @Override // p024c.p088x.InterfaceC1026b0
    /* renamed from: a */
    public void mo6533a(Drawable drawable) {
        this.f6940a.add(drawable);
    }

    @Override // p024c.p088x.InterfaceC1026b0
    /* renamed from: b */
    public void mo6534b(Drawable drawable) {
        this.f6940a.remove(drawable);
    }

    @Override // p024c.p088x.InterfaceC1058w
    /* renamed from: c */
    public void mo6677c(View view) {
        this.f6940a.add(view);
    }

    @Override // p024c.p088x.InterfaceC1058w
    /* renamed from: d */
    public void mo6678d(View view) {
        this.f6940a.remove(view);
    }
}
