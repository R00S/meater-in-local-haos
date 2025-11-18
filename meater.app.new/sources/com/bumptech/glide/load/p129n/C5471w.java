package com.bumptech.glide.load.p129n;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.p127m.C5430a;
import com.bumptech.glide.load.p127m.C5438i;
import com.bumptech.glide.load.p127m.C5443n;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import com.bumptech.glide.p144q.C5586c;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UriLoader.java */
/* renamed from: com.bumptech.glide.load.n.w */
/* loaded from: classes.dex */
public class C5471w<Data> implements InterfaceC5462n<Uri, Data> {

    /* renamed from: a */
    private static final Set<String> f13690a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: b */
    private final c<Data> f13691b;

    /* compiled from: UriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.w$a */
    public static final class a implements InterfaceC5463o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f13692a;

        public a(ContentResolver contentResolver) {
            this.f13692a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p129n.C5471w.c
        /* renamed from: a */
        public InterfaceC5433d<AssetFileDescriptor> mo10589a(Uri uri) {
            return new C5430a(this.f13692a, uri);
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<Uri, AssetFileDescriptor> mo10513b(C5466r c5466r) {
            return new C5471w(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.w$b */
    public static class b implements InterfaceC5463o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a */
        private final ContentResolver f13693a;

        public b(ContentResolver contentResolver) {
            this.f13693a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p129n.C5471w.c
        /* renamed from: a */
        public InterfaceC5433d<ParcelFileDescriptor> mo10589a(Uri uri) {
            return new C5438i(this.f13693a, uri);
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<Uri, ParcelFileDescriptor> mo10513b(C5466r c5466r) {
            return new C5471w(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.w$c */
    public interface c<Data> {
        /* renamed from: a */
        InterfaceC5433d<Data> mo10589a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    /* renamed from: com.bumptech.glide.load.n.w$d */
    public static class d implements InterfaceC5463o<Uri, InputStream>, c<InputStream> {

        /* renamed from: a */
        private final ContentResolver f13694a;

        public d(ContentResolver contentResolver) {
            this.f13694a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p129n.C5471w.c
        /* renamed from: a */
        public InterfaceC5433d<InputStream> mo10589a(Uri uri) {
            return new C5443n(this.f13694a, uri);
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<Uri, InputStream> mo10513b(C5466r c5466r) {
            return new C5471w(this);
        }
    }

    public C5471w(c<Data> cVar) {
        this.f13691b = cVar;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5462n.a<Data> mo10509b(Uri uri, int i2, int i3, C5426i c5426i) {
        return new InterfaceC5462n.a<>(new C5586c(uri), this.f13691b.mo10589a(uri));
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(Uri uri) {
        return f13690a.contains(uri.getScheme());
    }
}
