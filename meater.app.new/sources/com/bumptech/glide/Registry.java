package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m6.InterfaceC3969d;
import m6.InterfaceC3974i;
import m6.InterfaceC3975j;
import o6.InterfaceC4139c;
import r1.InterfaceC4339f;
import s6.o;
import s6.p;
import s6.q;

/* loaded from: classes2.dex */
public class Registry {

    /* renamed from: a, reason: collision with root package name */
    private final q f32913a;

    /* renamed from: b, reason: collision with root package name */
    private final C6.a f32914b;

    /* renamed from: c, reason: collision with root package name */
    private final C6.e f32915c;

    /* renamed from: d, reason: collision with root package name */
    private final C6.f f32916d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f32917e;

    /* renamed from: f, reason: collision with root package name */
    private final z6.f f32918f;

    /* renamed from: g, reason: collision with root package name */
    private final C6.b f32919g;

    /* renamed from: h, reason: collision with root package name */
    private final C6.d f32920h = new C6.d();

    /* renamed from: i, reason: collision with root package name */
    private final C6.c f32921i = new C6.c();

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC4339f<List<Throwable>> f32922j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> NoModelLoaderAvailableException(M m10, List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        InterfaceC4339f<List<Throwable>> interfaceC4339fE = I6.a.e();
        this.f32922j = interfaceC4339fE;
        this.f32913a = new q(interfaceC4339fE);
        this.f32914b = new C6.a();
        this.f32915c = new C6.e();
        this.f32916d = new C6.f();
        this.f32917e = new com.bumptech.glide.load.data.f();
        this.f32918f = new z6.f();
        this.f32919g = new C6.b();
        r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private <Data, TResource, Transcode> List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f32915c.d(cls, cls2)) {
            for (Class cls5 : this.f32918f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.engine.i(cls, cls4, cls5, this.f32915c.b(cls, cls4), this.f32918f.a(cls4, cls5), this.f32922j));
            }
        }
        return arrayList;
    }

    public <Data, TResource> Registry a(Class<Data> cls, Class<TResource> cls2, InterfaceC3974i<Data, TResource> interfaceC3974i) {
        e("legacy_append", cls, cls2, interfaceC3974i);
        return this;
    }

    public <Model, Data> Registry b(Class<Model> cls, Class<Data> cls2, p<Model, Data> pVar) {
        this.f32913a.a(cls, cls2, pVar);
        return this;
    }

    public <Data> Registry c(Class<Data> cls, InterfaceC3969d<Data> interfaceC3969d) {
        this.f32914b.a(cls, interfaceC3969d);
        return this;
    }

    public <TResource> Registry d(Class<TResource> cls, InterfaceC3975j<TResource> interfaceC3975j) {
        this.f32916d.a(cls, interfaceC3975j);
        return this;
    }

    public <Data, TResource> Registry e(String str, Class<Data> cls, Class<TResource> cls2, InterfaceC3974i<Data, TResource> interfaceC3974i) {
        this.f32915c.a(str, interfaceC3974i, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> listB = this.f32919g.b();
        if (listB.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listB;
    }

    public <Data, TResource, Transcode> com.bumptech.glide.load.engine.q<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        com.bumptech.glide.load.engine.q<Data, TResource, Transcode> qVarA = this.f32921i.a(cls, cls2, cls3);
        if (this.f32921i.c(qVarA)) {
            return null;
        }
        if (qVarA == null) {
            List<com.bumptech.glide.load.engine.i<Data, TResource, Transcode>> listF = f(cls, cls2, cls3);
            qVarA = listF.isEmpty() ? null : new com.bumptech.glide.load.engine.q<>(cls, cls2, cls3, listF, this.f32922j);
            this.f32921i.d(cls, cls2, cls3, qVarA);
        }
        return qVarA;
    }

    public <Model> List<o<Model, ?>> i(Model model) {
        return this.f32913a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> listA = this.f32920h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList<>();
            Iterator<Class<?>> it = this.f32913a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f32915c.d(it.next(), cls2)) {
                    if (!this.f32918f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f32920h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public <X> InterfaceC3975j<X> k(InterfaceC4139c<X> interfaceC4139c) {
        InterfaceC3975j<X> interfaceC3975jB = this.f32916d.b(interfaceC4139c.d());
        if (interfaceC3975jB != null) {
            return interfaceC3975jB;
        }
        throw new NoResultEncoderAvailableException(interfaceC4139c.d());
    }

    public <X> com.bumptech.glide.load.data.e<X> l(X x10) {
        return this.f32917e.a(x10);
    }

    public <X> InterfaceC3969d<X> m(X x10) {
        InterfaceC3969d<X> interfaceC3969dB = this.f32914b.b(x10.getClass());
        if (interfaceC3969dB != null) {
            return interfaceC3969dB;
        }
        throw new NoSourceEncoderAvailableException(x10.getClass());
    }

    public boolean n(InterfaceC4139c<?> interfaceC4139c) {
        return this.f32916d.b(interfaceC4139c.d()) != null;
    }

    public Registry o(ImageHeaderParser imageHeaderParser) {
        this.f32919g.a(imageHeaderParser);
        return this;
    }

    public Registry p(e.a<?> aVar) {
        this.f32917e.b(aVar);
        return this;
    }

    public <TResource, Transcode> Registry q(Class<TResource> cls, Class<Transcode> cls2, z6.e<TResource, Transcode> eVar) {
        this.f32918f.c(cls, cls2, eVar);
        return this;
    }

    public final Registry r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f32915c.e(arrayList);
        return this;
    }
}
