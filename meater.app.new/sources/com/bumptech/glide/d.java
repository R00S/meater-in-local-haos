package com.bumptech.glide;

import H6.f;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
import p6.InterfaceC4237b;

/* compiled from: GlideContext.java */
/* loaded from: classes2.dex */
public class d extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    static final l<?, ?> f32953k = new a();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4237b f32954a;

    /* renamed from: b, reason: collision with root package name */
    private final f.b<Registry> f32955b;

    /* renamed from: c, reason: collision with root package name */
    private final E6.f f32956c;

    /* renamed from: d, reason: collision with root package name */
    private final b.a f32957d;

    /* renamed from: e, reason: collision with root package name */
    private final List<D6.f<Object>> f32958e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<?>, l<?, ?>> f32959f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f32960g;

    /* renamed from: h, reason: collision with root package name */
    private final e f32961h;

    /* renamed from: i, reason: collision with root package name */
    private final int f32962i;

    /* renamed from: j, reason: collision with root package name */
    private D6.g f32963j;

    public d(Context context, InterfaceC4237b interfaceC4237b, f.b<Registry> bVar, E6.f fVar, b.a aVar, Map<Class<?>, l<?, ?>> map, List<D6.f<Object>> list, com.bumptech.glide.load.engine.j jVar, e eVar, int i10) {
        super(context.getApplicationContext());
        this.f32954a = interfaceC4237b;
        this.f32956c = fVar;
        this.f32957d = aVar;
        this.f32958e = list;
        this.f32959f = map;
        this.f32960g = jVar;
        this.f32961h = eVar;
        this.f32962i = i10;
        this.f32955b = H6.f.a(bVar);
    }

    public <X> E6.j<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.f32956c.a(imageView, cls);
    }

    public InterfaceC4237b b() {
        return this.f32954a;
    }

    public List<D6.f<Object>> c() {
        return this.f32958e;
    }

    public synchronized D6.g d() {
        try {
            if (this.f32963j == null) {
                this.f32963j = this.f32957d.e().S();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f32963j;
    }

    public <T> l<?, T> e(Class<T> cls) {
        l<?, T> lVar = (l) this.f32959f.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : this.f32959f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                }
            }
        }
        return lVar == null ? (l<?, T>) f32953k : lVar;
    }

    public com.bumptech.glide.load.engine.j f() {
        return this.f32960g;
    }

    public e g() {
        return this.f32961h;
    }

    public int h() {
        return this.f32962i;
    }

    public Registry i() {
        return this.f32955b.get();
    }
}
