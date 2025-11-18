package cm.aptoide.p092pt.reactions.p103ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.content.C0255a;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.reactions.data.ReactionType;
import cm.aptoide.p092pt.reactions.p103ui.ReactionsView;

/* loaded from: classes.dex */
public class ReactionsPopup {
    private final View anchorView;
    private int gravity = 8388659;
    private OnDismissListener onDismissListener;
    private final PopupWindow popup;
    private OnReactionClickListener reactionClickListener;
    private final ReactionsView reactionsView;

    public interface OnDismissListener {
        void onDismiss(ReactionsView reactionsView);
    }

    public interface OnReactionClickListener {
        void onReactionItemClick(ReactionType reactionType);
    }

    public ReactionsPopup(Context context, View view) {
        this.anchorView = view;
        PopupWindow popupWindow = new PopupWindow();
        this.popup = popupWindow;
        popupWindow.setWindowLayoutMode(-2, -2);
        ReactionsView reactionsView = new ReactionsView(context);
        this.reactionsView = reactionsView;
        reactionsView.setVisibility(0);
        popupWindow.setContentView(reactionsView);
        popupWindow.setFocusable(true);
        popupWindow.setClippingEnabled(true);
        popupWindow.setBackgroundDrawable(C0255a.m1677f(context, C1146R.drawable.rounded_corners_reactions));
        if (Build.VERSION.SDK_INT >= 21) {
            popupWindow.setElevation(10.0f);
        }
        reactionsView.setCallback(new ReactionsView.Callback() { // from class: cm.aptoide.pt.reactions.ui.b
            @Override // cm.aptoide.pt.reactions.ui.ReactionsView.Callback
            public final void onReactionItemClicked(ReactionType reactionType) {
                this.f10954a.m8594a(reactionType);
            }
        });
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: cm.aptoide.pt.reactions.ui.c
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f10955f.m8595b();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8594a(ReactionType reactionType) {
        OnReactionClickListener onReactionClickListener = this.reactionClickListener;
        if (onReactionClickListener != null) {
            onReactionClickListener.onReactionItemClick(reactionType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$new$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8595b() {
        OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this.reactionsView);
        }
    }

    public void dismiss() {
        this.popup.dismiss();
    }

    public int getGravity() {
        return this.gravity;
    }

    public void setGravity(int i2) {
        this.gravity = i2;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    public void setOnReactionsItemClickListener(OnReactionClickListener onReactionClickListener) {
        this.reactionClickListener = onReactionClickListener;
    }

    public void show() {
        if (Build.VERSION.SDK_INT >= 19) {
            PopupWindow popupWindow = this.popup;
            View view = this.anchorView;
            popupWindow.showAsDropDown(view, (int) view.getX(), (((int) this.anchorView.getY()) - this.anchorView.getHeight()) - this.reactionsView.getReactionsViewHeight(), this.gravity);
        } else {
            PopupWindow popupWindow2 = this.popup;
            View view2 = this.anchorView;
            popupWindow2.showAsDropDown(view2, (int) view2.getX(), (((int) this.anchorView.getY()) - this.anchorView.getHeight()) - this.reactionsView.getReactionsViewHeight());
        }
    }
}
