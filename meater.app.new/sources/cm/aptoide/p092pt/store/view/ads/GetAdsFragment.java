package cm.aptoide.p092pt.store.view.ads;

import android.os.Bundle;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.ads.AdsRepository;
import cm.aptoide.p092pt.ads.MinimalAd;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import cm.aptoide.p092pt.view.recycler.displayable.DisplayableGroup;
import cm.aptoide.p092pt.view.recycler.displayable.GridAdDisplayable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class GetAdsFragment extends StoreTabGridRecyclerFragment {
    private AdsRepository adsRepository;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$buildDisplayables$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ List m8827f(List list) {
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(new GridAdDisplayable((MinimalAd) it.next(), this.tag, this.navigationTracker));
        }
        return Collections.singletonList(new DisplayableGroup(linkedList, (WindowManager) getContext().getSystemService("window"), getContext().getResources()));
    }

    public static Fragment newInstance() {
        return new GetAdsFragment();
    }

    @Override // cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment
    protected C11234e<List<Displayable>> buildDisplayables(boolean z, String str, boolean z2) {
        return this.adsRepository.getAdsFromHomepageMore(z).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.view.ads.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f11310f.m8827f((List) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment, cm.aptoide.p092pt.view.fragment.AptoideBaseFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.adsRepository = ((AptoideApplication) getContext().getApplicationContext()).getAdsRepository();
    }
}
