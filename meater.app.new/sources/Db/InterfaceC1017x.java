package Db;

import Hb.AbstractC1082f0;
import kotlin.jvm.internal.C3862t;
import lb.C3937q;

/* compiled from: FlexibleTypeDeserializer.kt */
/* renamed from: Db.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1017x {

    /* compiled from: FlexibleTypeDeserializer.kt */
    /* renamed from: Db.x$a */
    public static final class a implements InterfaceC1017x {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3735a = new a();

        private a() {
        }

        @Override // Db.InterfaceC1017x
        public Hb.U a(C3937q proto, String flexibleId, AbstractC1082f0 lowerBound, AbstractC1082f0 upperBound) {
            C3862t.g(proto, "proto");
            C3862t.g(flexibleId, "flexibleId");
            C3862t.g(lowerBound, "lowerBound");
            C3862t.g(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    Hb.U a(C3937q c3937q, String str, AbstractC1082f0 abstractC1082f0, AbstractC1082f0 abstractC1082f02);
}
