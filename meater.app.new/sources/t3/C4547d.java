package t3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.AbstractC2106m;
import android.view.InterfaceC2111s;
import android.view.InterfaceC2114v;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import p.C4189b;
import t3.C4545b;

/* compiled from: SavedStateRegistry.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0003!\u0007\u000eB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000b2\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001f\u0010\u001dR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R$\u0010+\u001a\u00020$2\u0006\u0010)\u001a\u00020$8G@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010.R\"\u00103\u001a\u00020$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010%\u001a\u0004\b0\u0010,\"\u0004\b1\u00102¨\u00064"}, d2 = {"Lt3/d;", "", "<init>", "()V", "", "key", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "Lt3/d$c;", "provider", "Loa/F;", "h", "(Ljava/lang/String;Lt3/d$c;)V", "c", "(Ljava/lang/String;)Lt3/d$c;", "j", "(Ljava/lang/String;)V", "Ljava/lang/Class;", "Lt3/d$a;", "clazz", "i", "(Ljava/lang/Class;)V", "Landroidx/lifecycle/m;", "lifecycle", "e", "(Landroidx/lifecycle/m;)V", "savedState", "f", "(Landroid/os/Bundle;)V", "outBundle", "g", "Lp/b;", "a", "Lp/b;", "components", "", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "<set-?>", "d", "isRestored", "()Z", "Lt3/b$b;", "Lt3/b$b;", "recreatorProvider", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "isAllowingSavingState", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
/* renamed from: t3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4547d {

    /* renamed from: g, reason: collision with root package name */
    private static final b f49909g = new b(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean attached;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Bundle restoredState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isRestored;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private C4545b.C0707b recreatorProvider;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4189b<String, c> components = new C4189b<>();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isAllowingSavingState = true;

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lt3/d$a;", "", "Lt3/f;", "owner", "Loa/F;", "a", "(Lt3/f;)V", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t3.d$a */
    public interface a {
        void a(InterfaceC4549f owner);
    }

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt3/d$b;", "", "<init>", "()V", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t3.d$b */
    private static final class b {
        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lt3/d$c;", "", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: t3.d$c */
    public interface c {
        Bundle a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4547d this$0, InterfaceC2114v interfaceC2114v, AbstractC2106m.a event) {
        C3862t.g(this$0, "this$0");
        C3862t.g(interfaceC2114v, "<anonymous parameter 0>");
        C3862t.g(event, "event");
        if (event == AbstractC2106m.a.ON_START) {
            this$0.isAllowingSavingState = true;
        } else if (event == AbstractC2106m.a.ON_STOP) {
            this$0.isAllowingSavingState = false;
        }
    }

    public final Bundle b(String key) {
        C3862t.g(key, "key");
        if (!this.isRestored) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.restoredState;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.restoredState;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.restoredState = null;
        }
        return bundle2;
    }

    public final c c(String key) {
        C3862t.g(key, "key");
        Iterator<Map.Entry<String, c>> it = this.components.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> components = it.next();
            C3862t.f(components, "components");
            String key2 = components.getKey();
            c value = components.getValue();
            if (C3862t.b(key2, key)) {
                return value;
            }
        }
        return null;
    }

    public final void e(AbstractC2106m lifecycle) {
        C3862t.g(lifecycle, "lifecycle");
        if (this.attached) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new InterfaceC2111s() { // from class: t3.c
            @Override // android.view.InterfaceC2111s
            public final void f(InterfaceC2114v interfaceC2114v, AbstractC2106m.a aVar) {
                C4547d.d(this.f49908B, interfaceC2114v, aVar);
            }
        });
        this.attached = true;
    }

    public final void f(Bundle savedState) {
        if (!this.attached) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.isRestored) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.restoredState = savedState != null ? savedState.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.isRestored = true;
    }

    public final void g(Bundle outBundle) {
        C3862t.g(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.restoredState;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C4189b<String, c>.d dVarH = this.components.h();
        C3862t.f(dVarH, "this.components.iteratorWithAdditions()");
        while (dVarH.hasNext()) {
            Map.Entry next = dVarH.next();
            bundle.putBundle((String) next.getKey(), ((c) next.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, c provider) {
        C3862t.g(key, "key");
        C3862t.g(provider, "provider");
        if (this.components.r(key, provider) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class<? extends a> clazz) throws NoSuchMethodException, SecurityException {
        C3862t.g(clazz, "clazz");
        if (!this.isAllowingSavingState) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C4545b.C0707b c0707b = this.recreatorProvider;
        if (c0707b == null) {
            c0707b = new C4545b.C0707b(this);
        }
        this.recreatorProvider = c0707b;
        try {
            clazz.getDeclaredConstructor(null);
            C4545b.C0707b c0707b2 = this.recreatorProvider;
            if (c0707b2 != null) {
                String name = clazz.getName();
                C3862t.f(name, "clazz.name");
                c0707b2.b(name);
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }

    public final void j(String key) {
        C3862t.g(key, "key");
        this.components.v(key);
    }
}
