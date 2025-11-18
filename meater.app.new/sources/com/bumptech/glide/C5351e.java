package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.C5394k;
import com.bumptech.glide.load.engine.p126z.InterfaceC5410b;
import com.bumptech.glide.p141p.C5565h;
import com.bumptech.glide.p141p.InterfaceC5564g;
import com.bumptech.glide.p141p.p142l.AbstractC5578j;
import com.bumptech.glide.p141p.p142l.C5573e;
import java.util.List;
import java.util.Map;

/* compiled from: GlideContext.java */
/* renamed from: com.bumptech.glide.e */
/* loaded from: classes.dex */
public class C5351e extends ContextWrapper {

    /* renamed from: a */
    static final AbstractC5356j<?, ?> f13071a = new C5348b();

    /* renamed from: b */
    private final InterfaceC5410b f13072b;

    /* renamed from: c */
    private final Registry f13073c;

    /* renamed from: d */
    private final C5573e f13074d;

    /* renamed from: e */
    private final C5565h f13075e;

    /* renamed from: f */
    private final List<InterfaceC5564g<Object>> f13076f;

    /* renamed from: g */
    private final Map<Class<?>, AbstractC5356j<?, ?>> f13077g;

    /* renamed from: h */
    private final C5394k f13078h;

    /* renamed from: i */
    private final boolean f13079i;

    /* renamed from: j */
    private final int f13080j;

    public C5351e(Context context, InterfaceC5410b interfaceC5410b, Registry registry, C5573e c5573e, C5565h c5565h, Map<Class<?>, AbstractC5356j<?, ?>> map, List<InterfaceC5564g<Object>> list, C5394k c5394k, boolean z, int i2) {
        super(context.getApplicationContext());
        this.f13072b = interfaceC5410b;
        this.f13073c = registry;
        this.f13074d = c5573e;
        this.f13075e = c5565h;
        this.f13076f = list;
        this.f13077g = map;
        this.f13078h = c5394k;
        this.f13079i = z;
        this.f13080j = i2;
    }

    /* renamed from: a */
    public <X> AbstractC5578j<ImageView, X> m9997a(ImageView imageView, Class<X> cls) {
        return this.f13074d.m10984a(imageView, cls);
    }

    /* renamed from: b */
    public InterfaceC5410b m9998b() {
        return this.f13072b;
    }

    /* renamed from: c */
    public List<InterfaceC5564g<Object>> m9999c() {
        return this.f13076f;
    }

    /* renamed from: d */
    public C5565h m10000d() {
        return this.f13075e;
    }

    /* renamed from: e */
    public <T> AbstractC5356j<?, T> m10001e(Class<T> cls) {
        AbstractC5356j<?, T> abstractC5356j = (AbstractC5356j) this.f13077g.get(cls);
        if (abstractC5356j == null) {
            for (Map.Entry<Class<?>, AbstractC5356j<?, ?>> entry : this.f13077g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    abstractC5356j = (AbstractC5356j) entry.getValue();
                }
            }
        }
        return abstractC5356j == null ? (AbstractC5356j<?, T>) f13071a : abstractC5356j;
    }

    /* renamed from: f */
    public C5394k m10002f() {
        return this.f13078h;
    }

    /* renamed from: g */
    public int m10003g() {
        return this.f13080j;
    }

    /* renamed from: h */
    public Registry m10004h() {
        return this.f13073c;
    }

    /* renamed from: i */
    public boolean m10005i() {
        return this.f13079i;
    }
}
