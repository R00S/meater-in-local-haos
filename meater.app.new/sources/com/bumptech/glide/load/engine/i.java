package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import m6.C3972g;
import m6.InterfaceC3974i;
import o6.InterfaceC4139c;
import r1.InterfaceC4339f;

/* compiled from: DecodePath.java */
/* loaded from: classes2.dex */
public class i<DataType, ResourceType, Transcode> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<DataType> f33167a;

    /* renamed from: b, reason: collision with root package name */
    private final List<? extends InterfaceC3974i<DataType, ResourceType>> f33168b;

    /* renamed from: c, reason: collision with root package name */
    private final z6.e<ResourceType, Transcode> f33169c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4339f<List<Throwable>> f33170d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33171e;

    /* compiled from: DecodePath.java */
    interface a<ResourceType> {
        InterfaceC4139c<ResourceType> a(InterfaceC4139c<ResourceType> interfaceC4139c);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends InterfaceC3974i<DataType, ResourceType>> list, z6.e<ResourceType, Transcode> eVar, InterfaceC4339f<List<Throwable>> interfaceC4339f) {
        this.f33167a = cls;
        this.f33168b = list;
        this.f33169c = eVar;
        this.f33170d = interfaceC4339f;
        this.f33171e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private InterfaceC4139c<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, C3972g c3972g) {
        List<Throwable> list = (List) H6.k.d(this.f33170d.b());
        try {
            return c(eVar, i10, i11, c3972g, list);
        } finally {
            this.f33170d.a(list);
        }
    }

    private InterfaceC4139c<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, C3972g c3972g, List<Throwable> list) throws GlideException {
        int size = this.f33168b.size();
        InterfaceC4139c<ResourceType> interfaceC4139cA = null;
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC3974i<DataType, ResourceType> interfaceC3974i = this.f33168b.get(i12);
            try {
                if (interfaceC3974i.b(eVar.a(), c3972g)) {
                    interfaceC4139cA = interfaceC3974i.a(eVar.a(), i10, i11, c3972g);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC3974i, e10);
                }
                list.add(e10);
            }
            if (interfaceC4139cA != null) {
                break;
            }
        }
        if (interfaceC4139cA != null) {
            return interfaceC4139cA;
        }
        throw new GlideException(this.f33171e, new ArrayList(list));
    }

    public InterfaceC4139c<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, C3972g c3972g, a<ResourceType> aVar) {
        return this.f33169c.a(aVar.a(b(eVar, i10, i11, c3972g)), c3972g);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f33167a + ", decoders=" + this.f33168b + ", transcoder=" + this.f33169c + '}';
    }
}
