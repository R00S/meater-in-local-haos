package com.bumptech.glide.load.p129n.p130y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.p127m.p128o.C5445b;
import com.bumptech.glide.load.p127m.p128o.C5446c;
import com.bumptech.glide.load.p129n.C5466r;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import com.bumptech.glide.load.p129n.InterfaceC5463o;
import com.bumptech.glide.load.p131o.p132c.C5504y;
import com.bumptech.glide.p144q.C5586c;
import java.io.InputStream;

/* compiled from: MediaStoreVideoThumbLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.d */
/* loaded from: classes.dex */
public class C5476d implements InterfaceC5462n<Uri, InputStream> {

    /* renamed from: a */
    private final Context f13704a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.d$a */
    public static class a implements InterfaceC5463o<Uri, InputStream> {

        /* renamed from: a */
        private final Context f13705a;

        public a(Context context) {
            this.f13705a = context;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<Uri, InputStream> mo10513b(C5466r c5466r) {
            return new C5476d(this.f13705a);
        }
    }

    public C5476d(Context context) {
        this.f13704a = context.getApplicationContext();
    }

    /* renamed from: e */
    private boolean m10598e(C5426i c5426i) {
        Long l = (Long) c5426i.m10449a(C5504y.f13781a);
        return l != null && l.longValue() == -1;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5462n.a<InputStream> mo10509b(Uri uri, int i2, int i3, C5426i c5426i) {
        if (C5445b.m10497d(i2, i3) && m10598e(c5426i)) {
            return new InterfaceC5462n.a<>(new C5586c(uri), C5446c.m10501g(this.f13704a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(Uri uri) {
        return C5445b.m10496c(uri);
    }
}
