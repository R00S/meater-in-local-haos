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
import android.view.ViewConfiguration;
import androidx.core.content.C0255a;
import androidx.core.view.AbstractC0282b;
import androidx.core.view.C0312v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;
import p024c.p052i.p054f.p055a.InterfaceMenuC0934a;

/* compiled from: MenuBuilder.java */
/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: classes.dex */
public class C0087g implements InterfaceMenuC0934a {

    /* renamed from: a */
    private static final int[] f576a = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f577A;

    /* renamed from: b */
    private final Context f578b;

    /* renamed from: c */
    private final Resources f579c;

    /* renamed from: d */
    private boolean f580d;

    /* renamed from: e */
    private boolean f581e;

    /* renamed from: f */
    private a f582f;

    /* renamed from: n */
    private ContextMenu.ContextMenuInfo f590n;

    /* renamed from: o */
    CharSequence f591o;

    /* renamed from: p */
    Drawable f592p;

    /* renamed from: q */
    View f593q;

    /* renamed from: y */
    private C0089i f601y;

    /* renamed from: m */
    private int f589m = 0;

    /* renamed from: r */
    private boolean f594r = false;

    /* renamed from: s */
    private boolean f595s = false;

    /* renamed from: t */
    private boolean f596t = false;

    /* renamed from: u */
    private boolean f597u = false;

    /* renamed from: v */
    private boolean f598v = false;

    /* renamed from: w */
    private ArrayList<C0089i> f599w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<InterfaceC0093m>> f600x = new CopyOnWriteArrayList<>();

    /* renamed from: z */
    private boolean f602z = false;

    /* renamed from: g */
    private ArrayList<C0089i> f583g = new ArrayList<>();

    /* renamed from: h */
    private ArrayList<C0089i> f584h = new ArrayList<>();

    /* renamed from: i */
    private boolean f585i = true;

    /* renamed from: j */
    private ArrayList<C0089i> f586j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0089i> f587k = new ArrayList<>();

    /* renamed from: l */
    private boolean f588l = true;

    /* compiled from: MenuBuilder.java */
    /* renamed from: androidx.appcompat.view.menu.g$a */
    public interface a {
        /* renamed from: a */
        boolean mo347a(C0087g c0087g, MenuItem menuItem);

        /* renamed from: b */
        void mo349b(C0087g c0087g);
    }

    /* compiled from: MenuBuilder.java */
    /* renamed from: androidx.appcompat.view.menu.g$b */
    public interface b {
        /* renamed from: a */
        boolean mo477a(C0089i c0089i);
    }

    public C0087g(Context context) {
        this.f578b = context;
        this.f579c = context.getResources();
        m549f0(true);
    }

    /* renamed from: D */
    private static int m546D(int i2) {
        int i3 = ((-65536) & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = f576a;
            if (i3 < iArr.length) {
                return (i2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: P */
    private void m547P(int i2, boolean z) {
        if (i2 < 0 || i2 >= this.f583g.size()) {
            return;
        }
        this.f583g.remove(i2);
        if (z) {
            m567M(true);
        }
    }

    /* renamed from: a0 */
    private void m548a0(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resourcesM559E = m559E();
        if (view != null) {
            this.f593q = view;
            this.f591o = null;
            this.f592p = null;
        } else {
            if (i2 > 0) {
                this.f591o = resourcesM559E.getText(i2);
            } else if (charSequence != null) {
                this.f591o = charSequence;
            }
            if (i3 > 0) {
                this.f592p = C0255a.m1677f(m602w(), i3);
            } else if (drawable != null) {
                this.f592p = drawable;
            }
            this.f593q = null;
        }
        m567M(false);
    }

    /* renamed from: f0 */
    private void m549f0(boolean z) {
        this.f581e = z && this.f579c.getConfiguration().keyboard != 1 && C0312v.m2206e(ViewConfiguration.get(this.f578b), this.f578b);
    }

    /* renamed from: g */
    private C0089i m550g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new C0089i(this, i2, i3, i4, i5, charSequence, i6);
    }

    /* renamed from: i */
    private void m551i(boolean z) {
        if (this.f600x.isEmpty()) {
            return;
        }
        m592h0();
        Iterator<WeakReference<InterfaceC0093m>> it = this.f600x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0093m> next = it.next();
            InterfaceC0093m interfaceC0093m = next.get();
            if (interfaceC0093m == null) {
                this.f600x.remove(next);
            } else {
                interfaceC0093m.mo493c(z);
            }
        }
        m590g0();
    }

    /* renamed from: j */
    private void m552j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f600x.isEmpty()) {
            return;
        }
        Iterator<WeakReference<InterfaceC0093m>> it = this.f600x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0093m> next = it.next();
            InterfaceC0093m interfaceC0093m = next.get();
            if (interfaceC0093m == null) {
                this.f600x.remove(next);
            } else {
                int id = interfaceC0093m.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC0093m.mo521i(parcelable);
                }
            }
        }
    }

    /* renamed from: k */
    private void m553k(Bundle bundle) {
        Parcelable parcelableMo523l;
        if (this.f600x.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<InterfaceC0093m>> it = this.f600x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0093m> next = it.next();
            InterfaceC0093m interfaceC0093m = next.get();
            if (interfaceC0093m == null) {
                this.f600x.remove(next);
            } else {
                int id = interfaceC0093m.getId();
                if (id > 0 && (parcelableMo523l = interfaceC0093m.mo523l()) != null) {
                    sparseArray.put(id, parcelableMo523l);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* renamed from: l */
    private boolean m554l(SubMenuC0098r subMenuC0098r, InterfaceC0093m interfaceC0093m) {
        if (this.f600x.isEmpty()) {
            return false;
        }
        boolean zMo499k = interfaceC0093m != null ? interfaceC0093m.mo499k(subMenuC0098r) : false;
        Iterator<WeakReference<InterfaceC0093m>> it = this.f600x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0093m> next = it.next();
            InterfaceC0093m interfaceC0093m2 = next.get();
            if (interfaceC0093m2 == null) {
                this.f600x.remove(next);
            } else if (!zMo499k) {
                zMo499k = interfaceC0093m2.mo499k(subMenuC0098r);
            }
        }
        return zMo499k;
    }

    /* renamed from: p */
    private static int m555p(ArrayList<C0089i> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m613f() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View m556A() {
        return this.f593q;
    }

    /* renamed from: B */
    public ArrayList<C0089i> m557B() {
        m599t();
        return this.f587k;
    }

    /* renamed from: C */
    boolean m558C() {
        return this.f597u;
    }

    /* renamed from: E */
    Resources m559E() {
        return this.f579c;
    }

    /* renamed from: F */
    public C0087g mo560F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList<C0089i> m561G() {
        if (!this.f585i) {
            return this.f584h;
        }
        this.f584h.clear();
        int size = this.f583g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0089i c0089i = this.f583g.get(i2);
            if (c0089i.isVisible()) {
                this.f584h.add(c0089i);
            }
        }
        this.f585i = false;
        this.f588l = true;
        return this.f584h;
    }

    /* renamed from: H */
    public boolean mo562H() {
        return this.f602z;
    }

    /* renamed from: I */
    boolean mo563I() {
        return this.f580d;
    }

    /* renamed from: J */
    public boolean mo564J() {
        return this.f581e;
    }

    /* renamed from: K */
    void m565K(C0089i c0089i) {
        this.f588l = true;
        m567M(true);
    }

    /* renamed from: L */
    void m566L(C0089i c0089i) {
        this.f585i = true;
        m567M(true);
    }

    /* renamed from: M */
    public void m567M(boolean z) {
        if (this.f594r) {
            this.f595s = true;
            if (z) {
                this.f596t = true;
                return;
            }
            return;
        }
        if (z) {
            this.f585i = true;
            this.f588l = true;
        }
        m551i(z);
    }

    /* renamed from: N */
    public boolean m568N(MenuItem menuItem, int i2) {
        return m569O(menuItem, null, i2);
    }

    /* renamed from: O */
    public boolean m569O(MenuItem menuItem, InterfaceC0093m interfaceC0093m, int i2) {
        C0089i c0089i = (C0089i) menuItem;
        if (c0089i == null || !c0089i.isEnabled()) {
            return false;
        }
        boolean zM618k = c0089i.m618k();
        AbstractC0282b abstractC0282bMo487b = c0089i.mo487b();
        boolean z = abstractC0282bMo487b != null && abstractC0282bMo487b.mo635a();
        if (c0089i.m617j()) {
            zM618k |= c0089i.expandActionView();
            if (zM618k) {
                m587e(true);
            }
        } else if (c0089i.hasSubMenu() || z) {
            if ((i2 & 4) == 0) {
                m587e(false);
            }
            if (!c0089i.hasSubMenu()) {
                c0089i.m631x(new SubMenuC0098r(m602w(), this, c0089i));
            }
            SubMenuC0098r subMenuC0098r = (SubMenuC0098r) c0089i.getSubMenu();
            if (z) {
                abstractC0282bMo487b.mo638f(subMenuC0098r);
            }
            zM618k |= m554l(subMenuC0098r, interfaceC0093m);
            if (!zM618k) {
                m587e(true);
            }
        } else if ((i2 & 1) == 0) {
            m587e(true);
        }
        return zM618k;
    }

    /* renamed from: Q */
    public void m570Q(InterfaceC0093m interfaceC0093m) {
        Iterator<WeakReference<InterfaceC0093m>> it = this.f600x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0093m> next = it.next();
            InterfaceC0093m interfaceC0093m2 = next.get();
            if (interfaceC0093m2 == null || interfaceC0093m2 == interfaceC0093m) {
                this.f600x.remove(next);
            }
        }
    }

    /* renamed from: R */
    public void m571R(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo601v());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0098r) item.getSubMenu()).m571R(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (menuItemFindItem = findItem(i3)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* renamed from: S */
    public void m572S(Bundle bundle) {
        m552j(bundle);
    }

    /* renamed from: T */
    public void m573T(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
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
                ((SubMenuC0098r) item.getSubMenu()).m573T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo601v(), sparseArray);
        }
    }

    /* renamed from: U */
    public void m574U(Bundle bundle) {
        m553k(bundle);
    }

    /* renamed from: V */
    public void mo575V(a aVar) {
        this.f582f = aVar;
    }

    /* renamed from: W */
    public C0087g m576W(int i2) {
        this.f589m = i2;
        return this;
    }

    /* renamed from: X */
    void m577X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f583g.size();
        m592h0();
        for (int i2 = 0; i2 < size; i2++) {
            C0089i c0089i = this.f583g.get(i2);
            if (c0089i.getGroupId() == groupId && c0089i.m620m() && c0089i.isCheckable()) {
                c0089i.m626s(c0089i == menuItem);
            }
        }
        m590g0();
    }

    /* renamed from: Y */
    protected C0087g m578Y(int i2) {
        m548a0(0, null, i2, null, null);
        return this;
    }

    /* renamed from: Z */
    protected C0087g m579Z(Drawable drawable) {
        m548a0(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: a */
    protected MenuItem mo580a(int i2, int i3, int i4, CharSequence charSequence) {
        int iM546D = m546D(i4);
        C0089i c0089iM550g = m550g(i2, i3, i4, iM546D, charSequence, this.f589m);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f590n;
        if (contextMenuInfo != null) {
            c0089iM550g.m629v(contextMenuInfo);
        }
        ArrayList<C0089i> arrayList = this.f583g;
        arrayList.add(m555p(arrayList, iM546D), c0089iM550g);
        m567M(true);
        return c0089iM550g;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo580a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f578b.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m581b(InterfaceC0093m interfaceC0093m) {
        m583c(interfaceC0093m, this.f578b);
    }

    /* renamed from: b0 */
    protected C0087g m582b0(int i2) {
        m548a0(i2, null, 0, null, null);
        return this;
    }

    /* renamed from: c */
    public void m583c(InterfaceC0093m interfaceC0093m, Context context) {
        this.f600x.add(new WeakReference<>(interfaceC0093m));
        interfaceC0093m.mo497h(context, this);
        this.f588l = true;
    }

    /* renamed from: c0 */
    protected C0087g m584c0(CharSequence charSequence) {
        m548a0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        C0089i c0089i = this.f601y;
        if (c0089i != null) {
            mo589f(c0089i);
        }
        this.f583g.clear();
        m567M(true);
    }

    public void clearHeader() {
        this.f592p = null;
        this.f591o = null;
        this.f593q = null;
        m567M(false);
    }

    @Override // android.view.Menu
    public void close() {
        m587e(true);
    }

    /* renamed from: d */
    public void m585d() {
        a aVar = this.f582f;
        if (aVar != null) {
            aVar.mo349b(this);
        }
    }

    /* renamed from: d0 */
    protected C0087g m586d0(View view) {
        m548a0(0, null, 0, null, view);
        return this;
    }

    /* renamed from: e */
    public final void m587e(boolean z) {
        if (this.f598v) {
            return;
        }
        this.f598v = true;
        Iterator<WeakReference<InterfaceC0093m>> it = this.f600x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0093m> next = it.next();
            InterfaceC0093m interfaceC0093m = next.get();
            if (interfaceC0093m == null) {
                this.f600x.remove(next);
            } else {
                interfaceC0093m.mo492b(this, z);
            }
        }
        this.f598v = false;
    }

    /* renamed from: e0 */
    public void m588e0(boolean z) {
        this.f577A = z;
    }

    /* renamed from: f */
    public boolean mo589f(C0089i c0089i) {
        boolean zMo494e = false;
        if (!this.f600x.isEmpty() && this.f601y == c0089i) {
            m592h0();
            Iterator<WeakReference<InterfaceC0093m>> it = this.f600x.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0093m> next = it.next();
                InterfaceC0093m interfaceC0093m = next.get();
                if (interfaceC0093m == null) {
                    this.f600x.remove(next);
                } else {
                    zMo494e = interfaceC0093m.mo494e(this, c0089i);
                    if (zMo494e) {
                        break;
                    }
                }
            }
            m590g0();
            if (zMo494e) {
                this.f601y = null;
            }
        }
        return zMo494e;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            C0089i c0089i = this.f583g.get(i3);
            if (c0089i.getItemId() == i2) {
                return c0089i;
            }
            if (c0089i.hasSubMenu() && (menuItemFindItem = c0089i.getSubMenu().findItem(i2)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* renamed from: g0 */
    public void m590g0() {
        this.f594r = false;
        if (this.f595s) {
            this.f595s = false;
            m567M(this.f596t);
        }
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f583g.get(i2);
    }

    /* renamed from: h */
    boolean mo591h(C0087g c0087g, MenuItem menuItem) {
        a aVar = this.f582f;
        return aVar != null && aVar.mo347a(c0087g, menuItem);
    }

    /* renamed from: h0 */
    public void m592h0() {
        if (this.f594r) {
            return;
        }
        this.f594r = true;
        this.f595s = false;
        this.f596t = false;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f577A) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f583g.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return m597r(i2, keyEvent) != null;
    }

    /* renamed from: m */
    public boolean mo593m(C0089i c0089i) {
        boolean zMo495f = false;
        if (this.f600x.isEmpty()) {
            return false;
        }
        m592h0();
        Iterator<WeakReference<InterfaceC0093m>> it = this.f600x.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0093m> next = it.next();
            InterfaceC0093m interfaceC0093m = next.get();
            if (interfaceC0093m == null) {
                this.f600x.remove(next);
            } else {
                zMo495f = interfaceC0093m.mo495f(this, c0089i);
                if (zMo495f) {
                    break;
                }
            }
        }
        m590g0();
        if (zMo495f) {
            this.f601y = c0089i;
        }
        return zMo495f;
    }

    /* renamed from: n */
    public int m594n(int i2) {
        return m595o(i2, 0);
    }

    /* renamed from: o */
    public int m595o(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f583g.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return m568N(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        C0089i c0089iM597r = m597r(i2, keyEvent);
        boolean zM568N = c0089iM597r != null ? m568N(c0089iM597r, i3) : false;
        if ((i3 & 2) != 0) {
            m587e(true);
        }
        return zM568N;
    }

    /* renamed from: q */
    public int m596q(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f583g.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: r */
    C0089i m597r(int i2, KeyEvent keyEvent) {
        ArrayList<C0089i> arrayList = this.f599w;
        arrayList.clear();
        m598s(arrayList, i2, keyEvent);
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
        boolean zMo563I = mo563I();
        for (int i3 = 0; i3 < size; i3++) {
            C0089i c0089i = arrayList.get(i3);
            char alphabeticShortcut = zMo563I ? c0089i.getAlphabeticShortcut() : c0089i.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zMo563I && alphabeticShortcut == '\b' && i2 == 67))) {
                return c0089i;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int iM594n = m594n(i2);
        if (iM594n >= 0) {
            int size = this.f583g.size() - iM594n;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f583g.get(iM594n).getGroupId() != i2) {
                    break;
                }
                m547P(iM594n, false);
                i3 = i4;
            }
            m567M(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        m547P(m596q(i2), true);
    }

    /* renamed from: s */
    void m598s(List<C0089i> list, int i2, KeyEvent keyEvent) {
        boolean zMo563I = mo563I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f583g.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0089i c0089i = this.f583g.get(i3);
                if (c0089i.hasSubMenu()) {
                    ((C0087g) c0089i.getSubMenu()).m598s(list, i2, keyEvent);
                }
                char alphabeticShortcut = zMo563I ? c0089i.getAlphabeticShortcut() : c0089i.getNumericShortcut();
                if (((modifiers & 69647) == ((zMo563I ? c0089i.getAlphabeticModifiers() : c0089i.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zMo563I && alphabeticShortcut == '\b' && i2 == 67)) && c0089i.isEnabled()) {
                        list.add(c0089i);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.f583g.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0089i c0089i = this.f583g.get(i3);
            if (c0089i.getGroupId() == i2) {
                c0089i.m627t(z2);
                c0089i.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f602z = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z) {
        int size = this.f583g.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0089i c0089i = this.f583g.get(i3);
            if (c0089i.getGroupId() == i2) {
                c0089i.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z) {
        int size = this.f583g.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C0089i c0089i = this.f583g.get(i3);
            if (c0089i.getGroupId() == i2 && c0089i.m632y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m567M(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f580d = z;
        m567M(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f583g.size();
    }

    /* renamed from: t */
    public void m599t() {
        ArrayList<C0089i> arrayListM561G = m561G();
        if (this.f588l) {
            Iterator<WeakReference<InterfaceC0093m>> it = this.f600x.iterator();
            boolean zMo520d = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0093m> next = it.next();
                InterfaceC0093m interfaceC0093m = next.get();
                if (interfaceC0093m == null) {
                    this.f600x.remove(next);
                } else {
                    zMo520d |= interfaceC0093m.mo520d();
                }
            }
            if (zMo520d) {
                this.f586j.clear();
                this.f587k.clear();
                int size = arrayListM561G.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C0089i c0089i = arrayListM561G.get(i2);
                    if (c0089i.m619l()) {
                        this.f586j.add(c0089i);
                    } else {
                        this.f587k.add(c0089i);
                    }
                }
            } else {
                this.f586j.clear();
                this.f587k.clear();
                this.f587k.addAll(m561G());
            }
            this.f588l = false;
        }
    }

    /* renamed from: u */
    public ArrayList<C0089i> m600u() {
        m599t();
        return this.f586j;
    }

    /* renamed from: v */
    protected String mo601v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context m602w() {
        return this.f578b;
    }

    /* renamed from: x */
    public C0089i m603x() {
        return this.f601y;
    }

    /* renamed from: y */
    public Drawable m604y() {
        return this.f592p;
    }

    /* renamed from: z */
    public CharSequence m605z() {
        return this.f591o;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return mo580a(0, 0, 0, this.f579c.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f579c.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return mo580a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        C0089i c0089i = (C0089i) mo580a(i2, i3, i4, charSequence);
        SubMenuC0098r subMenuC0098r = new SubMenuC0098r(this.f578b, this, c0089i);
        c0089i.m631x(subMenuC0098r);
        return subMenuC0098r;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return mo580a(i2, i3, i4, this.f579c.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f579c.getString(i5));
    }
}
