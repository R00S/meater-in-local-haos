package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0086f;
import androidx.appcompat.view.menu.C0087g;
import androidx.appcompat.view.menu.C0089i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow.java */
/* renamed from: androidx.appcompat.widget.f0 */
/* loaded from: classes.dex */
public class C0163f0 extends C0159d0 implements InterfaceC0161e0 {

    /* renamed from: O */
    private static Method f1117O;

    /* renamed from: P */
    private InterfaceC0161e0 f1118P;

    /* compiled from: MenuPopupWindow.java */
    /* renamed from: androidx.appcompat.widget.f0$a */
    public static class a extends C0201z {

        /* renamed from: t */
        final int f1119t;

        /* renamed from: u */
        final int f1120u;

        /* renamed from: v */
        private InterfaceC0161e0 f1121v;

        /* renamed from: w */
        private MenuItem f1122w;

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1119t = 22;
                this.f1120u = 21;
            } else {
                this.f1119t = 21;
                this.f1120u = 22;
            }
        }

        @Override // androidx.appcompat.widget.C0201z
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo964d(int i2, int i3, int i4, int i5, int i6) {
            return super.mo964d(i2, i3, i4, i5, i6);
        }

        @Override // androidx.appcompat.widget.C0201z
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo965e(MotionEvent motionEvent, int i2) {
            return super.mo965e(motionEvent, i2);
        }

        @Override // androidx.appcompat.widget.C0201z, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C0201z, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C0201z, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C0201z, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.C0201z, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            C0086f c0086f;
            int iPointToPosition;
            int i2;
            if (this.f1121v != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0086f = (C0086f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    c0086f = (C0086f) adapter;
                }
                C0089i item = null;
                if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = iPointToPosition - headersCount) >= 0 && i2 < c0086f.getCount()) {
                    item = c0086f.getItem(i2);
                }
                MenuItem menuItem = this.f1122w;
                if (menuItem != item) {
                    C0087g c0087gM543b = c0086f.m543b();
                    if (menuItem != null) {
                        this.f1121v.mo534g(c0087gM543b, menuItem);
                    }
                    this.f1122w = item;
                    if (item != null) {
                        this.f1121v.mo533d(c0087gM543b, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.f1119t) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i2 != this.f1120u) {
                return super.onKeyDown(i2, keyEvent);
            }
            setSelection(-1);
            ((C0086f) getAdapter()).m543b().m587e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.C0201z, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC0161e0 interfaceC0161e0) {
            this.f1121v = interfaceC0161e0;
        }

        @Override // androidx.appcompat.widget.C0201z, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1117O = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0163f0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    /* renamed from: Q */
    public void m960Q(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1086N.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: R */
    public void m961R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1086N.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: S */
    public void m962S(InterfaceC0161e0 interfaceC0161e0) {
        this.f1118P = interfaceC0161e0;
    }

    /* renamed from: T */
    public void m963T(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            this.f1086N.setTouchModal(z);
            return;
        }
        Method method = f1117O;
        if (method != null) {
            try {
                method.invoke(this.f1086N, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0161e0
    /* renamed from: d */
    public void mo533d(C0087g c0087g, MenuItem menuItem) {
        InterfaceC0161e0 interfaceC0161e0 = this.f1118P;
        if (interfaceC0161e0 != null) {
            interfaceC0161e0.mo533d(c0087g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0161e0
    /* renamed from: g */
    public void mo534g(C0087g c0087g, MenuItem menuItem) {
        InterfaceC0161e0 interfaceC0161e0 = this.f1118P;
        if (interfaceC0161e0 != null) {
            interfaceC0161e0.mo534g(c0087g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C0159d0
    /* renamed from: r */
    C0201z mo952r(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
