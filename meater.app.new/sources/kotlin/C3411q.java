package kotlin;

import android.view.Y;
import android.view.a0;
import android.view.b0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: NavControllerViewModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lg3/q;", "Landroidx/lifecycle/Y;", "Lg3/D;", "<init>", "()V", "", "backStackEntryId", "Loa/F;", "i", "(Ljava/lang/String;)V", "g", "Landroidx/lifecycle/b0;", "a", "(Ljava/lang/String;)Landroidx/lifecycle/b0;", "toString", "()Ljava/lang/String;", "", "b", "Ljava/util/Map;", "viewModelStores", "c", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3411q extends Y implements InterfaceC3387D {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final a0.c f41741d = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b0> viewModelStores = new LinkedHashMap();

    /* compiled from: NavControllerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"g3/q$a", "Landroidx/lifecycle/a0$c;", "Landroidx/lifecycle/Y;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/Y;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.q$a */
    public static final class a implements a0.c {
        a() {
        }

        @Override // androidx.lifecycle.a0.c
        public <T extends Y> T a(Class<T> modelClass) {
            C3862t.g(modelClass, "modelClass");
            return new C3411q();
        }
    }

    /* compiled from: NavControllerViewModel.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg3/q$b;", "", "<init>", "()V", "Landroidx/lifecycle/b0;", "viewModelStore", "Lg3/q;", "a", "(Landroidx/lifecycle/b0;)Lg3/q;", "Landroidx/lifecycle/a0$c;", "FACTORY", "Landroidx/lifecycle/a0$c;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.q$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final C3411q a(b0 viewModelStore) {
            C3862t.g(viewModelStore, "viewModelStore");
            return (C3411q) new a0(viewModelStore, C3411q.f41741d, null, 4, null).b(C3411q.class);
        }

        private Companion() {
        }
    }

    @Override // kotlin.InterfaceC3387D
    public b0 a(String backStackEntryId) {
        C3862t.g(backStackEntryId, "backStackEntryId");
        b0 b0Var = this.viewModelStores.get(backStackEntryId);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0();
        this.viewModelStores.put(backStackEntryId, b0Var2);
        return b0Var2;
    }

    @Override // android.view.Y
    protected void g() {
        Iterator<b0> it = this.viewModelStores.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.viewModelStores.clear();
    }

    public final void i(String backStackEntryId) {
        C3862t.g(backStackEntryId, "backStackEntryId");
        b0 b0VarRemove = this.viewModelStores.remove(backStackEntryId);
        if (b0VarRemove != null) {
            b0VarRemove.a();
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator<String> it = this.viewModelStores.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String string = sb2.toString();
        C3862t.f(string, "sb.toString()");
        return string;
    }
}
