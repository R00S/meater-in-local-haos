package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2077x;
import androidx.datastore.preferences.protobuf.r0;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2071q extends AbstractC2070p<AbstractC2077x.d> {

    /* compiled from: ExtensionSchemaLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.q$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25043a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f25043a = iArr;
            try {
                iArr[r0.b.f25051D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25043a[r0.b.f25052E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25043a[r0.b.f25053F.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25043a[r0.b.f25054G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25043a[r0.b.f25055H.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25043a[r0.b.f25056I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25043a[r0.b.f25057J.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25043a[r0.b.f25058K.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f25043a[r0.b.f25063P.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f25043a[r0.b.f25065R.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f25043a[r0.b.f25066S.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f25043a[r0.b.f25067T.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f25043a[r0.b.f25068U.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f25043a[r0.b.f25064Q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f25043a[r0.b.f25062O.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f25043a[r0.b.f25059L.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f25043a[r0.b.f25060M.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f25043a[r0.b.f25061N.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    C2071q() {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2070p
    int a(Map.Entry<?, ?> entry) {
        return ((AbstractC2077x.d) entry.getKey()).e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2070p
    Object b(C2069o c2069o, P p10, int i10) {
        return c2069o.a(p10, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2070p
    C2073t<AbstractC2077x.d> c(Object obj) {
        return ((AbstractC2077x.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2070p
    C2073t<AbstractC2077x.d> d(Object obj) {
        return ((AbstractC2077x.c) obj).L();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2070p
    boolean e(P p10) {
        return p10 instanceof AbstractC2077x.c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2070p
    void f(Object obj) {
        c(obj).t();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019c  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC2070p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    <UT, UB> UB g(androidx.datastore.preferences.protobuf.e0 r4, java.lang.Object r5, androidx.datastore.preferences.protobuf.C2069o r6, androidx.datastore.preferences.protobuf.C2073t<androidx.datastore.preferences.protobuf.AbstractC2077x.d> r7, UB r8, androidx.datastore.preferences.protobuf.l0<UT, UB> r9) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2071q.g(androidx.datastore.preferences.protobuf.e0, java.lang.Object, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.t, java.lang.Object, androidx.datastore.preferences.protobuf.l0):java.lang.Object");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2070p
    void h(e0 e0Var, Object obj, C2069o c2069o, C2073t<AbstractC2077x.d> c2073t) {
        AbstractC2077x.e eVar = (AbstractC2077x.e) obj;
        c2073t.x(eVar.f25172b, e0Var.K(eVar.b().getClass(), c2069o));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2070p
    void i(AbstractC2062h abstractC2062h, Object obj, C2069o c2069o, C2073t<AbstractC2077x.d> c2073t) throws InvalidProtocolBufferException {
        AbstractC2077x.e eVar = (AbstractC2077x.e) obj;
        P pJ = eVar.b().g().j();
        AbstractC2059e abstractC2059eQ = AbstractC2059e.Q(ByteBuffer.wrap(abstractC2062h.G()), true);
        b0.a().b(pJ, abstractC2059eQ, c2069o);
        c2073t.x(eVar.f25172b, pJ);
        if (abstractC2059eQ.w() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.a();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2070p
    void j(s0 s0Var, Map.Entry<?, ?> entry) {
        AbstractC2077x.d dVar = (AbstractC2077x.d) entry.getKey();
        if (!dVar.isRepeated()) {
            switch (a.f25043a[dVar.g().ordinal()]) {
                case 1:
                    s0Var.e(dVar.e(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    s0Var.A(dVar.e(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    s0Var.n(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    s0Var.l(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    s0Var.r(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    s0Var.h(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    s0Var.d(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    s0Var.o(dVar.e(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    s0Var.b(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    s0Var.p(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    s0Var.u(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    s0Var.H(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    s0Var.z(dVar.e(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    s0Var.r(dVar.e(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    s0Var.L(dVar.e(), (AbstractC2062h) entry.getValue());
                    break;
                case 16:
                    s0Var.k(dVar.e(), (String) entry.getValue());
                    break;
                case 17:
                    s0Var.O(dVar.e(), entry.getValue(), b0.a().d(entry.getValue().getClass()));
                    break;
                case 18:
                    s0Var.M(dVar.e(), entry.getValue(), b0.a().d(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f25043a[dVar.g().ordinal()]) {
            case 1:
                h0.P(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 2:
                h0.T(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 3:
                h0.W(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 4:
                h0.e0(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 5:
                h0.V(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 6:
                h0.S(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 7:
                h0.R(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 8:
                h0.N(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 9:
                h0.d0(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                h0.Y(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                h0.Z(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                h0.a0(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                h0.b0(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 14:
                h0.V(dVar.e(), (List) entry.getValue(), s0Var, dVar.isPacked());
                break;
            case 15:
                h0.O(dVar.e(), (List) entry.getValue(), s0Var);
                break;
            case 16:
                h0.c0(dVar.e(), (List) entry.getValue(), s0Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    h0.U(dVar.e(), (List) entry.getValue(), s0Var, b0.a().d(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    h0.X(dVar.e(), (List) entry.getValue(), s0Var, b0.a().d(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
