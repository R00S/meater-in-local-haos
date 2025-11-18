package cm.aptoide.p092pt.view.recycler.widget;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.recycler.displayable.MessageWhiteBgDisplayable;

/* loaded from: classes.dex */
public class MessageWhiteBgWidget extends Widget<MessageWhiteBgDisplayable> {
    private TextView message;

    public MessageWhiteBgWidget(View view) {
        super(view);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    protected void assignViews(View view) {
        this.message = (TextView) view.findViewById(C1146R.id.message);
    }

    @Override // cm.aptoide.p092pt.view.recycler.widget.Widget
    public void bindView(MessageWhiteBgDisplayable messageWhiteBgDisplayable, int i2) {
        String message = messageWhiteBgDisplayable.getMessage();
        if (TextUtils.isEmpty(message)) {
            this.message.setVisibility(8);
        } else {
            this.message.setText(message);
        }
    }
}
