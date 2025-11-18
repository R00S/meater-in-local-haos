package io.sentry.internal.modules;

import io.sentry.InterfaceC9670w1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: CompositeModulesLoader.java */
@ApiStatus.Internal
@ApiStatus.Experimental
/* renamed from: io.sentry.internal.modules.a */
/* loaded from: classes2.dex */
public final class C9480a extends AbstractC9483d {

    /* renamed from: d */
    private final List<InterfaceC9481b> f36371d;

    public C9480a(List<InterfaceC9481b> list, InterfaceC9670w1 interfaceC9670w1) {
        super(interfaceC9670w1);
        this.f36371d = list;
    }

    @Override // io.sentry.internal.modules.AbstractC9483d
    /* renamed from: b */
    protected Map<String, String> mo30259b() {
        TreeMap treeMap = new TreeMap();
        Iterator<InterfaceC9481b> it = this.f36371d.iterator();
        while (it.hasNext()) {
            Map<String, String> mapMo30866a = it.next().mo30866a();
            if (mapMo30866a != null) {
                treeMap.putAll(mapMo30866a);
            }
        }
        return treeMap;
    }
}
