package com.airbnb.lottie.p112s.p114j;

import android.graphics.Paint;
import com.airbnb.lottie.C5182f;
import com.airbnb.lottie.p108q.p109a.C5209q;
import com.airbnb.lottie.p108q.p109a.InterfaceC5194b;
import com.airbnb.lottie.p112s.p113i.C5237a;
import com.airbnb.lottie.p112s.p113i.C5238b;
import com.airbnb.lottie.p112s.p113i.C5240d;
import com.airbnb.lottie.p112s.p115k.AbstractC5268a;
import java.util.List;

/* compiled from: ShapeStroke.java */
/* renamed from: com.airbnb.lottie.s.j.p */
/* loaded from: classes.dex */
public class C5266p implements InterfaceC5252b {

    /* renamed from: a */
    private final String f12772a;

    /* renamed from: b */
    private final C5238b f12773b;

    /* renamed from: c */
    private final List<C5238b> f12774c;

    /* renamed from: d */
    private final C5237a f12775d;

    /* renamed from: e */
    private final C5240d f12776e;

    /* renamed from: f */
    private final C5238b f12777f;

    /* renamed from: g */
    private final b f12778g;

    /* renamed from: h */
    private final c f12779h;

    /* renamed from: i */
    private final float f12780i;

    /* compiled from: ShapeStroke.java */
    /* renamed from: com.airbnb.lottie.s.j.p$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12781a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12782b;

        static {
            int[] iArr = new int[c.values().length];
            f12782b = iArr;
            try {
                iArr[c.Bevel.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12782b[c.Miter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12782b[c.Round.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f12781a = iArr2;
            try {
                iArr2[b.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12781a[b.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12781a[b.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    /* renamed from: com.airbnb.lottie.s.j.p$b */
    public enum b {
        Butt,
        Round,
        Unknown;

        /* renamed from: g */
        public Paint.Cap m9701g() {
            int i2 = a.f12781a[ordinal()];
            return i2 != 1 ? i2 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* compiled from: ShapeStroke.java */
    /* renamed from: com.airbnb.lottie.s.j.p$c */
    public enum c {
        Miter,
        Round,
        Bevel;

        /* renamed from: g */
        public Paint.Join m9702g() {
            int i2 = a.f12782b[ordinal()];
            if (i2 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i2 == 2) {
                return Paint.Join.MITER;
            }
            if (i2 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public C5266p(String str, C5238b c5238b, List<C5238b> list, C5237a c5237a, C5240d c5240d, C5238b c5238b2, b bVar, c cVar, float f2) {
        this.f12772a = str;
        this.f12773b = c5238b;
        this.f12774c = list;
        this.f12775d = c5237a;
        this.f12776e = c5240d;
        this.f12777f = c5238b2;
        this.f12778g = bVar;
        this.f12779h = cVar;
        this.f12780i = f2;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5252b
    /* renamed from: a */
    public InterfaceC5194b mo9619a(C5182f c5182f, AbstractC5268a abstractC5268a) {
        return new C5209q(c5182f, abstractC5268a, this);
    }

    /* renamed from: b */
    public b m9692b() {
        return this.f12778g;
    }

    /* renamed from: c */
    public C5237a m9693c() {
        return this.f12775d;
    }

    /* renamed from: d */
    public C5238b m9694d() {
        return this.f12773b;
    }

    /* renamed from: e */
    public c m9695e() {
        return this.f12779h;
    }

    /* renamed from: f */
    public List<C5238b> m9696f() {
        return this.f12774c;
    }

    /* renamed from: g */
    public float m9697g() {
        return this.f12780i;
    }

    /* renamed from: h */
    public String m9698h() {
        return this.f12772a;
    }

    /* renamed from: i */
    public C5240d m9699i() {
        return this.f12776e;
    }

    /* renamed from: j */
    public C5238b m9700j() {
        return this.f12777f;
    }
}
