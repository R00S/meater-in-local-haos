package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576b;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;

/* compiled from: ErrorReporter.java */
/* renamed from: kotlin.f0.y.e.j0.j.b.r */
/* loaded from: classes3.dex */
public interface InterfaceC10308r {

    /* renamed from: a */
    public static final InterfaceC10308r f39954a = new a();

    /* compiled from: ErrorReporter.java */
    /* renamed from: kotlin.f0.y.e.j0.j.b.r$a */
    static class a implements InterfaceC10308r {
        a() {
        }

        /* renamed from: c */
        private static /* synthetic */ void m36472c(int i2) {
            Object[] objArr = new Object[3];
            if (i2 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i2 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10308r
        /* renamed from: a */
        public void mo36470a(InterfaceC10576b interfaceC10576b) {
            if (interfaceC10576b == null) {
                m36472c(2);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10308r
        /* renamed from: b */
        public void mo36471b(InterfaceC10585e interfaceC10585e, List<String> list) {
            if (interfaceC10585e == null) {
                m36472c(0);
            }
            if (list == null) {
                m36472c(1);
            }
        }
    }

    /* renamed from: a */
    void mo36470a(InterfaceC10576b interfaceC10576b);

    /* renamed from: b */
    void mo36471b(InterfaceC10585e interfaceC10585e, List<String> list);
}
