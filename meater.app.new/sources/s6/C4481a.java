package s6;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;
import m6.C3972g;
import s6.o;

/* compiled from: AssetUriLoader.java */
/* renamed from: s6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4481a<Data> implements o<Uri, Data> {

    /* renamed from: c, reason: collision with root package name */
    private static final int f49287c = 22;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f49288a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0696a<Data> f49289b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: s6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0696a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* renamed from: s6.a$b */
    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC0696a<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f49290a;

        public b(AssetManager assetManager) {
            this.f49290a = assetManager;
        }

        @Override // s6.C4481a.InterfaceC0696a
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // s6.p
        public o<Uri, AssetFileDescriptor> c(s sVar) {
            return new C4481a(this.f49290a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* renamed from: s6.a$c */
    public static class c implements p<Uri, InputStream>, InterfaceC0696a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f49291a;

        public c(AssetManager assetManager) {
            this.f49291a = assetManager;
        }

        @Override // s6.C4481a.InterfaceC0696a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // s6.p
        public o<Uri, InputStream> c(s sVar) {
            return new C4481a(this.f49291a, this);
        }
    }

    public C4481a(AssetManager assetManager, InterfaceC0696a<Data> interfaceC0696a) {
        this.f49288a = assetManager;
        this.f49289b = interfaceC0696a;
    }

    @Override // s6.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Uri uri, int i10, int i11, C3972g c3972g) {
        return new o.a<>(new G6.d(uri), this.f49289b.a(this.f49288a, uri.toString().substring(f49287c)));
    }

    @Override // s6.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
