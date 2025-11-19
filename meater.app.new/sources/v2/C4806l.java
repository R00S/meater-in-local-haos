package v2;

import S2.r;
import android.net.Uri;
import b3.C2213b;
import b3.C2216e;
import b3.C2219h;
import b3.C2221j;
import c3.C2310b;
import d3.C3040a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m8.AbstractC4009y;
import w2.C4975b;
import y2.C5122a;
import z2.C5168a;

/* compiled from: DefaultExtractorsFactory.java */
/* renamed from: v2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4806l implements u {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f51182r = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: s, reason: collision with root package name */
    private static final a f51183s = new a(new a.InterfaceC0734a() { // from class: v2.j
        @Override // v2.C4806l.a.InterfaceC0734a
        public final Constructor a() {
            return C4806l.k();
        }
    });

    /* renamed from: t, reason: collision with root package name */
    private static final a f51184t = new a(new a.InterfaceC0734a() { // from class: v2.k
        @Override // v2.C4806l.a.InterfaceC0734a
        public final Constructor a() {
            return C4806l.l();
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private boolean f51185b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f51186c;

    /* renamed from: d, reason: collision with root package name */
    private int f51187d;

    /* renamed from: e, reason: collision with root package name */
    private int f51188e;

    /* renamed from: f, reason: collision with root package name */
    private int f51189f;

    /* renamed from: g, reason: collision with root package name */
    private int f51190g;

    /* renamed from: h, reason: collision with root package name */
    private int f51191h;

    /* renamed from: i, reason: collision with root package name */
    private int f51192i;

    /* renamed from: j, reason: collision with root package name */
    private int f51193j;

    /* renamed from: l, reason: collision with root package name */
    private int f51195l;

    /* renamed from: m, reason: collision with root package name */
    private AbstractC4009y<U1.s> f51196m;

    /* renamed from: q, reason: collision with root package name */
    private int f51200q;

    /* renamed from: k, reason: collision with root package name */
    private int f51194k = 1;

    /* renamed from: n, reason: collision with root package name */
    private int f51197n = 112800;

    /* renamed from: p, reason: collision with root package name */
    private r.a f51199p = new S2.h();

    /* renamed from: o, reason: collision with root package name */
    private boolean f51198o = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DefaultExtractorsFactory.java */
    /* renamed from: v2.l$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0734a f51201a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f51202b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private Constructor<? extends InterfaceC4810p> f51203c;

        /* compiled from: DefaultExtractorsFactory.java */
        /* renamed from: v2.l$a$a, reason: collision with other inner class name */
        public interface InterfaceC0734a {
            Constructor<? extends InterfaceC4810p> a();
        }

        public a(InterfaceC0734a interfaceC0734a) {
            this.f51201a = interfaceC0734a;
        }

        private Constructor<? extends InterfaceC4810p> b() {
            synchronized (this.f51202b) {
                if (this.f51202b.get()) {
                    return this.f51203c;
                }
                try {
                    return this.f51201a.a();
                } catch (ClassNotFoundException unused) {
                    this.f51202b.set(true);
                    return this.f51203c;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
        }

        public InterfaceC4810p a(Object... objArr) {
            Constructor<? extends InterfaceC4810p> constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return constructorB.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void i(int i10, List<InterfaceC4810p> list) {
        switch (i10) {
            case 0:
                list.add(new C2213b());
                break;
            case 1:
                list.add(new C2216e());
                break;
            case 2:
                list.add(new C2219h((this.f51186c ? 2 : 0) | this.f51187d | (this.f51185b ? 1 : 0)));
                break;
            case 3:
                list.add(new C4975b((this.f51186c ? 2 : 0) | this.f51188e | (this.f51185b ? 1 : 0)));
                break;
            case 4:
                InterfaceC4810p interfaceC4810pA = f51183s.a(Integer.valueOf(this.f51189f));
                if (interfaceC4810pA == null) {
                    list.add(new A2.d(this.f51189f));
                    break;
                } else {
                    list.add(interfaceC4810pA);
                    break;
                }
            case 5:
                list.add(new androidx.media3.extractor.flv.b());
                break;
            case 6:
                list.add(new N2.e(this.f51199p, (this.f51198o ? 0 : 2) | this.f51190g));
                break;
            case 7:
                list.add(new O2.f((this.f51186c ? 2 : 0) | this.f51193j | (this.f51185b ? 1 : 0)));
                break;
            case 8:
                list.add(new P2.h(this.f51199p, this.f51192i | (this.f51198o ? 0 : 32)));
                list.add(new P2.m(this.f51199p, (this.f51198o ? 0 : 16) | this.f51191h));
                break;
            case 9:
                list.add(new Q2.d());
                break;
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                list.add(new b3.C());
                break;
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (this.f51196m == null) {
                    this.f51196m = AbstractC4009y.G();
                }
                list.add(new b3.K(this.f51194k, !this.f51198o ? 1 : 0, this.f51199p, new X1.E(0L), new C2221j(this.f51195l, this.f51196m), this.f51197n));
                break;
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                list.add(new C2310b());
                break;
            case 14:
                list.add(new D2.a(this.f51200q));
                break;
            case 15:
                InterfaceC4810p interfaceC4810pA2 = f51184t.a(new Object[0]);
                if (interfaceC4810pA2 != null) {
                    list.add(interfaceC4810pA2);
                    break;
                }
                break;
            case 16:
                list.add(new x2.b(!this.f51198o ? 1 : 0, this.f51199p));
                break;
            case 17:
                list.add(new R2.a());
                break;
            case 18:
                list.add(new C3040a());
                break;
            case 19:
                list.add(new C5168a());
                break;
            case 20:
                int i11 = this.f51191h;
                if ((i11 & 2) == 0 && (i11 & 4) == 0) {
                    list.add(new C2.a());
                    break;
                }
                break;
            case 21:
                list.add(new C5122a());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends InterfaceC4810p> k() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC4810p.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends InterfaceC4810p> l() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC4810p.class).getConstructor(null);
    }

    @Override // v2.u
    public synchronized InterfaceC4810p[] d() {
        return f(Uri.EMPTY, new HashMap());
    }

    @Override // v2.u
    public synchronized InterfaceC4810p[] f(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f51182r;
            arrayList = new ArrayList(iArr.length);
            int iB = U1.p.b(map);
            if (iB != -1) {
                i(iB, arrayList);
            }
            int iC = U1.p.c(uri);
            if (iC != -1 && iC != iB) {
                i(iC, arrayList);
            }
            for (int i10 : iArr) {
                if (i10 != iB && i10 != iC) {
                    i(i10, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC4810p[]) arrayList.toArray(new InterfaceC4810p[arrayList.size()]);
    }

    @Override // v2.u
    @Deprecated
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized C4806l e(boolean z10) {
        this.f51198o = z10;
        return this;
    }

    public synchronized C4806l m(int i10) {
        this.f51200q = i10;
        return this;
    }

    @Override // v2.u
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public synchronized C4806l a(r.a aVar) {
        this.f51199p = aVar;
        return this;
    }
}
