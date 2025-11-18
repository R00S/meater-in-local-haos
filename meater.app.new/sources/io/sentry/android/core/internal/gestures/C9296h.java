package io.sentry.android.core.internal.gestures;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.C9680x4;
import io.sentry.EnumC9493j5;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryWindowCallback.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.gestures.h */
/* loaded from: classes2.dex */
public final class C9296h extends WindowCallbackC9299k {

    /* renamed from: g */
    private final Window.Callback f35952g;

    /* renamed from: h */
    private final GestureDetectorOnGestureListenerC9295g f35953h;

    /* renamed from: i */
    private final GestureDetectorCompat f35954i;

    /* renamed from: j */
    private final C9680x4 f35955j;

    /* renamed from: k */
    private final b f35956k;

    /* compiled from: SentryWindowCallback.java */
    /* renamed from: io.sentry.android.core.internal.gestures.h$a */
    class a implements b {
        a() {
        }

        @Override // io.sentry.android.core.internal.gestures.C9296h.b
        /* renamed from: a */
        public /* synthetic */ MotionEvent mo30254a(MotionEvent motionEvent) {
            return C9297i.m30255a(this, motionEvent);
        }
    }

    /* compiled from: SentryWindowCallback.java */
    /* renamed from: io.sentry.android.core.internal.gestures.h$b */
    interface b {
        /* renamed from: a */
        MotionEvent mo30254a(MotionEvent motionEvent);
    }

    public C9296h(Window.Callback callback, Context context, GestureDetectorOnGestureListenerC9295g gestureDetectorOnGestureListenerC9295g, C9680x4 c9680x4) {
        this(callback, new GestureDetectorCompat(context, gestureDetectorOnGestureListenerC9295g), gestureDetectorOnGestureListenerC9295g, c9680x4, new a());
    }

    /* renamed from: b */
    private void m30251b(MotionEvent motionEvent) {
        this.f35954i.m1843a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f35953h.m30238n(motionEvent);
        }
    }

    /* renamed from: a */
    public Window.Callback m30252a() {
        return this.f35952g;
    }

    /* renamed from: c */
    public void m30253c() {
        this.f35953h.m30239p(EnumC9493j5.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            try {
                m30251b(this.f35956k.mo30254a(motionEvent));
            } finally {
                try {
                } finally {
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return super.dispatchTrackballEvent(motionEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onContentChanged() {
        super.onContentChanged();
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onCreatePanelMenu(int i2, Menu menu) {
        return super.onCreatePanelMenu(i2, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ View onCreatePanelView(int i2) {
        return super.onCreatePanelView(i2);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return super.onMenuItemSelected(i2, menuItem);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onPreparePanel(int i2, View view, Menu menu) {
        return super.onPreparePanel(i2, view, menu);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean onSearchRequested() {
        return super.onSearchRequested();
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        super.onWindowAttributesChanged(layoutParams);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    C9296h(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, GestureDetectorOnGestureListenerC9295g gestureDetectorOnGestureListenerC9295g, C9680x4 c9680x4, b bVar) {
        super(callback);
        this.f35952g = callback;
        this.f35953h = gestureDetectorOnGestureListenerC9295g;
        this.f35955j = c9680x4;
        this.f35954i = gestureDetectorCompat;
        this.f35956k = bVar;
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ boolean onSearchRequested(SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override // io.sentry.android.core.internal.gestures.WindowCallbackC9299k, android.view.Window.Callback
    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        return super.onWindowStartingActionMode(callback, i2);
    }
}
