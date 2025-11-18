package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0157c0;
import androidx.core.view.C0311u;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p024c.p025a.C0823a;
import p024c.p025a.C0828f;
import p024c.p025a.C0832j;

/* loaded from: classes.dex */
class AlertController {

    /* renamed from: A */
    NestedScrollView f149A;

    /* renamed from: C */
    private Drawable f151C;

    /* renamed from: D */
    private ImageView f152D;

    /* renamed from: E */
    private TextView f153E;

    /* renamed from: F */
    private TextView f154F;

    /* renamed from: G */
    private View f155G;

    /* renamed from: H */
    ListAdapter f156H;

    /* renamed from: J */
    private int f158J;

    /* renamed from: K */
    private int f159K;

    /* renamed from: L */
    int f160L;

    /* renamed from: M */
    int f161M;

    /* renamed from: N */
    int f162N;

    /* renamed from: O */
    int f163O;

    /* renamed from: P */
    private boolean f164P;

    /* renamed from: R */
    Handler f166R;

    /* renamed from: a */
    private final Context f168a;

    /* renamed from: b */
    final DialogC0071h f169b;

    /* renamed from: c */
    private final Window f170c;

    /* renamed from: d */
    private final int f171d;

    /* renamed from: e */
    private CharSequence f172e;

    /* renamed from: f */
    private CharSequence f173f;

    /* renamed from: g */
    ListView f174g;

    /* renamed from: h */
    private View f175h;

    /* renamed from: i */
    private int f176i;

    /* renamed from: j */
    private int f177j;

    /* renamed from: k */
    private int f178k;

    /* renamed from: l */
    private int f179l;

    /* renamed from: m */
    private int f180m;

    /* renamed from: o */
    Button f182o;

    /* renamed from: p */
    private CharSequence f183p;

    /* renamed from: q */
    Message f184q;

    /* renamed from: r */
    private Drawable f185r;

    /* renamed from: s */
    Button f186s;

    /* renamed from: t */
    private CharSequence f187t;

    /* renamed from: u */
    Message f188u;

    /* renamed from: v */
    private Drawable f189v;

    /* renamed from: w */
    Button f190w;

    /* renamed from: x */
    private CharSequence f191x;

    /* renamed from: y */
    Message f192y;

    /* renamed from: z */
    private Drawable f193z;

    /* renamed from: n */
    private boolean f181n = false;

    /* renamed from: B */
    private int f150B = 0;

    /* renamed from: I */
    int f157I = -1;

    /* renamed from: Q */
    private int f165Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f167S = new ViewOnClickListenerC0056a();

    public static class RecycleListView extends ListView {

        /* renamed from: f */
        private final int f194f;

        /* renamed from: g */
        private final int f195g;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0832j.f5356f2);
            this.f195g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0832j.f5361g2, -1);
            this.f194f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C0832j.f5366h2, -1);
        }

        /* renamed from: a */
        public void m210a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f194f, getPaddingRight(), z2 ? getPaddingBottom() : this.f195g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class ViewOnClickListenerC0056a implements View.OnClickListener {
        ViewOnClickListenerC0056a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f182o || (message3 = alertController.f184q) == null) ? (view != alertController.f186s || (message2 = alertController.f188u) == null) ? (view != alertController.f190w || (message = alertController.f192y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f166R.obtainMessage(1, alertController2.f169b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0057b implements NestedScrollView.InterfaceC0319b {

        /* renamed from: a */
        final /* synthetic */ View f197a;

        /* renamed from: b */
        final /* synthetic */ View f198b;

        C0057b(View view, View view2) {
            this.f197a = view;
            this.f198b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC0319b
        /* renamed from: a */
        public void mo211a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
            AlertController.m186g(nestedScrollView, this.f197a, this.f198b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class RunnableC0058c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f200f;

        /* renamed from: g */
        final /* synthetic */ View f201g;

        RunnableC0058c(View view, View view2) {
            this.f200f = view;
            this.f201g = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m186g(AlertController.this.f149A, this.f200f, this.f201g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0059d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f203a;

        /* renamed from: b */
        final /* synthetic */ View f204b;

        C0059d(View view, View view2) {
            this.f203a = view;
            this.f204b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
            AlertController.m186g(absListView, this.f203a, this.f204b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class RunnableC0060e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f206f;

        /* renamed from: g */
        final /* synthetic */ View f207g;

        RunnableC0060e(View view, View view2) {
            this.f206f = view;
            this.f207g = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m186g(AlertController.this.f174g, this.f206f, this.f207g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0061f {

        /* renamed from: A */
        public int f209A;

        /* renamed from: B */
        public int f210B;

        /* renamed from: C */
        public int f211C;

        /* renamed from: D */
        public int f212D;

        /* renamed from: F */
        public boolean[] f214F;

        /* renamed from: G */
        public boolean f215G;

        /* renamed from: H */
        public boolean f216H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f218J;

        /* renamed from: K */
        public Cursor f219K;

        /* renamed from: L */
        public String f220L;

        /* renamed from: M */
        public String f221M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f222N;

        /* renamed from: O */
        public e f223O;

        /* renamed from: a */
        public final Context f225a;

        /* renamed from: b */
        public final LayoutInflater f226b;

        /* renamed from: d */
        public Drawable f228d;

        /* renamed from: f */
        public CharSequence f230f;

        /* renamed from: g */
        public View f231g;

        /* renamed from: h */
        public CharSequence f232h;

        /* renamed from: i */
        public CharSequence f233i;

        /* renamed from: j */
        public Drawable f234j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f235k;

        /* renamed from: l */
        public CharSequence f236l;

        /* renamed from: m */
        public Drawable f237m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f238n;

        /* renamed from: o */
        public CharSequence f239o;

        /* renamed from: p */
        public Drawable f240p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f241q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f243s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f244t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f245u;

        /* renamed from: v */
        public CharSequence[] f246v;

        /* renamed from: w */
        public ListAdapter f247w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f248x;

        /* renamed from: y */
        public int f249y;

        /* renamed from: z */
        public View f250z;

        /* renamed from: c */
        public int f227c = 0;

        /* renamed from: e */
        public int f229e = 0;

        /* renamed from: E */
        public boolean f213E = false;

        /* renamed from: I */
        public int f217I = -1;

        /* renamed from: P */
        public boolean f224P = true;

        /* renamed from: r */
        public boolean f242r = true;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class a extends ArrayAdapter<CharSequence> {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f251f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i2, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i2, i3, charSequenceArr);
                this.f251f = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i2, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i2, view, viewGroup);
                boolean[] zArr = C0061f.this.f214F;
                if (zArr != null && zArr[i2]) {
                    this.f251f.setItemChecked(i2, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class b extends CursorAdapter {

            /* renamed from: f */
            private final int f253f;

            /* renamed from: g */
            private final int f254g;

            /* renamed from: h */
            final /* synthetic */ RecycleListView f255h;

            /* renamed from: i */
            final /* synthetic */ AlertController f256i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f255h = recycleListView;
                this.f256i = alertController;
                Cursor cursor2 = getCursor();
                this.f253f = cursor2.getColumnIndexOrThrow(C0061f.this.f220L);
                this.f254g = cursor2.getColumnIndexOrThrow(C0061f.this.f221M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f253f));
                this.f255h.setItemChecked(cursor.getPosition(), cursor.getInt(this.f254g) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0061f.this.f226b.inflate(this.f256i.f161M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class c implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ AlertController f258f;

            c(AlertController alertController) {
                this.f258f = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                C0061f.this.f248x.onClick(this.f258f.f169b, i2);
                if (C0061f.this.f216H) {
                    return;
                }
                this.f258f.f169b.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class d implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f260f;

            /* renamed from: g */
            final /* synthetic */ AlertController f261g;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f260f = recycleListView;
                this.f261g = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                boolean[] zArr = C0061f.this.f214F;
                if (zArr != null) {
                    zArr[i2] = this.f260f.isItemChecked(i2);
                }
                C0061f.this.f218J.onClick(this.f261g.f169b, i2, this.f260f.isItemChecked(i2));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface e {
            /* renamed from: a */
            void m214a(ListView listView);
        }

        public C0061f(Context context) {
            this.f225a = context;
            this.f226b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m212b(AlertController alertController) {
            ListAdapter c0063h;
            RecycleListView recycleListView = (RecycleListView) this.f226b.inflate(alertController.f160L, (ViewGroup) null);
            if (this.f215G) {
                c0063h = this.f219K == null ? new a(this.f225a, alertController.f161M, R.id.text1, this.f246v, recycleListView) : new b(this.f225a, this.f219K, false, recycleListView, alertController);
            } else {
                int i2 = this.f216H ? alertController.f162N : alertController.f163O;
                if (this.f219K != null) {
                    c0063h = new SimpleCursorAdapter(this.f225a, i2, this.f219K, new String[]{this.f220L}, new int[]{R.id.text1});
                } else {
                    c0063h = this.f247w;
                    if (c0063h == null) {
                        c0063h = new C0063h(this.f225a, i2, R.id.text1, this.f246v);
                    }
                }
            }
            e eVar = this.f223O;
            if (eVar != null) {
                eVar.m214a(recycleListView);
            }
            alertController.f156H = c0063h;
            alertController.f157I = this.f217I;
            if (this.f248x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f218J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f222N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f216H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f215G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f174g = recycleListView;
        }

        /* renamed from: a */
        public void m213a(AlertController alertController) {
            View view = this.f231g;
            if (view != null) {
                alertController.m202m(view);
            } else {
                CharSequence charSequence = this.f230f;
                if (charSequence != null) {
                    alertController.m206r(charSequence);
                }
                Drawable drawable = this.f228d;
                if (drawable != null) {
                    alertController.m204o(drawable);
                }
                int i2 = this.f227c;
                if (i2 != 0) {
                    alertController.m203n(i2);
                }
                int i3 = this.f229e;
                if (i3 != 0) {
                    alertController.m203n(alertController.m196d(i3));
                }
            }
            CharSequence charSequence2 = this.f232h;
            if (charSequence2 != null) {
                alertController.m205p(charSequence2);
            }
            CharSequence charSequence3 = this.f233i;
            if (charSequence3 != null || this.f234j != null) {
                alertController.m201l(-1, charSequence3, this.f235k, null, this.f234j);
            }
            CharSequence charSequence4 = this.f236l;
            if (charSequence4 != null || this.f237m != null) {
                alertController.m201l(-2, charSequence4, this.f238n, null, this.f237m);
            }
            CharSequence charSequence5 = this.f239o;
            if (charSequence5 != null || this.f240p != null) {
                alertController.m201l(-3, charSequence5, this.f241q, null, this.f240p);
            }
            if (this.f246v != null || this.f219K != null || this.f247w != null) {
                m212b(alertController);
            }
            View view2 = this.f250z;
            if (view2 != null) {
                if (this.f213E) {
                    alertController.m209u(view2, this.f209A, this.f210B, this.f211C, this.f212D);
                    return;
                } else {
                    alertController.m208t(view2);
                    return;
                }
            }
            int i4 = this.f249y;
            if (i4 != 0) {
                alertController.m207s(i4);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class HandlerC0062g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f263a;

        public HandlerC0062g(DialogInterface dialogInterface) {
            this.f263a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f263a.get(), message.what);
            } else {
                if (i2 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0063h extends ArrayAdapter<CharSequence> {
        public C0063h(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0071h dialogC0071h, Window window) {
        this.f168a = context;
        this.f169b = dialogC0071h;
        this.f170c = window;
        this.f166R = new HandlerC0062g(dialogC0071h);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C0832j.f5224F, C0823a.f5040n, 0);
        this.f158J = typedArrayObtainStyledAttributes.getResourceId(C0832j.f5229G, 0);
        this.f159K = typedArrayObtainStyledAttributes.getResourceId(C0832j.f5239I, 0);
        this.f160L = typedArrayObtainStyledAttributes.getResourceId(C0832j.f5249K, 0);
        this.f161M = typedArrayObtainStyledAttributes.getResourceId(C0832j.f5254L, 0);
        this.f162N = typedArrayObtainStyledAttributes.getResourceId(C0832j.f5264N, 0);
        this.f163O = typedArrayObtainStyledAttributes.getResourceId(C0832j.f5244J, 0);
        this.f164P = typedArrayObtainStyledAttributes.getBoolean(C0832j.f5259M, true);
        this.f171d = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0832j.f5234H, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogC0071h.m390d(1);
    }

    /* renamed from: A */
    private static boolean m183A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0823a.f5039m, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    static boolean m184a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m184a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m185b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: g */
    static void m186g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: j */
    private ViewGroup m187j(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: k */
    private int m188k() {
        int i2 = this.f159K;
        return i2 == 0 ? this.f158J : this.f165Q == 1 ? i2 : this.f158J;
    }

    /* renamed from: q */
    private void m189q(ViewGroup viewGroup, View view, int i2, int i3) {
        View viewFindViewById = this.f170c.findViewById(C0828f.f5157v);
        View viewFindViewById2 = this.f170c.findViewById(C0828f.f5156u);
        if (Build.VERSION.SDK_INT >= 23) {
            C0311u.m2163y0(view, i2, i3);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                viewGroup.removeView(viewFindViewById2);
                return;
            }
            return;
        }
        if (viewFindViewById != null && (i2 & 1) == 0) {
            viewGroup.removeView(viewFindViewById);
            viewFindViewById = null;
        }
        if (viewFindViewById2 != null && (i2 & 2) == 0) {
            viewGroup.removeView(viewFindViewById2);
            viewFindViewById2 = null;
        }
        if (viewFindViewById == null && viewFindViewById2 == null) {
            return;
        }
        if (this.f173f != null) {
            this.f149A.setOnScrollChangeListener(new C0057b(viewFindViewById, viewFindViewById2));
            this.f149A.post(new RunnableC0058c(viewFindViewById, viewFindViewById2));
            return;
        }
        ListView listView = this.f174g;
        if (listView != null) {
            listView.setOnScrollListener(new C0059d(viewFindViewById, viewFindViewById2));
            this.f174g.post(new RunnableC0060e(viewFindViewById, viewFindViewById2));
            return;
        }
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    /* renamed from: v */
    private void m190v(ViewGroup viewGroup) {
        int i2;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f182o = button;
        button.setOnClickListener(this.f167S);
        if (TextUtils.isEmpty(this.f183p) && this.f185r == null) {
            this.f182o.setVisibility(8);
            i2 = 0;
        } else {
            this.f182o.setText(this.f183p);
            Drawable drawable = this.f185r;
            if (drawable != null) {
                int i3 = this.f171d;
                drawable.setBounds(0, 0, i3, i3);
                this.f182o.setCompoundDrawables(this.f185r, null, null, null);
            }
            this.f182o.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f186s = button2;
        button2.setOnClickListener(this.f167S);
        if (TextUtils.isEmpty(this.f187t) && this.f189v == null) {
            this.f186s.setVisibility(8);
        } else {
            this.f186s.setText(this.f187t);
            Drawable drawable2 = this.f189v;
            if (drawable2 != null) {
                int i4 = this.f171d;
                drawable2.setBounds(0, 0, i4, i4);
                this.f186s.setCompoundDrawables(this.f189v, null, null, null);
            }
            this.f186s.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f190w = button3;
        button3.setOnClickListener(this.f167S);
        if (TextUtils.isEmpty(this.f191x) && this.f193z == null) {
            this.f190w.setVisibility(8);
        } else {
            this.f190w.setText(this.f191x);
            Drawable drawable3 = this.f193z;
            if (drawable3 != null) {
                int i5 = this.f171d;
                drawable3.setBounds(0, 0, i5, i5);
                this.f190w.setCompoundDrawables(this.f193z, null, null, null);
            }
            this.f190w.setVisibility(0);
            i2 |= 4;
        }
        if (m183A(this.f168a)) {
            if (i2 == 1) {
                m185b(this.f182o);
            } else if (i2 == 2) {
                m185b(this.f186s);
            } else if (i2 == 4) {
                m185b(this.f190w);
            }
        }
        if (i2 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    private void m191w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f170c.findViewById(C0828f.f5158w);
        this.f149A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f149A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f154F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f173f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f149A.removeView(this.f154F);
        if (this.f174g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f149A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f149A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f174g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: x */
    private void m192x(ViewGroup viewGroup) {
        View viewInflate = this.f175h;
        if (viewInflate == null) {
            viewInflate = this.f176i != 0 ? LayoutInflater.from(this.f168a).inflate(this.f176i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !m184a(viewInflate)) {
            this.f170c.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f170c.findViewById(C0828f.f5149n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f181n) {
            frameLayout.setPadding(this.f177j, this.f178k, this.f179l, this.f180m);
        }
        if (this.f174g != null) {
            ((C0157c0.a) viewGroup.getLayoutParams()).f1062a = 0.0f;
        }
    }

    /* renamed from: y */
    private void m193y(ViewGroup viewGroup) {
        if (this.f155G != null) {
            viewGroup.addView(this.f155G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f170c.findViewById(C0828f.f5134O).setVisibility(8);
            return;
        }
        this.f152D = (ImageView) this.f170c.findViewById(R.id.icon);
        if (!(!TextUtils.isEmpty(this.f172e)) || !this.f164P) {
            this.f170c.findViewById(C0828f.f5134O).setVisibility(8);
            this.f152D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f170c.findViewById(C0828f.f5145j);
        this.f153E = textView;
        textView.setText(this.f172e);
        int i2 = this.f150B;
        if (i2 != 0) {
            this.f152D.setImageResource(i2);
            return;
        }
        Drawable drawable = this.f151C;
        if (drawable != null) {
            this.f152D.setImageDrawable(drawable);
        } else {
            this.f153E.setPadding(this.f152D.getPaddingLeft(), this.f152D.getPaddingTop(), this.f152D.getPaddingRight(), this.f152D.getPaddingBottom());
            this.f152D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    private void m194z() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f170c.findViewById(C0828f.f5155t);
        int i2 = C0828f.f5135P;
        View viewFindViewById4 = viewFindViewById3.findViewById(i2);
        int i3 = C0828f.f5148m;
        View viewFindViewById5 = viewFindViewById3.findViewById(i3);
        int i4 = C0828f.f5146k;
        View viewFindViewById6 = viewFindViewById3.findViewById(i4);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(C0828f.f5150o);
        m192x(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i2);
        View viewFindViewById8 = viewGroup.findViewById(i3);
        View viewFindViewById9 = viewGroup.findViewById(i4);
        ViewGroup viewGroupM187j = m187j(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM187j2 = m187j(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupM187j3 = m187j(viewFindViewById9, viewFindViewById6);
        m191w(viewGroupM187j2);
        m190v(viewGroupM187j3);
        m193y(viewGroupM187j);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (viewGroupM187j == null || viewGroupM187j.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (viewGroupM187j3 == null || viewGroupM187j3.getVisibility() == 8) ? false : true;
        if (!z3 && viewGroupM187j2 != null && (viewFindViewById2 = viewGroupM187j2.findViewById(C0828f.f5130K)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z2 != 0) {
            NestedScrollView nestedScrollView = this.f149A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f173f == null && this.f174g == null) ? null : viewGroupM187j.findViewById(C0828f.f5133N);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupM187j2 != null && (viewFindViewById = viewGroupM187j2.findViewById(C0828f.f5131L)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f174g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m210a(z2, z3);
        }
        if (!z) {
            View view = this.f174g;
            if (view == null) {
                view = this.f149A;
            }
            if (view != null) {
                m189q(viewGroupM187j2, view, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f174g;
        if (listView2 == null || (listAdapter = this.f156H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i5 = this.f157I;
        if (i5 > -1) {
            listView2.setItemChecked(i5, true);
            listView2.setSelection(i5);
        }
    }

    /* renamed from: c */
    public Button m195c(int i2) {
        if (i2 == -3) {
            return this.f190w;
        }
        if (i2 == -2) {
            return this.f186s;
        }
        if (i2 != -1) {
            return null;
        }
        return this.f182o;
    }

    /* renamed from: d */
    public int m196d(int i2) {
        TypedValue typedValue = new TypedValue();
        this.f168a.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView m197e() {
        return this.f174g;
    }

    /* renamed from: f */
    public void m198f() {
        this.f169b.setContentView(m188k());
        m194z();
    }

    /* renamed from: h */
    public boolean m199h(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f149A;
        return nestedScrollView != null && nestedScrollView.m2265q(keyEvent);
    }

    /* renamed from: i */
    public boolean m200i(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f149A;
        return nestedScrollView != null && nestedScrollView.m2265q(keyEvent);
    }

    /* renamed from: l */
    public void m201l(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f166R.obtainMessage(i2, onClickListener);
        }
        if (i2 == -3) {
            this.f191x = charSequence;
            this.f192y = message;
            this.f193z = drawable;
        } else if (i2 == -2) {
            this.f187t = charSequence;
            this.f188u = message;
            this.f189v = drawable;
        } else {
            if (i2 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f183p = charSequence;
            this.f184q = message;
            this.f185r = drawable;
        }
    }

    /* renamed from: m */
    public void m202m(View view) {
        this.f155G = view;
    }

    /* renamed from: n */
    public void m203n(int i2) {
        this.f151C = null;
        this.f150B = i2;
        ImageView imageView = this.f152D;
        if (imageView != null) {
            if (i2 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f152D.setImageResource(this.f150B);
            }
        }
    }

    /* renamed from: o */
    public void m204o(Drawable drawable) {
        this.f151C = drawable;
        this.f150B = 0;
        ImageView imageView = this.f152D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f152D.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: p */
    public void m205p(CharSequence charSequence) {
        this.f173f = charSequence;
        TextView textView = this.f154F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void m206r(CharSequence charSequence) {
        this.f172e = charSequence;
        TextView textView = this.f153E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: s */
    public void m207s(int i2) {
        this.f175h = null;
        this.f176i = i2;
        this.f181n = false;
    }

    /* renamed from: t */
    public void m208t(View view) {
        this.f175h = view;
        this.f176i = 0;
        this.f181n = false;
    }

    /* renamed from: u */
    public void m209u(View view, int i2, int i3, int i4, int i5) {
        this.f175h = view;
        this.f176i = 0;
        this.f181n = true;
        this.f177j = i2;
        this.f178k = i3;
        this.f179l = i4;
        this.f180m = i5;
    }
}
