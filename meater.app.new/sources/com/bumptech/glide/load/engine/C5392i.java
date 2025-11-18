package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5427j;
import com.bumptech.glide.load.p127m.InterfaceC5434e;
import com.bumptech.glide.load.p131o.p137h.InterfaceC5529e;
import com.bumptech.glide.p145r.C5596j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: DecodePath.java */
/* renamed from: com.bumptech.glide.load.engine.i */
/* loaded from: classes.dex */
public class C5392i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f13389a;

    /* renamed from: b */
    private final List<? extends InterfaceC5427j<DataType, ResourceType>> f13390b;

    /* renamed from: c */
    private final InterfaceC5529e<ResourceType, Transcode> f13391c;

    /* renamed from: d */
    private final InterfaceC0956f<List<Throwable>> f13392d;

    /* renamed from: e */
    private final String f13393e;

    /* compiled from: DecodePath.java */
    /* renamed from: com.bumptech.glide.load.engine.i$a */
    interface a<ResourceType> {
        /* renamed from: a */
        InterfaceC5404u<ResourceType> mo10284a(InterfaceC5404u<ResourceType> interfaceC5404u);
    }

    public C5392i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends InterfaceC5427j<DataType, ResourceType>> list, InterfaceC5529e<ResourceType, Transcode> interfaceC5529e, InterfaceC0956f<List<Throwable>> interfaceC0956f) {
        this.f13389a = cls;
        this.f13390b = list;
        this.f13391c = interfaceC5529e;
        this.f13392d = interfaceC0956f;
        this.f13393e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private InterfaceC5404u<ResourceType> m10295b(InterfaceC5434e<DataType> interfaceC5434e, int i2, int i3, C5426i c5426i) throws GlideException {
        List<Throwable> list = (List) C5596j.m11042d(this.f13392d.mo6061b());
        try {
            return m10296c(interfaceC5434e, i2, i3, c5426i, list);
        } finally {
            this.f13392d.mo6060a(list);
        }
    }

    /* renamed from: c */
    private InterfaceC5404u<ResourceType> m10296c(InterfaceC5434e<DataType> interfaceC5434e, int i2, int i3, C5426i c5426i, List<Throwable> list) throws GlideException {
        int size = this.f13390b.size();
        InterfaceC5404u<ResourceType> interfaceC5404uMo10453b = null;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC5427j<DataType, ResourceType> interfaceC5427j = this.f13390b.get(i4);
            try {
                if (interfaceC5427j.mo10452a(interfaceC5434e.mo10468a(), c5426i)) {
                    interfaceC5404uMo10453b = interfaceC5427j.mo10453b(interfaceC5434e.mo10468a(), i2, i3, c5426i);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC5427j, e2);
                }
                list.add(e2);
            }
            if (interfaceC5404uMo10453b != null) {
                break;
            }
        }
        if (interfaceC5404uMo10453b != null) {
            return interfaceC5404uMo10453b;
        }
        throw new GlideException(this.f13393e, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC5404u<Transcode> m10297a(InterfaceC5434e<DataType> interfaceC5434e, int i2, int i3, C5426i c5426i, a<ResourceType> aVar) throws GlideException {
        return this.f13391c.mo10776a(aVar.mo10284a(m10295b(interfaceC5434e, i2, i3, c5426i)), c5426i);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f13389a + ", decoders=" + this.f13390b + ", transcoder=" + this.f13391c + '}';
    }
}
