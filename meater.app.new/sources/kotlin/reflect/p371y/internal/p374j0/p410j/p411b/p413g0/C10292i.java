package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10782c0;
import kotlin.collections.C10822w0;
import kotlin.collections.C10827z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10594h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10604k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10609m;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10631b;
import kotlin.reflect.p371y.internal.p374j0.p378c.C9937a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.EnumC9941d;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9939b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10133l;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10139r;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10141t;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10144w;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10149a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10155g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10156h;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10151c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10160c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10163f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10247d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10301k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10303m;

/* compiled from: DeserializedPackageMemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.g0.i */
/* loaded from: classes3.dex */
public class C10292i extends AbstractC10291h {

    /* renamed from: g */
    private final InterfaceC10604k0 f39873g;

    /* renamed from: h */
    private final String f39874h;

    /* renamed from: i */
    private final C10160c f39875i;

    public C10292i(InterfaceC10604k0 interfaceC10604k0, C10133l c10133l, InterfaceC10151c interfaceC10151c, AbstractC10149a abstractC10149a, InterfaceC10289f interfaceC10289f, C10301k c10301k, String str, Function0<? extends Collection<C10163f>> function0) {
        C9801m.m32346f(interfaceC10604k0, "packageDescriptor");
        C9801m.m32346f(c10133l, "proto");
        C9801m.m32346f(interfaceC10151c, "nameResolver");
        C9801m.m32346f(abstractC10149a, "metadataVersion");
        C9801m.m32346f(c10301k, "components");
        C9801m.m32346f(str, "debugName");
        C9801m.m32346f(function0, "classNames");
        C10141t c10141tM34797V = c10133l.m34797V();
        C9801m.m32345e(c10141tM34797V, "proto.typeTable");
        C10155g c10155g = new C10155g(c10141tM34797V);
        C10156h.a aVar = C10156h.f39237a;
        C10144w c10144wM34798X = c10133l.m34798X();
        C9801m.m32345e(c10144wM34798X, "proto.versionRequirementTable");
        C10303m c10303mM36416a = c10301k.m36416a(interfaceC10604k0, interfaceC10151c, c10155g, aVar.m35401a(c10144wM34798X), abstractC10149a, interfaceC10289f);
        List<C10130i> listM34790O = c10133l.m34790O();
        C9801m.m32345e(listM34790O, "proto.functionList");
        List<C10135n> listM34793R = c10133l.m34793R();
        C9801m.m32345e(listM34793R, "proto.propertyList");
        List<C10139r> listM34796U = c10133l.m34796U();
        C9801m.m32345e(listM34796U, "proto.typeAliasList");
        super(c10303mM36416a, listM34790O, listM34793R, listM34796U, function0);
        this.f39873g = interfaceC10604k0;
        this.f39874h = str;
        this.f39875i = interfaceC10604k0.mo37712d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: f */
    public InterfaceC10594h mo33316f(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        m36385z(c10163f, interfaceC9939b);
        return super.mo33316f(c10163f, interfaceC9939b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
    /* renamed from: i */
    protected void mo36293i(Collection<InterfaceC10609m> collection, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(collection, "result");
        C9801m.m32346f(function1, "nameFilter");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
    /* renamed from: m */
    protected C10159b mo36296m(C10163f c10163f) {
        C9801m.m32346f(c10163f, "name");
        return new C10159b(this.f39875i, c10163f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
    /* renamed from: s */
    protected Set<C10163f> mo36297s() {
        return C10822w0.m38917d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
    /* renamed from: t */
    protected Set<C10163f> mo36298t() {
        return C10822w0.m38917d();
    }

    public String toString() {
        return this.f39874h;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
    /* renamed from: u */
    protected Set<C10163f> mo36299u() {
        return C10822w0.m38917d();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.AbstractC10291h
    /* renamed from: w */
    protected boolean mo36327w(C10163f c10163f) {
        boolean z;
        C9801m.m32346f(c10163f, "name");
        if (super.mo36327w(c10163f)) {
            return true;
        }
        Iterable<InterfaceC10631b> iterableM36426k = m36325p().m36452c().m36426k();
        if ((iterableM36426k instanceof Collection) && ((Collection) iterableM36426k).isEmpty()) {
            z = false;
        } else {
            Iterator<InterfaceC10631b> it = iterableM36426k.iterator();
            while (it.hasNext()) {
                if (it.next().mo32849b(this.f39875i, c10163f)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return z;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10252i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10254k
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public List<InterfaceC10609m> mo33317g(C10247d c10247d, Function1<? super C10163f, Boolean> function1) {
        C9801m.m32346f(c10247d, "kindFilter");
        C9801m.m32346f(function1, "nameFilter");
        Collection<InterfaceC10609m> collectionM36324j = m36324j(c10247d, function1, EnumC9941d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<InterfaceC10631b> iterableM36426k = m36325p().m36452c().m36426k();
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC10631b> it = iterableM36426k.iterator();
        while (it.hasNext()) {
            C10827z.m38933z(arrayList, it.next().mo32848a(this.f39875i));
        }
        return C10782c0.m38609o0(collectionM36324j, arrayList);
    }

    /* renamed from: z */
    public void m36385z(C10163f c10163f, InterfaceC9939b interfaceC9939b) {
        C9801m.m32346f(c10163f, "name");
        C9801m.m32346f(interfaceC9939b, "location");
        C9937a.m33014b(m36325p().m36452c().m36430o(), interfaceC9939b, this.f39873g, c10163f);
    }
}
