package H6;

/* compiled from: GlideSuppliers.java */
/* loaded from: classes2.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: GlideSuppliers.java */
    class a<T> implements b<T> {

        /* renamed from: a, reason: collision with root package name */
        private volatile T f5588a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f5589b;

        a(b bVar) {
            this.f5589b = bVar;
        }

        @Override // H6.f.b
        public T get() {
            if (this.f5588a == null) {
                synchronized (this) {
                    try {
                        if (this.f5588a == null) {
                            this.f5588a = (T) k.d(this.f5589b.get());
                        }
                    } finally {
                    }
                }
            }
            return this.f5588a;
        }
    }

    /* compiled from: GlideSuppliers.java */
    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
