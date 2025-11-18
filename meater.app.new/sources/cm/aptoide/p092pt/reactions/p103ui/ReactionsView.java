package cm.aptoide.p092pt.reactions.p103ui;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import cm.aptoide.p092pt.reactions.data.ReactionType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ReactionsView extends LinearLayout {
    public static int HEIGHT_REACTIONS;
    public static int REACTIONS_PADDING;
    public static int WIDTH_REACTIONS;
    private List<Reaction> reactions;

    public interface Callback {
        void onReactionItemClicked(ReactionType reactionType);
    }

    public ReactionsView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setReactionOrientation();
        this.reactions = Arrays.asList(new Reaction(ReactionType.LIKE, REACTIONS_PADDING, getContext()), new Reaction(ReactionType.LAUGH, REACTIONS_PADDING, getContext()), new Reaction(ReactionType.LOVE, REACTIONS_PADDING, getContext()), new Reaction(ReactionType.THUG, REACTIONS_PADDING, getContext()), new Reaction(ReactionType.DOWN, REACTIONS_PADDING, getContext()));
        setOrientation(0);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(WIDTH_REACTIONS, HEIGHT_REACTIONS);
        for (Reaction reaction : this.reactions) {
            reaction.setReactionParams(layoutParams);
            addView(reaction.getView());
            reaction.play();
        }
    }

    public int getReactionsViewHeight() {
        int i2 = REACTIONS_PADDING;
        return i2 + i2 + HEIGHT_REACTIONS;
    }

    public void setCallback(Callback callback) {
        Iterator<Reaction> it = this.reactions.iterator();
        while (it.hasNext()) {
            it.next().setCallback(callback);
        }
    }

    public void setReactionOrientation() {
        int i2 = getResources().getConfiguration().orientation;
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(new Point());
        if (i2 == 1) {
            WIDTH_REACTIONS = Math.round(r2.x / 5);
            HEIGHT_REACTIONS = Math.round(r2.x / 5);
            REACTIONS_PADDING = Math.round((WIDTH_REACTIONS / 100) * 7);
        } else {
            WIDTH_REACTIONS = Math.round((r2.x / 2) / 5);
            HEIGHT_REACTIONS = Math.round((r2.x / 2) / 5);
            REACTIONS_PADDING = Math.round((WIDTH_REACTIONS / 100) * 7);
        }
    }

    public ReactionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ReactionsView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init();
    }
}
