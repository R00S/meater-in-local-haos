package bb;

import Db.InterfaceC1016w;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1691d;
import Ra.InterfaceC1692e;
import Ra.t0;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import oa.C4153F;
import tb.AbstractC4601m;
import tb.C4603o;

/* compiled from: DescriptorResolverUtils.java */
/* renamed from: bb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2275a {

    /* compiled from: DescriptorResolverUtils.java */
    /* renamed from: bb.a$a, reason: collision with other inner class name */
    static class C0424a extends AbstractC4601m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1016w f30701a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f30702b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f30703c;

        /* compiled from: DescriptorResolverUtils.java */
        /* renamed from: bb.a$a$a, reason: collision with other inner class name */
        class C0425a implements Ba.l<InterfaceC1689b, C4153F> {
            C0425a() {
            }

            private static /* synthetic */ void a(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // Ba.l
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C4153F invoke(InterfaceC1689b interfaceC1689b) {
                if (interfaceC1689b == null) {
                    a(0);
                }
                C0424a.this.f30701a.b(interfaceC1689b);
                return C4153F.f46609a;
            }
        }

        C0424a(InterfaceC1016w interfaceC1016w, Set set, boolean z10) {
            this.f30701a = interfaceC1016w;
            this.f30702b = set;
            this.f30703c = z10;
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "fromSuper";
            } else if (i10 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i10 == 3) {
                objArr[0] = "member";
            } else if (i10 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // tb.AbstractC4602n
        public void a(InterfaceC1689b interfaceC1689b) {
            if (interfaceC1689b == null) {
                f(0);
            }
            C4603o.K(interfaceC1689b, new C0425a());
            this.f30702b.add(interfaceC1689b);
        }

        @Override // tb.AbstractC4602n
        public void d(InterfaceC1689b interfaceC1689b, Collection<? extends InterfaceC1689b> collection) {
            if (interfaceC1689b == null) {
                f(3);
            }
            if (collection == null) {
                f(4);
            }
            if (!this.f30703c || interfaceC1689b.i() == InterfaceC1689b.a.FAKE_OVERRIDE) {
                super.d(interfaceC1689b, collection);
            }
        }

        @Override // tb.AbstractC4601m
        public void e(InterfaceC1689b interfaceC1689b, InterfaceC1689b interfaceC1689b2) {
            if (interfaceC1689b == null) {
                f(1);
            }
            if (interfaceC1689b2 == null) {
                f(2);
            }
        }
    }

    private static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case 7:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    public static t0 b(qb.f fVar, InterfaceC1692e interfaceC1692e) {
        if (fVar == null) {
            a(19);
        }
        if (interfaceC1692e == null) {
            a(20);
        }
        Collection<InterfaceC1691d> collectionN = interfaceC1692e.n();
        if (collectionN.size() != 1) {
            return null;
        }
        for (t0 t0Var : collectionN.iterator().next().k()) {
            if (t0Var.getName().equals(fVar)) {
                return t0Var;
            }
        }
        return null;
    }

    private static <D extends InterfaceC1689b> Collection<D> c(qb.f fVar, Collection<D> collection, Collection<D> collection2, InterfaceC1692e interfaceC1692e, InterfaceC1016w interfaceC1016w, C4603o c4603o, boolean z10) {
        if (fVar == null) {
            a(12);
        }
        if (collection == null) {
            a(13);
        }
        if (collection2 == null) {
            a(14);
        }
        if (interfaceC1692e == null) {
            a(15);
        }
        if (interfaceC1016w == null) {
            a(16);
        }
        if (c4603o == null) {
            a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c4603o.v(fVar, collection, collection2, interfaceC1692e, new C0424a(interfaceC1016w, linkedHashSet, z10));
        return linkedHashSet;
    }

    public static <D extends InterfaceC1689b> Collection<D> d(qb.f fVar, Collection<D> collection, Collection<D> collection2, InterfaceC1692e interfaceC1692e, InterfaceC1016w interfaceC1016w, C4603o c4603o) {
        if (fVar == null) {
            a(0);
        }
        if (collection == null) {
            a(1);
        }
        if (collection2 == null) {
            a(2);
        }
        if (interfaceC1692e == null) {
            a(3);
        }
        if (interfaceC1016w == null) {
            a(4);
        }
        if (c4603o == null) {
            a(5);
        }
        return c(fVar, collection, collection2, interfaceC1692e, interfaceC1016w, c4603o, false);
    }

    public static <D extends InterfaceC1689b> Collection<D> e(qb.f fVar, Collection<D> collection, Collection<D> collection2, InterfaceC1692e interfaceC1692e, InterfaceC1016w interfaceC1016w, C4603o c4603o) {
        if (fVar == null) {
            a(6);
        }
        if (collection == null) {
            a(7);
        }
        if (collection2 == null) {
            a(8);
        }
        if (interfaceC1692e == null) {
            a(9);
        }
        if (interfaceC1016w == null) {
            a(10);
        }
        if (c4603o == null) {
            a(11);
        }
        return c(fVar, collection, collection2, interfaceC1692e, interfaceC1016w, c4603o, true);
    }
}
