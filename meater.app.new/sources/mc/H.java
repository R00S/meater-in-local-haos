package mc;

import ic.InterfaceC3693a;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kc.f;
import kc.k;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u001cR\u0016\u0010%\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\"\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020*\u0018\u00010)0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u00101R%\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003030&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R!\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00010&8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u0010;R\u001b\u0010>\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b=\u0010\u001cR\u0014\u0010A\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010@R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010C¨\u0006E"}, d2 = {"Lmc/H;", "Lkc/f;", "Lmc/h;", "", "serialName", "Lmc/s;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;Lmc/s;I)V", "", "k", "()Ljava/util/Map;", "name", "", "isOptional", "Loa/F;", "h", "(Ljava/lang/String;Z)V", "index", "e", "(I)Lkc/f;", "f", "(I)Z", "d", "(I)Ljava/lang/String;", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Lmc/s;", "c", "I", "added", "", "[Ljava/lang/String;", "names", "", "", "[Ljava/util/List;", "propertiesAnnotations", "", "g", "[Z", "elementsOptionality", "Ljava/util/Map;", "indices", "Lic/a;", "i", "Loa/i;", "l", "()[Lic/a;", "childSerializers", "j", "m", "()[Lkc/f;", "typeParameterDescriptors", "n", "_hashCode", "Lkc/j;", "()Lkc/j;", "kind", "", "()Ljava/util/Set;", "serialNames", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public class H implements kc.f, InterfaceC4028h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4038s<?> generatedSerializer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int added;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String[] names;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Annotation>[] propertiesAnnotations;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean[] elementsOptionality;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Map<String, Integer> indices;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i childSerializers;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i typeParameterDescriptors;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i _hashCode;

    /* compiled from: PluginGeneratedSerialDescriptor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class a extends AbstractC3864v implements Ba.a<Integer> {
        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            H h10 = H.this;
            return Integer.valueOf(I.a(h10, h10.m()));
        }
    }

    /* compiled from: PluginGeneratedSerialDescriptor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lic/a;", "a", "()[Lic/a;"}, k = 3, mv = {1, 9, 0})
    static final class b extends AbstractC3864v implements Ba.a<InterfaceC3693a<?>[]> {
        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3693a<?>[] invoke() {
            InterfaceC3693a<?>[] interfaceC3693aArrD;
            InterfaceC4038s interfaceC4038s = H.this.generatedSerializer;
            return (interfaceC4038s == null || (interfaceC3693aArrD = interfaceC4038s.d()) == null) ? J.f45466a : interfaceC3693aArrD;
        }
    }

    /* compiled from: PluginGeneratedSerialDescriptor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "i", "", "a", "(I)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class c extends AbstractC3864v implements Ba.l<Integer, CharSequence> {
        c() {
            super(1);
        }

        public final CharSequence a(int i10) {
            return H.this.d(i10) + ": " + H.this.e(i10).getSerialName();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: PluginGeneratedSerialDescriptor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lkc/f;", "a", "()[Lkc/f;"}, k = 3, mv = {1, 9, 0})
    static final class d extends AbstractC3864v implements Ba.a<kc.f[]> {
        d() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kc.f[] invoke() {
            ArrayList arrayList;
            InterfaceC3693a<?>[] interfaceC3693aArrB;
            InterfaceC4038s interfaceC4038s = H.this.generatedSerializer;
            if (interfaceC4038s == null || (interfaceC3693aArrB = interfaceC4038s.b()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(interfaceC3693aArrB.length);
                for (InterfaceC3693a<?> interfaceC3693a : interfaceC3693aArrB) {
                    arrayList.add(interfaceC3693a.getDescriptor());
                }
            }
            return G.b(arrayList);
        }
    }

    public H(String serialName, InterfaceC4038s<?> interfaceC4038s, int i10) {
        C3862t.g(serialName, "serialName");
        this.serialName = serialName;
        this.generatedSerializer = interfaceC4038s;
        this.elementsCount = i10;
        this.added = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.names = strArr;
        int i12 = this.elementsCount;
        this.propertiesAnnotations = new List[i12];
        this.elementsOptionality = new boolean[i12];
        this.indices = kotlin.collections.M.h();
        EnumC4168m enumC4168m = EnumC4168m.f46627C;
        this.childSerializers = C4165j.b(enumC4168m, new b());
        this.typeParameterDescriptors = C4165j.b(enumC4168m, new d());
        this._hashCode = C4165j.b(enumC4168m, new a());
    }

    public static /* synthetic */ void j(H h10, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        h10.h(str, z10);
    }

    private final Map<String, Integer> k() {
        HashMap map = new HashMap();
        int length = this.names.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.names[i10], Integer.valueOf(i10));
        }
        return map;
    }

    private final InterfaceC3693a<?>[] l() {
        return (InterfaceC3693a[]) this.childSerializers.getValue();
    }

    private final int n() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    @Override // kc.f
    /* renamed from: a, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // mc.InterfaceC4028h
    public Set<String> b() {
        return this.indices.keySet();
    }

    @Override // kc.f
    /* renamed from: c, reason: from getter */
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kc.f
    public String d(int index) {
        return this.names[index];
    }

    @Override // kc.f
    public kc.f e(int index) {
        return l()[index].getDescriptor();
    }

    @Override // kc.f
    public boolean f(int index) {
        return this.elementsOptionality[index];
    }

    public final void h(String name, boolean isOptional) {
        C3862t.g(name, "name");
        String[] strArr = this.names;
        int i10 = this.added + 1;
        this.added = i10;
        strArr[i10] = name;
        this.elementsOptionality[i10] = isOptional;
        this.propertiesAnnotations[i10] = null;
        if (i10 == this.elementsCount - 1) {
            this.indices = k();
        }
    }

    public int hashCode() {
        return n();
    }

    @Override // kc.f
    /* renamed from: i */
    public kc.j getKind() {
        return k.a.f43919a;
    }

    @Override // kc.f
    /* renamed from: isInline */
    public boolean getIsInline() {
        return f.a.a(this);
    }

    public final kc.f[] m() {
        return (kc.f[]) this.typeParameterDescriptors.getValue();
    }

    public String toString() {
        return kotlin.collections.r.s0(Ha.g.p(0, this.elementsCount), ", ", getSerialName() + '(', ")", 0, null, new c(), 24, null);
    }

    public /* synthetic */ H(String str, InterfaceC4038s interfaceC4038s, int i10, int i11, C3854k c3854k) {
        this(str, (i11 & 2) != 0 ? null : interfaceC4038s, i10);
    }
}
