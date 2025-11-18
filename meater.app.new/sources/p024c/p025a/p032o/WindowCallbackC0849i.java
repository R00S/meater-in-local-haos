package p024c.p025a.p032o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* compiled from: WindowCallbackWrapper.java */
/* renamed from: c.a.o.i */
/* loaded from: classes.dex */
public class WindowCallbackC0849i implements Window.Callback {

    /* renamed from: f */
    final Window.Callback f5626f;

    public WindowCallbackC0849i(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f5626f = callback;
    }

    /* renamed from: a */
    public final Window.Callback m5370a() {
        return this.f5626f;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f5626f.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f5626f.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f5626f.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f5626f.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f5626f.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f5626f.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f5626f.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f5626f.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f5626f.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f5626f.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        return this.f5626f.onCreatePanelMenu(i2, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i2) {
        return this.f5626f.onCreatePanelView(i2);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f5626f.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f5626f.onMenuItemSelected(i2, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return this.f5626f.onMenuOpened(i2, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        this.f5626f.onPanelClosed(i2, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        this.f5626f.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        return this.f5626f.onPreparePanel(i2, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
        this.f5626f.onProvideKeyboardShortcuts(list, menu, i2);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f5626f.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f5626f.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.f5626f.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f5626f.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f5626f.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        return this.f5626f.onWindowStartingActionMode(callback, i2);
    }
}
