package cm.aptoide.p092pt.permission;

import java.util.List;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface PermissionProvider {

    public static class Permission {
        private final boolean granted;
        private final String name;
        private final int requestCode;

        public Permission(int i2, String str, boolean z) {
            this.requestCode = i2;
            this.name = str;
            this.granted = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Permission permission = (Permission) obj;
            if (this.requestCode != permission.requestCode) {
                return false;
            }
            return this.name.equals(permission.name);
        }

        public String getName() {
            return this.name;
        }

        public int getRequestCode() {
            return this.requestCode;
        }

        public int hashCode() {
            return (this.requestCode * 31) + this.name.hashCode();
        }

        public boolean isGranted() {
            return this.granted;
        }
    }

    C11234e<List<Permission>> permissionResults(int i2);

    void providePermissions(String[] strArr, int i2);
}
