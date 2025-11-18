package cm.aptoide.p092pt.view.recycler.displayable;

import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;

/* loaded from: classes.dex */
public class MessageWhiteBgDisplayable extends Displayable {
    private String message;

    public MessageWhiteBgDisplayable() {
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    protected Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public String getMessage() {
        return this.message;
    }

    @Override // cm.aptoide.p092pt.view.recycler.displayable.Displayable
    public int getViewLayout() {
        return C1146R.layout.white_message_displayable;
    }

    public MessageWhiteBgDisplayable(String str) {
        this.message = str;
    }
}
