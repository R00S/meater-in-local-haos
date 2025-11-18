package Ua;

import Hb.H0;
import Hb.J0;
import Hb.Q0;
import Ra.AbstractC1707u;
import Ra.C1706t;
import Ra.InterfaceC1688a;
import Ra.InterfaceC1689b;
import Ra.InterfaceC1700m;
import Ra.InterfaceC1702o;
import Ra.InterfaceC1712z;
import Ra.c0;
import Ra.h0;
import Ra.m0;
import Ra.t0;
import Ra.u0;
import Ua.V;
import com.apptionlabs.meater_app.data.Config;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.C4596h;

/* compiled from: FunctionDescriptorImpl.java */
/* renamed from: Ua.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1779s extends AbstractC1775n implements InterfaceC1712z {

    /* renamed from: F, reason: collision with root package name */
    private List<m0> f17854F;

    /* renamed from: G, reason: collision with root package name */
    private List<t0> f17855G;

    /* renamed from: H, reason: collision with root package name */
    private Hb.U f17856H;

    /* renamed from: I, reason: collision with root package name */
    private List<c0> f17857I;

    /* renamed from: J, reason: collision with root package name */
    private c0 f17858J;

    /* renamed from: K, reason: collision with root package name */
    private c0 f17859K;

    /* renamed from: L, reason: collision with root package name */
    private Ra.E f17860L;

    /* renamed from: M, reason: collision with root package name */
    private AbstractC1707u f17861M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f17862N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f17863O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f17864P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f17865Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f17866R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f17867S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f17868T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f17869U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f17870V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f17871W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f17872X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f17873Y;

    /* renamed from: Z, reason: collision with root package name */
    private Collection<? extends InterfaceC1712z> f17874Z;

    /* renamed from: a0, reason: collision with root package name */
    private volatile Ba.a<Collection<InterfaceC1712z>> f17875a0;

    /* renamed from: b0, reason: collision with root package name */
    private final InterfaceC1712z f17876b0;

    /* renamed from: c0, reason: collision with root package name */
    private final InterfaceC1689b.a f17877c0;

    /* renamed from: d0, reason: collision with root package name */
    private InterfaceC1712z f17878d0;

    /* renamed from: e0, reason: collision with root package name */
    protected Map<InterfaceC1688a.InterfaceC0222a<?>, Object> f17879e0;

    /* compiled from: FunctionDescriptorImpl.java */
    /* renamed from: Ua.s$a */
    class a implements Ba.a<Collection<InterfaceC1712z>> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ J0 f17880B;

        a(J0 j02) {
            this.f17880B = j02;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<InterfaceC1712z> invoke() {
            Rb.k kVar = new Rb.k();
            Iterator<? extends InterfaceC1712z> it = AbstractC1779s.this.g().iterator();
            while (it.hasNext()) {
                kVar.add(it.next().d(this.f17880B));
            }
            return kVar;
        }
    }

    /* compiled from: FunctionDescriptorImpl.java */
    /* renamed from: Ua.s$b */
    static class b implements Ba.a<List<u0>> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ List f17882B;

        b(List list) {
            this.f17882B = list;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<u0> invoke() {
            return this.f17882B;
        }
    }

    /* compiled from: FunctionDescriptorImpl.java */
    /* renamed from: Ua.s$c */
    public class c implements InterfaceC1712z.a<InterfaceC1712z> {

        /* renamed from: a, reason: collision with root package name */
        protected H0 f17883a;

        /* renamed from: b, reason: collision with root package name */
        protected InterfaceC1700m f17884b;

        /* renamed from: c, reason: collision with root package name */
        protected Ra.E f17885c;

        /* renamed from: d, reason: collision with root package name */
        protected AbstractC1707u f17886d;

        /* renamed from: e, reason: collision with root package name */
        protected InterfaceC1712z f17887e;

        /* renamed from: f, reason: collision with root package name */
        protected InterfaceC1689b.a f17888f;

        /* renamed from: g, reason: collision with root package name */
        protected List<t0> f17889g;

        /* renamed from: h, reason: collision with root package name */
        protected List<c0> f17890h;

        /* renamed from: i, reason: collision with root package name */
        protected c0 f17891i;

        /* renamed from: j, reason: collision with root package name */
        protected c0 f17892j;

        /* renamed from: k, reason: collision with root package name */
        protected Hb.U f17893k;

        /* renamed from: l, reason: collision with root package name */
        protected qb.f f17894l;

        /* renamed from: m, reason: collision with root package name */
        protected boolean f17895m;

        /* renamed from: n, reason: collision with root package name */
        protected boolean f17896n;

        /* renamed from: o, reason: collision with root package name */
        protected boolean f17897o;

        /* renamed from: p, reason: collision with root package name */
        protected boolean f17898p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f17899q;

        /* renamed from: r, reason: collision with root package name */
        private List<m0> f17900r;

        /* renamed from: s, reason: collision with root package name */
        private Sa.h f17901s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f17902t;

        /* renamed from: u, reason: collision with root package name */
        private Map<InterfaceC1688a.InterfaceC0222a<?>, Object> f17903u;

        /* renamed from: v, reason: collision with root package name */
        private Boolean f17904v;

        /* renamed from: w, reason: collision with root package name */
        protected boolean f17905w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ AbstractC1779s f17906x;

        public c(AbstractC1779s abstractC1779s, H0 h02, InterfaceC1700m interfaceC1700m, Ra.E e10, AbstractC1707u abstractC1707u, InterfaceC1689b.a aVar, List<t0> list, List<c0> list2, c0 c0Var, Hb.U u10, qb.f fVar) {
            if (h02 == null) {
                v(0);
            }
            if (interfaceC1700m == null) {
                v(1);
            }
            if (e10 == null) {
                v(2);
            }
            if (abstractC1707u == null) {
                v(3);
            }
            if (aVar == null) {
                v(4);
            }
            if (list == null) {
                v(5);
            }
            if (list2 == null) {
                v(6);
            }
            if (u10 == null) {
                v(7);
            }
            this.f17906x = abstractC1779s;
            this.f17887e = null;
            this.f17892j = abstractC1779s.f17859K;
            this.f17895m = true;
            this.f17896n = false;
            this.f17897o = false;
            this.f17898p = false;
            this.f17899q = abstractC1779s.u0();
            this.f17900r = null;
            this.f17901s = null;
            this.f17902t = abstractC1779s.B0();
            this.f17903u = new LinkedHashMap();
            this.f17904v = null;
            this.f17905w = false;
            this.f17883a = h02;
            this.f17884b = interfaceC1700m;
            this.f17885c = e10;
            this.f17886d = abstractC1707u;
            this.f17888f = aVar;
            this.f17889g = list;
            this.f17890h = list2;
            this.f17891i = c0Var;
            this.f17893k = u10;
            this.f17894l = fVar;
        }

        private static /* synthetic */ void v(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    objArr[0] = "modality";
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    objArr[1] = "setModality";
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    objArr[2] = "setModality";
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i10) {
                case 9:
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public c q(Sa.h hVar) {
            if (hVar == null) {
                v(35);
            }
            this.f17901s = hVar;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public c g(boolean z10) {
            this.f17895m = z10;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public c u(c0 c0Var) {
            this.f17892j = c0Var;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public c a() {
            this.f17898p = true;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public c p(c0 c0Var) {
            this.f17891i = c0Var;
            return this;
        }

        public c H(boolean z10) {
            this.f17904v = Boolean.valueOf(z10);
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public c f() {
            this.f17902t = true;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public c l() {
            this.f17899q = true;
            return this;
        }

        public c K(boolean z10) {
            this.f17905w = z10;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public c n(InterfaceC1689b.a aVar) {
            if (aVar == null) {
                v(14);
            }
            this.f17888f = aVar;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public c m(Ra.E e10) {
            if (e10 == null) {
                v(10);
            }
            this.f17885c = e10;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public c b(qb.f fVar) {
            if (fVar == null) {
                v(17);
            }
            this.f17894l = fVar;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public c j(InterfaceC1689b interfaceC1689b) {
            this.f17887e = (InterfaceC1712z) interfaceC1689b;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public c o(InterfaceC1700m interfaceC1700m) {
            if (interfaceC1700m == null) {
                v(8);
            }
            this.f17884b = interfaceC1700m;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public c d() {
            this.f17897o = true;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public c s(Hb.U u10) {
            if (u10 == null) {
                v(23);
            }
            this.f17893k = u10;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public c t() {
            this.f17896n = true;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public c r(H0 h02) {
            if (h02 == null) {
                v(37);
            }
            this.f17883a = h02;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public c k(List<m0> list) {
            if (list == null) {
                v(21);
            }
            this.f17900r = list;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public c c(List<t0> list) {
            if (list == null) {
                v(19);
            }
            this.f17889g = list;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public c h(AbstractC1707u abstractC1707u) {
            if (abstractC1707u == null) {
                v(12);
            }
            this.f17886d = abstractC1707u;
            return this;
        }

        @Override // Ra.InterfaceC1712z.a
        public InterfaceC1712z e() {
            return this.f17906x.N0(this);
        }

        @Override // Ra.InterfaceC1712z.a
        public <V> InterfaceC1712z.a<InterfaceC1712z> i(InterfaceC1688a.InterfaceC0222a<V> interfaceC0222a, V v10) {
            if (interfaceC0222a == null) {
                v(39);
            }
            this.f17903u.put(interfaceC0222a, v10);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractC1779s(InterfaceC1700m interfaceC1700m, InterfaceC1712z interfaceC1712z, Sa.h hVar, qb.f fVar, InterfaceC1689b.a aVar, h0 h0Var) {
        super(interfaceC1700m, hVar, fVar, h0Var);
        if (interfaceC1700m == null) {
            H(0);
        }
        if (hVar == null) {
            H(1);
        }
        if (fVar == null) {
            H(2);
        }
        if (aVar == null) {
            H(3);
        }
        if (h0Var == null) {
            H(4);
        }
        this.f17861M = C1706t.f15174i;
        this.f17862N = false;
        this.f17863O = false;
        this.f17864P = false;
        this.f17865Q = false;
        this.f17866R = false;
        this.f17867S = false;
        this.f17868T = false;
        this.f17869U = false;
        this.f17870V = false;
        this.f17871W = false;
        this.f17872X = true;
        this.f17873Y = false;
        this.f17874Z = null;
        this.f17875a0 = null;
        this.f17878d0 = null;
        this.f17879e0 = null;
        this.f17876b0 = interfaceC1712z == null ? this : interfaceC1712z;
        this.f17877c0 = aVar;
    }

    private static /* synthetic */ void H(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[0] = "visibility";
                break;
            case 9:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "setVisibility";
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[2] = "setReturnType";
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case Config.NEED_HELP_PROBE_TOTAL_DISCONNECTIONS_THRESHOLD /* 30 */:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private h0 O0(boolean z10, InterfaceC1712z interfaceC1712z) {
        h0 h0VarJ;
        if (z10) {
            if (interfaceC1712z == null) {
                interfaceC1712z = L0();
            }
            h0VarJ = interfaceC1712z.j();
        } else {
            h0VarJ = h0.f15158a;
        }
        if (h0VarJ == null) {
            H(27);
        }
        return h0VarJ;
    }

    public static List<t0> P0(InterfaceC1712z interfaceC1712z, List<t0> list, J0 j02) {
        if (list == null) {
            H(28);
        }
        if (j02 == null) {
            H(29);
        }
        return Q0(interfaceC1712z, list, j02, false, false, null);
    }

    public static List<t0> Q0(InterfaceC1712z interfaceC1712z, List<t0> list, J0 j02, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            H(30);
        }
        if (j02 == null) {
            H(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (t0 t0Var : list) {
            Hb.U uA = t0Var.a();
            Q0 q02 = Q0.f5694G;
            Hb.U uP = j02.p(uA, q02);
            Hb.U uI0 = t0Var.i0();
            Hb.U uP2 = uI0 == null ? null : j02.p(uI0, q02);
            if (uP == null) {
                return null;
            }
            if ((uP != t0Var.a() || uI0 != uP2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(V.L0(interfaceC1712z, z10 ? null : t0Var, t0Var.getIndex(), t0Var.getAnnotations(), t0Var.getName(), uP, t0Var.r0(), t0Var.Z(), t0Var.W(), uP2, z11 ? t0Var.j() : h0.f15158a, t0Var instanceof V.b ? new b(((V.b) t0Var).Q0()) : null));
        }
        return arrayList;
    }

    private void U0() {
        Ba.a<Collection<InterfaceC1712z>> aVar = this.f17875a0;
        if (aVar != null) {
            this.f17874Z = aVar.invoke();
            this.f17875a0 = null;
        }
    }

    private void b1(boolean z10) {
        this.f17870V = z10;
    }

    private void c1(boolean z10) {
        this.f17869U = z10;
    }

    private void e1(InterfaceC1712z interfaceC1712z) {
        this.f17878d0 = interfaceC1712z;
    }

    @Override // Ra.InterfaceC1712z
    public boolean B0() {
        return this.f17870V;
    }

    @Override // Ra.D
    public boolean D0() {
        return this.f17868T;
    }

    @Override // Ra.InterfaceC1688a
    public boolean F() {
        return this.f17873Y;
    }

    @Override // Ra.D
    public boolean K() {
        return this.f17867S;
    }

    @Override // Ra.InterfaceC1689b
    /* renamed from: L0 */
    public InterfaceC1712z a0(InterfaceC1700m interfaceC1700m, Ra.E e10, AbstractC1707u abstractC1707u, InterfaceC1689b.a aVar, boolean z10) {
        InterfaceC1712z interfaceC1712zE = v().o(interfaceC1700m).m(e10).h(abstractC1707u).n(aVar).g(z10).e();
        if (interfaceC1712zE == null) {
            H(26);
        }
        return interfaceC1712zE;
    }

    /* renamed from: M0 */
    protected abstract AbstractC1779s p1(InterfaceC1700m interfaceC1700m, InterfaceC1712z interfaceC1712z, InterfaceC1689b.a aVar, qb.f fVar, Sa.h hVar, h0 h0Var);

    protected InterfaceC1712z N0(c cVar) {
        N n10;
        c0 c0Var;
        Hb.U uP;
        if (cVar == null) {
            H(25);
        }
        boolean[] zArr = new boolean[1];
        Sa.h hVarA = cVar.f17901s != null ? Sa.j.a(getAnnotations(), cVar.f17901s) : getAnnotations();
        InterfaceC1700m interfaceC1700m = cVar.f17884b;
        InterfaceC1712z interfaceC1712z = cVar.f17887e;
        AbstractC1779s abstractC1779sM0 = p1(interfaceC1700m, interfaceC1712z, cVar.f17888f, cVar.f17894l, hVarA, O0(cVar.f17897o, interfaceC1712z));
        List<m0> typeParameters = cVar.f17900r == null ? getTypeParameters() : cVar.f17900r;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        J0 j0C = Hb.D.c(typeParameters, cVar.f17883a, abstractC1779sM0, arrayList, zArr);
        if (j0C == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f17890h.isEmpty()) {
            int i10 = 0;
            for (c0 c0Var2 : cVar.f17890h) {
                Hb.U uP2 = j0C.p(c0Var2.a(), Q0.f5694G);
                if (uP2 == null) {
                    return null;
                }
                int i11 = i10 + 1;
                arrayList2.add(C4596h.b(abstractC1779sM0, uP2, ((Bb.f) c0Var2.getValue()).b(), c0Var2.getAnnotations(), i10));
                zArr[0] = zArr[0] | (uP2 != c0Var2.a());
                i10 = i11;
            }
        }
        c0 c0Var3 = cVar.f17891i;
        if (c0Var3 != null) {
            Hb.U uP3 = j0C.p(c0Var3.a(), Q0.f5694G);
            if (uP3 == null) {
                return null;
            }
            N n11 = new N(abstractC1779sM0, new Bb.d(abstractC1779sM0, uP3, cVar.f17891i.getValue()), cVar.f17891i.getAnnotations());
            zArr[0] = (uP3 != cVar.f17891i.a()) | zArr[0];
            n10 = n11;
        } else {
            n10 = null;
        }
        c0 c0Var4 = cVar.f17892j;
        if (c0Var4 != null) {
            c0 c0VarD = c0Var4.d(j0C);
            if (c0VarD == null) {
                return null;
            }
            zArr[0] = zArr[0] | (c0VarD != cVar.f17892j);
            c0Var = c0VarD;
        } else {
            c0Var = null;
        }
        List<t0> listQ0 = Q0(abstractC1779sM0, cVar.f17889g, j0C, cVar.f17898p, cVar.f17897o, zArr);
        if (listQ0 == null || (uP = j0C.p(cVar.f17893k, Q0.f5695H)) == null) {
            return null;
        }
        boolean z10 = zArr[0] | (uP != cVar.f17893k);
        zArr[0] = z10;
        if (!z10 && cVar.f17905w) {
            return this;
        }
        abstractC1779sM0.S0(n10, c0Var, arrayList2, arrayList, listQ0, uP, cVar.f17885c, cVar.f17886d);
        abstractC1779sM0.g1(this.f17862N);
        abstractC1779sM0.d1(this.f17863O);
        abstractC1779sM0.Y0(this.f17864P);
        abstractC1779sM0.f1(this.f17865Q);
        abstractC1779sM0.j1(this.f17866R);
        abstractC1779sM0.i1(this.f17871W);
        abstractC1779sM0.X0(this.f17867S);
        abstractC1779sM0.W0(this.f17868T);
        abstractC1779sM0.Z0(this.f17872X);
        abstractC1779sM0.c1(cVar.f17899q);
        abstractC1779sM0.b1(cVar.f17902t);
        abstractC1779sM0.a1(cVar.f17904v != null ? cVar.f17904v.booleanValue() : this.f17873Y);
        if (!cVar.f17903u.isEmpty() || this.f17879e0 != null) {
            Map<InterfaceC1688a.InterfaceC0222a<?>, Object> map = cVar.f17903u;
            Map<InterfaceC1688a.InterfaceC0222a<?>, Object> map2 = this.f17879e0;
            if (map2 != null) {
                for (Map.Entry<InterfaceC1688a.InterfaceC0222a<?>, Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                abstractC1779sM0.f17879e0 = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                abstractC1779sM0.f17879e0 = map;
            }
        }
        if (cVar.f17896n || c0() != null) {
            abstractC1779sM0.e1((c0() != null ? c0() : this).d(j0C));
        }
        if (cVar.f17895m && !L0().g().isEmpty()) {
            if (cVar.f17883a.f()) {
                Ba.a<Collection<InterfaceC1712z>> aVar = this.f17875a0;
                if (aVar != null) {
                    abstractC1779sM0.f17875a0 = aVar;
                } else {
                    abstractC1779sM0.w0(g());
                }
            } else {
                abstractC1779sM0.f17875a0 = new a(j0C);
            }
        }
        return abstractC1779sM0;
    }

    public boolean O() {
        return this.f17866R;
    }

    public boolean R0() {
        return this.f17872X;
    }

    public AbstractC1779s S0(c0 c0Var, c0 c0Var2, List<c0> list, List<? extends m0> list2, List<t0> list3, Hb.U u10, Ra.E e10, AbstractC1707u abstractC1707u) {
        if (list == null) {
            H(5);
        }
        if (list2 == null) {
            H(6);
        }
        if (list3 == null) {
            H(7);
        }
        if (abstractC1707u == null) {
            H(8);
        }
        this.f17854F = kotlin.collections.r.W0(list2);
        this.f17855G = kotlin.collections.r.W0(list3);
        this.f17856H = u10;
        this.f17860L = e10;
        this.f17861M = abstractC1707u;
        this.f17858J = c0Var;
        this.f17859K = c0Var2;
        this.f17857I = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            m0 m0Var = list2.get(i10);
            if (m0Var.getIndex() != i10) {
                throw new IllegalStateException(m0Var + " index is " + m0Var.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            t0 t0Var = list3.get(i11);
            if (t0Var.getIndex() != i11) {
                throw new IllegalStateException(t0Var + "index is " + t0Var.getIndex() + " but position is " + i11);
            }
        }
        return this;
    }

    protected c T0(J0 j02) {
        if (j02 == null) {
            H(24);
        }
        return new c(this, j02.j(), c(), m(), getVisibility(), i(), k(), o0(), j0(), getReturnType(), null);
    }

    public <V> void V0(InterfaceC1688a.InterfaceC0222a<V> interfaceC0222a, Object obj) {
        if (this.f17879e0 == null) {
            this.f17879e0 = new LinkedHashMap();
        }
        this.f17879e0.put(interfaceC0222a, obj);
    }

    public void W0(boolean z10) {
        this.f17868T = z10;
    }

    public void X0(boolean z10) {
        this.f17867S = z10;
    }

    public void Y0(boolean z10) {
        this.f17864P = z10;
    }

    public void Z0(boolean z10) {
        this.f17872X = z10;
    }

    public void a1(boolean z10) {
        this.f17873Y = z10;
    }

    @Override // Ra.InterfaceC1712z
    public InterfaceC1712z c0() {
        return this.f17878d0;
    }

    @Override // Ra.InterfaceC1688a
    public c0 d0() {
        return this.f17859K;
    }

    public void d1(boolean z10) {
        this.f17863O = z10;
    }

    public void f1(boolean z10) {
        this.f17865Q = z10;
    }

    public Collection<? extends InterfaceC1712z> g() {
        U0();
        Collection<? extends InterfaceC1712z> collectionEmptyList = this.f17874Z;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList == null) {
            H(14);
        }
        return collectionEmptyList;
    }

    public <V> V g0(InterfaceC1688a.InterfaceC0222a<V> interfaceC0222a) {
        Map<InterfaceC1688a.InterfaceC0222a<?>, Object> map = this.f17879e0;
        if (map == null) {
            return null;
        }
        return (V) map.get(interfaceC0222a);
    }

    public void g1(boolean z10) {
        this.f17862N = z10;
    }

    public Hb.U getReturnType() {
        return this.f17856H;
    }

    @Override // Ra.InterfaceC1688a
    public List<m0> getTypeParameters() {
        List<m0> list = this.f17854F;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // Ra.InterfaceC1704q
    public AbstractC1707u getVisibility() {
        AbstractC1707u abstractC1707u = this.f17861M;
        if (abstractC1707u == null) {
            H(16);
        }
        return abstractC1707u;
    }

    public void h1(Hb.U u10) {
        if (u10 == null) {
            H(11);
        }
        this.f17856H = u10;
    }

    @Override // Ra.InterfaceC1689b
    public InterfaceC1689b.a i() {
        InterfaceC1689b.a aVar = this.f17877c0;
        if (aVar == null) {
            H(21);
        }
        return aVar;
    }

    public void i1(boolean z10) {
        this.f17871W = z10;
    }

    public boolean isExternal() {
        return this.f17864P;
    }

    @Override // Ra.InterfaceC1712z
    public boolean isInfix() {
        if (this.f17863O) {
            return true;
        }
        Iterator<? extends InterfaceC1712z> it = L0().g().iterator();
        while (it.hasNext()) {
            if (it.next().isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f17865Q;
    }

    @Override // Ra.InterfaceC1712z
    public boolean isOperator() {
        if (this.f17862N) {
            return true;
        }
        Iterator<? extends InterfaceC1712z> it = L0().g().iterator();
        while (it.hasNext()) {
            if (it.next().isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f17871W;
    }

    @Override // Ra.InterfaceC1688a
    public c0 j0() {
        return this.f17858J;
    }

    public void j1(boolean z10) {
        this.f17866R = z10;
    }

    @Override // Ra.InterfaceC1688a
    public List<t0> k() {
        List<t0> list = this.f17855G;
        if (list == null) {
            H(19);
        }
        return list;
    }

    public void k1(AbstractC1707u abstractC1707u) {
        if (abstractC1707u == null) {
            H(10);
        }
        this.f17861M = abstractC1707u;
    }

    @Override // Ra.D
    public Ra.E m() {
        Ra.E e10 = this.f17860L;
        if (e10 == null) {
            H(15);
        }
        return e10;
    }

    @Override // Ra.InterfaceC1688a
    public List<c0> o0() {
        List<c0> list = this.f17857I;
        if (list == null) {
            H(13);
        }
        return list;
    }

    @Override // Ra.InterfaceC1712z
    public boolean u0() {
        return this.f17869U;
    }

    public InterfaceC1712z.a<? extends InterfaceC1712z> v() {
        c cVarT0 = T0(J0.f5665b);
        if (cVarT0 == null) {
            H(23);
        }
        return cVarT0;
    }

    public <R, D> R v0(InterfaceC1702o<R, D> interfaceC1702o, D d10) {
        return interfaceC1702o.m(this, d10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w0(Collection<? extends InterfaceC1689b> collection) {
        if (collection == 0) {
            H(17);
        }
        this.f17874Z = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1712z) it.next()).B0()) {
                this.f17870V = true;
                return;
            }
        }
    }

    @Override // Ra.InterfaceC1712z, Ra.j0
    public InterfaceC1712z d(J0 j02) {
        if (j02 == null) {
            H(22);
        }
        return j02.k() ? this : T0(j02).j(L0()).d().K(true).e();
    }

    @Override // Ua.AbstractC1775n, Ua.AbstractC1774m, Ra.InterfaceC1700m
    /* renamed from: b */
    public InterfaceC1712z L0() {
        InterfaceC1712z interfaceC1712z = this.f17876b0;
        InterfaceC1712z interfaceC1712zB = interfaceC1712z == this ? this : interfaceC1712z.L0();
        if (interfaceC1712zB == null) {
            H(20);
        }
        return interfaceC1712zB;
    }
}
