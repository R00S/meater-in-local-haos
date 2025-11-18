package cm.aptoide.p092pt.store.view;

import android.os.Bundle;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2229V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless;
import cm.aptoide.p092pt.view.recycler.EndlessRecyclerOnScrollListener;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import java.util.List;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;

/* loaded from: classes.dex */
public abstract class GetStoreEndlessFragment<T extends BaseV7EndlessResponse> extends StoreTabWidgetsGridRecyclerFragment {
    protected EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    private AbstractC2229V7<T, ? extends Endless> v7request;

    private void setupEndless(AbstractC2229V7<T, ? extends Endless> abstractC2229V7, InterfaceC11253b<T> interfaceC11253b, boolean z) {
        getRecyclerView().clearOnScrollListeners();
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener = this.endlessRecyclerOnScrollListener;
        if (endlessRecyclerOnScrollListener != null) {
            endlessRecyclerOnScrollListener.stopLoading();
        }
        this.endlessRecyclerOnScrollListener = new EndlessRecyclerOnScrollListener(getAdapter(), abstractC2229V7, interfaceC11253b, getErrorRequestListener());
        getRecyclerView().addOnScrollListener(this.endlessRecyclerOnScrollListener);
        this.endlessRecyclerOnScrollListener.onLoadMore(z, z);
    }

    protected abstract InterfaceC11253b<T> buildAction();

    @Override // cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment
    protected C11234e<List<Displayable>> buildDisplayables(boolean z, String str, boolean z2) {
        AbstractC2229V7<T, ? extends Endless> abstractC2229V7BuildRequest = buildRequest(z, str);
        this.v7request = abstractC2229V7BuildRequest;
        setupEndless(abstractC2229V7BuildRequest, buildAction(), z);
        return null;
    }

    protected abstract AbstractC2229V7<T, ? extends Endless> buildRequest(boolean z, String str);

    protected ErrorRequestListener getErrorRequestListener() {
        return new ErrorRequestListener() { // from class: cm.aptoide.pt.store.view.b0
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                this.f11312a.finishLoading(th);
            }
        };
    }

    @Override // cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment, cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.LoadInterface
    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        if (z) {
            return;
        }
        setupEndless(this.v7request, buildAction(), z2);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8767d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener = this.endlessRecyclerOnScrollListener;
        if (endlessRecyclerOnScrollListener != null) {
            endlessRecyclerOnScrollListener.stopLoading();
            this.endlessRecyclerOnScrollListener = null;
        }
        super.onDestroyView();
    }
}
