package com.bumptech.glide.load.p129n;

import com.bumptech.glide.EnumC5353g;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import com.bumptech.glide.load.p129n.InterfaceC5462n;
import com.bumptech.glide.p145r.C5596j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: MultiModelLoader.java */
/* renamed from: com.bumptech.glide.load.n.q */
/* loaded from: classes.dex */
class C5465q<Model, Data> implements InterfaceC5462n<Model, Data> {

    /* renamed from: a */
    private final List<InterfaceC5462n<Model, Data>> f13661a;

    /* renamed from: b */
    private final InterfaceC0956f<List<Throwable>> f13662b;

    /* compiled from: MultiModelLoader.java */
    /* renamed from: com.bumptech.glide.load.n.q$a */
    static class a<Data> implements InterfaceC5433d<Data>, InterfaceC5433d.a<Data> {

        /* renamed from: f */
        private final List<InterfaceC5433d<Data>> f13663f;

        /* renamed from: g */
        private final InterfaceC0956f<List<Throwable>> f13664g;

        /* renamed from: h */
        private int f13665h;

        /* renamed from: i */
        private EnumC5353g f13666i;

        /* renamed from: j */
        private InterfaceC5433d.a<? super Data> f13667j;

        /* renamed from: k */
        private List<Throwable> f13668k;

        /* renamed from: l */
        private boolean f13669l;

        a(List<InterfaceC5433d<Data>> list, InterfaceC0956f<List<Throwable>> interfaceC0956f) {
            this.f13664g = interfaceC0956f;
            C5596j.m11041c(list);
            this.f13663f = list;
            this.f13665h = 0;
        }

        /* renamed from: g */
        private void m10566g() {
            if (this.f13669l) {
                return;
            }
            if (this.f13665h < this.f13663f.size() - 1) {
                this.f13665h++;
                mo10463e(this.f13666i, this.f13667j);
            } else {
                C5596j.m11042d(this.f13668k);
                this.f13667j.mo10227c(new GlideException("Fetch failed", new ArrayList(this.f13668k)));
            }
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: a */
        public Class<Data> mo10455a() {
            return this.f13663f.get(0).mo10455a();
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: b */
        public void mo10460b() {
            List<Throwable> list = this.f13668k;
            if (list != null) {
                this.f13664g.mo6060a(list);
            }
            this.f13668k = null;
            Iterator<InterfaceC5433d<Data>> it = this.f13663f.iterator();
            while (it.hasNext()) {
                it.next().mo10460b();
            }
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d.a
        /* renamed from: c */
        public void mo10227c(Exception exc) {
            ((List) C5596j.m11042d(this.f13668k)).add(exc);
            m10566g();
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        public void cancel() {
            this.f13669l = true;
            Iterator<InterfaceC5433d<Data>> it = this.f13663f.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: d */
        public EnumC5365a mo10462d() {
            return this.f13663f.get(0).mo10462d();
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d
        /* renamed from: e */
        public void mo10463e(EnumC5353g enumC5353g, InterfaceC5433d.a<? super Data> aVar) {
            this.f13666i = enumC5353g;
            this.f13667j = aVar;
            this.f13668k = this.f13664g.mo6061b();
            this.f13663f.get(this.f13665h).mo10463e(enumC5353g, this);
            if (this.f13669l) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5433d.a
        /* renamed from: f */
        public void mo10228f(Data data) {
            if (data != null) {
                this.f13667j.mo10228f(data);
            } else {
                m10566g();
            }
        }
    }

    C5465q(List<InterfaceC5462n<Model, Data>> list, InterfaceC0956f<List<Throwable>> interfaceC0956f) {
        this.f13661a = list;
        this.f13662b = interfaceC0956f;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: a */
    public boolean mo10508a(Model model) {
        Iterator<InterfaceC5462n<Model, Data>> it = this.f13661a.iterator();
        while (it.hasNext()) {
            if (it.next().mo10508a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5462n
    /* renamed from: b */
    public InterfaceC5462n.a<Data> mo10509b(Model model, int i2, int i3, C5426i c5426i) {
        InterfaceC5462n.a<Data> aVarMo10509b;
        int size = this.f13661a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC5423f interfaceC5423f = null;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC5462n<Model, Data> interfaceC5462n = this.f13661a.get(i4);
            if (interfaceC5462n.mo10508a(model) && (aVarMo10509b = interfaceC5462n.mo10509b(model, i2, i3, c5426i)) != null) {
                interfaceC5423f = aVarMo10509b.f13654a;
                arrayList.add(aVarMo10509b.f13656c);
            }
        }
        if (arrayList.isEmpty() || interfaceC5423f == null) {
            return null;
        }
        return new InterfaceC5462n.a<>(interfaceC5423f, new a(arrayList, this.f13662b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f13661a.toArray()) + '}';
    }
}
