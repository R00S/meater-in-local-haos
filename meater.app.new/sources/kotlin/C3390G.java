package kotlin;

import android.annotation.SuppressLint;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3389F;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: NavigatorProvider.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\b\u0017\u0018\u0000 \f2\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0004H\u0017¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R%\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u00040\u00148G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lg3/G;", "", "<init>", "()V", "Lg3/F;", "T", "", "name", "d", "(Ljava/lang/String;)Lg3/F;", "Lg3/t;", "navigator", "b", "(Lg3/F;)Lg3/F;", "c", "(Ljava/lang/String;Lg3/F;)Lg3/F;", "", "a", "Ljava/util/Map;", "_navigators", "", "e", "()Ljava/util/Map;", "navigators", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"TypeParameterUnusedInFormals"})
/* renamed from: g3.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3390G {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<?>, String> f41596c = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, AbstractC3389F<? extends C3414t>> _navigators = new LinkedHashMap();

    /* compiled from: NavigatorProvider.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u0001¢\u0006\u0004\b\f\u0010\rR&\u0010\u000f\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lg3/G$a;", "", "<init>", "()V", "", "name", "", "b", "(Ljava/lang/String;)Z", "Ljava/lang/Class;", "Lg3/F;", "navigatorClass", "a", "(Ljava/lang/Class;)Ljava/lang/String;", "", "annotationNames", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g3.G$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final String a(Class<? extends AbstractC3389F<?>> navigatorClass) {
            C3862t.g(navigatorClass, "navigatorClass");
            String strValue = (String) C3390G.f41596c.get(navigatorClass);
            if (strValue == null) {
                AbstractC3389F.b bVar = (AbstractC3389F.b) navigatorClass.getAnnotation(AbstractC3389F.b.class);
                strValue = bVar != null ? bVar.value() : null;
                if (!b(strValue)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + navigatorClass.getSimpleName()).toString());
                }
                C3390G.f41596c.put(navigatorClass, strValue);
            }
            C3862t.d(strValue);
            return strValue;
        }

        public final boolean b(String name) {
            return name != null && name.length() > 0;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC3389F<? extends C3414t> b(AbstractC3389F<? extends C3414t> navigator) {
        C3862t.g(navigator, "navigator");
        return c(INSTANCE.a(navigator.getClass()), navigator);
    }

    public AbstractC3389F<? extends C3414t> c(String name, AbstractC3389F<? extends C3414t> navigator) {
        C3862t.g(name, "name");
        C3862t.g(navigator, "navigator");
        if (!INSTANCE.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        AbstractC3389F<? extends C3414t> abstractC3389F = this._navigators.get(name);
        if (C3862t.b(abstractC3389F, navigator)) {
            return navigator;
        }
        boolean z10 = false;
        if (abstractC3389F != null && abstractC3389F.getIsAttached()) {
            z10 = true;
        }
        if (z10) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + abstractC3389F).toString());
        }
        if (!navigator.getIsAttached()) {
            return this._navigators.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public <T extends AbstractC3389F<?>> T d(String name) {
        C3862t.g(name, "name");
        if (!INSTANCE.b(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        AbstractC3389F<? extends C3414t> abstractC3389F = this._navigators.get(name);
        if (abstractC3389F != null) {
            return abstractC3389F;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + name + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public final Map<String, AbstractC3389F<? extends C3414t>> e() {
        return M.r(this._navigators);
    }
}
