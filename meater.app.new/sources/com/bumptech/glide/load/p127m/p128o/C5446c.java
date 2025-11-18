package com.bumptech.glide.load.p127m.p128o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C5349c;
import com.bumptech.glide.EnumC5353g;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.p127m.C5436g;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* renamed from: com.bumptech.glide.load.m.o.c */
/* loaded from: classes.dex */
public class C5446c implements InterfaceC5433d<InputStream> {

    /* renamed from: f */
    private final Uri f13591f;

    /* renamed from: g */
    private final C5448e f13592g;

    /* renamed from: h */
    private InputStream f13593h;

    /* compiled from: ThumbFetcher.java */
    /* renamed from: com.bumptech.glide.load.m.o.c$a */
    static class a implements InterfaceC5447d {

        /* renamed from: a */
        private static final String[] f13594a = {"_data"};

        /* renamed from: b */
        private final ContentResolver f13595b;

        a(ContentResolver contentResolver) {
            this.f13595b = contentResolver;
        }

        @Override // com.bumptech.glide.load.p127m.p128o.InterfaceC5447d
        /* renamed from: a */
        public Cursor mo10503a(Uri uri) {
            return this.f13595b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f13594a, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* renamed from: com.bumptech.glide.load.m.o.c$b */
    static class b implements InterfaceC5447d {

        /* renamed from: a */
        private static final String[] f13596a = {"_data"};

        /* renamed from: b */
        private final ContentResolver f13597b;

        b(ContentResolver contentResolver) {
            this.f13597b = contentResolver;
        }

        @Override // com.bumptech.glide.load.p127m.p128o.InterfaceC5447d
        /* renamed from: a */
        public Cursor mo10503a(Uri uri) {
            return this.f13597b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f13596a, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    C5446c(Uri uri, C5448e c5448e) {
        this.f13591f = uri;
        this.f13592g = c5448e;
    }

    /* renamed from: c */
    private static C5446c m10499c(Context context, Uri uri, InterfaceC5447d interfaceC5447d) {
        return new C5446c(uri, new C5448e(ComponentCallbacks2C5349c.m9972c(context).m9986j().m9957g(), interfaceC5447d, ComponentCallbacks2C5349c.m9972c(context).m9981e(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C5446c m10500f(Context context, Uri uri) {
        return m10499c(context, uri, new a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C5446c m10501g(Context context, Uri uri) {
        return m10499c(context, uri, new b(context.getContentResolver()));
    }

    /* renamed from: h */
    private InputStream m10502h() throws FileNotFoundException {
        InputStream inputStreamM10507d = this.f13592g.m10507d(this.f13591f);
        int iM10506a = inputStreamM10507d != null ? this.f13592g.m10506a(this.f13591f) : -1;
        return iM10506a != -1 ? new C5436g(inputStreamM10507d, iM10506a) : inputStreamM10507d;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
    /* renamed from: a */
    public Class<InputStream> mo10455a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
    /* renamed from: b */
    public void mo10460b() throws IOException {
        InputStream inputStream = this.f13593h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
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
    public void mo10463e(EnumC5353g enumC5353g, InterfaceC5433d.a<? super InputStream> aVar) {
        try {
            InputStream inputStreamM10502h = m10502h();
            this.f13593h = inputStreamM10502h;
            aVar.mo10228f(inputStreamM10502h);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.mo10227c(e2);
        }
    }
}
