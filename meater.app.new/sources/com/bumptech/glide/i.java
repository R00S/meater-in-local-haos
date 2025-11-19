package com.bumptech.glide;

import H6.f;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.c;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.resource.bitmap.A;
import com.bumptech.glide.load.resource.bitmap.C;
import com.bumptech.glide.load.resource.bitmap.C2422a;
import com.bumptech.glide.load.resource.bitmap.C2423b;
import com.bumptech.glide.load.resource.bitmap.C2424c;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.E;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.load.resource.bitmap.v;
import com.bumptech.glide.load.resource.bitmap.x;
import com.bumptech.glide.load.resource.bitmap.z;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import l6.InterfaceC3902a;
import m6.InterfaceC3974i;
import p6.InterfaceC4237b;
import p6.InterfaceC4239d;
import s6.C4481a;
import s6.C4482b;
import s6.C4483c;
import s6.C4484d;
import s6.C4485e;
import s6.C4486f;
import s6.C4487g;
import s6.C4488h;
import s6.l;
import s6.p;
import s6.t;
import s6.u;
import s6.w;
import s6.x;
import s6.y;
import s6.z;
import t6.C4567a;
import t6.C4568b;
import t6.C4569c;
import t6.C4570d;
import t6.C4573g;
import v6.C4896a;
import w6.m;
import x6.C5062a;
import y3.C5123a;
import y6.C5129a;
import y6.C5131c;
import y6.C5132d;
import z6.C5197a;

/* compiled from: RegistryFactory.java */
/* loaded from: classes2.dex */
final class i {

    /* compiled from: RegistryFactory.java */
    class a implements f.b<Registry> {

        /* renamed from: a, reason: collision with root package name */
        private boolean f32977a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f32978b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f32979c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ B6.a f32980d;

        a(b bVar, List list, B6.a aVar) {
            this.f32978b = bVar;
            this.f32979c = list;
            this.f32980d = aVar;
        }

        @Override // H6.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f32977a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            C5123a.a("Glide registry");
            this.f32977a = true;
            try {
                return i.a(this.f32978b, this.f32979c, this.f32980d);
            } finally {
                this.f32977a = false;
                C5123a.b();
            }
        }
    }

    static Registry a(b bVar, List<B6.b> list, B6.a aVar) {
        InterfaceC4239d interfaceC4239dF = bVar.f();
        InterfaceC4237b interfaceC4237bE = bVar.e();
        Context applicationContext = bVar.i().getApplicationContext();
        e eVarG = bVar.i().g();
        Registry registry = new Registry();
        b(applicationContext, registry, interfaceC4239dF, interfaceC4237bE, eVarG);
        c(applicationContext, bVar, registry, list, aVar);
        return registry;
    }

    private static void b(Context context, Registry registry, InterfaceC4239d interfaceC4239d, InterfaceC4237b interfaceC4237b, e eVar) {
        InterfaceC3974i iVar;
        InterfaceC3974i a10;
        Object obj;
        Registry registry2;
        registry.o(new DefaultImageHeaderParser());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            registry.o(new r());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> listG = registry.g();
        C5129a c5129a = new C5129a(context, listG, interfaceC4239d, interfaceC4237b);
        InterfaceC3974i<ParcelFileDescriptor, Bitmap> interfaceC3974iM = E.m(interfaceC4239d);
        o oVar = new o(registry.g(), resources.getDisplayMetrics(), interfaceC4239d, interfaceC4237b);
        if (i10 < 28 || !eVar.a(c.b.class)) {
            iVar = new com.bumptech.glide.load.resource.bitmap.i(oVar);
            a10 = new A(oVar, interfaceC4237b);
        } else {
            a10 = new v();
            iVar = new com.bumptech.glide.load.resource.bitmap.k();
        }
        if (i10 >= 28) {
            registry.e("Animation", InputStream.class, Drawable.class, w6.h.f(listG, interfaceC4237b));
            registry.e("Animation", ByteBuffer.class, Drawable.class, w6.h.a(listG, interfaceC4237b));
        }
        w6.l lVar = new w6.l(context);
        C2424c c2424c = new C2424c(interfaceC4237b);
        C5197a c5197a = new C5197a();
        z6.d dVar = new z6.d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.c(ByteBuffer.class, new C4483c()).c(InputStream.class, new s6.v(interfaceC4237b)).e("Bitmap", ByteBuffer.class, Bitmap.class, iVar).e("Bitmap", InputStream.class, Bitmap.class, a10);
        if (ParcelFileDescriptorRewinder.c()) {
            registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new x(oVar));
        }
        registry.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, E.c(interfaceC4239d));
        registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, interfaceC3974iM).b(Bitmap.class, Bitmap.class, x.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new C()).d(Bitmap.class, c2424c).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C2422a(resources, iVar)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C2422a(resources, a10)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C2422a(resources, interfaceC3974iM)).d(BitmapDrawable.class, new C2423b(interfaceC4239d, c2424c)).e("Animation", InputStream.class, C5131c.class, new y6.j(listG, c5129a, interfaceC4237b)).e("Animation", ByteBuffer.class, C5131c.class, c5129a).d(C5131c.class, new C5132d()).b(InterfaceC3902a.class, InterfaceC3902a.class, x.a.a()).e("Bitmap", InterfaceC3902a.class, Bitmap.class, new y6.h(interfaceC4239d)).a(Uri.class, Drawable.class, lVar).a(Uri.class, Bitmap.class, new z(lVar, interfaceC4239d)).p(new C4896a.C0739a()).b(File.class, ByteBuffer.class, new C4484d.b()).b(File.class, InputStream.class, new C4487g.e()).a(File.class, File.class, new C5062a()).b(File.class, ParcelFileDescriptor.class, new C4487g.b()).b(File.class, File.class, x.a.a()).p(new k.a(interfaceC4237b));
        if (ParcelFileDescriptorRewinder.c()) {
            obj = BitmapDrawable.class;
            registry2 = registry;
            registry2.p(new ParcelFileDescriptorRewinder.a());
        } else {
            obj = BitmapDrawable.class;
            registry2 = registry;
        }
        p<Integer, InputStream> pVarG = C4486f.g(context);
        p<Integer, AssetFileDescriptor> pVarC = C4486f.c(context);
        p<Integer, Drawable> pVarE = C4486f.e(context);
        Class cls = Integer.TYPE;
        registry2.b(cls, InputStream.class, pVarG).b(Integer.class, InputStream.class, pVarG).b(cls, AssetFileDescriptor.class, pVarC).b(Integer.class, AssetFileDescriptor.class, pVarC).b(cls, Drawable.class, pVarE).b(Integer.class, Drawable.class, pVarE).b(Uri.class, InputStream.class, u.f(context)).b(Uri.class, AssetFileDescriptor.class, u.e(context));
        t.c cVar = new t.c(resources);
        t.a aVar = new t.a(resources);
        t.b bVar = new t.b(resources);
        Object obj2 = obj;
        registry2.b(Integer.class, Uri.class, cVar).b(cls, Uri.class, cVar).b(Integer.class, AssetFileDescriptor.class, aVar).b(cls, AssetFileDescriptor.class, aVar).b(Integer.class, InputStream.class, bVar).b(cls, InputStream.class, bVar);
        registry2.b(String.class, InputStream.class, new C4485e.c()).b(Uri.class, InputStream.class, new C4485e.c()).b(String.class, InputStream.class, new w.c()).b(String.class, ParcelFileDescriptor.class, new w.b()).b(String.class, AssetFileDescriptor.class, new w.a()).b(Uri.class, InputStream.class, new C4481a.c(context.getAssets())).b(Uri.class, AssetFileDescriptor.class, new C4481a.b(context.getAssets())).b(Uri.class, InputStream.class, new C4568b.a(context)).b(Uri.class, InputStream.class, new C4569c.a(context));
        if (i10 >= 29) {
            registry2.b(Uri.class, InputStream.class, new C4570d.c(context));
            registry2.b(Uri.class, ParcelFileDescriptor.class, new C4570d.b(context));
        }
        registry2.b(Uri.class, InputStream.class, new y.d(contentResolver)).b(Uri.class, ParcelFileDescriptor.class, new y.b(contentResolver)).b(Uri.class, AssetFileDescriptor.class, new y.a(contentResolver)).b(Uri.class, InputStream.class, new z.a()).b(URL.class, InputStream.class, new C4573g.a()).b(Uri.class, File.class, new l.a(context)).b(C4488h.class, InputStream.class, new C4567a.C0708a()).b(byte[].class, ByteBuffer.class, new C4482b.a()).b(byte[].class, InputStream.class, new C4482b.d()).b(Uri.class, Uri.class, x.a.a()).b(Drawable.class, Drawable.class, x.a.a()).a(Drawable.class, Drawable.class, new m()).q(Bitmap.class, obj2, new z6.b(resources)).q(Bitmap.class, byte[].class, c5197a).q(Drawable.class, byte[].class, new z6.c(interfaceC4239d, c5197a, dVar)).q(C5131c.class, byte[].class, dVar);
        InterfaceC3974i<ByteBuffer, Bitmap> interfaceC3974iD = E.d(interfaceC4239d);
        registry2.a(ByteBuffer.class, Bitmap.class, interfaceC3974iD);
        registry2.a(ByteBuffer.class, obj2, new C2422a(resources, interfaceC3974iD));
    }

    private static void c(Context context, b bVar, Registry registry, List<B6.b> list, B6.a aVar) {
        for (B6.b bVar2 : list) {
            try {
                bVar2.b(context, bVar, registry);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + bVar2.getClass().getName(), e10);
            }
        }
        if (aVar != null) {
            aVar.a(context, bVar, registry);
        }
    }

    static f.b<Registry> d(b bVar, List<B6.b> list, B6.a aVar) {
        return new a(bVar, list, aVar);
    }
}
