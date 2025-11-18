package androidx.work;

import android.os.Build;
import androidx.work.AbstractC0819z;

/* compiled from: OneTimeWorkRequest.java */
/* renamed from: androidx.work.p */
/* loaded from: classes.dex */
public final class C0809p extends AbstractC0819z {

    /* compiled from: OneTimeWorkRequest.java */
    /* renamed from: androidx.work.p$a */
    public static final class a extends AbstractC0819z.a<a, C0809p> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f5008c.f4802f = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.AbstractC0819z.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C0809p mo5230c() {
            if (this.f5006a && Build.VERSION.SDK_INT >= 23 && this.f5008c.f4808l.m4806h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new C0809p(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.AbstractC0819z.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a mo5231d() {
            return this;
        }
    }

    C0809p(a aVar) {
        super(aVar.f5007b, aVar.f5008c, aVar.f5009d);
    }

    /* renamed from: d */
    public static C0809p m5229d(Class<? extends ListenableWorker> cls) {
        return new a(cls).m5246b();
    }
}
