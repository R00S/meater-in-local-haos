package cm.aptoide.p092pt.permission;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.core.app.C0237a;
import androidx.core.content.C0255a;
import cm.aptoide.p092pt.permission.PermissionProvider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p241e.p294g.p306b.C8988c;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;

/* loaded from: classes.dex */
public abstract class PermissionProviderActivity extends PermissionServiceActivity implements PermissionProvider {
    private C8988c<Set<PermissionProvider.Permission>> permissionRelay;
    private SparseArray<Set<PermissionProvider.Permission>> requestedCodeGrantedPermissions;

    static /* synthetic */ Set lambda$permissionResults$0(Set set, Set set2) {
        set.addAll(set2);
        return set;
    }

    static /* synthetic */ Iterable lambda$permissionResults$1(Set set) {
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$permissionResults$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m8390a(final int i2, Set set) {
        return C11234e.m40040d1(C11234e.m40025S(set), C11234e.m40025S(this.requestedCodeGrantedPermissions.get(i2)), new InterfaceC11257f() { // from class: cm.aptoide.pt.permission.e
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                Set set2 = (Set) obj;
                PermissionProviderActivity.lambda$permissionResults$0(set2, (Set) obj2);
                return set2;
            }
        }).m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.permission.c
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                Set set2 = (Set) obj;
                PermissionProviderActivity.lambda$permissionResults$1(set2);
                return set2;
            }
        }).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.permission.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(i2 == ((PermissionProvider.Permission) obj).getRequestCode());
            }
        }).m40084Y0().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.permission.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                return Boolean.valueOf(!list.isEmpty());
            }
        });
    }

    @Override // cm.aptoide.p092pt.permission.PermissionServiceActivity, cm.aptoide.p092pt.navigator.ActivityResultNavigator, cm.aptoide.p092pt.view.BaseActivity, com.trello.rxlifecycle.p235h.p236a.AbstractActivityC8764a, androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.permissionRelay = C8988c.m28593f1();
        this.requestedCodeGrantedPermissions = new SparseArray<>();
    }

    @Override // cm.aptoide.p092pt.permission.PermissionServiceActivity, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            hashSet.add(new PermissionProvider.Permission(i2, strArr[i3], iArr[i3] == 0));
        }
        this.permissionRelay.call(hashSet);
    }

    @Override // cm.aptoide.p092pt.permission.PermissionProvider
    public C11234e<List<PermissionProvider.Permission>> permissionResults(final int i2) {
        return this.permissionRelay.m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.permission.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10509f.m8390a(i2, (Set) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.permission.PermissionProvider
    public void providePermissions(String[] strArr, int i2) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        this.requestedCodeGrantedPermissions.clear();
        for (String str : strArr) {
            if (C0255a.m1672a(this, str) == 0) {
                hashSet.add(new PermissionProvider.Permission(i2, str, true));
            } else {
                arrayList.add(str);
            }
        }
        this.requestedCodeGrantedPermissions.put(i2, hashSet);
        if (arrayList.isEmpty()) {
            this.permissionRelay.call(hashSet);
        } else {
            C0237a.m1525q(this, (String[]) arrayList.toArray(new String[0]), i2);
        }
    }
}
