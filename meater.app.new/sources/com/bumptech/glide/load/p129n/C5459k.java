package com.bumptech.glide.load.p129n;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.EnumC5353g;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import com.bumptech.glide.load.p127m.p128o.C5445b;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import com.bumptech.glide.p144q.C5586c;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: MediaStoreFileLoader.java */
/* renamed from: com.bumptech.glide.load.n.k */
/* loaded from: classes.dex */
public final class C5459k implements InterfaceC5462n<Uri, File> {

    /* renamed from: a */
    private final Context f13643a;

    /* compiled from: MediaStoreFileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.k$a */
    public static final class a implements InterfaceC5463o<Uri, File> {

        /* renamed from: a */
        private final Context f13644a;

        public a(Context context) {
            this.f13644a = context;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5463o
        /* renamed from: b */
        public InterfaceC5462n<Uri, File> mo10513b(C5466r c5466r) {
            return new C5459k(this.f13644a);
        }
    }

    /* compiled from: MediaStoreFileLoader.java */
    /* renamed from: com.bumptech.glide.load.n.k$b */
    private static class b implements InterfaceC5433d<File> {

        /* renamed from: f */
        private static final String[] f13645f = {"_data"};

        /* renamed from: g */
        private final Context f13646g;

        /* renamed from: h */
        private final Uri f13647h;

        b(Context context, Uri uri) {
            this.f13646g = context;
            this.f13647h = uri;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: a */
        public Class<File> mo10455a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: b */
        public void mo10460b() {
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: d */
        public EnumC5365a mo10462d() {
            return EnumC5365a.LOCAL;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: e */
        public void mo10463e(EnumC5353g enumC5353g, InterfaceC5433d.a<? super File> aVar) {
            Cursor cursorQuery = this.f13646g.getContentResolver().query(this.f13647h, f13645f, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.mo10228f(new File(string));
                return;
            }
            aVar.mo10227c(new FileNotFoundException("Failed to find file path for: " + this.f13647h));
        }
    }

    public C5459k(Context context) {
        this.f13643a = context;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5462n.a<File> mo10509b(Uri uri, int i2, int i3, C5426i c5426i) {
        return new InterfaceC5462n.a<>(new C5586c(uri), new b(this.f13643a, uri));
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(Uri uri) {
        return C5445b.m10495b(uri);
    }
}
