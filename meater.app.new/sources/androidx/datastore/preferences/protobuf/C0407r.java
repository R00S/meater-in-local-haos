package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0423y;
import androidx.datastore.preferences.protobuf.C0409r1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.r */
/* loaded from: classes.dex */
final class C0407r extends AbstractC0404q<AbstractC0423y.d> {

    /* compiled from: ExtensionSchemaLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.r$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2873a;

        static {
            int[] iArr = new int[C0409r1.b.values().length];
            f2873a = iArr;
            try {
                iArr[C0409r1.b.f2878f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2873a[C0409r1.b.f2879g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2873a[C0409r1.b.f2880h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2873a[C0409r1.b.f2881i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2873a[C0409r1.b.f2882j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2873a[C0409r1.b.f2883k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2873a[C0409r1.b.f2884l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2873a[C0409r1.b.f2885m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2873a[C0409r1.b.f2890r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2873a[C0409r1.b.f2892t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2873a[C0409r1.b.f2893u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2873a[C0409r1.b.f2894v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2873a[C0409r1.b.f2895w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2873a[C0409r1.b.f2891s.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2873a[C0409r1.b.f2889q.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2873a[C0409r1.b.f2886n.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2873a[C0409r1.b.f2887o.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2873a[C0409r1.b.f2888p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    C0407r() {
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0404q
    /* renamed from: a */
    int mo3142a(Map.Entry<?, ?> entry) {
        return ((AbstractC0423y.d) entry.getKey()).mo3301f();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0404q
    /* renamed from: b */
    Object mo3143b(C0401p c0401p, InterfaceC0405q0 interfaceC0405q0, int i2) {
        return c0401p.m3080a(interfaceC0405q0, i2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0404q
    /* renamed from: c */
    C0415u<AbstractC0423y.d> mo3144c(Object obj) {
        return ((AbstractC0423y.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0404q
    /* renamed from: d */
    C0415u<AbstractC0423y.d> mo3145d(Object obj) {
        return ((AbstractC0423y.c) obj).m3358J();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0404q
    /* renamed from: e */
    boolean mo3146e(InterfaceC0405q0 interfaceC0405q0) {
        return interfaceC0405q0 instanceof AbstractC0423y.c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0404q
    /* renamed from: f */
    void mo3147f(Object obj) {
        mo3144c(obj).m3297t();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0404q
    /* renamed from: g */
    <UT, UB> UB mo3148g(InterfaceC0370e1 interfaceC0370e1, Object obj, C0401p c0401p, C0415u<AbstractC0423y.d> c0415u, UB ub, AbstractC0391l1<UT, UB> abstractC0391l1) throws IOException {
        Object objM3290i;
        ArrayList arrayList;
        AbstractC0423y.e eVar = (AbstractC0423y.e) obj;
        int iM3363c = eVar.m3363c();
        if (eVar.f3027b.mo3302h() && eVar.f3027b.mo3305m()) {
            switch (a.f2873a[eVar.m3361a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2635J(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2629D(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2660q(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2657n(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2662s(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2639N(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2666w(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2669z(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2653j(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2651h(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2661r(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2647d(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2652i(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC0370e1.mo2663t(arrayList);
                    ub = (UB) C0379h1.m2810z(iM3363c, arrayList, eVar.f3027b.m3360k(), ub, abstractC0391l1);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f3027b.mo3303j());
            }
            c0415u.m3299x(eVar.f3027b, arrayList);
        } else {
            Object objValueOf = null;
            if (eVar.m3361a() != C0409r1.b.f2891s) {
                switch (a.f2873a[eVar.m3361a().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(interfaceC0370e1.readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(interfaceC0370e1.readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(interfaceC0370e1.mo2637L());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(interfaceC0370e1.mo2648e());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(interfaceC0370e1.mo2630E());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(interfaceC0370e1.mo2649f());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(interfaceC0370e1.mo2654k());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(interfaceC0370e1.mo2655l());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(interfaceC0370e1.mo2659p());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(interfaceC0370e1.mo2633H());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(interfaceC0370e1.mo2656m());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(interfaceC0370e1.mo2667x());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(interfaceC0370e1.mo2668y());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = interfaceC0370e1.mo2628C();
                        break;
                    case 16:
                        objValueOf = interfaceC0370e1.mo2642a();
                        break;
                    case 17:
                        objValueOf = interfaceC0370e1.mo2658o(eVar.m3362b().getClass(), c0401p);
                        break;
                    case 18:
                        objValueOf = interfaceC0370e1.mo2650g(eVar.m3362b().getClass(), c0401p);
                        break;
                }
            } else {
                int iMo2630E = interfaceC0370e1.mo2630E();
                if (eVar.f3027b.m3360k().m2567a(iMo2630E) == null) {
                    return (UB) C0379h1.m2765L(iM3363c, iMo2630E, ub, abstractC0391l1);
                }
                objValueOf = Integer.valueOf(iMo2630E);
            }
            if (eVar.m3364d()) {
                c0415u.m3287a(eVar.f3027b, objValueOf);
            } else {
                int i2 = a.f2873a[eVar.m3361a().ordinal()];
                if ((i2 == 17 || i2 == 18) && (objM3290i = c0415u.m3290i(eVar.f3027b)) != null) {
                    objValueOf = C0357a0.m2563h(objM3290i, objValueOf);
                }
                c0415u.m3299x(eVar.f3027b, objValueOf);
            }
        }
        return ub;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0404q
    /* renamed from: h */
    void mo3149h(InterfaceC0370e1 interfaceC0370e1, Object obj, C0401p c0401p, C0415u<AbstractC0423y.d> c0415u) throws IOException {
        AbstractC0423y.e eVar = (AbstractC0423y.e) obj;
        c0415u.m3299x(eVar.f3027b, interfaceC0370e1.mo2650g(eVar.m3362b().getClass(), c0401p));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0404q
    /* renamed from: i */
    void mo3150i(AbstractC0377h abstractC0377h, Object obj, C0401p c0401p, C0415u<AbstractC0423y.d> c0415u) throws IOException {
        AbstractC0423y.e eVar = (AbstractC0423y.e) obj;
        InterfaceC0405q0 interfaceC0405q0Mo3157J0 = eVar.m3362b().mo3154f().mo3157J0();
        AbstractC0368e abstractC0368eM2605P = AbstractC0368e.m2605P(ByteBuffer.wrap(abstractC0377h.m2733z()), true);
        C0361b1.m2578a().m2579b(interfaceC0405q0Mo3157J0, abstractC0368eM2605P, c0401p);
        c0415u.m3299x(eVar.f3027b, interfaceC0405q0Mo3157J0);
        if (abstractC0368eM2605P.mo2626A() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.m2530a();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0404q
    /* renamed from: j */
    void mo3151j(InterfaceC0412s1 interfaceC0412s1, Map.Entry<?, ?> entry) throws IOException {
        AbstractC0423y.d dVar = (AbstractC0423y.d) entry.getKey();
        if (!dVar.mo3302h()) {
            switch (a.f2873a[dVar.mo3303j().ordinal()]) {
                case 1:
                    interfaceC0412s1.mo2968e(dVar.mo3301f(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    interfaceC0412s1.mo2953E(dVar.mo3301f(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    interfaceC0412s1.mo2979p(dVar.mo3301f(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    interfaceC0412s1.mo2977n(dVar.mo3301f(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    interfaceC0412s1.mo2983t(dVar.mo3301f(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    interfaceC0412s1.mo2971h(dVar.mo3301f(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    interfaceC0412s1.mo2967d(dVar.mo3301f(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    interfaceC0412s1.mo2980q(dVar.mo3301f(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    interfaceC0412s1.mo2965b(dVar.mo3301f(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    interfaceC0412s1.mo2981r(dVar.mo3301f(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    interfaceC0412s1.mo2987x(dVar.mo3301f(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    interfaceC0412s1.mo2961M(dVar.mo3301f(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    interfaceC0412s1.mo2952D(dVar.mo3301f(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    interfaceC0412s1.mo2983t(dVar.mo3301f(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    interfaceC0412s1.mo2986w(dVar.mo3301f(), (AbstractC0377h) entry.getValue());
                    break;
                case 16:
                    interfaceC0412s1.mo2976m(dVar.mo3301f(), (String) entry.getValue());
                    break;
                case 17:
                    interfaceC0412s1.mo2963O(dVar.mo3301f(), entry.getValue(), C0361b1.m2578a().m2581d(entry.getValue().getClass()));
                    break;
                case 18:
                    interfaceC0412s1.mo2989z(dVar.mo3301f(), entry.getValue(), C0361b1.m2578a().m2581d(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f2873a[dVar.mo3303j().ordinal()]) {
            case 1:
                C0379h1.m2769P(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 2:
                C0379h1.m2773T(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 3:
                C0379h1.m2776W(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 4:
                C0379h1.m2789e0(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 5:
                C0379h1.m2775V(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 6:
                C0379h1.m2772S(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 7:
                C0379h1.m2771R(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 8:
                C0379h1.m2767N(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 9:
                C0379h1.m2787d0(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 10:
                C0379h1.m2778Y(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 11:
                C0379h1.m2779Z(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 12:
                C0379h1.m2781a0(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 13:
                C0379h1.m2783b0(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 14:
                C0379h1.m2775V(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, dVar.mo3305m());
                break;
            case 15:
                C0379h1.m2768O(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1);
                break;
            case 16:
                C0379h1.m2785c0(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    C0379h1.m2774U(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, C0361b1.m2578a().m2581d(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    C0379h1.m2777X(dVar.mo3301f(), (List) entry.getValue(), interfaceC0412s1, C0361b1.m2578a().m2581d(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
