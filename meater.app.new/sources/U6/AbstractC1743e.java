package U6;

import U6.C1739a;
import com.google.auto.value.AutoValue;

/* compiled from: EventStoreConfig.java */
@AutoValue
/* renamed from: U6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1743e {

    /* renamed from: a, reason: collision with root package name */
    static final AbstractC1743e f17615a = a().f(10485760).d(200).b(10000).c(604800000).e(81920).a();

    /* compiled from: EventStoreConfig.java */
    @AutoValue.Builder
    /* renamed from: U6.e$a */
    static abstract class a {
        a() {
        }

        abstract AbstractC1743e a();

        abstract a b(int i10);

        abstract a c(long j10);

        abstract a d(int i10);

        abstract a e(int i10);

        abstract a f(long j10);
    }

    AbstractC1743e() {
    }

    static a a() {
        return new C1739a.b();
    }

    abstract int b();

    abstract long c();

    abstract int d();

    abstract int e();

    abstract long f();
}
