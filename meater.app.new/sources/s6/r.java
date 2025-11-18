package s6;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import m6.C3972g;
import m6.EnumC3966a;
import m6.InterfaceC3970e;
import r1.InterfaceC4339f;
import s6.o;

/* compiled from: MultiModelLoader.java */
/* loaded from: classes2.dex */
class r<Model, Data> implements o<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final List<o<Model, Data>> f49354a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4339f<List<Throwable>> f49355b;

    /* compiled from: MultiModelLoader.java */
    static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: B, reason: collision with root package name */
        private final List<com.bumptech.glide.load.data.d<Data>> f49356B;

        /* renamed from: C, reason: collision with root package name */
        private final InterfaceC4339f<List<Throwable>> f49357C;

        /* renamed from: D, reason: collision with root package name */
        private int f49358D;

        /* renamed from: E, reason: collision with root package name */
        private com.bumptech.glide.g f49359E;

        /* renamed from: F, reason: collision with root package name */
        private d.a<? super Data> f49360F;

        /* renamed from: G, reason: collision with root package name */
        private List<Throwable> f49361G;

        /* renamed from: H, reason: collision with root package name */
        private boolean f49362H;

        a(List<com.bumptech.glide.load.data.d<Data>> list, InterfaceC4339f<List<Throwable>> interfaceC4339f) {
            this.f49357C = interfaceC4339f;
            H6.k.c(list);
            this.f49356B = list;
            this.f49358D = 0;
        }

        private void g() {
            if (this.f49362H) {
                return;
            }
            if (this.f49358D < this.f49356B.size() - 1) {
                this.f49358D++;
                e(this.f49359E, this.f49360F);
            } else {
                H6.k.d(this.f49361G);
                this.f49360F.c(new GlideException("Fetch failed", new ArrayList(this.f49361G)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f49356B.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f49361G;
            if (list != null) {
                this.f49357C.a(list);
            }
            this.f49361G = null;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f49356B.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) H6.k.d(this.f49361G)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f49362H = true;
            Iterator<com.bumptech.glide.load.data.d<Data>> it = this.f49356B.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3966a d() {
            return this.f49356B.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            this.f49359E = gVar;
            this.f49360F = aVar;
            this.f49361G = this.f49357C.b();
            this.f49356B.get(this.f49358D).e(gVar, this);
            if (this.f49362H) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Data data) {
            if (data != null) {
                this.f49360F.f(data);
            } else {
                g();
            }
        }
    }

    r(List<o<Model, Data>> list, InterfaceC4339f<List<Throwable>> interfaceC4339f) {
        this.f49354a = list;
        this.f49355b = interfaceC4339f;
    }

    @Override // s6.o
    public boolean a(Model model) {
        Iterator<o<Model, Data>> it = this.f49354a.iterator();
        while (it.hasNext()) {
            if (it.next().a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // s6.o
    public o.a<Data> b(Model model, int i10, int i11, C3972g c3972g) {
        o.a<Data> aVarB;
        int size = this.f49354a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC3970e interfaceC3970e = null;
        for (int i12 = 0; i12 < size; i12++) {
            o<Model, Data> oVar = this.f49354a.get(i12);
            if (oVar.a(model) && (aVarB = oVar.b(model, i10, i11, c3972g)) != null) {
                interfaceC3970e = aVarB.f49347a;
                arrayList.add(aVarB.f49349c);
            }
        }
        if (arrayList.isEmpty() || interfaceC3970e == null) {
            return null;
        }
        return new o.a<>(interfaceC3970e, new a(arrayList, this.f49355b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f49354a.toArray()) + '}';
    }
}
