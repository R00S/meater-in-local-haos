package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import g1.C3377a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l1.InterfaceMenuC3893a;
import s1.AbstractC4423b;

/* compiled from: MenuBuilder.java */
/* loaded from: classes.dex */
public class e implements InterfaceMenuC3893a {

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f21013A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    private final Context f21014a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f21015b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21016c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21017d;

    /* renamed from: e, reason: collision with root package name */
    private a f21018e;

    /* renamed from: m, reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f21026m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f21027n;

    /* renamed from: o, reason: collision with root package name */
    Drawable f21028o;

    /* renamed from: p, reason: collision with root package name */
    View f21029p;

    /* renamed from: x, reason: collision with root package name */
    private g f21037x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f21039z;

    /* renamed from: l, reason: collision with root package name */
    private int f21025l = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21030q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f21031r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f21032s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f21033t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21034u = false;

    /* renamed from: v, reason: collision with root package name */
    private ArrayList<g> f21035v = new ArrayList<>();

    /* renamed from: w, reason: collision with root package name */
    private CopyOnWriteArrayList<WeakReference<j>> f21036w = new CopyOnWriteArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    private boolean f21038y = false;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<g> f21019f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<g> f21020g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private boolean f21021h = true;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<g> f21022i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<g> f21023j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private boolean f21024k = true;

    /* compiled from: MenuBuilder.java */
    public interface a {
        boolean a(e eVar, MenuItem menuItem);

        void b(e eVar);
    }

    /* compiled from: MenuBuilder.java */
    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.f21014a = context;
        this.f21015b = context.getResources();
        g0(true);
    }

    private static int D(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = f21013A;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void Q(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.f21019f.size()) {
            return;
        }
        this.f21019f.remove(i10);
        if (z10) {
            N(true);
        }
    }

    private void b0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resourcesE = E();
        if (view != null) {
            this.f21029p = view;
            this.f21027n = null;
            this.f21028o = null;
        } else {
            if (i10 > 0) {
                this.f21027n = resourcesE.getText(i10);
            } else if (charSequence != null) {
                this.f21027n = charSequence;
            }
            if (i11 > 0) {
                this.f21028o = C3377a.e(w(), i11);
            } else if (drawable != null) {
                this.f21028o = drawable;
            }
            this.f21029p = null;
        }
        N(false);
    }

    private g g(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f21015b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f21014a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f21014a
            boolean r3 = s1.C4422a0.j(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f21017d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.g0(boolean):void");
    }

    private void i(boolean z10) {
        if (this.f21036w.isEmpty()) {
            return;
        }
        i0();
        Iterator<WeakReference<j>> it = this.f21036w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f21036w.remove(next);
            } else {
                jVar.e(z10);
            }
        }
        h0();
    }

    private void j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f21036w.isEmpty()) {
            return;
        }
        Iterator<WeakReference<j>> it = this.f21036w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f21036w.remove(next);
            } else {
                int iC = jVar.c();
                if (iC > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(iC)) != null) {
                    jVar.k(parcelable);
                }
            }
        }
    }

    private void k(Bundle bundle) {
        Parcelable parcelableN;
        if (this.f21036w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<j>> it = this.f21036w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f21036w.remove(next);
            } else {
                int iC = jVar.c();
                if (iC > 0 && (parcelableN = jVar.n()) != null) {
                    sparseArray.put(iC, parcelableN);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private boolean l(m mVar, j jVar) {
        if (this.f21036w.isEmpty()) {
            return false;
        }
        boolean zM = jVar != null ? jVar.m(mVar) : false;
        Iterator<WeakReference<j>> it = this.f21036w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null) {
                this.f21036w.remove(next);
            } else if (!zM) {
                zM = jVar2.m(mVar);
            }
        }
        return zM;
    }

    private static int p(ArrayList<g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public View A() {
        return this.f21029p;
    }

    public ArrayList<g> B() {
        t();
        return this.f21023j;
    }

    boolean C() {
        return this.f21033t;
    }

    Resources E() {
        return this.f21015b;
    }

    public ArrayList<g> G() {
        if (!this.f21021h) {
            return this.f21020g;
        }
        this.f21020g.clear();
        int size = this.f21019f.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f21019f.get(i10);
            if (gVar.isVisible()) {
                this.f21020g.add(gVar);
            }
        }
        this.f21021h = false;
        this.f21024k = true;
        return this.f21020g;
    }

    public boolean H() {
        return !this.f21030q;
    }

    public boolean I() {
        return this.f21038y;
    }

    boolean J() {
        return this.f21016c;
    }

    public boolean K() {
        return this.f21017d;
    }

    void L(g gVar) {
        this.f21024k = true;
        N(true);
    }

    void M(g gVar) {
        this.f21021h = true;
        N(true);
    }

    public void N(boolean z10) {
        if (this.f21030q) {
            this.f21031r = true;
            if (z10) {
                this.f21032s = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f21021h = true;
            this.f21024k = true;
        }
        i(z10);
    }

    public boolean O(MenuItem menuItem, int i10) {
        return P(menuItem, null, i10);
    }

    public boolean P(MenuItem menuItem, j jVar, int i10) {
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        boolean zK = gVar.k();
        AbstractC4423b abstractC4423bB = gVar.b();
        boolean z10 = abstractC4423bB != null && abstractC4423bB.a();
        if (gVar.j()) {
            zK |= gVar.expandActionView();
            if (zK) {
                e(true);
            }
        } else if (gVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                e(false);
            }
            if (!gVar.hasSubMenu()) {
                gVar.x(new m(w(), this, gVar));
            }
            m mVar = (m) gVar.getSubMenu();
            if (z10) {
                abstractC4423bB.f(mVar);
            }
            zK |= l(mVar, jVar);
            if (!zK) {
                e(true);
            }
        } else if ((i10 & 1) == 0) {
            e(true);
        }
        return zK;
    }

    public void R(j jVar) {
        Iterator<WeakReference<j>> it = this.f21036w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar2 = next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.f21036w.remove(next);
            }
        }
    }

    public void S(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(v());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).S(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void T(Bundle bundle) {
        j(bundle);
    }

    public void U(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).U(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(v(), sparseArray);
        }
    }

    public void V(Bundle bundle) {
        k(bundle);
    }

    public void W(a aVar) {
        this.f21018e = aVar;
    }

    public e X(int i10) {
        this.f21025l = i10;
        return this;
    }

    void Y(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f21019f.size();
        i0();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.f21019f.get(i10);
            if (gVar.getGroupId() == groupId && gVar.m() && gVar.isCheckable()) {
                gVar.s(gVar == menuItem);
            }
        }
        h0();
    }

    protected e Z(int i10) {
        b0(0, null, i10, null, null);
        return this;
    }

    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int iD = D(i12);
        g gVarG = g(i10, i11, i12, iD, charSequence, this.f21025l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f21026m;
        if (contextMenuInfo != null) {
            gVarG.v(contextMenuInfo);
        }
        ArrayList<g> arrayList = this.f21019f;
        arrayList.add(p(arrayList, iD), gVarG);
        N(true);
        return gVarG;
    }

    protected e a0(Drawable drawable) {
        b0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f21014a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f21014a);
    }

    public void c(j jVar, Context context) {
        this.f21036w.add(new WeakReference<>(jVar));
        jVar.j(context, this);
        this.f21024k = true;
    }

    protected e c0(int i10) {
        b0(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f21037x;
        if (gVar != null) {
            f(gVar);
        }
        this.f21019f.clear();
        N(true);
    }

    public void clearHeader() {
        this.f21028o = null;
        this.f21027n = null;
        this.f21029p = null;
        N(false);
    }

    @Override // android.view.Menu
    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.f21018e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    protected e d0(CharSequence charSequence) {
        b0(0, charSequence, 0, null, null);
        return this;
    }

    public final void e(boolean z10) {
        if (this.f21034u) {
            return;
        }
        this.f21034u = true;
        Iterator<WeakReference<j>> it = this.f21036w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f21036w.remove(next);
            } else {
                jVar.d(this, z10);
            }
        }
        this.f21034u = false;
    }

    protected e e0(View view) {
        b0(0, null, 0, null, view);
        return this;
    }

    public boolean f(g gVar) {
        boolean zG = false;
        if (!this.f21036w.isEmpty() && this.f21037x == gVar) {
            i0();
            Iterator<WeakReference<j>> it = this.f21036w.iterator();
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f21036w.remove(next);
                } else {
                    zG = jVar.g(this, gVar);
                    if (zG) {
                        break;
                    }
                }
            }
            h0();
            if (zG) {
                this.f21037x = null;
            }
        }
        return zG;
    }

    public void f0(boolean z10) {
        this.f21039z = z10;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f21019f.get(i11);
            if (gVar.getItemId() == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.getSubMenu().findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.f21019f.get(i10);
    }

    boolean h(e eVar, MenuItem menuItem) {
        a aVar = this.f21018e;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public void h0() {
        this.f21030q = false;
        if (this.f21031r) {
            this.f21031r = false;
            N(this.f21032s);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f21039z) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f21019f.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i0() {
        if (this.f21030q) {
            return;
        }
        this.f21030q = true;
        this.f21031r = false;
        this.f21032s = false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return r(i10, keyEvent) != null;
    }

    public boolean m(g gVar) {
        boolean zH = false;
        if (this.f21036w.isEmpty()) {
            return false;
        }
        i0();
        Iterator<WeakReference<j>> it = this.f21036w.iterator();
        while (it.hasNext()) {
            WeakReference<j> next = it.next();
            j jVar = next.get();
            if (jVar == null) {
                this.f21036w.remove(next);
            } else {
                zH = jVar.h(this, gVar);
                if (zH) {
                    break;
                }
            }
        }
        h0();
        if (zH) {
            this.f21037x = gVar;
        }
        return zH;
    }

    public int n(int i10) {
        return o(i10, 0);
    }

    public int o(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f21019f.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return O(findItem(i10), i11);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g gVarR = r(i10, keyEvent);
        boolean zO = gVarR != null ? O(gVarR, i11) : false;
        if ((i11 & 2) != 0) {
            e(true);
        }
        return zO;
    }

    public int q(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f21019f.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    g r(int i10, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.f21035v;
        arrayList.clear();
        s(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zJ = J();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            char alphabeticShortcut = zJ ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zJ && alphabeticShortcut == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iN = n(i10);
        if (iN >= 0) {
            int size = this.f21019f.size() - iN;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f21019f.get(iN).getGroupId() != i10) {
                    break;
                }
                Q(iN, false);
                i11 = i12;
            }
            N(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        Q(q(i10), true);
    }

    void s(List<g> list, int i10, KeyEvent keyEvent) {
        boolean zJ = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f21019f.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.f21019f.get(i11);
                if (gVar.hasSubMenu()) {
                    ((e) gVar.getSubMenu()).s(list, i10, keyEvent);
                }
                char alphabeticShortcut = zJ ? gVar.getAlphabeticShortcut() : gVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zJ ? gVar.getAlphabeticModifiers() : gVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zJ && alphabeticShortcut == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f21019f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f21019f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.t(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f21038y = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f21019f.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f21019f.get(i11);
            if (gVar.getGroupId() == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f21019f.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.f21019f.get(i11);
            if (gVar.getGroupId() == i10 && gVar.y(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            N(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f21016c = z10;
        N(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f21019f.size();
    }

    public void t() {
        ArrayList<g> arrayListG = G();
        if (this.f21024k) {
            Iterator<WeakReference<j>> it = this.f21036w.iterator();
            boolean zF = false;
            while (it.hasNext()) {
                WeakReference<j> next = it.next();
                j jVar = next.get();
                if (jVar == null) {
                    this.f21036w.remove(next);
                } else {
                    zF |= jVar.f();
                }
            }
            if (zF) {
                this.f21022i.clear();
                this.f21023j.clear();
                int size = arrayListG.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = arrayListG.get(i10);
                    if (gVar.l()) {
                        this.f21022i.add(gVar);
                    } else {
                        this.f21023j.add(gVar);
                    }
                }
            } else {
                this.f21022i.clear();
                this.f21023j.clear();
                this.f21023j.addAll(G());
            }
            this.f21024k = false;
        }
    }

    public ArrayList<g> u() {
        t();
        return this.f21022i;
    }

    protected String v() {
        return "android:menu:actionviewstates";
    }

    public Context w() {
        return this.f21014a;
    }

    public g x() {
        return this.f21037x;
    }

    public Drawable y() {
        return this.f21028o;
    }

    public CharSequence z() {
        return this.f21027n;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f21015b.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f21015b.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f21014a, this, gVar);
        gVar.x(mVar);
        return mVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f21015b.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f21015b.getString(i13));
    }

    public e F() {
        return this;
    }
}
