package com.bumptech.glide.load.p129n.p130y;

import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.p129n.C5455g;
import com.bumptech.glide.load.p129n.C5466r;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import com.bumptech.glide.load.p129n.InterfaceC5463o;
import java.io.InputStream;
import java.net.URL;

/* compiled from: UrlLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.e */
/* loaded from: classes.dex */
public class C5477e implements InterfaceC5462n<URL, InputStream> {

    /* renamed from: a */
    private final InterfaceC5462n<C5455g, InputStream> f13706a;

    /* compiled from: UrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.e$a */
    public static class a implements InterfaceC5463o<URL, InputStream> {
        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<URL, InputStream> mo10513b(C5466r c5466r) {
            return new C5477e(c5466r.m10571d(C5455g.class, InputStream.class));
        }
    }

    public C5477e(InterfaceC5462n<C5455g, InputStream> interfaceC5462n) {
        this.f13706a = interfaceC5462n;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5462n.a<InputStream> mo10509b(URL url, int i2, int i3, C5426i c5426i) {
        return this.f13706a.mo10509b(new C5455g(url), i2, i3, c5426i);
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(URL url) {
        return true;
    }
}
