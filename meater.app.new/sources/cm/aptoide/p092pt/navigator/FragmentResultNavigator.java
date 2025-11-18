package cm.aptoide.p092pt.navigator;

import android.os.Bundle;
import androidx.fragment.app.AbstractC0485u;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Map;
import p241e.p294g.p306b.C8986a;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class FragmentResultNavigator implements FragmentNavigator {
    private final int containerId;
    private final int enterAnimation;
    private final int exitAnimation;
    private final FragmentManager fragmentManager;
    private final C8986a<Map<Integer, Result>> resultRelay;
    private final Map<Integer, Result> results;

    public FragmentResultNavigator(FragmentManager fragmentManager, int i2, int i3, int i4, Map<Integer, Result> map, C8986a<Map<Integer, Result>> c8986a) {
        this.fragmentManager = fragmentManager;
        this.containerId = i2;
        this.enterAnimation = i3;
        this.exitAnimation = i4;
        this.results = map;
        this.resultRelay = c8986a;
    }

    private void handleNavigationResult(Result result) {
        this.results.put(Integer.valueOf(result.getRequestCode()), result);
        this.resultRelay.call(this.results);
    }

    static /* synthetic */ Result lambda$results$1(int i2, Map map) {
        return (Result) map.get(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$results$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8287a(int i2, Result result) {
        this.results.remove(Integer.valueOf(i2));
    }

    private void setUpNavigationForResult(Fragment fragment, int i2) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt(FragmentNavigator.REQUEST_CODE_EXTRA, i2);
        fragment.setArguments(arguments);
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public void cleanBackStack() {
        for (int i2 = 0; i2 < this.fragmentManager.m3498o0(); i2++) {
            this.fragmentManager.m3467X0();
        }
        this.fragmentManager.m3478f0();
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public int getBackStackEntryCount() {
        return this.fragmentManager.m3498o0();
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public Fragment getFragment() {
        return this.fragmentManager.m3485i0(this.containerId);
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public String getTagByBackStackEntry(int i2) {
        return this.fragmentManager.m3495n0(i2).getName();
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public void navigateForResult(Fragment fragment, int i2, boolean z) {
        setUpNavigationForResult(fragment, i2);
        navigateTo(fragment, z);
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public String navigateTo(Fragment fragment, boolean z) {
        String string = Integer.toString(this.fragmentManager.m3498o0());
        AbstractC0485u abstractC0485uM3493m = this.fragmentManager.m3493m();
        int i2 = this.enterAnimation;
        int i3 = this.exitAnimation;
        AbstractC0485u abstractC0485uM3739g = abstractC0485uM3493m.m3744s(i2, i3, i2, i3).m3739g(string);
        (z ? abstractC0485uM3739g.m3743r(this.containerId, fragment, string) : abstractC0485uM3739g.m3735c(this.containerId, fragment, string)).mo3548i();
        return string;
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public void navigateToCleaningBackStack(Fragment fragment, boolean z) {
        cleanBackStack();
        navigateToWithoutBackSave(fragment, z);
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public void navigateToDialogForResult(DialogInterfaceOnCancelListenerC0466c dialogInterfaceOnCancelListenerC0466c, int i2) {
        setUpNavigationForResult(dialogInterfaceOnCancelListenerC0466c, i2);
        navigateToDialogFragment(dialogInterfaceOnCancelListenerC0466c);
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public void navigateToDialogFragment(DialogInterfaceOnCancelListenerC0466c dialogInterfaceOnCancelListenerC0466c) {
        dialogInterfaceOnCancelListenerC0466c.show(this.fragmentManager, Integer.toString(this.fragmentManager.m3498o0()));
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public void navigateToWithoutBackSave(Fragment fragment, boolean z) {
        AbstractC0485u abstractC0485uM3493m = this.fragmentManager.m3493m();
        int i2 = this.enterAnimation;
        int i3 = this.exitAnimation;
        AbstractC0485u abstractC0485uM3744s = abstractC0485uM3493m.m3744s(i2, i3, i2, i3);
        (z ? abstractC0485uM3744s.m3742q(this.containerId, fragment) : abstractC0485uM3744s.m3734b(this.containerId, fragment)).mo3548i();
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public Fragment peekLast() {
        if (this.fragmentManager.m3498o0() <= 0) {
            return null;
        }
        return this.fragmentManager.m3488j0(this.fragmentManager.m3495n0(r0.m3498o0() - 1).getName());
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public boolean popBackStack() {
        return this.fragmentManager.m3471a1();
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public void popBackStackUntil(String str) {
        this.fragmentManager.m3470Z0(str, 1);
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public void popDialogWithResult(Result result) {
        handleNavigationResult(result);
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public void popWithResult(Result result) {
        handleNavigationResult(result);
        popBackStack();
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public C11234e<Result> results(final int i2) {
        return this.resultRelay.m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.navigator.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Map) obj).containsKey(Integer.valueOf(i2)));
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.navigator.e
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return FragmentResultNavigator.lambda$results$1(i2, (Map) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.navigator.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10298f.m8287a(i2, (Result) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.navigator.FragmentNavigator
    public Fragment getFragment(String str) {
        return this.fragmentManager.m3488j0(str);
    }
}
