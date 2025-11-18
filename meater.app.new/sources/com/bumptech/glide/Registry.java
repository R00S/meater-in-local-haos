package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC5368d;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.InterfaceC5428k;
import com.bumptech.glide.load.engine.C5392i;
import com.bumptech.glide.load.engine.C5402s;
import com.bumptech.glide.load.engine.InterfaceC5404u;
import com.bumptech.glide.load.p127m.C5435f;
import com.bumptech.glide.load.p127m.InterfaceC5434e;
import com.bumptech.glide.load.p129n.C5464p;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import com.bumptech.glide.load.p129n.InterfaceC5463o;
import com.bumptech.glide.load.p131o.p137h.C5530f;
import com.bumptech.glide.load.p131o.p137h.InterfaceC5529e;
import com.bumptech.glide.p140o.C5552a;
import com.bumptech.glide.p140o.C5553b;
import com.bumptech.glide.p140o.C5554c;
import com.bumptech.glide.p140o.C5555d;
import com.bumptech.glide.p140o.C5556e;
import com.bumptech.glide.p140o.C5557f;
import com.bumptech.glide.p145r.p146l.C5598a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p024c.p052i.p059j.InterfaceC0956f;

/* loaded from: classes.dex */
public class Registry {

    /* renamed from: a */
    private final C5464p f13031a;

    /* renamed from: b */
    private final C5552a f13032b;

    /* renamed from: c */
    private final C5556e f13033c;

    /* renamed from: d */
    private final C5557f f13034d;

    /* renamed from: e */
    private final C5435f f13035e;

    /* renamed from: f */
    private final C5530f f13036f;

    /* renamed from: g */
    private final C5553b f13037g;

    /* renamed from: h */
    private final C5555d f13038h = new C5555d();

    /* renamed from: i */
    private final C5554c f13039i = new C5554c();

    /* renamed from: j */
    private final InterfaceC0956f<List<Throwable>> f13040j;

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
            super("Failed to find any ModelLoaders for model: " + obj);
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
        InterfaceC0956f<List<Throwable>> interfaceC0956fM11069e = C5598a.m11069e();
        this.f13040j = interfaceC0956fM11069e;
        this.f13031a = new C5464p(interfaceC0956fM11069e);
        this.f13032b = new C5552a();
        this.f13033c = new C5556e();
        this.f13034d = new C5557f();
        this.f13035e = new C5435f();
        this.f13036f = new C5530f();
        this.f13037g = new C5553b();
        m9968r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: f */
    private <Data, TResource, Transcode> List<C5392i<Data, TResource, Transcode>> m9951f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f13033c.m10857d(cls, cls2)) {
            for (Class cls5 : this.f13036f.m10779b(cls4, cls3)) {
                arrayList.add(new C5392i(cls, cls4, cls5, this.f13033c.m10856b(cls, cls4), this.f13036f.m10778a(cls4, cls5), this.f13040j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> Registry m9952a(Class<Data> cls, InterfaceC5368d<Data> interfaceC5368d) {
        this.f13032b.m10843a(cls, interfaceC5368d);
        return this;
    }

    /* renamed from: b */
    public <TResource> Registry m9953b(Class<TResource> cls, InterfaceC5428k<TResource> interfaceC5428k) {
        this.f13034d.m10860a(cls, interfaceC5428k);
        return this;
    }

    /* renamed from: c */
    public <Data, TResource> Registry m9954c(Class<Data> cls, Class<TResource> cls2, InterfaceC5427j<Data, TResource> interfaceC5427j) {
        m9956e("legacy_append", cls, cls2, interfaceC5427j);
        return this;
    }

    /* renamed from: d */
    public <Model, Data> Registry m9955d(Class<Model> cls, Class<Data> cls2, InterfaceC5463o<Model, Data> interfaceC5463o) {
        this.f13031a.m10560a(cls, cls2, interfaceC5463o);
        return this;
    }

    /* renamed from: e */
    public <Data, TResource> Registry m9956e(String str, Class<Data> cls, Class<TResource> cls2, InterfaceC5427j<Data, TResource> interfaceC5427j) {
        this.f13033c.m10855a(str, interfaceC5427j, cls, cls2);
        return this;
    }

    /* renamed from: g */
    public List<ImageHeaderParser> m9957g() {
        List<ImageHeaderParser> listM10847b = this.f13037g.m10847b();
        if (listM10847b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return listM10847b;
    }

    /* renamed from: h */
    public <Data, TResource, Transcode> C5402s<Data, TResource, Transcode> m9958h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C5402s<Data, TResource, Transcode> c5402sM10849a = this.f13039i.m10849a(cls, cls2, cls3);
        if (this.f13039i.m10850c(c5402sM10849a)) {
            return null;
        }
        if (c5402sM10849a == null) {
            List<C5392i<Data, TResource, Transcode>> listM9951f = m9951f(cls, cls2, cls3);
            c5402sM10849a = listM9951f.isEmpty() ? null : new C5402s<>(cls, cls2, cls3, listM9951f, this.f13040j);
            this.f13039i.m10851d(cls, cls2, cls3, c5402sM10849a);
        }
        return c5402sM10849a;
    }

    /* renamed from: i */
    public <Model> List<InterfaceC5462n<Model, ?>> m9959i(Model model) {
        List<InterfaceC5462n<Model, ?>> listM10562d = this.f13031a.m10562d(model);
        if (listM10562d.isEmpty()) {
            throw new NoModelLoaderAvailableException(model);
        }
        return listM10562d;
    }

    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> m9960j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> listM10852a = this.f13038h.m10852a(cls, cls2, cls3);
        if (listM10852a == null) {
            listM10852a = new ArrayList<>();
            Iterator<Class<?>> it = this.f13031a.m10561c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f13033c.m10857d(it.next(), cls2)) {
                    if (!this.f13036f.m10779b(cls4, cls3).isEmpty() && !listM10852a.contains(cls4)) {
                        listM10852a.add(cls4);
                    }
                }
            }
            this.f13038h.m10853b(cls, cls2, cls3, Collections.unmodifiableList(listM10852a));
        }
        return listM10852a;
    }

    /* renamed from: k */
    public <X> InterfaceC5428k<X> m9961k(InterfaceC5404u<X> interfaceC5404u) throws NoResultEncoderAvailableException {
        InterfaceC5428k<X> interfaceC5428kM10861b = this.f13034d.m10861b(interfaceC5404u.mo10342e());
        if (interfaceC5428kM10861b != null) {
            return interfaceC5428kM10861b;
        }
        throw new NoResultEncoderAvailableException(interfaceC5404u.mo10342e());
    }

    /* renamed from: l */
    public <X> InterfaceC5434e<X> m9962l(X x) {
        return this.f13035e.m10472a(x);
    }

    /* renamed from: m */
    public <X> InterfaceC5368d<X> m9963m(X x) throws NoSourceEncoderAvailableException {
        InterfaceC5368d<X> interfaceC5368dM10844b = this.f13032b.m10844b(x.getClass());
        if (interfaceC5368dM10844b != null) {
            return interfaceC5368dM10844b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: n */
    public boolean m9964n(InterfaceC5404u<?> interfaceC5404u) {
        return this.f13034d.m10861b(interfaceC5404u.mo10342e()) != null;
    }

    /* renamed from: o */
    public Registry m9965o(ImageHeaderParser imageHeaderParser) {
        this.f13037g.m10846a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public Registry m9966p(InterfaceC5434e.a<?> aVar) {
        this.f13035e.m10473b(aVar);
        return this;
    }

    /* renamed from: q */
    public <TResource, Transcode> Registry m9967q(Class<TResource> cls, Class<Transcode> cls2, InterfaceC5529e<TResource, Transcode> interfaceC5529e) {
        this.f13036f.m10780c(cls, cls2, interfaceC5529e);
        return this;
    }

    /* renamed from: r */
    public final Registry m9968r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f13033c.m10858e(arrayList);
        return this;
    }
}
