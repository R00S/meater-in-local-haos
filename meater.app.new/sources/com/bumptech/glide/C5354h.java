package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.AbstractC5393j;
import com.bumptech.glide.p141p.AbstractC5558a;
import com.bumptech.glide.p141p.C5559b;
import com.bumptech.glide.p141p.C5563f;
import com.bumptech.glide.p141p.C5565h;
import com.bumptech.glide.p141p.C5567j;
import com.bumptech.glide.p141p.C5568k;
import com.bumptech.glide.p141p.InterfaceC5561d;
import com.bumptech.glide.p141p.InterfaceC5562e;
import com.bumptech.glide.p141p.InterfaceC5564g;
import com.bumptech.glide.p141p.InterfaceFutureC5560c;
import com.bumptech.glide.p141p.p142l.InterfaceC5577i;
import com.bumptech.glide.p144q.C5584a;
import com.bumptech.glide.p145r.C5591e;
import com.bumptech.glide.p145r.C5596j;
import com.bumptech.glide.p145r.C5597k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: RequestBuilder.java */
/* renamed from: com.bumptech.glide.h */
/* loaded from: classes.dex */
public class C5354h<TranscodeType> extends AbstractC5558a<C5354h<TranscodeType>> implements Cloneable {

    /* renamed from: F */
    protected static final C5565h f13091F = new C5565h().m10898i(AbstractC5393j.f13396c).m10891b0(EnumC5353g.LOW).m10902k0(true);

    /* renamed from: G */
    private final Context f13092G;

    /* renamed from: H */
    private final C5355i f13093H;

    /* renamed from: I */
    private final Class<TranscodeType> f13094I;

    /* renamed from: J */
    private final ComponentCallbacks2C5349c f13095J;

    /* renamed from: K */
    private final C5351e f13096K;

    /* renamed from: L */
    private AbstractC5356j<?, ? super TranscodeType> f13097L;

    /* renamed from: M */
    private Object f13098M;

    /* renamed from: N */
    private List<InterfaceC5564g<TranscodeType>> f13099N;

    /* renamed from: O */
    private C5354h<TranscodeType> f13100O;

    /* renamed from: P */
    private C5354h<TranscodeType> f13101P;

    /* renamed from: Q */
    private Float f13102Q;

    /* renamed from: R */
    private boolean f13103R = true;

    /* renamed from: S */
    private boolean f13104S;

    /* renamed from: T */
    private boolean f13105T;

    /* compiled from: RequestBuilder.java */
    /* renamed from: com.bumptech.glide.h$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13106a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13107b;

        static {
            int[] iArr = new int[EnumC5353g.values().length];
            f13107b = iArr;
            try {
                iArr[EnumC5353g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13107b[EnumC5353g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13107b[EnumC5353g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13107b[EnumC5353g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f13106a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13106a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13106a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13106a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13106a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13106a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13106a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13106a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected C5354h(ComponentCallbacks2C5349c componentCallbacks2C5349c, C5355i c5355i, Class<TranscodeType> cls, Context context) {
        this.f13095J = componentCallbacks2C5349c;
        this.f13093H = c5355i;
        this.f13094I = cls;
        this.f13092G = context;
        this.f13097L = c5355i.m10039h(cls);
        this.f13096K = componentCallbacks2C5349c.m9985i();
        m10014z0(c5355i.m10037f());
        mo10026b(c5355i.m10038g());
    }

    /* renamed from: B0 */
    private <Y extends InterfaceC5577i<TranscodeType>> Y m10006B0(Y y, InterfaceC5564g<TranscodeType> interfaceC5564g, AbstractC5558a<?> abstractC5558a, Executor executor) {
        C5596j.m11042d(y);
        if (!this.f13104S) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        InterfaceC5561d interfaceC5561dM10010u0 = m10010u0(y, interfaceC5564g, abstractC5558a, executor);
        InterfaceC5561d request = y.getRequest();
        if (!interfaceC5561dM10010u0.mo10930e(request) || m10007E0(abstractC5558a, request)) {
            this.f13093H.m10036e(y);
            y.setRequest(interfaceC5561dM10010u0);
            this.f13093H.m10046o(y, interfaceC5561dM10010u0);
            return y;
        }
        interfaceC5561dM10010u0.mo10928c();
        if (!((InterfaceC5561d) C5596j.m11042d(request)).isRunning()) {
            request.mo10929d();
        }
        return y;
    }

    /* renamed from: E0 */
    private boolean m10007E0(AbstractC5558a<?> abstractC5558a, InterfaceC5561d interfaceC5561d) {
        return !abstractC5558a.m10876H() && interfaceC5561d.mo10937l();
    }

    /* renamed from: L0 */
    private C5354h<TranscodeType> m10008L0(Object obj) {
        this.f13098M = obj;
        this.f13104S = true;
        return this;
    }

    /* renamed from: N0 */
    private InterfaceC5561d m10009N0(InterfaceC5577i<TranscodeType> interfaceC5577i, InterfaceC5564g<TranscodeType> interfaceC5564g, AbstractC5558a<?> abstractC5558a, InterfaceC5562e interfaceC5562e, AbstractC5356j<?, ? super TranscodeType> abstractC5356j, EnumC5353g enumC5353g, int i2, int i3, Executor executor) {
        Context context = this.f13092G;
        C5351e c5351e = this.f13096K;
        return C5567j.m10950B(context, c5351e, this.f13098M, this.f13094I, abstractC5558a, i2, i3, enumC5353g, interfaceC5577i, interfaceC5564g, this.f13099N, interfaceC5562e, c5351e.m10002f(), abstractC5356j.m10051d(), executor);
    }

    /* renamed from: u0 */
    private InterfaceC5561d m10010u0(InterfaceC5577i<TranscodeType> interfaceC5577i, InterfaceC5564g<TranscodeType> interfaceC5564g, AbstractC5558a<?> abstractC5558a, Executor executor) {
        return m10011v0(interfaceC5577i, interfaceC5564g, null, this.f13097L, abstractC5558a.m10920w(), abstractC5558a.m10917t(), abstractC5558a.m10916s(), abstractC5558a, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v0 */
    private InterfaceC5561d m10011v0(InterfaceC5577i<TranscodeType> interfaceC5577i, InterfaceC5564g<TranscodeType> interfaceC5564g, InterfaceC5562e interfaceC5562e, AbstractC5356j<?, ? super TranscodeType> abstractC5356j, EnumC5353g enumC5353g, int i2, int i3, AbstractC5558a<?> abstractC5558a, Executor executor) {
        InterfaceC5562e interfaceC5562e2;
        InterfaceC5562e c5559b;
        if (this.f13101P != null) {
            c5559b = new C5559b(interfaceC5562e);
            interfaceC5562e2 = c5559b;
        } else {
            interfaceC5562e2 = null;
            c5559b = interfaceC5562e;
        }
        InterfaceC5561d interfaceC5561dM10012w0 = m10012w0(interfaceC5577i, interfaceC5564g, c5559b, abstractC5356j, enumC5353g, i2, i3, abstractC5558a, executor);
        if (interfaceC5562e2 == null) {
            return interfaceC5561dM10012w0;
        }
        int iM10917t = this.f13101P.m10917t();
        int iM10916s = this.f13101P.m10916s();
        if (C5597k.m11063t(i2, i3) && !this.f13101P.m10882P()) {
            iM10917t = abstractC5558a.m10917t();
            iM10916s = abstractC5558a.m10916s();
        }
        C5354h<TranscodeType> c5354h = this.f13101P;
        C5559b c5559b2 = interfaceC5562e2;
        c5559b2.m10939s(interfaceC5561dM10012w0, c5354h.m10011v0(interfaceC5577i, interfaceC5564g, interfaceC5562e2, c5354h.f13097L, c5354h.m10920w(), iM10917t, iM10916s, this.f13101P, executor));
        return c5559b2;
    }

    /* renamed from: w0 */
    private InterfaceC5561d m10012w0(InterfaceC5577i<TranscodeType> interfaceC5577i, InterfaceC5564g<TranscodeType> interfaceC5564g, InterfaceC5562e interfaceC5562e, AbstractC5356j<?, ? super TranscodeType> abstractC5356j, EnumC5353g enumC5353g, int i2, int i3, AbstractC5558a<?> abstractC5558a, Executor executor) {
        C5354h<TranscodeType> c5354h = this.f13100O;
        if (c5354h == null) {
            if (this.f13102Q == null) {
                return m10009N0(interfaceC5577i, interfaceC5564g, abstractC5558a, interfaceC5562e, abstractC5356j, enumC5353g, i2, i3, executor);
            }
            C5568k c5568k = new C5568k(interfaceC5562e);
            c5568k.m10976r(m10009N0(interfaceC5577i, interfaceC5564g, abstractC5558a, c5568k, abstractC5356j, enumC5353g, i2, i3, executor), m10009N0(interfaceC5577i, interfaceC5564g, abstractC5558a.clone().m10900j0(this.f13102Q.floatValue()), c5568k, abstractC5356j, m10013y0(enumC5353g), i2, i3, executor));
            return c5568k;
        }
        if (this.f13105T) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        AbstractC5356j<?, ? super TranscodeType> abstractC5356j2 = c5354h.f13103R ? abstractC5356j : c5354h.f13097L;
        EnumC5353g enumC5353gM10920w = c5354h.m10877I() ? this.f13100O.m10920w() : m10013y0(enumC5353g);
        int iM10917t = this.f13100O.m10917t();
        int iM10916s = this.f13100O.m10916s();
        if (C5597k.m11063t(i2, i3) && !this.f13100O.m10882P()) {
            iM10917t = abstractC5558a.m10917t();
            iM10916s = abstractC5558a.m10916s();
        }
        int i4 = iM10917t;
        int i5 = iM10916s;
        C5568k c5568k2 = new C5568k(interfaceC5562e);
        InterfaceC5561d interfaceC5561dM10009N0 = m10009N0(interfaceC5577i, interfaceC5564g, abstractC5558a, c5568k2, abstractC5356j, enumC5353g, i2, i3, executor);
        this.f13105T = true;
        C5354h c5354h2 = (C5354h<TranscodeType>) this.f13100O;
        InterfaceC5561d interfaceC5561dM10011v0 = c5354h2.m10011v0(interfaceC5577i, interfaceC5564g, c5568k2, abstractC5356j2, enumC5353gM10920w, i4, i5, c5354h2, executor);
        this.f13105T = false;
        c5568k2.m10976r(interfaceC5561dM10009N0, interfaceC5561dM10011v0);
        return c5568k2;
    }

    /* renamed from: y0 */
    private EnumC5353g m10013y0(EnumC5353g enumC5353g) {
        int i2 = a.f13107b[enumC5353g.ordinal()];
        if (i2 == 1) {
            return EnumC5353g.NORMAL;
        }
        if (i2 == 2) {
            return EnumC5353g.HIGH;
        }
        if (i2 == 3 || i2 == 4) {
            return EnumC5353g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + m10920w());
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: z0 */
    private void m10014z0(List<InterfaceC5564g<Object>> list) {
        Iterator<InterfaceC5564g<Object>> it = list.iterator();
        while (it.hasNext()) {
            m10028s0((InterfaceC5564g) it.next());
        }
    }

    /* renamed from: A0 */
    public <Y extends InterfaceC5577i<TranscodeType>> Y m10015A0(Y y) {
        return (Y) m10016C0(y, null, C5591e.m11026b());
    }

    /* renamed from: C0 */
    <Y extends InterfaceC5577i<TranscodeType>> Y m10016C0(Y y, InterfaceC5564g<TranscodeType> interfaceC5564g, Executor executor) {
        return (Y) m10006B0(y, interfaceC5564g, this, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: D0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bumptech.glide.p141p.p142l.AbstractC5578j<android.widget.ImageView, TranscodeType> m10017D0(android.widget.ImageView r4) {
        /*
            r3 = this;
            com.bumptech.glide.p145r.C5597k.m11045b()
            com.bumptech.glide.p145r.C5596j.m11042d(r4)
            boolean r0 = r3.m10881O()
            if (r0 != 0) goto L4c
            boolean r0 = r3.m10879M()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.C5354h.a.f13106a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            com.bumptech.glide.p.a r0 = r3.clone()
            com.bumptech.glide.p.a r0 = r0.m10885S()
            goto L4d
        L31:
            com.bumptech.glide.p.a r0 = r3.clone()
            com.bumptech.glide.p.a r0 = r0.m10886T()
            goto L4d
        L3a:
            com.bumptech.glide.p.a r0 = r3.clone()
            com.bumptech.glide.p.a r0 = r0.m10885S()
            goto L4d
        L43:
            com.bumptech.glide.p.a r0 = r3.clone()
            com.bumptech.glide.p.a r0 = r0.m10884R()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.e r1 = r3.f13096K
            java.lang.Class<TranscodeType> r2 = r3.f13094I
            com.bumptech.glide.p.l.j r4 = r1.m9997a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = com.bumptech.glide.p145r.C5591e.m11026b()
            com.bumptech.glide.p.l.i r4 = r3.m10006B0(r4, r1, r0, r2)
            com.bumptech.glide.p.l.j r4 = (com.bumptech.glide.p141p.p142l.AbstractC5578j) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C5354h.m10017D0(android.widget.ImageView):com.bumptech.glide.p.l.j");
    }

    /* renamed from: F0 */
    public C5354h<TranscodeType> m10018F0(InterfaceC5564g<TranscodeType> interfaceC5564g) {
        this.f13099N = null;
        return m10028s0(interfaceC5564g);
    }

    /* renamed from: G0 */
    public C5354h<TranscodeType> m10019G0(Uri uri) {
        return m10008L0(uri);
    }

    /* renamed from: H0 */
    public C5354h<TranscodeType> m10020H0(Integer num) {
        return m10008L0(num).mo10026b(C5565h.m10946v0(C5584a.m11011c(this.f13092G)));
    }

    /* renamed from: I0 */
    public C5354h<TranscodeType> m10021I0(Object obj) {
        return m10008L0(obj);
    }

    /* renamed from: K0 */
    public C5354h<TranscodeType> m10022K0(String str) {
        return m10008L0(str);
    }

    /* renamed from: O0 */
    public InterfaceFutureC5560c<TranscodeType> m10023O0() {
        return m10024P0(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: P0 */
    public InterfaceFutureC5560c<TranscodeType> m10024P0(int i2, int i3) {
        C5563f c5563f = new C5563f(i2, i3);
        return (InterfaceFutureC5560c) m10016C0(c5563f, c5563f, C5591e.m11025a());
    }

    /* renamed from: Q0 */
    public C5354h<TranscodeType> m10025Q0(AbstractC5356j<?, ? super TranscodeType> abstractC5356j) {
        this.f13097L = (AbstractC5356j) C5596j.m11042d(abstractC5356j);
        this.f13103R = false;
        return this;
    }

    /* renamed from: s0 */
    public C5354h<TranscodeType> m10028s0(InterfaceC5564g<TranscodeType> interfaceC5564g) {
        if (interfaceC5564g != null) {
            if (this.f13099N == null) {
                this.f13099N = new ArrayList();
            }
            this.f13099N.add(interfaceC5564g);
        }
        return this;
    }

    @Override // com.bumptech.glide.p141p.AbstractC5558a
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public C5354h<TranscodeType> mo10026b(AbstractC5558a<?> abstractC5558a) {
        C5596j.m11042d(abstractC5558a);
        return (C5354h) super.mo10026b(abstractC5558a);
    }

    @Override // com.bumptech.glide.p141p.AbstractC5558a
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public C5354h<TranscodeType> clone() {
        C5354h<TranscodeType> c5354h = (C5354h) super.clone();
        c5354h.f13097L = c5354h.f13097L.clone();
        return c5354h;
    }
}
