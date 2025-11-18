package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m6.C3972g;
import o6.InterfaceC4139c;
import r1.InterfaceC4339f;

/* compiled from: LoadPath.java */
/* loaded from: classes2.dex */
public class q<Data, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<Data> f33249a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4339f<List<Throwable>> f33250b;

    /* renamed from: c, reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f33251c;

    /* renamed from: d, reason: collision with root package name */
    private final String f33252d;

    public q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, InterfaceC4339f<List<Throwable>> interfaceC4339f) {
        this.f33249a = cls;
        this.f33250b = interfaceC4339f;
        this.f33251c = (List) H6.k.c(list);
        this.f33252d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private InterfaceC4139c<Transcode> b(com.bumptech.glide.load.data.e<Data> eVar, C3972g c3972g, int i10, int i11, i.a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        int size = this.f33251c.size();
        InterfaceC4139c<Transcode> interfaceC4139cA = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                interfaceC4139cA = this.f33251c.get(i12).a(eVar, i10, i11, c3972g, aVar);
            } catch (GlideException e10) {
                list.add(e10);
            }
            if (interfaceC4139cA != null) {
                break;
            }
        }
        if (interfaceC4139cA != null) {
            return interfaceC4139cA;
        }
        throw new GlideException(this.f33252d, new ArrayList(list));
    }

    public InterfaceC4139c<Transcode> a(com.bumptech.glide.load.data.e<Data> eVar, C3972g c3972g, int i10, int i11, i.a<ResourceType> aVar) {
        List<Throwable> list = (List) H6.k.d(this.f33250b.b());
        try {
            return b(eVar, c3972g, i10, i11, aVar, list);
        } finally {
            this.f33250b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f33251c.toArray()) + '}';
    }
}
