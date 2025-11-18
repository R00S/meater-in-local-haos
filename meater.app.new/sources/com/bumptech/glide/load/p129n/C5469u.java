package com.bumptech.glide.load.p129n;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import java.io.File;
import java.io.InputStream;

/* compiled from: StringLoader.java */
/* renamed from: com.bumptech.glide.load.n.u */
/* loaded from: classes.dex */
public class C5469u<Data> implements InterfaceC5462n<String, Data> {

    /* renamed from: a */
    private final InterfaceC5462n<Uri, Data> f13686a;

    /* compiled from: StringLoader.java */
    /* renamed from: com.bumptech.glide.load.n.u$a */
    public static final class a implements InterfaceC5463o<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<String, AssetFileDescriptor> mo10513b(C5466r c5466r) {
            return new C5469u(c5466r.m10571d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* renamed from: com.bumptech.glide.load.n.u$b */
    public static class b implements InterfaceC5463o<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<String, ParcelFileDescriptor> mo10513b(C5466r c5466r) {
            return new C5469u(c5466r.m10571d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader.java */
    /* renamed from: com.bumptech.glide.load.n.u$c */
    public static class c implements InterfaceC5463o<String, InputStream> {
        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<String, InputStream> mo10513b(C5466r c5466r) {
            return new C5469u(c5466r.m10571d(Uri.class, InputStream.class));
        }
    }

    public C5469u(InterfaceC5462n<Uri, Data> interfaceC5462n) {
        this.f13686a = interfaceC5462n;
    }

    /* renamed from: e */
    private static Uri m10581e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m10582f(str);
        }
        Uri uri = Uri.parse(str);
        return uri.getScheme() == null ? m10582f(str) : uri;
    }

    /* renamed from: f */
    private static Uri m10582f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5462n.a<Data> mo10509b(String str, int i2, int i3, C5426i c5426i) {
        Uri uriM10581e = m10581e(str);
        if (uriM10581e == null || !this.f13686a.mo10508a(uriM10581e)) {
            return null;
        }
        return this.f13686a.mo10509b(uriM10581e, i2, i3, c5426i);
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(String str) {
        return true;
    }
}
