package com.airbnb.lottie.p108q.p109a;

import android.graphics.Path;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p110b.AbstractC5211a;
import com.airbnb.lottie.p112s.p114j.C5262l;
import com.airbnb.lottie.p112s.p114j.C5265o;
import com.airbnb.lottie.p112s.p114j.C5267q;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import com.airbnb.lottie.p118v.C5320f;
import java.util.List;

/* compiled from: ShapeContent.java */
/* renamed from: com.airbnb.lottie.q.a.p */
/* loaded from: classes.dex */
public class C5208p implements InterfaceC5204l, AbstractC5211a.a {

    /* renamed from: a */
    private final Path f12591a = new Path();

    /* renamed from: b */
    private final String f12592b;

    /* renamed from: c */
    private final C5182f f12593c;

    /* renamed from: d */
    private final AbstractC5211a<?, Path> f12594d;

    /* renamed from: e */
    private boolean f12595e;

    /* renamed from: f */
    private C5210r f12596f;

    public C5208p(C5182f c5182f, AbstractC5268a abstractC5268a, C5265o c5265o) {
        this.f12592b = c5265o.m9690b();
        this.f12593c = c5182f;
        AbstractC5211a<C5262l, Path> abstractC5211aMo9617a = c5265o.m9691c().mo9617a();
        this.f12594d = abstractC5211aMo9617a;
        abstractC5268a.m9723i(abstractC5211aMo9617a);
        abstractC5211aMo9617a.m9548a(this);
    }

    /* renamed from: c */
    private void m9539c() {
        this.f12595e = false;
        this.f12593c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.p108q.p110b.AbstractC5211a.a
    /* renamed from: a */
    public void mo9512a() {
        m9539c();
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5194b> list, List<InterfaceC5194b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            InterfaceC5194b interfaceC5194b = list.get(i2);
            if (interfaceC5194b instanceof C5210r) {
                C5210r c5210r = (C5210r) interfaceC5194b;
                if (c5210r.m9544j() == C5267q.a.Simultaneously) {
                    this.f12596f = c5210r;
                    c5210r.m9540c(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5204l
    /* renamed from: g */
    public Path mo9522g() {
        if (this.f12595e) {
            return this.f12591a;
        }
        this.f12591a.reset();
        this.f12591a.set(this.f12594d.mo9552h());
        this.f12591a.setFillType(Path.FillType.EVEN_ODD);
        C5320f.m9884b(this.f12591a, this.f12596f);
        this.f12595e = true;
        return this.f12591a;
    }
}
