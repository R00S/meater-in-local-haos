package s6;

import com.bumptech.glide.load.data.d;
import m6.C3972g;
import m6.EnumC3966a;
import s6.o;

/* compiled from: UnitModelLoader.java */
/* loaded from: classes2.dex */
public class x<Model> implements o<Model, Model> {

    /* renamed from: a, reason: collision with root package name */
    private static final x<?> f49383a = new x<>();

    /* compiled from: UnitModelLoader.java */
    public static class a<Model> implements p<Model, Model> {

        /* renamed from: a, reason: collision with root package name */
        private static final a<?> f49384a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) f49384a;
        }

        @Override // s6.p
        public o<Model, Model> c(s sVar) {
            return x.c();
        }
    }

    @Deprecated
    public x() {
    }

    public static <T> x<T> c() {
        return (x<T>) f49383a;
    }

    @Override // s6.o
    public boolean a(Model model) {
        return true;
    }

    @Override // s6.o
    public o.a<Model> b(Model model, int i10, int i11, C3972g c3972g) {
        return new o.a<>(new G6.d(model), new b(model));
    }

    /* compiled from: UnitModelLoader.java */
    private static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: B, reason: collision with root package name */
        private final Model f49385B;

        b(Model model) {
            this.f49385B = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Model> a() {
            return (Class<Model>) this.f49385B.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3966a d() {
            return EnumC3966a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super Model> aVar) {
            aVar.f(this.f49385B);
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
