package cm.aptoide.p092pt.presenter;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class CompositePresenter implements Presenter {
    private final List<Presenter> presenters;

    public CompositePresenter(List<Presenter> list) {
        this.presenters = list;
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        Iterator<Presenter> it = this.presenters.iterator();
        while (it.hasNext()) {
            it.next().present();
        }
    }
}
