package A6;

import A6.o;
import android.content.Context;
import android.view.AbstractC2106m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: LifecycleRequestManagerRetriever.java */
/* loaded from: classes2.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    final Map<AbstractC2106m, com.bumptech.glide.k> f917a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final o.b f918b;

    /* compiled from: LifecycleRequestManagerRetriever.java */
    private final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        private final v f921a;

        b(v vVar) {
            this.f921a = vVar;
        }

        private void b(v vVar, Set<com.bumptech.glide.k> set) {
            List<Fragment> listC0 = vVar.C0();
            int size = listC0.size();
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = listC0.get(i10);
                b(fragment.Y(), set);
                com.bumptech.glide.k kVarA = m.this.a(fragment.getLifecycle());
                if (kVarA != null) {
                    set.add(kVarA);
                }
            }
        }

        @Override // A6.p
        public Set<com.bumptech.glide.k> a() {
            HashSet hashSet = new HashSet();
            b(this.f921a, hashSet);
            return hashSet;
        }
    }

    m(o.b bVar) {
        this.f918b = bVar;
    }

    com.bumptech.glide.k a(AbstractC2106m abstractC2106m) {
        H6.l.a();
        return this.f917a.get(abstractC2106m);
    }

    com.bumptech.glide.k b(Context context, com.bumptech.glide.b bVar, AbstractC2106m abstractC2106m, v vVar, boolean z10) {
        H6.l.a();
        com.bumptech.glide.k kVarA = a(abstractC2106m);
        if (kVarA != null) {
            return kVarA;
        }
        k kVar = new k(abstractC2106m);
        com.bumptech.glide.k kVarA2 = this.f918b.a(bVar, kVar, new b(vVar), context);
        this.f917a.put(abstractC2106m, kVarA2);
        kVar.a(new a(abstractC2106m));
        if (z10) {
            kVarA2.b();
        }
        return kVarA2;
    }

    /* compiled from: LifecycleRequestManagerRetriever.java */
    class a implements l {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ AbstractC2106m f919B;

        a(AbstractC2106m abstractC2106m) {
            this.f919B = abstractC2106m;
        }

        @Override // A6.l
        public void e() {
            m.this.f917a.remove(this.f919B);
        }

        @Override // A6.l
        public void a() {
        }

        @Override // A6.l
        public void b() {
        }
    }
}
