package androidx.work;

import android.os.Build;
import androidx.work.AbstractC0819z;
import java.util.concurrent.TimeUnit;

/* compiled from: PeriodicWorkRequest.java */
/* renamed from: androidx.work.s */
/* loaded from: classes.dex */
public final class C0812s extends AbstractC0819z {

    /* compiled from: PeriodicWorkRequest.java */
    /* renamed from: androidx.work.s$a */
    public static final class a extends AbstractC0819z.a<a, C0812s> {
        public a(Class<? extends ListenableWorker> cls, long j2, TimeUnit timeUnit) {
            super(cls);
            this.f5008c.m5094e(timeUnit.toMillis(j2));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.AbstractC0819z.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C0812s mo5230c() {
            if (this.f5006a && Build.VERSION.SDK_INT >= 23 && this.f5008c.f4808l.m4806h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (this.f5008c.f4815s) {
                throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
            }
            return new C0812s(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.work.AbstractC0819z.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a mo5231d() {
            return this;
        }
    }

    C0812s(a aVar) {
        super(aVar.f5007b, aVar.f5008c, aVar.f5009d);
    }
}
