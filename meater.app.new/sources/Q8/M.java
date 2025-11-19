package Q8;

import com.google.auto.value.AutoValue;

/* compiled from: InstallIdProvider.java */
/* loaded from: classes2.dex */
public interface M {

    /* compiled from: InstallIdProvider.java */
    @AutoValue
    public static abstract class a {
        static a a(String str, FirebaseInstallationId k10) {
            return new C1616d(str, k10.getFid(), k10.getAuthToken());
        }

        public static a b(String str) {
            return new C1616d(str, null, null);
        }

        public abstract String c();

        public abstract String d();

        public abstract String e();
    }

    a a();
}
