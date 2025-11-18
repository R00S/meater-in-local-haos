package com.bumptech.glide.load.p129n;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import java.io.InputStream;

/* compiled from: ResourceLoader.java */
/* renamed from: com.bumptech.glide.load.n.s */
/* loaded from: classes.dex */
public class C5467s<Data> implements InterfaceC5462n<Integer, Data> {

    /* renamed from: a */
    private final InterfaceC5462n<Uri, Data> f13679a;

    /* renamed from: b */
    private final Resources f13680b;

    /* compiled from: ResourceLoader.java */
    /* renamed from: com.bumptech.glide.load.n.s$a */
    public static final class a implements InterfaceC5463o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        private final Resources f13681a;

        public a(Resources resources) {
            this.f13681a = resources;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<Integer, AssetFileDescriptor> mo10513b(C5466r c5466r) {
            return new C5467s(this.f13681a, c5466r.m10571d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* renamed from: com.bumptech.glide.load.n.s$b */
    public static class b implements InterfaceC5463o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        private final Resources f13682a;

        public b(Resources resources) {
            this.f13682a = resources;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<Integer, ParcelFileDescriptor> mo10513b(C5466r c5466r) {
            return new C5467s(this.f13682a, c5466r.m10571d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* renamed from: com.bumptech.glide.load.n.s$c */
    public static class c implements InterfaceC5463o<Integer, InputStream> {

        /* renamed from: a */
        private final Resources f13683a;

        public c(Resources resources) {
            this.f13683a = resources;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<Integer, InputStream> mo10513b(C5466r c5466r) {
            return new C5467s(this.f13683a, c5466r.m10571d(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader.java */
    /* renamed from: com.bumptech.glide.load.n.s$d */
    public static class d implements InterfaceC5463o<Integer, Uri> {

        /* renamed from: a */
        private final Resources f13684a;

        public d(Resources resources) {
            this.f13684a = resources;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<Integer, Uri> mo10513b(C5466r c5466r) {
            return new C5467s(this.f13684a, C5470v.m10585c());
        }
    }

    public C5467s(Resources resources, InterfaceC5462n<Uri, Data> interfaceC5462n) {
        this.f13680b = resources;
        this.f13679a = interfaceC5462n;
    }

    /* renamed from: d */
    private Uri m10577d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f13680b.getResourcePackageName(num.intValue()) + '/' + this.f13680b.getResourceTypeName(num.intValue()) + '/' + this.f13680b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e2);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5462n.a<Data> mo10509b(Integer num, int i2, int i3, C5426i c5426i) {
        Uri uriM10577d = m10577d(num);
        if (uriM10577d == null) {
            return null;
        }
        return this.f13679a.mo10509b(uriM10577d, i2, i3, c5426i);
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(Integer num) {
        return true;
    }
}
