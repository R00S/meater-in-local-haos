package bd;

import Ia.d;
import Zc.f;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Module.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006\"\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\b2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0017\u0010(\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'RZ\u00101\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0)j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f`*2\u001e\u0010+\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0)j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f`*8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b\u001e\u0010.\"\u0004\b/\u00100RL\u00108\u001a.\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b02j\u0016\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b`38\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b7\u0010#\u001a\u0004\b,\u00106R0\u0010;\u001a\u0012\u0012\u0004\u0012\u0002090)j\b\u0012\u0004\u0012\u000209`*8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b \u0010-\u0012\u0004\b:\u0010#\u001a\u0004\b4\u0010.R&\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00000<8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b?\u0010#\u001a\u0004\b$\u0010>¨\u0006A"}, d2 = {"Lbd/a;", "", "", "_createdAtStart", "<init>", "(Z)V", "", "module", "Loa/F;", "f", "([Lbd/a;)V", "LZc/b;", "instanceFactory", "g", "(LZc/b;)V", "LZc/f;", "h", "(LZc/f;)V", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "factory", "i", "(Ljava/lang/String;LZc/b;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "e", "()Z", "get_createdAtStart$annotations", "()V", "b", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "value", "c", "Ljava/util/LinkedHashSet;", "()Ljava/util/LinkedHashSet;", "setEagerInstances$koin_core", "(Ljava/util/LinkedHashSet;)V", "eagerInstances", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "d", "Ljava/util/LinkedHashMap;", "()Ljava/util/LinkedHashMap;", "getMappings$annotations", "mappings", "Ldd/a;", "getScopes$annotations", "scopes", "", "Ljava/util/List;", "()Ljava/util/List;", "getIncludedModules$annotations", "includedModules", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean _createdAtStart;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private LinkedHashSet<f<?>> eagerInstances;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashMap<String, Zc.b<?>> mappings;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashSet<dd.a> scopes;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<a> includedModules;

    public a() {
        this(false, 1, null);
    }

    public final LinkedHashSet<f<?>> a() {
        return this.eagerInstances;
    }

    public final List<a> b() {
        return this.includedModules;
    }

    public final LinkedHashMap<String, Zc.b<?>> c() {
        return this.mappings;
    }

    public final LinkedHashSet<dd.a> d() {
        return this.scopes;
    }

    /* renamed from: e, reason: from getter */
    public final boolean get_createdAtStart() {
        return this._createdAtStart;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof a) {
            return C3862t.b(this.id, ((a) other).id);
        }
        return false;
    }

    public final void f(a... module) {
        C3862t.g(module, "module");
        r.E(this.includedModules, module);
    }

    public final void g(Zc.b<?> instanceFactory) {
        String value;
        C3862t.g(instanceFactory, "instanceFactory");
        Xc.b<?> bVarC = instanceFactory.c();
        d<?> dVarC = bVarC.c();
        dd.a aVarD = bVarC.getQualifier();
        dd.a aVarE = bVarC.getScopeQualifier();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(id.a.a(dVarC));
        sb2.append(':');
        if (aVarD == null || (value = aVarD.getValue()) == null) {
            value = "";
        }
        sb2.append(value);
        sb2.append(':');
        sb2.append(aVarE);
        String string = sb2.toString();
        C3862t.f(string, "toString(...)");
        i(string, instanceFactory);
    }

    public final void h(f<?> instanceFactory) {
        C3862t.g(instanceFactory, "instanceFactory");
        this.eagerInstances.add(instanceFactory);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final void i(String mapping, Zc.b<?> factory) {
        C3862t.g(mapping, "mapping");
        C3862t.g(factory, "factory");
        this.mappings.put(mapping, factory);
    }

    public a(boolean z10) {
        this._createdAtStart = z10;
        this.id = kd.b.a(kd.a.f43922a);
        this.eagerInstances = new LinkedHashSet<>();
        this.mappings = new LinkedHashMap<>();
        this.scopes = new LinkedHashSet<>();
        this.includedModules = new ArrayList();
    }

    public /* synthetic */ a(boolean z10, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? false : z10);
    }
}
