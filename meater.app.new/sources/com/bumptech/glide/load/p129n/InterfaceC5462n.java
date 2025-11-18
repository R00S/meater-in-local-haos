package com.bumptech.glide.load.p129n;

import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import com.bumptech.glide.p145r.C5596j;
import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader.java */
/* renamed from: com.bumptech.glide.load.n.n */
/* loaded from: classes.dex */
public interface InterfaceC5462n<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* renamed from: com.bumptech.glide.load.n.n$a */
    public static class a<Data> {

        /* renamed from: a */
        public final InterfaceC5423f f13654a;

        /* renamed from: b */
        public final List<InterfaceC5423f> f13655b;

        /* renamed from: c */
        public final InterfaceC5433d<Data> f13656c;

        public a(InterfaceC5423f interfaceC5423f, InterfaceC5433d<Data> interfaceC5433d) {
            this(interfaceC5423f, Collections.emptyList(), interfaceC5433d);
        }

        public a(InterfaceC5423f interfaceC5423f, List<InterfaceC5423f> list, InterfaceC5433d<Data> interfaceC5433d) {
            this.f13654a = (InterfaceC5423f) C5596j.m11042d(interfaceC5423f);
            this.f13655b = (List) C5596j.m11042d(list);
            this.f13656c = (InterfaceC5433d) C5596j.m11042d(interfaceC5433d);
        }
    }

    /* renamed from: a */
    boolean mo10508a(Model model);

    /* renamed from: b */
    a<Data> mo10509b(Model model, int i2, int i3, C5426i c5426i);
}
