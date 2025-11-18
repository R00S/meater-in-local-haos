package j3;

import ic.InterfaceC3693a;
import ic.InterfaceC3698f;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kc.f;
import kotlin.AbstractC3386C;
import kotlin.AbstractC3399e;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import lc.AbstractC3941a;

/* compiled from: RouteEncoder.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00062\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0014\u001a\u00020\r\"\u0004\b\u0001\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R&\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010$R\u0016\u00100\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lj3/b;", "", "T", "Llc/a;", "Lic/a;", "serializer", "", "", "Lg3/C;", "typeMap", "<init>", "(Lic/a;Ljava/util/Map;)V", "value", "Loa/F;", "E", "(Ljava/lang/Object;)V", "", "D", "(Ljava/lang/Object;)Ljava/util/Map;", "Lic/f;", "B", "(Lic/f;Ljava/lang/Object;)V", "Lkc/f;", "descriptor", "", "index", "", "A", "(Lkc/f;I)Z", "C", "Llc/c;", "i", "(Lkc/f;)Llc/c;", "a", "Lic/a;", "b", "Ljava/util/Map;", "Lnc/b;", "c", "Lnc/b;", "n", "()Lnc/b;", "serializersModule", "", "d", "map", "e", "I", "elementIndex", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3737b<T> extends AbstractC3941a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3693a<T> serializer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, AbstractC3386C<Object>> typeMap;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final nc.b serializersModule;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<String, List<String>> map;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int elementIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public C3737b(InterfaceC3693a<T> serializer, Map<String, ? extends AbstractC3386C<Object>> typeMap) {
        C3862t.g(serializer, "serializer");
        C3862t.g(typeMap, "typeMap");
        this.serializer = serializer;
        this.typeMap = typeMap;
        this.serializersModule = nc.c.a();
        this.map = new LinkedHashMap();
        this.elementIndex = -1;
    }

    private final void E(Object value) {
        String strD = this.serializer.getDescriptor().d(this.elementIndex);
        AbstractC3386C<Object> abstractC3386C = this.typeMap.get(strD);
        if (abstractC3386C != null) {
            this.map.put(strD, abstractC3386C instanceof AbstractC3399e ? ((AbstractC3399e) abstractC3386C).l(value) : r.e(abstractC3386C.i(value)));
            return;
        }
        throw new IllegalStateException(("Cannot find NavType for argument " + strD + ". Please provide NavType through typeMap.").toString());
    }

    @Override // lc.AbstractC3941a
    public boolean A(f descriptor, int index) {
        C3862t.g(descriptor, "descriptor");
        this.elementIndex = index;
        return true;
    }

    @Override // lc.AbstractC3941a
    public <T> void B(InterfaceC3698f<? super T> serializer, T value) {
        C3862t.g(serializer, "serializer");
        E(value);
    }

    @Override // lc.AbstractC3941a
    public void C(Object value) {
        C3862t.g(value, "value");
        E(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Map<String, List<String>> D(Object value) {
        C3862t.g(value, "value");
        super.B(this.serializer, value);
        return M.r(this.map);
    }

    @Override // lc.AbstractC3941a, lc.c
    public lc.c i(f descriptor) {
        C3862t.g(descriptor, "descriptor");
        if (C3738c.d(descriptor)) {
            this.elementIndex = 0;
        }
        return super.i(descriptor);
    }

    @Override // lc.c
    /* renamed from: n, reason: from getter */
    public nc.b getSerializersModule() {
        return this.serializersModule;
    }
}
