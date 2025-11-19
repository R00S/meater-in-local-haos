package kotlin;

import Ba.a;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.AbstractC2093a;
import android.view.AbstractC2106m;
import android.view.C2116x;
import android.view.InterfaceC2104k;
import android.view.InterfaceC2114v;
import android.view.O;
import android.view.S;
import android.view.V;
import android.view.Y;
import android.view.a0;
import android.view.b0;
import android.view.c0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.InterfaceC4164i;
import t3.C4547d;
import t3.C4548e;
import t3.InterfaceC4549f;

/* compiled from: NavBackStackEntry.kt */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 q2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003rstBS\b\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0000\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\"\u0010\b\u001a\u00020\u00078\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010*R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00104R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010G\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001b\u0010M\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010J\u001a\u0004\bP\u0010QR*\u0010Y\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\u000b8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00106\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010_\u001a\u00020Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010o¨\u0006u"}, d2 = {"Lg3/m;", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/k;", "Lt3/f;", "Landroid/content/Context;", "context", "Lg3/t;", "destination", "Landroid/os/Bundle;", "immutableArgs", "Landroidx/lifecycle/m$b;", "hostLifecycleState", "Lg3/D;", "viewModelStoreProvider", "", "id", "savedState", "<init>", "(Landroid/content/Context;Lg3/t;Landroid/os/Bundle;Landroidx/lifecycle/m$b;Lg3/D;Ljava/lang/String;Landroid/os/Bundle;)V", "entry", "arguments", "(Lg3/m;Landroid/os/Bundle;)V", "Landroidx/lifecycle/m$a;", "event", "Loa/F;", "i", "(Landroidx/lifecycle/m$a;)V", "o", "()V", "outBundle", "j", "(Landroid/os/Bundle;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "B", "Landroid/content/Context;", "C", "Lg3/t;", "f", "()Lg3/t;", "k", "(Lg3/t;)V", "D", "Landroid/os/Bundle;", "E", "Landroidx/lifecycle/m$b;", "F", "Lg3/D;", "G", "Ljava/lang/String;", "g", "H", "Landroidx/lifecycle/x;", "I", "Landroidx/lifecycle/x;", "_lifecycle", "Lt3/e;", "J", "Lt3/e;", "savedStateRegistryController", "K", "Z", "savedStateRegistryAttached", "Landroidx/lifecycle/V;", "L", "Loa/i;", "e", "()Landroidx/lifecycle/V;", "defaultFactory", "Landroidx/lifecycle/O;", "M", "getSavedStateHandle", "()Landroidx/lifecycle/O;", "savedStateHandle", "maxState", "N", "h", "()Landroidx/lifecycle/m$b;", "n", "(Landroidx/lifecycle/m$b;)V", "maxLifecycle", "Landroidx/lifecycle/a0$c;", "O", "Landroidx/lifecycle/a0$c;", "l", "()Landroidx/lifecycle/a0$c;", "defaultViewModelProviderFactory", "d", "()Landroid/os/Bundle;", "Landroidx/lifecycle/m;", "getLifecycle", "()Landroidx/lifecycle/m;", "lifecycle", "Landroidx/lifecycle/b0;", "v", "()Landroidx/lifecycle/b0;", "viewModelStore", "LQ1/a;", "m", "()LQ1/a;", "defaultViewModelCreationExtras", "Lt3/d;", "()Lt3/d;", "savedStateRegistry", "P", "a", "b", "c", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3407m implements InterfaceC2114v, c0, InterfaceC2104k, InterfaceC4549f {

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private C3414t destination;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Bundle immutableArgs;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private AbstractC2106m.b hostLifecycleState;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3387D viewModelStoreProvider;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private final Bundle savedState;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private C2116x _lifecycle;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final C4548e savedStateRegistryController;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private boolean savedStateRegistryAttached;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i defaultFactory;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i savedStateHandle;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private AbstractC2106m.b maxLifecycle;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final a0.c defaultViewModelProviderFactory;

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lg3/m$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lg3/t;", "destination", "Landroid/os/Bundle;", "arguments", "Landroidx/lifecycle/m$b;", "hostLifecycleState", "Lg3/D;", "viewModelStoreProvider", "", "id", "savedState", "Lg3/m;", "a", "(Landroid/content/Context;Lg3/t;Landroid/os/Bundle;Landroidx/lifecycle/m$b;Lg3/D;Ljava/lang/String;Landroid/os/Bundle;)Lg3/m;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.m$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public static /* synthetic */ C3407m b(Companion companion, Context context, C3414t c3414t, Bundle bundle, AbstractC2106m.b bVar, InterfaceC3387D interfaceC3387D, String str, Bundle bundle2, int i10, Object obj) {
            String str2;
            Bundle bundle3 = (i10 & 4) != 0 ? null : bundle;
            AbstractC2106m.b bVar2 = (i10 & 8) != 0 ? AbstractC2106m.b.CREATED : bVar;
            InterfaceC3387D interfaceC3387D2 = (i10 & 16) != 0 ? null : interfaceC3387D;
            if ((i10 & 32) != 0) {
                String string = UUID.randomUUID().toString();
                C3862t.f(string, "randomUUID().toString()");
                str2 = string;
            } else {
                str2 = str;
            }
            return companion.a(context, c3414t, bundle3, bVar2, interfaceC3387D2, str2, (i10 & 64) != 0 ? null : bundle2);
        }

        public final C3407m a(Context context, C3414t destination, Bundle arguments, AbstractC2106m.b hostLifecycleState, InterfaceC3387D viewModelStoreProvider, String id2, Bundle savedState) {
            C3862t.g(destination, "destination");
            C3862t.g(hostLifecycleState, "hostLifecycleState");
            C3862t.g(id2, "id");
            return new C3407m(context, destination, arguments, hostLifecycleState, viewModelStoreProvider, id2, savedState, null);
        }

        private Companion() {
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lg3/m$b;", "Landroidx/lifecycle/a;", "Lt3/f;", "owner", "<init>", "(Lt3/f;)V", "Landroidx/lifecycle/Y;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/O;", "handle", "f", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/O;)Landroidx/lifecycle/Y;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.m$b */
    private static final class b extends AbstractC2093a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4549f owner) {
            super(owner, null);
            C3862t.g(owner, "owner");
        }

        @Override // android.view.AbstractC2093a
        protected <T extends Y> T f(String key, Class<T> modelClass, O handle) {
            C3862t.g(key, "key");
            C3862t.g(modelClass, "modelClass");
            C3862t.g(handle, "handle");
            return new c(handle);
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg3/m$c;", "Landroidx/lifecycle/Y;", "Landroidx/lifecycle/O;", "handle", "<init>", "(Landroidx/lifecycle/O;)V", "b", "Landroidx/lifecycle/O;", "h", "()Landroidx/lifecycle/O;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.m$c */
    private static final class c extends Y {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final O handle;

        public c(O handle) {
            C3862t.g(handle, "handle");
            this.handle = handle;
        }

        /* renamed from: h, reason: from getter */
        public final O getHandle() {
            return this.handle;
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/V;", "a", "()Landroidx/lifecycle/V;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.m$d */
    static final class d extends AbstractC3864v implements a<V> {
        d() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V invoke() {
            Context context = C3407m.this.context;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            C3407m c3407m = C3407m.this;
            return new V(application, c3407m, c3407m.d());
        }
    }

    /* compiled from: NavBackStackEntry.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/O;", "a", "()Landroidx/lifecycle/O;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: g3.m$e */
    static final class e extends AbstractC3864v implements a<O> {
        e() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O invoke() {
            if (!C3407m.this.savedStateRegistryAttached) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            }
            if (C3407m.this.getLifecycle().getState() != AbstractC2106m.b.DESTROYED) {
                return ((c) new a0(C3407m.this, new b(C3407m.this)).b(c.class)).getHandle();
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
        }
    }

    public /* synthetic */ C3407m(Context context, C3414t c3414t, Bundle bundle, AbstractC2106m.b bVar, InterfaceC3387D interfaceC3387D, String str, Bundle bundle2, C3854k c3854k) {
        this(context, c3414t, bundle, bVar, interfaceC3387D, str, bundle2);
    }

    private final V e() {
        return (V) this.defaultFactory.getValue();
    }

    @Override // t3.InterfaceC4549f
    public C4547d B() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    public final Bundle d() {
        if (this.immutableArgs == null) {
            return null;
        }
        return new Bundle(this.immutableArgs);
    }

    public boolean equals(Object other) {
        Set<String> setKeySet;
        if (other == null || !(other instanceof C3407m)) {
            return false;
        }
        C3407m c3407m = (C3407m) other;
        if (!C3862t.b(this.id, c3407m.id) || !C3862t.b(this.destination, c3407m.destination) || !C3862t.b(getLifecycle(), c3407m.getLifecycle()) || !C3862t.b(B(), c3407m.B())) {
            return false;
        }
        if (!C3862t.b(this.immutableArgs, c3407m.immutableArgs)) {
            Bundle bundle = this.immutableArgs;
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                return false;
            }
            Set<String> set = setKeySet;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str : set) {
                    Object obj = this.immutableArgs.get(str);
                    Bundle bundle2 = c3407m.immutableArgs;
                    if (!C3862t.b(obj, bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: f, reason: from getter */
    public final C3414t getDestination() {
        return this.destination;
    }

    /* renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Override // android.view.InterfaceC2114v
    public AbstractC2106m getLifecycle() {
        return this._lifecycle;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC2106m.b getMaxLifecycle() {
        return this.maxLifecycle;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.id.hashCode() * 31) + this.destination.hashCode();
        Bundle bundle = this.immutableArgs;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = this.immutableArgs.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + B().hashCode();
    }

    public final void i(AbstractC2106m.a event) {
        C3862t.g(event, "event");
        this.hostLifecycleState = event.n();
        o();
    }

    public final void j(Bundle outBundle) {
        C3862t.g(outBundle, "outBundle");
        this.savedStateRegistryController.e(outBundle);
    }

    public final void k(C3414t c3414t) {
        C3862t.g(c3414t, "<set-?>");
        this.destination = c3414t;
    }

    @Override // android.view.InterfaceC2104k
    /* renamed from: l, reason: from getter */
    public a0.c getDefaultViewModelProviderFactory() {
        return this.defaultViewModelProviderFactory;
    }

    @Override // android.view.InterfaceC2104k
    public Q1.a m() {
        Q1.d dVar = new Q1.d(null, 1, null);
        Context context = this.context;
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            dVar.c(a0.a.f25931h, application);
        }
        dVar.c(S.f25904a, this);
        dVar.c(S.f25905b, this);
        Bundle bundleD = d();
        if (bundleD != null) {
            dVar.c(S.f25906c, bundleD);
        }
        return dVar;
    }

    public final void n(AbstractC2106m.b maxState) {
        C3862t.g(maxState, "maxState");
        this.maxLifecycle = maxState;
        o();
    }

    public final void o() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.c();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                S.c(this);
            }
            this.savedStateRegistryController.d(this.savedState);
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this._lifecycle.n(this.hostLifecycleState);
        } else {
            this._lifecycle.n(this.maxLifecycle);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C3407m.class.getSimpleName());
        sb2.append('(' + this.id + ')');
        sb2.append(" destination=");
        sb2.append(this.destination);
        String string = sb2.toString();
        C3862t.f(string, "sb.toString()");
        return string;
    }

    @Override // android.view.c0
    public b0 v() {
        if (!this.savedStateRegistryAttached) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (getLifecycle().getState() == AbstractC2106m.b.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        InterfaceC3387D interfaceC3387D = this.viewModelStoreProvider;
        if (interfaceC3387D != null) {
            return interfaceC3387D.a(this.id);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    private C3407m(Context context, C3414t c3414t, Bundle bundle, AbstractC2106m.b bVar, InterfaceC3387D interfaceC3387D, String str, Bundle bundle2) {
        this.context = context;
        this.destination = c3414t;
        this.immutableArgs = bundle;
        this.hostLifecycleState = bVar;
        this.viewModelStoreProvider = interfaceC3387D;
        this.id = str;
        this.savedState = bundle2;
        this._lifecycle = new C2116x(this);
        this.savedStateRegistryController = C4548e.INSTANCE.a(this);
        this.defaultFactory = C4165j.a(new d());
        this.savedStateHandle = C4165j.a(new e());
        this.maxLifecycle = AbstractC2106m.b.INITIALIZED;
        this.defaultViewModelProviderFactory = e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3407m(C3407m entry, Bundle bundle) {
        this(entry.context, entry.destination, bundle, entry.hostLifecycleState, entry.viewModelStoreProvider, entry.id, entry.savedState);
        C3862t.g(entry, "entry");
        this.hostLifecycleState = entry.hostLifecycleState;
        n(entry.maxLifecycle);
    }
}
