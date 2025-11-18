package cm.aptoide.p092pt.store.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class StoreAutoCompleteTextView extends AutoCompleteTextView {
    private static final int DEFAULT_AUTOCOMPLETE_DELAY = 2000;
    private static final int MESSAGE_TEXT_CHANGED = 100;
    private int mAutoCompleteDelay;
    private final Handler mHandler;

    public StoreAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mHandler = new Handler() { // from class: cm.aptoide.pt.store.view.StoreAutoCompleteTextView.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                StoreAutoCompleteTextView.super.performFiltering((CharSequence) message.obj, message.arg1);
            }
        };
        this.mAutoCompleteDelay = DEFAULT_AUTOCOMPLETE_DELAY;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.Filter.FilterListener
    public void onFilterComplete(int i2) {
        super.onFilterComplete(i2);
    }

    @Override // android.widget.AutoCompleteTextView
    protected void performFiltering(CharSequence charSequence, int i2) {
        this.mHandler.removeMessages(100);
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(100, charSequence), this.mAutoCompleteDelay);
    }
}
