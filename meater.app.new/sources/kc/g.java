package kc;

import Ba.l;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kc.f;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.collections.IndexedValue;
import kotlin.collections.M;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import mc.G;
import mc.I;
import mc.InterfaceC4028h;
import oa.C4165j;
import oa.InterfaceC4164i;
import oa.v;

/* compiled from: SerialDescriptors.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010\u001cR \u0010+\u001a\b\u0012\u0004\u0012\u00020'0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b!\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0003008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\t008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010:R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00104R\u001b\u0010D\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b6\u0010\u001c¨\u0006E"}, d2 = {"Lkc/g;", "Lkc/f;", "Lmc/h;", "", "serialName", "Lkc/j;", "kind", "", "elementsCount", "", "typeParameters", "Lkc/a;", "builder", "<init>", "(Ljava/lang/String;Lkc/j;ILjava/util/List;Lkc/a;)V", "index", "d", "(I)Ljava/lang/String;", "e", "(I)Lkc/f;", "", "f", "(I)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Lkc/j;", "i", "()Lkc/j;", "c", "I", "", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "annotations", "", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "", "[Ljava/lang/String;", "elementNames", "g", "[Lkc/f;", "elementDescriptors", "h", "[Ljava/util/List;", "elementAnnotations", "", "[Z", "elementOptionality", "", "j", "Ljava/util/Map;", "name2Index", "k", "typeParametersDescriptors", "l", "Loa/i;", "_hashCode", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f, InterfaceC4028h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j kind;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Annotation> annotations;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<String> serialNames;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String[] elementNames;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f[] elementDescriptors;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<Annotation>[] elementAnnotations;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean[] elementOptionality;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> name2Index;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final f[] typeParametersDescriptors;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i _hashCode;

    /* compiled from: SerialDescriptors.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class a extends AbstractC3864v implements Ba.a<Integer> {
        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            g gVar = g.this;
            return Integer.valueOf(I.a(gVar, gVar.typeParametersDescriptors));
        }
    }

    /* compiled from: SerialDescriptors.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class b extends AbstractC3864v implements l<Integer, CharSequence> {
        b() {
            super(1);
        }

        public final CharSequence a(int i10) {
            return g.this.d(i10) + ": " + g.this.e(i10).getSerialName();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public g(String serialName, j kind, int i10, List<? extends f> typeParameters, C3817a builder) {
        C3862t.g(serialName, "serialName");
        C3862t.g(kind, "kind");
        C3862t.g(typeParameters, "typeParameters");
        C3862t.g(builder, "builder");
        this.serialName = serialName;
        this.kind = kind;
        this.elementsCount = i10;
        this.annotations = builder.c();
        this.serialNames = r.U0(builder.f());
        String[] strArr = (String[]) builder.f().toArray(new String[0]);
        this.elementNames = strArr;
        this.elementDescriptors = G.b(builder.e());
        this.elementAnnotations = (List[]) builder.d().toArray(new List[0]);
        this.elementOptionality = r.R0(builder.g());
        Iterable<IndexedValue> iterableV0 = C3831l.V0(strArr);
        ArrayList arrayList = new ArrayList(r.x(iterableV0, 10));
        for (IndexedValue indexedValue : iterableV0) {
            arrayList.add(v.a(indexedValue.d(), Integer.valueOf(indexedValue.c())));
        }
        this.name2Index = M.p(arrayList);
        this.typeParametersDescriptors = G.b(typeParameters);
        this._hashCode = C4165j.a(new a());
    }

    private final int h() {
        return ((Number) this._hashCode.getValue()).intValue();
    }

    @Override // kc.f
    /* renamed from: a, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // mc.InterfaceC4028h
    public Set<String> b() {
        return this.serialNames;
    }

    @Override // kc.f
    /* renamed from: c, reason: from getter */
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kc.f
    public String d(int index) {
        return this.elementNames[index];
    }

    @Override // kc.f
    public f e(int index) {
        return this.elementDescriptors[index];
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof g) {
            f fVar = (f) other;
            if (C3862t.b(getSerialName(), fVar.getSerialName()) && Arrays.equals(this.typeParametersDescriptors, ((g) other).typeParametersDescriptors) && getElementsCount() == fVar.getElementsCount()) {
                int elementsCount = getElementsCount();
                for (int i10 = 0; i10 < elementsCount; i10++) {
                    if (C3862t.b(e(i10).getSerialName(), fVar.e(i10).getSerialName()) && C3862t.b(e(i10).getKind(), fVar.e(i10).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kc.f
    public boolean f(int index) {
        return this.elementOptionality[index];
    }

    public int hashCode() {
        return h();
    }

    @Override // kc.f
    /* renamed from: i, reason: from getter */
    public j getKind() {
        return this.kind;
    }

    @Override // kc.f
    /* renamed from: isInline */
    public boolean getIsInline() {
        return f.a.a(this);
    }

    public String toString() {
        return r.s0(Ha.g.p(0, getElementsCount()), ", ", getSerialName() + '(', ")", 0, null, new b(), 24, null);
    }
}
