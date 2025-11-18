package s6;

import java.util.Collections;
import java.util.List;
import m6.C3972g;
import m6.InterfaceC3970e;

/* compiled from: ModelLoader.java */
/* loaded from: classes2.dex */
public interface o<Model, Data> {

    /* compiled from: ModelLoader.java */
    public static class a<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC3970e f49347a;

        /* renamed from: b, reason: collision with root package name */
        public final List<InterfaceC3970e> f49348b;

        /* renamed from: c, reason: collision with root package name */
        public final com.bumptech.glide.load.data.d<Data> f49349c;

        public a(InterfaceC3970e interfaceC3970e, com.bumptech.glide.load.data.d<Data> dVar) {
            this(interfaceC3970e, Collections.emptyList(), dVar);
        }

        public a(InterfaceC3970e interfaceC3970e, List<InterfaceC3970e> list, com.bumptech.glide.load.data.d<Data> dVar) {
            this.f49347a = (InterfaceC3970e) H6.k.d(interfaceC3970e);
            this.f49348b = (List) H6.k.d(list);
            this.f49349c = (com.bumptech.glide.load.data.d) H6.k.d(dVar);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, C3972g c3972g);
}
