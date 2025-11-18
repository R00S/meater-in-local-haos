package cm.aptoide.p092pt.view.recycler.widget;

import android.view.View;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.recycler.displayable.FooterRowDisplayable;

/* loaded from: classes.dex */
public class FooterRowWidget extends Widget<FooterRowDisplayable> {
    private TextView title;

    public FooterRowWidget(View view) {
        super(view);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.title = (TextView) view.findViewById(C1146R.id.title);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(FooterRowDisplayable footerRowDisplayable, int i2) {
        this.title.setText(footerRowDisplayable.getPojo());
        this.title.setVisibility(0);
    }
}
