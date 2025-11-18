package com.bumptech.glide.load.p129n;

import android.net.Uri;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UrlUriLoader.java */
/* renamed from: com.bumptech.glide.load.n.x */
/* loaded from: classes.dex */
public class C5472x<Data> implements InterfaceC5462n<Uri, Data> {

    /* renamed from: a */
    private static final Set<String> f13695a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", BuildConfig.APTOIDE_WEB_SERVICES_SCHEME)));

    /* renamed from: b */
    private final InterfaceC5462n<C5455g, Data> f13696b;

    /* compiled from: UrlUriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.x$a */
    public static class a implements InterfaceC5463o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<Uri, InputStream> mo10513b(C5466r c5466r) {
            return new C5472x(c5466r.m10571d(C5455g.class, InputStream.class));
        }
    }

    public C5472x(InterfaceC5462n<C5455g, Data> interfaceC5462n) {
        this.f13696b = interfaceC5462n;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5462n.a<Data> mo10509b(Uri uri, int i2, int i3, C5426i c5426i) {
        return this.f13696b.mo10509b(new C5455g(uri.toString()), i2, i3, c5426i);
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(Uri uri) {
        return f13695a.contains(uri.getScheme());
    }
}
