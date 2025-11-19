package R1;

import Ba.l;
import Q1.a;
import android.view.InterfaceC2104k;
import android.view.Y;
import android.view.a0;
import android.view.c0;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ViewModelProviders.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000eH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJK\u0010\u001d\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u001b\u001a\u00020\u00182\u001a\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u001c\"\u0006\u0012\u0002\b\u00030\u000fH\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LR1/g;", "", "<init>", "()V", "Landroidx/lifecycle/Y;", "T", "LIa/d;", "modelClass", "", "e", "(LIa/d;)Ljava/lang/String;", "VM", "f", "()Landroidx/lifecycle/Y;", "", "LQ1/f;", "initializers", "Landroidx/lifecycle/a0$c;", "a", "(Ljava/util/Collection;)Landroidx/lifecycle/a0$c;", "Landroidx/lifecycle/c0;", "owner", "d", "(Landroidx/lifecycle/c0;)Landroidx/lifecycle/a0$c;", "LQ1/a;", "c", "(Landroidx/lifecycle/c0;)LQ1/a;", "extras", "", "b", "(LIa/d;LQ1/a;[LQ1/f;)Landroidx/lifecycle/Y;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f14774a = new g();

    /* compiled from: ViewModelProviders.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LR1/g$a;", "LQ1/a$b;", "", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements a.b<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14775a = new a();

        private a() {
        }
    }

    private g() {
    }

    public final a0.c a(Collection<? extends Q1.f<?>> initializers) {
        C3862t.g(initializers, "initializers");
        Q1.f[] fVarArr = (Q1.f[]) initializers.toArray(new Q1.f[0]);
        return new Q1.b((Q1.f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public final <VM extends Y> VM b(Ia.d<VM> modelClass, Q1.a extras, Q1.f<?>... initializers) {
        VM vm;
        Q1.f<?> fVar;
        l<Q1.a, T> lVarB;
        C3862t.g(modelClass, "modelClass");
        C3862t.g(extras, "extras");
        C3862t.g(initializers, "initializers");
        int length = initializers.length;
        int i10 = 0;
        while (true) {
            vm = null;
            if (i10 >= length) {
                fVar = null;
                break;
            }
            fVar = initializers[i10];
            if (C3862t.b(fVar.a(), modelClass)) {
                break;
            }
            i10++;
        }
        if (fVar != null && (lVarB = fVar.b()) != 0) {
            vm = (VM) lVarB.invoke(extras);
        }
        if (vm != null) {
            return vm;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + h.a(modelClass)).toString());
    }

    public final Q1.a c(c0 owner) {
        C3862t.g(owner, "owner");
        return owner instanceof InterfaceC2104k ? ((InterfaceC2104k) owner).m() : a.C0211a.f14206b;
    }

    public final a0.c d(c0 owner) {
        C3862t.g(owner, "owner");
        return owner instanceof InterfaceC2104k ? ((InterfaceC2104k) owner).l() : c.f14768b;
    }

    public final <T extends Y> String e(Ia.d<T> modelClass) {
        C3862t.g(modelClass, "modelClass");
        String strA = h.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final <VM extends Y> VM f() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
