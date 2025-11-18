package Db;

import Ra.InterfaceC1689b;
import Ra.InterfaceC1692e;
import java.util.List;

/* compiled from: ErrorReporter.java */
/* renamed from: Db.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC1016w {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC1016w f3734a = new a();

    /* compiled from: ErrorReporter.java */
    /* renamed from: Db.w$a */
    static class a implements InterfaceC1016w {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Db.InterfaceC1016w
        public void a(InterfaceC1692e interfaceC1692e, List<String> list) {
            if (interfaceC1692e == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }

        @Override // Db.InterfaceC1016w
        public void b(InterfaceC1689b interfaceC1689b) {
            if (interfaceC1689b == null) {
                c(2);
            }
        }
    }

    void a(InterfaceC1692e interfaceC1692e, List<String> list);

    void b(InterfaceC1689b interfaceC1689b);
}
