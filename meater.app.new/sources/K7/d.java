package K7;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes2.dex */
public interface d {

    /* compiled from: CircularRevealWidget.java */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f8723b = new b();

        /* renamed from: a, reason: collision with root package name */
        private final e f8724a = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, e eVar, e eVar2) {
            this.f8724a.a(Q7.a.c(eVar.f8727a, eVar2.f8727a, f10), Q7.a.c(eVar.f8728b, eVar2.f8728b, f10), Q7.a.c(eVar.f8729c, eVar2.f8729c, f10));
            return this.f8724a;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class c extends Property<d, e> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<d, e> f8725a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: K7.d$d, reason: collision with other inner class name */
    public static class C0173d extends Property<d, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Property<d, Integer> f8726a = new C0173d("circularRevealScrimColor");

        private C0173d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public float f8727a;

        /* renamed from: b, reason: collision with root package name */
        public float f8728b;

        /* renamed from: c, reason: collision with root package name */
        public float f8729c;

        public void a(float f10, float f11, float f12) {
            this.f8727a = f10;
            this.f8728b = f11;
            this.f8729c = f12;
        }

        private e() {
        }

        public e(float f10, float f11, float f12) {
            this.f8727a = f10;
            this.f8728b = f11;
            this.f8729c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
