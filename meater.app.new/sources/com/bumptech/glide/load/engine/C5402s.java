package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.engine.C5392i;
import com.bumptech.glide.load.p127m.InterfaceC5434e;
import com.bumptech.glide.p145r.C5596j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: LoadPath.java */
/* renamed from: com.bumptech.glide.load.engine.s */
/* loaded from: classes.dex */
public class C5402s<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<Data> f13473a;

    /* renamed from: b */
    private final InterfaceC0956f<List<Throwable>> f13474b;

    /* renamed from: c */
    private final List<? extends C5392i<Data, ResourceType, Transcode>> f13475c;

    /* renamed from: d */
    private final String f13476d;

    public C5402s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C5392i<Data, ResourceType, Transcode>> list, InterfaceC0956f<List<Throwable>> interfaceC0956f) {
        this.f13473a = cls;
        this.f13474b = interfaceC0956f;
        this.f13475c = (List) C5596j.m11041c(list);
        this.f13476d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private InterfaceC5404u<Transcode> m10351b(InterfaceC5434e<Data> interfaceC5434e, C5426i c5426i, int i2, int i3, C5392i.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f13475c.size();
        InterfaceC5404u<Transcode> interfaceC5404uM10297a = null;
        for (int i4 = 0; i4 < size; i4++) {
            try {
                interfaceC5404uM10297a = this.f13475c.get(i4).m10297a(interfaceC5434e, i2, i3, c5426i, aVar);
            } catch (GlideException e2) {
                list.add(e2);
            }
            if (interfaceC5404uM10297a != null) {
                break;
            }
        }
        if (interfaceC5404uM10297a != null) {
            return interfaceC5404uM10297a;
        }
        throw new GlideException(this.f13476d, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC5404u<Transcode> m10352a(InterfaceC5434e<Data> interfaceC5434e, C5426i c5426i, int i2, int i3, C5392i.a<ResourceType> aVar) throws GlideException {
        List<Throwable> list = (List) C5596j.m11042d(this.f13474b.mo6061b());
        try {
            return m10351b(interfaceC5434e, c5426i, i2, i3, aVar, list);
        } finally {
            this.f13474b.mo6060a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f13475c.toArray()) + '}';
    }
}
