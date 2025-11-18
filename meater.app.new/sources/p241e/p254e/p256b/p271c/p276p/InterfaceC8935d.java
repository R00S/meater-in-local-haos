package p241e.p254e.p256b.p271c.p276p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p241e.p254e.p256b.p271c.p283v.C8943a;

/* compiled from: CircularRevealWidget.java */
/* renamed from: e.e.b.c.p.d */
/* loaded from: classes2.dex */
public interface InterfaceC8935d {

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: e.e.b.c.p.d$b */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: a */
        public static final TypeEvaluator<e> f34400a = new b();

        /* renamed from: b */
        private final e f34401b = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f2, e eVar, e eVar2) {
            this.f34401b.m28469a(C8943a.m28491c(eVar.f34404a, eVar2.f34404a, f2), C8943a.m28491c(eVar.f34405b, eVar2.f34405b, f2), C8943a.m28491c(eVar.f34406c, eVar2.f34406c, f2));
            return this.f34401b;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: e.e.b.c.p.d$c */
    public static class c extends Property<InterfaceC8935d, e> {

        /* renamed from: a */
        public static final Property<InterfaceC8935d, e> f34402a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(InterfaceC8935d interfaceC8935d) {
            return interfaceC8935d.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(InterfaceC8935d interfaceC8935d, e eVar) {
            interfaceC8935d.setRevealInfo(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: e.e.b.c.p.d$d */
    public static class d extends Property<InterfaceC8935d, Integer> {

        /* renamed from: a */
        public static final Property<InterfaceC8935d, Integer> f34403a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(InterfaceC8935d interfaceC8935d) {
            return Integer.valueOf(interfaceC8935d.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(InterfaceC8935d interfaceC8935d, Integer num) {
            interfaceC8935d.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: e.e.b.c.p.d$e */
    public static class e {

        /* renamed from: a */
        public float f34404a;

        /* renamed from: b */
        public float f34405b;

        /* renamed from: c */
        public float f34406c;

        /* renamed from: a */
        public void m28469a(float f2, float f3, float f4) {
            this.f34404a = f2;
            this.f34405b = f3;
            this.f34406c = f4;
        }

        private e() {
        }

        public e(float f2, float f3, float f4) {
            this.f34404a = f2;
            this.f34405b = f3;
            this.f34406c = f4;
        }
    }

    /* renamed from: a */
    void mo28462a();

    /* renamed from: b */
    void mo28463b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(e eVar);
}
