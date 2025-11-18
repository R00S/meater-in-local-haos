package com.bumptech.glide.load.p129n.p130y;

import com.bumptech.glide.load.C5425h;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.p127m.C5439j;
import com.bumptech.glide.load.p129n.C5455g;
import com.bumptech.glide.load.p129n.C5461m;
import com.bumptech.glide.load.p129n.C5466r;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import com.bumptech.glide.load.p129n.InterfaceC5463o;
import java.io.InputStream;

/* compiled from: HttpGlideUrlLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.a */
/* loaded from: classes.dex */
public class C5473a implements InterfaceC5462n<C5455g, InputStream> {

    /* renamed from: a */
    public static final C5425h<Integer> f13697a = C5425h.m10444f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: b */
    private final C5461m<C5455g, C5455g> f13698b;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.a$a */
    public static class a implements InterfaceC5463o<C5455g, InputStream> {

        /* renamed from: a */
        private final C5461m<C5455g, C5455g> f13699a = new C5461m<>(500);

        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<C5455g, InputStream> mo10513b(C5466r c5466r) {
            return new C5473a(this.f13699a);
        }
    }

    public C5473a(C5461m<C5455g, C5455g> c5461m) {
        this.f13698b = c5461m;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5462n.a<InputStream> mo10509b(C5455g c5455g, int i2, int i3, C5426i c5426i) {
        C5461m<C5455g, C5455g> c5461m = this.f13698b;
        if (c5461m != null) {
            C5455g c5455gM10552a = c5461m.m10552a(c5455g, 0, 0);
            if (c5455gM10552a == null) {
                this.f13698b.m10553b(c5455g, 0, 0, c5455g);
            } else {
                c5455g = c5455gM10552a;
            }
        }
        return new InterfaceC5462n.a<>(c5455g, new C5439j(c5455g, ((Integer) c5426i.m10449a(f13697a)).intValue()));
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(C5455g c5455g) {
        return true;
    }
}
