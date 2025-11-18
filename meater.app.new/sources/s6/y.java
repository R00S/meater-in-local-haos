package s6;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import m6.C3972g;
import s6.o;

/* compiled from: UriLoader.java */
/* loaded from: classes2.dex */
public class y<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f49386b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    private final c<Data> f49387a;

    /* compiled from: UriLoader.java */
    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f49388a;

        public a(ContentResolver contentResolver) {
            this.f49388a = contentResolver;
        }

        @Override // s6.y.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f49388a, uri);
        }

        @Override // s6.p
        public o<Uri, AssetFileDescriptor> c(s sVar) {
            return new y(this);
        }
    }

    /* compiled from: UriLoader.java */
    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f49389a;

        public b(ContentResolver contentResolver) {
            this.f49389a = contentResolver;
        }

        @Override // s6.y.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f49389a, uri);
        }

        @Override // s6.p
        public o<Uri, ParcelFileDescriptor> c(s sVar) {
            return new y(this);
        }
    }

    /* compiled from: UriLoader.java */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f49390a;

        public d(ContentResolver contentResolver) {
            this.f49390a = contentResolver;
        }

        @Override // s6.y.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f49390a, uri);
        }

        @Override // s6.p
        public o<Uri, InputStream> c(s sVar) {
            return new y(this);
        }
    }

    public y(c<Data> cVar) {
        this.f49387a = cVar;
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Uri uri, int i10, int i11, C3972g c3972g) {
        return new o.a<>(new G6.d(uri), this.f49387a.a(uri));
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f49386b.contains(uri.getScheme());
    }
}
