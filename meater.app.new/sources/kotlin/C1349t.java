package kotlin;

import Ba.l;
import java.util.List;
import kotlin.C1337h;
import kotlin.C1350u;
import kotlin.Metadata;
import kotlin.collections.r;
import oa.C4153F;
import oa.C4170o;
import oa.C4172q;
import oa.C4173r;
import oa.v;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aY\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000\u0012\u0004\u0012\u00020\t0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "LL0/k;", "LL0/U;", "typefaceRequest", "LL0/h;", "asyncTypefaceCache", "LL0/H;", "platformFontLoader", "Lkotlin/Function1;", "", "createDefaultTypeface", "Loa/o;", "b", "(Ljava/util/List;LL0/U;LL0/h;LL0/H;LBa/l;)Loa/o;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: L0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1349t {
    /* JADX INFO: Access modifiers changed from: private */
    public static final C4170o<List<InterfaceC1340k>, Object> b(List<? extends InterfaceC1340k> list, TypefaceRequest typefaceRequest, C1337h c1337h, InterfaceC1315H interfaceC1315H, l<? super TypefaceRequest, ? extends Object> lVar) {
        Object objB;
        InterfaceC1340k interfaceC1340k;
        Object objA;
        InterfaceC1340k interfaceC1340k2;
        int size = list.size();
        List listS = null;
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC1340k interfaceC1340k3 = list.get(i10);
            int loadingStrategy = interfaceC1340k3.getLoadingStrategy();
            C1350u.Companion companion = C1350u.INSTANCE;
            if (C1350u.e(loadingStrategy, companion.b())) {
                synchronized (c1337h.cacheLock) {
                    try {
                        C1337h.Key key = new C1337h.Key(interfaceC1340k3, interfaceC1315H.getCacheKey());
                        C1337h.a aVar = (C1337h.a) c1337h.resultCache.d(key);
                        if (aVar == null) {
                            aVar = (C1337h.a) c1337h.permanentCache.b(key);
                        }
                        if (aVar != null) {
                            objB = aVar.getResult();
                            interfaceC1340k = interfaceC1340k3;
                        } else {
                            C4153F c4153f = C4153F.f46609a;
                            try {
                                objB = interfaceC1315H.b(interfaceC1340k3);
                                interfaceC1340k = interfaceC1340k3;
                                C1337h.f(c1337h, interfaceC1340k3, interfaceC1315H, objB, false, 8, null);
                            } catch (Exception e10) {
                                throw new IllegalStateException("Unable to load font " + interfaceC1340k3, e10);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (objB != null) {
                    return v.a(listS, C1354y.a(typefaceRequest.getFontSynthesis(), objB, interfaceC1340k, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
                throw new IllegalStateException("Unable to load font " + interfaceC1340k);
            }
            if (C1350u.e(loadingStrategy, companion.c())) {
                synchronized (c1337h.cacheLock) {
                    try {
                        C1337h.Key key2 = new C1337h.Key(interfaceC1340k3, interfaceC1315H.getCacheKey());
                        C1337h.a aVar2 = (C1337h.a) c1337h.resultCache.d(key2);
                        if (aVar2 == null) {
                            aVar2 = (C1337h.a) c1337h.permanentCache.b(key2);
                        }
                        if (aVar2 != null) {
                            objA = aVar2.getResult();
                            interfaceC1340k2 = interfaceC1340k3;
                        } else {
                            C4153F c4153f2 = C4153F.f46609a;
                            try {
                                C4172q.Companion companion2 = C4172q.INSTANCE;
                                objA = C4172q.a(interfaceC1315H.b(interfaceC1340k3));
                            } catch (Throwable th2) {
                                C4172q.Companion companion3 = C4172q.INSTANCE;
                                objA = C4172q.a(C4173r.a(th2));
                            }
                            if (C4172q.c(objA)) {
                                objA = null;
                            }
                            interfaceC1340k2 = interfaceC1340k3;
                            C1337h.f(c1337h, interfaceC1340k3, interfaceC1315H, objA, false, 8, null);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (objA != null) {
                    return v.a(listS, C1354y.a(typefaceRequest.getFontSynthesis(), objA, interfaceC1340k2, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                }
            } else {
                if (!C1350u.e(loadingStrategy, companion.a())) {
                    throw new IllegalStateException("Unknown font type " + interfaceC1340k3);
                }
                C1337h.a aVarD = c1337h.d(interfaceC1340k3, interfaceC1315H);
                if (aVarD != null) {
                    if (!C1337h.a.e(aVarD.getResult()) && aVarD.getResult() != null) {
                        return v.a(listS, C1354y.a(typefaceRequest.getFontSynthesis(), aVarD.getResult(), interfaceC1340k3, typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle()));
                    }
                } else if (listS == null) {
                    listS = r.s(interfaceC1340k3);
                } else {
                    listS.add(interfaceC1340k3);
                }
            }
        }
        return v.a(listS, lVar.invoke(typefaceRequest));
    }
}
