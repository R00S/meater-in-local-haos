package y6;

import o6.InterfaceC4138b;

/* compiled from: GifDrawableResource.java */
/* loaded from: classes2.dex */
public class e extends w6.j<C5131c> implements InterfaceC4138b {
    public e(C5131c c5131c) {
        super(c5131c);
    }

    @Override // o6.InterfaceC4139c
    public int a() {
        return ((C5131c) this.f51962B).i();
    }

    @Override // w6.j, o6.InterfaceC4138b
    public void b() {
        ((C5131c) this.f51962B).e().prepareToDraw();
    }

    @Override // o6.InterfaceC4139c
    public void c() {
        ((C5131c) this.f51962B).stop();
        ((C5131c) this.f51962B).k();
    }

    @Override // o6.InterfaceC4139c
    public Class<C5131c> d() {
        return C5131c.class;
    }
}
